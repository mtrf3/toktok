package X;

import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;

/* renamed from: X.UyC, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final /* synthetic */ class C78920UyC {
    public static C188727au LIZJ(int i, String str) {
        C188727au c188727au = new C188727au();
        c188727au.LIZLLL(i, str);
        return c188727au;
    }

    public static String LIZ(char c, String str, char c2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(c);
        LIZ.append(str);
        LIZ.append(c2);
        return X1D.LIZIZ(LIZ);
    }

    public static void LIZLLL(int i, ActivityC45651qj activityC45651qj, int i2) {
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        creativeToastBuilder.messageRes(i);
        C78915Uy7.LJJIIZI(activityC45651qj, i2, creativeToastBuilder);
    }

    public static void LJ(long j, StringBuilder sb, String str) {
        sb.append((Object) C11850dJ.LJIIIIZZ(j));
        sb.append(str);
    }

    public static void LJI(String str, String str2, String str3) {
        BZI LIZ = C28787BRn.LIZ(str);
        LIZ.LJIJJ(str2, str3);
        LIZ.LJJIIJZLJL();
    }

    public static String LIZIZ(StringBuilder sb, Boolean bool, char c, StringBuilder sb2) {
        sb.append(bool);
        sb.append(c);
        return X1D.LIZIZ(sb2);
    }
}
