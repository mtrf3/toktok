package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

@InterfaceC31182CLq
/* renamed from: X.CLt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC31185CLt extends XBaseResultModel {
    @ED6(option = {-1, 0, 1, 2, 3})
    @InterfaceC36563EWp(isEnum = true, isGetter = true, keyPath = "notificationStatus", required = false)
    Number getNotificationStatus();

    @ED6(option = {-1, 0, 1, 2, 3})
    @InterfaceC36563EWp(isEnum = true, isGetter = false, keyPath = "notificationStatus", required = false)
    void setNotificationStatus(Number number);
}
