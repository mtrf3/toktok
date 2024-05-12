package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import com.ss.android.ugc.aweme.profile.model.User;

/* renamed from: X.8Qc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C211068Qc {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct LIZ(com.ss.android.ugc.aweme.feed.model.Aweme r3) {
        /*
            r2 = 0
            if (r3 == 0) goto L1b
            com.ss.android.ugc.aweme.profile.model.User r0 = r3.getAuthor()
            if (r0 == 0) goto L1b
            com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct r1 = r0.getMatchedFriendStruct()
            if (r1 == 0) goto L1c
            java.lang.String r0 = r1.getRecType()
        L13:
            boolean r0 = X.C78685UuP.LJJJZ(r0)
            if (r0 == 0) goto L1a
            r2 = r1
        L1a:
            return r2
        L1b:
            r1 = r2
        L1c:
            r0 = r2
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C211068Qc.LIZ(com.ss.android.ugc.aweme.feed.model.Aweme):com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct");
    }

    public static String LIZIZ(Aweme aweme) {
        User author;
        MatchedFriendStruct matchedFriendStruct;
        String recType;
        if (aweme == null || (author = aweme.getAuthor()) == null || (matchedFriendStruct = author.getMatchedFriendStruct()) == null || (recType = matchedFriendStruct.getRecType()) == null) {
            return "";
        }
        return recType;
    }
}
