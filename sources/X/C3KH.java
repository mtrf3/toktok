package X;

import Y.AObserverS69S0100000_1;
import Y.ARunnableS12S0300000_1;
import Y.ARunnableS20S0200000_1;
import Y.ARunnableS37S0100000_1;
import android.os.Handler;
import androidx.lifecycle.LiveData;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.service.model.ActivityStatus;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: X.3KH, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3KH implements C3JJ, C3J7, C3JD {
    public static final C82603Ma LJLJLJ = new C82603Ma("", C4FY.NO_STATUS);
    public final C39H LJLIL;
    public final C39N LJLILLLLZI;
    public final C39N LJLJI;
    public final C62822Ol8 LJLJJI;
    public final java.util.Map<String, LiveData<ActivityStatus>> LJLJJL;
    public final java.util.Map<String, ActivityStatus> LJLJJLL;
    public final AObserverS69S0100000_1 LJLJL;

    public C3KH() {
        this(0);
    }

    @Override // X.C3JJ
    public final void LIZLLL() {
    }

    @Override // X.C3JJ
    public final void LJIILIIL() {
    }

    @Override // X.C3JD
    public final String getTag() {
        return "SessionRefactor-ActivityStatus";
    }

    @Override // X.C3JJ
    public final void LJIIJ() {
        EventBus.LIZJ().LJIJ(this);
        ((Handler) this.LJLJJI.getValue()).post(new ARunnableS37S0100000_1(this, 127));
    }

    @Override // X.C3JJ
    public final void LJIIL() {
        EventBus.LIZJ().LJIILJJIL(this);
    }

    @Override // X.C3J7
    public final C39N LIZJ() {
        return this.LJLILLLLZI;
    }

    @Override // X.C3JD
    public final C39N LJII() {
        return this.LJLJI;
    }

    public C3KH(int i) {
        this.LJLIL = new C39H();
        C39N c39n = C39N.INBOX;
        this.LJLILLLLZI = c39n;
        this.LJLJI = c39n;
        this.LJLJJI = C221108m2.LIZIZ(C3KL.INSTANCE);
        this.LJLJJL = new ConcurrentHashMap();
        this.LJLJJLL = new ConcurrentHashMap();
        this.LJLJL = new AObserverS69S0100000_1(this, 141);
    }

    @Override // X.C3JD
    public final void LIZ(C3L4 baseSession) {
        o.LJIIIZ(baseSession, "baseSession");
        LJIIIIZZ(baseSession, System.currentTimeMillis(), IMService.createIIMServicebyMonsterPlugin(false).getActivityStatusViewModel().getSettings().LJFF());
    }

    @Override // X.C3J7
    public final void LIZIZ(InterfaceC88472Yns<? super InterfaceC81693In, C76800UCe> interfaceC88472Yns) {
        C39H c39h = this.LJLIL;
        c39h.getClass();
        c39h.LJLJI = interfaceC88472Yns;
    }

    @Override // X.C3JD
    public final void LJ(List<? extends C3L4> list) {
        C81843Jc.LIZIZ("SessionRefactor-ActivityStatus", "start decorate");
        long currentTimeMillis = System.currentTimeMillis();
        boolean LJFF = IMService.createIIMServicebyMonsterPlugin(false).getActivityStatusViewModel().getSettings().LJFF();
        Iterator<? extends C3L4> it = list.iterator();
        while (it.hasNext()) {
            LJIIIIZZ(it.next(), currentTimeMillis, LJFF);
        }
    }

    @Override // X.C3J7
    public final void LJFF(InterfaceC88472Yns<? super InterfaceC81723Iq, C76800UCe> interfaceC88472Yns) {
        C39H c39h = this.LJLIL;
        c39h.getClass();
        c39h.LJLILLLLZI = interfaceC88472Yns;
    }

    @Override // X.C3J7
    public final void LJI(List<? extends C3L4> list) {
        IMUser LJIJI;
        String uid;
        if (C3KQ.LIZ().useOldActivityStatusLogic) {
            ((Handler) this.LJLJJI.getValue()).post(new ARunnableS20S0200000_1(this, list, 55));
            return;
        }
        java.util.Set keySet = ((ConcurrentHashMap) this.LJLJJL).keySet();
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            C3L4 c3l4 = (C3L4) it.next();
            if ((c3l4 instanceof C3L3) && (LJIJI = ((C3L3) c3l4).LJIJI()) != null && (uid = LJIJI.getUid()) != null) {
                arrayList.add(uid);
            }
        }
        java.util.Set LLJJ = ORZ.LLJJ(arrayList);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("oldUidSet: ");
        LIZ.append(keySet.size());
        LIZ.append("  newUidSet: ");
        LIZ.append(LLJJ.size());
        C81843Jc.LIZIZ("SessionRefactor-ActivityStatus", X1D.LIZIZ(LIZ));
        java.util.Set LLILIL = ORZ.LLILIL(keySet, LLJJ);
        java.util.Set LLILIL2 = ORZ.LLILIL(LLJJ, keySet);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("needRemoveUidSet: ");
        LIZ2.append(LLILIL.size());
        LIZ2.append("  needAddUidSet: ");
        LIZ2.append(LLILIL2.size());
        C81843Jc.LIZIZ("SessionRefactor-ActivityStatus", X1D.LIZIZ(LIZ2));
        ((Handler) this.LJLJJI.getValue()).post(new ARunnableS12S0300000_1(LLILIL, LLILIL2, this, 15));
    }

    public final LiveData<ActivityStatus> LJIIIZ(String str) {
        LiveData<ActivityStatus> liveData = (LiveData) ((ConcurrentHashMap) this.LJLJJL).get(str);
        if (liveData == null) {
            LiveData<ActivityStatus> LIZ = C3B3.LIZ(IMService.createIIMServicebyMonsterPlugin(false).getActivityStatusViewModel(), str, C3BA.INBOX, null, 8);
            LIZ.observeForever(this.LJLJL);
            return LIZ;
        }
        return liveData;
    }

    @QD3(threadMode = ThreadMode.MAIN)
    public final void onPrivacyUserSettingsChange(C79723Ay event) {
        o.LJIIIZ(event, "event");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("privacy settings changed: ");
        LIZ.append(event.LJLIL);
        C81843Jc.LIZJ("SessionRefactor-ActivityStatus", X1D.LIZIZ(LIZ));
        for (Map.Entry entry : ((ConcurrentHashMap) C771431a.LIZ().LJLJJLL).entrySet()) {
            C81983Jq sessionPage = (C81983Jq) entry.getKey();
            InterfaceC82043Jw interfaceC82043Jw = (InterfaceC82043Jw) entry.getValue();
            Integer M = event.LJLIL.M("activity_status");
            if (M == null || M.intValue() != 2) {
                Integer M2 = event.LJLIL.M("activity_status");
                if (M2 != null && M2.intValue() == 1) {
                    C81803Iy LIZ2 = C771431a.LIZ();
                    LIZ2.getClass();
                    o.LJIIIZ(sessionPage, "sessionPage");
                    LIZ2.LJIIJJI(new C37Z(LIZ2, sessionPage, null));
                }
            } else {
                List<C3L4> LIZIZ = interfaceC82043Jw.LIZIZ();
                ArrayList arrayList = new ArrayList();
                for (C3L4 c3l4 : LIZIZ) {
                    if (!(c3l4 instanceof C3L3) || (c3l4 instanceof C3L2)) {
                        arrayList.add(c3l4);
                    }
                }
                final ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((C3L4) it.next()).LJFF());
                }
                Iterator it2 = ((ConcurrentHashMap) this.LJLJJL).values().iterator();
                while (it2.hasNext()) {
                    ((LiveData) it2.next()).removeObserver(this.LJLJL);
                }
                ((ConcurrentHashMap) this.LJLJJL).clear();
                ((ConcurrentHashMap) this.LJLJJLL).clear();
                InterfaceC88472Yns<? super InterfaceC81693In, C76800UCe> interfaceC88472Yns = this.LJLIL.LJLJI;
                if (interfaceC88472Yns != null) {
                    final C93833mF LJJJLIIL = C113554cx.LJJJLIIL();
                    interfaceC88472Yns.invoke(new InterfaceC81693In(arrayList2, LJJJLIIL) { // from class: X.3KI
                        public final Collection<String> LIZ;
                        public final java.util.Map<String, ActivityStatus> LIZIZ;
                        public final String LIZJ = "ActivityStatusOperationDecoratorBatch";

                        @Override // X.InterfaceC81703Io
                        public final String LIZ() {
                            return this.LIZJ;
                        }

                        @Override // X.InterfaceC81693In
                        public final Collection<String> LIZJ() {
                            return this.LIZ;
                        }

                        @Override // X.InterfaceC81703Io
                        public final C3L4 LIZLLL(C3L4 c3l42) {
                            String str;
                            if (!(c3l42 instanceof C3L3)) {
                                return c3l42;
                            }
                            ActivityStatus activityStatus = this.LIZIZ.get(c3l42.LJFF());
                            if (activityStatus != null) {
                                str = activityStatus.userID;
                            } else {
                                str = null;
                            }
                            boolean LJIJI = AV1.LJIJI(str);
                            boolean LJFF = IMService.createIIMServicebyMonsterPlugin(false).getActivityStatusViewModel().getSettings().LJFF();
                            long currentTimeMillis = System.currentTimeMillis();
                            c3l42.LLFII = C3KK.LIZIZ(LJIJI, LJFF, activityStatus, currentTimeMillis);
                            c3l42.LJLJJLL = C3KK.LIZ(currentTimeMillis, activityStatus, c3l42, LJIJI, LJFF);
                            StringBuilder LIZ3 = X1D.LIZ();
                            LIZ3.append("batch--- ");
                            LIZ3.append(c3l42.LJ());
                            LIZ3.append(", onlineStatus : ");
                            LIZ3.append(c3l42.LJLJJLL);
                            LIZ3.append(", isActivity : ");
                            LIZ3.append(c3l42.LLFII);
                            LIZ3.append(", isPermitted:");
                            LIZ3.append(LJFF);
                            C81843Jc.LIZIZ("SessionRefactor-ActivityStatus", X1D.LIZIZ(LIZ3));
                            return c3l42;
                        }

                        {
                            this.LIZ = arrayList2;
                            this.LIZIZ = LJJJLIIL;
                        }
                    });
                }
            }
        }
    }

    public final void LJIIIIZZ(C3L4 c3l4, long j, boolean z) {
        C3L3 c3l3;
        IMUser iMUser;
        ActivityStatus activityStatus;
        if (!(c3l4 instanceof C3L3) || (c3l4 instanceof C3L2) || (iMUser = (c3l3 = (C3L3) c3l4).LLIIIZ) == null) {
            return;
        }
        boolean LJIJI = AV1.LJIJI(iMUser.getUid());
        if (!LJIJI && C57434MgQ.LIZ(iMUser.getFollowStatus()) != EnumC57435MgR.FOLLOW_MUTUAL) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(c3l3.LJ());
            LIZ.append(" not MUF");
            C81843Jc.LIZIZ("SessionRefactor-ActivityStatus", X1D.LIZIZ(LIZ));
            c3l3.LLFII = false;
            c3l3.LJLJJLL = LJLJLJ;
            return;
        }
        if (!z) {
            C81843Jc.LIZIZ("SessionRefactor-ActivityStatus", "not permitted");
            c3l3.LLFII = false;
            c3l3.LJLJJLL = LJLJLJ;
            return;
        }
        if (LJIJI) {
            String uid = iMUser.getUid();
            o.LJIIIIZZ(uid, "fromUser.uid");
            activityStatus = new ActivityStatus(uid, j / 1000, -1L);
        } else {
            activityStatus = (ActivityStatus) ((ConcurrentHashMap) this.LJLJJLL).get(c3l3.LJFF());
            if (activityStatus == null) {
                C3B2 activityStatusViewModel = IMService.createIIMServicebyMonsterPlugin(false).getActivityStatusViewModel();
                String uid2 = iMUser.getUid();
                o.LJIIIIZZ(uid2, "fromUser.uid");
                activityStatus = activityStatusViewModel.LJIIJ(uid2);
                if (activityStatus == null) {
                    c3l3.LLFII = false;
                    c3l3.LJLJJLL = LJLJLJ;
                    return;
                }
            }
        }
        java.util.Map<String, ActivityStatus> map = this.LJLJJLL;
        String LJFF = c3l3.LJFF();
        o.LJIIIIZZ(LJFF, "baseSession.sessionID");
        ((ConcurrentHashMap) map).put(LJFF, activityStatus);
        c3l3.LLFII = C3KK.LIZIZ(LJIJI, true, activityStatus, j);
        c3l3.LJLJJLL = C3KK.LIZ(j, activityStatus, c3l4, LJIJI, true);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("result :");
        LIZ2.append(c3l4.LJ());
        LIZ2.append(' ');
        LIZ2.append(c3l4.LLFII);
        LIZ2.append(':');
        LIZ2.append(c3l4.LJLJJLL);
        C81843Jc.LIZIZ("SessionRefactor-ActivityStatus", X1D.LIZIZ(LIZ2));
    }
}
