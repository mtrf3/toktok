package com.ss.android.ugc.aweme.liveevent;

import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class CalendarEvent {

    @InterfaceC65349Pkn("alarmMinutes")
    public Integer alarmMinutes;

    @InterfaceC65349Pkn("anchor")
    public Anchor anchor;

    @InterfaceC65349Pkn("endTime")
    public long endTime;

    @InterfaceC65349Pkn("enter_from")
    public String enterFrom;

    @InterfaceC65349Pkn("eventId")
    public String eventId;

    @InterfaceC65349Pkn("note")
    public String note;

    @InterfaceC65349Pkn("startTime")
    public long startTime;

    @InterfaceC65349Pkn("title")
    public String title;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarEvent)) {
            return false;
        }
        CalendarEvent calendarEvent = (CalendarEvent) obj;
        return o.LJ(this.eventId, calendarEvent.eventId) && o.LJ(this.title, calendarEvent.title) && o.LJ(this.note, calendarEvent.note) && this.startTime == calendarEvent.startTime && this.endTime == calendarEvent.endTime && o.LJ(this.alarmMinutes, calendarEvent.alarmMinutes) && o.LJ(this.enterFrom, calendarEvent.enterFrom) && o.LJ(this.anchor, calendarEvent.anchor);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CalendarEvent(eventId=");
        LIZ.append(this.eventId);
        LIZ.append(", title=");
        LIZ.append(this.title);
        LIZ.append(", note=");
        LIZ.append(this.note);
        LIZ.append(", startTime=");
        LIZ.append(this.startTime);
        LIZ.append(", endTime=");
        LIZ.append(this.endTime);
        LIZ.append(", alarmMinutes=");
        LIZ.append(this.alarmMinutes);
        LIZ.append(", enterFrom=");
        LIZ.append(this.enterFrom);
        LIZ.append(", anchor=");
        LIZ.append(this.anchor);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        String str = this.eventId;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.title;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.note;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int LIZJ = JBR.LIZJ(this.endTime, JBR.LIZJ(this.startTime, (i3 + hashCode3) * 31, 31), 31);
        Integer num = this.alarmMinutes;
        if (num == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = num.hashCode();
        }
        int i4 = (LIZJ + hashCode4) * 31;
        String str4 = this.enterFrom;
        if (str4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str4.hashCode();
        }
        int i5 = (i4 + hashCode5) * 31;
        Anchor anchor = this.anchor;
        if (anchor != null) {
            i = anchor.hashCode();
        }
        return i5 + i;
    }

    public CalendarEvent(String str, String str2, String str3, long j, long j2, Integer num, String str4, Anchor anchor) {
        this.eventId = str;
        this.title = str2;
        this.note = str3;
        this.startTime = j;
        this.endTime = j2;
        this.alarmMinutes = num;
        this.enterFrom = str4;
        this.anchor = anchor;
    }
}
