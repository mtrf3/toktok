package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import defpackage.q;
import ujb.s;

/* renamed from: X.2Os, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C57822Os {
    public static String LIZ = "";

    public static final boolean LIZ(Aweme aweme) {
        String str;
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = null;
        }
        if (str == null) {
            return false;
        }
        String str2 = LIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(',');
        LIZ2.append(aweme.getAid());
        return s.LJJJLZIJ(str2, X1D.LIZIZ(LIZ2), false);
    }

    public static final void LIZIZ(Aweme aweme) {
        if (aweme != null && aweme.getAid() != null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(aweme.getAid());
            LIZ2.append(',');
            LIZ2.append(LIZ);
            LIZ = X1D.LIZIZ(LIZ2);
        }
    }

    public static final void LIZJ(String str) {
        if (str != null) {
            StringBuilder LJFF = C72972SkS.LJFF(str, ',');
            LIZ = q.LIZIZ(LJFF, LIZ, ',', LJFF);
        }
    }
}
