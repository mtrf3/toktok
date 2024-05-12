package X;

import Y.ALAdapterS11S0100000_14;
import Y.AObjectS89S0100000_14;
import Y.AUListenerS101S0100000_14;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.viewpager.widget.PagerAdapter;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.image.progressbar.ImageProgressViewModel;
import com.ss.android.ugc.aweme.image.progressbar.ImagesProgressState;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.AqS184S0100000_2;
import kotlin.jvm.internal.AqS191S0100000_9;
import kotlin.jvm.internal.AqS196S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.W2t, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81651W2t extends WM7 implements InterfaceC135635Tz, InterfaceC151715xP {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLZ;
    public final C82622Wbi LJLIL;
    public final C152175y9 LJLILLLLZI;
    public int LJLJI;
    public final boolean LJLJJI;
    public final boolean LJLJJL;
    public ValueAnimator LJLJJLL;
    public boolean LJLJL;
    public C80838Vo2 LJLJLJ;
    public final C5H3 LJLJLLL;
    public final C5H3 LJLL;
    public final C82632Wbs LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public boolean LJLLJ;
    public C84E LJLLL;
    public int LJLLLL;
    public boolean LJLLLLLL;

    static {
        TBT tbt = new TBT(C81651W2t.class, "mModel", "getMModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C65352Pkq.LIZ.getClass();
        LJLZ = new InterfaceC74236TBo[]{tbt};
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

    public final ImageProgressViewModel LLJILJIL() {
        return (ImageProgressViewModel) this.LJLLILLLL.getValue();
    }

    public final void LLJJ() {
        boolean z;
        InterfaceC148975sz interfaceC148975sz = (InterfaceC148975sz) this.LJLL.getValue();
        if ((interfaceC148975sz != null && interfaceC148975sz.LLIIIJ()) || !this.LJLLJ) {
            z = false;
        } else {
            z = true;
        }
        ValueAnimator valueAnimator = this.LJLJJLL;
        if (valueAnimator != null && valueAnimator.isPaused() && !this.LJLJL && isVisible() && z) {
            LLJJI(this.LJLJI, 0.0f);
        }
    }

    @Override // X.WM7
    public final void onPause() {
        super.onPause();
        this.LJLJL = true;
        LLJILJILJ(false);
    }

    @Override // X.WM7
    public final void onResume() {
        super.onResume();
        this.LJLJL = false;
        LLJJ();
    }

    @Override // X.WM7
    public final void onStop() {
        super.onStop();
        C80838Vo2 c80838Vo2 = this.LJLJLJ;
        if (c80838Vo2 != null) {
            ValueAnimator valueAnimator = c80838Vo2.LIZJ;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            c80838Vo2.LIZJ = null;
            return;
        }
        o.LJIJI("dragHelper");
        throw null;
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public final void LLJILJILJ(boolean z) {
        ValueAnimator valueAnimator = this.LJLJJLL;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            ValueAnimator valueAnimator2 = this.LJLJJLL;
            if (valueAnimator2 != null) {
                valueAnimator2.pause();
            }
            if (z) {
                ValueAnimator valueAnimator3 = this.LJLJJLL;
                if (valueAnimator3 != null) {
                    valueAnimator3.cancel();
                }
                this.LJLJJLL = null;
                this.LJLLLL = 0;
                C84E c84e = this.LJLLL;
                if (c84e != null) {
                    c84e.setSelectedIndex(this.LJLJI);
                } else {
                    o.LJIJI("indicator");
                    throw null;
                }
            }
        }
    }

    @Override // X.WM7
    public final void onActivityCreated(Bundle bundle) {
        int i;
        LiveData<OSJ<Boolean, Boolean, Boolean>> Zq0;
        super.onActivityCreated(bundle);
        View requireViewById = requireViewById(R.id.cf7);
        o.LJIIIIZZ(requireViewById, "requireViewById(R.id.dot_indicator)");
        C84E c84e = (C84E) requireViewById;
        c84e.setLifecycleOwner(this);
        PagerAdapter adapter = this.LJLILLLLZI.getAdapter();
        if (adapter != null) {
            i = adapter.getCount();
        } else {
            i = 2;
        }
        c84e.setCount(i);
        c84e.setSelectedIndex(0);
        if (!C44384HbQ.LJJLJLI((VideoPublishEditModel) this.LJLLI.LIZ(this, LJLZ[0]))) {
            ViewGroup.LayoutParams layoutParams = c84e.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = (int) KL2.LIZJ(c84e.getContext(), 31.0f);
        }
        this.LJLLL = c84e;
        c84e.setVisibility(0);
        if (!this.LJLJJL) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(2500L);
            duration.setStartDelay(200L);
            this.LJLJJLL = duration;
            duration.setRepeatCount(-1);
            ValueAnimator valueAnimator = this.LJLJJLL;
            if (valueAnimator != null) {
                valueAnimator.addListener(new ALAdapterS11S0100000_14(this, 65));
            }
            ValueAnimator valueAnimator2 = this.LJLJJLL;
            if (valueAnimator2 != null) {
                valueAnimator2.addUpdateListener(new AUListenerS101S0100000_14(this, 69));
            }
            ValueAnimator valueAnimator3 = this.LJLJJLL;
            if (valueAnimator3 != null) {
                valueAnimator3.start();
            }
        }
        this.LJLJLJ = new C80838Vo2(this.LJLILLLLZI, new AqS164S0100000_14(this, 528));
        InterfaceC143655kP interfaceC143655kP = (InterfaceC143655kP) this.LJLJLLL.getValue();
        if (interfaceC143655kP != null && (Zq0 = interfaceC143655kP.Zq0()) != null) {
            Zq0.observe(this, new AObjectS89S0100000_14(this, 478));
        }
        C73156SnQ.LJIIIIZZ(this, LLJILJIL(), new TBT() { // from class: X.W2u
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((ImagesProgressState) obj).getProgress();
            }
        }, new AqS191S0100000_9(this, 119));
        C73156SnQ.LJIIIIZZ(this, LLJILJIL(), new TBT() { // from class: X.W2v
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((ImagesProgressState) obj).getPause();
            }
        }, new AqS184S0100000_2(this, 98));
        C73156SnQ.LJIIIIZZ(this, LLJILJIL(), new TBT() { // from class: X.W2x
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((ImagesProgressState) obj).getResume();
            }
        }, new AqS196S0100000_14(this, 60));
        C73156SnQ.LJIIIIZZ(this, LLJILJIL(), new TBT() { // from class: X.W2w
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((ImagesProgressState) obj).getViewState();
            }
        }, new AqS184S0100000_2(this, 99));
    }

    @Override // X.WM7
    public final void onVisibleChanged(boolean z) {
        PagerAdapter adapter;
        super.onVisibleChanged(z);
        if (this.LJLLLLLL) {
            return;
        }
        this.LJLLLLLL = true;
        if (!this.LJLJJI || !isVisible() || !((Boolean) C52539Kjf.LIZ.getValue()).booleanValue() || !C150745vq.LIZJ() || (adapter = this.LJLILLLLZI.getAdapter()) == null || adapter.getCount() <= 1) {
            return;
        }
        H8F.LJJJJ((VideoPublishEditModel) this.LJLLI.LIZ(this, LJLZ[0]), "subtle_hint");
        C152175y9 c152175y9 = this.LJLILLLLZI;
        Context context = this.mView.getContext();
        o.LJIIIIZZ(context, "view.context");
        Lifecycle lifecycle = getLifecycle();
        o.LJIIIIZZ(lifecycle, "lifecycle");
        W36 w36 = new W36(c152175y9, context, LifecycleKt.getCoroutineScope(lifecycle));
        XKQ LIZLLL = XKX.LIZLLL(w36.LJLJI, null, null, new W37(w36, null), 3);
        LIZLLL.LJJIII(new AqS180S0100000_14(w36, 374));
        w36.LJLJJL = LIZLLL;
    }

    public final void LLJJI(int i, float f) {
        this.LJLJI = i;
        if (this.LJLLLL == 0) {
            C84E c84e = this.LJLLL;
            if (c84e != null) {
                c84e.setSelectedIndex(i);
            } else {
                o.LJIJI("indicator");
                throw null;
            }
        } else {
            C84E c84e2 = this.LJLLL;
            if (c84e2 != null) {
                c84e2.setSelectedIndex(i);
            } else {
                o.LJIJI("indicator");
                throw null;
            }
        }
        ValueAnimator valueAnimator = this.LJLJJLL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.LJLJJLL;
        if (valueAnimator2 != null) {
            valueAnimator2.start();
        }
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73157SnR.LJIIJJI(vm1, interfaceC88472Yns);
    }

    @Override // X.WM7
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return FP1.LIZ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.cdd, viewGroup, false, "inflater.inflate(R.layou…ogress, container, false)");
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at> InterfaceC92693kP subscribe(JediViewModel<S> jediViewModel, C73165SnZ<S> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C73157SnR.LJI(this, jediViewModel, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C73157SnR.LIZIZ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    public C81651W2t(C82622Wbi diContainer, C152175y9 viewPager, int i, boolean z, boolean z2) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(viewPager, "viewPager");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = viewPager;
        this.LJLJI = i;
        this.LJLJJI = z;
        this.LJLJJL = z2;
        this.LJLJLLL = C269113v.LIZIZ(this, InterfaceC143655kP.class);
        this.LJLL = C269113v.LIZIZ(this, InterfaceC148975sz.class);
        this.LJLLI = UCI.LJI(diContainer, VideoPublishEditModel.class, null);
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS164S0100000_14(this, 527));
        this.LJLLJ = true;
        this.LJLLLL = 2500;
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C73165SnZ<TMG> c73165SnZ, InterfaceC88473Ynt<? super AML, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C73157SnR.LIZJ(this, jediViewModel, tbw, tbw2, c73165SnZ, interfaceC88473Ynt);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, T> InterfaceC92693kP asyncSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends AbstractC26082ALm<? extends T>> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super Throwable, C76800UCe> interfaceC88471Ynr, InterfaceC88472Yns<? super AML, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super AML, ? super T, C76800UCe> interfaceC88471Ynr2) {
        return C73157SnR.LIZ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr, interfaceC88472Yns, interfaceC88471Ynr2);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B, C> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C73165SnZ<C157166Eu> c73165SnZ, InterfaceC88474Ynu<? super AML, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C73157SnR.LIZLLL(this, jediViewModel, tbw, tbw2, tbw3, c73165SnZ, interfaceC88474Ynu);
    }

    @Override // X.InterfaceC73150SnK
    public final <S extends InterfaceC61312at, A, B, C, D> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C73165SnZ<W1T> c73165SnZ, InterfaceC88475Ynv<? super AML, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C73157SnR.LJ(this, jediViewModel, tbw, tbw2, tbw3, tbw4, c73165SnZ, interfaceC88475Ynv);
    }
}
