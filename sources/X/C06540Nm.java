package X;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.0Nm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C06540Nm {
    public static Iterator LJ(HashMap hashMap, String str) {
        Collection values = hashMap.values();
        o.LJIIIIZZ(values, str);
        return values.iterator();
    }

    public static int LIZ(long j, int i, int i2) {
        return (C61876OQe.LIZJ(j) + i) * i2;
    }

    public static Integer LIZIZ(int i, int i2, String str, boolean z) {
        FFL.LJIIIZ().getClass();
        return Integer.valueOf(FFL.LJIIJ(i, i2, str, z));
    }

    public static String LIZJ(StringBuilder sb, InterfaceC65784Pro interfaceC65784Pro, char c, StringBuilder sb2) {
        sb.append(interfaceC65784Pro);
        sb.append(c);
        return X1D.LIZIZ(sb2);
    }

    public static StringBuilder LIZLLL(String str, String str2, String str3, String str4, String str5) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append(str2);
        LIZ.append(str3);
        LIZ.append(str4);
        LIZ.append(str5);
        return LIZ;
    }

    public static void LJFF(C29374Bfu c29374Bfu, BZI bzi, String str, String str2, String str3) {
        bzi.LJIJJ(Long.valueOf(c29374Bfu.getCurrentUserId()), str);
        bzi.LJIJJ(str2, str3);
    }
}
