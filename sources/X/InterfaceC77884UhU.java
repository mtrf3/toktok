package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

@InterfaceC31169CLd
/* renamed from: X.UhU, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC77884UhU extends XBaseParamModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "alarmOffset", required = false)
    Number getAlarmOffset();

    @InterfaceC36563EWp(isGetter = true, keyPath = "allDay", required = false)
    Boolean getAllDay();

    @InterfaceC36563EWp(isGetter = true, keyPath = "calendarName", required = false)
    String getCalendarName();

    @InterfaceC36563EWp(isGetter = true, keyPath = "endDate", required = true)
    Number getEndDate();

    @InterfaceC36563EWp(isGetter = true, keyPath = "identifier", required = true)
    String getIdentifier();

    @InterfaceC36563EWp(isGetter = true, keyPath = "_jsb_secure_dataflow_id", required = false)
    String getJsbSecureDataflowId();

    @InterfaceC36563EWp(isGetter = true, keyPath = "location", required = false)
    String getLocation();

    @InterfaceC36563EWp(isGetter = true, keyPath = "notes", required = false)
    String getNotes();

    @InterfaceC36563EWp(isGetter = true, keyPath = "repeatCount", required = true)
    Number getRepeatCount();

    @ED7(option = {"DAILY", "MONTHLY", "WEEKLY", "YEARLY", "daily", "monthly", "weekly", "yearly"})
    @InterfaceC36563EWp(isEnum = true, isGetter = true, keyPath = "repeatFrequency", required = true)
    String getRepeatFrequency();

    @InterfaceC36563EWp(isGetter = true, keyPath = "repeatInterval", required = true)
    Number getRepeatInterval();

    @InterfaceC36563EWp(isGetter = true, keyPath = "startDate", required = true)
    Number getStartDate();

    @InterfaceC36563EWp(isGetter = true, keyPath = "title", required = false)
    String getTitle();

    @InterfaceC36563EWp(isGetter = true, keyPath = "url", required = false)
    String getUrl();
}
