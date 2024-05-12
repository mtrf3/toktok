package X;

import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.platform.base.data.ProfileUser;

/* renamed from: X.9Tg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C237369Tg {
    public static String LIZ = ((RBX) HG3.LJIILL()).getCurUserId();
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C237389Ti.LJLIL);
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C237379Th.LJLIL);
    public static final C62822Ol8 LIZLLL = C221108m2.LIZIZ(C237359Tf.LJLIL);

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e3, code lost:
    
        if (r1 != null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.profile.platform.base.data.ProfileUser LIZ(java.lang.String r10) {
        /*
            r9 = 0
            if (r10 != 0) goto L4
            return r9
        L4:
            java.lang.String r1 = X.C237369Tg.LIZ
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.HG3.LJIILL()
            X.RBX r0 = (X.RBX) r0
            java.lang.String r0 = r0.getCurUserId()
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 != 0) goto L2d
            X.Ol8 r0 = X.C237369Tg.LIZIZ
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.profile.util.IUserProfilePreload r0 = (com.ss.android.ugc.aweme.profile.util.IUserProfilePreload) r0
            r0.clearCache()
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.HG3.LJIILL()
            X.RBX r0 = (X.RBX) r0
            java.lang.String r0 = r0.getCurUserId()
            X.C237369Tg.LIZ = r0
        L2d:
            com.ss.android.ugc.aweme.profile.model.User r1 = X.C64912gh.LIZ(r10)
            r5 = 0
            r2 = 1
            if (r1 == 0) goto L5a
            int r0 = r1.getFollowerCount()
            if (r0 != 0) goto Le7
            r0 = 1
        L3c:
            r8 = -1
            if (r0 == 0) goto Le3
            r1.setFollowerCount(r8)
        L42:
            int r0 = r1.getFollowingCount()
            if (r0 != 0) goto L4b
            r1.setFollowingCount(r8)
        L4b:
            long r6 = r1.getTotalFavorited()
            r3 = 0
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 != 0) goto Ld3
        L55:
            r3 = -1
            r1.setTotalFavorited(r3)
        L5a:
            X.Ol8 r4 = X.C237369Tg.LIZJ
            java.lang.Object r0 = r4.getValue()
            android.util.LruCache r0 = (android.util.LruCache) r0
            java.lang.Object r3 = r0.get(r10)
            com.ss.android.ugc.profile.platform.base.data.ProfileUser r3 = (com.ss.android.ugc.profile.platform.base.data.ProfileUser) r3
            if (r3 == 0) goto Lbb
            if (r1 == 0) goto Lae
            boolean r0 = r1.isAccuratePrivateAccount()
            if (r0 != r2) goto L78
            int r0 = r1.getFollowStatus()
            if (r0 < r2) goto L7e
        L78:
            boolean r0 = r1.isBlocked()
            if (r0 != r2) goto La9
        L7e:
            java.lang.Object r0 = r4.getValue()
            android.util.LruCache r0 = (android.util.LruCache) r0
            r0.remove(r10)
            boolean r0 = X.C3IN.LIZ()
            if (r0 != 0) goto L91
            int r0 = X.C3H7.LIZ
            if (r0 != r2) goto La8
        L91:
            X.Ol8 r0 = X.C237369Tg.LIZIZ
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.profile.util.IUserProfilePreload r0 = (com.ss.android.ugc.aweme.profile.util.IUserProfilePreload) r0
            r0.LIZLLL(r2)
            X.Ol8 r0 = X.C237369Tg.LIZLLL
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.profile.platform.base.data.ProfileUser r0 = (com.ss.android.ugc.profile.platform.base.data.ProfileUser) r0
            com.ss.android.ugc.profile.platform.base.data.ProfileUser r9 = LIZIZ(r1, r0)
        La8:
            return r9
        La9:
            boolean r0 = r1.isBlock
            if (r0 != r2) goto Lae
            goto L7e
        Lae:
            X.Ol8 r0 = X.C237369Tg.LIZIZ
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.profile.util.IUserProfilePreload r0 = (com.ss.android.ugc.aweme.profile.util.IUserProfilePreload) r0
            r0.LIZLLL(r5)
            r9 = r3
            goto La8
        Lbb:
            X.Ol8 r0 = X.C237369Tg.LIZIZ
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.profile.util.IUserProfilePreload r0 = (com.ss.android.ugc.aweme.profile.util.IUserProfilePreload) r0
            r0.LIZLLL(r2)
            X.Ol8 r0 = X.C237369Tg.LIZLLL
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.profile.platform.base.data.ProfileUser r0 = (com.ss.android.ugc.profile.platform.base.data.ProfileUser) r0
            com.ss.android.ugc.profile.platform.base.data.ProfileUser r9 = LIZIZ(r1, r0)
            goto La8
        Ld3:
            int r0 = r1.getFollowerCount()
            if (r0 != r8) goto Ldb
            goto L55
        Ldb:
            int r0 = r1.getFollowingCount()
            if (r0 != r8) goto L5a
            goto L55
        Le3:
            if (r1 == 0) goto L5a
            goto L42
        Le7:
            r0 = 0
            goto L3c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C237369Tg.LIZ(java.lang.String):com.ss.android.ugc.profile.platform.base.data.ProfileUser");
    }

    public static ProfileUser LIZIZ(User user, ProfileUser profileUser) {
        try {
            return C244699iz.LJIIIZ(user, profileUser, false, C237399Tj.LJLIL);
        } catch (Exception e) {
            C237259Sv.LJ(e, C244699iz.LIZIZ);
            return C237409Tk.LIZIZ;
        }
    }
}
