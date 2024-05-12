package X;

import Y.AObjectS86S0100000_7;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.als.LiveEvent;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.performance.PerformanceMonitor;
import com.ss.android.ugc.aweme.port.in.IAnotherMusicService;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.aweme.services.editeffect.EditEffectAnchorManager;
import com.ss.android.ugc.aweme.services.editeffect.EffectAnchorServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.sticker.model.BackgroundVideo;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.template.EffectTemplate;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.util.List;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class I8C extends AbstractC29891Fh<I27> implements InterfaceC143795kd, I27, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] $$delegatedProperties;
    public final C29901Fi<Boolean> _musicPanelShow;
    public final InterfaceC115514g7 activity$delegate;
    public final boolean asyncUIInflateEnabled;
    public final InterfaceC115514g7 bottomTabApiComponent$delegate;
    public final InterfaceC115514g7 cameraApi$delegate;
    public final LiveEvent<AVMusic> chooseMusic;
    public final C5H3 chooseMusicHandler$delegate;
    public final C82622Wbi diContainer;
    public boolean enableRecordChooseMusicComponent;
    public AVMusic internalCurrentMusic;
    public String lastMusicOrigin;
    public final C29901Fi<C76800UCe> musicAdded;
    public final C29901Fi<C76800UCe> musicCleared;
    public final InterfaceC115514g7 musicCutComponent$delegate;
    public final LiveEvent<Boolean> musicPanelShow;
    public final I8E musicPlayApiComponent;
    public final InterfaceC115514g7 nowsSwitcherApi$delegate;
    public final WMH parentScene;
    public final InterfaceC115514g7 planCUIApiComponent$delegate;
    public final InterfaceC84052Wym previewCameraListener;
    public final C5H3 recommendMusicApiComponent$delegate;
    public final InterfaceC115514g7 recordAYStickerApi$delegate;
    public final InterfaceC115514g7 recordAdapterApi$delegate;
    public final C5H3 recordChooseMusicAsyncLayoutInflaterScene$delegate;
    public HNM recordChooseMusicController;
    public final C5H3 recordChooseMusicScene$delegate;
    public final InterfaceC115514g7 recordControlApi$delegate;
    public final InterfaceC115514g7 recordPermissionApi$delegate;
    public final InterfaceC115514g7 shortVideoContext$delegate;
    public final InterfaceC115514g7 splitShootApiComponent$delegate;
    public final I8D states;
    public final InterfaceC115514g7 stickerApiComponent$delegate;
    public OSZ<? extends Effect, Boolean> stickerMusicCancelState;

    @Override // X.AbstractC29891Fh
    /* renamed from: getApiComponent, reason: avoid collision after fix types in other method */
    public I27 getApiComponent2() {
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
        getRecordAdapterApi().GV(this);
        setRecordChooseMusicController(new HNM(getDiContainer(), getActivity(), getCameraApi(), getStickerApiComponent(), this, getBottomTabApiComponent(), getShortVideoContext(), C78897Uxp.LJJJJ(this.parentScene)));
        if (this.asyncUIInflateEnabled) {
            getRecordChooseMusicAsyncLayoutInflaterScene().LLD.LIZLLL(this, new AObjectS86S0100000_7(this, 111));
            this.parentScene.add(R.id.iri, getRecordChooseMusicAsyncLayoutInflaterScene(), "RecordChooseMusicScene");
        } else {
            this.parentScene.add(R.id.iri, getRecordChooseMusicScene(), "RecordChooseMusicScene");
            registerObservers();
        }
    }

    public final void registerObservers() {
        C0IB<String> pe0;
        C0IB<Boolean> fN;
        if (L2L.LIZIZ(getDiContainer())) {
            Float LIZ = getPlanCUIApiComponent().Ht().LIZ();
            o.LJIIIIZZ(LIZ, "planCUIApiComponent.delayUIAlpha.value");
            if (LIZ.floatValue() < 1.0f) {
                View view = m22getRecordChooseMusicScene().mView;
                if (view != null) {
                    view.setLayerType(2, null);
                }
                getPlanCUIApiComponent().gC().LIZLLL(this, new AObjectS86S0100000_7(this, 125));
            }
            getPlanCUIApiComponent().Ht().LIZIZ(this, new AObjectS86S0100000_7(this, 130));
        }
        this.states.LJLLLL.LIZLLL(this, new AObjectS86S0100000_7(this, 131));
        this.states.LJLIL.LIZIZ(this, new AObjectS86S0100000_7(this, 132));
        I8W recordPermissionApi = getRecordPermissionApi();
        if (recordPermissionApi != null && (fN = recordPermissionApi.fN()) != null) {
            fN.LIZIZ(this, new AObjectS86S0100000_7(this, 133));
        }
        getCameraApi().md0().LIZLLL(this, new AObjectS86S0100000_7(this, 109));
        getBottomTabApiComponent().getBottomTabIndexChangeEvent().LIZIZ(this, new AObjectS86S0100000_7(this, 110));
        getPlanCUIApiComponent().qo0().LIZLLL(this, new AObjectS86S0100000_7(this, 112));
        getRecordControlApi().Vh().LIZLLL(this, new AObjectS86S0100000_7(this, 113));
        getRecordControlApi().Gg0().LIZLLL(this, new AObjectS86S0100000_7(this, 115));
        getPlanCUIApiComponent().Et().LIZIZ(this, new AObjectS86S0100000_7(this, 116));
        getPlanCUIApiComponent().Ie().LIZIZ(this, new AObjectS86S0100000_7(this, 117));
        this.states.LJLJLLL.LIZLLL(this, new AObjectS86S0100000_7(this, 118));
        this.states.LJLL.LIZLLL(this, new AObjectS86S0100000_7(this, 119));
        C82622Wbi diContainer = getDiContainer();
        if (L2L.LIZ(diContainer)) {
            ((C1EP) diContainer.LJ(C1EP.class, null)).m3(I8E.class, new AqS173S0100000_7(this, 185));
        } else {
            C0I6 c0i6 = (C0I6) diContainer.LJIIIIZZ(null, I8E.class);
            if (c0i6 != null) {
                I8E i8e = (I8E) c0i6;
                i8e.WL().LIZLLL(this, new AObjectS86S0100000_7(this, LiveTryModeCountDownThresholdSetting.DEFAULT));
                i8e.bl().LIZLLL(this, new AObjectS86S0100000_7(this, 121));
            }
        }
        this.states.LJLZ.LIZLLL(this, new AObjectS86S0100000_7(this, 122));
        getCameraApi().e8().LIZ(new I8G(this));
        getCameraApi().e8().getMediaController().b9(this.previewCameraListener);
        getPlanCUIApiComponent().et().LIZLLL(this, new AObjectS86S0100000_7(this, 123));
        I3K splitShootApiComponent = getSplitShootApiComponent();
        if (splitShootApiComponent != null && (pe0 = splitShootApiComponent.pe0()) != null) {
            pe0.LIZIZ(this, new AObjectS86S0100000_7(this, 124));
        }
        this.musicCleared.LIZLLL(this, new AObjectS86S0100000_7(this, 126));
        getPlanCUIApiComponent().Tr().LIZIZ(this, new AObjectS86S0100000_7(this, 127));
        getPlanCUIApiComponent().so0().LIZIZ(this, new AObjectS86S0100000_7(this, 128));
        getPlanCUIApiComponent().ys0().LIZIZ(this, new AObjectS86S0100000_7(this, 129));
        initMusicUI();
    }

    static {
        TBT tbt = new TBT(I8C.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        $$delegatedProperties = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(I8C.class, "cameraApi", "getCameraApi()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(I8C.class, "recordAdapterApi", "getRecordAdapterApi()Lcom/ss/android/ugc/aweme/shortvideo/adapter/RecordAdapterApi;", 0, c65351Pkp), C61845OOz.LIZJ(I8C.class, "recordControlApi", "getRecordControlApi()Lcom/ss/android/ugc/aweme/shortvideo/recordcontrol/TikTokRecordControlApi;", 0, c65351Pkp), C61845OOz.LIZJ(I8C.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(I8C.class, "bottomTabApiComponent", "getBottomTabApiComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(I8C.class, "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(I8C.class, "nowsSwitcherApi", "getNowsSwitcherApi()Lcom/ss/android/ugc/aweme/nows/combination/NowsSwitcherApi;", 0, c65351Pkp), C61845OOz.LIZJ(I8C.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0, c65351Pkp), C61845OOz.LIZJ(I8C.class, "musicCutComponent", "getMusicCutComponent()Lcom/ss/android/ugc/gamora/recorder/musiccut/MusicCutComponent;", 0, c65351Pkp), C61845OOz.LIZJ(I8C.class, "recordPermissionApi", "getRecordPermissionApi()Lcom/ss/android/ugc/aweme/shortvideo/ui/permissionmanager/RecordPermissionUIApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(I8C.class, "splitShootApiComponent", "getSplitShootApiComponent()Lcom/ss/android/ugc/gamora/recorder/splitshoot/SplitShootApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(I8C.class, "recordAYStickerApi", "getRecordAYStickerApi()Lcom/ss/android/ugc/aweme/addyours/RecordAddYoursStickerApi;", 0, c65351Pkp)};
    }

    private final InterfaceC45979I2t getBottomTabApiComponent() {
        return (InterfaceC45979I2t) this.bottomTabApiComponent$delegate.LIZ(this, $$delegatedProperties[5]);
    }

    private final InterfaceC82086WJm getCameraApi() {
        return (InterfaceC82086WJm) this.cameraApi$delegate.LIZ(this, $$delegatedProperties[1]);
    }

    private final I2D getChooseMusicHandler() {
        return (I2D) this.chooseMusicHandler$delegate.getValue();
    }

    private final InterfaceC161186Ug getRecordAYStickerApi() {
        return (InterfaceC161186Ug) this.recordAYStickerApi$delegate.LIZ(this, $$delegatedProperties[12]);
    }

    private final WLB getRecordAdapterApi() {
        return (WLB) this.recordAdapterApi$delegate.LIZ(this, $$delegatedProperties[2]);
    }

    private final C46118I8c getRecordChooseMusicAsyncLayoutInflaterScene() {
        return (C46118I8c) this.recordChooseMusicAsyncLayoutInflaterScene$delegate.getValue();
    }

    public final ActivityC45651qj getActivity() {
        return (ActivityC45651qj) this.activity$delegate.LIZ(this, $$delegatedProperties[0]);
    }

    public final I8S getMusicCutComponent() {
        return (I8S) this.musicCutComponent$delegate.LIZ(this, $$delegatedProperties[9]);
    }

    public final InterfaceC82325WSr getNowsSwitcherApi() {
        return (InterfaceC82325WSr) this.nowsSwitcherApi$delegate.LIZ(this, $$delegatedProperties[7]);
    }

    public final InterfaceC45999I3n getPlanCUIApiComponent() {
        return (InterfaceC45999I3n) this.planCUIApiComponent$delegate.LIZ(this, $$delegatedProperties[6]);
    }

    public final I8N getRecommendMusicApiComponent() {
        return (I8N) this.recommendMusicApiComponent$delegate.getValue();
    }

    public final HNM getRecordChooseMusicController() {
        HNM hnm = this.recordChooseMusicController;
        if (hnm != null) {
            return hnm;
        }
        o.LJIJI("recordChooseMusicController");
        throw null;
    }

    /* renamed from: getRecordChooseMusicScene, reason: collision with other method in class */
    public final WM7 m22getRecordChooseMusicScene() {
        if (this.asyncUIInflateEnabled) {
            return getRecordChooseMusicAsyncLayoutInflaterScene();
        }
        return getRecordChooseMusicScene();
    }

    public final InterfaceC45967I2h getRecordControlApi() {
        return (InterfaceC45967I2h) this.recordControlApi$delegate.LIZ(this, $$delegatedProperties[3]);
    }

    public final I8W getRecordPermissionApi() {
        return (I8W) this.recordPermissionApi$delegate.LIZ(this, $$delegatedProperties[10]);
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.shortVideoContext$delegate.LIZ(this, $$delegatedProperties[8]);
    }

    public final I3K getSplitShootApiComponent() {
        return (I3K) this.splitShootApiComponent$delegate.LIZ(this, $$delegatedProperties[11]);
    }

    public final I0N getStickerApiComponent() {
        return (I0N) this.stickerApiComponent$delegate.LIZ(this, $$delegatedProperties[4]);
    }

    @Override // X.I27
    public LiveEvent<Boolean> getUiLoadingMusicEvent() {
        return this.states.LJLJLJ;
    }

    @Override // X.I27
    public void initStitch() {
        this.states.LJLLL.LJII(null);
    }

    @Override // X.I27
    public void notifyMusicChange() {
        this.states.LJLJJL.LJII(null);
    }

    @Override // X.I27
    public void tryHideMusicTips() {
        this.states.LJLLJ.LJII(null);
    }

    private final long getBackgroundVideoDuration() {
        BackgroundVideo backgroundVideo = getShortVideoContext().cameraComponentModel.curBackgroundVideo;
        if (backgroundVideo != null) {
            return backgroundVideo.getMaxDuration();
        }
        return 0L;
    }

    private final InterfaceC83624Wrs getCameraView() {
        return getCameraApi().e8();
    }

    private final void initMusicUI() {
        EffectTemplate effectTemplate;
        WRQ wrq;
        MusicBuzModel musicBuzModel;
        if (getShortVideoContext().LJJJI() || TextUtils.equals(getShortVideoContext().shootWay, "upload_anchor")) {
            return;
        }
        if (o.LJ("anchor_combine_tts", getShortVideoContext().shootWay) && (musicBuzModel = getShortVideoContext().creativeModel.musicBuzModel) != null) {
            musicBuzModel.cancelAbleInShoot = true;
        }
        AVMusic extractAVMusic = MusicBeanUtilKt.extractAVMusic(getShortVideoContext().creativeModel.musicBuzModel);
        if (extractAVMusic != null) {
            Bundle LIZ = C163796bn.LIZ(this.parentScene);
            if (LIZ != null) {
                effectTemplate = (EffectTemplate) LIZ.getParcelable("first_sticker");
            } else {
                effectTemplate = null;
            }
            if ((effectTemplate != null && effectTemplate.isBusiness() && !extractAVMusic.isCommerceMusic()) || (BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUser().getAccountType() == 3 && !extractAVMusic.isCommerceMusic())) {
                I9T.LJI(null, false, getShortVideoContext().creativeModel.musicBuzModel);
                I8N recommendMusicApiComponent = getRecommendMusicApiComponent();
                if (recommendMusicApiComponent != null) {
                    recommendMusicApiComponent.Bk0(false);
                    return;
                }
                return;
            }
            changeHasMusic(extractAVMusic);
            this.lastMusicOrigin = getShortVideoContext().LJIIL();
            mobShowMusicTitle(extractAVMusic, getShortVideoContext().LJIIL());
            tryShowMusicTip();
            InterfaceC82086WJm cameraApi = getCameraApi();
            if ((cameraApi instanceof WRQ) && (wrq = (WRQ) cameraApi) != null) {
                Boolean bool = Boolean.TRUE;
                wrq.cY(bool, bool);
            }
            monitorAutoSelectedMusic(getShortVideoContext().shootWay, extractAVMusic);
        }
    }

    private final boolean isChangeBgVideoDuration() {
        BackgroundVideo backgroundVideo = getShortVideoContext().cameraComponentModel.curBackgroundVideo;
        if (backgroundVideo != null && !backgroundVideo.isMultiBgVideo()) {
            return true;
        }
        return false;
    }

    private final void tryShowMusicTip() {
        Effect effect;
        boolean z;
        AVMusic extractAVMusic;
        Bundle LIZ;
        EffectTemplate effectTemplate;
        String string;
        EditEffectAnchorManager data;
        if (getShortVideoContext() == null || !getShortVideoContext().LJIL()) {
            return;
        }
        Bundle LIZ2 = C163796bn.LIZ(this.parentScene);
        if (LIZ2 != null) {
            effect = (Effect) LIZ2.getParcelable("first_sticker");
        } else {
            effect = null;
        }
        if (this.parentScene.mActivity != null && LIZ2 != null && (string = LIZ2.getString("extra_edit_effect_uid")) != null && (data = EffectAnchorServiceImpl.createIEffectAnchorServicebyMonsterPlugin(false).getData(string)) != null) {
            z = !data.isEditProp();
        } else {
            z = false;
        }
        if (V3N.LJIILLIIL(effect)) {
            return;
        }
        getShortVideoContext().LJJJ();
        if (!z) {
            showMusicTips(1);
        }
        InterfaceC45889Hzh interfaceC45889Hzh = (InterfaceC45889Hzh) getDiContainer().LJ(InterfaceC45889Hzh.class, null);
        interfaceC45889Hzh.setNeedNoTouchListener(true);
        interfaceC45889Hzh.getNoBlockTouchEvent().LIZLLL(this, new AObjectS86S0100000_7(this, 114));
        if ((!o.LJ("prop_reuse", getShortVideoContext().shootWay) && !o.LJ("prop_page", getShortVideoContext().shootWay)) || (extractAVMusic = MusicBeanUtilKt.extractAVMusic(getShortVideoContext().creativeModel.musicBuzModel)) == null || (LIZ = C163796bn.LIZ(this.parentScene)) == null || (effectTemplate = (EffectTemplate) LIZ.getParcelable("first_sticker")) == null) {
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

    public final void applyBackgroundVideoIfNeed() {
        InterfaceC46236ICq Sc0;
        I0N stickerApiComponent = getStickerApiComponent();
        if (stickerApiComponent != null && (Sc0 = stickerApiComponent.Sc0()) != null) {
            Sc0.LIZIZ();
        }
    }

    @Override // X.I27
    public void clearMusic() {
        HB3.LIZ(getShortVideoContext());
        long backgroundVideoDuration = getBackgroundVideoDuration();
        if (backgroundVideoDuration > 0 && isChangeBgVideoDuration()) {
            getShortVideoContext().cameraComponentModel.mMaxDuration = Math.min(getShortVideoContext().cameraComponentModel.mMaxDuration, backgroundVideoDuration);
        }
        getRecordControlApi().vK(new C44302Ha6(getShortVideoContext().cameraComponentModel.mMaxDuration));
        handleCancelMusicResultEvent();
        changeHasMusic(null);
        I8N recommendMusicApiComponent = getRecommendMusicApiComponent();
        if (recommendMusicApiComponent != null) {
            recommendMusicApiComponent.Bk0(false);
        }
    }

    @Override // X.I27
    public void handleCancelMusicResultEvent() {
        WRQ wrq;
        Effect effect;
        TEZ LLLLL;
        Effect LIZJ;
        I9T.LJI(null, false, getShortVideoContext().creativeModel.musicBuzModel);
        I0N stickerApiComponent = getStickerApiComponent();
        if (stickerApiComponent != null && (LIZJ = C82398WVm.LIZJ(stickerApiComponent)) != null && V3N.LJJI(LIZJ)) {
            getCameraView().LLZ();
        }
        I8E i8e = this.musicPlayApiComponent;
        if (i8e != null) {
            I0N stickerApiComponent2 = getStickerApiComponent();
            if (stickerApiComponent2 != null && (LLLLL = stickerApiComponent2.LLLLL()) != null) {
                effect = LLLLL.LLJJIJIIJIL();
            } else {
                effect = null;
            }
            i8e.rP(effect);
        }
        getCameraView().setMusicPath("");
        getCameraView().J9(0L, 0L, "", false);
        getCameraView().LLZL(false);
        I0N stickerApiComponent3 = getStickerApiComponent();
        if (stickerApiComponent3 != null) {
            stickerApiComponent3.PU();
        }
        getShortVideoContext().LJJIJLIJ(0);
        getShortVideoContext().cameraComponentModel.mMusicStart = 0;
        this.internalCurrentMusic = null;
        getShortVideoContext().cameraComponentModel.mWorkspace.v();
        getShortVideoContext().cameraComponentModel.mMusicPath = null;
        getShortVideoContext().musicWaveBean = null;
        I0N stickerApiComponent4 = getStickerApiComponent();
        if (stickerApiComponent4 != null) {
            C78915Uy7.LJJIIJZLJL(stickerApiComponent4, C83728WtY.LIZIZ.LIZIZ(EnumC83729WtZ.AUDIO_RECORD_OPEN_CANCEL_MUSIC, null));
        }
        this.musicCleared.LJII(C76800UCe.LIZ);
        if (!getShortVideoContext().cameraComponentModel.mDurationSwitchable) {
            getRecordControlApi().FV(getShortVideoContext().cameraComponentModel.mCurrentDurationMode, false);
        }
        InterfaceC82086WJm cameraApi = getCameraApi();
        if ((cameraApi instanceof WRQ) && (wrq = (WRQ) cameraApi) != null) {
            Boolean bool = Boolean.FALSE;
            wrq.cY(bool, bool);
        }
        changeCancelMusicBtnVisible(false);
    }

    @Override // X.AbstractC29891Fh
    public void onDestroy() {
        super.onDestroy();
        getCameraApi().e8().getMediaController().A8(this.previewCameraListener);
        getRecordAdapterApi().GV(null);
    }

    @Override // X.AbstractC29891Fh
    public void onResume() {
        AVMusic extractAVMusic;
        super.onResume();
        if (getShortVideoContext().LJJIJIL() && (extractAVMusic = MusicBeanUtilKt.extractAVMusic(getShortVideoContext().creativeModel.musicBuzModel)) != null && extractAVMusic.isLocalMusic()) {
            if (!C170626mo.LIZJ(C78688UuS.LJJIII(this), getShortVideoContext().cameraComponentModel.mWorkspace.getMusicPath())) {
                changeHasMusic(null);
                I9T.LJ(getShortVideoContext().creativeModel.musicBuzModel);
                getChooseMusicHandler().LIZ(C145385nC.LIZ(Boolean.TRUE, null, null, null, null, 0L, 0L, 112));
            }
        }
    }

    @Override // X.I27
    public void openMusicPanel() {
        I8E i8e;
        I0N i0n;
        InterfaceC46236ICq Sc0;
        HNM recordChooseMusicController = getRecordChooseMusicController();
        C78862UxG LIZJ = C83728WtY.LIZIZ.LIZJ(EnumC83730Wta.CLOSE_CAMERA_MUSIC_CHOICE_OPEN_PANEL, EnumC158826Le.PAGE_INVISIBLE);
        recordChooseMusicController.getClass();
        C60903NvH.LJIIJJI().LJJI().sceneReport("click_music_shoot");
        if (recordChooseMusicController.LJI.cameraComponentModel.curBackgroundVideo != null && (i0n = recordChooseMusicController.LIZLLL) != null && (Sc0 = i0n.Sc0()) != null) {
            Sc0.LJI();
        }
        recordChooseMusicController.LIZJ.tn0(new HNG(recordChooseMusicController));
        C60903NvH.LJIIJJI().LJIILIIL().updateCurrentScene("music_panel_show", true);
        recordChooseMusicController.LIZJ.jL().LIZJ(I0E.CHOOSE_MUSIC_SCENE, LIZJ);
        if (C00F.LIZ(31744, 0, "enable_play_music_by_default_try_effect", true) > 0 && (i8e = this.musicPlayApiComponent) != null) {
            i8e.Ps0(null);
        }
    }

    @Override // X.I27
    public boolean recordHasMusic() {
        if (getShortVideoContext().cameraComponentModel.mWorkspace.getMusicPath() != null) {
            return true;
        }
        return false;
    }

    @Override // X.I27
    public void stopPreviewMusic() {
        getCameraView().LLZ();
    }

    @Override // X.I27
    public void stopStickerBGM() {
        WRQ wrq;
        InterfaceC82086WJm cameraApi = getCameraApi();
        if ((cameraApi instanceof WRQ) && (wrq = (WRQ) cameraApi) != null) {
            Boolean bool = Boolean.TRUE;
            wrq.cY(bool, bool);
        }
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ I27 getApiComponent() {
        getApiComponent2();
        return this;
    }

    @Override // X.I27
    public LiveEvent<AVMusic> getChooseMusic() {
        return this.chooseMusic;
    }

    @Override // X.I27
    public AVMusic getCurrentMusic() {
        return this.internalCurrentMusic;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.diContainer;
    }

    @Override // X.I27
    public /* bridge */ /* synthetic */ LiveEvent getMusicAdded() {
        return this.musicAdded;
    }

    @Override // X.I27
    public /* bridge */ /* synthetic */ LiveEvent getMusicCleared() {
        return this.musicCleared;
    }

    @Override // X.I27
    public LiveEvent<Boolean> getMusicPanelShow() {
        return this.musicPanelShow;
    }

    @Override // X.InterfaceC73149SnJ
    public /* bridge */ /* synthetic */ AML getReceiver() {
        getReceiver2();
        return this;
    }

    @Override // X.I27
    public OSZ<Effect, Boolean> getStickerMusicCancelState() {
        return this.stickerMusicCancelState;
    }

    private final C46119I8d getRecordChooseMusicScene() {
        return (C46119I8d) this.recordChooseMusicScene$delegate.getValue();
    }

    private final void tryMobShowMusicDurationByChange(long j) {
        AVMusic aVMusic = this.internalCurrentMusic;
        Long l = null;
        if (aVMusic != null && Long.valueOf(aVMusic.id) != null) {
            C145995oB c145995oB = new C145995oB();
            c145995oB.LJI("music_selected_from", this.lastMusicOrigin);
            AVMusic aVMusic2 = this.internalCurrentMusic;
            if (aVMusic2 != null) {
                l = Long.valueOf(aVMusic2.id);
            }
            c145995oB.LIZJ(l, "music_id");
            c145995oB.LJI("enter_from", "video_shoot_page");
            c145995oB.LJI("type", "next");
            long currentTimeMillis = System.currentTimeMillis();
            Long l2 = getShortVideoContext().lastMusicTitleTimeMills;
            o.LJIIIIZZ(l2, "shortVideoContext.lastMusicTitleTimeMills");
            c145995oB.LIZIZ(currentTimeMillis - l2.longValue(), "duration");
            FMX.LJIIL("show_music_title_duration", c145995oB.LIZ);
        }
        if (j > 0) {
            getShortVideoContext().lastMusicTitleTimeMills = Long.valueOf(System.currentTimeMillis());
        } else {
            getShortVideoContext().lastMusicTitleTimeMills = -1L;
        }
    }

    @Override // X.I27
    public void changeCancelMusicBtnVisible(boolean z) {
        this.states.LJLLI.LJII(Boolean.valueOf(z));
    }

    @Override // X.I27
    public void changeHasMusic(AVMusic aVMusic) {
        this.internalCurrentMusic = aVMusic;
        this.states.LJLJL.LJII(aVMusic);
    }

    public final void changeMusicAutoPlayState(boolean z) {
        this.states.LJLLLLLL.LJI(Boolean.valueOf(z));
    }

    @Override // X.I27
    public void changeMusicUi(boolean z) {
        AVMusic extractAVMusic;
        if (!getShortVideoContext().cameraComponentModel.LJIIIZ()) {
            if (z) {
                extractAVMusic = getShortVideoContext().musicBeforeRetake;
            } else {
                extractAVMusic = MusicBeanUtilKt.extractAVMusic(getShortVideoContext().creativeModel.musicBuzModel);
            }
            changeHasMusic(extractAVMusic);
        } else {
            changeHasMusic(null);
            changeMusicAutoPlayState(false);
        }
        setupClickListener(false);
        changeUiEnableState(false);
    }

    @Override // X.I27
    public void changeUiEnableState(boolean z) {
        this.states.LJLJJLL.LJI(Boolean.valueOf(z));
    }

    public <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at> S1 getState(VM1 vm1) {
        return (S1) C73297Sph.LIZIZ(this, vm1);
    }

    @Override // X.I27
    public void handleChooseMusic(C145355n9 result) {
        o.LJIIIZ(result, "result");
        getChooseMusicHandler().LIZ(result);
    }

    public final void mobClickPlayMusic(boolean z) {
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("enter_from", "video_shoot_page");
        c145995oB.LJI("shoot_way", getShortVideoContext().shootWay);
        c145995oB.LJI("content_source", "shoot");
        c145995oB.LJI("content_type", "video");
        c145995oB.LJI("creation_id", getShortVideoContext().LJI());
        c145995oB.LJI("music_id", getShortVideoContext().getMusicId());
        c145995oB.LJ("play_status", z);
        FMX.LJIIL("click_play_music", c145995oB.LIZ);
    }

    @Override // X.I27
    public void musicPanelShow(boolean z) {
        this._musicPanelShow.LJII(Boolean.valueOf(z));
    }

    public final void playMusic(String str) {
        Long l;
        TEZ LLLLL;
        Effect effect = null;
        if (getShortVideoContext().shootMode != 2) {
            l = Long.valueOf(getShortVideoContext().LJIILIIL());
        } else {
            l = null;
        }
        I8E i8e = this.musicPlayApiComponent;
        if (i8e != null) {
            long j = getShortVideoContext().cameraComponentModel.mMusicStart;
            I0N stickerApiComponent = getStickerApiComponent();
            if (stickerApiComponent != null && (LLLLL = stickerApiComponent.LLLLL()) != null) {
                effect = LLLLL.LLJJIJIIJIL();
            }
            i8e.Yk0(str, j, l, effect, I8M.LJLIL);
        }
    }

    public final void setEnable(boolean z) {
        if (getShortVideoContext().LJJIJIIJI() || getShortVideoContext().LJJIJIIJIL()) {
            z = false;
        }
        setupClickListener(z);
        changeUiEnableState(z);
        if (getShortVideoContext().LJJIIJZLJL() || getShortVideoContext().isDuetMode || getShortVideoContext().LJJJI() || getShortVideoContext().LJIJJ()) {
            setChooseMusicVisible(Boolean.FALSE, null, null);
            return;
        }
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

    public final void setRecordChooseMusicController(HNM hnm) {
        o.LJIIIZ(hnm, "<set-?>");
        this.recordChooseMusicController = hnm;
    }

    @Override // X.I27
    public void setStickerMusicCancelState(OSZ<? extends Effect, Boolean> osz) {
        this.stickerMusicCancelState = osz;
    }

    @Override // X.I27
    public void setUiLoadingMusic(boolean z) {
        this.states.LJLJLJ.LJII(Boolean.valueOf(z));
    }

    @Override // X.I27
    public void setupClickListener(boolean z) {
        this.states.LJLLILLLL.LJI(Boolean.valueOf(z));
    }

    @Override // X.I27
    public void showMusicTips(Integer num) {
        InterfaceC161186Ug recordAYStickerApi = getRecordAYStickerApi();
        if (recordAYStickerApi != null && recordAYStickerApi.bN()) {
            return;
        }
        this.states.LJLLJ.LJII(num);
    }

    @Override // X.I27
    public void startPreviewMusic(boolean z) {
        HNW LJJIJ = C60903NvH.LJIIJJI().LJJIJ();
        o.LJII(LJJIJ, "null cannot be cast to non-null type com.ss.android.ugc.aweme.port.in.IAnotherMusicService");
        IAnotherMusicService iAnotherMusicService = (IAnotherMusicService) LJJIJ;
        if (!z) {
            if (!o.LJ(C42470Gle.LIZ().getClass(), iAnotherMusicService.LJFF())) {
                I8S musicCutComponent = getMusicCutComponent();
                if ((musicCutComponent != null && musicCutComponent.N5()) || getPlanCUIApiComponent().ez()) {
                    return;
                }
                I0N stickerApiComponent = getStickerApiComponent();
                if (stickerApiComponent != null && stickerApiComponent.Q30()) {
                    return;
                }
            } else {
                return;
            }
        }
        getCameraView().LLZIL();
    }

    public final void switchAutoPlayMusicUi(boolean z) {
        this.states.LJZ.LJII(Boolean.valueOf(z));
    }

    public I8C(WMH parentScene, C82622Wbi diContainer) {
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(diContainer, "diContainer");
        this.parentScene = parentScene;
        this.diContainer = diContainer;
        I8D i8d = new I8D(0);
        this.states = i8d;
        this.activity$delegate = UCI.LJI(getDiContainer(), ActivityC45651qj.class, null);
        this.cameraApi$delegate = UCI.LJI(getDiContainer(), InterfaceC82086WJm.class, null);
        this.recordAdapterApi$delegate = UCI.LJI(getDiContainer(), WLB.class, null);
        this.recordControlApi$delegate = UCI.LJI(getDiContainer(), InterfaceC45967I2h.class, null);
        this.stickerApiComponent$delegate = UCI.LJII(getDiContainer(), I0N.class, null);
        this.bottomTabApiComponent$delegate = UCI.LJI(getDiContainer(), InterfaceC45979I2t.class, null);
        this.planCUIApiComponent$delegate = UCI.LJI(getDiContainer(), InterfaceC45999I3n.class, null);
        this.nowsSwitcherApi$delegate = UCI.LJII(getDiContainer(), InterfaceC82325WSr.class, null);
        this.shortVideoContext$delegate = UCI.LJI(getDiContainer(), ShortVideoContext.class, null);
        this.musicCutComponent$delegate = UCI.LJII(getDiContainer(), I8S.class, null);
        this.recordPermissionApi$delegate = UCI.LJII(getDiContainer(), I8W.class, null);
        this.musicPlayApiComponent = (I8E) getDiContainer().LJIIIIZZ(null, I8E.class);
        this.splitShootApiComponent$delegate = UCI.LJII(getDiContainer(), I3K.class, null);
        this.recommendMusicApiComponent$delegate = C269113v.LIZIZ(this, I8N.class);
        this.recordAYStickerApi$delegate = UCI.LJII(getDiContainer(), InterfaceC161186Ug.class, null);
        this.enableRecordChooseMusicComponent = true;
        this.musicAdded = new C29901Fi<>();
        this.musicCleared = new C29901Fi<>();
        C29901Fi<Boolean> c29901Fi = new C29901Fi<>();
        this._musicPanelShow = c29901Fi;
        this.asyncUIInflateEnabled = e1.LIZ(31744, "record_choose_music_async_layout_inflater_scene_enabled", true, false);
        this.musicPanelShow = c29901Fi;
        this.chooseMusicHandler$delegate = C221108m2.LIZIZ(new AqS157S0100000_7(this, 355));
        this.previewCameraListener = new I8F(this);
        this.recordChooseMusicScene$delegate = C221108m2.LIZIZ(new AqS157S0100000_7(this, 358));
        this.recordChooseMusicAsyncLayoutInflaterScene$delegate = C221108m2.LIZIZ(new AqS157S0100000_7(this, 357));
        this.chooseMusic = i8d.LJLJL;
    }

    private final void mobShowMusicTitle(AVMusic aVMusic, String str) {
        String str2;
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("music_selected_from", str);
        String str3 = null;
        if (aVMusic != null) {
            str3 = aVMusic.getMusicId();
        }
        c145995oB.LJI("music_id", str3);
        c145995oB.LJI("enter_from", "video_shoot_page");
        c145995oB.LJI("music_rec_type", "");
        c145995oB.LJI("creation_id", getShortVideoContext().LJI());
        if (aVMusic == null || (str2 = aVMusic.recommendSourceFrom) == null) {
            str2 = "other_music";
        }
        c145995oB.LJI("recommend_source_from", str2);
        c145995oB.LJFF(new H96().LJFF("is_commercial", "commercial_music_suggestion_id", "is_promote_pa"));
        FMX.LJIIL("show_music_title", c145995oB.LIZ);
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

    @Override // X.I27
    public void handleChooseMusicResultEvent(AVMusic aVMusic, String str) {
        WRQ wrq;
        I9T.LJI(aVMusic, false, getShortVideoContext().creativeModel.musicBuzModel);
        if (aVMusic != null) {
            boolean LJJIJIL = getShortVideoContext().LJJIJIL();
            getShortVideoContext().cameraComponentModel.mWorkspace.LLILLL(str);
            getShortVideoContext().cameraComponentModel.mMusicPath = str;
            getShortVideoContext().mIsPhotoMvModeMusic = false;
            getCameraView().setMusicPath(str);
            getCameraView().J9(0L, 0L, str, false);
            getCameraView().LLZL(true);
            PerformanceMonitor remove = C5IO.LIZ.remove(aVMusic.getMusicId());
            if (remove != null) {
                G8G.LIZ.end(remove, "shoot page choose music end", 0L);
            }
            I0N stickerApiComponent = getStickerApiComponent();
            if (stickerApiComponent != null) {
                stickerApiComponent.uc0(true);
            }
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
                getShortVideoContext().cameraComponentModel.mMusicStart = aVMusic.getMusicStartFromCut();
            }
            getShortVideoContext().mMusicStrongBeatUrl = aVMusic.strongBeatUrl;
            I0N stickerApiComponent2 = getStickerApiComponent();
            if (stickerApiComponent2 != null) {
                C78915Uy7.LJJIIJZLJL(stickerApiComponent2, C83728WtY.LIZIZ.LIZIZ(EnumC83729WtZ.AUDIO_RECORD_OPEN_CHOOSE_MUSIC, null));
            }
            I8E i8e = this.musicPlayApiComponent;
            if (i8e != null && i8e.cm0()) {
                playMusic(str);
            }
            InterfaceC82086WJm cameraApi = getCameraApi();
            if ((cameraApi instanceof WRQ) && (wrq = (WRQ) cameraApi) != null) {
                Boolean bool = Boolean.TRUE;
                wrq.cY(bool, bool);
            }
        }
        this.internalCurrentMusic = aVMusic;
        if (aVMusic == null) {
            this.musicCleared.LJII(C76800UCe.LIZ);
            I0N stickerApiComponent3 = getStickerApiComponent();
            if (stickerApiComponent3 != null) {
                stickerApiComponent3.ot0(false);
            }
        } else {
            this.musicAdded.LJII(C76800UCe.LIZ);
            I3K splitShootApiComponent = getSplitShootApiComponent();
            if (splitShootApiComponent != null) {
                splitShootApiComponent.Mc0(false);
            }
            I0N stickerApiComponent4 = getStickerApiComponent();
            if (stickerApiComponent4 != null) {
                stickerApiComponent4.ot0(true);
            }
        }
        if (!getShortVideoContext().cameraComponentModel.mDurationSwitchable) {
            getRecordControlApi().FV(getShortVideoContext().cameraComponentModel.mCurrentDurationMode, false);
        }
    }

    @Override // X.I27
    public void startChooseMusicAnim(float f, float f2) {
        this.states.LJLJJI.LJI(new OSZ<>(Float.valueOf(f), Float.valueOf(f2)));
    }

    @Override // X.InterfaceC73150SnK
    public <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73297Sph.LJIIZILJ(vm1, interfaceC88472Yns);
    }

    public <M1 extends C73139Sn9<S1, PROP1>, PROP1 extends InterfaceC61312at, S1 extends InterfaceC61312at, R> R withSubstate(C73139Sn9<S1, PROP1> c73139Sn9, InterfaceC88472Yns<? super PROP1, ? extends R> interfaceC88472Yns) {
        return (R) C73297Sph.LJIL(c73139Sn9, interfaceC88472Yns);
    }

    @Override // X.I27
    public void setChooseMusicVisible(Boolean bool, Boolean bool2, Boolean bool3) {
        if (bool != null) {
            this.states.LJLIL.LJI(Boolean.valueOf(bool.booleanValue()));
        }
        if (bool2 != null) {
            this.states.LJLJI.LJI(Boolean.valueOf(bool2.booleanValue()));
        }
        if (bool3 != null) {
            this.states.LJLILLLLZI.LJI(Boolean.valueOf(bool3.booleanValue()));
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

    @Override // X.I27
    public void onChooseMusicDone(boolean z, String str, AVMusic aVMusic, String str2) {
        AVMusic aVMusic2;
        if (z) {
            changeHasMusic(null);
            mobShowMusicTitle(null, null);
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        if (aVMusic != null && ((aVMusic2 = this.internalCurrentMusic) == null || aVMusic.id != aVMusic2.id || !o.LJ(this.lastMusicOrigin, str))) {
            mobShowMusicTitle(aVMusic, str);
            tryMobShowMusicDurationByChange(aVMusic.id);
        }
        this.lastMusicOrigin = str;
        changeHasMusic(aVMusic);
        notifyMusicChange();
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
