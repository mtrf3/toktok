package X;

import defpackage.a1;
import defpackage.i0;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XDN {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZIZ(String str, String str2) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(str);
        return C025908h.LIZIZ(LIZ2, C10820be.LIZ, "category_version", str2, LIZ2);
    }

    public static String LIZJ(String str, String str2) {
        return C0ON.LIZJ("effectchannel", str2, str, "checked");
    }

    public static String LIZLLL(String str, String str2) {
        return UPJ.LIZIZ("effectchannel", str2, str, "checked", "effect_version");
    }

    public static String LJIIIIZZ(String str, String str2) {
        return a1.LJ("effectchannel", str2, str);
    }

    public static String LIZ(String panel, String str, int i, int i2, int i3) {
        o.LJIIJ(panel, "panel");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(panel);
        LIZ2.append(C10820be.LIZ);
        LIZ2.append("effectchannel");
        LIZ2.append(str);
        LIZ2.append(i);
        C1EU.LIZJ(LIZ2, "_", i2, "_", i3);
        return X1D.LIZIZ(LIZ2);
    }

    public static String LJ(int i, int i2, String str, String panel, String str2, boolean z) {
        o.LJIIJ(panel, "panel");
        StringBuilder LIZ2 = X1D.LIZ();
        if (z) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(panel);
            LIZ3.append(str2);
            LIZ3.append(i);
            LIZ3.append(i2);
            panel = X1D.LIZIZ(LIZ3);
        }
        String LJFF = JBR.LJFF(LIZ2, panel, "checked", LIZ2);
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append(LJFF);
        return C025908h.LIZIZ(LIZ4, C10820be.LIZ, "effectchannel", str, LIZ4);
    }

    public static String LJFF(int i, int i2, String str, String panel, String str2, boolean z) {
        o.LJIIJ(panel, "panel");
        StringBuilder LIZ2 = X1D.LIZ();
        if (z) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(panel);
            LIZ3.append(str2);
            LIZ3.append(i);
            LIZ3.append(i2);
            panel = X1D.LIZIZ(LIZ3);
        }
        String LJFF = JBR.LJFF(LIZ2, panel, "checked", LIZ2);
        StringBuilder LIZ4 = X1D.LIZ();
        LIZ4.append(LJFF);
        YE1.LIZLLL(LIZ4, C10820be.LIZ, "effectchannel", str, "effect_version");
        return X1D.LIZIZ(LIZ4);
    }

    public static String LJI(int i, int i2, String str, String panel, String str2, boolean z) {
        o.LJIIJ(panel, "panel");
        if (z) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(panel);
            LIZ2.append(str2);
            LIZ2.append(i);
            LIZ2.append(i2);
            panel = X1D.LIZIZ(LIZ2);
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(panel);
        return C025908h.LIZIZ(LIZ3, C10820be.LIZ, "effectchannel", str, LIZ3);
    }

    public static String LJII(boolean z, String str, int i, String panel, String str2, int i2, int i3, String str3) {
        String LJFF;
        o.LJIIJ(panel, "panel");
        if (z) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(panel);
            LIZ2.append(str2);
            LIZ2.append(i);
            LIZ2.append(i2);
            LIZ2.append(i3);
            LJFF = JBR.LJFF(LIZ2, str3, "paging_checked", LIZ2);
        } else {
            LJFF = i0.LJFF(panel, "paging_checked");
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(LJFF);
        return C025908h.LIZIZ(LIZ3, C10820be.LIZ, "effectchannel", str, LIZ3);
    }
}
