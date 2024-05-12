package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.ss.android.ugc.aweme.compliance.business.report.ReportWebPageDialogActivity;
import kotlin.jvm.internal.o;

/* renamed from: X.Gwp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43163Gwp {
    public static void LIZ(Activity activity, Bundle bundle, String str, String str2) {
        o.LJIIIZ(activity, "activity");
        bundle.putBoolean("show_load_dialog", false);
        bundle.putBoolean("webview_progress_bar", true);
        if (str == null) {
            str = "";
        }
        bundle.putString("object_id", str);
        if (str2 == null) {
            str2 = "";
        }
        bundle.putString("enter_from", str2);
        Intent intent = new Intent(activity, (Class<?>) ReportWebPageDialogActivity.class);
        intent.putExtras(bundle);
        C16880lQ.LIZIZ(activity, intent);
    }
}
