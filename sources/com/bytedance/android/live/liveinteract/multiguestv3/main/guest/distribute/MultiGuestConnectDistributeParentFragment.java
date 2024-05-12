package com.bytedance.android.live.liveinteract.multiguestv3.main.guest.distribute;

import X.ActivityC45651qj;
import X.C0NB;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C184077Kh;
import X.C1B3;
import X.C20910rv;
import X.C212418Vh;
import X.C213178Yf;
import X.C213198Yh;
import X.C214298b3;
import X.C214528bQ;
import X.C221108m2;
import X.C29S;
import X.C2L4;
import X.C30868C9o;
import X.C33Q;
import X.C3C5;
import X.C3C8;
import X.C56412MCa;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C72941Sjx;
import X.C72942Sjy;
import X.C72943Sjz;
import X.C72946Sk2;
import X.C72947Sk3;
import X.C72948Sk4;
import X.C74824TYe;
import X.C76800UCe;
import X.C76965UIn;
import X.C78926UyI;
import X.C8YN;
import X.C8YZ;
import X.C90903hW;
import X.C9BD;
import X.C9BE;
import X.InterfaceC212848Wy;
import X.InterfaceC222288nw;
import X.InterfaceC65784Pro;
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
import X.X1D;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.assem.scope.LinkMicScope;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.distribute.assem.DistributeStatusViewModel;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestLeakOptSetting;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS194S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class MultiGuestConnectDistributeParentFragment extends LiveBaseFragment implements KPL, C2L4 {
    public static final /* synthetic */ int LJLL = 0;
    public final String LJLILLLLZI;
    public InterfaceC65784Pro<C76800UCe> LJLJI;
    public LiveBaseFragment LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final C214298b3 LJLJL;
    public InterfaceC65784Pro<C76800UCe> LJLJLJ;
    public final Map<Integer, View> LJLJLLL = new LinkedHashMap();

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.guest.distribute.LiveBaseFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LJLJLLL).clear();
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

    public final void vl() {
        String str = this.LJLILLLLZI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("observeVM = ");
        LIZ.append(this.LJLJL.getValue().hashCode());
        C0NB.LIZIZ(str, X1D.LIZIZ(LIZ));
        AssemViewModel assemViewModel = (AssemViewModel) this.LJLJL.getValue();
        C72947Sk3 c72947Sk3 = new TBT() { // from class: X.Sk3
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C72949Sk5) obj).LJLJI;
            }
        };
        C56412MCa c56412MCa = new C56412MCa();
        c56412MCa.LIZ = true;
        C8YN.LJII(this, assemViewModel, c72947Sk3, c56412MCa, new AqS194S0100000_12(this, 13), 4);
        AssemViewModel assemViewModel2 = (AssemViewModel) this.LJLJL.getValue();
        C72948Sk4 c72948Sk4 = new TBT() { // from class: X.Sk4
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C72949Sk5) obj).LJLJJI;
            }
        };
        C56412MCa c56412MCa2 = new C56412MCa();
        c56412MCa2.LIZ = true;
        C8YN.LJII(this, assemViewModel2, c72948Sk4, c56412MCa2, new AqS194S0100000_12(this, 14), 4);
        AssemViewModel assemViewModel3 = (AssemViewModel) this.LJLJL.getValue();
        C72946Sk2 c72946Sk2 = new TBT() { // from class: X.Sk2
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C72949Sk5) obj).LJLIL;
            }
        };
        C56412MCa c56412MCa3 = new C56412MCa();
        c56412MCa3.LIZ = true;
        C8YN.LJII(this, assemViewModel3, c72946Sk2, c56412MCa3, new AqS194S0100000_12(this, 15), 4);
    }

    public MultiGuestConnectDistributeParentFragment() {
        C214298b3 c214298b3;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ConnectStatusDistribute_MultiGuestConnectDistributeParentFragment_");
        LIZ.append(hashCode());
        this.LJLILLLLZI = X1D.LIZIZ(LIZ);
        this.LJLJJL = C221108m2.LIZIZ(new C72943Sjz(this));
        this.LJLJJLL = C221108m2.LIZIZ(C72941Sjx.LJLIL);
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ2 = C65352Pkq.LIZ(DistributeStatusViewModel.class);
        AqS162S0100000_12 aqS162S0100000_12 = new AqS162S0100000_12(LIZ2, 58);
        C72942Sjy c72942Sjy = C72942Sjy.INSTANCE;
        if (o.LJ(c9bd, c9bd)) {
            c214298b3 = new C214298b3(aqS162S0100000_12, C214528bQ.LJLIL, C78926UyI.LJJII(this, true), C78926UyI.LJJIIJZLJL(this, true), C184077Kh.LJLIL, C78926UyI.LJJ(this, true), C78926UyI.LJIILLIIL(this, true), c72942Sjy, LIZ2);
        } else if (c9bd == null || o.LJ(c9bd, C9BE.LIZ)) {
            c214298b3 = new C214298b3(aqS162S0100000_12, C214528bQ.LJLIL, C78926UyI.LJJII(this, false), C78926UyI.LJJIIJZLJL(this, false), C184077Kh.LJLIL, C78926UyI.LJJ(this, false), C78926UyI.LJIILLIIL(this, false), c72942Sjy, LIZ2);
        } else {
            throw new IllegalArgumentException("Do not support this scope here.");
        }
        this.LJLJL = c214298b3;
    }

    @Override // X.C2L4
    public final List<Class<Object>> getScopeDefine() {
        return C76965UIn.LIZ(LinkMicScope.class);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.guest.distribute.LiveBaseFragment
    public final boolean onBackPressed() {
        C0NB.LIZIZ(this.LJLILLLLZI, "onBackPressed");
        LiveBaseFragment liveBaseFragment = this.LJLJJI;
        if (liveBaseFragment == null || !liveBaseFragment.isViewValid() || !liveBaseFragment.onBackPressed()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        String str = "";
        if (arguments != null && (string = arguments.getString("request_page", "")) != null) {
            str = string;
        }
        if (str.length() == 0) {
            C30868C9o.LJI("request_page is null please check!");
        }
        HashMap hashMap = new HashMap();
        C74824TYe.LIZ(hashMap);
        hashMap.put("request_page", str);
        C74824TYe.LJLL("livesdk_guest_distribution_setting_show", hashMap);
        if (!LiveSdkMultiGuestLeakOptSetting.INSTANCE.isEnable()) {
            vl();
        }
    }

    public final void wl(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        String str = this.LJLILLLLZI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("setCloseAction close = ");
        LIZ.append(interfaceC65784Pro.hashCode());
        C0NB.LIZIZ(str, X1D.LIZIZ(LIZ));
        this.LJLJLJ = interfaceC65784Pro;
    }

    @Override // com.bytedance.android.livesdk.ui.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        try {
            if (isViewValid()) {
                MultiGuestConnectDistributeFragment multiGuestConnectDistributeFragment = (MultiGuestConnectDistributeFragment) this.LJLJJL.getValue();
                this.LJLJJI = multiGuestConnectDistributeFragment;
                FragmentManager childFragmentManager = getChildFragmentManager();
                childFragmentManager.getClass();
                C1B3 c1b3 = new C1B3(childFragmentManager);
                c1b3.LJIIJ(multiGuestConnectDistributeFragment, null, R.id.dm7);
                c1b3.LJI();
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            String str = this.LJLILLLLZI;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("showDistributePage e = ");
            LIZ.append(e.getMessage());
            C0NB.LIZIZ(str, X1D.LIZIZ(LIZ));
        }
        if (LiveSdkMultiGuestLeakOptSetting.INSTANCE.isEnable()) {
            vl();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        C29S c29s;
        o.LJIIIZ(inflater, "inflater");
        View LJI = C20910rv.LJI(R.layout.der, viewGroup, false, 12);
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
