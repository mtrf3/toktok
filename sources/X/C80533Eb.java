package X;

import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.social.model.MAFIMUser;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3Eb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C80533Eb {
    public static final C80533Eb LIZ = new C80533Eb();
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C80553Ed.LJLIL);
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C80563Ee.LJLIL);
    public static final C62822Ol8 LIZLLL = C221108m2.LIZIZ(C80583Eg.LJLIL);
    public static C64962gm LJ = C48841JEv.LIZ(C78613UtF.LIZJ.plus(T2R.LJIIJJI()));
    public static final C62822Ol8 LJFF = C221108m2.LIZIZ(C80593Eh.LJLIL);
    public static final C62822Ol8 LJI = C221108m2.LIZIZ(C80573Ef.LJLIL);

    public static final void LIZ() {
        LIZ.getClass();
        ((C0M6) LIZIZ.getValue()).LJIIIIZZ(-1);
        ((C0M6) LIZJ.getValue()).LJIIIIZZ(-1);
        C48841JEv.LIZJ(LJ, null);
        LJ = C48841JEv.LIZ(C78613UtF.LIZJ.plus(T2R.LJIIJJI()));
    }

    public static java.util.Set LIZJ() {
        return (java.util.Set) LJI.getValue();
    }

    public static java.util.Set LIZLLL() {
        return (java.util.Set) LIZLLL.getValue();
    }

    public static java.util.Set LJ() {
        return (java.util.Set) LJFF.getValue();
    }

    public static final IMUser LJIIL(String str) {
        boolean z;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C34B.LJI("IMUserRepository", "Could not get user because both uid are null");
            return null;
        }
        if (str == null || str.length() == 0) {
            return null;
        }
        LIZ.getClass();
        IMUser LJIIIIZZ = LJIIIIZZ(str, false);
        if (LJIIIIZZ == null) {
            C80523Ea.LIZIZ("lru");
            C34B.LJI("IMUserRepository", "User does not exist in cache");
        }
        return LJIIIIZZ;
    }

    public static void LJIILLIIL(IMUser user) {
        o.LJIIIZ(user, "user");
        String secUid = user.getSecUid();
        if (secUid != null && secUid.length() != 0) {
            ((C0M6) LIZIZ.getValue()).LIZJ(user.getSecUid(), user);
        }
        String uid = user.getUid();
        if (uid == null || uid.length() == 0 || o.LJ(user.getUid(), "-1")) {
            return;
        }
        ((C0M6) LIZJ.getValue()).LIZJ(user.getUid(), user);
    }

    public static final IMUser LJFF(String str, String str2) {
        boolean z;
        boolean z2;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && (str2 == null || str2.length() == 0)) {
            C34B.LJI("IMUserRepository", "Could not get user because both uid are null");
            return null;
        }
        if (str == null || str.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            LIZ.getClass();
            IMUser LJIIIIZZ = LJIIIIZZ(str, true);
            if (LJIIIIZZ == null) {
                C80523Ea.LIZIZ("db");
                C34B.LJI("IMUserRepository", "User does not exist in local");
            }
            return LJIIIIZZ;
        }
        if (str2 == null || str2.length() == 0) {
            C80523Ea.LIZIZ("db");
            C34B.LJI("IMUserRepository", "User does not exist in local");
            return null;
        }
        LIZ.getClass();
        IMUser LJII = LJII(str2, true);
        if (LJII == null) {
            C80523Ea.LIZIZ("db");
            C34B.LJI("IMUserRepository", "User does not exist in local");
        }
        return LJII;
    }

    public static IMUser LJII(String str, boolean z) {
        IMUser iMUser = (IMUser) ((C0M6) LIZIZ.getValue()).LIZIZ(str);
        if (iMUser != null) {
            C80523Ea.LIZ("lru");
            C34B.LIZIZ("IMUserRepository", "getLocalUserWithSecUid in cache");
            return iMUser;
        }
        if (!z) {
            C34B.LIZIZ("IMUserRepository", "getLocalUserWithUid, miss in cache");
            return null;
        }
        IMUser LJII = C80853Fh.LJ().LJII(str);
        if (LJII != null) {
            C80523Ea.LIZ("db");
            C34B.LIZIZ("IMUserRepository", "getLocalUserWithSecUid in db");
            LJIILLIIL(LJII);
            return LJII;
        }
        C34B.LIZIZ("IMUserRepository", "getLocalUsgetLocalUserWithSecUiderWithUid in none");
        return null;
    }

    public static IMUser LJIIIIZZ(String str, boolean z) {
        IMUser iMUser = (IMUser) ((C0M6) LIZJ.getValue()).LIZIZ(str);
        if (iMUser != null) {
            C80523Ea.LIZ("lru");
            C34B.LIZIZ("IMUserRepository", "getLocalUserWithUid in cache");
            return iMUser;
        }
        if (!z) {
            C34B.LIZIZ("IMUserRepository", "getLocalUserWithUid, miss in cache");
            return null;
        }
        IMUser LJIIL = C80853Fh.LJ().LJIIL(str);
        if (LJIIL != null) {
            C80523Ea.LIZ("db");
            C34B.LIZIZ("IMUserRepository", "getLocalUserWithUid in db");
            LJIILLIIL(LJIIL);
            return LJIIL;
        }
        C785836o.LIZ().getClass();
        MAFIMUser LIZIZ2 = C3FW.LIZIZ(str);
        if (LIZIZ2 != null) {
            C80523Ea.LIZ("db");
            C34B.LIZIZ("IMUserRepository", "getLocalUserWithUid in MAF db");
            LJIILLIIL(LIZIZ2);
            return LIZIZ2;
        }
        C34B.LIZIZ("IMUserRepository", "getLocalUserWithUid in none");
        return null;
    }

    public static IMUser LJIIIZ(String str, String str2) {
        if (str != null) {
            LIZ.getClass();
            IMUser iMUser = (IMUser) ((C0M6) LIZJ.getValue()).LIZIZ(str);
            if (iMUser != null) {
                return iMUser;
            }
        }
        if (str2 != null) {
            LIZ.getClass();
            return (IMUser) ((C0M6) LIZIZ.getValue()).LIZIZ(str2);
        }
        return null;
    }

    public static final IMUser LJIIJ(String str, String str2) {
        boolean z;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && (str2 == null || str2.length() == 0)) {
            return null;
        }
        if (o.LJ(str, "-1") && str2 == null) {
            return null;
        }
        IMUser LJFF2 = LJFF(str, str2);
        if (LJFF2 != null) {
            return LJFF2;
        }
        LIZ.getClass();
        LIZIZ(str, str2, null, null);
        return null;
    }

    public static final void LJI(String str, String str2, C3EU c3eu) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("getLocalUserWithDBAsync uid=");
        LIZ2.append(str);
        LIZ2.append(" and secId=");
        LIZ2.append(str2);
        C34B.LJI("IMUserRepository", X1D.LIZIZ(LIZ2));
        XKX.LIZLLL(LJ, null, null, new C3EY(str, str2, c3eu, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x00f7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List LJIILL(java.lang.String r15, java.util.List r16, boolean r17) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80533Eb.LJIILL(java.lang.String, java.util.List, boolean):java.util.List");
    }

    public static void LIZIZ(String str, String str2, C3EU c3eu, IMUser iMUser) {
        String msg = C0ON.LIZJ("Fetch user with uid=", str, " and secId=", str2);
        o.LJIIIZ(msg, "msg");
        if ((str == null || str.length() == 0) && (str2 == null || str2.length() == 0)) {
            if (c3eu != null) {
                c3eu.LIZIZ(new IllegalArgumentException("Query user with empty uid and sec uid"));
                return;
            }
            return;
        }
        synchronized (LJ()) {
            if (c3eu == null) {
                LIZ.getClass();
                if (ORZ.LJLJJI(str, LJ())) {
                    return;
                }
            }
            if (str != null) {
                LIZ.getClass();
                LJ().add(str);
            }
            synchronized (LIZLLL()) {
                if (c3eu == null) {
                    LIZ.getClass();
                    if (ORZ.LJLJJI(str2, LIZLLL())) {
                        return;
                    }
                }
                if (str2 != null) {
                    LIZ.getClass();
                    LIZLLL().add(str2);
                }
                XKX.LIZLLL(LJ, null, null, new C3ER(str, str2, iMUser, c3eu, null), 3);
            }
        }
    }

    public static final void LJIIJJI(String str, String str2, boolean z, C3EU c3eu) {
        if ((str == null || str.length() == 0) && (str2 == null || str2.length() == 0)) {
            if (c3eu != null) {
                c3eu.LIZIZ(new IllegalArgumentException("Query user with empty uid and sec uid"));
                return;
            }
            return;
        }
        if (o.LJ(str, "-1") && (str2 == null || str2.length() == 0)) {
            if (c3eu != null) {
                c3eu.LIZIZ(new IllegalArgumentException("Query user with invalid uid and sec uid"));
                return;
            }
            return;
        }
        IMUser LJFF2 = LJFF(str, str2);
        if (z || LJFF2 == null) {
            LIZ.getClass();
            LIZIZ(str, str2, c3eu, LJFF2);
        } else {
            if (c3eu == null) {
                return;
            }
            c3eu.LIZ(LJFF2);
        }
    }

    public static final Object LJIIZILJ(IMUser iMUser, IMUser iMUser2, C80483Dw c80483Dw, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        Object LJIIIIZZ;
        C78841Uwv.LJJJJL(iMUser, c80483Dw, iMUser2);
        LIZ.getClass();
        LJIILLIIL(iMUser);
        C2U8.LIZ(new C39R(iMUser.getUid(), iMUser.getSecUid(), iMUser));
        if (C76917UGr.LJJJJJL(iMUser)) {
            LJIIIIZZ = C76800UCe.LIZ;
        } else {
            LJIIIIZZ = C80853Fh.LJ().LJIIIIZZ(C47261Igj.LJJIJ(iMUser), interfaceC67352kd);
            if (LJIIIIZZ != EnumC58928NAu.COROUTINE_SUSPENDED) {
                LJIIIIZZ = C76800UCe.LIZ;
            }
        }
        if (LJIIIIZZ == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LJIIIIZZ;
        }
        return C76800UCe.LIZ;
    }

    public static /* synthetic */ Object LJIJ(IMUser iMUser, C80483Dw c80483Dw, InterfaceC67352kd interfaceC67352kd, int i) {
        IMUser iMUser2;
        if ((i & 2) != 0) {
            iMUser2 = LJFF(iMUser.getUid(), iMUser.getSecUid());
        } else {
            iMUser2 = null;
        }
        if ((i & 4) != 0) {
            c80483Dw = new C80483Dw(false, false, 3);
        }
        return LJIIZILJ(iMUser, iMUser2, c80483Dw, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01b9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0144 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILIIL(java.util.List<X.OSZ<java.lang.String, java.lang.String>> r18, X.InterfaceC80883Fk r19, boolean r20, boolean r21, X.InterfaceC67352kd<? super java.util.List<? extends com.ss.android.ugc.aweme.im.service.model.IMUser>> r22) {
        /*
            Method dump skipped, instructions count: 538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80533Eb.LJIILIIL(java.util.List, X.3Fk, boolean, boolean, X.2kd):java.lang.Object");
    }

    public static /* synthetic */ Object LJIILJJIL(C80533Eb c80533Eb, List list, InterfaceC80883Fk interfaceC80883Fk, boolean z, InterfaceC67352kd interfaceC67352kd, int i) {
        boolean z2;
        InterfaceC80883Fk interfaceC80883Fk2 = interfaceC80883Fk;
        boolean z3 = z;
        if ((i & 2) != 0) {
            interfaceC80883Fk2 = C80853Fh.LJ();
        }
        if ((i & 4) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i & 8) != 0) {
            z3 = false;
        }
        return c80533Eb.LJIILIIL(list, interfaceC80883Fk2, z2, z3, interfaceC67352kd);
    }
}
