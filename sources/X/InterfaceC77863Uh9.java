package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

@InterfaceC31169CLd
/* renamed from: X.Uh9, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC77863Uh9 extends XBaseParamModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "closeTime", required = true)
    Number getCloseTime();

    @InterfaceC36563EWp(isGetter = true, keyPath = "contentInfo", required = false)
    String getContentInfo();

    @InterfaceC36563EWp(isGetter = true, keyPath = "height", required = true)
    Number getHeight();

    @InterfaceC36563EWp(isGetter = true, keyPath = "name", required = true)
    String getName();

    @InterfaceC36563EWp(isGetter = true, keyPath = "roomId", required = true)
    String getRoomId();

    @InterfaceC36563EWp(isGetter = true, keyPath = "schema", required = true)
    String getSchema();
}
