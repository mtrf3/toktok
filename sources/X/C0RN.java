package X;

import java.util.HashMap;

/* renamed from: X.0RN, reason: invalid class name */
/* loaded from: classes.dex */
public final /* synthetic */ class C0RN {
    public static int LIZ() {
        if (C33949DUb.LIZIZ()) {
            return 1;
        }
        return 16777215;
    }

    public static EnumC36103EEx LIZIZ(EE1 ee12) {
        EFK type = ee12.type();
        if (type.equals(EFK.BOOT_FINISH)) {
            if (C34582Dhi.LIZJ(ee12.key())) {
                type = EFK.IDLE;
            } else if (C34582Dhi.LIZ(ee12.key())) {
                type = EFK.APP_BACKGROUND;
            }
        }
        return (EnumC36103EEx) ((HashMap) EF2.LIZIZ.LIZ).get(type);
    }

    public static void LIZLLL(String str, boolean z, String str2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append(z);
        C0NB.LJIIIZ(str2, X1D.LIZIZ(LIZ));
    }

    public static C188727au LIZJ(int i, String str, int i2, String str2) {
        C188727au c188727au = new C188727au();
        c188727au.LIZLLL(i, str);
        c188727au.LIZLLL(i2, str2);
        return c188727au;
    }

    public static void LJ(StringBuilder sb, long j, StringBuilder sb2, String str) {
        sb.append(j);
        C0NB.LJIIIZ(str, X1D.LIZIZ(sb2));
    }
}
