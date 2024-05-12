package X;

import android.graphics.Bitmap;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1cE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C36661cE extends C10R {
    public final String LJFF;
    public final F52 LJI;
    public final String LJII;
    public final F52 LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;
    public final String LJIIJJI;
    public final boolean LJIIL;
    public Bitmap LJIILIIL;
    public Bitmap LJIILJJIL;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("OcrResponse{mExpiredDate='");
        Q89.LIZIZ(LIZ, this.LJFF, '\'', ", mExpiredDateCorners=");
        LIZ.append(this.LJI);
        LIZ.append(", mNumber='");
        Q89.LIZIZ(LIZ, this.LJII, '\'', ", mNumberCorners=");
        LIZ.append(this.LJIIIIZZ);
        LIZ.append(", mBankId='");
        Q89.LIZIZ(LIZ, this.LJIIIZ, '\'', ", mBankName='");
        Q89.LIZIZ(LIZ, this.LJIIJ, '\'', ", mCardName='");
        Q89.LIZIZ(LIZ, this.LJIIJJI, '\'', ", mIsValid=");
        LIZ.append(this.LJIIL);
        LIZ.append(", mNumberBitmap=");
        LIZ.append(this.LJIILIIL);
        LIZ.append(", mResponseJsonObject=");
        LIZ.append(this.LIZ);
        LIZ.append(", mSign='");
        Q89.LIZIZ(LIZ, this.LIZIZ, '\'', ", mResultCode='");
        Q89.LIZIZ(LIZ, this.LIZJ, '\'', ", mErrorCode='");
        Q89.LIZIZ(LIZ, this.LIZLLL, '\'', ", mErrorMessage='");
        return C77800Ug8.LIZJ(LIZ, this.LJ, '\'', '}', LIZ);
    }

    public C36661cE(String str) {
        super(str);
        boolean z;
        JSONObject jSONObject = this.LIZ;
        try {
            this.LJFF = jSONObject.optString("expired_date");
            F52 f52 = new F52(JSONObjectProtectorUtils.getJSONObject(jSONObject, "expired_date_corners"));
            this.LJI = f52;
            this.LJII = jSONObject.optString("number");
            F52 f522 = new F52(JSONObjectProtectorUtils.getJSONObject(jSONObject, "number_corners"));
            this.LJIIIIZZ = f522;
            this.LJIIIZ = jSONObject.optString("bank_id");
            this.LJIIJ = jSONObject.optString("bank_name");
            this.LJIIJJI = jSONObject.optString("card_name");
            if (f52.LJI && f522.LJI) {
                z = true;
            } else {
                z = false;
            }
            this.LJIIL = z;
        } catch (JSONException e) {
            this.LJ = e.getMessage();
        }
    }

    public final void LIZ(Bitmap bitmap) {
        F52 f52 = this.LJIIIIZZ;
        int i = f52.LIZIZ;
        Bitmap LIZLLL = C45283Hpv.LIZLLL(bitmap, i, f52.LIZJ, f52.LJ - i, f52.LIZLLL - f52.LJFF);
        F52 f522 = this.LJI;
        int i2 = f522.LIZIZ;
        Bitmap LIZLLL2 = C45283Hpv.LIZLLL(bitmap, i2, f522.LIZJ, f522.LJ - i2, f522.LIZLLL - f522.LJFF);
        this.LJIILIIL = LIZLLL;
        this.LJIILJJIL = LIZLLL2;
        this.LJIIIIZZ.getClass();
        if (this.LJIIIIZZ.LJII && LIZLLL != null) {
            this.LJIILIIL = C45283Hpv.LJ(270.0f, LIZLLL);
        }
        if (this.LJIIIIZZ.LJIIIIZZ && LIZLLL != null) {
            this.LJIILIIL = C45283Hpv.LJ(90.0f, LIZLLL);
        }
        this.LJI.getClass();
        if (this.LJI.LJII && LIZLLL2 != null) {
            this.LJIILJJIL = C45283Hpv.LJ(270.0f, LIZLLL2);
        }
        if (this.LJI.LJIIIIZZ && LIZLLL2 != null) {
            this.LJIILJJIL = C45283Hpv.LJ(90.0f, LIZLLL2);
        }
    }
}
