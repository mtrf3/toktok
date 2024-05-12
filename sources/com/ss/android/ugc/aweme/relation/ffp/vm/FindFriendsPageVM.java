package com.ss.android.ugc.aweme.relation.ffp.vm;

import X.C00F;
import X.C188727au;
import X.C221018lt;
import X.C227628wY;
import X.C227638wZ;
import X.C51029K0z;
import X.C52772KnQ;
import X.C57571Mid;
import X.C63779P1j;
import X.C63780P1k;
import X.C63797P2b;
import X.C65352Pkq;
import X.C73318Sq2;
import X.C78613UtF;
import X.C84661XKn;
import X.EnumC58046MqI;
import X.EnumC77147UPn;
import X.FMX;
import X.HG3;
import X.InterfaceC237509Tu;
import X.InterfaceC237529Tw;
import X.InterfaceC58007Mpf;
import X.InterfaceC58008Mpg;
import X.ORZ;
import X.OSZ;
import X.P23;
import X.P25;
import X.P26;
import X.P27;
import X.P29;
import X.P2A;
import X.P2T;
import X.QD3;
import X.RBX;
import X.UTK;
import X.X1D;
import X.XIA;
import X.XKW;
import X.XKX;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.profile.model.FollowStatusEvent;
import com.ss.android.ugc.aweme.relation.ffp.FindFriendsPageArg;
import com.ss.android.ugc.aweme.relation.ffp.ui.AnimationAuthFragment;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes11.dex */
public final class FindFriendsPageVM extends AssemViewModel<C63780P1k> implements InterfaceC58008Mpg {
    public final InterfaceC237529Tw LJLIL;
    public final InterfaceC237509Tu LJLILLLLZI;
    public final Keva LJLJI;
    public final InterfaceC58007Mpf LJLJJI;
    public final InterfaceC58007Mpf LJLJJL;
    public final XKW LJLJJLL;
    public FFPMainFragmentVM LJLJL;
    public final P29 LJLJLJ;
    public C84661XKn LJLJLLL;
    public C84661XKn LJLL;
    public final C73318Sq2 LJLLI;
    public final Map<EnumC58046MqI, Boolean> LJLLILLLL;

    public FindFriendsPageVM() {
        UTK utk = UTK.LIZIZ;
        InterfaceC237529Tw contactRepository = utk.LIZJ();
        InterfaceC237509Tu facebookRepository = utk.LJI();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("anim_auth_flag");
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        LIZ.append(curUserId == null ? "" : curUserId);
        Keva repo = Keva.getRepo(X1D.LIZIZ(LIZ));
        o.LJIIIIZZ(repo, "getRepo(ANIM_AUTH_FLAG_REPO + curUid)");
        InterfaceC58007Mpf contactStateManager = utk.LJFF(EnumC58046MqI.CONTACT);
        InterfaceC58007Mpf facebookStateManager = utk.LJFF(EnumC58046MqI.FACEBOOK);
        XIA ioDispatcher = C78613UtF.LIZJ;
        o.LJIIIZ(contactRepository, "contactRepository");
        o.LJIIIZ(facebookRepository, "facebookRepository");
        o.LJIIIZ(contactStateManager, "contactStateManager");
        o.LJIIIZ(facebookStateManager, "facebookStateManager");
        o.LJIIIZ(ioDispatcher, "ioDispatcher");
        this.LJLIL = contactRepository;
        this.LJLILLLLZI = facebookRepository;
        this.LJLJI = repo;
        this.LJLJJI = contactStateManager;
        this.LJLJJL = facebookStateManager;
        this.LJLJJLL = ioDispatcher;
        this.LJLJLJ = new P29();
        this.LJLLI = new C73318Sq2();
        EnumC58046MqI[] values = EnumC58046MqI.values();
        int LJJIIZ = C51029K0z.LJJIIZ(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(LJJIIZ < 16 ? 16 : LJJIIZ);
        for (EnumC58046MqI enumC58046MqI : values) {
            OSZ osz = new OSZ(enumC58046MqI, Boolean.valueOf(enumC58046MqI.isGrant()));
            linkedHashMap.put(osz.getFirst(), osz.getSecond());
        }
        this.LJLLILLLL = linkedHashMap;
    }

    public final FFPMainFragmentVM iv0() {
        FFPMainFragmentVM fFPMainFragmentVM = this.LJLJL;
        if (fFPMainFragmentVM != null) {
            return fFPMainFragmentVM;
        }
        o.LJIJI("ffpMainFragmentVM");
        throw null;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C63780P1k defaultState() {
        boolean z;
        boolean z2;
        int length = EnumC58046MqI.values().length;
        boolean z3 = false;
        int i = 0;
        while (true) {
            if (i < length) {
                if (!r4[i].isGrant()) {
                    z = true;
                    break;
                }
                i++;
            } else {
                z = false;
                break;
            }
        }
        boolean z4 = this.LJLJI.getBoolean("is_shown_anim", false);
        this.LJLJI.storeBoolean("is_shown_anim", true);
        if (C00F.LIZ(31744, 0, "find_friends_page_debug", true) == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (((Number) C52772KnQ.LIZ.getValue()).intValue() == 1 && z && (!z4 || z2)) {
            z3 = true;
        }
        if (z3) {
            this.LJLJLJ.LJFF(C65352Pkq.LIZ(AnimationAuthFragment.class));
            return new C63780P1k(C65352Pkq.LIZ(AnimationAuthFragment.class), new C57571Mid("find_friends_page", null, null, 14), 7);
        }
        return new C63780P1k(null, new C57571Mid("find_friends_page", null, null, 14), 15);
    }

    public final Set<EnumC58046MqI> jv0() {
        EnumC58046MqI[] values = EnumC58046MqI.values();
        ArrayList arrayList = new ArrayList();
        for (EnumC58046MqI enumC58046MqI : values) {
            if (enumC58046MqI.isGrant() && o.LJ(((LinkedHashMap) this.LJLLILLLL).get(enumC58046MqI), Boolean.FALSE)) {
                arrayList.add(enumC58046MqI);
            }
        }
        return ORZ.LLJJ(arrayList);
    }

    public final FindFriendsPageArg kv0() {
        return getState().LJLIL;
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        String str;
        super.onCleared();
        P29 p29 = this.LJLJLJ;
        p29.getClass();
        p29.LJFF = Boolean.valueOf(EnumC58046MqI.CONTACT.isGrant());
        p29.LJI = Boolean.valueOf(EnumC58046MqI.FACEBOOK.isGrant());
        P2A p2a = p29.LIZJ;
        if (p2a != null) {
            p2a.LIZ();
        }
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("previous_page", p29.LJII);
        c188727au.LJIIIZ("current_page", p29.LJIIIIZZ);
        c188727au.LJIIIZ("contact_granted_enter", P29.LIZJ(p29.LIZLLL));
        c188727au.LJIIIZ("facebook_granted_enter", P29.LIZJ(p29.LJ));
        Boolean bool = p29.LJFF;
        String str2 = null;
        if (bool != null) {
            str = P29.LIZJ(bool.booleanValue());
        } else {
            str = null;
        }
        c188727au.LJIIIZ("contact_granted_leave", str);
        Boolean bool2 = p29.LJI;
        if (bool2 != null) {
            str2 = P29.LIZJ(bool2.booleanValue());
        }
        c188727au.LJIIIZ("facebook_granted_leave", str2);
        c188727au.LJ(p29.LIZ().LJLIL, "contact_api_cost");
        c188727au.LJ(p29.LIZIZ().LJLIL, "facebook_api_cost");
        c188727au.LIZLLL(p29.LIZ().LJLJI.getValue(), "contact_api_status");
        c188727au.LIZLLL(p29.LIZIZ().LJLJI.getValue(), "facebook_api_status");
        c188727au.LJ(p29.LIZ.LIZLLL.LJLIL, "maf_api_cost");
        c188727au.LIZLLL(p29.LIZ.LIZLLL.LJLJI.getValue(), "maf_api_status");
        c188727au.LIZLLL(p29.LIZ.LIZLLL.LJLILLLLZI, "maf_count");
        c188727au.LJIIIZ("has_more", P29.LIZJ(p29.LIZ.LIZLLL.LJLJJI));
        c188727au.LJ(p29.LIZ.LJ, "total_api_cost");
        c188727au.LJ(p29.LIZIZ.LIZLLL.LJLIL, "maf_api_cost_2");
        c188727au.LIZLLL(p29.LIZIZ.LIZLLL.LJLJI.getValue(), "maf_api_status_2");
        c188727au.LIZLLL(p29.LIZIZ.LIZLLL.LJLILLLLZI, "maf_count_2");
        c188727au.LJIIIZ("has_more_2", P29.LIZJ(p29.LIZIZ.LIZLLL.LJLJJI));
        c188727au.LJ(p29.LIZIZ.LJ, "total_api_cost_2");
        Map<String, String> map = c188727au.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("report: find_friends_monitor \n ");
        LIZ.append(map);
        C221018lt.LJFF("[ffp]_Monitor", X1D.LIZIZ(LIZ));
        FMX.LJIIL("find_friends_monitor", map);
        EventBus.LIZJ().LJIJ(this);
        this.LJLLI.LIZLLL();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        for (EnumC77147UPn enumC77147UPn : EnumC77147UPn.values()) {
            XKX.LIZLLL(getAssemVMScope(), null, null, new P2T(enumC77147UPn, this, null), 3);
        }
        EventBus.LIZJ().LJIILJJIL(this);
    }

    @Override // X.InterfaceC58008Mpg
    public final C84661XKn au0() {
        return this.LJLJLLL;
    }

    @Override // X.InterfaceC58008Mpg
    public final C84661XKn tm0() {
        return this.LJLL;
    }

    @QD3(threadMode = ThreadMode.BACKGROUND)
    public final void onFollowEvent(FollowStatusEvent followStatusEvent) {
        o.LJIIIZ(followStatusEvent, "followStatusEvent");
        FollowStatus followStatus = followStatusEvent.status;
        withState(new C63779P1j(followStatus.userId, followStatus.followStatus));
    }

    @Override // X.InterfaceC58008Mpg
    public final void uh0(EnumC58046MqI platform, String enterMethod) {
        o.LJIIIZ(platform, "platform");
        o.LJIIIZ(enterMethod, "enterMethod");
        int i = C63797P2b.LIZ[platform.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            setState(C227638wZ.LJLIL);
            C84661XKn LIZIZ = XKX.LIZIZ(getAssemVMScope(), this.LJLJJLL, null, new P25(this, null), 2);
            this.LJLJLLL = LIZIZ;
            XKX.LIZLLL(getAssemVMScope(), this.LJLJJLL, null, new P27(this, LIZIZ, enterMethod, null), 2);
            return;
        }
        setState(C227628wY.LJLIL);
        C84661XKn LIZIZ2 = XKX.LIZIZ(getAssemVMScope(), this.LJLJJLL, null, new P23(this, null), 2);
        this.LJLL = LIZIZ2;
        XKX.LIZLLL(getAssemVMScope(), this.LJLJJLL, null, new P26(this, LIZIZ2, enterMethod, null), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object gv0(X.InterfaceC68342mE<X.C9U5> r11, java.lang.String r12, X.InterfaceC67352kd<? super X.C76800UCe> r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof X.P2C
            if (r0 == 0) goto L24
            r3 = r13
            X.P2C r3 = (X.P2C) r3
            int r2 = r3.LJLJJL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L24
            int r2 = r2 - r1
            r3.LJLJJL = r2
        L12:
            java.lang.Object r9 = r3.LJLJI
            X.NAu r1 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r3.LJLJJL
            r8 = 1
            if (r0 == 0) goto L32
            if (r0 != r8) goto L2a
            java.lang.Object r12 = r3.LJLILLLLZI
            java.lang.String r12 = (java.lang.String) r12
            com.ss.android.ugc.aweme.relation.ffp.vm.FindFriendsPageVM r7 = r3.LJLIL
            goto L44
        L24:
            X.P2C r3 = new X.P2C
            r3.<init>(r10, r13)
            goto L12
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C141335gf.LIZJ(r9)
            r3.LJLIL = r10     // Catch: java.lang.Throwable -> L4f
            r3.LJLILLLLZI = r12     // Catch: java.lang.Throwable -> L4f
            r3.LJLJJL = r8     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r9 = r11.LJI(r3)     // Catch: java.lang.Throwable -> L4f
            if (r9 != r1) goto L42
            return r1
        L42:
            r7 = r10
            goto L47
        L44:
            X.C141335gf.LIZJ(r9)     // Catch: java.lang.Throwable -> L4d
        L47:
            X.9U5 r9 = (X.C9U5) r9     // Catch: java.lang.Throwable -> L4d
            X.C3C5.m7constructorimpl(r9)     // Catch: java.lang.Throwable -> L4d
            goto L58
        L4d:
            r0 = move-exception
            goto L51
        L4f:
            r0 = move-exception
            r7 = r10
        L51:
            X.3C4 r9 = X.C141335gf.LIZ(r0)
            X.C3C5.m7constructorimpl(r9)
        L58:
            boolean r0 = X.C3C5.m13isSuccessimpl(r9)
            r5 = 0
            java.lang.String r4 = "contact"
            java.lang.String r3 = "find_friends_page"
            java.lang.String r6 = "[ffp]_Activity"
            if (r0 == 0) goto L7f
            r2 = r9
            X.9U5 r2 = (X.C9U5) r2
            kotlin.jvm.internal.AqS176S0100000_10 r1 = new kotlin.jvm.internal.AqS176S0100000_10
            r0 = 61
            r1.<init>(r2, r0)
            r7.setState(r1)
            java.lang.String r0 = "sync contact success!"
            X.C221018lt.LJFF(r6, r0)
            X.9h6 r0 = new X.9h6
            r0.<init>(r3, r12, r8, r4)
            r0.LIZLLL(r5)
        L7f:
            java.lang.Throwable r2 = X.C3C5.m10exceptionOrNullimpl(r9)
            if (r2 == 0) goto L9d
            kotlin.jvm.internal.AqS176S0100000_10 r1 = new kotlin.jvm.internal.AqS176S0100000_10
            r0 = 62
            r1.<init>(r2, r0)
            r7.setState(r1)
            java.lang.String r0 = "sync contact error!"
            X.C221018lt.LIZJ(r6, r0, r2)
            X.9h6 r1 = new X.9h6
            r0 = 0
            r1.<init>(r3, r12, r0, r4)
            r1.LIZLLL(r5)
        L9d:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.relation.ffp.vm.FindFriendsPageVM.gv0(X.2mE, java.lang.String, X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hv0(X.InterfaceC68342mE<? extends java.util.List<? extends com.ss.android.ugc.aweme.profile.model.User>> r11, java.lang.String r12, X.InterfaceC67352kd<? super X.C76800UCe> r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof X.P2D
            if (r0 == 0) goto L24
            r3 = r13
            X.P2D r3 = (X.P2D) r3
            int r2 = r3.LJLJJL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L24
            int r2 = r2 - r1
            r3.LJLJJL = r2
        L12:
            java.lang.Object r2 = r3.LJLJI
            X.NAu r1 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r3.LJLJJL
            r9 = 1
            if (r0 == 0) goto L32
            if (r0 != r9) goto L2a
            java.lang.Object r12 = r3.LJLILLLLZI
            java.lang.String r12 = (java.lang.String) r12
            com.ss.android.ugc.aweme.relation.ffp.vm.FindFriendsPageVM r7 = r3.LJLIL
            goto L44
        L24:
            X.P2D r3 = new X.P2D
            r3.<init>(r10, r13)
            goto L12
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C141335gf.LIZJ(r2)
            r3.LJLIL = r10     // Catch: java.lang.Throwable -> L4f
            r3.LJLILLLLZI = r12     // Catch: java.lang.Throwable -> L4f
            r3.LJLJJL = r9     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r2 = r11.LJI(r3)     // Catch: java.lang.Throwable -> L4f
            if (r2 != r1) goto L42
            return r1
        L42:
            r7 = r10
            goto L47
        L44:
            X.C141335gf.LIZJ(r2)     // Catch: java.lang.Throwable -> L4d
        L47:
            java.util.List r2 = (java.util.List) r2     // Catch: java.lang.Throwable -> L4d
            X.C3C5.m7constructorimpl(r2)     // Catch: java.lang.Throwable -> L4d
            goto L58
        L4d:
            r0 = move-exception
            goto L51
        L4f:
            r0 = move-exception
            r7 = r10
        L51:
            X.3C4 r2 = X.C141335gf.LIZ(r0)
            X.C3C5.m7constructorimpl(r2)
        L58:
            boolean r0 = X.C3C5.m13isSuccessimpl(r2)
            r5 = 0
            java.lang.String r4 = "facebook"
            java.lang.String r3 = "find_friends_page"
            java.lang.String r6 = "[ffp]_Activity"
            if (r0 == 0) goto L91
            r8 = r2
            java.util.List r8 = (java.util.List) r8
            kotlin.jvm.internal.AqS176S0100000_10 r1 = new kotlin.jvm.internal.AqS176S0100000_10
            r0 = 63
            r1.<init>(r8, r0)
            r7.setState(r1)
            X.9h6 r0 = new X.9h6
            r0.<init>(r3, r12, r9, r4)
            r0.LIZLLL(r5)
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "sync fb result: "
            r1.append(r0)
            int r0 = r8.size()
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.C221018lt.LJFF(r6, r0)
        L91:
            java.lang.Throwable r2 = X.C3C5.m10exceptionOrNullimpl(r2)
            if (r2 == 0) goto Laf
            kotlin.jvm.internal.AqS176S0100000_10 r1 = new kotlin.jvm.internal.AqS176S0100000_10
            r0 = 64
            r1.<init>(r2, r0)
            r7.setState(r1)
            java.lang.String r0 = "sync fb error"
            X.C221018lt.LIZJ(r6, r0, r2)
            X.9h6 r1 = new X.9h6
            r0 = 0
            r1.<init>(r3, r12, r0, r4)
            r1.LIZLLL(r5)
        Laf:
            X.UCe r0 = X.C76800UCe.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.relation.ffp.vm.FindFriendsPageVM.hv0(X.2mE, java.lang.String, X.2kd):java.lang.Object");
    }
}
