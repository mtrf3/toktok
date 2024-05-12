package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

@InterfaceC31169CLd
/* renamed from: X.FRe, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public interface InterfaceC38970FRe extends XBaseParamModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "appPackageName", required = true)
    String getAppPackageName();

    @InterfaceC36563EWp(isGetter = true, keyPath = "deeplink", required = true)
    String getDeeplink();

    @InterfaceC36563EWp(isGetter = true, keyPath = "schema", required = true)
    String getSchema();

    @InterfaceC36563EWp(isGetter = true, keyPath = "universalLink", required = true)
    String getUniversalLink();
}
