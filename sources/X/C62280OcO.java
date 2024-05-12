package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeACLShare;
import kotlin.jvm.internal.o;

/* renamed from: X.OcO, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62280OcO {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZIZ(Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        AwemeACLShare awemeACLShare = aweme.awemeACLShareInfo;
        if (awemeACLShare != null && awemeACLShare.getShareListStatus() == 0 && !AV1.LJIIJJI() && !aweme.isScheduleVideo()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d6, code lost:
    
        if (r6 != null) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List LIZ(com.ss.android.ugc.aweme.feed.model.Aweme r27, X.C62297Ocf r28, java.util.ArrayList r29) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62280OcO.LIZ(com.ss.android.ugc.aweme.feed.model.Aweme, X.Ocf, java.util.ArrayList):java.util.List");
    }
}
