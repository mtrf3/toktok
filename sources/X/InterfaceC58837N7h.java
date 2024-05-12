package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

@InterfaceC31169CLd
/* renamed from: X.N7h, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC58837N7h extends XBaseParamModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "cid", required = true)
    String getCid();

    @InterfaceC36563EWp(isGetter = true, keyPath = "landingAccessStyle", required = false)
    Number getLandingAccessStyle();

    @InterfaceC36563EWp(isGetter = true, keyPath = "landingExitStyle", required = false)
    Number getLandingExitStyle();

    @InterfaceC36563EWp(isGetter = true, keyPath = "landingStyle", required = false)
    Number getLandingStyle();

    @InterfaceC36563EWp(isGetter = true, keyPath = "refer", required = false)
    String getRefer();

    @InterfaceC36563EWp(isGetter = true, keyPath = "title", required = false)
    String getTitle();

    @InterfaceC36563EWp(isGetter = true, keyPath = "url", required = true)
    String getUrl();
}
