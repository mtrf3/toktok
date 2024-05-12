package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.7tf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C200357tf {
    public static boolean LIZ(Aweme aweme) {
        boolean z;
        o.LJIIIZ(aweme, "aweme");
        boolean LJFF = C80S.LJFF(aweme);
        if (aweme.getAuthor() != null && C38354F3m.LIZJ(((RBX) HG3.LJIILL()).getCurUserId(), aweme.getAuthor().getUid())) {
            z = true;
        } else {
            z = false;
        }
        if (!LJFF || !z) {
            return false;
        }
        return true;
    }
}
