package X;

import Y.AObserverS69S0100000_1;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.im.sdk.share.panel.viewmodel.SharePanelViewModel;
import com.ss.android.ugc.aweme.im.sdk.share.viewmodel.SharePanelImHeadViewModel;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4Ow, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C108824Ow extends FrameLayout implements KPL, InterfaceC107704Ko {
    public SharePanelImHeadViewModel LJLIL;
    public C4P0 LJLILLLLZI;
    public C107124Ii LJLJI;
    public SharePackage LJLJJI;
    public List<? extends InterfaceC62225ObV> LJLJJL;
    public boolean LJLJJLL;
    public Fragment LJLJL;
    public C4OT LJLJLJ;
    public C4P8 LJLJLLL;
    public boolean LJLL;
    public int LJLLI;
    public C3YB LJLLILLLL;
    public boolean LJLLJ;
    public String LJLLL;
    public C4P4 LJLLLL;
    public C4P5 LJLLLLLL;
    public boolean LJLZ;
    public InterfaceC100173wT LJZ;
    public C86944YAi LJZI;
    public boolean LJZL;
    public final java.util.Map<Integer, View> LL;

    public View LIZ(int i) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // X.KPL, X.C8YZ
    public LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public C8YZ getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.KPL, X.InterfaceC212848Wy
    public C3C8 getActualReceiver() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public InterfaceC212848Wy<C3C8> getActualReceiverHolder() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    public View getImHeadLayout() {
        return this;
    }

    @Override // X.KPL, X.C8YM
    public C3C8 getReceiverForHostVM() {
        return null;
    }

    @Override // X.C8YM
    public boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // X.InterfaceC107704Ko
    public C107724Kq getActivityStatusParams() {
        C107724Kq c107724Kq = new C107724Kq(this);
        c107724Kq.LIZIZ = EnumC112364b2.LONG_PRESS_PANEL;
        String str = this.LJLLL;
        if (str == null) {
            str = "";
        }
        c107724Kq.LIZLLL = str;
        return c107724Kq;
    }

    public final Fragment getHostFragment() {
        Fragment fragment = this.LJLJL;
        if (fragment != null) {
            return fragment;
        }
        o.LJIJI("hostFragment");
        throw null;
    }

    public final SharePanelImHeadViewModel getViewModel() {
        SharePanelImHeadViewModel sharePanelImHeadViewModel = this.LJLIL;
        if (sharePanelImHeadViewModel != null) {
            return sharePanelImHeadViewModel;
        }
        o.LJIJI("viewModel");
        throw null;
    }

    public void LIZIZ() {
        SharePanelImHeadViewModel viewModel = getViewModel();
        viewModel.LJLJJI.observe(getHostFragment(), new AObserverS69S0100000_1(this, 159));
        viewModel.LJLLLL.observe(getHostFragment(), new Observer() { // from class: X.4Oy
            /* JADX WARN: Code restructure failed: missing block: B:25:0x0088, code lost:
            
                if (r1.getData().size() > 0) goto L20;
             */
            @Override // androidx.lifecycle.Observer
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onChanged(java.lang.Object r10) {
                /*
                    Method dump skipped, instructions count: 253
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C108844Oy.onChanged(java.lang.Object):void");
            }
        });
        viewModel.LJLJJLL.observe(getHostFragment(), new AObserverS69S0100000_1(this, 160));
        viewModel.LJLJL.observe(getHostFragment(), new AObserverS69S0100000_1(this, 161));
        viewModel.LJLJLJ.observe(getHostFragment(), new AObserverS69S0100000_1(this, 162));
        viewModel.LJLL.observe(getHostFragment(), new AObserverS69S0100000_1(this, 163));
        viewModel.LJLLI.observe(getHostFragment(), new AObserverS69S0100000_1(this, 164));
        viewModel.LJLLL.observe(getHostFragment(), new AObserverS69S0100000_1(this, 165));
        viewModel.LJLJJL.observe(getHostFragment(), new AObserverS69S0100000_1(this, 166));
        LJIIIIZZ();
    }

    public void LJI() {
        Bundle bundle;
        C107124Ii LJIIJ;
        SharePanelViewModel sharePanelViewModel = getViewModel().LJLZ;
        SharePackage sharePackage = sharePanelViewModel.LJLIL;
        if (sharePackage == null || (bundle = sharePackage.extras) == null || (LJIIJ = sharePanelViewModel.LJIIJ()) == null || !SharePanelViewModel.LIZJ(LJIIJ)) {
            return;
        }
        this.LJLJI = LJIIJ;
        String string = bundle.getString("enter_method");
        SharePackage sharePackage2 = sharePanelViewModel.LJLIL;
        InterfaceC62484Ofg interfaceC62484Ofg = C62494Ofq.LIZ;
        if (interfaceC62484Ofg != null && interfaceC62484Ofg.LJIIJ(sharePackage2) && C4P2.LIZ(string) == EnumC62492Ofo.HORIZONTAL && C4P2.LIZIZ(string) > 0) {
            ((C107114Ih) LIZ(R.id.jue)).LIZLLL(false);
            ((C107114Ih) LIZ(R.id.jue)).LIZJ(LJIIJ);
            LIZ(R.id.jue).setVisibility(0);
        }
        o.LJII(LIZ(R.id.jud).getLayoutParams(), "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        ((C107114Ih) LIZ(R.id.jud)).LIZLLL(true);
        ((C107114Ih) LIZ(R.id.jud)).LIZJ(LJIIJ);
        this.LJLJJLL = true;
    }

    public void LJIIIIZZ() {
        getViewModel().LJLLJ.observe(getHostFragment(), new AObserverS69S0100000_1(this, 167));
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        Lifecycle lifecycle = getHostFragment().getLifecycle();
        o.LJIIIIZZ(lifecycle, "hostFragment.lifecycle");
        return lifecycle;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        LIZIZ();
        SharePanelImHeadViewModel viewModel = getViewModel();
        C4P0 c4p0 = this.LJLILLLLZI;
        ArrayList arrayList = null;
        if (c4p0 != null) {
            boolean z = c4p0 instanceof C109004Po;
            MutableLiveData<OSZ<List<IMContact>, Boolean>> mutableLiveData = viewModel.LJLLLL;
            if (OVS.LIZ() && z) {
                List<IMContact> list = C4P7.LIZ;
                if (!((ArrayList) list).isEmpty()) {
                    arrayList = C61328O5c.LJ(list);
                }
            }
            mutableLiveData.setValue(new OSZ<>(arrayList, Boolean.TRUE));
            viewModel.LJLZ.LJIILIIL();
            if (C81313Hb.LIZ()) {
                C4P4 c4p4 = C4P4.LJ;
                C84683Ua c84683Ua = C84683Ua.LJFF;
                c84683Ua.LIZIZ(c4p4, true);
                this.LJLLLL = c4p4;
                C4P5 c4p5 = C4P5.LJ;
                c84683Ua.LIZIZ(c4p5, true);
                this.LJLLLLLL = c4p5;
                return;
            }
            C3YB c3yb = new C3YB(0);
            C84683Ua.LJFF.LIZIZ(c3yb, true);
            this.LJLLILLLL = c3yb;
            return;
        }
        o.LJIJI("avatarAdapter");
        throw null;
    }

    public final C4P8 getHostPanelPanelCallback() {
        return this.LJLJLLL;
    }

    @Override // X.KPL, X.C8YM
    public LifecycleOwner getOwnLifecycleOwner() {
        getActualLifecycleOwner();
        return this;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C108824Ow(C25600zU context) {
        super(context, null, 0);
        o.LJIIIZ(context, "context");
        this.LL = new LinkedHashMap();
        LJII(context);
    }

    public static void LJFF(Activity activity) {
        if (activity != null) {
            Object LLILIL = C16880lQ.LLILIL(activity, "input_method");
            o.LJII(LLILIL, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) LLILIL).hideSoftInputFromWindow(activity.getWindow().getDecorView().getWindowToken(), 0);
        }
    }

    public final void LIZJ(List<? extends IMContact> list) {
        C3YB c3yb;
        if (!C81313Hb.LIZ() && (c3yb = this.LJLLILLLL) != null) {
            C84683Ua.LJFF.LIZ(c3yb, new AnonymousClass309(list.size()));
        }
    }

    public void LJII(Context context) {
        o.LJIIIZ(context, "context");
        View.inflate(context, R.layout.b_2, this);
    }

    public final void setHostFragment(Fragment fragment) {
        o.LJIIIZ(fragment, "<set-?>");
        this.LJLJL = fragment;
    }

    public final void setHostPanelPanelCallback(C4P8 c4p8) {
        this.LJLJLLL = c4p8;
    }

    public final void setViewModel(SharePanelImHeadViewModel sharePanelImHeadViewModel) {
        o.LJIIIZ(sharePanelImHeadViewModel, "<set-?>");
        this.LJLIL = sharePanelImHeadViewModel;
    }

    public final void LIZLLL(int i, LinearLayoutManager linearLayoutManager) {
        C86944YAi c86944YAi;
        C86944YAi c86944YAi2;
        if (i > 2) {
            if ((linearLayoutManager == null || linearLayoutManager.LLILL() != 0) && (c86944YAi2 = this.LJZI) != null) {
                c86944YAi2.LIZ(true);
                return;
            }
            return;
        }
        if (i >= -2 || (c86944YAi = this.LJZI) == null) {
            return;
        }
        c86944YAi.LIZ(false);
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

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0162, code lost:
    
        if (X.OVS.LIZ() != false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LJIIIZ(com.ss.android.ugc.aweme.sharer.model.SharePackage r24, java.util.List r25, androidx.fragment.app.Fragment r26, X.EnumC62492Ofo r27, X.InterfaceC108744Oo r28, X.C4P8 r29, java.lang.String r30) {
        /*
            Method dump skipped, instructions count: 714
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C108824Ow.LJIIIZ(com.ss.android.ugc.aweme.sharer.model.SharePackage, java.util.List, androidx.fragment.app.Fragment, X.Ofo, X.4Oo, X.4P8, java.lang.String):void");
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
