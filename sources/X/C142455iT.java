package X;

import android.app.Activity;
import android.view.View;
import com.bytedance.keva.Keva;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.5iT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C142455iT {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(boolean z) {
        String str;
        if (C19N.LJ("use_max_include_time", false)) {
            return false;
        }
        Keva repo = Keva.getRepo("repo_cur_video_page_i18n");
        if (z) {
            str = "multi_video_drag_showed";
        } else {
            str = "single_video_drag_showed";
        }
        return !repo.getBoolean(str, false);
    }

    public static void LIZIZ(Activity activity, View view, boolean z) {
        String str;
        if (z) {
            str = "multi_video_drag_showed";
        } else {
            str = "single_video_drag_showed";
        }
        Keva.getRepo("repo_cur_video_page_i18n").storeBoolean(str, true);
        C139825eE c139825eE = new C139825eE(activity);
        String string = activity.getString(R.string.hyr, Long.valueOf(C152345yQ.LIZ() / 60000));
        o.LJIIIIZZ(string, "activity.getString(R.str…reshold() / (60 * 1000L))");
        c139825eE.LIZJ = string;
        C82682Wcg c82682Wcg = c139825eE.LIZ;
        c82682Wcg.LJII = 5000L;
        c82682Wcg.LIZIZ = view;
        c139825eE.LJI(WHL.TOP);
        c139825eE.LIZJ().show();
    }
}
