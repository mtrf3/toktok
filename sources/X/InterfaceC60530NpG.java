package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

@InterfaceC31182CLq
/* renamed from: X.NpG, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC60530NpG extends XBaseResultModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "phoneCode", required = true)
    String getPhoneCode();

    @InterfaceC36563EWp(isGetter = true, keyPath = "shortCountryName", required = true)
    String getShortCountryName();

    @InterfaceC36563EWp(isGetter = false, keyPath = "phoneCode", required = true)
    void setPhoneCode(String str);

    @InterfaceC36563EWp(isGetter = false, keyPath = "shortCountryName", required = true)
    void setShortCountryName(String str);
}
