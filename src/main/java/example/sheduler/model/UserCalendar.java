package example.sheduler.model;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.sql.Time;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

@Component
@SessionScope
public class UserCalendarImpl {
    final Calendar calendar;

    public UserCalendarImpl(TimeZone tz, Locale loc) {
        tz = TimeZone.getDefault();
        loc = Locale.getDefault();
        this.calendar = Calendar.getInstance(tz, loc);
    }

    public UserCalendarImpl() {
        this.calendar = Calendar.getInstance();
    }

}
