package X;

import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import o7a.i;
import p8.a;

/* renamed from: X.0Rv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C07670Rv {
    public static void LIZLLL(String str, boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append(z);
        X1D.LIZIZ(LIZ);
    }

    public static String LIZIZ(StringBuilder sb, String str, char c) {
        sb.append(str);
        sb.append(c);
        return sb.toString();
    }

    public static String LIZ(StringBuilder sb, double d, char c, StringBuilder sb2) {
        sb.append(d);
        sb.append(c);
        return X1D.LIZIZ(sb2);
    }

    public static void LJ(StringBuilder sb, Long l, StringBuilder sb2, String str) {
        sb.append(l);
        C0NB.LIZIZ(str, X1D.LIZIZ(sb2));
    }

    public static a.b LIZJ(String str, String str2, String str3, TuxIconView tuxIconView, LinearLayout.LayoutParams layoutParams, String str4, String str5) {
        new i();
        i.LIZ(str3, new a.b(str, str2), tuxIconView, layoutParams);
        return new a.b(str4, str5);
    }
}
