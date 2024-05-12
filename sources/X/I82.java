package X;

import Y.AObjectS86S0100000_7;
import android.text.TextUtils;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.als.LiveEvent;
import com.bytedance.android.livesdk.livesetting.performance.LivePlayEnforceIntervalSetting;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.ss.android.ugc.aweme.sticker.model.BackgroundVideo;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class I82 extends AbstractC29891Fh<HXB> implements InterfaceC143795kd, HXB, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLLL;
    public final WMH LJLIL;
    public final C82622Wbi LJLILLLLZI;
    public final I83 LJLJI;
    public final InterfaceC115514g7 LJLJJI;
    public final InterfaceC115514g7 LJLJJL;
    public final InterfaceC115514g7 LJLJJLL;
    public final InterfaceC115514g7 LJLJL;
    public final InterfaceC115514g7 LJLJLJ;
    public final InterfaceC115514g7 LJLJLLL;
    public final InterfaceC115514g7 LJLL;
    public final C29901Fi<C76800UCe> LJLLI;
    public final C29901Fi<C76800UCe> LJLLILLLL;
    public final C5H3 LJLLJ;

    static {
        TBT tbt = new TBT(I82.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLLL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(I82.class, "cameraApi", "getCameraApi()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(I82.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0, c65351Pkp), C61845OOz.LIZJ(I82.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(I82.class, "bottomTabApiComponent", "getBottomTabApiComponent()Lcom/ss/android/ugc/aweme/ftc/bottom/FTCBottomTabApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(I82.class, "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(I82.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0, c65351Pkp)};
    }

    public I82 LJJLI() {
        return this;
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

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        HNK hnk = new HNK(getActivity(), getCameraApi(), getStickerApiComponent(), this, getShortVideoContext());
        this.LJLIL.add(R.id.iri, new I88(this.LJLJI, ((InterfaceC45999I3n) getDiContainer().LJ(InterfaceC45999I3n.class, null)).Na0()), "FTCRecordChooseMusicScene");
        this.LJLJI.LJLLI.LIZLLL(this, new AObjectS86S0100000_7(hnk, 9));
        this.LJLJI.LJLIL.LIZIZ(this, new AObjectS86S0100000_7(this, 10));
        getCameraApi().md0().LIZLLL(this, new AObjectS86S0100000_7(this, 11));
        LJJLIIIIJ().getBottomTabIndexChangeEvent().LIZIZ(this, new AObjectS86S0100000_7(this, 12));
        getRecordControlApi().Vh().LIZLLL(this, new AObjectS86S0100000_7(this, 13));
        getRecordControlApi().Gg0().LIZLLL(this, new AObjectS86S0100000_7(this, 14));
        getPlanCUIApiComponent().Et().LIZIZ(this, new AObjectS86S0100000_7(this, 15));
        initMusicUI();
    }

    private final InterfaceC45971I2l LJJLIIIIJ() {
        return (InterfaceC45971I2l) this.LJLJLJ.LIZ(this, LJLLL[4]);
    }

    private final I84 LJJLIIIJILLIZJL() {
        return (I84) this.LJLLJ.getValue();
    }

    private final InterfaceC82086WJm getCameraApi() {
        return (InterfaceC82086WJm) this.LJLJJL.LIZ(this, LJLLL[1]);
    }

    private final I0N getStickerApiComponent() {
        return (I0N) this.LJLJL.LIZ(this, LJLLL[3]);
    }

    public final ActivityC45651qj getActivity() {
        return (ActivityC45651qj) this.LJLJJI.LIZ(this, LJLLL[0]);
    }

    public final InterfaceC45999I3n getPlanCUIApiComponent() {
        return (InterfaceC45999I3n) this.LJLJLLL.LIZ(this, LJLLL[5]);
    }

    public final I3X getRecordControlApi() {
        return (I3X) this.LJLJJLL.LIZ(this, LJLLL[2]);
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LJLL.LIZ(this, LJLLL[6]);
    }

    @Override // X.HXB
    public void initStitch() {
        this.LJLJI.LJLL.LJII(null);
    }

    @Override // X.HXB
    public void notifyMusicChange() {
        this.LJLJI.LJLJJL.LJII(null);
    }

    @Override // X.HXB
    public void tryHideMusicTips() {
        this.LJLJI.LJLJLLL.LJII(null);
    }

    private final InterfaceC83624Wrs getCameraView() {
        return getCameraApi().e8();
    }

    private final void initMusicUI() {
        AVMusic extractAVMusic;
        if (!getShortVideoContext().LJJJI() && !TextUtils.equals(getShortVideoContext().shootWay, "upload_anchor") && (extractAVMusic = MusicBeanUtilKt.extractAVMusic(getShortVideoContext().creativeModel.musicBuzModel)) != null) {
            getCameraView().pauseEffectAudio(true);
            getCameraView().u4(false);
            changeHasMusic(extractAVMusic);
            changeUiEnableState(false);
            tryShowMusicTip();
            monitorAutoSelectedMusic(getShortVideoContext().shootWay, extractAVMusic);
        }
    }

    private final void tryShowMusicTip() {
        AVMusic extractAVMusic;
        EffectTemplate effectTemplate;
        if (getShortVideoContext() == null || !getShortVideoContext().LJIL() || V3N.LJIILLIIL((Effect) C163796bn.LIZIZ(this.LJLIL).getParcelable("first_sticker"))) {
            return;
        }
        getShortVideoContext().LJJJ();
        showMusicTips(1);
        InterfaceC45889Hzh interfaceC45889Hzh = (InterfaceC45889Hzh) getDiContainer().LJ(InterfaceC45889Hzh.class, null);
        interfaceC45889Hzh.setNeedNoTouchListener(true);
        interfaceC45889Hzh.getNoBlockTouchEvent().LIZLLL(this, new AObjectS86S0100000_7(this, 16));
        if ((!o.LJ("prop_reuse", getShortVideoContext().shootWay) && !o.LJ("prop_page", getShortVideoContext().shootWay)) || (extractAVMusic = MusicBeanUtilKt.extractAVMusic(getShortVideoContext().creativeModel.musicBuzModel)) == null || (effectTemplate = (EffectTemplate) C163796bn.LIZIZ(this.LJLIL).getParcelable("first_sticker")) == null) {
            return;
        }
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", getShortVideoContext().LJI());
        c145995oB.LJI("shoot_way", getShortVideoContext().shootWay);
        c145995oB.LJI("enter_from", "video_shoot_page");
        c145995oB.LJI("music_id", extractAVMusic.getMusicId());
        c145995oB.LJI("prop_id", effectTemplate.getEffectId());
        c145995oB.LJI("group_id", EnumC46139I8x.INSTANCE.getVideoId());
        FMX.LJIIL("prop_music_show", c145995oB.LIZ);
    }

    @Override // X.HXB
    public void handleCancelMusicResultEvent() {
        I9T.LJI(null, false, getShortVideoContext().creativeModel.musicBuzModel);
        getCameraView().u4(true);
        getCameraView().pauseEffectAudio(false);
        getCameraView().setMusicPath("");
        getCameraView().J9(0L, 0L, "", false);
        getCameraView().LLZL(false);
        getStickerApiComponent().PU();
        getShortVideoContext().LJJIJLIJ(0);
        getShortVideoContext().cameraComponentModel.mMusicStart = 0;
        getShortVideoContext().cameraComponentModel.mWorkspace.v();
        getShortVideoContext().cameraComponentModel.mMusicPath = null;
        C78915Uy7.LJJIIJZLJL(getStickerApiComponent(), C83728WtY.LIZIZ.LIZIZ(EnumC83729WtZ.FTC_AUDIO_RECORD_OPEN_CANCEL_MUSIC, null));
        this.LJLLILLLL.LJII(C76800UCe.LIZ);
        if (!getShortVideoContext().cameraComponentModel.mDurationSwitchable) {
            getRecordControlApi().FV(getShortVideoContext().cameraComponentModel.mCurrentDurationMode, false);
        }
    }

    @Override // X.HXB
    public void mN() {
        changeHasMusic(MusicBeanUtilKt.extractAVMusic(getShortVideoContext().creativeModel.musicBuzModel));
        setupClickListener(false);
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ HXB getApiComponent() {
        LJJLI();
        return this;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLILLLLZI;
    }

    @Override // X.HXB
    public /* bridge */ /* synthetic */ LiveEvent getMusicAdded() {
        return this.LJLLI;
    }

    @Override // X.HXB
    public /* bridge */ /* synthetic */ LiveEvent getMusicCleared() {
        return this.LJLLILLLL;
    }

    @Override // X.InterfaceC73149SnJ
    public /* bridge */ /* synthetic */ AML getReceiver() {
        getReceiver2();
        return this;
    }

    @Override // X.HXB
    public void changeHasMusic(AVMusic aVMusic) {
        this.LJLJI.LJLJL.LJII(aVMusic);
    }

    @Override // X.HXB
    public void changeUiEnableState(boolean z) {
        this.LJLJI.LJLJJLL.LJI(Boolean.valueOf(z));
    }

    public <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at> S1 getState(VM1 vm1) {
        return (S1) C73297Sph.LIZIZ(this, vm1);
    }

    @Override // X.HXB
    public void handleChooseMusic(C145355n9 result) {
        long j;
        long j2;
        long j3;
        long j4;
        BackgroundVideo backgroundVideo;
        I2E LJJIJIL;
        BackgroundVideo backgroundVideo2;
        o.LJIIIZ(result, "result");
        I84 LJJLIIIJILLIZJL = LJJLIIIJILLIZJL();
        LJJLIIIJILLIZJL.getClass();
        if (result.LIZ) {
            if (LJJLIIIJILLIZJL.LIZIZ.isFinishing()) {
                return;
            }
            HB3.LIZ(LJJLIIIJILLIZJL.LJ);
            BackgroundVideo backgroundVideo3 = LJJLIIIJILLIZJL.LJ.cameraComponentModel.curBackgroundVideo;
            if (backgroundVideo3 != null) {
                long maxDuration = backgroundVideo3.getMaxDuration();
                if (maxDuration > 0 && (backgroundVideo2 = LJJLIIIJILLIZJL.LJ.cameraComponentModel.curBackgroundVideo) != null && !backgroundVideo2.isMultiBgVideo()) {
                    ShortVideoContext shortVideoContext = LJJLIIIJILLIZJL.LJ;
                    shortVideoContext.cameraComponentModel.mMaxDuration = Math.min(shortVideoContext.cameraComponentModel.mMaxDuration, maxDuration);
                }
            }
            LJJLIIIJILLIZJL.LIZJ.vK(new C44302Ha6(LJJLIIIJILLIZJL.LJ.cameraComponentModel.mMaxDuration));
            LJJLIIIJILLIZJL.LIZLLL.handleCancelMusicResultEvent();
            return;
        }
        if (TextUtils.isEmpty(result.LIZLLL) || LJJLIIIJILLIZJL.LIZIZ.isFinishing()) {
            return;
        }
        String str = result.LIZLLL;
        AVMusic aVMusic = result.LIZJ;
        String str2 = result.LIZIZ;
        ShortVideoContext shortVideoContext2 = LJJLIIIJILLIZJL.LJ;
        if (shortVideoContext2.cameraComponentModel.mCurrentDurationMode) {
            j = I84.LJI;
        } else {
            j = LivePlayEnforceIntervalSetting.DEFAULT;
        }
        if (HEG.LIZJ(shortVideoContext2.stitchContext.stitchParams)) {
            StitchParams stitchParams = LJJLIIIJILLIZJL.LJ.stitchContext.stitchParams;
            o.LJI(stitchParams);
            OSJ<Long, Long, Long> LIZ = HEG.LIZ(stitchParams, str, aVMusic, j);
            j2 = LIZ.getFirst().longValue();
            j3 = LIZ.getSecond().longValue();
            j4 = LIZ.getThird().longValue();
        } else {
            if (aVMusic != null && !TextUtils.isEmpty(str)) {
                j2 = C44295HZz.LIZ(aVMusic, str);
                j3 = Math.min(j2, j);
            } else {
                j2 = 0;
                j3 = j;
            }
            BackgroundVideo backgroundVideo4 = LJJLIIIJILLIZJL.LJ.cameraComponentModel.curBackgroundVideo;
            if (backgroundVideo4 != null) {
                long maxDuration2 = backgroundVideo4.getMaxDuration();
                if (maxDuration2 > 0 && (backgroundVideo = LJJLIIIJILLIZJL.LJ.cameraComponentModel.curBackgroundVideo) != null && !backgroundVideo.isMultiBgVideo()) {
                    j3 = Math.min(j3, maxDuration2);
                }
            }
            j4 = j3;
        }
        LJJLIIIJILLIZJL.LJ.LJJIL(str2);
        CameraComponentModel cameraComponentModel = LJJLIIIJILLIZJL.LJ.cameraComponentModel;
        cameraComponentModel.mMusicPath = str;
        cameraComponentModel.mMaxDuration = j3;
        WG0.LJFF(LJJLIIIJILLIZJL.LJ.cameraComponentModel.mMusicPath, new I85(LJJLIIIJILLIZJL));
        LJJLIIIJILLIZJL.LIZLLL.handleChooseMusicResultEvent(aVMusic, str);
        if (aVMusic != null) {
            if (aVMusic.getShootDuration() > j || Math.abs(aVMusic.getShootDuration() - aVMusic.getDuration()) >= 1000) {
                InterfaceC45968I2i interfaceC45968I2i = (InterfaceC45968I2i) LJJLIIIJILLIZJL.LJFF.getValue();
                if (interfaceC45968I2i != null) {
                    interfaceC45968I2i.sa(true);
                }
            } else {
                InterfaceC45968I2i interfaceC45968I2i2 = (InterfaceC45968I2i) LJJLIIIJILLIZJL.LJFF.getValue();
                if (interfaceC45968I2i2 != null) {
                    interfaceC45968I2i2.sa(false);
                }
            }
        }
        if (LJJLIIIJILLIZJL.LJ.LJJIJIIJI()) {
            LJJIJIL = C17J.LJJIJIL(new C17J(), j, j4);
        } else {
            LJJIJIL = C17J.LJJIJIL(new C17J(), j, j2);
        }
        if (LJJIJIL == I2E.MUSIC && result.LJ) {
            LJJLIIIJILLIZJL.LIZLLL.showMusicTips(1);
        }
        LJJLIIIJILLIZJL.LIZJ.vK(new C44302Ha6(j4));
    }

    public final void setEnable(boolean z) {
        if (getShortVideoContext().LJJJI() || getShortVideoContext().LJIJJ()) {
            setChooseMusicVisible(Boolean.FALSE, null, null);
            return;
        }
        if (getShortVideoContext().LJJIJIIJI()) {
            z = false;
        }
        setupClickListener(z);
        changeUiEnableState(z);
        AVMusic extractAVMusic = MusicBeanUtilKt.extractAVMusic(getShortVideoContext().creativeModel.musicBuzModel);
        if (z) {
            if (extractAVMusic == null) {
                changeHasMusic(null);
            }
        } else {
            if (extractAVMusic == null || !getShortVideoContext().LJJIJIL()) {
                return;
            }
            changeHasMusic(extractAVMusic);
        }
    }

    @Override // X.HXB
    public void setupClickListener(boolean z) {
        this.LJLJI.LJLJLJ.LJI(Boolean.valueOf(z));
    }

    @Override // X.HXB
    public void showMusicTips(Integer num) {
        this.LJLJI.LJLJLLL.LJII(num);
    }

    public I82(WMH parentScene, C82622Wbi diContainer) {
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = parentScene;
        this.LJLILLLLZI = diContainer;
        this.LJLJI = new I83(0);
        this.LJLJJI = UCI.LJI(getDiContainer(), ActivityC45651qj.class, null);
        this.LJLJJL = UCI.LJI(getDiContainer(), InterfaceC82086WJm.class, null);
        this.LJLJJLL = UCI.LJI(getDiContainer(), I3X.class, null);
        this.LJLJL = UCI.LJI(getDiContainer(), I0N.class, null);
        this.LJLJLJ = UCI.LJI(getDiContainer(), InterfaceC45971I2l.class, null);
        this.LJLJLLL = UCI.LJI(getDiContainer(), InterfaceC45999I3n.class, null);
        this.LJLL = UCI.LJI(getDiContainer(), ShortVideoContext.class, null);
        this.LJLLI = new C29901Fi<>();
        this.LJLLILLLL = new C29901Fi<>();
        this.LJLLJ = C221108m2.LIZIZ(new AqS157S0100000_7(this, 116));
    }

    private final void monitorAutoSelectedMusic(String str, AVMusic aVMusic) {
        AVChallenge aVChallenge;
        String str2;
        if (aVMusic == null) {
            return;
        }
        List<AVChallenge> list = C41658GWo.LIZLLL().LIZ;
        o.LJIIIIZZ(list, "inst().challenges");
        if (TextUtils.equals(str, "challenge") && !C79004UzY.LJJIFFI(list) && ORZ.LJLLLL(list) != null && (aVChallenge = (AVChallenge) ORZ.LJLLLL(list)) != null && aVChallenge.isCommerce) {
            C6BK c6bk = new C6BK();
            c6bk.LIZ.put("shoot_way", str);
            AVChallenge aVChallenge2 = (AVChallenge) ListProtector.get(list, 0);
            if (aVChallenge2 != null) {
                str2 = aVChallenge2.cid;
            } else {
                str2 = null;
            }
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            c6bk.LIZ.put("challenge_id", str2);
            String mid = aVMusic.getMid();
            if (mid != null) {
                str3 = mid;
            }
            c6bk.LIZ.put("sticker_id", str3);
            C43882HKc.LIZLLL(0, "autoselected_music_monitor", c6bk.LJ(), true);
        }
    }

    @Override // X.HXB
    public void handleChooseMusicResultEvent(AVMusic aVMusic, String str) {
        I9T.LJI(aVMusic, false, getShortVideoContext().creativeModel.musicBuzModel);
        if (aVMusic != null) {
            boolean LJJIJIL = getShortVideoContext().LJJIJIL();
            getCameraView().pauseEffectAudio(true);
            getShortVideoContext().cameraComponentModel.mWorkspace.LLILLL(str);
            getShortVideoContext().cameraComponentModel.mMusicPath = str;
            getCameraView().setMusicPath(str);
            getCameraView().J9(0L, 0L, str, false);
            getCameraView().LLZL(true);
            getCameraView().u4(false);
            getStickerApiComponent().uc0(true);
            if (!LJJIJIL) {
                InterfaceC83624Wrs cameraView = getCameraView();
                ActivityC45651qj activity = getActivity();
                getCameraApi().Xi0().getClass();
                cameraView.LLZLLIL(activity, new I86());
            }
            int duration = aVMusic.getDuration();
            if (duration > 0) {
                getShortVideoContext().LJJIJLIJ(duration);
            }
            if (!getShortVideoContext().LJJIJIIJI()) {
                getShortVideoContext().cameraComponentModel.mMusicStart = 0;
            }
            getShortVideoContext().mMusicStrongBeatUrl = aVMusic.strongBeatUrl;
            C78915Uy7.LJJIIJZLJL(getStickerApiComponent(), C83728WtY.LIZIZ.LIZIZ(EnumC83729WtZ.FTC_AUDIO_RECORD_OPEN_CHOOSE_MUSIC, null));
            this.LJLLI.LJII(C76800UCe.LIZ);
        } else {
            this.LJLLILLLL.LJII(C76800UCe.LIZ);
        }
        if (!getShortVideoContext().cameraComponentModel.mDurationSwitchable) {
            getRecordControlApi().FV(getShortVideoContext().cameraComponentModel.mCurrentDurationMode, false);
        }
    }

    @Override // X.HXB
    public void startChooseMusicAnim(float f, float f2) {
        this.LJLJI.LJLJJI.LJI(new OSZ<>(Float.valueOf(f), Float.valueOf(f2)));
    }

    @Override // X.InterfaceC73150SnK
    public <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73297Sph.LJIIZILJ(vm1, interfaceC88472Yns);
    }

    public <M1 extends C73139Sn9<S1, PROP1>, PROP1 extends InterfaceC61312at, S1 extends InterfaceC61312at, R> R withSubstate(C73139Sn9<S1, PROP1> c73139Sn9, InterfaceC88472Yns<? super PROP1, ? extends R> interfaceC88472Yns) {
        return (R) C73297Sph.LJIL(c73139Sn9, interfaceC88472Yns);
    }

    @Override // X.HXB
    public void setChooseMusicVisible(Boolean bool, Boolean bool2, Boolean bool3) {
        if (bool != null) {
            this.LJLJI.LJLIL.LJI(Boolean.valueOf(bool.booleanValue()));
        }
        if (bool2 != null) {
            this.LJLJI.LJLJI.LJI(Boolean.valueOf(bool2.booleanValue()));
        }
        if (bool3 != null) {
            this.LJLJI.LJLILLLLZI.LJI(Boolean.valueOf(bool3.booleanValue()));
        }
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

    @Override // X.HXB
    public void onChooseMusicDone(boolean z, String str, AVMusic aVMusic, String str2) {
        if (z) {
            changeHasMusic(null);
        } else {
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            changeHasMusic(aVMusic);
            notifyMusicChange();
        }
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
