package X;

import Y.AObserverS82S0100000_14;
import Y.AfS66S0100000_14;
import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.gamora.editor.filter.core.EditFilterState;
import com.ss.android.ugc.gamora.editor.filter.core.EditFilterViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS161S0200000_14;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.AqS196S0100000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WPF extends WM7 implements InterfaceC143795kd, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo[] LJLLLLLL;
    public final C82252WPw LJLIL;
    public final C82632Wbs LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public final C5H3 LJLJJI;
    public final C5H3 LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final C62822Ol8 LJLJL;
    public final C62822Ol8 LJLJLJ;
    public final C73318Sq2 LJLJLLL;
    public FilterBean LJLL;
    public boolean LJLLI;
    public boolean LJLLILLLL;
    public final C82622Wbi LJLLJ;
    public final InterfaceC82236WPg LJLLL;
    public final InterfaceC84497XEf LJLLLL;

    static {
        TBT tbt = new TBT(WPF.class, "gestureService", "getGestureService()Lcom/bytedance/createx/editor/gesture/IGestureService;", 0);
        C65352Pkq.LIZ.getClass();
        LJLLLLLL = new InterfaceC74236TBo[]{tbt};
    }

    public final EditFilterViewModel LLJILJIL() {
        return (EditFilterViewModel) this.LJLJI.getValue();
    }

    public final WPL LLJILJILJ() {
        return (WPL) this.LJLJLJ.getValue();
    }

    public final InterfaceC143655kP getEditPreviewApi() {
        return (InterfaceC143655kP) this.LJLJJL.getValue();
    }

    @Override // X.InterfaceC73141SnB
    public final LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final InterfaceC73141SnB getLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC73149SnJ
    public final AML getReceiver() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final InterfaceC73149SnJ<AML> getReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public final void LLJJ() {
        LLJILJILJ().hide();
        LLJILJIL().H60(false, this.LJLL);
        LLJJI(false);
        getEditPreviewApi().nc0(false);
        this.LJLLL.LJJIJ();
    }

    @Override // X.WM7
    public final void onDestroyView() {
        super.onDestroyView();
        if (!this.LJLJLLL.LJLILLLLZI) {
            this.LJLJLLL.dispose();
        }
        ((WPJ) this.LJLJL.getValue()).LIZIZ = null;
        this.LJLLL.LJJIJ();
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLLJ;
    }

    public final void LLJJI(boolean z) {
        C5HC listener = (C5HC) this.LJLJJLL.getValue();
        o.LJIIIZ(listener, "listener");
        Object obj = null;
        if (z) {
            WM7 LLJJIII = C78923UyF.LJIILLIIL(this).LLJJIII();
            if (LLJJIII instanceof InterfaceC45540Hu4) {
                obj = LLJJIII;
            }
            InterfaceC45540Hu4 interfaceC45540Hu4 = (InterfaceC45540Hu4) obj;
            if (interfaceC45540Hu4 != null) {
                interfaceC45540Hu4.registerActivityOnKeyDownListener(listener);
                return;
            }
            return;
        }
        WM7 LLJJIII2 = C78923UyF.LJIILLIIL(this).LLJJIII();
        if (LLJJIII2 instanceof InterfaceC45540Hu4) {
            obj = LLJJIII2;
        }
        InterfaceC45540Hu4 interfaceC45540Hu42 = (InterfaceC45540Hu4) obj;
        if (interfaceC45540Hu42 == null) {
            return;
        }
        interfaceC45540Hu42.unRegisterActivityOnKeyDownListener(listener);
    }

    @Override // X.WM7
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        LLJILJIL().Bq0().observe(this, new AObserverS82S0100000_14(this, 40));
        subscribeEvent(LLJILJIL(), new TBT() { // from class: X.W45
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((EditFilterState) obj).getPanelShow();
            }
        }, new C73165SnZ<>(), new AqS196S0100000_14(this, 27));
        C73156SnQ.LJIIIIZZ(this, LLJILJIL(), new TBT() { // from class: X.W43
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((EditFilterState) obj).getCurFilter();
            }
        }, new AqS196S0100000_14(this, 28));
        C73156SnQ.LJIIIIZZ(this, LLJILJIL(), new TBT() { // from class: X.W44
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((EditFilterState) obj).getCancelStatus();
            }
        }, new AqS196S0100000_14(this, 24));
        if (!this.LJLLI && C82894Wg6.LIZIZ.LIZJ().LIZJ()) {
            this.LJLJLLL.LIZ(LLJILJILJ().LIZ().LJJJLIIL(new AfS66S0100000_14(this, 21), C73674Svm.LJ));
        } else {
            C73156SnQ.LJIIIIZZ(this, LLJILJIL(), new TBT() { // from class: X.WP5
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((EditFilterState) obj).getData();
                }
            }, new AqS196S0100000_14(this, 25));
        }
        int i = 0;
        C6VB rootView = ((InterfaceC152085y0) this.LJLILLLLZI.LIZ(this, LJLLLLLL[0])).getRootView();
        if (rootView instanceof C6VB) {
            ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
            Activity activity = this.mActivity;
            o.LJI(activity);
            Object LLILL = C16880lQ.LLILL(activity, "window");
            if (LLILL != null) {
                Display defaultDisplay = ((WindowManager) LLILL).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                int i2 = point.x;
                Activity activity2 = this.mActivity;
                o.LJI(activity2);
                if (!C79255V8p.LIZ(activity2)) {
                    Activity activity3 = this.mActivity;
                    o.LJI(activity3);
                    i = (int) C74275TDb.LIZIZ(activity3, 50.0f);
                }
                int i3 = i2 + i;
                Activity activity4 = this.mActivity;
                o.LJI(activity4);
                WindowManager windowManager = activity4.getWindowManager();
                o.LJIIIIZZ(windowManager, "context.windowManager");
                Display defaultDisplay2 = windowManager.getDefaultDisplay();
                DisplayMetrics displayMetrics = new DisplayMetrics();
                defaultDisplay2.getRealMetrics(displayMetrics);
                int i4 = displayMetrics.heightPixels;
                Activity activity5 = this.mActivity;
                o.LJI(activity5);
                int LIZIZ = i4 + ((int) C74275TDb.LIZIZ(activity5, 50.0f));
                if (layoutParams == null) {
                    layoutParams = new ViewGroup.LayoutParams(i3, LIZIZ);
                } else {
                    layoutParams.width = i3;
                    layoutParams.height = LIZIZ;
                }
                rootView.setLayoutParams(layoutParams);
                Context requireSceneContext = requireSceneContext();
                o.LJIIIIZZ(requireSceneContext, "requireSceneContext()");
                rootView.setSloppyExtra((int) C74275TDb.LIZIZ(requireSceneContext, 150.0f));
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
        }
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 viewModel1, InterfaceC88472Yns<? super S1, ? extends R> block) {
        o.LJIIIZ(viewModel1, "viewModel1");
        o.LJIIIZ(block, "block");
        return (R) C73297Sph.LJIIZILJ(viewModel1, block);
    }

    @Override // X.WM7
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return FP1.LIZ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.ccd, viewGroup, false, "inflater.inflate(R.layou…filter, container, false)");
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at> InterfaceC92693kP subscribe(JediViewModel<S> subscribe, C73165SnZ<S> config, InterfaceC88471Ynr<? super AML, ? super S, C76800UCe> subscriber) {
        o.LJIIIZ(subscribe, "$this$subscribe");
        o.LJIIIZ(config, "config");
        o.LJIIIZ(subscriber, "subscriber");
        return C73297Sph.LJIIIZ(this, subscribe, config, subscriber);
    }

    public WPF(C82622Wbi diContainer, InterfaceC82236WPg filterRepository, InterfaceC84497XEf effectPlatform, InterfaceC88472Yns<? super C82252WPw, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(filterRepository, "filterRepository");
        o.LJIIIZ(effectPlatform, "effectPlatform");
        this.LJLLJ = diContainer;
        this.LJLLL = filterRepository;
        this.LJLLLL = effectPlatform;
        C82252WPw c82252WPw = new C82252WPw();
        this.LJLIL = c82252WPw;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(c82252WPw);
        }
        this.LJLILLLLZI = UCI.LJI(diContainer, InterfaceC152085y0.class, null);
        this.LJLJI = C221108m2.LIZIZ(new AqS161S0200000_14(this, C65352Pkq.LIZ(EditFilterViewModel.class), 24));
        this.LJLJJI = C269113v.LIZ(this, InterfaceC147145q2.class);
        this.LJLJJL = C269113v.LIZ(this, InterfaceC143655kP.class);
        this.LJLJJLL = C221108m2.LIZIZ(new AqS164S0100000_14(this, 204));
        this.LJLJL = C221108m2.LIZIZ(new AqS164S0100000_14(this, 202));
        this.LJLJLJ = C221108m2.LIZIZ(new AqS164S0100000_14(this, 203));
        this.LJLJLLL = new C73318Sq2();
        this.LJLLILLLL = true;
    }

    @Override // X.InterfaceC143795kd
    public final <S extends InterfaceC61312at, A> void selectNonNullSubscribe(JediViewModel<S> selectNonNullSubscribe, TBW<S, ? extends A> prop1, C73165SnZ<C73140SnA> config, InterfaceC88471Ynr<? super InterfaceC143795kd, ? super A, C76800UCe> interfaceC88471Ynr) {
        o.LJIIIZ(selectNonNullSubscribe, "$this$selectNonNullSubscribe");
        o.LJIIIZ(prop1, "prop1");
        o.LJIIIZ(config, "config");
        C73297Sph.LIZJ(this, selectNonNullSubscribe, prop1, config, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A> InterfaceC92693kP selectSubscribe(JediViewModel<S> selectSubscribe, TBW<S, ? extends A> prop1, C73165SnZ<C73140SnA> config, InterfaceC88471Ynr<? super AML, ? super A, C76800UCe> interfaceC88471Ynr) {
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(prop1, "prop1");
        o.LJIIIZ(config, "config");
        return C73297Sph.LJ(this, selectSubscribe, prop1, config, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC143795kd
    public final <S extends InterfaceC61312at, A> void subscribeEvent(JediViewModel<S> subscribeEvent, TBW<S, ? extends C45927I0t<? extends A>> prop1, C73165SnZ<C73140SnA> config, InterfaceC88471Ynr<? super InterfaceC143795kd, ? super A, C76800UCe> interfaceC88471Ynr) {
        o.LJIIIZ(subscribeEvent, "$this$subscribeEvent");
        o.LJIIIZ(prop1, "prop1");
        o.LJIIIZ(config, "config");
        C73297Sph.LJIIJ(this, subscribeEvent, prop1, config, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B> InterfaceC92693kP selectSubscribe(JediViewModel<S> selectSubscribe, TBW<S, ? extends A> prop1, TBW<S, ? extends B> prop2, C73165SnZ<TMG> config, InterfaceC88473Ynt<? super AML, ? super A, ? super B, C76800UCe> subscriber) {
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(prop1, "prop1");
        o.LJIIIZ(prop2, "prop2");
        o.LJIIIZ(config, "config");
        o.LJIIIZ(subscriber, "subscriber");
        return C73297Sph.LJFF(this, selectSubscribe, prop1, prop2, config, subscriber);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, T> InterfaceC92693kP asyncSubscribe(JediViewModel<S> asyncSubscribe, TBW<S, ? extends AbstractC26082ALm<? extends T>> prop, C73165SnZ<C73140SnA> config, InterfaceC88471Ynr<? super AML, ? super Throwable, C76800UCe> interfaceC88471Ynr, InterfaceC88472Yns<? super AML, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super AML, ? super T, C76800UCe> interfaceC88471Ynr2) {
        o.LJIIIZ(asyncSubscribe, "$this$asyncSubscribe");
        o.LJIIIZ(prop, "prop");
        o.LJIIIZ(config, "config");
        return C73297Sph.LIZ(this, asyncSubscribe, prop, config, interfaceC88471Ynr, interfaceC88472Yns, interfaceC88471Ynr2);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B, C> InterfaceC92693kP selectSubscribe(JediViewModel<S> selectSubscribe, TBW<S, ? extends A> prop1, TBW<S, ? extends B> prop2, TBW<S, ? extends C> prop3, C73165SnZ<C157166Eu> config, InterfaceC88474Ynu<? super AML, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(prop1, "prop1");
        o.LJIIIZ(prop2, "prop2");
        o.LJIIIZ(prop3, "prop3");
        o.LJIIIZ(config, "config");
        return C73297Sph.LJI(this, selectSubscribe, prop1, prop2, prop3, config, interfaceC88474Ynu);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B, C, D> InterfaceC92693kP selectSubscribe(JediViewModel<S> selectSubscribe, TBW<S, ? extends A> prop1, TBW<S, ? extends B> prop2, TBW<S, ? extends C> prop3, TBW<S, ? extends D> prop4, C73165SnZ<W1T> config, InterfaceC88475Ynv<? super AML, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(prop1, "prop1");
        o.LJIIIZ(prop2, "prop2");
        o.LJIIIZ(prop3, "prop3");
        o.LJIIIZ(prop4, "prop4");
        o.LJIIIZ(config, "config");
        return C73297Sph.LJII(this, selectSubscribe, prop1, prop2, prop3, prop4, config, interfaceC88475Ynv);
    }
}
