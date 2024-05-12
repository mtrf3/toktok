package X;

import android.os.Bundle;
import com.bytedance.jedi.arch.JediViewModel;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* renamed from: X.0JT, reason: invalid class name */
/* loaded from: classes.dex */
public final /* synthetic */ class C0JT {
    public static JediViewModel LIZIZ(ActivityC45651qj activityC45651qj, Class cls, String str) {
        JediViewModel LIZ = C165616ej.LIZ(activityC45651qj).LIZ(cls);
        o.LJIIIIZZ(LIZ, str);
        return LIZ;
    }

    public static void LIZLLL(int[] iArr, StringBuilder sb, String str) {
        sb.append(Arrays.toString(iArr));
        sb.append(str);
    }

    public static Bundle LIZ(String str, boolean z, String str2, boolean z2) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(str, z);
        bundle.putBoolean(str2, z2);
        return bundle;
    }

    public static void LIZJ(BZI bzi, String str, String str2, int i, String str3) {
        bzi.LJIJJ(str, str2);
        bzi.LJIJJ(Integer.valueOf(i), str3);
        bzi.LJJIIJZLJL();
    }
}
