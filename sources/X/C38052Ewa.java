package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Ewa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38052Ewa implements InterfaceC36488ETs {
    public final /* synthetic */ String LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ BaseCommonJavaMethod LIZJ;

    @Override // X.InterfaceC36488ETs
    public final void LIZIZ(JSONObject jSONObject) {
        if (this.LIZJ.LJLILLLLZI != null) {
            if (!TextUtils.isEmpty(this.LIZ)) {
                this.LIZJ.LJLILLLLZI.LJ(this.LIZ, this.LIZIZ, jSONObject);
            } else {
                this.LIZJ.LJLILLLLZI.LIZLLL(this.LIZIZ, jSONObject);
            }
        }
    }

    @Override // X.InterfaceC36488ETs
    public final void onSuccess(Object obj) {
        if (this.LIZJ.LJLILLLLZI != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("code", 1);
                jSONObject.put("data", obj);
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
            if (!TextUtils.isEmpty(this.LIZ)) {
                this.LIZJ.LJLILLLLZI.LJ(this.LIZ, this.LIZIZ, jSONObject);
            } else {
                this.LIZJ.LJLILLLLZI.LIZLLL(this.LIZIZ, jSONObject);
            }
        }
    }

    @Override // X.InterfaceC36488ETs
    public final void LIZ(int i, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", i);
            jSONObject.put("msg", str);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        if (!TextUtils.isEmpty(this.LIZ)) {
            this.LIZJ.LJLILLLLZI.LJ(this.LIZ, this.LIZIZ, jSONObject);
        } else {
            this.LIZJ.LJLILLLLZI.LIZLLL(this.LIZIZ, jSONObject);
        }
    }

    public C38052Ewa(BaseCommonJavaMethod baseCommonJavaMethod, String str, String str2) {
        this.LIZJ = baseCommonJavaMethod;
        this.LIZ = str;
        this.LIZIZ = str2;
    }

    @Override // X.InterfaceC36488ETs
    public final void LIZJ(int i, String str, Object obj) {
        if (this.LIZJ.LJLILLLLZI != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("code", i);
                jSONObject.put("msg", str);
                jSONObject.put("data", obj);
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
            if (!TextUtils.isEmpty(this.LIZ)) {
                this.LIZJ.LJLILLLLZI.LJ(this.LIZ, this.LIZIZ, jSONObject);
            } else {
                this.LIZJ.LJLILLLLZI.LIZLLL(this.LIZIZ, jSONObject);
            }
        }
    }
}
