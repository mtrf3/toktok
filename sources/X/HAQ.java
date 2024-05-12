package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.tools.mvtemplate.MvThemeData;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;

/* loaded from: classes8.dex */
public final class HAQ {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(MvThemeData mvThemeData, ExceptionResult exceptionResult, boolean z) {
        boolean z2;
        String str;
        String str2;
        if (mvThemeData == null) {
            return;
        }
        if (TextUtils.isEmpty(mvThemeData.LJIIJ()) || TextUtils.isEmpty(mvThemeData.LJIIJJI())) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2) {
            C6BK c6bk = new C6BK();
            c6bk.LIZ.put("url", mvThemeData.LJIIJ());
            c6bk.LIZ.put("mv_res_id", mvThemeData.LJIIJJI());
            c6bk.LIZ.put("mv_res_name", mvThemeData.LJIIIIZZ());
            C43882HKc.LIZLLL(11, "mv_resource_download_error_state", c6bk.LJ(), true);
        }
        if (z) {
            C43882HKc.LIZLLL(0, "mv_resource_download_error_state", null, true);
            return;
        }
        C6BK c6bk2 = new C6BK();
        c6bk2.LIZ.put("url", mvThemeData.LJIIJ());
        c6bk2.LIZ.put("mv_res_id", mvThemeData.LJIIJJI());
        c6bk2.LIZ.put("mv_res_name", mvThemeData.LJIIIIZZ());
        String str3 = "";
        if (exceptionResult == null || (str = Integer.valueOf(exceptionResult.getErrorCode()).toString()) == null) {
            str = "";
        }
        c6bk2.LIZ.put("error_code", str);
        if (exceptionResult == null || (str2 = exceptionResult.toString()) == null) {
            str2 = "";
        }
        c6bk2.LIZ.put("error_message", str2);
        if (exceptionResult != null && exceptionResult.getException() != null) {
            str3 = J7I.LJII(exceptionResult.getException());
        }
        c6bk2.LIZ.put("exception", str3);
        C43882HKc.LIZLLL(1, "mv_resource_download_error_state", c6bk2.LJ(), true);
    }

    public static void LIZIZ(boolean z, MvThemeData mvThemeData, OSZ osz) {
        String str;
        String str2;
        String str3;
        Object second;
        if (z) {
            C43882HKc.LIZLLL(0, "mv_template_process_error_rate", null, true);
            return;
        }
        C6BK c6bk = new C6BK();
        Object obj = "";
        if (mvThemeData == null || (str = mvThemeData.LJIIJ()) == null) {
            str = "";
        }
        c6bk.LIZ.put("url", str);
        if (mvThemeData == null || (str2 = mvThemeData.LJIIJJI()) == null) {
            str2 = "";
        }
        c6bk.LIZ.put("mv_res_id", str2);
        if (osz == null || (str3 = Integer.valueOf(((Number) osz.getFirst()).intValue()).toString()) == null) {
            str3 = "";
        }
        c6bk.LIZ.put("error_code", str3);
        if (osz != null && (second = osz.getSecond()) != null) {
            obj = second;
        }
        c6bk.LIZ.put("error_message", obj);
        C43882HKc.LIZLLL(1, "mv_template_process_error_rate", c6bk.LJ(), true);
    }
}
