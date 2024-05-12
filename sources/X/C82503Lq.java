package X;

import com.ss.android.ugc.aweme.im.service.model.IMUser;
import kotlin.jvm.internal.o;

/* renamed from: X.3Lq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C82503Lq {
    public static boolean LIZ(IMUser iMUser, C3L4 session) {
        boolean z;
        boolean z2;
        o.LJIIIZ(session, "session");
        if (iMUser != null) {
            z = iMUser.isBlock();
        } else {
            z = false;
        }
        if (session.LJIIJ() && session.LL) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!AnonymousClass304.LIZIZ() || session.LJLLI == 0 || z || z2) {
            return false;
        }
        return true;
    }
}
