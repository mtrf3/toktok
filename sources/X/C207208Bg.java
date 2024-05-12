package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: X.8Bg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C207208Bg {
    public static boolean LIZ(Context context, Aweme aweme, String str) {
        boolean LJIJI = AV1.LJIJI(aweme.getAuthorUid());
        if (!(context instanceof ActivityC45651qj)) {
            return false;
        }
        if ((C53326KwM.LIZ() || C211258Qv.LIZ()) && !LJIJI) {
            return false;
        }
        return C55723Ltv.LIZIZ.LJIJ().LJI(aweme, str);
    }
}
