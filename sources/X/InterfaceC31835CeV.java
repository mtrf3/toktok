package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.List;

@InterfaceC31169CLd
/* renamed from: X.CeV, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC31835CeV extends XBaseParamModel {
    @InterfaceC36563EWp(isGetter = true, keyPath = "merchantID", required = true)
    String getMerchantID();

    @InterfaceC36563EWp(isGetter = true, keyPath = "productIDs", primitiveClassType = String.class, required = true)
    List<String> getProductIDs();

    @ED7(option = {"inapp", "subs"})
    @InterfaceC36563EWp(isEnum = true, isGetter = true, keyPath = "productType", required = true)
    String getProductType();
}
