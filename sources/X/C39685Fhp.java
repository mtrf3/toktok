package X;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.Fhp, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39685Fhp implements IZY {
    public static C39685Fhp LJLJI;
    public final /* synthetic */ int LJLIL;
    public Object LJLILLLLZI;

    public C39685Fhp() {
        this.LJLIL = 1;
        this.LJLILLLLZI = new HashMap();
    }

    @Override // X.IZY
    public final /* synthetic */ List LJIILL() {
        return null;
    }

    @Override // X.IZY
    public final /* synthetic */ void LJJJJLI(C46882Iac c46882Iac) {
    }

    public final String toString() {
        switch (this.LJLIL) {
            case 2:
                return "LocalUrlDataSource";
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C39685Fhp(android.content.Context r6) {
        /*
            r5 = this;
            r0 = 0
            r5.LJLIL = r0
            r5.<init>()
            java.lang.String r1 = "assets-map/aweme.json"
            r4 = 0
            android.content.res.AssetManager r0 = r6.getAssets()     // Catch: java.io.IOException -> L2a java.lang.Throwable -> L50
            java.io.InputStream r3 = r0.open(r1)     // Catch: java.io.IOException -> L2a java.lang.Throwable -> L50
            int r0 = r3.available()     // Catch: java.io.IOException -> L28 java.lang.Throwable -> L49
            byte[] r2 = new byte[r0]     // Catch: java.io.IOException -> L28 java.lang.Throwable -> L49
            r3.read(r2)     // Catch: java.io.IOException -> L28 java.lang.Throwable -> L49
            r3.close()     // Catch: java.io.IOException -> L28 java.lang.Throwable -> L49
            java.lang.String r1 = new java.lang.String     // Catch: java.io.IOException -> L28 java.lang.Throwable -> L49
            java.lang.String r0 = "utf-8"
            r1.<init>(r2, r0)     // Catch: java.io.IOException -> L28 java.lang.Throwable -> L49
            r3.close()     // Catch: java.io.IOException -> L35
            goto L35
        L28:
            r0 = move-exception
            goto L2c
        L2a:
            r0 = move-exception
            r3 = r4
        L2c:
            X.C16880lQ.LLLLIIL(r0)     // Catch: java.lang.Throwable -> L49
            if (r3 == 0) goto L36
            r3.close()     // Catch: java.io.IOException -> L36
            goto L36
        L35:
            r4 = r1
        L36:
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L48
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L44
            r0.<init>(r4)     // Catch: org.json.JSONException -> L44
            r5.LJLILLLLZI = r0     // Catch: org.json.JSONException -> L44
            goto L48
        L44:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L48:
            return
        L49:
            r0 = move-exception
            if (r3 == 0) goto L51
            r3.close()     // Catch: java.io.IOException -> L51
            goto L51
        L50:
            r0 = move-exception
        L51:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39685Fhp.<init>(android.content.Context):void");
    }

    public static C39685Fhp LIZIZ(Context context) {
        if (LJLJI == null) {
            synchronized (C39685Fhp.class) {
                if (LJLJI == null) {
                    LJLJI = new C39685Fhp(context);
                }
            }
        }
        return LJLJI;
    }

    public final String LIZ(String str) {
        JSONObject jSONObject;
        if (TextUtils.isEmpty("JENKINS_BUILD_RESULT") || (jSONObject = (JSONObject) this.LJLILLLLZI) == null) {
            return null;
        }
        return jSONObject.optString("JENKINS_BUILD_RESULT", str);
    }

    @Override // X.IZY
    public final void LJJIJIL(java.util.Map map) {
        HashMap hashMap = (HashMap) map;
        hashMap.put("is_from_cache", "1");
        String str = (String) this.LJLILLLLZI;
        if (!TextUtils.isEmpty(str)) {
            if (str.length() > 1024) {
                hashMap.put("current_url", str.substring(0, 1024));
            } else {
                hashMap.put("current_url", str);
            }
        }
    }

    public final void LIZJ(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            ((HashMap) this.LJLILLLLZI).put(str, str2);
        }
    }

    @Override // X.IZY
    public final void LJIIJ(C46882Iac c46882Iac, IXO ixo, String str, java.util.Map map) {
        c46882Iac.LJLLLL(203, 0);
        c46882Iac.LL(str);
        this.LJLILLLLZI = str;
    }
}
