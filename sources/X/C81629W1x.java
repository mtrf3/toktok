package X;

import android.view.View;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.sticker.panel.info.EffectInfoStickerHandler;
import com.ss.android.ugc.aweme.sticker.panel.info.EffectInfoViewModel;
import com.ss.android.ugc.tools.view.widget.ViewPagerBottomSheetBehavior;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.W1x, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81629W1x extends AbstractC163776bl<EffectInfoViewModel> implements InterfaceC143795kd, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLLL;
    public final C82622Wbi LJLJLJ;
    public final WMH LJLJLLL;
    public final int LJLL;
    public final C82632Wbs LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public final AqS164S0100000_14 LJLLJ;

    static {
        TBT tbt = new TBT(C81629W1x.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0);
        C65352Pkq.LIZ.getClass();
        LJLLL = new InterfaceC74236TBo[]{tbt};
    }

    @Override // X.AbstractC165596eh
    public final void LJJLIIIJJIZ() {
        ViewPagerBottomSheetBehavior<View> viewPagerBottomSheetBehavior = ((W20) this.LJLLILLLL.getValue()).LJLJL;
        if (viewPagerBottomSheetBehavior == null || viewPagerBottomSheetBehavior.LJIIIZ == 5) {
            return;
        }
        viewPagerBottomSheetBehavior.setState(5);
    }

    @Override // X.AbstractC165596eh
    public final void LJJLIIIJLLLLLLLZ() {
        InterfaceC81630W1y interfaceC81630W1y;
        W20 w20 = (W20) this.LJLLILLLL.getValue();
        WMH parentScene = this.LJLJLLL;
        int i = this.LJLL;
        w20.getClass();
        o.LJIIIZ(parentScene, "parentScene");
        if (!parentScene.isAdded(w20)) {
            parentScene.add(i, w20, "EffectInfoScene");
        }
        ViewPagerBottomSheetBehavior<View> viewPagerBottomSheetBehavior = w20.LJLJL;
        if (viewPagerBottomSheetBehavior == null || viewPagerBottomSheetBehavior.LJIIIZ != 3) {
            parentScene.show(w20);
            if (C60903NvH.LJIIJJI().getAccountService().isChildrenMode() && (interfaceC81630W1y = w20.LJLJJL) != null) {
                interfaceC81630W1y.SR(false);
            }
            InterfaceC81630W1y interfaceC81630W1y2 = w20.LJLJJL;
            if (interfaceC81630W1y2 != null) {
                interfaceC81630W1y2.SR(false);
            }
            ViewPagerBottomSheetBehavior<View> viewPagerBottomSheetBehavior2 = w20.LJLJL;
            if (viewPagerBottomSheetBehavior2 != null) {
                viewPagerBottomSheetBehavior2.setState(3);
            }
        }
        InterfaceC45540Hu4 LIZIZ = C163756bj.LIZIZ(w20);
        if (LIZIZ != null) {
            LIZIZ.registerActivityOnKeyDownListenerHead(w20);
            LIZIZ.registerActivityResultListener(w20);
        }
    }

    @Override // X.AbstractC165596eh, X.AbstractC29891Fh
    public final void onCreate() {
        super.onCreate();
        if (!((Boolean) C53562L0k.LIZ.getValue()).booleanValue()) {
            ((I0N) this.LJLLI.LIZ(this, LJLLL[0])).P2(new EffectInfoStickerHandler(this, this.LJLJLJ));
        }
    }

    @Override // X.AbstractC165596eh
    public final WMH LJJLI() {
        return this.LJLJLLL;
    }

    @Override // X.AbstractC165596eh
    public final InterfaceC65784Pro<EffectInfoViewModel> LJJLIIIJILLIZJL() {
        return this.LJLLJ;
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLJLJ;
    }

    public C81629W1x(C82622Wbi diContainer, WMH parentScene, int i) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(parentScene, "parentScene");
        this.LJLJLJ = diContainer;
        this.LJLJLLL = parentScene;
        this.LJLL = i;
        this.LJLLI = UCI.LJI(diContainer, I0N.class, null);
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS164S0100000_14(this, 178));
        this.LJLLJ = new AqS164S0100000_14(this, 179);
    }

    @Override // X.InterfaceC143795kd
    public final <S extends InterfaceC61312at, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super InterfaceC143795kd, ? super A, C76800UCe> interfaceC88471Ynr) {
        C73297Sph.LIZJ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC143795kd
    public final <S extends InterfaceC61312at, A> void subscribeEvent(JediViewModel<S> jediViewModel, TBW<S, ? extends C45927I0t<? extends A>> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super InterfaceC143795kd, ? super A, C76800UCe> interfaceC88471Ynr) {
        C73297Sph.LJIIJ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }
}
