package X;

import java.util.HashMap;
import java.util.TreeMap;
import org.json.JSONObject;

/* renamed from: X.UhK, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77874UhK extends IO1 {
    public String LIZ;
    public String LIZIZ;
    public long LIZJ;
    public String LIZLLL;
    public String LJ;
    public String LJFF;
    public HashMap<String, ?> LJI;
    public boolean LJII;
    public String LJIIIIZZ;
    public String LJIIIZ;
    public String LJIIJ;
    public boolean LJIIJJI;
    public java.util.Map<String, String> LJIIL;
    public final long LJIILIIL;
    public int LJIILJJIL;

    public final JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        add(jSONObject, "merchant_id", this.LIZIZ);
        add(jSONObject, "iap_host", this.LJIIIIZZ);
        add(jSONObject, "order_platform", this.LJIILJJIL);
        add(jSONObject, "extra_payload", this.LJIIJ);
        return jSONObject;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("IapPayRequest{mSign='");
        Q89.LIZIZ(LIZ, this.LIZ, '\'', ", mMerchantId='");
        Q89.LIZIZ(LIZ, this.LIZIZ, '\'', ", mTimestamp=");
        LIZ.append(this.LIZJ);
        LIZ.append(", mDid='");
        Q89.LIZIZ(LIZ, this.LIZLLL, '\'', ", mUid='");
        Q89.LIZIZ(LIZ, this.LJ, '\'', ", mBizContent='");
        Q89.LIZIZ(LIZ, this.LJFF, '\'', ", mIsSubscription=");
        C1FL.LJFF(LIZ, this.LJII, ", mReplaceSkusProrationMode=", 0, ", mRequestHost=");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(", mOrderPlatform=");
        LIZ.append(this.LJIILJJIL);
        LIZ.append(", mProductId='");
        Q89.LIZIZ(LIZ, this.LJIIIZ, '\'', ", mExtraPayload='");
        Q89.LIZIZ(LIZ, this.LJIIJ, '\'', ", mHasCreateOrderOnServer=");
        LIZ.append(this.LJIIJJI);
        LIZ.append(", mPayRequestParams=");
        LIZ.append(this.LJIIL);
        LIZ.append(", mStartPayTimeStamp=");
        return C47135Ieh.LIZIZ(LIZ, this.LJIILIIL, '}', LIZ);
    }

    public C77874UhK(JSONObject jSONObject) {
        C16880lQ.LJLLJ(C77874UhK.class);
        this.LJII = false;
        this.LJIIJ = "";
        try {
            this.LIZIZ = jSONObject.optString("merchant_id");
            this.LJIIIIZZ = jSONObject.optString("iap_host");
            this.LJIILJJIL = jSONObject.optInt("order_platform");
            this.LJIIJ = jSONObject.optString("extra_payload");
        } catch (Throwable unused) {
            C39670Fha LJ = C78273Unl.LJIIIZ().LJ();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("error to parse IapPayRequest from cache : jsonObject is ");
            LIZ.append(jSONObject);
            X1D.LIZIZ(LIZ);
            LJ.getClass();
        }
    }

    public C77874UhK(long j) {
        C16880lQ.LJLLJ(C77874UhK.class);
        this.LJII = false;
        this.LJIIJ = "";
        this.LJIILIIL = j;
        this.LJIIL = new TreeMap();
    }
}
