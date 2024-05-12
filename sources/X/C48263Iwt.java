package X;

import java.util.HashSet;
import kotlin.jvm.internal.o;

/* renamed from: X.Iwt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C48263Iwt {
    public static boolean LIZ(C1M2 c1m2, InterfaceC88472Yns predicate) {
        o.LJIIIZ(predicate, "predicate");
        return ((Boolean) predicate.invoke(c1m2)).booleanValue();
    }

    public static String LIZIZ(String str, int i, String str2, int i2) {
        return str + i + str2 + i2;
    }

    public static String LIZLLL(String str, int i, String str2, int i2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append(i);
        LIZ.append(str2);
        LIZ.append(i2);
        return X1D.LIZIZ(LIZ);
    }

    public static void LIZJ(HashSet hashSet, String str, String str2, HashSet hashSet2, String str3) {
        hashSet.add(str);
        hashSet.add(str2);
        hashSet2.add(str3);
    }
}
