package X;

import Y.ACListenerS27S0100000_7;
import Y.ACListenerS34S0100000_14;
import Y.AObjectS89S0100000_14;
import Y.AObserverS82S0100000_14;
import Y.ARunnableS50S0100000_14;
import Y.IDObjectS388S0100000_14;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.ktx.SceneExtensionsKt;
import com.ss.android.ugc.aweme.shortvideo.DuetContext;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.duet.ChangeDuetLayoutState;
import com.ss.android.ugc.aweme.shortvideo.duet.ChangeDuetLayoutViewModel;
import com.ss.android.ugc.aweme.shortvideo.duet.DuetLayoutListViewModel;
import com.ss.android.ugc.aweme.shortvideo.duet.DuetLayoutModeState;
import com.ss.android.ugc.aweme.shortvideo.duet.DuetLayoutModeViewModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS161S0200000_14;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.AqS189S0100000_7;
import kotlin.jvm.internal.AqS196S0100000_14;
import kotlin.jvm.internal.AqS31S0001000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.VzQ, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81544VzQ extends WM7 implements InterfaceC143795kd, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIIJLIL;
    public final C82622Wbi LJLIL;
    public final LiveData<C44243HXz> LJLILLLLZI;
    public final InterfaceC88472Yns<WXA, C76800UCe> LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public View LJLJJLL;
    public RelativeLayout LJLJL;
    public ImageView LJLJLJ;
    public TextView LJLJLLL;
    public C161806Wq LJLL;
    public View LJLLI;
    public View LJLLILLLL;
    public C73305Spp LJLLJ;
    public View LJLLL;
    public View LJLLLL;
    public View LJLLLLLL;
    public C8HN LJLZ;
    public final SafeHandler LJZ;
    public C81540VzM LJZI;
    public final C62822Ol8 LJZL;
    public C82948Wgy LL;
    public C81400Vx6 LLD;
    public InterfaceC84498XEg LLF;
    public final C81546VzS LLFF;
    public final AqS196S0100000_14 LLFFF;
    public final AqS164S0100000_14 LLFII;
    public boolean LLFZ;
    public float LLI;
    public boolean LLIFFJFJJ;
    public final C82632Wbs LLII;
    public final C82632Wbs LLIIII;
    public final C82632Wbs LLIIIILZ;
    public final InterfaceC83727WtX LLIIIJ;
    public final C81507Vyp LLIIIL;
    public boolean LLIIIZ;
    public final ARunnableS50S0100000_14 LLIIJI;

    static {
        TBT tbt = new TBT(C81544VzQ.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLIIJLIL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C81544VzQ.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0, c65351Pkp), C61845OOz.LIZJ(C81544VzQ.class, "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0, c65351Pkp)};
    }

    public final void LLJJI() {
        DuetLayoutListViewModel duetLayoutListViewModel = (DuetLayoutListViewModel) C165706es.LJIIIIZZ(this, null, null, 6).get(DuetLayoutListViewModel.class);
        InterfaceC84498XEg interfaceC84498XEg = this.LLF;
        if (interfaceC84498XEg != null) {
            duetLayoutListViewModel.getClass();
            MutableLiveData<C74413TIj<EffectChannelResponse>> mutableLiveData = duetLayoutListViewModel.LJLIL;
            if (mutableLiveData == null) {
                MutableLiveData<C74413TIj<EffectChannelResponse>> mutableLiveData2 = new MutableLiveData<>();
                duetLayoutListViewModel.LJLIL = mutableLiveData2;
                mutableLiveData2.setValue(C74413TIj.LIZIZ());
                interfaceC84498XEg.LJI("duet-layout", false, new IDObjectS388S0100000_14(duetLayoutListViewModel, 1));
                mutableLiveData = duetLayoutListViewModel.LJLIL;
                o.LJI(mutableLiveData);
            }
            mutableLiveData.observe(this, new AObserverS82S0100000_14(this, 71));
            return;
        }
        o.LJIJI("effectPlatform");
        throw null;
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

    public final InterfaceC82086WJm LLJILJIL() {
        return (InterfaceC82086WJm) this.LLII.LIZ(this, LLIIJLIL[0]);
    }

    public final DuetLayoutModeViewModel LLJILJILJ() {
        return (DuetLayoutModeViewModel) this.LJZL.getValue();
    }

    public final ShortVideoContext LLJJ() {
        return (ShortVideoContext) this.LLIIII.LIZ(this, LLIIJLIL[1]);
    }

    @Override // X.WM7
    public final void onDestroyView() {
        super.onDestroyView();
        MessageCenter.removeListener(this.LLIIIL);
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    @Override // X.WM7
    public final void onActivityCreated(Bundle bundle) {
        TextView textView;
        super.onActivityCreated(bundle);
        View view = this.LJLJJLL;
        if (view != null) {
            View findViewById = view.findViewById(R.id.cin);
            o.LJIIIIZZ(findViewById, "findViewById(R.id.duet_l…t_order_switch_container)");
            this.LJLJL = (RelativeLayout) findViewById;
            View findViewById2 = view.findViewById(R.id.cio);
            o.LJIIIIZZ(findViewById2, "findViewById(R.id.duet_layout_order_switch_icon)");
            this.LJLJLJ = (ImageView) findViewById2;
            View findViewById3 = view.findViewById(R.id.cip);
            o.LJIIIIZZ(findViewById3, "findViewById(R.id.duet_layout_order_switch_text)");
            this.LJLJLLL = (TextView) findViewById3;
            o.LJIIIIZZ(view.findViewById(R.id.cih), "findViewById(R.id.duet_layout_bottom_sheet)");
            View findViewById4 = view.findViewById(R.id.cik);
            o.LJIIIIZZ(findViewById4, "findViewById(R.id.duet_layout_mode_list)");
            this.LJLL = (C161806Wq) findViewById4;
            View findViewById5 = view.findViewById(R.id.cil);
            o.LJIIIIZZ(findViewById5, "findViewById(R.id.duet_layout_mode_touch_outside)");
            this.LJLLI = findViewById5;
            View findViewById6 = view.findViewById(R.id.cii);
            o.LJIIIIZZ(findViewById6, "findViewById(R.id.duet_layout_list_container)");
            this.LJLLILLLL = findViewById6;
            View findViewById7 = view.findViewById(R.id.cij);
            o.LJIIIIZZ(findViewById7, "findViewById(R.id.duet_layout_list_status)");
            this.LJLLJ = (C73305Spp) findViewById7;
            JediViewModel LIZ = C163726bg.LIZIZ(SceneExtensionsKt.LIZLLL(this), this).LIZ(ChangeDuetLayoutViewModel.class);
            o.LJIIIIZZ(LIZ, "of(this).get(ChangeDuetL…outViewModel::class.java)");
            selectNonNullSubscribe(LIZ, new TBT() { // from class: X.I0g
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((ChangeDuetLayoutState) obj).getLayoutDirection();
                }
            }, new C73165SnZ<>(), new AqS189S0100000_7(this, 81));
            selectNonNullSubscribe(LIZ, new TBT() { // from class: X.I0i
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return ((ChangeDuetLayoutState) obj).getExitDuetMode();
                }
            }, new C73165SnZ<>(), new AqS196S0100000_14(this, 57));
            RelativeLayout relativeLayout = this.LJLJL;
            if (relativeLayout != null) {
                C16880lQ.LJIJ(relativeLayout, new ACListenerS27S0100000_7(this, 179));
                View view2 = this.LJLLI;
                if (view2 != null) {
                    C16880lQ.LJIIJ(new ACListenerS34S0100000_14(this, 121), view2);
                    View view3 = this.LJLLLLLL;
                    if (view3 != null) {
                        view3.setVisibility(0);
                        View view4 = this.LJLLLLLL;
                        if (view4 != null) {
                            View findViewById8 = view4.findViewById(R.id.f51);
                            o.LJIIIIZZ(findViewById8, "cameraLayout.findViewById(R.id.iv_icon)");
                            this.LJLLL = findViewById8;
                            ((ImageView) findViewById8).setImageResource(R.drawable.b72);
                            View view5 = this.LJLLLLLL;
                            if (view5 != null) {
                                View findViewById9 = view5.findViewById(R.id.m8o);
                                o.LJIIIIZZ(findViewById9, "cameraLayout.findViewById(R.id.tv_icon_desc)");
                                this.LJLLLL = findViewById9;
                                if ((findViewById9 instanceof TextView) && (textView = (TextView) findViewById9) != null) {
                                    textView.setText(R.string.q6s);
                                }
                                View view6 = this.LJLLLLLL;
                                if (view6 != null) {
                                    C16880lQ.LJIIJ(new ACListenerS34S0100000_14(this, 122), view6);
                                    this.LJLILLLLZI.observe(this, new AObserverS82S0100000_14(this, 72));
                                    C73297Sph.LIZJ(this, LLJILJILJ(), new TBT() { // from class: X.VzU
                                        @Override // X.TBT, X.TBZ, X.TBW
                                        public final Object get(Object obj) {
                                            return Integer.valueOf(((DuetLayoutModeState) obj).getChangeDirectionMode());
                                        }
                                    }, C45804HyK.LJIJ(), new AqS196S0100000_14(this, 52));
                                    C73297Sph.LIZJ(this, LLJILJILJ(), new TBT() { // from class: X.VzW
                                        @Override // X.TBT, X.TBZ, X.TBW
                                        public final Object get(Object obj) {
                                            return Integer.valueOf(((DuetLayoutModeState) obj).getGuideMode());
                                        }
                                    }, C45804HyK.LJIJ(), new AqS196S0100000_14(this, 53));
                                    C73297Sph.LIZJ(this, LLJILJILJ(), new TBT() { // from class: X.VzX
                                        @Override // X.TBT, X.TBZ, X.TBW
                                        public final Object get(Object obj) {
                                            return Integer.valueOf(((DuetLayoutModeState) obj).getTouchGesture());
                                        }
                                    }, C45804HyK.LJIJ(), new AqS196S0100000_14(this, 54));
                                    C73297Sph.LIZJ(this, LLJILJILJ(), new TBT() { // from class: X.Vyr
                                        @Override // X.TBT, X.TBZ, X.TBW
                                        public final Object get(Object obj) {
                                            return ((DuetLayoutModeState) obj).getToast();
                                        }
                                    }, C45804HyK.LJIJ(), new AqS196S0100000_14(this, 55));
                                    C73297Sph.LIZJ(this, LLJILJILJ(), new TBT() { // from class: X.Vyq
                                        @Override // X.TBT, X.TBZ, X.TBW
                                        public final Object get(Object obj) {
                                            return Integer.valueOf(((DuetLayoutModeState) obj).getChosenPosition());
                                        }
                                    }, C45804HyK.LJIJ(), new AqS196S0100000_14(this, 58));
                                    ((InterfaceC45999I3n) this.LLIIIILZ.LIZ(this, LLIIJLIL[2])).Na0().LIZIZ(this, new AObjectS89S0100000_14(this, 474));
                                    selectNonNullSubscribe(LLJILJILJ(), new TBT() { // from class: X.VzY
                                        @Override // X.TBT, X.TBZ, X.TBW
                                        public final Object get(Object obj) {
                                            return ((DuetLayoutModeState) obj).getDuetLayout();
                                        }
                                    }, new C73165SnZ<>(), new AqS196S0100000_14(this, 59));
                                    View view7 = this.LJLJJLL;
                                    if (view7 != null) {
                                        View view8 = this.LJLLLLLL;
                                        if (view8 != null) {
                                            C82948Wgy c82948Wgy = new C82948Wgy(view7, view8);
                                            this.LL = c82948Wgy;
                                            c82948Wgy.LJLIL = new C81547VzT(this);
                                            LLJILJIL().Hv().LIZLLL(this, new AObjectS89S0100000_14(this, 469));
                                            MessageCenter.addListener(this.LLIIIL);
                                            Activity activity = this.mActivity;
                                            o.LJI(activity);
                                            this.LLF = C84488XDw.LIZ(activity, null);
                                            ShortVideoContext LLJJ = LLJJ();
                                            InterfaceC84498XEg interfaceC84498XEg = this.LLF;
                                            if (interfaceC84498XEg != null) {
                                                C81540VzM c81540VzM = new C81540VzM(this, LLJJ, interfaceC84498XEg, LLJILJILJ());
                                                this.LJZI = c81540VzM;
                                                C161806Wq c161806Wq = this.LJLL;
                                                if (c161806Wq != null) {
                                                    c161806Wq.setAdapter(c81540VzM);
                                                    C161806Wq c161806Wq2 = this.LJLL;
                                                    if (c161806Wq2 != null) {
                                                        c161806Wq2.setLayoutManager(new LinearLayoutManager(0, false));
                                                        LLJJI();
                                                        return;
                                                    } else {
                                                        o.LJIJI("mModeRecyclerView");
                                                        throw null;
                                                    }
                                                }
                                                o.LJIJI("mModeRecyclerView");
                                                throw null;
                                            }
                                            o.LJIJI("effectPlatform");
                                            throw null;
                                        }
                                        o.LJIJI("cameraLayout");
                                        throw null;
                                    }
                                    o.LJIJI("rootView");
                                    throw null;
                                }
                                o.LJIJI("cameraLayout");
                                throw null;
                            }
                            o.LJIJI("cameraLayout");
                            throw null;
                        }
                        o.LJIJI("cameraLayout");
                        throw null;
                    }
                    o.LJIJI("cameraLayout");
                    throw null;
                }
                o.LJIJI("mOutsideView");
                throw null;
            }
            o.LJIJI("mSwitchContainer");
            throw null;
        }
        o.LJIJI("rootView");
        throw null;
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73297Sph.LJIIZILJ(vm1, interfaceC88472Yns);
    }

    public C81544VzQ(C82622Wbi diContainer, MutableLiveData mutableLiveData, AqS180S0100000_14 aqS180S0100000_14) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = mutableLiveData;
        this.LJLJI = aqS180S0100000_14;
        this.LJLJJL = 1;
        this.LJZ = new SafeHandler(this);
        this.LJZL = C221108m2.LIZIZ(new AqS161S0200000_14(this, C65352Pkq.LIZ(DuetLayoutModeViewModel.class), 83));
        this.LLFF = new C81546VzS(this);
        this.LLFFF = new AqS196S0100000_14(this, 56);
        this.LLFII = new AqS164S0100000_14(this, 512);
        this.LLFZ = true;
        this.LLIFFJFJJ = true;
        this.LLII = UCI.LJI(diContainer, InterfaceC82086WJm.class, null);
        this.LLIIII = UCI.LJI(diContainer, ShortVideoContext.class, null);
        this.LLIIIILZ = UCI.LJI(diContainer, InterfaceC45999I3n.class, null);
        this.LLIIIJ = LLJILJIL().e8().getEffectController();
        this.LLIIIL = new C81507Vyp(this);
        this.LLIIIZ = true;
        this.LLIIJI = new ARunnableS50S0100000_14(this, 244);
    }

    public final void LLJJIII(Effect effect, DuetContext duetContext, int i) {
        if (effect == null || duetContext == null || this.mActivity == null) {
            return;
        }
        C81540VzM c81540VzM = this.LJZI;
        if (c81540VzM != null) {
            c81540VzM.LJJLIIIJ(i, false);
        }
        JediViewModel LIZ = C163726bg.LIZIZ(SceneExtensionsKt.LIZLLL(this), this).LIZ(ChangeDuetLayoutViewModel.class);
        o.LJIIIIZZ(LIZ, "of(this).get(ChangeDuetL…outViewModel::class.java)");
        int i2 = duetContext.layoutDirection;
        if (i2 != 0) {
            LIZ.setState(new AqS31S0001000_7(i2, 8));
        }
    }

    @Override // X.WM7
    public final View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        o.LJIIIZ(container, "container");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.k2, container, false);
        View findViewById = LLLLIILL.findViewById(R.id.cit);
        o.LJIIIIZZ(findViewById, "it.findViewById(R.id.duet_root_view)");
        this.LJLJJLL = findViewById;
        View findViewById2 = LLLLIILL.findViewById(R.id.lc2);
        o.LJIIIIZZ(findViewById2, "it.findViewById(R.id.tool_container)");
        this.LJLLLLLL = findViewById2;
        View findViewById3 = LLLLIILL.findViewById(R.id.kir);
        o.LJIIIIZZ(findViewById3, "it.findViewById(R.id.sticker_prompt)");
        this.LJLZ = (C8HN) findViewById3;
        return LLLLIILL;
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at> InterfaceC92693kP subscribe(JediViewModel<S> jediViewModel, C73165SnZ<S> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C73297Sph.LJIIIZ(this, jediViewModel, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC143795kd
    public final <S extends InterfaceC61312at, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super InterfaceC143795kd, ? super A, C76800UCe> interfaceC88471Ynr) {
        C73297Sph.LIZJ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C73297Sph.LJ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC143795kd
    public final <S extends InterfaceC61312at, A> void subscribeEvent(JediViewModel<S> jediViewModel, TBW<S, ? extends C45927I0t<? extends A>> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super InterfaceC143795kd, ? super A, C76800UCe> interfaceC88471Ynr) {
        C73297Sph.LJIIJ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C73165SnZ<TMG> c73165SnZ, InterfaceC88473Ynt<? super AML, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C73297Sph.LJFF(this, jediViewModel, tbw, tbw2, c73165SnZ, interfaceC88473Ynt);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, T> InterfaceC92693kP asyncSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends AbstractC26082ALm<? extends T>> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super Throwable, C76800UCe> interfaceC88471Ynr, InterfaceC88472Yns<? super AML, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super AML, ? super T, C76800UCe> interfaceC88471Ynr2) {
        return C73297Sph.LIZ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr, interfaceC88472Yns, interfaceC88471Ynr2);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B, C> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C73165SnZ<C157166Eu> c73165SnZ, InterfaceC88474Ynu<? super AML, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C73297Sph.LJI(this, jediViewModel, tbw, tbw2, tbw3, c73165SnZ, interfaceC88474Ynu);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B, C, D> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C73165SnZ<W1T> c73165SnZ, InterfaceC88475Ynv<? super AML, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C73297Sph.LJII(this, jediViewModel, tbw, tbw2, tbw3, tbw4, c73165SnZ, interfaceC88475Ynv);
    }
}
