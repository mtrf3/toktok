package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.QyK, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68736QyK {
    public static volatile C68736QyK LIZLLL = new C68736QyK();
    public final C68737QyL[] LIZ = C68737QyL.LJII;
    public final C68737QyL[] LIZIZ = C68737QyL.LJIIIIZZ;
    public boolean LIZJ;

    public final boolean LIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        LIZIZ(C58725N2z.LIZ);
        for (C68737QyL c68737QyL : this.LIZ) {
            if (c68737QyL.LIZJ && !TextUtils.isEmpty(c68737QyL.LIZ) && c68737QyL.LIZ.contains(str)) {
                return true;
            }
        }
        return false;
    }

    public final void LIZIZ(Context context) {
        JSONObject jSONObject;
        String[] split;
        if (this.LIZJ || context == null) {
            return;
        }
        this.LIZJ = true;
        SharedPreferences LIZIZ = F9J.LIZIZ(context, 0, "com.ss.spipe_setting");
        try {
            HashMap hashMap = new HashMap();
            String string = LIZIZ.getString("expire_platforms", null);
            String string2 = LIZIZ.getString("bind_platforms", "");
            if (TextUtils.isEmpty(string)) {
                jSONObject = new JSONObject();
            } else {
                jSONObject = new JSONObject(string);
            }
            for (C68737QyL c68737QyL : this.LIZIZ) {
                if (!jSONObject.isNull(c68737QyL.LIZ)) {
                    c68737QyL.LJI = jSONObject.optLong(c68737QyL.LIZ, -1L);
                }
            }
            hashMap.clear();
            if (TextUtils.isEmpty(string2) || (split = string2.split(",")) == null || split.length <= 0) {
                return;
            }
            for (String str : split) {
                hashMap.put(str, str);
            }
            for (C68737QyL c68737QyL2 : this.LIZIZ) {
                if (hashMap.containsKey(c68737QyL2.LIZ)) {
                    c68737QyL2.LIZJ = true;
                }
            }
        } catch (Exception unused) {
        }
    }

    public final void LIZJ(Context context) {
        if (context == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        for (C68737QyL c68737QyL : this.LIZIZ) {
            long j = c68737QyL.LJI;
            if (j > 0) {
                try {
                    jSONObject.put(c68737QyL.LIZ, j);
                } catch (JSONException e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (C68737QyL c68737QyL2 : this.LIZIZ) {
            if (c68737QyL2.LIZJ) {
                if (!z) {
                    sb.append(",");
                }
                sb.append(c68737QyL2.LIZ);
                z = false;
            }
        }
        String sb2 = sb.toString();
        SharedPreferences.Editor edit = F9J.LIZIZ(context, 0, "com.ss.spipe_setting").edit();
        edit.putString("expire_platforms", jSONObject.toString());
        edit.putString("bind_platforms", sb2);
        WX6.LIZ(edit);
    }

    public final void LIZLLL(QTX qtx, Context context) {
        C67046QTa c67046QTa;
        for (C68737QyL c68737QyL : this.LIZ) {
            c68737QyL.LIZJ = false;
            if (qtx != null) {
                String[] strArr = c68737QyL.LIZIZ;
                if (strArr == null || strArr.length == 0) {
                    c67046QTa = (C67046QTa) ((HashMap) qtx.LIZIZ).get(c68737QyL.LIZ);
                    if (c67046QTa == null) {
                    }
                    c68737QyL.LIZJ = true;
                    c68737QyL.LIZLLL = c67046QTa.LIZJ;
                    c68737QyL.LJ = c67046QTa.LIZLLL;
                    c68737QyL.LJFF = c67046QTa.LJ;
                    c68737QyL.LJI = -1L;
                    break;
                }
                for (String str : strArr) {
                    c67046QTa = (C67046QTa) ((HashMap) qtx.LIZIZ).get(str);
                    if (c67046QTa != null) {
                        c68737QyL.LIZJ = true;
                        c68737QyL.LIZLLL = c67046QTa.LIZJ;
                        c68737QyL.LJ = c67046QTa.LIZLLL;
                        c68737QyL.LJFF = c67046QTa.LJ;
                        c68737QyL.LJI = -1L;
                        break;
                        break;
                    }
                }
            }
        }
        LIZJ(context);
    }
}
