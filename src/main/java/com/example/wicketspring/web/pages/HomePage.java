package com.example.wicketspring.web.pages;

import com.example.wicketspring.Wallclock;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.spring.injection.annot.SpringBean;
import org.springframework.beans.factory.annotation.Autowired;

public class HomePage extends WebPage {

    /**
     * To inject a Spring bean, you must use @{@link SpringBean} or @{@link javax.inject.Inject} (not @{@link Autowired}, as this is not supported by wicket-spring).
     */
    @SpringBean
    Wallclock wallclock;

    public HomePage() {
        add(new Label("clock", wallclock.getTime()));
    }

}
