package X;

import Y.ARunnableS12S1200000_13;
import android.text.TextUtils;
import com.bytedance.globalpayment.iap.common.ability.model.OrderData;
import com.bytedance.globalpayment.iap.common.ability.model.api.entity.CreateOrderResponseEntity;
import defpackage.i0;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: X.UoC, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC78300UoC {
    public abstract void LIZ(C77874UhK c77874UhK, OrderData orderData, InterfaceC78326Uoc<CreateOrderResponseEntity> interfaceC78326Uoc);

    public abstract void LIZLLL(String str, String str2, String str3, String str4, boolean z, String str5, C78329Uof c78329Uof, boolean z2);

    public abstract void LJ(String str, JSONObject jSONObject, String str2, boolean z, String str3, String str4, C78358Up8 c78358Up8, boolean z2);

    public AbstractC78300UoC() {
        C16880lQ.LJLLJ(AbstractC78300UoC.class);
    }

    public static String LIZIZ(String str) {
        String LIZIZ;
        if (!TextUtils.isEmpty(str)) {
            LIZIZ = i0.LJFF(str, "/pipo/inner/receipt/v1");
        } else {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(C78274Unm.LIZIZ(str));
            LIZ.append("/pipo/inner/receipt/v1");
            LIZIZ = X1D.LIZIZ(LIZ);
        }
        C39670Fha LJ = C78273Unl.LJIIIZ().LJ();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("getUploadTokenUrl with host:");
        LIZ2.append(LIZIZ);
        X1D.LIZIZ(LIZ2);
        LJ.getClass();
        return LIZIZ;
    }

    public static void LIZJ(String str, java.util.Map map, InterfaceC78387Upb interfaceC78387Upb) {
        HashMap hashMap = (HashMap) map;
        hashMap.put("pipo_sdk_version", "1.0");
        String str2 = ((C78261UnZ) C78273Unl.LJIIIZ().LIZ()).LIZ.LJIIIZ;
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("device_id", str2);
        }
        C78273Unl.LJIIIZ().LJII().getClass();
        ((C78303UoF) C78273Unl.LJIIIZ().LIZJ()).LIZ.execute(new ARunnableS12S1200000_13(map, str, interfaceC78387Upb, 9));
    }
}
