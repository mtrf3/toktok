package com.ss.android.ugc.aweme.im.sdk.chatlist.feature.focused.viewmodel;

import X.AbstractC73430Srq;
import X.AnonymousClass360;
import X.C113554cx;
import X.C221108m2;
import X.C32I;
import X.C34B;
import X.C37O;
import X.C3E6;
import X.C3JY;
import X.C3K3;
import X.C3K4;
import X.C3KQ;
import X.C3L0;
import X.C3L4;
import X.C3LO;
import X.C3NN;
import X.C3OH;
import X.C3SR;
import X.C3TV;
import X.C3TX;
import X.C3Y4;
import X.C42193GhB;
import X.C62762dE;
import X.C62822Ol8;
import X.C65777Prh;
import X.C73426Srm;
import X.C73849Syb;
import X.C76800UCe;
import X.C772831o;
import X.C78613UtF;
import X.C787137b;
import X.C78983UzD;
import X.C79081V1x;
import X.C81463Hq;
import X.C81903Ji;
import X.C81983Jq;
import X.C82153Kh;
import X.C82253Kr;
import X.C82353Lb;
import X.C82363Lc;
import X.C82373Ld;
import X.C82393Lf;
import X.C82513Lr;
import X.C82693Mj;
import X.C83023Nq;
import X.C84073Rr;
import X.C85323Wm;
import X.EnumC82403Lg;
import X.EnumC82443Lk;
import X.InterfaceC81473Hr;
import X.InterfaceC81953Jn;
import X.InterfaceC82123Ke;
import X.InterfaceC88472Yns;
import X.JBR;
import X.ORZ;
import X.OSZ;
import X.X1D;
import X.XIA;
import X.XKW;
import X.XKX;
import Y.ARunnableS20S0200000_1;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.im.sdk.chatlist.feature.focused.viewmodel.FocusedSessionListViewModelImpl;
import com.ss.android.ugc.aweme.im.sdk.common.data.dto.DistinctUntilChangedLiveData;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class FocusedSessionListViewModelImpl extends ViewModel implements C3SR, C3LO<C3L4> {
    public static final C62822Ol8 LJLLJ = C221108m2.LIZIZ(C84073Rr.LJLIL);
    public static final C62822Ol8 LJLLL = C221108m2.LIZIZ(C3NN.LJLIL);
    public final InterfaceC81473Hr LJLIL;
    public final C3L0 LJLILLLLZI;
    public final InterfaceC88472Yns<List<C3L4>, C76800UCe> LJLJI;
    public final XKW LJLJJI;
    public final DistinctUntilChangedLiveData<Boolean> LJLJJL;
    public final AtomicBoolean LJLJJLL;
    public boolean LJLJL;
    public final C73849Syb<C3OH> LJLJLJ;
    public volatile boolean LJLJLLL;
    public volatile C82363Lc LJLL;
    public final C82353Lb LJLLI;
    public final List<C3L4> LJLLILLLL;

    public FocusedSessionListViewModelImpl() {
        this(null);
    }

    @Override // X.C3SR
    public final void jt0() {
        this.LJLJL = true;
    }

    @Override // X.C3SR
    public final void refresh() {
        C34B.LIZIZ("FocusedSessionListViewModelImpl", "refresh");
        if (C3TX.LIZIZ()) {
            C3K3.LIZ().LJII().LJIIIZ();
            return;
        }
        C3L0 c3l0 = this.LJLILLLLZI;
        if (c3l0 == null) {
            return;
        }
        c3l0.LJI(false);
    }

    @Override // X.C3SR
    public final void LJIIJJI() {
        C82253Kr c82253Kr;
        if (C3TX.LIZIZ()) {
            C3K3.LIZ().LJIIJJI();
            return;
        }
        C3L0 c3l0 = this.LJLILLLLZI;
        if (!(c3l0 instanceof C82253Kr) || (c82253Kr = (C82253Kr) c3l0) == null) {
            return;
        }
        C82253Kr.LJJI(c82253Kr);
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        if (C3TX.LIZIZ()) {
            C82513Lr LJII = C3K3.LIZ().LJII();
            C82353Lb observer = this.LJLLI;
            LJII.getClass();
            o.LJIIIZ(observer, "observer");
            LJII.LJLJL.remove(observer);
            return;
        }
        C3L0 c3l0 = this.LJLILLLLZI;
        if (c3l0 == null) {
            return;
        }
        C65777Prh.LIZ(c3l0.LJLIL).remove(this);
    }

    @Override // X.C3SR
    public final boolean Fg0() {
        return this.LJLJL;
    }

    @Override // X.C3SR
    public final AtomicBoolean V() {
        return this.LJLJJLL;
    }

    @Override // X.C3SR
    public final DistinctUntilChangedLiveData<Boolean> yp() {
        return this.LJLJJL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, X.3Lb] */
    public FocusedSessionListViewModelImpl(Object obj) {
        C82253Kr LIZIZ;
        C81463Hq c81463Hq = new C81463Hq(0);
        if (C3TX.LIZIZ()) {
            LIZIZ = null;
        } else {
            LIZIZ = C37O.LIZIZ();
        }
        AnonymousClass360 anonymousClass360 = new AnonymousClass360(C3E6.LIZ);
        XIA ioDispatcher = C78613UtF.LIZJ;
        o.LJIIIZ(ioDispatcher, "ioDispatcher");
        this.LJLIL = c81463Hq;
        this.LJLILLLLZI = LIZIZ;
        this.LJLJI = anonymousClass360;
        this.LJLJJI = ioDispatcher;
        Boolean bool = Boolean.TRUE;
        DistinctUntilChangedLiveData<Boolean> distinctUntilChangedLiveData = new DistinctUntilChangedLiveData<>(bool);
        this.LJLJJL = distinctUntilChangedLiveData;
        this.LJLJJLL = new AtomicBoolean(false);
        this.LJLJLJ = new C73849Syb<>();
        this.LJLJLLL = true;
        this.LJLL = new C82363Lc(0, 0);
        ?? r1 = new InterfaceC82123Ke() { // from class: X.3Lb
            @Override // X.InterfaceC82123Ke
            public final C39N LIZIZ() {
                return C39N.INBOX;
            }

            @Override // X.InterfaceC82123Ke
            public final void LIZ(C81983Jq c81983Jq, List<? extends C3L4> sessionList) {
                o.LJIIIZ(sessionList, "sessionList");
            }

            @Override // X.InterfaceC82123Ke
            public final void LIZJ(List<? extends C3L4> sessionList, boolean z) {
                o.LJIIIZ(sessionList, "sessionList");
                C82513Lr LJII = C3K3.LIZ().LJII();
                FocusedSessionListViewModelImpl.this.rn(ORZ.LLJILJILJ(ORZ.LLILII((Comparator) LJII.LJLIL.getValue(), sessionList)), z, false, LJII.LJLJLLL);
            }
        };
        this.LJLLI = r1;
        this.LJLLILLLL = new ArrayList();
        distinctUntilChangedLiveData.postValue(bool);
        if (C3TX.LIZIZ()) {
            C82513Lr LJII = C3K3.LIZ().LJII();
            LJII.getClass();
            LJII.LJLJL.add(r1);
        } else {
            if (LIZIZ == null) {
                return;
            }
            LIZIZ.LIZLLL(this, LIZIZ.LJLILLLLZI);
        }
    }

    @Override // X.C3SR
    public final AbstractC73430Srq XT(boolean z) {
        if (z) {
            C73849Syb<C3OH> c73849Syb = this.LJLJLJ;
            c73849Syb.getClass();
            return new C73426Srm(c73849Syb).LJIILIIL();
        }
        C73849Syb<C3OH> c73849Syb2 = this.LJLJLJ;
        return C42193GhB.LIZJ(c73849Syb2, c73849Syb2);
    }

    @Override // X.C3SR
    public final void av(int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onSeePreviousMessagesClick ");
        LIZ.append(i);
        C34B.LJI("FocusedSessionListViewModelImpl", X1D.LIZIZ(LIZ));
        this.LJLJJL.setValue(Boolean.TRUE);
        C79081V1x.LJJJIL(C83023Nq.LJLIL);
        C85323Wm onEventV3 = C772831o.LIZ();
        o.LJIIIZ(onEventV3, "onEventV3");
        onEventV3.LIZIZ("click_see_all_activities", C113554cx.LJJL(new OSZ("tab_name", "chat"), new OSZ("enter_from", "notification_page"), new OSZ("notice_type", "previous"), new OSZ("show_cnt", String.valueOf(i))));
    }

    @Override // X.C3SR
    public final int qp0(int i) {
        if (i < 0) {
            return -1;
        }
        Iterator it = ((ArrayList) this.LJLLILLLL).iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (((C3L4) it.next()).LJLLILLLL > 0) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    @Override // X.C3LO
    public final void xE(boolean z) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("loadMoreFail ");
        LIZ.append(z);
        C34B.LJI("FocusedSessionListViewModelImpl", X1D.LIZIZ(LIZ));
    }

    @Override // X.C3SR
    public final void Fd(String str, String str2) {
        C3TV.LJII(C3TV.LIZ, this.LJLL.LIZ, str, str2, this.LJLL.LIZIZ);
    }

    @Override // X.C3SR
    public final void I0(int i, int i2) {
        C82253Kr c82253Kr;
        Object obj;
        boolean z;
        InterfaceC81953Jn interfaceC81953Jn;
        boolean z2;
        if (C3TX.LIZIZ()) {
            C3K3.LIZ().I0(i, i2);
            return;
        }
        C3L0 c3l0 = this.LJLILLLLZI;
        if (!(c3l0 instanceof C82253Kr) || (c82253Kr = (C82253Kr) c3l0) == null) {
            return;
        }
        Iterator it = ((ConcurrentHashMap) c82253Kr.LJLJI).keySet().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                C81983Jq c81983Jq = (C81983Jq) obj;
                if (c81983Jq.LIZIZ.getValue() == i && c81983Jq.LIZJ.getValue() == i2) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C81983Jq c81983Jq2 = (C81983Jq) obj;
        if (c81983Jq2 == null) {
            C34B.LJI("SessionListManagerV2", "not found the target selection, create new page");
            EnumC82443Lk.Companion.getClass();
            EnumC82443Lk LIZ = C82693Mj.LIZ(i);
            EnumC82403Lg.Companion.getClass();
            c81983Jq2 = C82253Kr.LJIIIZ(LIZ, C82393Lf.LIZ(i2), false);
            C81903Ji c81903Ji = InterfaceC81953Jn.LIZ;
            C82373Ld c82373Ld = c82253Kr.LJLLLLLL;
            c81903Ji.getClass();
            ((ConcurrentHashMap) c82253Kr.LJLJI).put(c81983Jq2, C81903Ji.LIZ(c81983Jq2, false, c82373Ld));
            z = true;
        } else {
            z = false;
        }
        C3K4 c3k4 = C3K4.LIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("10(");
        LIZ2.append(i);
        LIZ2.append('_');
        LIZ2.append(i2);
        LIZ2.append(')');
        C3K4.LIZJ(c3k4, X1D.LIZIZ(LIZ2));
        if (C3KQ.LIZ().cacheStrategy == 1) {
            Set keySet = ((ConcurrentHashMap) c82253Kr.LJLJI).keySet();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : keySet) {
                C81983Jq c81983Jq3 = (C81983Jq) obj2;
                if (c81983Jq3.LIZJ != EnumC82403Lg.ALL && !o.LJ(c81983Jq3.LIZ, c81983Jq2.LIZ)) {
                    arrayList.add(obj2);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                Object remove = ((ConcurrentHashMap) c82253Kr.LJLJI).remove(next);
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("remove page:");
                LIZ3.append(next);
                LIZ3.append(" isSuccess:");
                if (remove != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                LIZ3.append(z2);
                C34B.LJI("SessionListManagerV2", X1D.LIZIZ(LIZ3));
            }
        }
        StringBuilder sb = new StringBuilder("notifySelectionChange: category=");
        EnumC82443Lk.Companion.getClass();
        sb.append(C82693Mj.LIZ(i));
        sb.append(", filter=");
        EnumC82403Lg.Companion.getClass();
        sb.append(C82393Lf.LIZ(i2));
        sb.append(", currPageData=");
        sb.append(c82253Kr.LJ());
        C34B.LJI("SessionListManagerV2", sb.toString());
        c82253Kr.LJLJJI = c81983Jq2;
        InterfaceC81953Jn LJ = c82253Kr.LJ();
        if (LJ == null) {
            C78983UzD.LJIILL("currentPaginationData is null");
            return;
        }
        if (z) {
            if (C3KQ.LIZ().initNewPageWithMemorySession && !(!LJ.LJII().isEmpty()) && c81983Jq2.LIZJ != EnumC82403Lg.ALL) {
                Iterator it3 = ((ConcurrentHashMap) c82253Kr.LJLJI).keySet().iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    Object next2 = it3.next();
                    C81983Jq c81983Jq4 = (C81983Jq) next2;
                    if (c81983Jq4.LIZIZ == c81983Jq2.LIZIZ && c81983Jq4.LIZJ == EnumC82403Lg.ALL) {
                        if (next2 != null && (interfaceC81953Jn = (InterfaceC81953Jn) ((ConcurrentHashMap) c82253Kr.LJLJI).get(next2)) != null) {
                            Map<String, C3L4> LJII = interfaceC81953Jn.LJII();
                            Map<String, C3L4> LJII2 = LJ.LJII();
                            for (Map.Entry<String, C3L4> entry : LJII.entrySet()) {
                                if (c81983Jq2.LIZLLL.invoke(entry.getValue()).booleanValue()) {
                                    LJII2.put(entry.getKey(), entry.getValue());
                                }
                            }
                            LJ.LJIIIZ(interfaceC81953Jn.LJIILIIL());
                            if (!((ArrayList) C82253Kr.LJIIL(LJ.LJII().values())).isEmpty()) {
                                LJ.LJIIL();
                            }
                        }
                    }
                }
            }
            C3JY LJIIJ = LJ.LJIIJ();
            int size = LJ.LJII().size();
            LJIIJ.getClass();
            LJIIJ.LJLJJI = System.currentTimeMillis();
            if (size > 0) {
                LJIIJ.LJLJJL = 0;
            }
        }
        boolean isEmpty = ((ArrayList) C82253Kr.LJIIL(LJ.LJII().values())).isEmpty();
        if ((z || isEmpty) && LJ.LJIILL()) {
            C34B.LJI("SessionListManagerV2", "notifySelectionChange: data is empty, load more, " + LJ);
            C82253Kr.LJJI(c82253Kr);
            C82153Kh c82153Kh = c82253Kr.LJLJL;
            ARunnableS20S0200000_1 aRunnableS20S0200000_1 = new ARunnableS20S0200000_1(c82253Kr, LJ, 43);
            c82153Kh.getClass();
            XKX.LIZLLL(c82153Kh.LIZIZ, null, null, new C62762dE(aRunnableS20S0200000_1, null), 3);
            return;
        }
        C34B.LJI("SessionListManagerV2", "notifySelectionChange: data is not empty, refresh");
        C3L0.LJIIIIZZ(c82253Kr, 0, LJ, 3);
    }

    @Override // X.C3SR
    public final void Gr0(Integer num, String str, String str2) {
        C3Y4.LJFF(num, "1", str, str2);
    }

    @Override // X.C3LO
    public final void rn(List<C3L4> list, boolean z, boolean z2, C81983Jq sessionPage) {
        boolean z3;
        List<C3L4> list2 = list;
        o.LJIIIZ(sessionPage, "sessionPage");
        synchronized (this) {
            z3 = false;
            if (this.LJLJLLL) {
                this.LJLJLLL = false;
                XKX.LIZLLL(ViewModelKt.getViewModelScope(this), this.LJLJJI, null, new C787137b(this, list2, null), 2);
            }
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onSessionDataUpdated: sessionPage=");
        LIZ.append(sessionPage);
        LIZ.append(" hasMore=");
        LIZ.append(z);
        LIZ.append(", result=");
        ArrayList arrayList = (ArrayList) list2;
        LIZ.append(arrayList.size());
        LIZ.append(", isLoading=");
        LIZ.append(z2);
        C34B.LJI("FocusedSessionListViewModelImpl", X1D.LIZIZ(LIZ));
        if (o.LJ(this.LJLJJL.getValue(), Boolean.TRUE)) {
            this.LJLL = new C82363Lc(arrayList.size(), arrayList.size());
        } else {
            list2 = ORZ.LLJILJILJ(this.LJLIL.LIZ(list2));
            ArrayList arrayList2 = (ArrayList) list2;
            this.LJLL = new C82363Lc(arrayList.size(), arrayList2.size());
            if (arrayList2.size() < arrayList.size()) {
                C3L4 c3l4 = new C3L4() { // from class: X.3Nr
                    @Override // X.C3L4
                    public final String LJFF() {
                        return "show_previous_message";
                    }

                    @Override // X.C3L4
                    public final int LJIIIIZZ() {
                        return -1;
                    }

                    @Override // X.C3L4
                    public final void LJIIIZ() {
                    }

                    @Override // X.C3L4
                    public final C3OB LIZJ() {
                        return new C3OB() { // from class: X.3Ns
                            @Override // X.C3OB
                            public final void LIZ(ActivityC45651qj activity, C3L4 session, int i, java.util.Map<String, String> map) {
                                o.LJIIIZ(activity, "activity");
                                o.LJIIIZ(session, "session");
                            }
                        };
                    }

                    {
                        this.LJLILLLLZI = "show_previous_message";
                    }
                };
                ArrayList arrayList3 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (!arrayList2.contains(next)) {
                        arrayList3.add(next);
                    }
                }
                ArrayList arrayList4 = new ArrayList(C32I.LJJL(arrayList3, 10));
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(Integer.valueOf(((C3L4) it2.next()).LJLLILLLL));
                }
                Iterator it3 = arrayList4.iterator();
                int i = 0;
                while (it3.hasNext()) {
                    i += ((Number) it3.next()).intValue();
                }
                c3l4.LJLLILLLL = i;
                Iterator it4 = arrayList3.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    Object next2 = it4.next();
                    if (((C3L4) next2).LJLLJ) {
                        if (next2 != null) {
                            z3 = true;
                        }
                    }
                }
                c3l4.LJLLJ = z3;
                arrayList2.add(c3l4);
            }
        }
        StringBuilder LJI = JBR.LJI("hasMore:", z, ", focusedOnly result:");
        LJI.append(list2.size());
        C34B.LJI("FocusedSessionListViewModelImpl", X1D.LIZIZ(LJI));
        synchronized (this) {
            ((ArrayList) this.LJLLILLLL).clear();
            ((ArrayList) this.LJLLILLLL).addAll(list2);
        }
        this.LJLJLJ.onNext(new C3OH(z, sessionPage.LIZIZ.getValue(), sessionPage.LIZJ.getValue(), 1 ^ (z2 ? 1 : 0), list2));
    }
}
