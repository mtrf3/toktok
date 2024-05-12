package X;

import android.content.Context;
import android.view.View;
import com.bytedance.assem.arch.core.UIAssem;
import java.util.HashSet;
import kotlin.jvm.internal.o;

/* renamed from: X.03c, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C012403c {
    public static int LIZ(Context context) {
        return context.getResources().getConfiguration().getLayoutDirection();
    }

    public static long LIZIZ(int i, long j, String str) {
        FFL.LJIIIZ().getClass();
        return FFL.LJIILIIL(i, j, str);
    }

    public static void LJ(String str, int i, String str2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append(i);
        C0NB.LIZIZ(str2, X1D.LIZIZ(LIZ));
    }

    public static View LIZJ(UIAssem uIAssem, String str, String str2, String str3) {
        o.LJIIIZ(uIAssem, str);
        o.LJIIIZ(str2, str3);
        return uIAssem.getContainerView();
    }

    public static String LIZLLL(String str, int i, String str2, String str3) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append(i);
        LIZ.append(str2);
        LIZ.append(str3);
        return X1D.LIZIZ(LIZ);
    }

    public static void LJFF(HashSet hashSet, String str, String str2, String str3, String str4) {
        hashSet.add(str);
        hashSet.add(str2);
        hashSet.add(str3);
        hashSet.add(str4);
    }
}
