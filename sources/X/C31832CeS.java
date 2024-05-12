package X;

import com.bytedance.android.live.iap.model.response.iap.IapProductDetail;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.google.gson.Gson;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.CeS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31832CeS implements InterfaceC18450nx {
    public final /* synthetic */ C31833CeT LIZ;
    public final /* synthetic */ CompletionBlock<InterfaceC31836CeW> LIZIZ;

    @Override // X.InterfaceC18450nx
    public final void LIZ(C1Z5 c1z5) {
        LinkedHashMap linkedHashMap;
        C0NB.LIZIZ("iap_test_jsb", "onFetchSuccess");
        this.LIZ.getClass();
        XBaseModel LIZJ = ED5.LIZJ(InterfaceC31836CeW.class, null);
        C31833CeT c31833CeT = this.LIZ;
        InterfaceC31836CeW interfaceC31836CeW = (InterfaceC31836CeW) LIZJ;
        java.util.Map<String, IapProductDetail> map = c1z5.LIZLLL;
        if (map != null) {
            linkedHashMap = new LinkedHashMap(C51029K0z.LJJIIZ(map.size()));
            for (Map.Entry<String, IapProductDetail> entry : map.entrySet()) {
                String key = entry.getKey();
                IapProductDetail value = entry.getValue();
                value.getClass();
                String json = GsonProtectorUtils.toJson(new Gson(), value);
                json.toString();
                linkedHashMap.put(key, json);
            }
        } else {
            linkedHashMap = null;
        }
        interfaceC31836CeW.setProducts(linkedHashMap);
        c31833CeT.getClass();
        InterfaceC31838CeY interfaceC31838CeY = (InterfaceC31838CeY) ED5.LIZJ(InterfaceC31838CeY.class, null);
        interfaceC31838CeY.setAppVersion(String.valueOf(((IHostAppContext) CN1.LIZ(IHostAppContext.class)).getShortVersionCode()));
        interfaceC31838CeY.setClientVersion("buyIapProductV2");
        interfaceC31836CeW.setInAppClientData(interfaceC31838CeY);
        C0NB.LIZIZ("iap_test_jsb", "callback onSuccess data");
        C0NB.LIZIZ("iap_test_jsb", GsonProtectorUtils.toJson(new Gson(), interfaceC31836CeW.getProducts()));
        this.LIZIZ.onSuccess(interfaceC31836CeW, "");
    }

    @Override // X.InterfaceC18450nx
    public final void LIZIZ(C21240sS c21240sS) {
        C0NB.LIZIZ("iap_test_jsb", "onFetchFailure");
        this.LIZ.getClass();
        InterfaceC31836CeW interfaceC31836CeW = (InterfaceC31836CeW) ED5.LIZJ(InterfaceC31836CeW.class, null);
        this.LIZ.getClass();
        InterfaceC31837CeX interfaceC31837CeX = (InterfaceC31837CeX) ED5.LIZJ(InterfaceC31837CeX.class, null);
        interfaceC31837CeX.setErrorCode(Integer.valueOf(c21240sS.LIZ));
        interfaceC31837CeX.setErrorDetailCode(Integer.valueOf(c21240sS.LIZIZ));
        interfaceC31837CeX.setErrorMsg(c21240sS.LIZJ);
        interfaceC31836CeW.setErrorInfo(interfaceC31837CeX);
        this.LIZIZ.onFailure(0, c21240sS.LIZJ, interfaceC31836CeW);
    }

    public C31832CeS(C31833CeT c31833CeT, C37356ElM c37356ElM) {
        this.LIZ = c31833CeT;
        this.LIZIZ = c37356ElM;
    }
}
