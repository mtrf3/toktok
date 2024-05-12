package X;

import Y.AObjectS86S0100000_7;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.ktx.SceneExtensionsKt;
import com.ss.android.ugc.aweme.prop.fragment.EffectDiscoverAwemeListFragment;
import com.ss.android.ugc.aweme.prop.impl.PropReuseServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.effectdiscover.EffectDiscoverViewModel;
import com.ss.android.ugc.tools.view.widget.ViewPagerBottomSheetBehavior;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.IAx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46191IAx extends AbstractC163776bl<EffectDiscoverViewModel> implements InterfaceC143795kd, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLLLL;
    public final C82622Wbi LJLJLJ;
    public final WMH LJLJLLL;
    public final int LJLL;
    public final int LJLLI;
    public final C82632Wbs LJLLILLLL;
    public final C62822Ol8 LJLLJ;
    public final AqS157S0100000_7 LJLLL;

    static {
        TBT tbt = new TBT(C46191IAx.class, "exitApiComponent", "getExitApiComponent()Lcom/ss/android/ugc/gamora/recorder/exit/ExitApiComponent;", 0);
        C65352Pkq.LIZ.getClass();
        LJLLLL = new InterfaceC74236TBo[]{tbt};
    }

    @Override // X.AbstractC165596eh
    public final void LJJLIIIJJIZ() {
        ViewPagerBottomSheetBehavior<View> viewPagerBottomSheetBehavior = ((C46183IAp) this.LJLLJ.getValue()).LJLZ;
        if (viewPagerBottomSheetBehavior != null) {
            if (viewPagerBottomSheetBehavior.LJIIIZ != 5) {
                viewPagerBottomSheetBehavior.setState(5);
                return;
            }
            return;
        }
        o.LJIJI("behavior");
        throw null;
    }

    @Override // X.AbstractC165596eh
    public final void LJJLIIIJLLLLLLLZ() {
        View findViewById;
        C46183IAp c46183IAp = (C46183IAp) this.LJLLJ.getValue();
        WMH parentScene = this.LJLJLLL;
        int i = this.LJLL;
        c46183IAp.getClass();
        o.LJIIIZ(parentScene, "parentScene");
        if (!parentScene.isAdded(c46183IAp)) {
            parentScene.add(i, c46183IAp, "EffectDiscoverScene");
        }
        if (W2U.LIZ() && (findViewById = parentScene.findViewById(i)) != null) {
            findViewById.bringToFront();
        }
        ViewPagerBottomSheetBehavior<View> viewPagerBottomSheetBehavior = c46183IAp.LJLZ;
        if (viewPagerBottomSheetBehavior != null) {
            if (viewPagerBottomSheetBehavior.LJIIIZ != 3) {
                parentScene.show(c46183IAp);
                ViewPagerBottomSheetBehavior<View> viewPagerBottomSheetBehavior2 = c46183IAp.LJLZ;
                if (viewPagerBottomSheetBehavior2 != null) {
                    viewPagerBottomSheetBehavior2.setState(3);
                } else {
                    o.LJIJI("behavior");
                    throw null;
                }
            }
            FragmentManager supportFragmentManager = SceneExtensionsKt.LIZLLL(c46183IAp).getSupportFragmentManager();
            o.LJIIIIZZ(supportFragmentManager, "requireFragmentActivity().supportFragmentManager");
            Bundle bundle = new Bundle();
            bundle.putString("creation_id", c46183IAp.LLJILJILJ().LJI());
            bundle.putString("shoot_way", c46183IAp.LLJILJILJ().shootWay);
            bundle.putString("shoot_tab_name", c46183IAp.LLJILJILJ().LJIJI());
            if (supportFragmentManager.LJJJIL("EffectDiscoverVideoFragment") == null) {
                EffectDiscoverAwemeListFragment LJI = PropReuseServiceImpl.LJIIJ().LJI(bundle);
                C1B3 c1b3 = new C1B3(supportFragmentManager);
                c1b3.LJIIJ(LJI, "EffectDiscoverVideoFragment", R.id.crs);
                c1b3.LJIILJJIL();
            }
            c46183IAp.LLJILJIL().jL().LIZJ(I0E.EFFECT_DISCOVER_SCENE, C83728WtY.LIZIZ.LIZJ(EnumC83730Wta.CLOSE_CAMERA_EFFECT_DISCOVERY_OPEN, EnumC158826Le.PAGE_INVISIBLE));
            C82631Wbr c82631Wbr = c46183IAp.LJLJJLL;
            InterfaceC74236TBo<?>[] interfaceC74236TBoArr = C46183IAp.LLI;
            InterfaceC82199WNv interfaceC82199WNv = (InterfaceC82199WNv) c82631Wbr.LIZ(c46183IAp, interfaceC74236TBoArr[3]);
            if (interfaceC82199WNv != null) {
                interfaceC82199WNv.Oo0();
            }
            if (V3N.LJJI(c46183IAp.LLJJ().LLLLL().LLJJIJIIJIL())) {
                c46183IAp.LLJILJIL().e8().LLZ();
            } else {
                ((I8E) c46183IAp.LJLJL.LIZ(c46183IAp, interfaceC74236TBoArr[4])).Ps0(null);
            }
            InterfaceC45540Hu4 LIZIZ = C163756bj.LIZIZ(c46183IAp);
            if (LIZIZ != null) {
                LIZIZ.registerActivityOnKeyDownListenerHead(c46183IAp);
                LIZIZ.registerActivityResultListener(c46183IAp);
                return;
            }
            return;
        }
        o.LJIJI("behavior");
        throw null;
    }

    @Override // X.AbstractC165596eh, X.AbstractC29891Fh
    public final void onCreate() {
        super.onCreate();
        ((HXE) this.LJLLILLLL.LIZ(this, LJLLLL[0])).Sg().LIZLLL(this, new AObjectS86S0100000_7(this, 58));
    }

    @Override // X.AbstractC165596eh
    public final WMH LJJLI() {
        return this.LJLJLLL;
    }

    @Override // X.AbstractC165596eh
    public final InterfaceC65784Pro<EffectDiscoverViewModel> LJJLIIIJILLIZJL() {
        return this.LJLLL;
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLJLJ;
    }

    public C46191IAx(C82622Wbi diContainer, WMH parentScene) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(parentScene, "parentScene");
        this.LJLJLJ = diContainer;
        this.LJLJLLL = parentScene;
        this.LJLL = R.id.irk;
        this.LJLLI = C45317HqT.LIZ();
        this.LJLLILLLL = UCI.LJI(diContainer, HXE.class, null);
        this.LJLLJ = C221108m2.LIZIZ(new AqS157S0100000_7(this, 215));
        this.LJLLL = new AqS157S0100000_7(this, 216);
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
