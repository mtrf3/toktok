package X;

import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class VLP {
    public String LIZ;
    public String LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public String LJ;
    public String LJFF;
    public int LJI;
    public int LJII;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FetchError{method='");
        Q89.LIZIZ(LIZ, this.LIZ, '\'', ", url='");
        Q89.LIZIZ(LIZ, this.LIZIZ, '\'', ", errorMessage='");
        Q89.LIZIZ(LIZ, this.LJFF, '\'', ", errorCode=");
        LIZ.append(this.LJI);
        LIZ.append(", statusCode=");
        LIZ.append(this.LIZJ);
        LIZ.append(", requestErrorCode=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", requestErrorMsg='");
        Q89.LIZIZ(LIZ, this.LJ, '\'', ", jsbReturn=");
        LIZ.append(this.LJII);
        LIZ.append(", hitPrefetch=");
        LIZ.append(0);
        LIZ.append('}');
        return X1D.LIZIZ(LIZ);
    }

    public final void LIZ(JSONObject jSONObject) {
        C77123UOp.LJJJJZI("event_type", "fetchError", jSONObject);
        C77123UOp.LJJJJLL(this.LJI, "error_no", jSONObject);
        C77123UOp.LJJJJZI("error_msg", this.LJFF, jSONObject);
        C77123UOp.LJJJJZI("method", this.LIZ, jSONObject);
        C77123UOp.LJJJJZI("url", this.LIZIZ, jSONObject);
        C77123UOp.LJJJJLL(this.LIZJ, "status_code", jSONObject);
        C77123UOp.LJJJJLL(this.LIZLLL, "request_error_code", jSONObject);
        C77123UOp.LJJJJZI("request_error_msg", this.LJ, jSONObject);
        C77123UOp.LJJJJLL(this.LJII, "jsb_ret", jSONObject);
        C77123UOp.LJJJJLL(0, "hit_prefetch", jSONObject);
    }
}
