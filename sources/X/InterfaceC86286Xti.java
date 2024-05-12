package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;

@InterfaceC31169CLd
/* renamed from: X.Xti, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC86286Xti extends XBaseParamModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "commonInteraction", nestedClassType = OCO.class, required = false)
    OCO getCommonInteraction();

    @InterfaceC36563EWp(isGetter = true, keyPath = "pageInteraction", nestedClassType = OCN.class, required = false)
    OCN getPageInteraction();

    @InterfaceC36563EWp(isGetter = true, keyPath = "pageUI", nestedClassType = InterfaceC86287Xtj.class, required = false)
    InterfaceC86287Xtj getPageUI();

    @InterfaceC36563EWp(isGetter = true, keyPath = "popupInteraction", nestedClassType = InterfaceC86288Xtk.class, required = false)
    InterfaceC86288Xtk getPopupInteraction();
}
