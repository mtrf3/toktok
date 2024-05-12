package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

@InterfaceC31169CLd
/* renamed from: X.UbQ, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC77508UbQ extends XBaseParamModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "customError", required = true)
    java.util.Map<String, Object> getCustomError();

    @InterfaceC36563EWp(isGetter = true, keyPath = "errorCode", required = true)
    Number getErrorCode();

    @InterfaceC36563EWp(isGetter = true, keyPath = "success", required = true)
    boolean getSuccess();

    @InterfaceC36563EWp(isGetter = true, keyPath = "trackParams", required = true)
    java.util.Map<String, Object> getTrackParams();
}
