package X;

import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Ixj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48315Ixj extends Error {
    public int code;
    public java.util.Map info;
    public long timeStamp;

    public static int convertVeLivePlayerErrorCode(int i) {
        switch (i) {
            case -1330794744:
            case -1296385272:
            case -1094995529:
            case -499983:
            case -499975:
            case -499971:
                return -300;
            case -1128613112:
            case -499998:
            case -499997:
            case -499996:
            case -499981:
            case -499978:
            case -499977:
                return -301;
            case -499992:
            case -499990:
                return -302;
            case -499988:
            case -499987:
            case -100002:
            case -100001:
                return -100;
            case -499984:
            case -100009:
                return -101;
            case -499898:
            case -499897:
            case -499896:
            case -499895:
            case -499894:
            case -499893:
            case -499892:
            case -499891:
            case -100011:
                return -201;
            case -499799:
            case -499798:
            case -100010:
                return -200;
            case -30001:
                return -1;
            default:
                return -999;
        }
    }

    public String getInfoJSON() {
        if (this.info == null) {
            this.info = new HashMap();
        }
        JSONObject jSONObject = new JSONObject(this.info);
        try {
            jSONObject.put("timestamp", this.timeStamp);
            jSONObject.put("message", super.toString());
        } catch (JSONException e) {
            e.toString();
            C46496IMq.LIZ();
        }
        return jSONObject.toString();
    }

    @Override // java.lang.Throwable
    public String toString() {
        if (this.info == null) {
            this.info = new HashMap();
        }
        JSONObject jSONObject = new JSONObject(this.info);
        try {
            jSONObject.put("message", super.toString());
            jSONObject.put("code", this.code);
            jSONObject.put("timestamp", this.timeStamp);
        } catch (JSONException e) {
            e.toString();
            C46496IMq.LIZ();
        }
        return jSONObject.toString();
    }

    public C48315Ixj(int i, String str, java.util.Map<String, String> map) {
        super(str);
        this.code = i;
        this.info = map;
        this.timeStamp = System.currentTimeMillis();
    }
}
