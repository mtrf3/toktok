package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

@InterfaceC31169CLd
/* renamed from: X.MDg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public interface InterfaceC56444MDg extends XBaseParamModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "mallCartCard", required = false)
    String getMallCartCard();

    @ED7(option = {"light", "dark", "adaptive"})
    @InterfaceC36563EWp(isEnum = true, isGetter = true, keyPath = "topBarContentStyle", required = false)
    String getTopBarContentStyle();
}
