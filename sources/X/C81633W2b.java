package X;

import Y.ACListenerS34S0100000_14;
import Y.AObjectS88S0100000_13;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.ui_component.UiState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.optionlist.OptionPanelState;
import com.ss.android.ugc.gamora.recorder.sticker.optionlist.OptionSceneViewModel;
import com.ss.android.ugc.gamora.recorder.sticker.optionlist.panel.OptionCategoryPanelFragment;
import com.ss.android.ugc.gamora.recorder.sticker.optionlist.panel.OptionCategoryPanelViewModel;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AqS161S0200000_14;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.IDqS438S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.W2b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81633W2b extends WM7 implements InterfaceC143795kd, C5HC, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJZI;
    public final C82622Wbi LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C46193IAz LJLJI;
    public final ShortVideoContext LJLJJI;
    public C74365TGn LJLJJL;
    public BottomSheetBehavior<View> LJLJJLL;
    public InterfaceC45540Hu4 LJLJL;
    public Effect LJLJLJ;
    public C8HR LJLJLLL;
    public TuxTextView LJLL;
    public WeakReference<OptionCategoryPanelFragment> LJLLI;
    public InterfaceC81635W2d LJLLILLLL;
    public final C82631Wbr LJLLJ;
    public final C82631Wbr LJLLL;
    public final C82631Wbr LJLLLL;
    public final C82631Wbr LJLLLLLL;
    public final C82631Wbr LJLZ;
    public final C62822Ol8 LJZ;

    static {
        TBT tbt = new TBT(C81633W2b.class, "slideSlipBottomStickerComponent", "getSlideSlipBottomStickerComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/slideslip/SlideSlipBottomStickerApiComponent;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJZI = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C81633W2b.class, "lighteningControlProgressComponent", "getLighteningControlProgressComponent()Lcom/ss/android/ugc/gamora/recorder/progress/LighteningControlProgressComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C81633W2b.class, "recordControlProgressComponent", "getRecordControlProgressComponent()Lcom/ss/android/ugc/gamora/recorder/progress/RecordControlProgressComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C81633W2b.class, "nowsRecordProgressComponent", "getNowsRecordProgressComponent()Lcom/ss/android/ugc/aweme/nows/recordcontrol/NowsRecordProgressComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C81633W2b.class, "bottomTabApiComponent", "getBottomTabApiComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C81633W2b.class, "nowsRecordTabApi", "getNowsRecordTabApi()Lcom/ss/android/ugc/aweme/nows/combination/NowsRecordTabApi;", 0, c65351Pkp), C61845OOz.LIZJ(C81633W2b.class, "switcherApi", "getSwitcherApi()Lcom/ss/android/ugc/aweme/nows/combination/NowsSwitcherApi;", 0, c65351Pkp)};
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

    public final OptionSceneViewModel LLJILJILJ() {
        return (OptionSceneViewModel) this.LJLILLLLZI.getValue();
    }

    @Override // X.WM7
    public final void onDestroyView() {
        super.onDestroyView();
        C8HR c8hr = this.LJLJLLL;
        if (c8hr == null) {
            return;
        }
        c8hr.setVisibility(8);
    }

    @Override // X.WM7
    public final void onResume() {
        WeakReference<OptionCategoryPanelFragment> weakReference;
        OptionCategoryPanelFragment optionCategoryPanelFragment;
        super.onResume();
        Effect effect = this.LJLJLJ;
        if (effect != null && C78886Uxe.LJJIJL(effect) && (weakReference = this.LJLLI) != null && (optionCategoryPanelFragment = weakReference.get()) != null) {
            OptionCategoryPanelViewModel optionCategoryPanelViewModel = optionCategoryPanelFragment.LJLJL;
            if (optionCategoryPanelViewModel != null) {
                Iterator it = ((ArrayList) optionCategoryPanelViewModel.LJLJJL.LJFF).iterator();
                while (it.hasNext()) {
                    C78801UwH c78801UwH = (C78801UwH) it.next();
                    for (C78789Uw5 c78789Uw5 : c78801UwH.LJ) {
                        if (c78789Uw5.LJFF != null && c78789Uw5.LJIIJ) {
                            optionCategoryPanelViewModel.LJLJJL.LIZLLL(new C78820Uwa(c78801UwH.LIZ, -1, "", -1, c78789Uw5), null, false);
                        }
                    }
                }
                return;
            }
            o.LJIJI("vm");
            throw null;
        }
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public C81633W2b(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS161S0200000_14(this, C65352Pkq.LIZ(OptionSceneViewModel.class), 1));
        this.LJLJI = (C46193IAz) diContainer.LJIIIIZZ(null, C46193IAz.class);
        this.LJLJJI = (ShortVideoContext) diContainer.LJ(ShortVideoContext.class, null);
        this.LJLLJ = UCI.LJII(diContainer, InterfaceC82129WLd.class, null);
        this.LJLLL = UCI.LJII(diContainer, WUU.class, null);
        this.LJLLLL = UCI.LJII(diContainer, WUV.class, null);
        UCI.LJII(diContainer, C82367WUh.class, null);
        UCI.LJI(diContainer, InterfaceC45979I2t.class, null);
        this.LJLLLLLL = UCI.LJII(diContainer, InterfaceC81634W2c.class, null);
        this.LJLZ = UCI.LJII(diContainer, InterfaceC82325WSr.class, null);
        this.LJZ = C221108m2.LIZIZ(new AqS163S0100000_13(this, 54));
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00eb, code lost:
    
        if (X.C76800UCe.LIZ == null) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLJILJIL(com.google.android.material.bottomsheet.BottomSheetBehavior<android.view.View> r10) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C81633W2b.LLJILJIL(com.google.android.material.bottomsheet.BottomSheetBehavior):void");
    }

    @Override // X.C5HC
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        InterfaceC81635W2d interfaceC81635W2d = this.LJLLILLLL;
        if (interfaceC81635W2d != null) {
            interfaceC81635W2d.LJI(this.LJLJJLL, this.LJLJLLL);
            return false;
        }
        return false;
    }

    @Override // X.WM7
    public final void onViewCreated(View view, Bundle bundle) {
        WMH wmh;
        C74365TGn c74365TGn;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        WM7 wm7 = this.mParentScene;
        C8HR c8hr = null;
        if ((wm7 instanceof WMH) && (wmh = (WMH) wm7) != null && (c74365TGn = (C74365TGn) wmh.findSceneByTag("RecordStickerPanelScene")) != null) {
            c74365TGn.LJLIL = new AqS180S0100000_14(this, 19);
            this.LJLJJL = c74365TGn;
        }
        this.LJLJL = C163756bj.LIZIZ(this);
        View findViewById = findViewById(R.id.fk1);
        if (findViewById != null) {
            BottomSheetBehavior<View> from = BottomSheetBehavior.from(findViewById);
            this.LJLJJLL = from;
            if (from != null) {
                from.setHideable(true);
            }
            BottomSheetBehavior<View> bottomSheetBehavior = this.LJLJJLL;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.setPeekHeight(O6R.LJJIIZ(C32151Nz.LJIIZILJ(272)));
            }
            BottomSheetBehavior<View> bottomSheetBehavior2 = this.LJLJJLL;
            if (bottomSheetBehavior2 != null) {
                bottomSheetBehavior2.setBottomSheetCallback(new W2X(this));
            }
        }
        this.LJLL = (TuxTextView) findViewById(R.id.hhl);
        C8HR c8hr2 = (C8HR) findViewById(R.id.hc9);
        if (c8hr2 != null) {
            c8hr2.setOnClickListener(new ViewOnClickListenerC13880ga(new ACListenerS34S0100000_14(this, 1)));
            c8hr = c8hr2;
        }
        this.LJLJLLL = c8hr;
        LLJILJILJ().LJLLI.LIZLLL(this, new AObjectS88S0100000_13(this, 2));
        C73156SnQ.LJII(this, LLJILJILJ(), new TBT() { // from class: X.W2e
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((UiState) obj).getUi();
            }
        }, new TBT() { // from class: X.W2f
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((OptionPanelState) obj).getEffect();
            }
        }, new IDqS438S0100000_14(this, 0));
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73297Sph.LJIIZILJ(vm1, interfaceC88472Yns);
    }

    @Override // X.WM7
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return FP1.LIZ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.cdy, viewGroup, false, "inflater.inflate(R.layou…_panel, container, false)");
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
