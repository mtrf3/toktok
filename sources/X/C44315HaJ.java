package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.jvm.internal.o;

/* renamed from: X.HaJ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44315HaJ {
    public static boolean LIZ(ShortVideoContext shortVideoContext) {
        boolean LJ = o.LJ(shortVideoContext.enterMethod, "click_plus");
        C78934UyQ.LJLIL.LIZLLL().getClass();
        boolean LIZIZ = L95.LIZIZ();
        boolean z = !TextUtils.equals(shortVideoContext.enterFrom, "from_duet_mode");
        boolean z2 = !shortVideoContext.LJJJI();
        if (LJ && LIZIZ && z && z2) {
            return true;
        }
        return false;
    }
}
