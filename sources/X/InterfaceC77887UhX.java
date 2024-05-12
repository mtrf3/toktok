package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

@InterfaceC31169CLd
/* renamed from: X.UhX, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC77887UhX extends XBaseParamModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "alarmOffset", required = false)
    Number getAlarmOffset();

    @InterfaceC36563EWp(isGetter = true, keyPath = "allDay", required = false)
    Boolean getAllDay();

    @InterfaceC36563EWp(isGetter = true, keyPath = "endDate", required = true)
    Number getEndDate();

    @InterfaceC36563EWp(isGetter = true, keyPath = "eventID", required = true)
    String getEventID();

    @InterfaceC36563EWp(isGetter = true, keyPath = "location", required = false)
    String getLocation();

    @InterfaceC36563EWp(isGetter = true, keyPath = "notes", required = false)
    String getNotes();

    @InterfaceC36563EWp(isGetter = true, keyPath = "startDate", required = true)
    Number getStartDate();

    @InterfaceC36563EWp(isGetter = true, keyPath = "title", required = false)
    String getTitle();

    @InterfaceC36563EWp(isGetter = true, keyPath = "url", required = false)
    String getUrl();
}
