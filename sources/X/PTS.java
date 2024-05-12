package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.ss.android.ugc.aweme.experiment.FollowFeedViewStubExperiment;
import defpackage.i0;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PTS implements PPA {
    public static final String[] LIZIZ = {"aweme-app"};
    public static final String[] LIZJ = {FollowFeedViewStubExperiment.REPO_NAME, "gecko_deeplink"};
    public final Context LIZ;

    public PTS(Context context) {
        this.LIZ = context;
    }

    public static final void LIZ(String str, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject(JSONObjectProtectorUtils.getString(jSONObject, "crash"));
            String string = JSONObjectProtectorUtils.getString(jSONObject2, "crashStack");
            int i = JSONObjectProtectorUtils.getInt(jSONObject2, "crashType");
            if ("safemode_dialog_show_v2".equals(str)) {
                LIZIZ(i, string, PTT.ACTION_DIALOG_SHOW);
            } else if ("safemode_dialog_button_clean_v2".equals(str)) {
                LIZIZ(i, string, PTT.ACTION_CLICK_SURE_BUTTON);
            } else if ("safemode_dialog_button_exit_v2".equals(str)) {
                LIZIZ(i, string, PTT.ACTION_CLICK_CANCEL_BUTTON);
            }
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public final void LIZLLL(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            String LIZJ2 = C0ON.LIZJ("LaunchProtectException msg:", str, " stack:\n", str2);
            C1JX.LJIIIIZZ("SafeMode reportStack:", LIZJ2);
            PJZ.LIZLLL("LaunchProtectException", LIZJ2, null);
        }
    }

    public static void LIZIZ(int i, String str, PTT ptt) {
        String LJFF;
        int i2 = PTU.LIZ[ptt.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    LJFF = null;
                } else {
                    LJFF = i0.LJFF("LaunchProtectClickCancel", "_Event");
                }
            } else {
                LJFF = i0.LJFF("LaunchProtectClickSure", "_Event");
            }
        } else {
            LJFF = i0.LJFF("LaunchProtectShowDialog", "_Event");
        }
        if (1 == i) {
            PJZ.LJ("LaunchProtectException", LJFF, new P8S(LJFF, str));
        } else {
            if (2 != i) {
                return;
            }
            try {
                V1M.LJJJI(LJFF, null, str, "LaunchProtectException", null);
            } catch (Throwable unused) {
            }
        }
    }

    public static void LIZJ(String str, String str2, String str3) {
        if ("java".equals(str)) {
            PJZ.LJ("LaunchProtectException", str3, new P8S(str3, str2));
        } else {
            if (!"native".equals(str)) {
                return;
            }
            try {
                V1M.LJJJI(str3, null, str2, "LaunchProtectException", null);
            } catch (Throwable unused) {
            }
        }
    }
}
