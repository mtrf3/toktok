package X;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.authorize.AwemeAuthorizePlatformDepend;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class OTK implements InterfaceC61954OTe {
    public final Context LIZ;
    public final OTX LIZIZ;

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x00f3 -> B:32:0x0105). Please report as a decompilation issue!!! */
    @Override // X.InterfaceC61954OTe
    public final C61955OTf LIZ(OT6 ot6) {
        String str;
        String str2;
        String str3;
        C61955OTf c61955OTf = null;
        if (!TextUtils.isEmpty(null)) {
            str = null;
        } else {
            str = ot6.LJII;
        }
        List<String> LIZ = C39241Faf.LIZ(this.LIZ, ot6.getCallerPackage());
        HashMap hashMap = new HashMap();
        hashMap.put("client_key", ot6.LIZJ);
        hashMap.put("response_type", "code");
        hashMap.put("source", "native");
        hashMap.put("scope", str);
        if (!TextUtils.isEmpty(ot6.LJFF)) {
            hashMap.put("from", ot6.LJFF);
        }
        if (TextUtils.equals("wap_to_native", ot6.LJFF) && !TextUtils.isEmpty(ot6.LIZIZ)) {
            hashMap.put("redirect_uri", ot6.LIZIZ);
        }
        if (!TextUtils.isEmpty(ot6.LIZ)) {
            hashMap.put("state", ot6.LIZ);
        }
        if (!TextUtils.isEmpty(ot6.getCallerPackage())) {
            hashMap.put("app_identity", C30581Hy.LJIILLIIL(ot6.getCallerPackage()));
        }
        String LIZIZ = C39241Faf.LIZIZ(LIZ);
        if (!TextUtils.isEmpty(LIZIZ)) {
            hashMap.put("signature", LIZIZ);
            hashMap.put("sign", LIZIZ);
        }
        String str4 = "";
        if (!TextUtils.isEmpty("")) {
            str2 = "";
        } else {
            this.LIZIZ.LIZ();
            str2 = "open16-va.tiktokv.com";
        }
        if (!TextUtils.isEmpty("")) {
            str3 = "";
        } else {
            str3 = "/passport/open/auth/";
        }
        android.net.Uri build = new Uri.Builder().scheme("https").authority(str2).path(str3).build();
        int i = -1;
        try {
            String LIZJ = this.LIZIZ.LIZJ(build.toString(), hashMap);
            if (LIZJ != null) {
                c61955OTf = new C61955OTf();
                try {
                    OTL.LIZJ(c61955OTf, LIZJ);
                    if (c61955OTf.LIZ) {
                        JSONObject jSONObject = c61955OTf.LIZLLL;
                        if (jSONObject != null) {
                            c61955OTf.LJ = jSONObject.optString("code");
                        } else {
                            c61955OTf.LIZIZ = -1;
                        }
                    }
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
        } catch (Throwable th) {
            c61955OTf = new C61955OTf();
            c61955OTf.LIZIZ = C78966Uyw.LJIIIIZZ(this.LIZIZ, th);
        }
        String str5 = "fail";
        if (c61955OTf == null) {
            str4 = this.LIZ.getString(R.string.c4w);
        } else if (!c61955OTf.LIZ) {
            i = c61955OTf.LIZIZ;
            str4 = c61955OTf.LIZJ;
        } else {
            i = 0;
            str5 = "success";
        }
        JSONObject LIZJ2 = LIZJ(ot6, str5, i, str4);
        try {
            if (this.LIZIZ != null && !TextUtils.isEmpty("platform_auth_code")) {
                this.LIZIZ.LIZLLL("platform_auth_code", LIZJ2);
            }
        } catch (Exception e2) {
            C16880lQ.LLLLIIL(e2);
        }
        return c61955OTf;
    }

    @Override // X.InterfaceC61954OTe
    public final C61952OTc LIZIZ(OT6 ot6) {
        String LIZ;
        String str;
        String str2;
        C61952OTc c61952OTc;
        int i;
        String str3 = "";
        if (!TextUtils.isEmpty("")) {
            LIZ = "";
        } else {
            LIZ = OTL.LIZ(ot6);
        }
        if (!TextUtils.isEmpty("")) {
            str = "";
        } else {
            this.LIZIZ.LIZ();
            str = "open16-va.tiktokv.com";
        }
        if (!TextUtils.isEmpty("")) {
            str2 = "";
        } else {
            str2 = "/passport/open/auth_info/v2/";
        }
        try {
            c61952OTc = OTL.LIZIZ(this.LIZIZ.executeGet(new Uri.Builder().scheme("https").authority(str).path(str2).appendQueryParameter("client_key", ot6.LIZJ).appendQueryParameter("scope", LIZ).build().toString()));
        } catch (Throwable th) {
            c61952OTc = new C61952OTc();
            c61952OTc.LIZIZ = C78966Uyw.LJIIIIZZ(this.LIZIZ, th);
        }
        String str4 = "fail";
        if (c61952OTc == null) {
            str3 = this.LIZ.getString(R.string.c4w);
            i = -1;
        } else if (!c61952OTc.LIZ) {
            i = c61952OTc.LIZIZ;
            str3 = c61952OTc.LIZJ;
        } else {
            i = 0;
            str4 = "success";
        }
        JSONObject LIZJ = LIZJ(ot6, str4, i, str3);
        try {
            if (this.LIZIZ != null && !TextUtils.isEmpty("platform_auth_info")) {
                this.LIZIZ.LIZLLL("platform_auth_info", LIZJ);
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        return c61952OTc;
    }

    public OTK(Context context, AwemeAuthorizePlatformDepend awemeAuthorizePlatformDepend) {
        this.LIZIZ = awemeAuthorizePlatformDepend;
        this.LIZ = context;
    }

    public static JSONObject LIZJ(OT6 ot6, String str, int i, String str2) {
        JSONObject jSONObject;
        try {
            try {
                jSONObject = new JSONObject();
                if (ot6 != null) {
                    jSONObject.put("client_key", ot6.LIZJ);
                }
                jSONObject.put("sdk_version", 7);
                jSONObject.put("params_for_special", "uc_login");
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
                jSONObject = null;
            }
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            jSONObject.put("result", str);
            jSONObject.put("errCode", i);
            jSONObject.put("errDesc", str2);
            return jSONObject;
        } catch (JSONException e2) {
            C16880lQ.LLLLIIL(e2);
            return null;
        }
    }
}
