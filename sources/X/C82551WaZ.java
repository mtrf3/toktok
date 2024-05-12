package X;

import Y.AObjectS89S0100000_14;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.model.Initial;
import com.ss.android.ugc.aweme.tools.mvtemplate.RecordMVViewModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS96S0300000_7;
import kotlin.jvm.internal.o;
import org.greenrobot.eventbus.EventBus;

/* renamed from: X.WaZ, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82551WaZ extends WT3 implements InterfaceC143795kd, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJJLL;
    public final C82622Wbi LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C82632Wbs LJLJI;
    public C82552Waa LJLJJI;
    public boolean LJLJJL;

    static {
        TBT tbt = new TBT(C82551WaZ.class, "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0);
        C65352Pkq.LIZ.getClass();
        LJLJJLL = new InterfaceC74236TBo[]{tbt};
    }

    @Override // X.WT3
    public final boolean LLJJI() {
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

    @Override // X.WT3
    public final String getTag() {
        return "RecordMVScene";
    }

    @Override // X.InterfaceC73150SnK
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public final void LLJJIJIIJIL() {
        RecordMVViewModel mvViewModel = (RecordMVViewModel) this.LJLILLLLZI.getValue();
        C82622Wbi diContainer = this.LJLIL;
        o.LJIIIZ(mvViewModel, "mvViewModel");
        o.LJIIIZ(diContainer, "diContainer");
        C82552Waa c82552Waa = new C82552Waa(this, (ViewStubCompat) findViewById(R.id.gve), diContainer);
        ShortVideoContext Mv0 = mvViewModel.Mv0();
        c82552Waa.LJLJLJ = Mv0;
        c82552Waa.LJLLI = Mv0.LJI();
        ShortVideoContext shortVideoContext = c82552Waa.LJLJLJ;
        c82552Waa.LJLLLL = shortVideoContext.shootWay;
        c82552Waa.LJLLILLLL = shortVideoContext.draftId;
        c82552Waa.LJLLL = shortVideoContext.newDraftId;
        c82552Waa.LJLLJ = new C173166qu(0L, 0, "", c82552Waa.LJLLI, c82552Waa.LJLLLL, "", 0);
        Effect effect = mvViewModel.LJLJJLL;
        String str = mvViewModel.LJLJL;
        c82552Waa.LJLJJLL = effect;
        c82552Waa.LJLJL = str;
        if (effect == null && TextUtils.isEmpty(str) && c82552Waa.LIZ()) {
            C45857HzB.LIZ(new C82560Wai(c82552Waa.LJLJJL, c82552Waa.LJLLJ, c82552Waa.LJLIL));
        }
        this.LJLJJI = c82552Waa;
        this.LJLJJL = true;
        ((InterfaceC45999I3n) this.LJLJI.LIZ(this, LJLJJLL[0])).RH().LIZIZ(this, new AObjectS89S0100000_14(this, 177));
    }

    @Override // X.WT3
    public final void hide() {
        if (this.LJLJJL) {
            C82552Waa c82552Waa = this.LJLJJI;
            if (c82552Waa != null) {
                c82552Waa.LIZLLL();
            } else {
                o.LJIJI("mvTemplateModule");
                throw null;
            }
        }
    }

    @Override // X.WT3
    public final void show() {
        if (!this.LJLJJL) {
            LLJJIJIIJIL();
        }
        C82552Waa c82552Waa = this.LJLJJI;
        if (c82552Waa != null) {
            if (c82552Waa.LJIIIIZZ()) {
                InterfaceC45540Hu4 interfaceC45540Hu4 = c82552Waa.LJLLLLLL;
                if (interfaceC45540Hu4 != null) {
                    interfaceC45540Hu4.registerActivityOnKeyDownListener(c82552Waa);
                }
                EventBus.LIZJ().LJIILJJIL(c82552Waa.LJLJJI);
                C82553Wab c82553Wab = c82552Waa.LJLJJI;
                ObjectAnimator objectAnimator = c82553Wab.LLFZ;
                if (objectAnimator != null) {
                    objectAnimator.cancel();
                }
                c82553Wab.setVisibility(0);
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c82553Wab.LJLJLJ, "alpha", 0.0f, 1.0f);
                c82553Wab.LLFII = ofFloat;
                ofFloat.setDuration(300L);
                c82553Wab.LLFII.start();
                c82553Wab.LIZJ();
                if (c82552Waa.LJLJJI.getDataCount() == 0) {
                    C82553Wab c82553Wab2 = c82552Waa.LJLJJI;
                    C8ID c8id = c82553Wab2.LJLLL;
                    if (c8id != null) {
                        c8id.setVisibility(0);
                    }
                    c82553Wab2.LJLLJ.setVisibility(4);
                    C81290VvK c81290VvK = c82553Wab2.LJLL;
                    c81290VvK.setText(c81290VvK.getContext().getResources().getString(R.string.pwl));
                    c82553Wab2.LJLL.setClickable(false);
                    c82552Waa.LJI();
                    return;
                }
                C82553Wab c82553Wab3 = c82552Waa.LJLJJI;
                if (c82553Wab3.LJLLLL) {
                    c82552Waa.LJI();
                    return;
                } else {
                    c82553Wab3.LJ();
                    c82552Waa.LJIIIZ(c82552Waa.LJLJJI.getCurTemplateId());
                    return;
                }
            }
            return;
        }
        o.LJIJI("mvTemplateModule");
        throw null;
    }

    @Override // X.WM7
    public final void onDestroyView() {
        super.onDestroyView();
        if (this.LJLJJL) {
            C82552Waa c82552Waa = this.LJLJJI;
            if (c82552Waa != null) {
                if (c82552Waa.LJLJJI != null) {
                    EventBus.LIZJ().LJIJ(c82552Waa.LJLJJI);
                    InterfaceC47391Iip interfaceC47391Iip = c82552Waa.LJLJJI.LLII;
                    if (interfaceC47391Iip != null) {
                        interfaceC47391Iip.release();
                    }
                }
                InterfaceC84498XEg interfaceC84498XEg = c82552Waa.LJLJJL;
                if (interfaceC84498XEg != null) {
                    interfaceC84498XEg.destroy();
                }
                C73318Sq2 c73318Sq2 = HEU.LIZ;
                if (c73318Sq2 != null) {
                    c73318Sq2.dispose();
                }
                HEU.LIZ = null;
                HEU.LIZIZ.onNext(Initial.INSTANCE);
                return;
            }
            o.LJIJI("mvTemplateModule");
            throw null;
        }
    }

    @Override // X.WM7
    public final void onPause() {
        C82561Waj c82561Waj;
        super.onPause();
        if (this.LJLJJL) {
            C82552Waa c82552Waa = this.LJLJJI;
            if (c82552Waa != null) {
                if (c82552Waa.LJIIIIZZ()) {
                    C82553Wab c82553Wab = c82552Waa.LJLJJI;
                    C82547WaV LIZIZ = c82553Wab.LIZIZ(c82553Wab.LJLLILLLL);
                    if (LIZIZ != null && (c82561Waj = LIZIZ.LJLJLLL) != null) {
                        c82561Waj.pause();
                        LIZIZ.LLJJIJI(2, 0, "");
                        return;
                    }
                    return;
                }
                return;
            }
            o.LJIJI("mvTemplateModule");
            throw null;
        }
    }

    @Override // X.WM7
    public final void onResume() {
        super.onResume();
        if (this.LJLJJL) {
            C82552Waa c82552Waa = this.LJLJJI;
            if (c82552Waa != null) {
                C82553Wab c82553Wab = c82552Waa.LJLJJI;
                if (c82553Wab != null && c82553Wab.getVisibility() == 0) {
                    c82552Waa.LJLJJI.LIZJ();
                    return;
                }
                return;
            }
            o.LJIJI("mvTemplateModule");
            throw null;
        }
    }

    @Override // X.WM7
    public final void onStop() {
        C82561Waj c82561Waj;
        super.onStop();
        if (this.LJLJJL) {
            C82552Waa c82552Waa = this.LJLJJI;
            if (c82552Waa != null) {
                if (c82552Waa.LJIIIIZZ()) {
                    C82553Wab c82553Wab = c82552Waa.LJLJJI;
                    C82547WaV LIZIZ = c82553Wab.LIZIZ(c82553Wab.LJLLILLLL);
                    if (LIZIZ != null && (c82561Waj = LIZIZ.LJLJLLL) != null) {
                        c82561Waj.stop();
                        LIZIZ.LLJJIJI(2, 0, "");
                        LIZIZ.LJLLILLLL = false;
                        W5X w5x = LIZIZ.LJLIL;
                        if (w5x != null) {
                            w5x.setVisibility(0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            o.LJIJI("mvTemplateModule");
            throw null;
        }
    }

    @Override // X.WT3
    public final I0E LLJJIJI() {
        return I0E.RECORD_MV_SCENE;
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public C82551WaZ(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        C65776Prg LIZ = C65352Pkq.LIZ(RecordMVViewModel.class);
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS96S0300000_7(this, LIZ, LIZ, 9));
        this.LJLJI = UCI.LJI(diContainer, InterfaceC45999I3n.class, null);
    }

    @Override // X.WM7
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (!C52531KjX.LIZ()) {
            LLJJIJIIJIL();
        }
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73297Sph.LJIIZILJ(vm1, interfaceC88472Yns);
    }

    @Override // X.WT3, X.WMH, X.WM7
    public final ViewGroup onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return (ViewGroup) C6D8.LIZJ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.ds9, viewGroup, false, "null cannot be cast to non-null type android.view.ViewGroup");
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
