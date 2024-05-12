package com.ss.android.ugc.aweme.profile.ui.v2;

import X.C235099Kn;
import X.C237369Tg;
import X.C36636EZk;
import X.C48841JEv;
import X.C58096Mr6;
import X.C63942f8;
import X.C63952f9;
import X.C63972fB;
import X.C64912gh;
import X.HG3;
import X.XKX;
import android.util.LruCache;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.profile.util.IUserProfilePreload;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class UserProfilePreloadHelper implements IUserProfilePreload {
    public String LIZ = HG3.LJIILL().getCurUserId();
    public boolean LIZIZ = true;

    public static IUserProfilePreload LJIIIIZZ() {
        Object LIZ = C58096Mr6.LIZ(IUserProfilePreload.class, false);
        if (LIZ != null) {
            return (IUserProfilePreload) LIZ;
        }
        if (C58096Mr6.e4 == null) {
            synchronized (IUserProfilePreload.class) {
                if (C58096Mr6.e4 == null) {
                    C58096Mr6.e4 = new UserProfilePreloadHelper();
                }
            }
        }
        return C58096Mr6.e4;
    }

    @Override // com.ss.android.ugc.aweme.profile.util.IUserProfilePreload
    public final void LJI() {
        ((List) C64912gh.LIZJ.getValue()).clear();
    }

    @Override // com.ss.android.ugc.aweme.profile.util.IUserProfilePreload
    public final void clearCache() {
        ((List) C64912gh.LIZJ.getValue()).clear();
        ((LruCache) C64912gh.LIZIZ.getValue()).evictAll();
        C63972fB LIZIZ = C64912gh.LIZIZ();
        LIZIZ.getClass();
        XKX.LIZLLL(C48841JEv.LIZ(C36636EZk.LIZ), null, null, new C63952f9(LIZIZ, null), 3);
        if (C235099Kn.LIZ()) {
            ((LruCache) C237369Tg.LIZJ.getValue()).evictAll();
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.util.IUserProfilePreload
    public final boolean LIZIZ() {
        return this.LIZIZ;
    }

    public static boolean LJIIIZ(User user) {
        if (user == null) {
            return false;
        }
        if ((!user.isAccuratePrivateAccount() || user.getFollowStatus() >= 1) && !user.isBlocked() && !user.isBlock) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.profile.util.IUserProfilePreload
    public final void LIZ(User user) {
        o.LJIIIZ(user, "user");
        if (!LJIIIZ(user)) {
            ((LruCache) C64912gh.LIZIZ.getValue()).put(user.getUid(), user);
        }
    }

    @Override // com.ss.android.ugc.aweme.profile.util.IUserProfilePreload
    public final void LIZJ(User user) {
        o.LJIIIZ(user, "user");
        ((List) C64912gh.LIZJ.getValue()).add(user);
    }

    @Override // com.ss.android.ugc.aweme.profile.util.IUserProfilePreload
    public final void LIZLLL(boolean z) {
        this.LIZIZ = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0094, code lost:
    
        if (r4 != null) goto L16;
     */
    @Override // com.ss.android.ugc.aweme.profile.util.IUserProfilePreload
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.ss.android.ugc.aweme.profile.model.User LJ(java.lang.String r11) {
        /*
            r10 = this;
            r9 = 0
            if (r11 != 0) goto L4
            return r9
        L4:
            java.lang.String r1 = r10.LIZ
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.HG3.LJIILL()
            X.RBX r0 = (X.RBX) r0
            java.lang.String r0 = r0.getCurUserId()
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 != 0) goto L25
            r10.clearCache()
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.HG3.LJIILL()
            X.RBX r0 = (X.RBX) r0
            java.lang.String r0 = r0.getCurUserId()
            r10.LIZ = r0
        L25:
            com.ss.android.ugc.aweme.profile.model.User r4 = X.C64912gh.LIZ(r11)
            r5 = 0
            r3 = 1
            if (r4 == 0) goto L52
            int r0 = r4.getFollowerCount()
            if (r0 != 0) goto L97
            r0 = 1
        L34:
            r8 = -1
            if (r0 == 0) goto L94
            r4.setFollowerCount(r8)
        L3a:
            int r0 = r4.getFollowingCount()
            if (r0 != 0) goto L43
            r4.setFollowingCount(r8)
        L43:
            long r6 = r4.getTotalFavorited()
            r1 = 0
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 != 0) goto L86
        L4d:
            r0 = -1
            r4.setTotalFavorited(r0)
        L52:
            X.Ol8 r2 = X.C64912gh.LIZIZ
            java.lang.Object r0 = r2.getValue()
            android.util.LruCache r0 = (android.util.LruCache) r0
            java.lang.Object r1 = r0.get(r11)
            com.ss.android.ugc.aweme.profile.model.User r1 = (com.ss.android.ugc.aweme.profile.model.User) r1
            if (r1 == 0) goto L83
            boolean r0 = LJIIIZ(r4)
            if (r0 == 0) goto L7f
            java.lang.Object r0 = r2.getValue()
            android.util.LruCache r0 = (android.util.LruCache) r0
            r0.remove(r11)
            boolean r0 = X.C3IN.LIZ()
            if (r0 != 0) goto L7b
            int r0 = X.C3H7.LIZ
            if (r0 != r3) goto L7e
        L7b:
            r10.LIZIZ = r3
        L7d:
            r9 = r4
        L7e:
            return r9
        L7f:
            r10.LIZIZ = r5
            r9 = r1
            goto L7e
        L83:
            r10.LIZIZ = r3
            goto L7d
        L86:
            int r0 = r4.getFollowerCount()
            if (r0 != r8) goto L8d
            goto L4d
        L8d:
            int r0 = r4.getFollowingCount()
            if (r0 != r8) goto L52
            goto L4d
        L94:
            if (r4 == 0) goto L52
            goto L3a
        L97:
            r0 = 0
            goto L34
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.profile.ui.v2.UserProfilePreloadHelper.LJ(java.lang.String):com.ss.android.ugc.aweme.profile.model.User");
    }

    @Override // com.ss.android.ugc.aweme.profile.util.IUserProfilePreload
    public final void LJFF(String key, String str) {
        o.LJIIIZ(key, "key");
        C63972fB LIZIZ = C64912gh.LIZIZ();
        LIZIZ.getClass();
        XKX.LIZLLL(C48841JEv.LIZ(C36636EZk.LIZ), null, null, new C63942f8(LIZIZ, null), 3);
        LIZIZ.LIZIZ().put(key, str);
    }

    @Override // com.ss.android.ugc.aweme.profile.util.IUserProfilePreload
    public final File LJII(User user, String key) {
        String uid;
        User LJ;
        o.LJIIIZ(key, "key");
        if (user == null || (uid = user.getUid()) == null || (LJ = LJ(uid)) == null || LJIIIZ(LJ) || C64912gh.LIZJ(uid) == null) {
            return null;
        }
        return C64912gh.LIZJ(key);
    }
}
