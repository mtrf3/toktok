package X;

import Y.AObjectS86S0100000_7;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.als.LiveEvent;
import com.bytedance.android.livesdk.livesetting.performance.LivePlayEnforceIntervalSetting;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.ktx.SceneExtensionsKt;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class I8S extends AbstractC29891Fh<I2H> implements I2H, InterfaceC143795kd, InterfaceC135635Tz {
    public static final I8V LJLLL;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLLLL;
    public static final long LJLLLLLL;
    public final WMH LJLIL;
    public final C82622Wbi LJLILLLLZI;
    public final I8S LJLJI;
    public final C29901Fi<Boolean> LJLJJI;
    public final InterfaceC115514g7 LJLJJL;
    public final InterfaceC115514g7 LJLJJLL;
    public final InterfaceC115514g7 LJLJL;
    public final InterfaceC115514g7 LJLJLJ;
    public final InterfaceC115514g7 LJLJLLL;
    public final InterfaceC115514g7 LJLL;
    public final I8E LJLLI;
    public final C82143WLr LJLLILLLL;
    public final GHB LJLLJ;

    static {
        TBT tbt = new TBT(I8S.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0);
        C65352Pkq.LIZ.getClass();
        LJLLLL = new InterfaceC74236TBo[]{tbt, new TBT(I8S.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0), new TBT(I8S.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0), new TBT(I8S.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0), new TBT(I8S.class, "planCUiApiComponent", "getPlanCUiApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0), new TBT(I8S.class, "tiktokCameraApi", "getTiktokCameraApi()Lcom/bytedance/creativex/recorder/camera/api/TikTokCameraApiComponent;", 0)};
        LJLLL = new I8V();
        LJLLLLLL = C60903NvH.LJIIJJI().LJJIII().getMaxDurationResolver().getMaxShootingDuration();
    }

    public final void LJJLIIIJJI() {
        Effect effect;
        TEZ LLLLL;
        LJJLI(true);
        I8E i8e = this.LJLLI;
        if (i8e != null) {
            i8e.wM(0, false);
        }
        I8E i8e2 = this.LJLLI;
        if (i8e2 != null) {
            String musicPath = getShortVideoContext().getMusicPath();
            long j = getShortVideoContext().cameraComponentModel.mMusicStart;
            Long valueOf = Long.valueOf(getShortVideoContext().LJIILIIL());
            I0N stickerApiComponent = getStickerApiComponent();
            if (stickerApiComponent != null && (LLLLL = stickerApiComponent.LLLLL()) != null) {
                effect = LLLLL.LLJJIJIIJIL();
            } else {
                effect = null;
            }
            i8e2.Yk0(musicPath, j, valueOf, effect, I8M.LJLIL);
        }
        LJJLIIIJLLLLLLLZ();
    }

    @Override // X.InterfaceC73141SnB
    public LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public InterfaceC73141SnB getLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC73149SnJ
    /* renamed from: getReceiver, reason: avoid collision after fix types in other method */
    public AML getReceiver2() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public InterfaceC73149SnJ<AML> getReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC73150SnK
    public boolean getUniqueOnlyGlobal() {
        return true;
    }

    private final InterfaceC45999I3n LJJLIIIIJ() {
        return (InterfaceC45999I3n) this.LJLJLLL.LIZ(this, LJLLLL[4]);
    }

    private final WRQ LJJLIIIJILLIZJL() {
        return (WRQ) this.LJLL.LIZ(this, LJLLLL[5]);
    }

    private final void LJJLIIIJLLLLLLLZ() {
        C78897Uxp.LJJJJ(this.LJLIL).LLJJL(this.LJLLJ);
    }

    private final I3X getRecordControlApi() {
        return (I3X) this.LJLJJLL.LIZ(this, LJLLLL[1]);
    }

    private final I0N getStickerApiComponent() {
        return (I0N) this.LJLJLJ.LIZ(this, LJLLLL[3]);
    }

    @Override // X.I2H
    public boolean N5() {
        NavigationScene LJIL = C78897Uxp.LJIL(this.LJLIL);
        o.LJI(LJIL);
        return C79057V0z.LJIIZILJ(LJIL, C82143WLr.class);
    }

    public final InterfaceC82086WJm getCameraApiComponent() {
        return (InterfaceC82086WJm) this.LJLJJL.LIZ(this, LJLLLL[0]);
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LJLJL.LIZ(this, LJLLLL[2]);
    }

    public final void LJJLIIJ() {
        long j;
        AVMusic extractAVMusic = MusicBeanUtilKt.extractAVMusic(getShortVideoContext().creativeModel.musicBuzModel);
        if (extractAVMusic != null) {
            if (getShortVideoContext().cameraComponentModel.mCurrentDurationMode) {
                j = I2D.LJI;
            } else {
                j = LivePlayEnforceIntervalSetting.DEFAULT;
            }
            Ca(j, extractAVMusic);
            return;
        }
        sa(false);
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        C0IB<OSZ<Long, AVMusic>> Cb;
        C0IB<Boolean> Xz;
        super.onCreate();
        if (getShortVideoContext().LJJJI()) {
            sa(false);
        }
        getCameraApiComponent().mX().LIZLLL(this, new AObjectS86S0100000_7(this, 206));
        getRecordControlApi().Vh().LIZLLL(this, new AObjectS86S0100000_7(this, 207));
        getRecordControlApi().Gg0().LIZLLL(this, new AObjectS86S0100000_7(this, 208));
        getRecordControlApi().Rr0().LIZLLL(this, new AObjectS86S0100000_7(this, 209));
        InterfaceC45999I3n LJJLIIIIJ = LJJLIIIIJ();
        if (LJJLIIIIJ != null && (Xz = LJJLIIIIJ.Xz()) != null) {
            Xz.LIZIZ(this, new AObjectS86S0100000_7(this, 210));
        }
        InterfaceC45999I3n LJJLIIIIJ2 = LJJLIIIIJ();
        if (LJJLIIIIJ2 != null && (Cb = LJJLIIIIJ2.Cb()) != null) {
            Cb.LIZIZ(this, new AObjectS86S0100000_7(this, 211));
        }
    }

    @Override // X.I2H
    public /* bridge */ /* synthetic */ LiveEvent D6() {
        return this.LJLJJI;
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ I2H getApiComponent() {
        return this.LJLJI;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC73149SnJ
    public /* bridge */ /* synthetic */ AML getReceiver() {
        getReceiver2();
        return this;
    }

    public final void LJJLI(boolean z) {
        Effect effect;
        TEZ LLLLL;
        I0N stickerApiComponent = getStickerApiComponent();
        if (stickerApiComponent != null && (LLLLL = stickerApiComponent.LLLLL()) != null) {
            effect = LLLLL.LLJJIJIIJIL();
        } else {
            effect = null;
        }
        if (V3N.LJJI(effect)) {
            if (z) {
                getCameraApiComponent().e8().LLZIL();
            } else {
                getCameraApiComponent().e8().LLZ();
            }
        }
    }

    public final void LJJLIIIJJIZ(int i) {
        TEZ LLLLL;
        a5(false);
        Effect effect = null;
        ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) C165706es.LJIIIIZZ(this.LJLIL, null, null, 6).get(ShortVideoContextViewModel.class)).LJLIL;
        WMH wmh = this.LJLIL;
        if (!(wmh instanceof C45848Hz2)) {
            wmh = null;
        }
        long j = i;
        getCameraApiComponent().e8().J9(j, shortVideoContext.LJIIIIZZ(), shortVideoContext.cameraComponentModel.mMusicPath, false);
        if (i != shortVideoContext.cameraComponentModel.mMusicStart) {
            getRecordControlApi().FV(shortVideoContext.cameraComponentModel.mCurrentDurationMode, true);
        }
        shortVideoContext.cameraComponentModel.mMusicStart = i;
        I9T.LJII(i, "shoot_normal", shortVideoContext.creativeModel.musicBuzModel);
        HB4.LJII(shortVideoContext.cameraComponentModel.mMusicPath, MusicBeanUtilKt.extractAVMusic(shortVideoContext.creativeModel.musicBuzModel), i);
        I8E i8e = this.LJLLI;
        if (i8e != null) {
            i8e.wM(0, false);
        }
        I8E i8e2 = this.LJLLI;
        if (i8e2 != null) {
            String musicPath = shortVideoContext.getMusicPath();
            Long valueOf = Long.valueOf(shortVideoContext.LJIILIIL());
            I0N stickerApiComponent = getStickerApiComponent();
            if (stickerApiComponent != null && (LLLLL = stickerApiComponent.LLLLL()) != null) {
                effect = LLLLL.LLJJIJIIJIL();
            }
            i8e2.Yk0(musicPath, j, valueOf, effect, I8M.LJLIL);
        }
        if (wmh != null) {
            getRecordControlApi().vK(new C44302Ha6(shortVideoContext.cameraComponentModel.mMaxDuration));
            C78928UyK.LIZIZ(true, false, false, getCameraApiComponent());
        }
    }

    @Override // X.I2H
    public void a5(boolean z) {
        if (C78897Uxp.LJIL(this.LJLIL) == null) {
            return;
        }
        NavigationScene LJJJJ = C78897Uxp.LJJJJ(this.LJLIL);
        if (z && !C79057V0z.LJIIZILJ(LJJJJ, C82143WLr.class)) {
            I8E i8e = this.LJLLI;
            if (i8e != null) {
                i8e.wM(0, true);
            }
            I8E i8e2 = this.LJLLI;
            if (i8e2 != null) {
                i8e2.Ps0(null);
            }
            LJJLI(false);
            LJJJJ.LLJJJJ(this.LJLLILLLL, null);
            LJJJJ.registerChildSceneLifecycleCallbacks(new C42687Gp9(LJJJJ, C82143WLr.class, new AqS157S0100000_7(this, 388)), false);
            LJJJJ.LLJILJILJ(SceneExtensionsKt.LIZLLL(this.LJLIL), this.LJLLJ);
            return;
        }
        if (!N5()) {
            return;
        }
        LJJJJ.remove(this.LJLLILLLL);
        LJJLIIIJLLLLLLLZ();
    }

    public <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at> S1 getState(VM1 vm1) {
        return (S1) C73297Sph.LIZIZ(this, vm1);
    }

    @Override // X.I2H
    public void sa(boolean z) {
        this.LJLJJI.LJII(Boolean.valueOf(z));
    }

    public I8S(WMH parentScene, C82622Wbi diContainer) {
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = parentScene;
        this.LJLILLLLZI = diContainer;
        this.LJLJI = this;
        this.LJLJJI = new C29901Fi<>();
        this.LJLJJL = UCI.LJI(getDiContainer(), InterfaceC82086WJm.class, null);
        this.LJLJJLL = UCI.LJI(getDiContainer(), I3X.class, null);
        this.LJLJL = UCI.LJI(getDiContainer(), ShortVideoContext.class, null);
        this.LJLJLJ = UCI.LJII(getDiContainer(), I0N.class, null);
        this.LJLJLLL = UCI.LJII(getDiContainer(), InterfaceC45999I3n.class, null);
        this.LJLL = UCI.LJI(getDiContainer(), WRQ.class, null);
        this.LJLLI = (I8E) getDiContainer().LJIIIIZZ(null, I8E.class);
        this.LJLLILLLL = new C82143WLr(new AqS173S0100000_7(this, 195));
        this.LJLLJ = new I8T(this);
    }

    @Override // X.I2H
    public void Ca(long j, AVMusic music) {
        long j2;
        o.LJIIIZ(music, "music");
        int i = music.musicType;
        if (i == 1) {
            if (music.getShootDuration() > j || Math.abs(music.getShootDuration() - music.getDuration()) >= 1000) {
                sa(true);
                return;
            } else {
                sa(false);
                return;
            }
        }
        if (i != 0) {
            return;
        }
        AVMusic extractAVMusic = MusicBeanUtilKt.extractAVMusic(getShortVideoContext().creativeModel.musicBuzModel);
        if (extractAVMusic != null) {
            j2 = extractAVMusic.getLocalMusicDuration();
        } else {
            j2 = 0;
        }
        if (j2 > j) {
            sa(true);
        } else {
            sa(false);
        }
    }

    @Override // X.InterfaceC73150SnK
    public <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73297Sph.LJIIZILJ(vm1, interfaceC88472Yns);
    }

    public <M1 extends C73139Sn9<S1, PROP1>, PROP1 extends InterfaceC61312at, S1 extends InterfaceC61312at, R> R withSubstate(C73139Sn9<S1, PROP1> c73139Sn9, InterfaceC88472Yns<? super PROP1, ? extends R> interfaceC88472Yns) {
        return (R) C73297Sph.LJIL(c73139Sn9, interfaceC88472Yns);
    }

    @Override // X.InterfaceC73150SnK
    public <S extends InterfaceC61312at> InterfaceC92693kP subscribe(JediViewModel<S> jediViewModel, C73165SnZ<S> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C73297Sph.LJIIIZ(this, jediViewModel, c73165SnZ, interfaceC88471Ynr);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, VM2 extends JediViewModel<S2>, S2 extends InterfaceC61312at, R> R withState(VM1 vm1, VM2 vm2, InterfaceC88471Ynr<? super S1, ? super S2, ? extends R> interfaceC88471Ynr) {
        return (R) C73297Sph.LJIILLIIL(vm1, vm2, interfaceC88471Ynr);
    }

    public <M1 extends C73139Sn9<S1, PROP1>, PROP1 extends InterfaceC61312at, S1 extends InterfaceC61312at, M2 extends C73139Sn9<S2, PROP2>, PROP2 extends InterfaceC61312at, S2 extends InterfaceC61312at, R> R withSubstate(C73139Sn9<S1, PROP1> c73139Sn9, C73139Sn9<S2, PROP2> c73139Sn92, InterfaceC88471Ynr<? super PROP1, ? super PROP2, ? extends R> interfaceC88471Ynr) {
        return (R) C73297Sph.LJIJJLI(c73139Sn9, c73139Sn92, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC143795kd
    public <S extends InterfaceC61312at, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super InterfaceC143795kd, ? super A, C76800UCe> interfaceC88471Ynr) {
        C73297Sph.LIZJ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC73150SnK
    public <S extends InterfaceC61312at, A> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C73297Sph.LJ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    @Override // X.InterfaceC143795kd
    public <S extends InterfaceC61312at, A> void subscribeEvent(JediViewModel<S> jediViewModel, TBW<S, ? extends C45927I0t<? extends A>> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super InterfaceC143795kd, ? super A, C76800UCe> interfaceC88471Ynr) {
        C73297Sph.LJIIJ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    public <S extends InterfaceC61312at, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, TBW<S, ? extends C2KE<? extends A>> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super InterfaceC143795kd, ? super A, C76800UCe> interfaceC88471Ynr) {
        C73297Sph.LJIIL(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, VM2 extends JediViewModel<S2>, S2 extends InterfaceC61312at, VM3 extends JediViewModel<S3>, S3 extends InterfaceC61312at, R> R withState(VM1 vm1, VM2 vm2, VM3 vm3, InterfaceC88473Ynt<? super S1, ? super S2, ? super S3, ? extends R> interfaceC88473Ynt) {
        return (R) C73297Sph.LJIILL(vm1, vm2, vm3, interfaceC88473Ynt);
    }

    public <M1 extends C73139Sn9<S1, PROP1>, PROP1 extends InterfaceC61312at, S1 extends InterfaceC61312at, M2 extends C73139Sn9<S2, PROP2>, PROP2 extends InterfaceC61312at, S2 extends InterfaceC61312at, M3 extends C73139Sn9<S3, PROP3>, PROP3 extends InterfaceC61312at, S3 extends InterfaceC61312at, R> R withSubstate(C73139Sn9<S1, PROP1> c73139Sn9, C73139Sn9<S2, PROP2> c73139Sn92, C73139Sn9<S3, PROP3> c73139Sn93, InterfaceC88473Ynt<? super PROP1, ? super PROP2, ? super PROP3, ? extends R> interfaceC88473Ynt) {
        return (R) C73297Sph.LJIJJ(c73139Sn9, c73139Sn92, c73139Sn93, interfaceC88473Ynt);
    }

    @Override // X.InterfaceC73150SnK
    public <S extends InterfaceC61312at, A, B> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C73165SnZ<TMG> c73165SnZ, InterfaceC88473Ynt<? super AML, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C73297Sph.LJFF(this, jediViewModel, tbw, tbw2, c73165SnZ, interfaceC88473Ynt);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, VM2 extends JediViewModel<S2>, S2 extends InterfaceC61312at, VM3 extends JediViewModel<S3>, S3 extends InterfaceC61312at, VM4 extends JediViewModel<S4>, S4 extends InterfaceC61312at, R> R withState(VM1 vm1, VM2 vm2, VM3 vm3, VM4 vm4, InterfaceC88474Ynu<? super S1, ? super S2, ? super S3, ? super S4, ? extends R> interfaceC88474Ynu) {
        return (R) C73297Sph.LJIILJJIL(vm1, vm2, vm3, vm4, interfaceC88474Ynu);
    }

    public <M1 extends C73139Sn9<S1, PROP1>, PROP1 extends InterfaceC61312at, S1 extends InterfaceC61312at, M2 extends C73139Sn9<S2, PROP2>, PROP2 extends InterfaceC61312at, S2 extends InterfaceC61312at, M3 extends C73139Sn9<S3, PROP3>, PROP3 extends InterfaceC61312at, S3 extends InterfaceC61312at, M4 extends C73139Sn9<S4, PROP4>, PROP4 extends InterfaceC61312at, S4 extends InterfaceC61312at, R> R withSubstate(C73139Sn9<S1, PROP1> c73139Sn9, C73139Sn9<S2, PROP2> c73139Sn92, C73139Sn9<S3, PROP3> c73139Sn93, C73139Sn9<S4, PROP4> c73139Sn94, InterfaceC88474Ynu<? super PROP1, ? super PROP2, ? super PROP3, ? super PROP4, ? extends R> interfaceC88474Ynu) {
        return (R) C73297Sph.LJIJI(c73139Sn9, c73139Sn92, c73139Sn93, c73139Sn94, interfaceC88474Ynu);
    }

    @Override // X.InterfaceC73150SnK
    public <S extends InterfaceC61312at, T> InterfaceC92693kP asyncSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends AbstractC26082ALm<? extends T>> tbw, C73165SnZ<C73140SnA> c73165SnZ, InterfaceC88471Ynr<? super AML, ? super Throwable, C76800UCe> interfaceC88471Ynr, InterfaceC88472Yns<? super AML, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super AML, ? super T, C76800UCe> interfaceC88471Ynr2) {
        return C73297Sph.LIZ(this, jediViewModel, tbw, c73165SnZ, interfaceC88471Ynr, interfaceC88472Yns, interfaceC88471Ynr2);
    }

    @Override // X.InterfaceC73150SnK
    public <S extends InterfaceC61312at, A, B, C> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C73165SnZ<C157166Eu> c73165SnZ, InterfaceC88474Ynu<? super AML, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C73297Sph.LJI(this, jediViewModel, tbw, tbw2, tbw3, c73165SnZ, interfaceC88474Ynu);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, VM2 extends JediViewModel<S2>, S2 extends InterfaceC61312at, VM3 extends JediViewModel<S3>, S3 extends InterfaceC61312at, VM4 extends JediViewModel<S4>, S4 extends InterfaceC61312at, VM5 extends JediViewModel<S5>, S5 extends InterfaceC61312at, R> R withState(VM1 vm1, VM2 vm2, VM3 vm3, VM4 vm4, VM5 vm5, InterfaceC88475Ynv<? super S1, ? super S2, ? super S3, ? super S4, ? super S5, ? extends R> interfaceC88475Ynv) {
        return (R) C73297Sph.LJIILIIL(vm1, vm2, vm3, vm4, vm5, interfaceC88475Ynv);
    }

    public <M1 extends C73139Sn9<S1, PROP1>, PROP1 extends InterfaceC61312at, S1 extends InterfaceC61312at, M2 extends C73139Sn9<S2, PROP2>, PROP2 extends InterfaceC61312at, S2 extends InterfaceC61312at, M3 extends C73139Sn9<S3, PROP3>, PROP3 extends InterfaceC61312at, S3 extends InterfaceC61312at, M4 extends C73139Sn9<S4, PROP4>, PROP4 extends InterfaceC61312at, S4 extends InterfaceC61312at, M5 extends C73139Sn9<S5, PROP5>, PROP5 extends InterfaceC61312at, S5 extends InterfaceC61312at, R> R withSubstate(C73139Sn9<S1, PROP1> c73139Sn9, C73139Sn9<S2, PROP2> c73139Sn92, C73139Sn9<S3, PROP3> c73139Sn93, C73139Sn9<S4, PROP4> c73139Sn94, C73139Sn9<S5, PROP5> c73139Sn95, InterfaceC88475Ynv<? super PROP1, ? super PROP2, ? super PROP3, ? super PROP4, ? super PROP5, ? extends R> interfaceC88475Ynv) {
        return (R) C73297Sph.LJIJ(c73139Sn9, c73139Sn92, c73139Sn93, c73139Sn94, c73139Sn95, interfaceC88475Ynv);
    }

    @Override // X.InterfaceC73150SnK
    public <S extends InterfaceC61312at, A, B, C, D> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C73165SnZ<W1T> c73165SnZ, InterfaceC88475Ynv<? super AML, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C73297Sph.LJII(this, jediViewModel, tbw, tbw2, tbw3, tbw4, c73165SnZ, interfaceC88475Ynv);
    }

    public <S extends InterfaceC61312at, A, B, C, D, E> InterfaceC92693kP selectSubscribe(JediViewModel<S> jediViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, TBW<S, ? extends E> tbw5, C73165SnZ<TMF> c73165SnZ, InterfaceC88476Ynw<? super AML, ? super A, ? super B, ? super C, ? super D, ? super E, C76800UCe> interfaceC88476Ynw) {
        return C73297Sph.LJIIIIZZ(this, jediViewModel, tbw, tbw2, tbw3, tbw4, tbw5, c73165SnZ, interfaceC88476Ynw);
    }
}
