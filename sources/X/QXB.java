package X;

import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.router.SmartRouter;
import com.google.gson.Gson;
import com.ss.android.account.share.data.model.AccountShareInfo;
import java.util.HashMap;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QXB {
    public static final java.util.Map<String, String> LIZIZ = new HashMap();
    public boolean LIZ;

    public static void LIZ() {
        try {
            Context LIZIZ2 = EF7.LIZIZ();
            EF7.LIZIZ().getPackageName();
            QM5.LIZJ(LIZIZ2, "key_account_info", "");
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public QXB() {
        if (RBW.LJLLI.LJI()) {
            if (o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ())) {
                C10K.LIZIZ(QXC.LJLIL, C38995FSd.LIZLLL(), null);
                return;
            } else {
                RBW.LJ();
                return;
            }
        }
        C67737QiD.LIZ = "not login";
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00da A[Catch: Exception -> 0x011e, TryCatch #0 {Exception -> 0x011e, blocks: (B:2:0x0000, B:5:0x0012, B:8:0x0023, B:10:0x005a, B:12:0x0060, B:14:0x0066, B:15:0x006c, B:17:0x0079, B:18:0x0085, B:20:0x008b, B:21:0x00c8, B:23:0x00da, B:24:0x00fa, B:26:0x0102, B:29:0x0108, B:31:0x011a), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x011a A[Catch: Exception -> 0x011e, TRY_LEAVE, TryCatch #0 {Exception -> 0x011e, blocks: (B:2:0x0000, B:5:0x0012, B:8:0x0023, B:10:0x005a, B:12:0x0060, B:14:0x0066, B:15:0x006c, B:17:0x0079, B:18:0x0085, B:20:0x008b, B:21:0x00c8, B:23:0x00da, B:24:0x00fa, B:26:0x0102, B:29:0x0108, B:31:0x011a), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ() {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QXB.LIZJ():void");
    }

    public static void LIZIZ(QTZ qtz) {
        if (qtz.LJIIL.optBoolean("need_verify", false)) {
            SmartRouter.buildRoute(EF7.LIZIZ(), new Uri.Builder().scheme("aweme://webview/").appendQueryParameter("url", "https://inapp.tiktokv.com/ucenter_web/account_hacked_checkpoint").appendQueryParameter("append_common_params", "1").appendQueryParameter("use_spark", "1").appendQueryParameter("hide_nav_bar", "1").appendQueryParameter("disable_back_press", "1").appendQueryParameter("enter_from", "cold_start").build().toString()).open();
        }
    }

    public static void LIZLLL(AccountShareInfo accountShareInfo, java.util.Map map) {
        String jSONObject;
        if (map == null) {
            jSONObject = "{}";
        } else {
            jSONObject = new JSONObject(map).toString();
            o.LJIIIIZZ(jSONObject, "JSONObject(map).toString()");
        }
        accountShareInfo.accountExtra = jSONObject;
        Context LIZIZ2 = EF7.LIZIZ();
        String json = GsonProtectorUtils.toJson((Gson) QM5.LIZLLL.getValue(), accountShareInfo);
        o.LJIIIIZZ(json, "gson.toJson(accountShareInfo)");
        QM5.LIZJ(LIZIZ2, "key_account_info", json);
    }
}
