package X;

import com.ss.android.ugc.aweme.im.service.model.IMUser;

/* renamed from: X.3Jz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C82073Jz {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(IMUser iMUser, C3L4 c3l4) {
        long j;
        iMUser.setStickTop(c3l4.LJLLLL);
        iMUser.setType(1);
        if (iMUser.isStickTop()) {
            j = Math.max(c3l4.LJLJLJ, c3l4.LJLJL);
        } else {
            j = c3l4.LJLJLJ;
        }
        iMUser.setFriendRecTime(j);
        iMUser.setIsRecentContact(1);
    }
}
