package X;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* renamed from: X.C9o, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30868C9o {
    public static void LIZJ(int i) {
        LIZLLL(i, C15380j0.LIZLLL());
    }

    public static void LJI(String str) {
        LJFF(C15380j0.LIZLLL(), str);
    }

    public static void LJII(BPM bpm) {
        int i;
        Context LIZLLL = C15380j0.LIZLLL();
        if (LIZLLL == null) {
            return;
        }
        if (TextUtils.isEmpty(bpm.LIZ) && (i = bpm.LIZJ) != 0) {
            bpm.LIZ = LIZLLL.getString(i);
        }
        if (!TextUtils.isEmpty(bpm.LIZ)) {
            LJ(0L, null, bpm.LIZ);
            if (bpm.LIZLLL && bpm.LJFF != null) {
                BZI LIZ = C28787BRn.LIZ("toast_msg_show");
                if (C29306Beo.LJIIJ(bpm.LJFF)) {
                    LIZ.LJIJJ("anchor", "user_type");
                } else if (C29306Beo.LJIIL(bpm.LJFF)) {
                    LIZ.LJIJJ("user", "user_type");
                }
                LIZ.LJIJJ(bpm.LIZ, "msg_content");
                if (!TextUtils.isEmpty(bpm.LIZIZ)) {
                    LIZ.LJIJJ(bpm.LIZIZ, "msg_id");
                }
                java.util.Map<String, String> map = bpm.LJ;
                if (map != null && !map.isEmpty()) {
                    LIZ.LJJIFFI(bpm.LJ);
                }
                LIZ.LJJIIJZLJL();
            }
        }
    }

    public static final void LIZ(Context context, String str) {
        if (context == null) {
            context = C15380j0.LIZLLL();
        }
        Activity LJIJJ = C45804HyK.LJIJJ(context);
        if (LJIJJ == null || TextUtils.isEmpty(str)) {
            return;
        }
        C26045AKb c26045AKb = new C26045AKb(LJIJJ);
        c26045AKb.LJIIIZ(str);
        c26045AKb.LIZLLL(10000L);
        c26045AKb.LJIIJ();
    }

    public static void LIZIZ(ActivityC45651qj activityC45651qj, CharSequence charSequence) {
        C26045AKb c26045AKb = new C26045AKb(activityC45651qj);
        c26045AKb.LJFF(R.drawable.d0p);
        c26045AKb.LJIIIZ(charSequence);
        c26045AKb.LJIIJ();
    }

    public static void LIZLLL(int i, Context context) {
        if (context == null && (context = C15380j0.LIZLLL()) == null) {
            return;
        }
        LJFF(context, context.getString(i));
    }

    public static void LJFF(Context context, String str) {
        LJ(0L, context, str);
    }

    public static void LJIIIIZZ(int i, Context context) {
        if (context == null && (context = C15380j0.LIZLLL()) == null) {
            return;
        }
        LJ(0L, context, context.getString(i));
    }

    public static void LJIIJJI(Activity activity, String str) {
        C26045AKb c26045AKb = new C26045AKb(activity);
        c26045AKb.LJFF(R.drawable.czc);
        c26045AKb.LJIIIZ(str);
        c26045AKb.LIZLLL(5000L);
        c26045AKb.LJIIJ();
    }

    public static void LJ(long j, Context context, String str) {
        if ((context == null && (context = C15380j0.LIZLLL()) == null) || TextUtils.isEmpty(str)) {
            return;
        }
        if (j > 0) {
            C5S1 c5s1 = new C5S1(context);
            c5s1.LIZLLL(str);
            C26045AKb c26045AKb = c5s1.LIZIZ;
            if (c26045AKb != null) {
                c26045AKb.LIZLLL(j);
            }
            c5s1.LJ();
            return;
        }
        C30869C9p.LIZIZ(context, str);
    }

    public static void LJIIIZ(int i, Activity activity, String str) {
        C26045AKb c26045AKb = new C26045AKb(activity);
        c26045AKb.LJFF(i);
        c26045AKb.LJIIIZ(str);
        c26045AKb.LJIIJ();
    }

    public static void LJIIJ(int i, View view, String str) {
        if (view != null) {
            C26045AKb c26045AKb = new C26045AKb(view);
            c26045AKb.LJFF(i);
            c26045AKb.LJIIIZ(str);
            c26045AKb.LJIIJ();
        }
    }

    public static void LJIIL(String str, View view, int i) {
        if (view != null) {
            C26045AKb c26045AKb = new C26045AKb(view);
            c26045AKb.LJFF(i);
            c26045AKb.LJIIIZ(str);
            c26045AKb.LIZLLL(5000L);
            c26045AKb.LJIIJ();
        }
    }
}
