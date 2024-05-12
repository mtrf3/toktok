package X;

import android.app.Activity;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.music.model.NewReleaseAnchorExtra;
import com.ss.android.ugc.aweme.music.model.TTMStoreLink;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.SUk, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72178SUk {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(String str) {
        boolean z;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "";
        }
        try {
            String optString = new JSONObject(str).optString("ttm_track_id", "");
            o.LJIIIIZZ(optString, "{\n            val logExt…String(key, \"\")\n        }");
            return optString;
        } catch (Exception unused) {
            return "";
        }
    }

    public static void LIZIZ(AnchorCommonStruct anchorCommonStruct, InterfaceC44105HSr interfaceC44105HSr, NewReleaseAnchorExtra newReleaseAnchorExtra) {
        String str;
        String str2;
        TTMStoreLink tTMStoreLink;
        C27932Axk.LIZIZ();
        Activity LIZ2 = interfaceC44105HSr.LIZ();
        String LJJLJLI = interfaceC44105HSr.LJJLJLI();
        String schema = anchorCommonStruct.getSchema();
        if (schema != null && ujb.o.LJJJLIIL(schema, "aweme://lynxview", false)) {
            if (AnonymousClass636.LJIILJJIL(LIZ2)) {
                str2 = "dark";
            } else {
                str2 = "light";
            }
            StringBuilder LIZLLL = C1FL.LIZLLL(schema, "&enter_from=", LJJLJLI, "&open_timestamp=");
            LIZLLL.append(System.currentTimeMillis());
            LIZLLL.append("&status_font_mode=");
            LIZLLL.append(str2);
            SV7 sv7 = SV7.LIZ;
            if (newReleaseAnchorExtra != null) {
                tTMStoreLink = newReleaseAnchorExtra.store;
            } else {
                tTMStoreLink = null;
            }
            OH3 oh3 = OH3.NEW_RELEASE;
            SVA sva = SVA.TIKTOK_MUSIC;
            sv7.getClass();
            LIZLLL.append(SV7.LIZIZ(tTMStoreLink, oh3, sva));
            str = X1D.LIZIZ(LIZLLL);
        } else {
            str = "";
        }
        if (str.length() > 0) {
            SmartRoute buildRoute = SmartRouter.buildRoute(LIZ2, str);
            buildRoute.withParam("enter_from", LJJLJLI);
            buildRoute.open();
        }
    }
}
