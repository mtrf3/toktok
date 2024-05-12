package X;

import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.o;

/* renamed from: X.0Nh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C06490Nh {
    public static float LIZ(float f, float f2, float f3, float f4, float f5, float f6) {
        return (f * f2 * f3 * f4 * f5) + f6;
    }

    public static StringBuilder LIZJ(String str, String str2, String str3, long j) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append(str2);
        LIZ.append(str3);
        LIZ.append(j);
        return LIZ;
    }

    public static View LIZIZ(ViewGroup viewGroup, String str, int i, ViewGroup viewGroup2, boolean z) {
        o.LJIIIZ(viewGroup, str);
        return C16880lQ.LLLLIILL(C16880lQ.LLZIL(viewGroup.getContext()), i, viewGroup2, z);
    }

    public static void LIZLLL(BZI bzi, String str, String str2, String str3, String str4) {
        bzi.LJIJJ(str, str2);
        bzi.LJIJJ(str3, str4);
        bzi.LJJIIJZLJL();
    }
}
