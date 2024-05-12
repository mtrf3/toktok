package X;

import com.bytedance.android.live.iap.service.IapService;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.google.gson.Gson;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.CeT, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31833CeT extends AbstractC31834CeU {
    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        InterfaceC31835CeV interfaceC31835CeV = (InterfaceC31835CeV) xBaseParamModel;
        o.LJIIIZ(type, "type");
        C0NB.LIZIZ("iap_test_jsb", "GetIapProductsV2Method");
        InterfaceC38263Ezz interfaceC38263Ezz = this.LJLIL;
        if (interfaceC38263Ezz != null) {
            interfaceC38263Ezz.getContext();
        }
        C20010qT c20010qT = new C20010qT((String) null, (List) null, 7);
        String merchantID = interfaceC31835CeV.getMerchantID();
        o.LJIIIZ(merchantID, "<set-?>");
        c20010qT.LIZ = merchantID;
        List<String> productIDs = interfaceC31835CeV.getProductIDs();
        o.LJIIIZ(productIDs, "<set-?>");
        c20010qT.LIZJ = productIDs;
        String productType = interfaceC31835CeV.getProductType();
        o.LJIIIZ(productType, "<set-?>");
        c20010qT.LIZIZ = productType;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("params: ");
        LIZ.append(GsonProtectorUtils.toJson(new Gson(), c20010qT));
        C0NB.LIZIZ("iap_test_jsb", X1D.LIZIZ(LIZ));
        IapService iapService = (IapService) CN1.LIZ(IapService.class);
        if (iapService != null) {
            iapService.xi0(c20010qT, new C31832CeS(this, c37356ElM));
        }
    }
}
