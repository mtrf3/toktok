package X;

import Y.IDRunnableS65S0000000;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.0lZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16970lZ {
    public static C16990lb LIZ;

    public static void LJI(Context context) {
        LJ(R.layout.azi, context);
        C16990lb c16990lb = LIZ;
        if (c16990lb != null && c16990lb.LIZJ && c16990lb.LIZLLL) {
            FOR.LJFF.LIZIZ().execute(new IDRunnableS65S0000000(8));
        }
    }

    public static void LJII(int i) {
        C39066FUw LIZ2 = C16960lY.LIZ(i);
        if (LIZ2 == null) {
            return;
        }
        HandlerC39055FUl handlerC39055FUl = HandlerC39055FUl.LJIIIIZZ;
        String str = LIZ2.LJLIL;
        handlerC39055FUl.getClass();
        HandlerC39055FUl.LJFF(i, str);
    }

    public static void LJIIIIZZ(String str) {
        C39066FUw c39066FUw = C16960lY.LIZIZ.get(str);
        if (c39066FUw == null) {
            return;
        }
        HandlerC39055FUl handlerC39055FUl = HandlerC39055FUl.LJIIIIZZ;
        String str2 = c39066FUw.LJLIL;
        int i = c39066FUw.LJLILLLLZI[0];
        handlerC39055FUl.getClass();
        HandlerC39055FUl.LJFF(i, str2);
    }

    public static boolean LIZ(int i, Context context) {
        C39066FUw LIZ2 = C16960lY.LIZ(i);
        if (LIZ2 == null) {
            return false;
        }
        return C39057FUn.LIZLLL(context, i, LIZ2.LJLIL);
    }

    public static boolean LIZIZ(Context context, String str) {
        C39066FUw c39066FUw = C16960lY.LIZIZ.get(str);
        if (c39066FUw == null) {
            return false;
        }
        return C39057FUn.LIZLLL(context, c39066FUw.LJLILLLLZI[0], c39066FUw.LJLIL);
    }

    public static View LIZLLL(Activity activity, int i) {
        return LIZJ(i, activity, new FrameLayout(activity), false);
    }

    public static void LJ(int i, Context context) {
        C39066FUw LIZ2;
        C16990lb c16990lb = LIZ;
        if (c16990lb == null || !c16990lb.LJ || (LIZ2 = C16960lY.LIZ(i)) == null) {
            return;
        }
        C39057FUn.LIZJ.LJFF(context, LIZ2.LJLJL, LIZ2.LJLIL);
    }

    public static void LJFF(Context context, String str) {
        C16990lb c16990lb = LIZ;
        if (c16990lb == null || !c16990lb.LJ) {
            return;
        }
        HashMap<String, C39066FUw> hashMap = C16960lY.LIZIZ;
        if (hashMap.get(str) == null) {
            return;
        }
        C39066FUw c39066FUw = hashMap.get(str);
        c39066FUw.getClass();
        C39057FUn.LIZJ.LJFF(context, c39066FUw.LJLJL, c39066FUw.LJLIL);
    }

    public static View LIZJ(int i, Activity context, ViewGroup viewGroup, boolean z) {
        C39066FUw LIZ2 = C16960lY.LIZ(i);
        if (LIZ == null || LIZ2 == null) {
            return C16950lX.LIZ(context, i, viewGroup, z, -1);
        }
        C39066FUw LIZ3 = C16960lY.LIZ(i);
        LIZ3.getClass();
        o.LJIIJ(context, "context");
        View view = (View) C39056FUm.LIZ(LIZ3.LJLIL, i, context);
        if (viewGroup != null && z) {
            viewGroup.addView(view, view.getLayoutParams());
            return viewGroup;
        }
        return view;
    }
}
