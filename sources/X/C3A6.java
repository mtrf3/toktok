package X;

import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.im.sdk.activitystatus.ActivityStatusViewModelImpl;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.appsettings.ActivityStatusConfig;
import com.ss.android.ugc.aweme.im.service.model.ActivityStatus;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3A6, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3A6 {
    public final C3A9 LIZ;
    public final C3AB LIZIZ;
    public final ActivityStatusConfig LIZJ;
    public final IAccountService LIZLLL;
    public final C98453th LJ;
    public final C64962gm LJFF;
    public final C782535h LJI;
    public final C782835k LJII;

    public static boolean LIZ(long j) {
        IMUser LJIIL = IMService.createIIMServicebyMonsterPlugin(false).getImUserService().LJIIL(String.valueOf(j));
        if (LJIIL == null || LJIIL.getFollowStatus() != 2) {
            return false;
        }
        return true;
    }

    public final void LIZIZ(List<C782935l> list) {
        C3AD c3ad;
        boolean z;
        ActivityStatus activityStatus;
        C3AD c3ad2;
        boolean z2;
        ActivityStatus activityStatus2;
        long j;
        long currentTimeMillis = System.currentTimeMillis();
        C98453th c98453th = this.LJ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateActivityStatusInner current time ");
        LIZ.append(currentTimeMillis);
        c98453th.LJFF(X1D.LIZIZ(LIZ));
        ArrayList arrayList = new ArrayList();
        for (C782935l c782935l : list) {
            long j2 = currentTimeMillis - (c782935l.LJLIL * 1000);
            if (j2 > -10000 && j2 < this.LIZJ.status_copy_display_date_threshold) {
                arrayList.add(c782935l);
            }
        }
        C98453th c98453th2 = this.LJ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("filter invalid before ");
        LIZ2.append(list.size());
        LIZ2.append(" after ");
        LIZ2.append(arrayList.size());
        c98453th2.LJFF(X1D.LIZIZ(LIZ2));
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(String.valueOf(((C782935l) it.next()).LJLILLLLZI));
        }
        List<C3AD> LIZJ = this.LIZ.LIZJ(arrayList2);
        if (C3AA.LIZJ) {
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                Iterator<C3AD> it3 = LIZJ.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        if (o.LJ(it3.next().LIZ, next)) {
                            break;
                        }
                    } else {
                        arrayList3.add(next);
                        break;
                    }
                }
            }
            this.LJ.LJI("fetch invalid cache", arrayList3, C786136r.LJLIL);
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                String str = (String) it4.next();
                this.LIZ.LJI(str);
                C3B5.LIZ(false, false, str, "fetch");
            }
        }
        this.LJ.LJFF("cacheListToUpdate size " + LIZJ.size());
        if (LIZJ.isEmpty()) {
            return;
        }
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        Iterator<C3AD> it5 = LIZJ.iterator();
        while (true) {
            Object obj = null;
            if (!it5.hasNext()) {
                break;
            }
            C3AD next2 = it5.next();
            Iterator it6 = arrayList.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                Object next3 = it6.next();
                if (o.LJ(String.valueOf(((C782935l) next3).LJLILLLLZI), next2.LIZ)) {
                    obj = next3;
                    break;
                }
            }
            C782935l c782935l2 = (C782935l) obj;
            if (c782935l2 != null) {
                if (next2.LIZLLL.getState() == 1) {
                    arrayList5.add(next2.LIZ);
                    this.LIZ.LJI(next2.LIZ);
                } else {
                    ActivityStatus activityStatus3 = next2.LIZJ;
                    if (activityStatus3 != null) {
                        j = activityStatus3.activeTime;
                    } else {
                        j = 0;
                    }
                    if (next2.LIZLLL == C3A8.OPTIMIZATION_ENABLE) {
                        long j3 = c782935l2.LJLIL;
                        if (j3 > j && activityStatus3 != null) {
                            String userID = activityStatus3.userID;
                            long j4 = activityStatus3.inactiveTime;
                            o.LJIIIZ(userID, "userID");
                            arrayList4.add(new ActivityStatus(userID, j3, j4));
                        }
                    }
                }
            }
        }
        this.LJ.LJI("update cache size " + arrayList4.size() + ' ', arrayList4, C36J.LJLIL);
        this.LJ.LJI("request size " + arrayList5.size() + ' ', arrayList5, C786236s.LJLIL);
        if ((!arrayList5.isEmpty()) && !C3AA.LIZJ) {
            this.LIZ.LJIIL(arrayList5, C3A8.MSG_RECEIVED);
        }
        if (C3AA.LJ) {
            return;
        }
        if (!arrayList4.isEmpty()) {
            C3A9 c3a9 = this.LIZ;
            ActivityStatus[] activityStatusArr = (ActivityStatus[]) arrayList4.toArray(new ActivityStatus[0]);
            c3a9.LJIIIZ((ActivityStatus[]) Arrays.copyOf(activityStatusArr, activityStatusArr.length));
        }
        Iterator it7 = arrayList4.iterator();
        while (it7.hasNext()) {
            ActivityStatus activityStatus4 = (ActivityStatus) it7.next();
            Iterator<C3AD> it8 = LIZJ.iterator();
            while (true) {
                if (it8.hasNext()) {
                    c3ad2 = it8.next();
                    if (o.LJ(c3ad2.LIZ, activityStatus4.userID)) {
                        break;
                    }
                } else {
                    c3ad2 = null;
                    break;
                }
            }
            C3AD c3ad3 = c3ad2;
            if (c3ad3 != null && (activityStatus2 = c3ad3.LIZJ) != null) {
                z2 = OUP.LJJII(activityStatus2, null, null, 3);
            } else {
                z2 = false;
            }
            C3B5.LIZ(z2, OUP.LJJII(activityStatus4, null, null, 3), activityStatus4.userID, "message");
        }
        Iterator it9 = arrayList5.iterator();
        while (it9.hasNext()) {
            String str2 = (String) it9.next();
            Iterator<C3AD> it10 = LIZJ.iterator();
            while (true) {
                if (it10.hasNext()) {
                    c3ad = it10.next();
                    if (o.LJ(c3ad.LIZ, str2)) {
                        break;
                    }
                } else {
                    c3ad = null;
                    break;
                }
            }
            C3AD c3ad4 = c3ad;
            if (c3ad4 != null && (activityStatus = c3ad4.LIZJ) != null) {
                z = OUP.LJJII(activityStatus, null, null, 3);
            } else {
                z = false;
            }
            C3B5.LIZ(z, z, str2, "fetch");
        }
    }

    public final void LIZJ(List<? extends C109544Rq> list) {
        Integer num;
        C98453th c98453th = this.LJ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("receive msg size ");
        if (list != null) {
            num = Integer.valueOf(list.size());
        } else {
            num = null;
        }
        LIZ.append(num);
        c98453th.LJFF(X1D.LIZIZ(LIZ));
        if (list == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (C109544Rq c109544Rq : list) {
            C109544Rq c109544Rq2 = c109544Rq;
            if (!c109544Rq2.isSelf() && c109544Rq2.getSender() > 0 && (!C3AA.LIZLLL || c109544Rq2.getConversationType() != AbstractC63505Ow9.LIZIZ)) {
                arrayList.add(c109544Rq);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            C109544Rq c109544Rq3 = (C109544Rq) next;
            C3Q9.LIZ.getClass();
            C75782yE.LIZ();
            C63120Opw LJII = C4WC.LIZIZ.LJII(c109544Rq3.getConversationId());
            if (LJII != null && !LJII.isStranger() && LIZ(c109544Rq3.getSender())) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList(C32I.LJJL(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            C109544Rq c109544Rq4 = (C109544Rq) it2.next();
            arrayList3.add(new C782935l(c109544Rq4.getCreatedAt() / 1000, c109544Rq4.getSender()));
        }
        C98453th c98453th2 = this.LJ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("updateActivityStatusWithMsg final update size ");
        LIZ2.append(arrayList3.size());
        c98453th2.LJFF(X1D.LIZIZ(LIZ2));
        if (arrayList3.isEmpty()) {
            return;
        }
        LIZIZ(arrayList3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.4ZE, X.35k] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.3vf, X.35h] */
    public C3A6(ActivityStatusViewModelImpl activityStatusViewModelImpl, C3AB c3ab, ActivityStatusConfig activityStatusConfig, IAccountService iAccountService, C98453th logger) {
        o.LJIIIZ(logger, "logger");
        this.LIZ = activityStatusViewModelImpl;
        this.LIZIZ = c3ab;
        this.LIZJ = activityStatusConfig;
        this.LIZLLL = iAccountService;
        this.LJ = logger;
        this.LJFF = C48841JEv.LIZ(T2R.LJIIJJI().plus(C78613UtF.LIZJ));
        ?? r2 = new InterfaceC99673vf() { // from class: X.35h
            @Override // X.InterfaceC99673vf, X.InterfaceC63226Ore
            public final void M1(List<C109544Rq> list, boolean z) {
            }

            @Override // X.InterfaceC99673vf, X.InterfaceC63226Ore
            public final void T1(C109544Rq c109544Rq) {
            }

            @Override // X.InterfaceC99673vf, X.InterfaceC63226Ore
            public final void X8(java.util.Map map, int i, List list) {
            }

            @Override // X.InterfaceC99673vf, X.InterfaceC63226Ore
            public final void ea(C109544Rq c109544Rq, boolean z) {
            }

            @Override // X.InterfaceC99673vf, X.InterfaceC63226Ore
            public final void m4(int i, C109544Rq c109544Rq, C63540Owi c63540Owi) {
            }

            @Override // X.InterfaceC99673vf, X.InterfaceC63226Ore
            public final void u7(int i, C109544Rq c109544Rq) {
            }

            @Override // X.InterfaceC99673vf, X.InterfaceC63226Ore
            public final void v0(List<C109544Rq> list, boolean z) {
            }

            @Override // X.InterfaceC99673vf, X.InterfaceC63226Ore
            public final void y(C109544Rq c109544Rq) {
            }

            @Override // X.InterfaceC99673vf, X.InterfaceC63226Ore
            public final void y5(int i, C63219OrX c63219OrX) {
            }

            @Override // X.InterfaceC99673vf, X.InterfaceC63226Ore
            public final void K7(int i, String str, List list) {
                C3A6 c3a6 = C3A6.this;
                XKX.LIZLLL(c3a6.LJFF, null, null, new C782335f(c3a6, list, null), 3);
            }

            @Override // X.InterfaceC99673vf, X.InterfaceC63226Ore
            public final void x6(List<C109544Rq> list, int i, C107074Id extra) {
                o.LJIIIZ(extra, "extra");
                C3A6 c3a6 = C3A6.this;
                XKX.LIZLLL(c3a6.LJFF, null, null, new C782435g(c3a6, list, i, null), 3);
            }

            @Override // X.InterfaceC99673vf, X.InterfaceC63226Ore
            public final void v6(C109544Rq c109544Rq, java.util.Map<String, List<C32H>> map, java.util.Map<String, List<C32H>> map2, Long l, Long l2) {
                if (c109544Rq != null && l != null) {
                    l.longValue();
                    if (l2 != null) {
                        l2.longValue();
                        C3A6 c3a6 = C3A6.this;
                        XKX.LIZLLL(c3a6.LJFF, null, null, new C782635i(c3a6, c109544Rq, l, l2, null), 3);
                    }
                }
            }
        };
        this.LJI = r2;
        ?? r1 = new C4ZE() { // from class: X.35k
            @Override // X.C4ZE
            public final void LIZ(Long l, Long l2, String str) {
                C3A6 c3a6 = C3A6.this;
                XKX.LIZLLL(c3a6.LJFF, null, null, new C782735j(c3a6, l, l2, null), 3);
            }
        };
        this.LJII = r1;
        logger.LJFF("init");
        if (iAccountService.LJFF().isLogin()) {
            logger.LJFF("init isLogin");
            logger.LJFF("registerMsgObserver");
            c3ab.LIZIZ(r2);
            c3ab.LJII(r1);
        }
        iAccountService.LJIILJJIL(new LEA() { // from class: X.3A7
            @Override // X.LEA
            public final void onAccountResult(int i, boolean z, int i2, User user) {
                if (!z) {
                    return;
                }
                String str = null;
                if (i == 1) {
                    C98453th c98453th = C3A6.this.LJ;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("account login uid ");
                    if (user != null) {
                        str = user.getUid();
                    }
                    LIZ.append(str);
                    c98453th.LJFF(X1D.LIZIZ(LIZ));
                    C3A6 c3a6 = C3A6.this;
                    c3a6.LJ.LJFF("registerMsgObserver");
                    c3a6.LIZIZ.LIZIZ(c3a6.LJI);
                    c3a6.LIZIZ.LJII(c3a6.LJII);
                    return;
                }
                if (i != 2 && i != 3) {
                    return;
                }
                C98453th c98453th2 = C3A6.this.LJ;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("account logout uid ");
                if (user != null) {
                    str = user.getUid();
                }
                LIZ2.append(str);
                c98453th2.LJFF(X1D.LIZIZ(LIZ2));
                C3A6 c3a62 = C3A6.this;
                c3a62.LJ.LJFF("unregisterMsgObserver");
                c3a62.LIZIZ.LJFF(c3a62.LJI);
                c3a62.LIZIZ.LIZJ(c3a62.LJII);
            }
        });
    }
}
