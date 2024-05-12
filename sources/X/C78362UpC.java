package X;

import com.bytedance.globalpayment.iap.common.ability.model.api.entity.ResponseEntity;
import com.bytedance.globalpayment.iap.model.TokenInfo;
import defpackage.b1;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.UpC, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78362UpC {
    public final String LIZ;
    public final TokenInfo LIZIZ;
    public int LIZJ;
    public final int LIZLLL;
    public final HandlerC46409IJh LJ;
    public final String LJFF;
    public InterfaceC78326Uoc<ResponseEntity> LJI;
    public final C78358Up8 LJII;

    public final void LIZIZ() {
        JSONObject jSONObject;
        C39670Fha LJ = C78273Unl.LJIIIZ().LJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UploadTokenManager: begin upload token, retry count:");
        LIZ.append(this.LIZJ);
        X1D.LIZIZ(LIZ);
        LJ.getClass();
        this.LJ.removeMessages(1);
        try {
            jSONObject = this.LIZIZ.toJson();
        } catch (JSONException e) {
            C39670Fha LJ2 = C78273Unl.LJIIIZ().LJ();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("mTokenInfo.toJsonString error:");
            LIZ2.append(e.getLocalizedMessage());
            X1D.LIZIZ(LIZ2);
            LJ2.getClass();
            jSONObject = null;
        }
        this.LIZIZ.getProductId();
        ((C78261UnZ) C78273Unl.LJIIIZ().LIZ()).LIZ.LJIILIIL.getClass();
        C78342Uos.LIZLLL().LIZJ().LJ(this.LIZ, jSONObject, this.LJFF, this.LIZIZ.isSubscription(), this.LIZIZ.getOrderId(), this.LIZIZ.getProductId(), this.LJII, this.LIZIZ.isNewSubscription());
    }

    public final void LIZ(InterfaceC78326Uoc<ResponseEntity> interfaceC78326Uoc) {
        b1.LIZLLL();
        this.LJI = interfaceC78326Uoc;
        LIZIZ();
    }

    public C78362UpC(String str, String str2, int i, TokenInfo tokenInfo) {
        C16880lQ.LJLLJ(C78362UpC.class);
        this.LIZJ = 0;
        this.LJII = new C78358Up8(this);
        this.LIZ = str;
        this.LIZIZ = tokenInfo;
        this.LJFF = str2;
        this.LJ = new HandlerC46409IJh(this);
        this.LIZLLL = 8;
    }
}
