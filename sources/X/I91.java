package X;

import Y.AObjectS86S0100000_7;
import Y.AObserverS75S0100000_7;
import Y.AfS59S0100000_7;
import Y.IDhS100S0100000_7;
import android.text.TextUtils;
import android.util.LruCache;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.commerce.tools.music.CommerceToolsMusicService;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.ss.android.ugc.aweme.sticker.presenter.handler.AudioGraphStickerHandler;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.choosemusic.recommend.api.RecommendMusicApi;
import com.ss.android.ugc.gamora.recorder.choosemusic.recommend.model.RecommendMusic;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS138S0200000_7;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS189S0100000_7;
import kotlin.jvm.internal.IDqS432S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class I91 extends AbstractC29891Fh<I8N> implements I8N, InterfaceC143795kd, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLLJ;
    public final C82622Wbi LJLIL;
    public final C5H3 LJLILLLLZI;
    public final I91 LJLJI;
    public final C5H3 LJLJJI;
    public final C5H3 LJLJJL;
    public final InterfaceC115514g7 LJLJJLL;
    public final C5H3 LJLJL;
    public final C5H3 LJLJLJ;
    public boolean LJLJLLL;
    public boolean LJLL;
    public final C5H3 LJLLI;
    public I92 LJLLILLLL;

    static {
        TBT tbt = new TBT(I91.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        C65352Pkq.LIZ.getClass();
        LJLLJ = new InterfaceC74236TBo[]{tbt};
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

    private final InterfaceC45979I2t getBottomTabApiComponent() {
        return (InterfaceC45979I2t) this.LJLJL.getValue();
    }

    private final I3X getRecordControlApi() {
        return (I3X) this.LJLJLJ.getValue();
    }

    private final I0N getStickerApiComponent() {
        return (I0N) this.LJLJJL.getValue();
    }

    public final void LJJLI() {
        I92 i92 = this.LJLLILLLL;
        if (i92 != null) {
            i92.LJFF.LIZ(null, true);
        }
        this.LJLJLLL = true;
        LJJLIIIJILLIZJL().setUiLoadingMusic(false);
    }

    public final I27 LJJLIIIJILLIZJL() {
        return (I27) this.LJLJJI.getValue();
    }

    public final LruCache<String, HNQ> LJJLIIIJJI() {
        return (LruCache) this.LJLILLLLZI.getValue();
    }

    @Override // X.I8N
    /* renamed from: LJJLIIIJLLLLLLLZ, reason: merged with bridge method [inline-methods] */
    public MutableLiveData<HNQ> ai0() {
        return (MutableLiveData) this.LJLLI.getValue();
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LJLJJLL.LIZ(this, LJLLJ[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void LJJLIIIIJ() {
        /*
            r4 = this;
            androidx.lifecycle.MutableLiveData r0 = r4.ai0()
            java.lang.Object r1 = r0.getValue()
            X.HNQ r1 = (X.HNQ) r1
            r3 = 1
            r2 = 0
            if (r1 == 0) goto L3a
            boolean r0 = r4.LJJLL()
            if (r0 != 0) goto L1a
            boolean r0 = r4.LJJLJLI()
            if (r0 == 0) goto L37
        L1a:
            X.OSZ<? extends com.ss.android.ugc.aweme.shortvideo.model.MusicModel, java.lang.Long> r0 = r1.LJII
        L1c:
            if (r0 == 0) goto L3a
            java.lang.Object r1 = r0.getFirst()
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r1 = (com.ss.android.ugc.aweme.shortvideo.model.MusicModel) r1
        L24:
            r4.LJLJLLL = r2
            X.I92 r0 = r4.LJLLILLLL
            if (r0 == 0) goto L2f
            X.I98 r0 = r0.LJFF
            r0.LIZ(r1, r2)
        L2f:
            X.I27 r0 = r4.LJJLIIIJILLIZJL()
            r0.setUiLoadingMusic(r3)
            return
        L37:
            X.OSZ<? extends com.ss.android.ugc.aweme.shortvideo.model.MusicModel, java.lang.Long> r0 = r1.LJI
            goto L1c
        L3a:
            r1 = 0
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I91.LJJLIIIIJ():void");
    }

    private final void LJJLJ() {
        if (getShortVideoContext().recordPresetResource != null && (!TextUtils.isEmpty(getShortVideoContext().recordPresetResource.getMusicId()) || getShortVideoContext().recordPresetResource.getMusicModel() != null)) {
            Bk0(true);
        }
        if (getShortVideoContext().getMusicPath() != null && MusicBeanUtilKt.extractAVMusic(getShortVideoContext().creativeModel.musicBuzModel) != null) {
            Bk0(true);
        }
    }

    public final boolean LJJLJLI() {
        if (getShortVideoContext().shootMode == 18) {
            return true;
        }
        return false;
    }

    public final boolean LJJLL() {
        if (getShortVideoContext().shootMode == 14) {
            return true;
        }
        return false;
    }

    @Override // X.I8N
    public MusicModel cX() {
        OSZ<? extends MusicModel, Long> osz;
        HNQ value = ai0().getValue();
        if (value != null) {
            if (LJJLL() || LJJLJLI()) {
                osz = value.LJII;
            } else {
                osz = value.LJI;
            }
            if (osz != null) {
                return osz.getFirst();
            }
        }
        return null;
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        if (CommerceToolsMusicService.LIZIZ(false).U40() || getShortVideoContext().LJJIIZ()) {
            return;
        }
        if (!getShortVideoContext().LJJIJIIJI() && !getShortVideoContext().LJJJI() && !getShortVideoContext().LJJIJIIJIL()) {
            getStickerApiComponent().P2(new C44970Hks(new AqS189S0100000_7(this, 20)));
        }
        this.LJLLILLLL = new I92((ActivityC45651qj) C78688UuS.LJIJJ(this), I95.LJLIL, new IDqS432S0100000_7(this, 3), new AqS189S0100000_7(this, 21), new AqS157S0100000_7(this, 367));
        ai0().observe(this, new AObjectS86S0100000_7(this, 153));
        getStickerApiComponent().LLLLL().LJIIIIZZ().LJIILL().observe(this, new AObjectS86S0100000_7(this, 154));
        getStickerApiComponent().LLLLL().LJIIIIZZ().LIZ().observe(this, new AObserverS75S0100000_7(this, 43));
        getBottomTabApiComponent().getBottomTabIndexChangeEvent().LIZIZ(this, new AObjectS86S0100000_7(this, 155));
        getRecordControlApi().ck0().LIZLLL(this, new AObjectS86S0100000_7(this, 152));
        LJJLJ();
    }

    @Override // X.AbstractC29891Fh
    public void onDestroy() {
        super.onDestroy();
        I92 i92 = this.LJLLILLLL;
        if (i92 != null) {
            i92.LJFF.stop();
        }
        I92 i922 = this.LJLLILLLL;
        if (i922 != null) {
            i922.LJFF.onDestroy();
        }
    }

    @Override // X.AbstractC29891Fh
    public void onPause() {
        super.onPause();
        I92 i92 = this.LJLLILLLL;
        if (i92 != null) {
            i92.LJFF.pause();
        }
    }

    @Override // X.AbstractC29891Fh
    public void onStop() {
        super.onStop();
        I92 i92 = this.LJLLILLLL;
        if (i92 != null) {
            i92.LJFF.pause();
        }
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ I8N getApiComponent() {
        return this.LJLJI;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC73149SnJ
    public /* bridge */ /* synthetic */ AML getReceiver() {
        getReceiver2();
        return this;
    }

    @Override // X.I8N
    public boolean sq() {
        return this.LJLL;
    }

    public I91(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = C221108m2.LIZIZ(I94.LJLIL);
        this.LJLJI = this;
        this.LJLJJI = C269113v.LIZ(this, I27.class);
        this.LJLJJL = C269113v.LIZ(this, I0N.class);
        this.LJLJJLL = UCI.LJI(getDiContainer(), ShortVideoContext.class, null);
        this.LJLJL = C269113v.LIZ(this, InterfaceC45979I2t.class);
        this.LJLJLJ = C269113v.LIZ(this, I3X.class);
        this.LJLLI = C221108m2.LIZIZ(I96.LJLIL);
    }

    @Override // X.I8N
    public void Bk0(boolean z) {
        this.LJLL = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJJLIIIJJIZ(Effect effect) {
        String str;
        AbstractC73672Svk c73706SwI;
        AbstractC73638SvC LJIJI;
        AbstractC73672Svk<RecommendMusic> recommendMusic;
        List<String> music;
        if (this.LJLL) {
            return;
        }
        if (LJJLIIIJJI().get(effect.getEffectId()) != null) {
            ai0().setValue(LJJLIIIJJI().get(effect.getEffectId()));
            HNQ value = ai0().getValue();
            o.LJII(value, "null cannot be cast to non-null type com.ss.android.ugc.gamora.recorder.choosemusic.recommend.model.RecommendMusicData");
            value.LIZIZ();
            return;
        }
        if (!effect.isBusiness()) {
            str = effect.getEffectId();
        } else {
            str = null;
        }
        if (str == null && ((music = effect.getMusic()) == null || music.isEmpty())) {
            return;
        }
        String resourceId = effect.getResourceId();
        List<String> musicIds = effect.getMusic();
        if (musicIds == null) {
            musicIds = C61878OQg.INSTANCE;
        }
        AqS138S0200000_7 aqS138S0200000_7 = new AqS138S0200000_7(this, effect, 39);
        o.LJIIIZ(resourceId, "resourceId");
        o.LJIIIZ(musicIds, "musicIds");
        if (musicIds.isEmpty()) {
            LJIJI = AbstractC73638SvC.LJI(OAC.LJLJI);
        } else {
            RecommendMusicApi recommendMusicApi = (RecommendMusicApi) C169696lJ.LIZ(C60903NvH.LJIIJJI().getNetworkService(), true, RecommendMusicApi.class);
            C73693Sw5 LJJIIZ = AbstractC73672Svk.LJJIIZ(musicIds);
            IDhS100S0100000_7 iDhS100S0100000_7 = new IDhS100S0100000_7(recommendMusicApi, 7);
            C73320Sq4.LIZIZ(2, "prefetch");
            if (LJJIIZ instanceof I97) {
                Object call = ((I97) LJJIIZ).call();
                if (call == null) {
                    c73706SwI = C73536StY.LJLIL;
                } else {
                    c73706SwI = new C73566Su2(iDhS100S0100000_7, call);
                }
            } else {
                c73706SwI = new C73706SwI(LJJIIZ, iDhS100S0100000_7, 2, EnumC73710SwM.IMMEDIATE);
            }
            c73706SwI.getClass();
            LJIJI = new C73874Sz0(c73706SwI).LJIJI(new InterfaceC48038ItG() { // from class: X.2WZ
                @Override // X.InterfaceC48038ItG
                public final Object apply(Object it) {
                    o.LJIIIZ(it, "it");
                    return it;
                }
            });
        }
        AbstractC73672Svk LJJIIJZLJL = LJIJI.LJJIIJZLJL();
        if (C5WB.LIZ()) {
            RecommendMusic.Companion.getClass();
            recommendMusic = AbstractC73672Svk.LJJIJIL(RecommendMusic.EMPTY);
        } else {
            RecommendMusicApi recommendMusicApi2 = (RecommendMusicApi) C169696lJ.LIZ(C60903NvH.LJIIJJI().getNetworkService(), true, RecommendMusicApi.class);
            if (str == null) {
                RecommendMusic.Companion.getClass();
                recommendMusic = AbstractC73672Svk.LJJIJIL(RecommendMusic.EMPTY);
            } else {
                recommendMusic = recommendMusicApi2.getRecommendMusic(str, resourceId);
            }
        }
        C78685UuP c78685UuP = C78685UuP.LJLJJI;
        LJJIIJZLJL.getClass();
        C73320Sq4.LIZ(recommendMusic, "other is null");
        AbstractC73672Svk.LJJLL(LJJIIJZLJL, recommendMusic, c78685UuP).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS59S0100000_7(aqS138S0200000_7, 54), new AfS59S0100000_7(aqS138S0200000_7, 55));
    }

    public final void LJJLIIJ(OSZ<? extends MusicModel, Long> osz) {
        String musicId;
        if (osz == null || osz.getFirst() == null || getShortVideoContext().LJII().size() > 0 || this.LJLL) {
            return;
        }
        MusicModel first = osz.getFirst();
        if (first != null && (musicId = first.getMusicId()) != null) {
            String LJI = getShortVideoContext().LJI();
            o.LJIIIIZZ(LJI, "shortVideoContext.creationId");
            C145995oB c145995oB = new C145995oB();
            c145995oB.LJI("enter_from", "video_shoot_page");
            c145995oB.LJI("music_id", musicId);
            c145995oB.LJI("creation_id", LJI);
            FMX.LJIIL("show_music_popup", c145995oB.LIZ);
        }
        LJJLIIIIJ();
    }

    public final boolean LJJZZI(WS0 ws0) {
        if (o.LJ(ws0.LIZIZ, C78688UuS.LJIJJ(this).getString(R.string.pvy)) || o.LJ(ws0.LIZIZ, C78688UuS.LJIJJ(this).getString(R.string.pvy)) || o.LJ(ws0.LIZIZ, C78688UuS.LJIJJ(this).getString(R.string.pw1)) || o.LJ(ws0.LIZIZ, C78688UuS.LJIJJ(this).getString(R.string.pvz)) || o.LJ(ws0.LIZIZ, C78688UuS.LJIJJ(this).getString(R.string.pw0)) || o.LJ(ws0.LIZIZ, C78688UuS.LJIJJ(this).getString(R.string.pvx)) || o.LJ(ws0.LIZIZ, C78688UuS.LJIJJ(this).getString(R.string.pw7)) || o.LJ(ws0.LIZIZ, C78688UuS.LJIJJ(this).getString(R.string.pw9)) || o.LJ(ws0.LIZIZ, C78688UuS.LJIJJ(this).getString(R.string.pw6)) || o.LJ(ws0.LIZIZ, C78688UuS.LJIJJ(this).getString(R.string.pwh)) || o.LJ(ws0.LIZIZ, C78688UuS.LJIJJ(this).getString(R.string.pw5))) {
            return true;
        }
        return false;
    }

    public final boolean LJJZZIII(Effect effect) {
        if (getShortVideoContext().cameraComponentModel.isRetakeMode || V3N.LJJII(effect) || V3N.LJIILLIIL(effect)) {
            return false;
        }
        if (!ID0.LJJII(effect)) {
            AudioGraphStickerHandler.LJLJLJ.getClass();
            if (!I28.LIZ(effect)) {
                Boolean bool = getShortVideoContext().doNotLoadMusic;
                o.LJIIIIZZ(bool, "shortVideoContext.doNotLoadMusic");
                if (bool.booleanValue()) {
                    return false;
                }
                return true;
            }
        }
        return getShortVideoContext().creativeModel.micDataModel.recordOriginalSoundWithBGM;
    }

    public <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at> S1 getState(VM1 vm1) {
        return (S1) C73297Sph.LIZIZ(this, vm1);
    }

    public final void LJLIIL(MusicModel musicModel, String str) {
        String str2;
        List<String> musicIds;
        FaceStickerBean Z5 = getStickerApiComponent().Z5();
        if (Z5 != null && (musicIds = Z5.getMusicIds()) != null && musicIds.contains(musicModel.getMusicId())) {
            str2 = "prop_music_soft_bind";
        } else {
            str2 = "prop_music_recommended";
        }
        AVMusic transformMusicModel = C44172HVg.LJI.transformMusicModel(musicModel);
        if (transformMusicModel != null) {
            transformMusicModel.setMusicPriority(-1);
        }
        LJJLIIIJILLIZJL().changeCancelMusicBtnVisible(true);
        LJJLIIIJILLIZJL().setUiLoadingMusic(false);
        LJJLIIIJILLIZJL().onChooseMusicDone(false, str2, transformMusicModel, str);
        LJJLIIIJILLIZJL().handleChooseMusic(C145385nC.LIZ(Boolean.FALSE, "", transformMusicModel, str, null, 0L, 0L, 112));
        I9T.LJI(transformMusicModel, false, getShortVideoContext().creativeModel.musicBuzModel);
        getShortVideoContext().LJJIL(str2);
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
