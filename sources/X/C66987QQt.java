package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.push.frontier.setting.FrontierLocalSetting;
import com.bytedance.push.settings.PushOnlineSettings;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.QQt, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66987QQt {
    public final synchronized void LIZJ(Context context, QR8 qr8) {
        boolean z;
        FrontierLocalSetting frontierLocalSetting = (FrontierLocalSetting) PT6.LIZ(context, FrontierLocalSetting.class);
        PushOnlineSettings pushOnlineSettings = (PushOnlineSettings) PT6.LIZ(context, PushOnlineSettings.class);
        long currentTimeMillis = System.currentTimeMillis();
        if (Math.abs(currentTimeMillis - frontierLocalSetting.LIZIZ()) / 60000 < pushOnlineSettings.LJIIZILJ()) {
            z = true;
        } else {
            z = false;
        }
        C66985QQr LJIILL = frontierLocalSetting.LJIILL();
        if (LJIILL == null || !LJIILL.LIZ() || !z) {
            String LIZIZ = C36929EeT.LIZIZ(C73312Spw.LJFF("/cloudpush/update_frontier_setting/"), QRM.LJIIIIZZ.LIZ());
            QKY qky = new QKY();
            try {
                if (LIZIZ(AbstractC66805QJt.LIZ.LIZLLL(LIZIZ, new ArrayList(), null, qky), currentTimeMillis, frontierLocalSetting, qr8)) {
                    return;
                }
            } catch (Throwable th) {
                LIZ(301, currentTimeMillis, th.getLocalizedMessage());
            }
        }
        C66992QQy c66992QQy = (C66992QQy) qr8;
        C66986QQs c66986QQs = c66992QQy.LIZIZ;
        QOQ qoq = c66992QQy.LIZ;
        QOX LIZJ = c66986QQs.LIZJ(LJIILL);
        if (LIZJ != null) {
            QOL qol = c66986QQs.LIZJ;
            if (qol != null) {
                qol.LIZ(LIZJ);
            } else {
                c66986QQs.LIZJ = QOV.LIZJ(c66986QQs.LIZIZ, LIZJ, qoq);
            }
        }
    }

    public static void LIZ(int i, long j, String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("request frontier setting failed, errorCode: ");
        LIZ.append(i);
        LIZ.append(" response: ");
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        C66993QQz LIZ2 = C66993QQz.LIZ();
        if (LIZ2.LIZIZ == null) {
            synchronized (LIZ2) {
                if (LIZ2.LIZIZ == null) {
                    LIZ2.LIZIZ = new C78937UyT();
                }
            }
        }
        C78937UyT c78937UyT = LIZ2.LIZIZ;
        long currentTimeMillis = System.currentTimeMillis() - j;
        c78937UyT.getClass();
        try {
            new JSONObject().put("status", i);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        try {
            new JSONObject().put("log", str);
        } catch (JSONException e2) {
            C16880lQ.LLLLIIL(e2);
        }
        try {
            new JSONObject().put("time_consuming", currentTimeMillis);
        } catch (JSONException e3) {
            C16880lQ.LLLLIIL(e3);
        }
    }

    public static boolean LIZIZ(String str, long j, FrontierLocalSetting frontierLocalSetting, QR8 qr8) {
        if (TextUtils.isEmpty(str)) {
            LIZ(304, j, str);
            return false;
        }
        JSONObject jSONObject = new JSONObject(str);
        if (!TextUtils.equals("success", jSONObject.optString("message"))) {
            LIZ(302, j, str);
            return false;
        }
        C66985QQr LIZIZ = C66985QQr.LIZIZ(jSONObject.optJSONObject("frontier_setting"));
        if (LIZIZ == null || !LIZIZ.LIZ()) {
            LIZ(303, j, str);
            return false;
        }
        frontierLocalSetting.LJJIJIIJIL(System.currentTimeMillis());
        frontierLocalSetting.LIZLLL(LIZIZ);
        C66993QQz LIZ = C66993QQz.LIZ();
        if (LIZ.LIZIZ == null) {
            synchronized (LIZ) {
                if (LIZ.LIZIZ == null) {
                    LIZ.LIZIZ = new C78937UyT();
                }
            }
        }
        C78937UyT c78937UyT = LIZ.LIZIZ;
        long currentTimeMillis = System.currentTimeMillis() - j;
        c78937UyT.getClass();
        try {
            new JSONObject().put("status", 0L);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        try {
            new JSONObject().put("time_consuming", currentTimeMillis);
        } catch (JSONException e2) {
            C16880lQ.LLLLIIL(e2);
        }
        C66992QQy c66992QQy = (C66992QQy) qr8;
        C66986QQs c66986QQs = c66992QQy.LIZIZ;
        QOQ qoq = c66992QQy.LIZ;
        QOX LIZJ = c66986QQs.LIZJ(LIZIZ);
        if (LIZJ == null) {
            return true;
        }
        QOL qol = c66986QQs.LIZJ;
        if (qol != null) {
            qol.LIZ(LIZJ);
            return true;
        }
        c66986QQs.LIZJ = QOV.LIZJ(c66986QQs.LIZIZ, LIZJ, qoq);
        return true;
    }
}
