package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* renamed from: X.UgG, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC77808UgG extends XBaseModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "alarmMinutes", required = true)
    Number getAlarmMinutes();

    @InterfaceC36563EWp(isGetter = true, keyPath = "anchor", nestedClassType = InterfaceC77796Ug4.class, required = true)
    InterfaceC77796Ug4 getAnchor();

    @InterfaceC36563EWp(isGetter = true, keyPath = "endTime", required = true)
    Number getEndTime();

    @InterfaceC36563EWp(isGetter = true, keyPath = "eventId", required = true)
    String getEventId();

    @InterfaceC36563EWp(isGetter = true, keyPath = "note", required = true)
    String getNote();

    @InterfaceC36563EWp(isGetter = true, keyPath = "startTime", required = true)
    Number getStartTime();

    @InterfaceC36563EWp(isGetter = true, keyPath = "title", required = true)
    String getTitle();
}
