package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;

/* renamed from: X.9Z2, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9Z2 {
    public static boolean LIZ(Aweme aweme) {
        if (aweme == null) {
            return false;
        }
        C77413UZt.LJIIZILJ();
        if (C63081OpJ.LLIIIJ(aweme)) {
            return true;
        }
        User author = aweme.getAuthor();
        if (author == null || !author.isLive() || !UC0.LJJLI() || author.isBlock() || AV1.LJIIJJI()) {
            return false;
        }
        return true;
    }
}
