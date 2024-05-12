package X;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.L7s, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53752L7s {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C53555L0d.LJLIL);
    public static final java.util.Map<Integer, String> LIZIZ = C113554cx.LJJL(new OSZ(Integer.valueOf(R.layout.sv), "awemenotice_mus_item_notification_at_new"), new OSZ(Integer.valueOf(R.layout.tf), "awemenotice_mus_item_notification_template"), new OSZ(Integer.valueOf(R.layout.t_), "awemenotice_mus_item_notification_likes_new"), new OSZ(Integer.valueOf(R.layout.sy), "awemenotice_mus_item_notification_comments_new"), new OSZ(Integer.valueOf(R.layout.sr), "awemenotice_mus_fragment_notification_new"));

    public static int LIZIZ() {
        return ((Number) LIZ.getValue()).intValue();
    }

    public static final boolean LIZJ() {
        if ((LIZIZ() & 1) == 1) {
            return true;
        }
        return false;
    }

    public static View LIZ(LayoutInflater layoutInflater, int i, ViewGroup viewGroup, boolean z) {
        Activity activity;
        String str;
        Context context;
        if (viewGroup != null && (context = viewGroup.getContext()) != null) {
            activity = C45804HyK.LJIJJ(context);
        } else {
            activity = null;
        }
        if (!z) {
            return C114304eA.LIZ(layoutInflater, i, viewGroup, false, 16);
        }
        if ((LIZIZ() & 4) == 4 && activity != null) {
            boolean LIZ2 = C16970lZ.LIZ(i, activity);
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("activity page asyncInflateV1, id=");
            LIZ3.append(LIZIZ.get(Integer.valueOf(i)));
            LIZ3.append(", hasCachedView=");
            LIZ3.append(LIZ2);
            LIZ3.append('}');
            C221018lt.LJFF("ActivityJankOpt", X1D.LIZIZ(LIZ3));
            C188727au c188727au = new C188727au();
            if (INB.LIZIZ()) {
                str = "new_activities";
            } else {
                str = "inbox_first_page";
            }
            c188727au.LJIIIZ("position", str);
            c188727au.LIZLLL(LIZ2 ? 1 : 0, "has_cached_view");
            FMX.LJIIL("inflate_cache", c188727au.LIZ);
            View view = C16970lZ.LIZJ(i, activity, viewGroup, false);
            boolean LIZ4 = C16970lZ.LIZ(i, activity);
            if ((LIZIZ() & 12) == 12 && !LIZ4) {
                C16970lZ.LJ(i, activity);
            }
            o.LJIIIIZZ(view, "view");
            return view;
        }
        View LLLLIILL = C16880lQ.LLLLIILL(layoutInflater, i, viewGroup, false);
        o.LJIIIIZZ(LLLLIILL, "inflater.inflate(id, container, attachToRoot)");
        return LLLLIILL;
    }
}
