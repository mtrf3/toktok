package com.ss.android.ugc.aweme.relation.usercard.vm;

import X.A2G;
import X.AYY;
import X.AbstractC72278SYg;
import X.ActivityC45651qj;
import X.C221108m2;
import X.C27484AqW;
import X.C2K0;
import X.C33Q;
import X.C39557Ffl;
import X.C55096Ljo;
import X.C55230Lly;
import X.C57773Mlt;
import X.C57859MnH;
import X.C57898Mnu;
import X.C57949Moj;
import X.C57951Mol;
import X.C57962Mow;
import X.C57967Mp1;
import X.C57969Mp3;
import X.C57979MpD;
import X.C58029Mq1;
import X.C62822Ol8;
import X.C78613UtF;
import X.C8HZ;
import X.InterfaceC55235Lm3;
import X.InterfaceC57784Mm4;
import X.InterfaceC65350Pko;
import X.InterfaceC67352kd;
import X.InterfaceC70422pa;
import X.OSZ;
import X.X1D;
import X.XIA;
import X.XJO;
import X.XJR;
import X.XKS;
import X.XKW;
import X.XKX;
import androidx.fragment.app.Fragment;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.bytedance.ies.powerlist.page.config.PowerPageSource;
import com.ss.android.ugc.aweme.relation.usercard.ability.IAuthCardListScopeAbility;
import com.ss.android.ugc.aweme.relation.usercard.ability.IOptimizeAbility;
import com.ss.android.ugc.aweme.relation.usercard.ability.IUserCardListAbility;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS140S0200000_9;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public class UserCardListViewModel extends AssemListViewModel<C57949Moj, InterfaceC57784Mm4, C57967Mp1> {
    public C57859MnH LJLIL;
    public final String LJLILLLLZI;
    public final C58029Mq1<C57967Mp1> LJLJI;
    public final XKW LJLJJI;
    public final String LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final C62822Ol8 LJLJL;
    public final C62822Ol8 LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public InterfaceC55235Lm3 LJLL;
    public boolean LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public final XJO LJLLJ;
    public final C62822Ol8 LJLLL;

    public UserCardListViewModel() {
        throw null;
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onRefresh(InterfaceC67352kd<? super A2G<C57967Mp1>> interfaceC67352kd) {
        return mv0(this, interfaceC67352kd);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new C57949Moj(0);
    }

    public final IUserCardListAbility iv0() {
        return (IUserCardListAbility) this.LJLJL.getValue();
    }

    public final C57962Mow jv0() {
        return (C57962Mow) this.LJLJJLL.getValue();
    }

    public final void kv0() {
        InterfaceC55235Lm3 LIZLLL;
        C57859MnH c57859MnH = this.LJLIL;
        o.LJIIIZ(c57859MnH, "<this>");
        Fragment hostFragment = c57859MnH.getHostFragment();
        if (hostFragment != null) {
            LIZLLL = C55230Lly.LIZJ(hostFragment, null);
        } else {
            ActivityC45651qj hostActivity = c57859MnH.getHostActivity();
            if (hostActivity != null) {
                LIZLLL = C55230Lly.LIZLLL(hostActivity, null);
            } else {
                "not attach context".toString();
                throw new IllegalStateException("not attach context");
            }
        }
        this.LJLL = LIZLLL;
        for (OSZ osz : (List) this.LJLLILLLL.getValue()) {
            C55096Ljo.LJIIJJI(LIZLLL, (C2K0) osz.getFirst(), C39557Ffl.LIZ((InterfaceC65350Pko) osz.getSecond()), this.LJLILLLLZI);
        }
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel, com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void manualListRefresh() {
        withState(new AqS175S0100000_9(this, 255));
    }

    public final void nv0() {
        AYY ayy = AYY.LIZ;
        String str = this.LJLJJL;
        ayy.getClass();
        AYY.LIZIZ(str, "user touch, set PageMerge to is append");
        C57979MpD c57979MpD = jv0().LJLLJ;
        if (!(c57979MpD instanceof C57979MpD) || c57979MpD == null) {
            return;
        }
        c57979MpD.LIZ = true;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        XKS xks;
        ((IAuthCardListScopeAbility) this.LJLJLJ.getValue()).onCleared();
        iv0().onCleared();
        InterfaceC55235Lm3 interfaceC55235Lm3 = this.LJLL;
        if (interfaceC55235Lm3 != null) {
            Iterator it = ((List) this.LJLLILLLL.getValue()).iterator();
            while (it.hasNext()) {
                C55096Ljo.LJIILL(interfaceC55235Lm3, C39557Ffl.LIZ((InterfaceC65350Pko) ((OSZ) it.next()).getSecond()), this.LJLILLLLZI);
            }
        }
        this.hierarchyDataStore = null;
        this.hierarchyServiceStore = null;
        C58029Mq1<C57967Mp1> c58029Mq1 = this.LJLJI;
        if (c58029Mq1 != null && (xks = c58029Mq1.LJLJJI) != null) {
            xks.LJJIJIL(null);
        }
        C27484AqW.LIZJ(new AqS159S0100000_9(this, 579));
        super.onCleared();
        AYY ayy = AYY.LIZ;
        String str = this.LJLJJL;
        ayy.getClass();
        AYY.LIZIZ(str, "viewModel cleared!");
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        C58029Mq1<C57967Mp1> c58029Mq1 = this.LJLJI;
        if (c58029Mq1 != null) {
            InterfaceC70422pa scope = getAssemVMScope();
            AbstractC72278SYg<C57967Mp1> source = getConfig();
            o.LJIIIZ(scope, "scope");
            o.LJIIIZ(source, "source");
            c58029Mq1.LJLILLLLZI = scope;
            c58029Mq1.LJLJI = source;
            Field declaredField = PowerPageSource.class.getDeclaredField("operator");
            declaredField.setAccessible(true);
            declaredField.set(getConfig(), c58029Mq1);
        }
        o.LJIIIZ(this.LJLIL, "<this>");
        XKX.LIZLLL(getAssemVMScope(), this.LJLJJI, null, new C57773Mlt(this, null), 2);
        if (this.LJLIL.getTrackerConfig().LJ) {
            runOnWorkThread(new AqS175S0100000_9(this, 257));
        } else {
            kv0();
        }
    }

    public final void reset() {
        setStateImmediate(new AqS175S0100000_9(this, 258));
        XKX.LIZLLL(getAssemVMScope(), null, null, new C57951Mol(this, null), 3);
        ((IOptimizeAbility) this.LJLJLLL.getValue()).Kh0();
    }

    public static final /* synthetic */ void hv0(UserCardListViewModel userCardListViewModel) {
        super.manualListRefresh();
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel, com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void manualListLoadMore(Object obj) {
        withState(new AqS140S0200000_9(this, ((C57969Mp3) jv0().LJLJL.getValue()).LIZJ, 1));
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C8HZ<InterfaceC57784Mm4> newListState) {
        o.LJIIIZ(newListState, "newListState");
        setState(new AqS175S0100000_9(newListState, (C8HZ<InterfaceC57784Mm4>) 256));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object mv0(com.ss.android.ugc.aweme.relation.usercard.vm.UserCardListViewModel r5, X.InterfaceC67352kd<? super X.A2G<X.C57967Mp1>> r6) {
        /*
            boolean r0 = r6 instanceof X.C57956Moq
            if (r0 == 0) goto L46
            r4 = r6
            X.Moq r4 = (X.C57956Moq) r4
            int r2 = r4.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L46
            int r2 = r2 - r1
            r4.LJLJI = r2
        L12:
            java.lang.Object r1 = r4.LJLIL
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJI
            r2 = 1
            if (r0 == 0) goto L29
            if (r0 != r2) goto L4c
            X.C141335gf.LIZJ(r1)
        L20:
            X.Mp5 r1 = (X.C57971Mp5) r1
            X.Mlu<com.ss.android.ugc.aweme.relation.model.RecUser> r0 = r1.LIZIZ
            X.A2G r0 = X.C57964Moy.LJFF(r0)
            return r0
        L29:
            X.C141335gf.LIZJ(r1)
            X.AYY r0 = X.AYY.LIZ
            java.lang.String r1 = r5.LJLJJL
            r0.getClass()
            java.lang.String r0 = "invoke refresh!"
            X.AYY.LIZIZ(r1, r0)
            X.Mow r1 = r5.jv0()
            r4.LJLJI = r2
            r0 = 0
            java.lang.Object r1 = r1.LJIJJLI(r2, r0, r4)
            if (r1 != r3) goto L20
            return r3
        L46:
            X.Moq r4 = new X.Moq
            r4.<init>(r5, r6)
            goto L12
        L4c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.relation.usercard.vm.UserCardListViewModel.mv0(com.ss.android.ugc.aweme.relation.usercard.vm.UserCardListViewModel, X.2kd):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final Object onLoadMore(C57967Mp1 c57967Mp1, InterfaceC67352kd<? super A2G<C57967Mp1>> interfaceC67352kd) {
        return lv0(this, c57967Mp1, interfaceC67352kd);
    }

    public UserCardListViewModel(C57859MnH globalConfig, String abilityTag, C58029Mq1 c58029Mq1) {
        XIA ioDispatcher = C78613UtF.LIZJ;
        o.LJIIIZ(globalConfig, "globalConfig");
        o.LJIIIZ(abilityTag, "abilityTag");
        o.LJIIIZ(ioDispatcher, "ioDispatcher");
        this.LJLIL = globalConfig;
        this.LJLILLLLZI = abilityTag;
        this.LJLJI = c58029Mq1;
        this.LJLJJI = ioDispatcher;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C57898Mnu.LJ(this.LJLIL));
        LIZ.append("|VM");
        this.LJLJJL = X1D.LIZIZ(LIZ);
        this.LJLJJLL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 27));
        this.LJLJL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 25));
        this.LJLJLJ = C221108m2.LIZIZ(new AqS159S0100000_9(this, 22));
        this.LJLJLLL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 26));
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 21));
        this.LJLLJ = XJR.LIZ();
        this.LJLLL = C221108m2.LIZIZ(new AqS159S0100000_9(this, 23));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object lv0(com.ss.android.ugc.aweme.relation.usercard.vm.UserCardListViewModel r5, X.C57967Mp1 r6, X.InterfaceC67352kd<? super X.A2G<X.C57967Mp1>> r7) {
        /*
            boolean r0 = r7 instanceof X.C57952Mom
            if (r0 == 0) goto L46
            r4 = r7
            X.Mom r4 = (X.C57952Mom) r4
            int r2 = r4.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L46
            int r2 = r2 - r1
            r4.LJLJI = r2
        L12:
            java.lang.Object r1 = r4.LJLIL
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJI
            r2 = 1
            if (r0 == 0) goto L29
            if (r0 != r2) goto L4c
            X.C141335gf.LIZJ(r1)
        L20:
            X.Mp5 r1 = (X.C57971Mp5) r1
            X.Mlu<com.ss.android.ugc.aweme.relation.model.RecUser> r0 = r1.LIZIZ
            X.A2G r0 = X.C57964Moy.LJFF(r0)
            return r0
        L29:
            X.C141335gf.LIZJ(r1)
            X.AYY r0 = X.AYY.LIZ
            java.lang.String r1 = r5.LJLJJL
            r0.getClass()
            java.lang.String r0 = "invoke loadMore"
            X.AYY.LIZIZ(r1, r0)
            X.Mow r1 = r5.jv0()
            r4.LJLJI = r2
            r0 = 0
            java.lang.Object r1 = r1.LJIJJLI(r0, r6, r4)
            if (r1 != r3) goto L20
            return r3
        L46:
            X.Mom r4 = new X.Mom
            r4.<init>(r5, r7)
            goto L12
        L4c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.relation.usercard.vm.UserCardListViewModel.lv0(com.ss.android.ugc.aweme.relation.usercard.vm.UserCardListViewModel, X.Mp1, X.2kd):java.lang.Object");
    }
}
