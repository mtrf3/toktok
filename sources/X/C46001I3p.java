package X;

import Y.AObjectS86S0100000_7;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.I3p, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46001I3p implements WSH, InterfaceC143795kd {
    public static final HCB LJLLLL;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLLLLLL;
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final boolean LJLJJI;
    public final C82622Wbi LJLJJL;
    public ShortVideoContextViewModel LJLJJLL;
    public InterfaceC82086WJm LJLJL;
    public C45850Hz4 LJLJLJ;
    public final I0N LJLJLLL;
    public final C82631Wbr LJLL;
    public final C82632Wbs LJLLI;
    public final I4U LJLLILLLL;
    public final C62822Ol8 LJLLJ;
    public final C62822Ol8 LJLLL;

    static {
        TBT tbt = new TBT(C46001I3p.class, "nowsSwitcherApi", "getNowsSwitcherApi()Lcom/ss/android/ugc/aweme/nows/combination/NowsSwitcherApi;", 0);
        C65352Pkq.LIZ.getClass();
        LJLLLLLL = new InterfaceC74236TBo[]{tbt, new TBT(C46001I3p.class, "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0)};
        LJLLLL = new HCB();
    }

    @Override // X.WSH
    public final boolean enable() {
        return true;
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

    public final void LIZ() {
        boolean z;
        HDD hdd = (HDD) this.LJLLJ.getValue();
        AqS157S0100000_7 aqS157S0100000_7 = new AqS157S0100000_7(this, 683);
        AqS173S0100000_7 aqS173S0100000_7 = new AqS173S0100000_7(this, 374);
        ShortVideoContextViewModel shortVideoContextViewModel = this.LJLJJLL;
        I4X i4x = null;
        if (shortVideoContextViewModel != null) {
            if (shortVideoContextViewModel.LJLIL.creativeModel.initialModel.recordPageOptionalConfig != null) {
                InterfaceC43072GvM LJ = C62850Ola.LJ();
                C45850Hz4 c45850Hz4 = this.LJLJLJ;
                if (c45850Hz4 != null) {
                    CreativeInfo creativeInfo = c45850Hz4.LIZLLL().creativeInfo;
                    o.LJIIIIZZ(creativeInfo, "tabEnv.shortVideoContext.creativeInfo");
                    String LIZIZ = C43073GvN.LIZIZ(LJ, creativeInfo, EnumC43650HBe.RECORD_CACHE_FILE, "photo", 8);
                    ShortVideoContextViewModel shortVideoContextViewModel2 = this.LJLJJLL;
                    if (shortVideoContextViewModel2 != null) {
                        if (shortVideoContextViewModel2.LJLIL.creativeModel.initialModel.recordPageOptionalConfig != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        i4x = new I4X(Boolean.valueOf(z), LIZIZ, new AqS173S0100000_7(this, 375));
                    } else {
                        o.LJIJI("shortVideoContextViewModel");
                        throw null;
                    }
                } else {
                    o.LJIJI("tabEnv");
                    throw null;
                }
            }
            hdd.LIZ(aqS157S0100000_7, aqS173S0100000_7, i4x);
            return;
        }
        o.LJIJI("shortVideoContextViewModel");
        throw null;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        Lifecycle lifecycle;
        WM7 wm7 = (WM7) this.LJLJJL.LJIIIIZZ(null, AbstractC42651GoZ.class);
        if (wm7 == null || (lifecycle = wm7.getLifecycle()) == null) {
            C45850Hz4 c45850Hz4 = this.LJLJLJ;
            if (c45850Hz4 != null) {
                Lifecycle lifecycle2 = c45850Hz4.LIZ().getLifecycle();
                o.LJIIIIZZ(lifecycle2, "tabEnv.activity.lifecycle");
                return lifecycle2;
            }
            o.LJIJI("tabEnv");
            throw null;
        }
        return lifecycle;
    }

    @Override // X.WSH
    public final WT3 provideScene() {
        return (WT3) this.LJLLL.getValue();
    }

    @Override // X.WSH
    public final WSF createBottomTabItem(C45850Hz4 c45850Hz4) {
        return new WSF(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, new I3U(c45850Hz4, this));
    }

    @Override // X.WSH
    public final void initialize(C45850Hz4 c45850Hz4) {
        this.LJLJLJ = c45850Hz4;
        this.LJLJJLL = (ShortVideoContextViewModel) ((ViewModelProvider) this.LJLJJL.LJ(ViewModelProvider.class, null)).get(ShortVideoContextViewModel.class);
        this.LJLJL = c45850Hz4.LIZIZ();
        I3X i3x = c45850Hz4.LJI;
        if (i3x != null) {
            i3x.Ma0().LIZLLL((LifecycleOwner) this.LJLJJL.LJ(LifecycleOwner.class, null), new AObjectS86S0100000_7(this, 263));
        } else {
            o.LJIJI("recordControlApi");
            throw null;
        }
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73297Sph.LJIIZILJ(vm1, interfaceC88472Yns);
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

    public C46001I3p(String str, String tag, String str2, boolean z, C82622Wbi diContainer) {
        o.LJIIIZ(tag, "tag");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = str;
        this.LJLILLLLZI = tag;
        this.LJLJI = str2;
        this.LJLJJI = z;
        this.LJLJJL = diContainer;
        this.LJLJLLL = (I0N) diContainer.LJIIIIZZ(null, I0N.class);
        this.LJLL = UCI.LJII(diContainer, InterfaceC82325WSr.class, null);
        this.LJLLI = UCI.LJI(diContainer, InterfaceC45999I3n.class, null);
        this.LJLLILLLL = (I4U) diContainer.LJIIIIZZ(null, I4U.class);
        this.LJLLJ = C221108m2.LIZIZ(new AqS157S0100000_7(this, 699));
        this.LJLLL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 700));
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
