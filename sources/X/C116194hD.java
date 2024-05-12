package X;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.im.service.model.ActivityStatus;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.inbox.skylight.plat.InboxSkylightListState;
import com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightListViewModel;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.AqS167S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.4hD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C116194hD extends AbstractC116364hU<C116144h8> {
    public final C62822Ol8 LIZJ;
    public final SkylightListViewModel LIZLLL;
    public final List<C116144h8> LJ;
    public final C62822Ol8 LJFF;
    public final C62822Ol8 LJI;
    public final C62822Ol8 LJII;
    public final C62822Ol8 LJIIIIZZ;
    public final C62822Ol8 LJIIIZ;
    public final AtomicInteger LJIIJ;
    public final int LJIIJJI;
    public XKQ LJIIL;
    public final long LJIILIIL;
    public final ConcurrentHashMap<Integer, CopyOnWriteArrayList<LiveData<ActivityStatus>>> LJIILJJIL;
    public final ConcurrentHashMap<Integer, CopyOnWriteArrayList<InterfaceC80823Fe>> LJIILL;
    public final ConcurrentHashSet<String> LJIILLIIL;
    public boolean LJIIZILJ;
    public boolean LJIJ;

    @Override // X.AbstractC116364hU
    public final Object LIZJ() {
        List<T> LIZIZ;
        synchronized (this) {
            List<C116144h8> list = this.LJ;
            ArrayList arrayList = new ArrayList();
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                C116144h8 c116144h8 = (C116144h8) next;
                String uid = c116144h8.LJLIL.getUid();
                InterfaceC116134h7 interfaceC116134h7 = this.LIZ;
                o.LJIIIIZZ(uid, "uid");
                if (interfaceC116134h7.LJFF(this.LIZ.LJI(6), uid) && !C54838Lfe.LJIIJJI(uid) && c116144h8.LJLILLLLZI) {
                    arrayList.add(next);
                }
            }
            LIZIZ = C65777Prh.LIZIZ(arrayList);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("filtered list size ");
            LIZ.append(LIZIZ.size());
            C34B.LJI("SkylightDMModule", X1D.LIZIZ(LIZ));
        }
        this.LIZIZ = LIZIZ;
        return this;
    }

    @Override // X.AbstractC116364hU
    public final Object LIZLLL() {
        return this;
    }

    @Override // X.AbstractC116364hU
    public final C76800UCe LIZ() {
        for (T t : this.LIZIZ) {
            ConcurrentHashMap<String, Integer> LIZ = this.LIZ.LIZ();
            String uid = t.LJLIL.getUid();
            o.LJIIIIZZ(uid, "imUserPowerItem.contact.uid");
            LIZ.put(uid, new Integer(this.LIZ.LJI(6)));
        }
        if (C53117Ksz.LIZIZ) {
            XKX.LIZLLL(this.LIZLLL.getAssemVMScope(), C36636EZk.LIZ, null, new C116164hA(this, null), 2);
        } else {
            AssemViewModel.asyncSubscribe$default(this.LIZLLL, new TBT() { // from class: X.4hM
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((InboxSkylightListState) obj).getRefreshState();
                }
            }, C213688a4.LIZLLL(), null, null, new AqS167S0100000_1(this, 292), 12, null);
        }
        return C76800UCe.LIZ;
    }

    public final int LJI() {
        return ((Number) this.LIZJ.getValue()).intValue();
    }

    public final void LJIIIZ() {
        Iterator LIZLLL = C47135Ieh.LIZLLL(this.LJIILJJIL, "userLiveDataListMap.values");
        while (LIZLLL.hasNext()) {
            CopyOnWriteArrayList list = (CopyOnWriteArrayList) LIZLLL.next();
            o.LJIIIIZZ(list, "list");
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((LiveData) it.next()).removeObservers(this.LIZLLL);
            }
        }
        CopyOnWriteArrayList<LiveData<ActivityStatus>> copyOnWriteArrayList = this.LJIILJJIL.get(Integer.valueOf(LJI()));
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.clear();
        }
        if (((Boolean) this.LJIIIZ.getValue()).booleanValue()) {
            Iterator LIZLLL2 = C47135Ieh.LIZLLL(this.LJIILL, "userObserverListMap.values");
            while (LIZLLL2.hasNext()) {
                CopyOnWriteArrayList list2 = (CopyOnWriteArrayList) LIZLLL2.next();
                o.LJIIIIZZ(list2, "list");
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    InterfaceC80823Fe it3 = (InterfaceC80823Fe) it2.next();
                    C3GF c3gf = (C3GF) this.LJFF.getValue();
                    o.LJIIIIZZ(it3, "it");
                    c3gf.LJIIJ(it3);
                }
            }
            CopyOnWriteArrayList<InterfaceC80823Fe> copyOnWriteArrayList2 = this.LJIILL.get(Integer.valueOf(LJI()));
            if (copyOnWriteArrayList2 != null) {
                copyOnWriteArrayList2.clear();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C116194hD(InterfaceC116134h7 ft) {
        super(ft);
        o.LJIIIZ(ft, "ft");
        this.LIZJ = C221108m2.LIZIZ(new AqS151S0100000_1(this, 834));
        LifecycleOwner LIZJ = ft.LIZJ();
        o.LJII(LIZJ, "null cannot be cast to non-null type com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightListViewModel");
        this.LIZLLL = (SkylightListViewModel) LIZJ;
        this.LJ = new ArrayList();
        this.LJFF = C221108m2.LIZIZ(C116254hJ.LJLIL);
        this.LJI = C221108m2.LIZIZ(C116274hL.LJLIL);
        this.LJII = C221108m2.LIZIZ(C116244hI.LJLIL);
        this.LJIIIIZZ = C221108m2.LIZIZ(C116264hK.LJLIL);
        this.LJIIIZ = C221108m2.LIZIZ(C116234hH.LJLIL);
        this.LJIIJ = new AtomicInteger(0);
        C3AL.LIZ.getClass();
        this.LJIIJJI = C3AL.LIZ().num_of_inbox_sky_light_status_limit_count;
        this.LJIILIIL = 500L;
        this.LJIILJJIL = new ConcurrentHashMap<>();
        this.LJIILL = new ConcurrentHashMap<>();
        this.LJIILLIIL = new ConcurrentHashSet<>();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // X.AbstractC116364hU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC67352kd<? super X.AbstractC116364hU<X.C116144h8>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C116204hE
            if (r0 == 0) goto L85
            r3 = r7
            X.4hE r3 = (X.C116204hE) r3
            int r2 = r3.LJLJJL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L85
            int r2 = r2 - r1
            r3.LJLJJL = r2
        L12:
            java.lang.Object r2 = r3.LJLJI
            X.NAu r1 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r3.LJLJJL
            r4 = 1
            if (r0 == 0) goto L63
            if (r0 != r4) goto L8c
            java.lang.Object r0 = r3.LJLILLLLZI
            java.util.List r0 = (java.util.List) r0
            X.4hD r5 = r3.LJLIL
            X.C141335gf.LIZJ(r2)
        L26:
            java.util.Collection r2 = (java.util.Collection) r2
            r0.addAll(r2)
            java.util.List<X.4h8> r0 = r5.LJ
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r3 = r0.iterator()
        L33:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L8b
            java.lang.Object r2 = r3.next()
            X.4h8 r2 = (X.C116144h8) r2
            com.ss.android.ugc.effectmanager.common.ConcurrentHashSet<java.lang.String> r1 = r5.LJIILLIIL
            com.ss.android.ugc.aweme.im.service.model.IMUser r0 = r2.LJLIL
            java.lang.String r0 = r0.getUid()
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L4f
            r2.LJLILLLLZI = r4
        L4f:
            X.4h7 r1 = r5.LIZ
            r0 = 6
            int r0 = r1.LJI(r0)
            r2.LJLJI = r0
            java.util.List<X.4h8> r0 = r5.LJ
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.indexOf(r2)
            r2.LJLJJI = r0
            goto L33
        L63:
            X.C141335gf.LIZJ(r2)
            r6.LJIIZILJ = r4
            java.util.List<X.4h8> r0 = r6.LJ
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.clear()
            java.util.List<T extends X.Mm4> r0 = r6.LIZIZ
            r0.clear()
            java.util.List<X.4h8> r0 = r6.LJ
            r3.LJLIL = r6
            r3.LJLILLLLZI = r0
            r3.LJLJJL = r4
            java.lang.Object r2 = r6.LJII(r3)
            if (r2 != r1) goto L83
            return r1
        L83:
            r5 = r6
            goto L26
        L85:
            X.4hE r3 = new X.4hE
            r3.<init>(r6, r7)
            goto L12
        L8b:
            return r5
        L8c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C116194hD.LIZIZ(X.2kd):java.lang.Object");
    }

    public final void LJFF(C72808Sho<InterfaceC57784Mm4> c72808Sho) {
        if (!this.LJIIZILJ || ((ArrayList) this.LJ).isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.LJ);
        XKQ xkq = this.LJIIL;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        this.LJIIL = XKX.LIZLLL(this.LIZLLL.getAssemVMScope(), EXV.LIZ, null, new C116184hC(this, arrayList, c72808Sho, null), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(X.InterfaceC67352kd<? super java.util.List<X.C116144h8>> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C116214hF
            if (r0 == 0) goto Lc2
            r5 = r8
            X.4hF r5 = (X.C116214hF) r5
            int r2 = r5.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lc2
            int r2 = r2 - r1
            r5.LJLJJI = r2
        L12:
            java.lang.Object r6 = r5.LJLILLLLZI
            X.NAu r4 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJJI
            java.lang.String r2 = "vh: "
            java.lang.String r3 = "InboxTopVM"
            r1 = 1
            if (r0 == 0) goto L4c
            if (r0 != r1) goto Lc9
            X.4hD r0 = r5.LJLIL
            X.C141335gf.LIZJ(r6)
        L26:
            java.util.List r6 = (java.util.List) r6
            r0.LJIIZILJ = r1
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            r1.append(r2)
            int r0 = r0.LJI()
            r1.append(r0)
            java.lang.String r0 = " loadDmList, end, size: "
            r1.append(r0)
            int r0 = r6.size()
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.C221018lt.LJFF(r3, r0)
            return r6
        L4c:
            X.C141335gf.LIZJ(r6)
            X.Ol8 r0 = r7.LJII
            java.lang.Object r0 = r0.getValue()
            X.3B2 r0 = (X.C3B2) r0
            X.4Ji r0 = r0.getSettings()
            boolean r0 = r0.LJFF()
            if (r0 == 0) goto L67
            boolean r0 = X.C107454Jp.LIZIZ()
            if (r0 != 0) goto L84
        L67:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            r1.append(r2)
            int r0 = r7.LJI()
            r1.append(r0)
            java.lang.String r0 = " dm experiment no on, complete loading"
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.C221018lt.LJFF(r3, r0)
            X.OQg r0 = X.C61878OQg.INSTANCE
            return r0
        L84:
            boolean r0 = X.C53117Ksz.LIZIZ
            if (r0 == 0) goto Lac
            X.Ol8 r0 = r7.LJIIIIZZ
            java.lang.Object r0 = r0.getValue()
            X.4hB r0 = (X.InterfaceC116174hB) r0
            java.util.List r2 = r0.LIZIZ()
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "load dm list, size "
            r1.append(r0)
            int r0 = r2.size()
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.C221018lt.LJFF(r3, r0)
            return r2
        Lac:
            X.Ol8 r0 = r7.LJI
            java.lang.Object r0 = r0.getValue()
            com.ss.android.ugc.aweme.im.service.service.IImInboxDmService r0 = (com.ss.android.ugc.aweme.im.service.service.IImInboxDmService) r0
            r5.LJLIL = r7
            r5.LJLJJI = r1
            java.lang.Object r6 = r0.getActiveContacts(r5)
            if (r6 != r4) goto Lbf
            return r4
        Lbf:
            r0 = r7
            goto L26
        Lc2:
            X.4hF r5 = new X.4hF
            r5.<init>(r7, r8)
            goto L12
        Lc9:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C116194hD.LJII(X.2kd):java.lang.Object");
    }

    public final void LJIIIIZZ(final C116144h8 c116144h8) {
        if (!((Boolean) this.LJIIIZ.getValue()).booleanValue()) {
            return;
        }
        InterfaceC80823Fe interfaceC80823Fe = new InterfaceC80823Fe() { // from class: X.4hG
            @Override // X.InterfaceC80823Fe
            public final void LIZ(IMUser iMUser) {
                if (iMUser != null && C116194hD.this.LIZLLL.listIndexOf((SkylightListViewModel) c116144h8) >= 0) {
                    C116144h8 c116144h82 = c116144h8;
                    if (c116144h82.LJLILLLLZI && o.LJ(iMUser, c116144h82.LJLIL)) {
                        C116194hD.this.LIZLLL.listSetItem((SkylightListViewModel) new C116144h8(iMUser, c116144h8.LJLILLLLZI, 12));
                    }
                }
            }
        };
        C3GF c3gf = (C3GF) this.LJFF.getValue();
        String uid = c116144h8.LJLIL.getUid();
        if (uid == null) {
            uid = "";
        }
        c3gf.LJI(uid, interfaceC80823Fe);
        CopyOnWriteArrayList<InterfaceC80823Fe> copyOnWriteArrayList = this.LJIILL.get(Integer.valueOf(LJI()));
        if (copyOnWriteArrayList == null) {
            this.LJIILL.put(Integer.valueOf(LJI()), new CopyOnWriteArrayList<>());
            copyOnWriteArrayList = this.LJIILL.get(Integer.valueOf(LJI()));
            if (copyOnWriteArrayList == null) {
                return;
            }
        }
        copyOnWriteArrayList.add(interfaceC80823Fe);
    }
}
