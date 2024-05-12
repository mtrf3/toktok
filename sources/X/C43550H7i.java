package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoActivity;
import kotlin.jvm.internal.o;

/* renamed from: X.H7i, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43550H7i {
    public static void LIZIZ(Context context, int i, Intent intent) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(intent, "intent");
        intent.setClass(context, VECutVideoActivity.class);
        if (intent.getLongExtra("extra_start_enter_cut_page", -1L) == -1) {
            intent.putExtra("extra_start_enter_cut_page", System.currentTimeMillis());
        }
        if (i == -1 || !(context instanceof Activity)) {
            C16880lQ.LIZJ(context, intent);
        } else {
            C16880lQ.LJFF((Activity) context, i, intent);
        }
    }

    public static void LIZ(Activity activity, Intent intent, boolean z, boolean z2) {
        o.LJIIIZ(activity, "activity");
        if (z2) {
            C42662Gok.LJFF(activity, C16880lQ.LLJJIJI(intent));
        } else if (z) {
            intent.putExtra("extra_request_code", 8);
            C42662Gok.LJFF(activity, C16880lQ.LLJJIJI(intent));
        } else {
            C42662Gok.LJ(activity, C16880lQ.LLJJIJI(intent));
        }
    }
}
