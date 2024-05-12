package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.7MY, reason: invalid class name */
/* loaded from: classes4.dex */
public final /* synthetic */ class C7MY {
    public static double LIZ(double d, double d2, double d3, double d4) {
        return ((d * d2) + d3) / d4;
    }

    public static int LIZIZ(int i) {
        return O6R.LJJIIZ(C32151Nz.LJIIZILJ(Integer.valueOf(i)));
    }

    public static Drawable LIZJ(View view, String str, int i) {
        Context context = view.getContext();
        o.LJIIIIZZ(context, str);
        return C79045V0n.LJIIIIZZ(i, context);
    }

    public static StringBuilder LJ(String str, int i, String str2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append(i);
        LIZ.append(str2);
        return LIZ;
    }

    public static View LIZLLL(View view, String str, int i, String str2) {
        o.LJIIIZ(view, str);
        View findViewById = view.findViewById(i);
        o.LJIIIIZZ(findViewById, str2);
        return findViewById;
    }

    public static void LJFF(long j, long j2, HashMap hashMap, String str) {
        hashMap.put(str, String.valueOf(j - j2));
    }
}
