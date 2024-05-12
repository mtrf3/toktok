package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.UWx, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final /* synthetic */ class C77339UWx {
    public static String LIZJ() {
        return C60903NvH.LJIIJJI().getAccountService().getCurrentUserID();
    }

    public static Integer LIZIZ(Integer num, int i) {
        return Integer.valueOf(num.intValue() + i);
    }

    public static C188727au LJ(ARN arn, String str) {
        o.LJIIIZ(arn, str);
        return new C188727au();
    }

    public static void LJFF(int i, C65403Plf c65403Plf) {
        c65403Plf.LJIJJ(Integer.valueOf(i));
        c65403Plf.LJFF();
    }

    public static int LIZ(List list, int i, int i2) {
        return (list.hashCode() + i) * i2;
    }

    public static String LIZLLL(String str, C9BD c9bd, String str2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append(c9bd);
        LIZ.append(str2);
        return X1D.LIZIZ(LIZ);
    }
}
