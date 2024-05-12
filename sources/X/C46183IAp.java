package X;

import Y.ACListenerS27S0100000_7;
import Y.IDObjectS179S0100000_7;
import Y.IDTListenerS116S0100000_7;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.effectdiscover.EffectDiscoverPanelState;
import com.ss.android.ugc.aweme.shortvideo.effectdiscover.EffectDiscoverViewModel;
import com.ss.android.ugc.tools.view.widget.ViewPagerBottomSheetBehavior;
import com.ss.ugc.effectplatform.model.Effect;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import kotlin.jvm.internal.AqS154S0200000_7;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.IDqS436S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.IAp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46183IAp extends WM7 implements InterfaceC143795kd, InterfaceC135635Tz, C5HC, InterfaceC144185lG {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLI;
    public final C82622Wbi LJLIL;
    public final int LJLILLLLZI;
    public final C82632Wbs LJLJI;
    public final C82632Wbs LJLJJI;
    public final C82632Wbs LJLJJL;
    public final C82631Wbr LJLJJLL;
    public final C82632Wbs LJLJL;
    public final C82632Wbs LJLJLJ;
    public final C82632Wbs LJLJLLL;
    public final C82632Wbs LJLL;
    public final C62822Ol8 LJLLI;
    public final C73849Syb<String> LJLLILLLL;
    public View LJLLJ;
    public View LJLLL;
    public View LJLLLL;
    public C6K9 LJLLLLLL;
    public ViewPagerBottomSheetBehavior<View> LJLZ;
    public ConstraintLayout LJZ;
    public ConstraintLayout LJZI;
    public RecyclerView LJZL;
    public T4V LL;
    public TuxTextView LLD;
    public TuxTextView LLF;
    public C72793ShZ LLFF;
    public AVMusic LLFFF;
    public final C73426Srm LLFII;
    public final I99 LLFZ;

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

    static {
        TBT tbt = new TBT(C46183IAp.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLI = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C46183IAp.class, "stickPanelApi", "getStickPanelApi()Lcom/bytedance/creativex/recorder/sticker/api/StickerPanelApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C46183IAp.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C46183IAp.class, "svcApiComponent", "getSvcApiComponent()Lcom/ss/android/ugc/gamora/recorder/voicechange/slideslip/SVCBottomAndPanelApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C46183IAp.class, "musicPlayApiComponent", "getMusicPlayApiComponent()Lcom/ss/android/ugc/gamora/recorder/choosemusic/play/MusicPlayApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C46183IAp.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0, c65351Pkp), C61845OOz.LIZJ(C46183IAp.class, "chooseMusicApi", "getChooseMusicApi()Lcom/ss/android/ugc/gamora/recorder/choosemusic/ChooseMusicApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C46183IAp.class, "recommendedMusicApi", "getRecommendedMusicApi()Lcom/ss/android/ugc/gamora/recorder/choosemusic/recommend/RecommendMusicApiComponent;", 0, c65351Pkp)};
    }

    public final InterfaceC82086WJm LLJILJIL() {
        return (InterfaceC82086WJm) this.LJLJJL.LIZ(this, LLI[2]);
    }

    public final ShortVideoContext LLJILJILJ() {
        return (ShortVideoContext) this.LJLJLJ.LIZ(this, LLI[5]);
    }

    public final I0N LLJJ() {
        return (I0N) this.LJLJI.LIZ(this, LLI[0]);
    }

    public final EffectDiscoverViewModel LLJJI() {
        return (EffectDiscoverViewModel) this.LJLLI.getValue();
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public C46183IAp(int i, C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = i;
        this.LJLJI = UCI.LJI(diContainer, I0N.class, null);
        this.LJLJJI = UCI.LJI(diContainer, InterfaceC45925I0r.class, null);
        this.LJLJJL = UCI.LJI(diContainer, InterfaceC82086WJm.class, null);
        this.LJLJJLL = UCI.LJII(diContainer, InterfaceC82199WNv.class, null);
        this.LJLJL = UCI.LJI(diContainer, I8E.class, null);
        this.LJLJLJ = UCI.LJI(diContainer, ShortVideoContext.class, null);
        this.LJLJLLL = UCI.LJI(diContainer, I27.class, null);
        this.LJLL = UCI.LJI(diContainer, I8N.class, null);
        this.LJLLI = C221108m2.LIZIZ(new AqS154S0200000_7(this, C65352Pkq.LIZ(EffectDiscoverViewModel.class), 33));
        C73849Syb<String> c73849Syb = new C73849Syb<>();
        this.LJLLILLLL = c73849Syb;
        this.LLFII = new C73426Srm(c73849Syb);
        this.LLFZ = new I99(this);
    }

    @Override // X.C5HC
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            LLJJI().hide();
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73297Sph.LJIIZILJ(vm1, interfaceC88472Yns);
    }

    @Override // X.InterfaceC144185lG
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        Context baseContext;
        Effect effect;
        if (i != 10087 || i2 != -1) {
            return false;
        }
        if (intent != null && (effect = (Effect) intent.getParcelableExtra("request_code_select_effect_result")) != null) {
            effect.setSearchType("prop_panel_discover");
            C82398WVm.LJ(LLJJ(), C47261Igj.LJJIJ(effect), true, true, null, false, null, 0, 16376);
        }
        if (C00F.LIZ(31744, 0, "discovery_page_reuse_video_sound", true) == 1) {
            Serializable serializable = null;
            if (intent != null) {
                serializable = intent.getSerializableExtra("aweme_music");
            }
            if (LLJILJIL().zZ().LIZLLL() <= 0 && !((I8N) this.LJLL.LIZ(this, LLI[7])).sq()) {
                o.LJII(serializable, "null cannot be cast to non-null type com.ss.android.ugc.aweme.music.model.Music");
                Music music = (Music) serializable;
                Activity activity = this.mActivity;
                if (activity != null && (baseContext = activity.getBaseContext()) != null) {
                    new I9Q();
                    AVMusic LIZ = I9Q.LIZ(music.convertToMusicModel());
                    if (LIZ != null && C44172HVg.LJI.LJIJJ(LIZ, baseContext)) {
                        this.LLFFF = LIZ;
                        C44172HVg.LJI.LJIILL(baseContext, LIZ, 6, false, this.LLFZ);
                    }
                }
            }
        }
        LLJJI().hide();
        return true;
    }

    @Override // X.WM7
    public final View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        o.LJIIIZ(container, "container");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.ccy, container, false);
        View findViewById = LLLLIILL.findViewById(R.id.kem);
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        Context context = findViewById.getContext();
        o.LJIIIIZZ(context, "it.context");
        layoutParams.height = C63081OpJ.LJJJJLI(context);
        findViewById.setLayoutParams(layoutParams);
        this.LJLLL = findViewById;
        View findViewById2 = LLLLIILL.findViewById(R.id.cru);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.effect…iscover_videos_container)");
        this.LJZ = (ConstraintLayout) findViewById2;
        C16880lQ.LJIILLIIL((ImageView) LLLLIILL.findViewById(R.id.bfh), new ACListenerS27S0100000_7(this, 28));
        View findViewById3 = LLLLIILL.findViewById(R.id.jh5);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.search_result_container)");
        this.LJZI = (ConstraintLayout) findViewById3;
        View findViewById4 = LLLLIILL.findViewById(R.id.jh8);
        o.LJIIIIZZ(findViewById4, "findViewById(R.id.search_result_recyclerview)");
        this.LJZL = (RecyclerView) findViewById4;
        View findViewById5 = LLLLIILL.findViewById(R.id.iaf);
        o.LJIIIIZZ(findViewById5, "findViewById(R.id.progress_bar_indicator)");
        this.LL = (T4V) findViewById5;
        View findViewById6 = LLLLIILL.findViewById(R.id.cyj);
        o.LJIIIIZZ(findViewById6, "findViewById(R.id.error_or_no_result)");
        this.LLD = (TuxTextView) findViewById6;
        View findViewById7 = LLLLIILL.findViewById(R.id.jgu);
        o.LJIIIIZZ(findViewById7, "findViewById(R.id.search_no_result_use_trend)");
        this.LLF = (TuxTextView) findViewById7;
        View findViewById8 = LLLLIILL.findViewById(R.id.mip);
        o.LJIIIIZZ(findViewById8, "findViewById(R.id.tv_search)");
        this.LJLLLLLL = (C6K9) findViewById8;
        View findViewById9 = LLLLIILL.findViewById(R.id.avg);
        o.LJIIIIZZ(findViewById9, "findViewById(R.id.btn_clear)");
        this.LJLLLL = findViewById9;
        if (this.LJLILLLLZI == 1) {
            View findViewById10 = LLLLIILL.findViewById(R.id.j5r);
            findViewById10.setVisibility(0);
            if (C58B.LIZ()) {
                C110614Vt c110614Vt = new C110614Vt();
                c110614Vt.LIZIZ = Integer.valueOf(R.attr.cj);
                c110614Vt.LIZJ = C61328O5c.LIZJ(8);
                C71313Ryn.LIZIZ(LLLLIILL, "context", c110614Vt, findViewById10);
            }
            I0N LLJJ = LLJJ();
            String LJI = LLJILJILJ().LJI();
            o.LJIIIIZZ(LJI, "shortVideoContext.creationId");
            this.LLFF = new C72793ShZ(LLJJ, LJI, new AqS173S0100000_7(this, 111));
            RecyclerView recyclerView = this.LJZL;
            if (recyclerView != null) {
                recyclerView.getContext();
                recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
                recyclerView.setAdapter(this.LLFF);
                C6K9 c6k9 = this.LJLLLLLL;
                if (c6k9 != null) {
                    c6k9.addTextChangedListener(new IDObjectS179S0100000_7(this, 0));
                    c6k9.setOnTouchListener(new IDTListenerS116S0100000_7(this, 1));
                    View view = this.LJLLLL;
                    if (view != null) {
                        C16880lQ.LJIIJ(new ACListenerS27S0100000_7(this, 29), view);
                        C73156SnQ.LJII(this, LLJJI(), new TBT() { // from class: X.IAr
                            @Override // X.TBT, X.TBZ, X.TBW
                            public final Object get(Object obj) {
                                return Boolean.valueOf(((EffectDiscoverPanelState) obj).getEmptySearchString());
                            }
                        }, new TBT() { // from class: X.IAw
                            @Override // X.TBT, X.TBZ, X.TBW
                            public final Object get(Object obj) {
                                return ((EffectDiscoverPanelState) obj).getSearchState();
                            }
                        }, new IDqS436S0100000_12(this, 17));
                    } else {
                        o.LJIJI("clearButton");
                        throw null;
                    }
                } else {
                    o.LJIJI("searchEditView");
                    throw null;
                }
            } else {
                o.LJIJI("recyclerView");
                throw null;
            }
        }
        this.LJLLJ = LLLLIILL;
        ViewPagerBottomSheetBehavior<View> LIZ = ViewPagerBottomSheetBehavior.LIZ(LLLLIILL.findViewById(R.id.c8m));
        LIZ.setPeekHeight(C60996Nwm.LIZLLL(requireSceneContext()) + C60996Nwm.LJ(requireSceneContext()));
        LIZ.LJII = true;
        LIZ.LJIIZILJ = new C46184IAq(this);
        this.LJLZ = LIZ;
        View view2 = this.LJLLJ;
        if (view2 != null) {
            return view2;
        }
        o.LJIJI("rootview");
        throw null;
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
