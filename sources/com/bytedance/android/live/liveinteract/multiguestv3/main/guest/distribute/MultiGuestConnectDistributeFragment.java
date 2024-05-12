package com.bytedance.android.live.liveinteract.multiguestv3.main.guest.distribute;

import X.ActivityC45651qj;
import X.C0NB;
import X.C10A;
import X.C10S;
import X.C141335gf;
import X.C16880lQ;
import X.C17M;
import X.C184077Kh;
import X.C20910rv;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C214298b3;
import X.C214528bQ;
import X.C221108m2;
import X.C29S;
import X.C31767CdP;
import X.C32014ChO;
import X.C33Q;
import X.C3C5;
import X.C3C8;
import X.C41061jK;
import X.C56412MCa;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C72950Sk6;
import X.C72956SkC;
import X.C72958SkE;
import X.C72959SkF;
import X.C72960SkG;
import X.C72963SkJ;
import X.C72964SkK;
import X.C74824TYe;
import X.C76800UCe;
import X.C77800Ug8;
import X.C78613UtF;
import X.C78926UyI;
import X.C87277YNd;
import X.C8YN;
import X.C8YZ;
import X.C90903hW;
import X.C9BD;
import X.C9BE;
import X.CVT;
import X.DialogC31813Ce9;
import X.InterfaceC212848Wy;
import X.InterfaceC222288nw;
import X.InterfaceC30442Bx8;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC88476Ynw;
import X.KPL;
import X.OSK;
import X.OSL;
import X.OSM;
import X.TBT;
import X.TBW;
import X.U44;
import X.X1D;
import X.XKX;
import Y.ACListenerS32S0100000_12;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.distribute.assem.DistributeStatusViewModel;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestLeakOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestUseLinkmicAloggerSetting;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class MultiGuestConnectDistributeFragment extends LiveBaseFragment implements KPL {
    public View LJLILLLLZI;
    public View LJLJI;
    public C41061jK LJLJJI;
    public C41061jK LJLJJL;
    public CVT LJLJJLL;
    public View LJLJL;
    public DialogC31813Ce9 LJLJLLL;
    public final C214298b3 LJLLILLLL;
    public final Map<Integer, View> LJLLJ = new LinkedHashMap();
    public boolean LJLJLJ = true;
    public final C62822Ol8 LJLL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 56));
    public final C62822Ol8 LJLLI = C221108m2.LIZIZ(new C72958SkE(this));

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.guest.distribute.LiveBaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLLJ).clear();
    }

    @Override // X.KPL, X.C8YZ
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final C8YZ getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.KPL, X.InterfaceC212848Wy
    public final C3C8 getActualReceiver() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final InterfaceC212848Wy<C3C8> getActualReceiverHolder() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.KPL, X.C8YM
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public final C3C8 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C8YM
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.guest.distribute.LiveBaseFragment, com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public MultiGuestConnectDistributeFragment() {
        C214298b3 c214298b3;
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(DistributeStatusViewModel.class);
        AqS162S0100000_12 aqS162S0100000_12 = new AqS162S0100000_12(LIZ, 57);
        C72959SkF c72959SkF = C72959SkF.INSTANCE;
        if (o.LJ(c9bd, c9bd)) {
            c214298b3 = new C214298b3(aqS162S0100000_12, C214528bQ.LJLIL, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), C184077Kh.LJLIL, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), c72959SkF, LIZ);
        } else if (c9bd == null || o.LJ(c9bd, C9BE.LIZ)) {
            c214298b3 = new C214298b3(aqS162S0100000_12, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), c72959SkF, LIZ);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LJLLILLLL = c214298b3;
    }

    public final DistributeStatusViewModel Al() {
        return (DistributeStatusViewModel) this.LJLLILLLL.getValue();
    }

    public final boolean Dl() {
        return ((Boolean) this.LJLLI.getValue()).booleanValue();
    }

    public final void vl() {
        C0NB.LIZIZ("ConnectStatusDistribute__MultiGuestConnectDistributeFragment", "handleOnBackPressed");
        if (Dl()) {
            Al().setState(C72956SkC.LJLIL);
        } else {
            Al().setState(C72950Sk6.LJLIL);
        }
    }

    public final DialogC31813Ce9 xl() {
        String LIZ;
        if (this.LJLJLLL == null) {
            Context context = getContext();
            if (context == null) {
                if (MultiGuestUseLinkmicAloggerSetting.INSTANCE.isEnable()) {
                    StackTraceElement LJ = C32014ChO.LJ();
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ = C77800Ug8.LIZLLL(U44.BIZ, LIZ2, "_ConnectStatusDistribute__MultiGuestConnectDistributeFragment_", LJ, LIZ2);
                } else {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ = C17M.LIZ(U44.BIZ, LIZ3, "_ConnectStatusDistribute__MultiGuestConnectDistributeFragment_", 186, LIZ3);
                }
                C32014ChO.LIZJ(LIZ, "create LiveLoadingDialog return as context is null!", null);
                return null;
            }
            C31767CdP c31767CdP = new C31767CdP(context);
            c31767CdP.LIZJ = true;
            this.LJLJLLL = c31767CdP.LIZ();
        }
        return this.LJLJLLL;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.guest.distribute.LiveBaseFragment
    public final boolean onBackPressed() {
        vl();
        return Dl();
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        if (LiveSdkMultiGuestLeakOptSetting.INSTANCE.isEnable()) {
            Al().onCleared();
        }
    }

    public final void wl(boolean z) {
        String str;
        if (this.LJLJLJ == z) {
            return;
        }
        C10S.LIZ("changeSetting newOpenState = ", z, "ConnectStatusDistribute__MultiGuestConnectDistributeFragment");
        Object requestPage = this.LJLL.getValue();
        o.LJIIIZ(requestPage, "requestPage");
        HashMap hashMap = new HashMap();
        C74824TYe.LIZ(hashMap);
        hashMap.put("request_page", requestPage);
        if (z) {
            str = "on";
        } else {
            str = "off";
        }
        hashMap.put("follower_notification", str);
        C74824TYe.LJLL("livesdk_guest_distribution_setting_click", hashMap);
        DistributeStatusViewModel Al = Al();
        String str2 = Al.LJLIL;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateState open = ");
        LIZ.append(z);
        C0NB.LIZIZ(str2, X1D.LIZIZ(LIZ));
        XKX.LIZLLL(ViewModelKt.getViewModelScope(Al), C78613UtF.LIZJ, null, new C72964SkK(Al, z, null), 2);
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        InterfaceC30442Bx8.b0.LIZ(Boolean.TRUE);
        View findViewById = view.findViewById(R.id.hej);
        o.LJIIIIZZ(findViewById, "this");
        C87277YNd.LJJIJ(findViewById);
        C16880lQ.LJIIJ(new ACListenerS32S0100000_12(this, 21), findViewById);
        View findViewById2 = view.findViewById(R.id.eys);
        o.LJIIIIZZ(findViewById2, "view.findViewById(R.id.iv_back)");
        this.LJLILLLLZI = findViewById2;
        if (Dl()) {
            View view2 = this.LJLILLLLZI;
            if (view2 != null) {
                C87277YNd.LJJIJ(view2);
                View view3 = this.LJLILLLLZI;
                if (view3 != null) {
                    C16880lQ.LJIIJ(new ACListenerS32S0100000_12(this, 22), view3);
                } else {
                    o.LJIJI("ivBack");
                    throw null;
                }
            } else {
                o.LJIJI("ivBack");
                throw null;
            }
        } else {
            View view4 = this.LJLILLLLZI;
            if (view4 != null) {
                C87277YNd.LJJIIZ(view4);
            } else {
                o.LJIJI("ivBack");
                throw null;
            }
        }
        View findViewById3 = view.findViewById(R.id.f98);
        o.LJIIIIZZ(findViewById3, "view.findViewById(R.id.iv_question_and_answer)");
        this.LJLJI = findViewById3;
        C16880lQ.LJIIJ(new ACListenerS32S0100000_12(this, 23), findViewById3);
        this.LJLJL = view.findViewById(R.id.n3v);
        C16880lQ.LJIIJ(new ACListenerS32S0100000_12(this, 24), view.findViewById(R.id.n3w));
        View findViewById4 = view.findViewById(R.id.iog);
        o.LJIIIIZZ(findViewById4, "view.findViewById(R.id.rb_open)");
        this.LJLJJI = (C41061jK) findViewById4;
        C16880lQ.LJIIJ(new ACListenerS32S0100000_12(this, 25), view.findViewById(R.id.n3u));
        View findViewById5 = view.findViewById(R.id.ioc);
        o.LJIIIIZZ(findViewById5, "view.findViewById(R.id.rb_close)");
        this.LJLJJL = (C41061jK) findViewById5;
        View findViewById6 = view.findViewById(R.id.g94);
        o.LJIIIIZZ(findViewById6, "view.findViewById(R.id.loading_view)");
        this.LJLJJLL = (CVT) findViewById6;
        try {
            requireActivity().getOnBackPressedDispatcher().LIZ(this, new C72960SkG(this, Dl()));
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        AssemViewModel.asyncSubscribe$default(Al(), new TBT() { // from class: X.Sk8
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C72949Sk5) obj).LJLJJL;
            }
        }, null, new AqS178S0100000_12(this, 78), new AqS162S0100000_12(this, 55), new AqS178S0100000_12(this, 75), 2, null);
        C0NB.LIZIZ("ConnectStatusDistribute__MultiGuestConnectDistributeFragment", "observeVM = " + Al().hashCode());
        AssemViewModel.asyncSubscribe$default(Al(), new TBT() { // from class: X.Sk7
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C72949Sk5) obj).LJLJJLL;
            }
        }, null, new AqS178S0100000_12(this, 76), new AqS162S0100000_12(this, 54), new AqS178S0100000_12(this, 77), 2, null);
        C8YN.LJII(this, Al(), new TBT() { // from class: X.SkB
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C72949Sk5) obj).LJLILLLLZI);
            }
        }, null, new AqS194S0100000_12(this, 12), 6);
        DistributeStatusViewModel Al = Al();
        Al.getClass();
        XKX.LIZLLL(ViewModelKt.getViewModelScope(Al), C78613UtF.LIZJ, null, new C72963SkJ(Al, null), 2);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        o.LJIIIZ(inflater, "inflater");
        View LJI = C20910rv.LJI(R.layout.d4_, viewGroup, false, 12);
        try {
            ViewTreeLifecycleOwner.set(LJI, getViewLifecycleOwner());
            ViewTreeViewModelStoreOwner.set(LJI, this);
            C10A.LIZIZ(LJI, this);
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity instanceof C29S) {
                c29s = (C29S) mo49getActivity;
            } else {
                c29s = null;
            }
            C90903hW.LIZ(c29s);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return LJI;
    }

    @Override // X.C8YM
    public final <S extends C33Q> InterfaceC222288nw subscribe(AssemViewModel<S> assemViewModel, C56412MCa<S> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJIIIIZZ(this, assemViewModel, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LIZJ(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A> InterfaceC222288nw selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super C3C8, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C212418Vh.LJII(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C56412MCa<C213198Yh<A, B>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88473Ynt<? super C3C8, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C212418Vh.LIZIZ(assemViewModel, this, c56412MCa, interfaceC88472Yns, interfaceC88473Ynt, tbw, tbw2);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C56412MCa<OSK<A, B, C>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88474Ynu<? super C3C8, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C212418Vh.LIZLLL(this, assemViewModel, tbw, tbw2, tbw3, c56412MCa, interfaceC88472Yns, interfaceC88474Ynu);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C, D> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C56412MCa<OSL<A, B, C, D>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88475Ynv<? super C3C8, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C212418Vh.LJ(this, assemViewModel, tbw, tbw2, tbw3, tbw4, c56412MCa, interfaceC88472Yns, interfaceC88475Ynv);
    }

    @Override // X.C8YM
    public final <S extends C33Q, A, B, C, D, E> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, TBW<S, ? extends E> tbw5, C56412MCa<OSM<A, B, C, D, E>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88476Ynw<? super C3C8, ? super A, ? super B, ? super C, ? super D, ? super E, C76800UCe> interfaceC88476Ynw) {
        return C212418Vh.LJFF(this, assemViewModel, tbw, tbw2, tbw3, tbw4, tbw5, c56412MCa, interfaceC88472Yns, interfaceC88476Ynw);
    }
}
