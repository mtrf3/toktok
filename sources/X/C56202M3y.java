package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.o;

/* renamed from: X.M3y, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56202M3y {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x0006. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0133 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0109 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b0 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e0 A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LIZ(java.lang.String r1) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56202M3y.LIZ(java.lang.String):int");
    }

    public static int LIZIZ(Aweme aweme, String str) {
        User author;
        if (o.LJ(str, "share_user_info_card") || (aweme != null && aweme.getSharer() != null)) {
            return 21;
        }
        if (o.LJ(str, "others_homepage")) {
            return 19;
        }
        if (aweme != null && (author = aweme.getAuthor()) != null && C221038lv.LIZ(author)) {
            return 20;
        }
        if (o.LJ(str, "homepage_hot")) {
            return 13;
        }
        return 18;
    }
}
