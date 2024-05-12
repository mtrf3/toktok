package X;

import Y.AObserverS82S0100000_14;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.ftc.components.audioeffect.FTCEditAudioEffectState;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.AqS196S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Wb6, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82584Wb6 extends WM7 implements InterfaceC143795kd, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLZ;
    public final C82622Wbi LJLIL;
    public View LJLILLLLZI;
    public View LJLJI;
    public RecyclerView LJLJJI;
    public C82946Wgw LJLJJL;
    public C82596WbI LJLJJLL;
    public C82585Wb7 LJLJL;
    public LinearLayoutManager LJLJLJ;
    public int LJLJLLL;
    public int LJLL;
    public C81589W0j LJLLI;
    public InterfaceC153045zY LJLLILLLL;
    public FrameLayout LJLLJ;
    public final C82632Wbs LJLLL;
    public final C62822Ol8 LJLLLL;
    public final C5H3 LJLLLLLL;

    static {
        TBT tbt = new TBT(C82584Wb6.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
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

    public final VideoPublishEditModel LLJILJIL() {
        return (VideoPublishEditModel) this.LJLLL.LIZ(this, LJLZ[0]);
    }

    @Override // X.WM7
    public final void onDestroyView() {
        InterfaceC81592W0m interfaceC81592W0m;
        super.onDestroyView();
        C82593WbF.LIZ().getClass();
        InterfaceC84498XEg LIZIZ = C82593WbF.LIZIZ();
        if (LIZIZ != null) {
            LIZIZ.destroy();
        }
        C82594WbG.LIZIZ = null;
        C82593WbF.LIZ().getClass();
        ((C43523H6h) C82594WbG.LIZJ.getValue()).LIZ.LJIIIIZZ(1);
        C81589W0j c81589W0j = this.LJLLI;
        if (c81589W0j != null && (interfaceC81592W0m = c81589W0j.LIZJ) != null) {
            interfaceC81592W0m.LJJLIIIJL(true);
        }
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public C82584Wb6(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLLL = UCI.LJI(diContainer, VideoPublishEditModel.class, null);
        this.LJLLLL = C221108m2.LIZIZ(new AqS164S0100000_14(this, 398));
        this.LJLLLLLL = C269113v.LIZ(this, InterfaceC143655kP.class);
    }

    public final void LLJILJILJ(Effect effect) {
        C81589W0j c81589W0j = this.LJLLI;
        if (c81589W0j != null) {
            c81589W0j.LIZ(effect);
        }
    }

    @Override // X.WM7
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        LLJILJIL();
        ((InterfaceC143655kP) this.LJLLLLLL.getValue()).sP().observe(this, new AObserverS82S0100000_14(this, 65));
        this.LJLJJLL = new C82596WbI(this);
        selectNonNullSubscribe((JediViewModel) this.LJLLLL.getValue(), new TBT() { // from class: X.WbO
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((FTCEditAudioEffectState) obj).getClearAudioEffect();
            }
        }, new C73165SnZ<>(), new AqS196S0100000_14(this, 41));
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00a2, code lost:
    
        if (android.text.TextUtils.equals(r1, r0) != false) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLJJ(com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C82584Wb6.LLJJ(com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel, boolean):void");
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73297Sph.LJIIZILJ(vm1, interfaceC88472Yns);
    }

    @Override // X.WM7
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = (FrameLayout) C6D8.LIZJ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.cd0, viewGroup, false, "null cannot be cast to non-null type android.widget.FrameLayout");
        this.LJLLJ = frameLayout;
        return frameLayout;
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
