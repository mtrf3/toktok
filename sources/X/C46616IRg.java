package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import defpackage.i0;
import java.io.File;

/* renamed from: X.IRg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C46616IRg {
    public static volatile Aweme LIZ;
    public static volatile int LIZIZ;
    public static volatile C46542IOk LIZJ = new C46542IOk();

    public static boolean LIZ(String str) {
        if (str == null) {
            return false;
        }
        String LIZ2 = IVT.LIZ(str);
        if (!new File(i0.LJFF(LIZ2, ".mdl")).exists() || !new File(i0.LJFF(LIZ2, ".mdlnodeconf")).exists()) {
            return false;
        }
        return true;
    }
}
