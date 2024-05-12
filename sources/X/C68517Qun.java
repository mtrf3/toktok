package X;

import Y.IDComparatorS39S0000000_11;
import android.text.TextUtils;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.account.login.model.AccountPassLoginMethod;
import com.ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.ss.android.ugc.aweme.account.login.model.CommonUserInfo;
import com.ss.android.ugc.aweme.account.login.model.LoginMethodName;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.user.SignificantUserInfo;
import com.ss.android.ugc.aweme.user.UserStore;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS177S0100000_11;
import kotlin.jvm.internal.AqS34S1000000_11;
import kotlin.jvm.internal.o;

/* renamed from: X.Qun, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68517Qun {
    public static final C68517Qun LIZ = new C68517Qun();
    public static final C68518Quo LIZIZ;
    public static List<BaseLoginMethod> LIZJ;
    public static final MutableLiveData<EnumC68524Quu> LIZLLL;
    public static boolean LJ;
    public static final long LJFF;

    public final synchronized boolean LJII() {
        boolean z;
        List<BaseLoginMethod> list = LIZJ;
        z = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (BaseLoginMethod baseLoginMethod : list) {
                if (!TextUtils.isEmpty(baseLoginMethod.getUid())) {
                    Boolean isFromReInstallNet = baseLoginMethod.isFromReInstallNet();
                    Boolean bool = Boolean.TRUE;
                    if (!o.LJ(isFromReInstallNet, bool) || o.LJ(baseLoginMethod.isTransToNormal(), bool)) {
                        z = true;
                        break;
                    }
                }
            }
        }
        return z;
    }

    public final synchronized boolean LJIIIIZZ() {
        boolean z;
        z = false;
        if (C53262KvK.LIZIZ() && LIZLLL.getValue() != EnumC68524Quu.NOT_READY) {
            List<BaseLoginMethod> list = LIZJ;
            if (!(list instanceof Collection) || !((ArrayList) list).isEmpty()) {
                Iterator it = ((ArrayList) list).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    BaseLoginMethod baseLoginMethod = (BaseLoginMethod) it.next();
                    if (!TextUtils.isEmpty(baseLoginMethod.getUid()) && baseLoginMethod.m102isOneClickLogin()) {
                        z = true;
                        break;
                    }
                }
            }
        }
        return z;
    }

    public final synchronized boolean LJIIIZ() {
        boolean z;
        List<BaseLoginMethod> list = LIZJ;
        z = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<BaseLoginMethod> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (o.LJ(it.next().isFromReInstallNet(), Boolean.TRUE)) {
                    z = true;
                    break;
                }
            }
        }
        return z;
    }

    public final synchronized boolean LJIIJ() {
        boolean z;
        String oneClickLoginToken;
        z = true;
        if (C53262KvK.LIZ() != 0) {
            List<BaseLoginMethod> list = LIZJ;
            if (!(list instanceof Collection) || !((ArrayList) list).isEmpty()) {
                Iterator it = ((ArrayList) list).iterator();
                while (it.hasNext()) {
                    BaseLoginMethod baseLoginMethod = (BaseLoginMethod) it.next();
                    if (o.LJ(baseLoginMethod.getUid(), R41.LIZLLL()) && o.LJ(baseLoginMethod.isOneClickLogin(), Boolean.TRUE) && (oneClickLoginToken = baseLoginMethod.getOneClickLoginToken()) != null && oneClickLoginToken.length() != 0) {
                        break;
                    }
                }
            }
        }
        z = false;
        return z;
    }

    public final synchronized BaseLoginMethod LJIIJJI() {
        BaseLoginMethod next;
        long j;
        long time;
        long time2;
        if (!((InterfaceC68532Qv2) C77119UOl.LJIIL(C58725N2z.LIZ, InterfaceC68532Qv2.class)).LIZIZ(true)) {
            return new BaseLoginMethod(null, null, null, null, -1L, null, null, null, null, null, null, null, null, 8175, null);
        }
        Iterator<BaseLoginMethod> it = LIZJ.iterator();
        if (!it.hasNext()) {
            next = null;
        } else {
            next = it.next();
            if (it.hasNext()) {
                BaseLoginMethod baseLoginMethod = next;
                Long lastActiveTime = baseLoginMethod.getLastActiveTime();
                if (lastActiveTime != null) {
                    j = lastActiveTime.longValue();
                } else {
                    j = -1;
                }
                if (j <= 0) {
                    time = baseLoginMethod.getExpires().getTime() - 2592000000L;
                } else {
                    Long lastActiveTime2 = baseLoginMethod.getLastActiveTime();
                    o.LJI(lastActiveTime2);
                    time = lastActiveTime2.longValue();
                }
                do {
                    BaseLoginMethod next2 = it.next();
                    BaseLoginMethod baseLoginMethod2 = next2;
                    Long lastActiveTime3 = baseLoginMethod2.getLastActiveTime();
                    if (lastActiveTime3 != null && lastActiveTime3.longValue() > 0) {
                        Long lastActiveTime4 = baseLoginMethod2.getLastActiveTime();
                        o.LJI(lastActiveTime4);
                        time2 = lastActiveTime4.longValue();
                    } else {
                        time2 = baseLoginMethod2.getExpires().getTime() - 2592000000L;
                    }
                    if (time < time2) {
                        next = next2;
                        time = time2;
                    }
                } while (it.hasNext());
            }
        }
        BaseLoginMethod baseLoginMethod3 = next;
        if (baseLoginMethod3 == null) {
            baseLoginMethod3 = new BaseLoginMethod(null, null, null, null, -1L, null, null, null, null, null, null, null, null, 8175, null);
        }
        return baseLoginMethod3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:20:0x00aa. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0135 A[Catch: Exception -> 0x015e, TryCatch #1 {Exception -> 0x015e, blocks: (B:7:0x0068, B:11:0x0075, B:12:0x0079, B:65:0x0081, B:15:0x0094, B:17:0x00a0, B:19:0x00a6, B:20:0x00aa, B:21:0x00be, B:24:0x0129, B:26:0x0135, B:27:0x0139, B:29:0x013f, B:31:0x00b5, B:35:0x00c7, B:38:0x00d9, B:40:0x00e5, B:41:0x00e9, B:43:0x00ef, B:44:0x00d0, B:47:0x00f8, B:50:0x0101, B:52:0x010d, B:53:0x0111, B:55:0x0117, B:56:0x0120, B:59:0x0148, B:62:0x0152, B:63:0x00ad), top: B:6:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x013f A[Catch: Exception -> 0x015e, TryCatch #1 {Exception -> 0x015e, blocks: (B:7:0x0068, B:11:0x0075, B:12:0x0079, B:65:0x0081, B:15:0x0094, B:17:0x00a0, B:19:0x00a6, B:20:0x00aa, B:21:0x00be, B:24:0x0129, B:26:0x0135, B:27:0x0139, B:29:0x013f, B:31:0x00b5, B:35:0x00c7, B:38:0x00d9, B:40:0x00e5, B:41:0x00e9, B:43:0x00ef, B:44:0x00d0, B:47:0x00f8, B:50:0x0101, B:52:0x010d, B:53:0x0111, B:55:0x0117, B:56:0x0120, B:59:0x0148, B:62:0x0152, B:63:0x00ad), top: B:6:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e5 A[Catch: Exception -> 0x015e, TryCatch #1 {Exception -> 0x015e, blocks: (B:7:0x0068, B:11:0x0075, B:12:0x0079, B:65:0x0081, B:15:0x0094, B:17:0x00a0, B:19:0x00a6, B:20:0x00aa, B:21:0x00be, B:24:0x0129, B:26:0x0135, B:27:0x0139, B:29:0x013f, B:31:0x00b5, B:35:0x00c7, B:38:0x00d9, B:40:0x00e5, B:41:0x00e9, B:43:0x00ef, B:44:0x00d0, B:47:0x00f8, B:50:0x0101, B:52:0x010d, B:53:0x0111, B:55:0x0117, B:56:0x0120, B:59:0x0148, B:62:0x0152, B:63:0x00ad), top: B:6:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ef A[Catch: Exception -> 0x015e, TryCatch #1 {Exception -> 0x015e, blocks: (B:7:0x0068, B:11:0x0075, B:12:0x0079, B:65:0x0081, B:15:0x0094, B:17:0x00a0, B:19:0x00a6, B:20:0x00aa, B:21:0x00be, B:24:0x0129, B:26:0x0135, B:27:0x0139, B:29:0x013f, B:31:0x00b5, B:35:0x00c7, B:38:0x00d9, B:40:0x00e5, B:41:0x00e9, B:43:0x00ef, B:44:0x00d0, B:47:0x00f8, B:50:0x0101, B:52:0x010d, B:53:0x0111, B:55:0x0117, B:56:0x0120, B:59:0x0148, B:62:0x0152, B:63:0x00ad), top: B:6:0x0068 }] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.util.List, T] */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.Quo] */
    static {
        /*
            Method dump skipped, instructions count: 668
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68517Qun.<clinit>():void");
    }

    public static void LJIILIIL() {
        int i;
        if (LJ) {
            return;
        }
        if (LIZLLL.getValue() != EnumC68524Quu.NOT_READY) {
            i = 1;
        } else {
            i = 0;
        }
        C35936E8m c35936E8m = new C35936E8m();
        c35936E8m.LIZ(i ^ 1, "is_delay_no_show");
        FMX.LJIIL("check_ocl_data_readiness", c35936E8m.LIZ);
        LJ = true;
    }

    public static long LJFF(BaseLoginMethod method) {
        long j;
        o.LJIIIZ(method, "method");
        Long lastActiveTime = method.getLastActiveTime();
        long j2 = -1;
        if (lastActiveTime != null) {
            j = lastActiveTime.longValue();
        } else {
            j = -1;
        }
        Long loginTime = method.getLoginTime();
        if (loginTime != null) {
            j2 = loginTime.longValue();
        }
        if (j > 0) {
            return j;
        }
        if (C53262KvK.LIZIZ() && j2 > 0) {
            return j2;
        }
        return method.getExpires().getTime() - 2592000000L;
    }

    public final synchronized void LIZ(boolean z) {
        List<BaseLoginMethod> list = LIZJ;
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (o.LJ(((BaseLoginMethod) next).getUid(), R41.LIZLLL())) {
                arrayList.add(next);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((BaseLoginMethod) it2.next()).allowOneKeyLogin(z);
        }
        LIZIZ.LIZJ(LIZJ, null);
    }

    public final synchronized void LIZIZ(String str) {
        BaseLoginMethod baseLoginMethod = (BaseLoginMethod) ORZ.LJLLJ(LJI(R41.LIZLLL()));
        BaseLoginMethod baseLoginMethod2 = new BaseLoginMethod(baseLoginMethod.getUid(), baseLoginMethod.getLoginMethodName(), baseLoginMethod.getCommonUserInfo(), baseLoginMethod.getExpires(), baseLoginMethod.getLoginTime(), baseLoginMethod.getLastActiveTime(), baseLoginMethod.getAllowOneKeyLogin(), baseLoginMethod.isFromReInstallNet(), baseLoginMethod.isTransToNormal(), baseLoginMethod.isOneClickLogin(), baseLoginMethod.getOneClickLoginToken(), baseLoginMethod.findPlatform(), Boolean.TRUE);
        ORS.LJJLIL(new AqS34S1000000_11(str, 9), LIZJ);
        ((ArrayList) LIZJ).add(baseLoginMethod2);
    }

    public final synchronized List<BaseLoginMethod> LJ(List<String> list) {
        C39626Fgs c39626Fgs = new C39626Fgs(OJ4.LJJJJ(ORZ.LJLIIIL(LIZJ), new C68520Quq(LJII(), LJIIIIZZ())), new IDComparatorS39S0000000_11(33));
        if (C79004UzY.LJJIFFI(list)) {
            return C47261Igj.LJJIJLIJ(OJ4.LJJLIIIJ(c39626Fgs));
        }
        return C47261Igj.LJJIJLIJ(OJ4.LJJLIIIJ(OJ4.LJJJJ(c39626Fgs, new AqS177S0100000_11(list, (List<String>) 42))));
    }

    public final synchronized List<BaseLoginMethod> LJI(String uid) {
        ArrayList arrayList;
        o.LJIIIZ(uid, "uid");
        List<BaseLoginMethod> list = LIZJ;
        arrayList = new ArrayList();
        for (BaseLoginMethod baseLoginMethod : list) {
            if (o.LJ(baseLoginMethod.getUid(), uid)) {
                arrayList.add(baseLoginMethod);
            }
        }
        return arrayList;
    }

    public final synchronized void LJIIL(BaseLoginMethod baseLoginMethod) {
        Object obj;
        String str;
        String str2;
        Integer LIZ2;
        Long lastActiveTime;
        if (baseLoginMethod.getLoginMethodName() == LoginMethodName.DEFAULT && (lastActiveTime = baseLoginMethod.getLastActiveTime()) != null && lastActiveTime.longValue() == -1) {
            baseLoginMethod.setLastActiveTime(Long.valueOf(System.currentTimeMillis()));
        }
        Iterator it = ((ArrayList) LIZJ).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (o.LJ(((BaseLoginMethod) obj).getUid(), baseLoginMethod.getUid())) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        BaseLoginMethod baseLoginMethod2 = (BaseLoginMethod) obj;
        if (baseLoginMethod2 != null) {
            baseLoginMethod.setAllowOneKeyLogin(baseLoginMethod2.getAllowOneKeyLogin());
            baseLoginMethod.setOneClickLogin(baseLoginMethod2.isOneClickLogin());
            baseLoginMethod.setOneClickLoginToken(baseLoginMethod2.getOneClickLoginToken());
        } else {
            UserStore.AccountUser LIZ3 = UserStore.LIZ(RBW.LJLLI.LIZJ());
            if (LIZ3 == null || (str = LIZ3.secUid) == null) {
                str = "";
            }
            boolean z = false;
            if (!TextUtils.isEmpty(str)) {
                if (LIZ3 == null || (str2 = LIZ3.secUid) == null) {
                    str2 = "";
                }
                if (str2.length() != 0 && (LIZ2 = C68540QvA.LIZ(str2, "save_login")) != null && LIZ2.intValue() == 1) {
                    z = true;
                }
            }
            baseLoginMethod.setAllowOneKeyLogin(Boolean.valueOf(z));
        }
        ORS.LJJLIL(new AqS177S0100000_11(baseLoginMethod, 43), LIZJ);
        ((ArrayList) LIZJ).add(baseLoginMethod);
        LIZIZ.LIZJ(LIZJ, null);
    }

    public final void LJIILJJIL(boolean z) {
        EnumC68524Quu enumC68524Quu;
        int currentTimeMillis;
        MutableLiveData<EnumC68524Quu> mutableLiveData = LIZLLL;
        if (z) {
            enumC68524Quu = EnumC68524Quu.FINAL;
        } else {
            enumC68524Quu = EnumC68524Quu.INTERMEDIATE;
        }
        mutableLiveData.postValue(enumC68524Quu);
        if (z && C53262KvK.LIZ() != 0) {
            long j = LJFF;
            if (j < 0) {
                currentTimeMillis = -1;
            } else {
                currentTimeMillis = (int) (System.currentTimeMillis() - j);
            }
            C35936E8m c35936E8m = new C35936E8m();
            c35936E8m.LIZ(currentTimeMillis, "load_time");
            FMX.LJIIL("ocl_data_load_time", c35936E8m.LIZ);
            LJIILL(false, true);
        }
    }

    public final synchronized void LJIILLIIL(String uid) {
        o.LJIIIZ(uid, "uid");
        ORS.LJJLIL(new AqS34S1000000_11(uid, 11), LIZJ);
        LIZIZ.LIZJ(LIZJ, null);
    }

    public final synchronized void LJIJJ(User user) {
        o.LJIIIZ(user, "user");
        List<BaseLoginMethod> list = LIZJ;
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (o.LJ(((BaseLoginMethod) next).getUid(), user.getUid())) {
                arrayList.add(next);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((BaseLoginMethod) it2.next()).updateUserInfo(user);
        }
        LIZIZ.LIZJ(LIZJ, null);
    }

    public final synchronized void LJIJJLI(SignificantUserInfo significantUserInfo) {
        if (significantUserInfo == null) {
            return;
        }
        List<BaseLoginMethod> list = LIZJ;
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (o.LJ(((BaseLoginMethod) next).getUid(), significantUserInfo.uid)) {
                arrayList.add(next);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((BaseLoginMethod) it2.next()).updateUserInfo(significantUserInfo);
        }
        LIZIZ.LIZJ(LIZJ, null);
    }

    public final synchronized void LIZJ(String str, InterfaceC68422QtG interfaceC68422QtG) {
        List<BaseLoginMethod> list = LIZJ;
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (o.LJ(((BaseLoginMethod) next).getUid(), str)) {
                arrayList.add(next);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            BaseLoginMethod baseLoginMethod = (BaseLoginMethod) it2.next();
            baseLoginMethod.setOneClickLogin(Boolean.FALSE);
            baseLoginMethod.setOneClickLoginToken(null);
        }
        LIZIZ.LIZJ(LIZJ, interfaceC68422QtG);
    }

    public final synchronized boolean LJIILL(boolean z, boolean z2) {
        String LIZLLL2;
        if (z) {
            LIZLLL2 = null;
        } else {
            LIZLLL2 = R41.LIZLLL();
        }
        if (ORS.LJJLIL(new AqS34S1000000_11(LIZLLL2, 10), LIZJ) && z2) {
            LIZIZ.LIZJ(LIZJ, null);
            return true;
        }
        return false;
    }

    public final synchronized void LJIIZILJ(long j, String str) {
        Iterator it = ((ArrayList) LIZJ).iterator();
        while (it.hasNext()) {
            BaseLoginMethod baseLoginMethod = (BaseLoginMethod) it.next();
            if (o.LJ(baseLoginMethod.getUid(), str)) {
                baseLoginMethod.setLastActiveTime(Long.valueOf(j));
            }
        }
    }

    public final synchronized void LJIJI(String str, String str2) {
        String str3;
        String str4;
        String str5;
        Iterator it = ((ArrayList) LIZJ).iterator();
        boolean z = false;
        while (it.hasNext()) {
            BaseLoginMethod baseLoginMethod = (BaseLoginMethod) it.next();
            if (o.LJ(baseLoginMethod.getUid(), str)) {
                CommonUserInfo commonUserInfo = baseLoginMethod.getCommonUserInfo();
                if (commonUserInfo == null || (str3 = commonUserInfo.getAvatarUrl()) == null) {
                    str3 = "";
                }
                CommonUserInfo commonUserInfo2 = baseLoginMethod.getCommonUserInfo();
                if (commonUserInfo2 == null || (str4 = commonUserInfo2.getSecUid()) == null) {
                    str4 = "";
                }
                CommonUserInfo commonUserInfo3 = baseLoginMethod.getCommonUserInfo();
                if (commonUserInfo3 == null || (str5 = commonUserInfo3.getScreenName()) == null) {
                    str5 = "";
                }
                baseLoginMethod.setCommonUserInfo(new CommonUserInfo(str2, str3, str4, str5));
                if (baseLoginMethod.getLoginMethodName() == LoginMethodName.USER_NAME_PASS) {
                    ((AccountPassLoginMethod) baseLoginMethod).setName(str2);
                }
                z = true;
            }
        }
        if (z) {
            LIZIZ.LIZJ(LIZJ, null);
        }
    }

    public final synchronized void LIZLLL(String uid, String token, InterfaceC68422QtG interfaceC68422QtG) {
        o.LJIIIZ(uid, "uid");
        o.LJIIIZ(token, "token");
        if (((ArrayList) LJI(uid)).isEmpty()) {
            User LJIIIZ = UserStore.LJIIIZ(uid);
            if (LJIIIZ != null) {
                CommonUserInfo.Companion.getClass();
                ((ArrayList) LIZJ).add(new BaseLoginMethod(uid, null, C68522Qus.LIZIZ(LJIIIZ), null, Long.valueOf(System.currentTimeMillis()), null, null, null, null, Boolean.TRUE, token, null, null, 6634, null));
            }
        } else {
            List<BaseLoginMethod> list = LIZJ;
            ArrayList arrayList = new ArrayList();
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (o.LJ(((BaseLoginMethod) next).getUid(), uid)) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                BaseLoginMethod baseLoginMethod = (BaseLoginMethod) it2.next();
                baseLoginMethod.setOneClickLogin(Boolean.TRUE);
                baseLoginMethod.setOneClickLoginToken(token);
                baseLoginMethod.setHistoryOff(Boolean.FALSE);
                User LJIIIZ2 = UserStore.LJIIIZ(uid);
                if (LJIIIZ2 != null) {
                    baseLoginMethod.updateUserInfo(LJIIIZ2);
                }
            }
        }
        LIZIZ.LIZJ(LIZJ, interfaceC68422QtG);
    }

    public final synchronized void LJIJ(long j, String userId, boolean z) {
        Object next;
        long j2;
        o.LJIIIZ(userId, "userId");
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) LIZJ).iterator();
        while (it.hasNext()) {
            BaseLoginMethod baseLoginMethod = (BaseLoginMethod) it.next();
            if (o.LJ(baseLoginMethod.getUid(), userId)) {
                arrayList.add(baseLoginMethod);
            }
        }
        if (!z) {
            if (!R41.LIZIZ.LJIIIZ().isOneKeyLoginExperimentEnabled()) {
                j2 = 2592000000L;
            } else {
                j2 = 15552000000L;
            }
            j += j2;
        }
        Iterator it2 = arrayList.iterator();
        if (!it2.hasNext()) {
            next = null;
        } else {
            next = it2.next();
            if (it2.hasNext()) {
                Date expires = ((BaseLoginMethod) next).getExpires();
                do {
                    Object next2 = it2.next();
                    Date expires2 = ((BaseLoginMethod) next2).getExpires();
                    if (expires.compareTo(expires2) < 0) {
                        next = next2;
                        expires = expires2;
                    }
                } while (it2.hasNext());
            }
        }
        BaseLoginMethod baseLoginMethod2 = (BaseLoginMethod) next;
        if (baseLoginMethod2 != null) {
            baseLoginMethod2.setExpires(new Date(j));
        }
    }
}
