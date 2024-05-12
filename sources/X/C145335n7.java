package X;

import android.text.TextUtils;
import android.util.ArrayMap;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commerce.tools.mission.Mission;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.ftc.components.toolbar.FTCEditToolbarViewModel;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.performance.PerformanceMonitor;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.FlowDataMusicInfo;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.SimpleEffect;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.vesdk.VEMVAudioInfo;
import com.zhiliaoapp.musically.R;
import dmt.av.video.VEPreviewMusicParams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.AqS57S1200000_2;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.5n7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C145335n7 implements InterfaceC145495nN, InterfaceC135635Tz {
    public static final C142665io LLIIJI;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIIJLIL;
    public final ActivityC45651qj LJLIL;
    public final InterfaceC145445nI LJLILLLLZI;
    public final C82622Wbi LJLJI;
    public final C82632Wbs LJLJJI;
    public final V0N LJLJJL;
    public final C82631Wbr LJLJJLL;
    public final C82631Wbr LJLJL;
    public final C82631Wbr LJLJLJ;
    public final C5H3 LJLJLLL;
    public final C82631Wbr LJLL;
    public final C5H3 LJLLI;
    public final C5H3 LJLLILLLL;
    public boolean LJLLJ;
    public final C82631Wbr LJLLL;
    public final C82631Wbr LJLLLL;
    public final C82631Wbr LJLLLLLL;
    public final C145465nK LJLZ;
    public final C82631Wbr LJZ;
    public final C40871j1<C45927I0t<C145265n0>> LJZI;
    public final C40871j1 LJZL;
    public final C40871j1<C145425nG> LL;
    public final C40871j1 LLD;
    public boolean LLF;
    public final C40871j1<C145425nG> LLFF;
    public final C40871j1 LLFFF;
    public final C82631Wbr LLFII;
    public final C82632Wbs LLFZ;
    public final C82631Wbr LLI;
    public AVMusic LLIFFJFJJ;
    public boolean LLII;
    public boolean LLIIII;
    public final ArrayMap<String, String> LLIIIILZ;
    public final C82631Wbr LLIIIJ;
    public String LLIIIL;
    public MusicModel LLIIIZ;

    static {
        TBT tbt = new TBT(C145335n7.class, "mModel", "getMModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C65352Pkq.LIZ.getClass();
        LLIIJLIL = new InterfaceC74236TBo[]{tbt, new TBT(C145335n7.class, "editToolbarApi", "getEditToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0), new TBT(C145335n7.class, "editExitApi", "getEditExitApi()Lcom/ss/android/ugc/gamora/editor/exit/EditExitApiComponent;", 0), new TBT(C145335n7.class, "editAudioEnhanceApi", "getEditAudioEnhanceApi()Lcom/ss/android/ugc/gamora/editor/audioenhance/EditAudioEnhanceApi;", 0), new TBT(C145335n7.class, "editVolumeV2Api", "getEditVolumeV2Api()Lcom/ss/android/ugc/gamora/editor/volume/EditVolumeV2Api;", 0), new TBT(C145335n7.class, "replaceMusicToolbarApi", "getReplaceMusicToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/ReplaceMusicToolbarApi;", 0), new TBT(C145335n7.class, "subtitleApi", "getSubtitleApi()Lcom/ss/android/ugc/gamora/editor/subtitle/EditSubtitleApi;", 0), new TBT(C145335n7.class, "editAutoSaveDraftApi", "getEditAutoSaveDraftApi()Lcom/ss/android/ugc/gamora/editor/draft/EditAutoSaveDraftApi;", 0), new TBT(C145335n7.class, "editMusicApi", "getEditMusicApi()Lcom/ss/android/ugc/gamora/editor/music/EditMusicApi;", 0), new TBT(C145335n7.class, "recentMusicAddApi", "getRecentMusicAddApi()Lcom/ss/android/ugc/aweme/tools/music/music/recent/components/RecentMusicAddApi;", 0), new TBT(C145335n7.class, "editorProApi", "getEditorProApi()Lcom/ss/android/ugc/gamora/editorpro/EditorProApi;", 0), new TBT(C145335n7.class, "rootScene", "getRootScene()Lcom/ss/android/ugc/aweme/adaptation/TikTokSAARootGroupScene;", 0), new TBT(C145335n7.class, "publishButtonVisibility", "getPublishButtonVisibility()Lcom/ss/android/ugc/gamora/editor/LighteningBottomPublishButtonVisibility;", 0), new TBT(C145335n7.class, "lighteningMusicApi", "getLighteningMusicApi()Lcom/ss/android/ugc/gamora/editor/lightening/music/LighteningMusicApi;", 0)};
        LLIIJI = new C142665io();
    }

    @Override // X.InterfaceC145495nN
    public final void A3() {
        this.LLFF.LJI(new C145425nG());
    }

    public final InterfaceC145325n6 LIZIZ() {
        return (InterfaceC145325n6) this.LJLZ.LIZ(this, LLIIJLIL[8]);
    }

    public final InterfaceC143655kP LIZLLL() {
        return (InterfaceC143655kP) this.LJLLILLLL.getValue();
    }

    public final InterfaceC153275zv LJ() {
        return (InterfaceC153275zv) this.LJLJJLL.LIZ(this, LLIIJLIL[1]);
    }

    public final InterfaceC145405nE LJFF() {
        return (InterfaceC145405nE) this.LLIIIJ.LIZ(this, LLIIJLIL[13]);
    }

    public final VideoPublishEditModel LJI() {
        return (VideoPublishEditModel) this.LJLJJI.LIZ(this, LLIIJLIL[0]);
    }

    @Override // X.InterfaceC145495nN
    public final void r3() {
        String str;
        String str2;
        boolean z;
        boolean z2;
        String missionId;
        boolean z3;
        MusicModel musicModel;
        String str3;
        UrlModel urlModel;
        SimpleEffect effectInfo;
        AVChallenge aVChallenge;
        String str4 = LJI().mStickerID;
        if (str4 != null) {
            str = (String) ORZ.LJLLLLLL(0, s.LJLJJL(str4, new String[]{","}, 0, 6));
        } else {
            str = null;
        }
        ArrayList<TimeSpeedModelExtension> LJIIJJI = CameraComponentModel.LJIIJJI(LJI().mVideoSegmentsDesc);
        List<AVChallenge> list = LJI().challenges;
        if (list != null && (aVChallenge = (AVChallenge) ORZ.LJLLLLLL(0, list)) != null) {
            str2 = aVChallenge.cid;
        } else {
            str2 = null;
        }
        String str5 = LJI().mFirstStickerMusicIdsJson;
        boolean isAllowClearMusic = LJI().isAllowClearMusic();
        if ((LJI().isPhotoMvMode || H7R.LJJJJL(LJI())) && !LJI().isCurrentAutoCutMode()) {
            z = true;
        } else {
            z = false;
        }
        boolean z4 = this.LJLLJ;
        String str6 = LJI().mShootWay;
        String creationId = LJI().getCreationId();
        boolean LJIIJJI2 = C1JD.LJIIJJI(LJI());
        TimeSpeedModelExtension timeSpeedModelExtension = (TimeSpeedModelExtension) ORZ.LJLLLL(LJIIJJI);
        if (timeSpeedModelExtension != null) {
            z2 = timeSpeedModelExtension.isBusiSticker();
        } else {
            z2 = false;
        }
        boolean useMusicBeatSticker = LJI().useMusicBeatSticker();
        boolean LJJJJL = H7R.LJJJJL(LJI());
        long j = LJI().maxDuration;
        long videoLength = LJI().getVideoLength();
        C142665io c142665io = LLIIJI;
        VideoPublishEditModel videoPublishEditModel = LJI();
        c142665io.getClass();
        o.LJIIIZ(videoPublishEditModel, "videoPublishEditModel");
        Mission mission = videoPublishEditModel.creativeModel.commerceModel.getMission();
        if (mission == null) {
            missionId = null;
        } else {
            missionId = mission.getMissionId();
        }
        String LIZ = C142665io.LIZ(LJI());
        VideoPublishEditModel LJI = LJI();
        o.LJIIIZ(LJI, "<this>");
        if (!LJI.isDuet() && !LJI.isStickPointMode && !H7R.LJJJJL(LJI)) {
            z3 = true;
        } else {
            z3 = false;
        }
        AVMusic extractAVMusic = MusicBeanUtilKt.extractAVMusic(LJI().creativeModel.musicBuzModel);
        if (extractAVMusic != null) {
            musicModel = I9S.LIZ(extractAVMusic);
        } else {
            musicModel = null;
        }
        String musicOriginWithCheck = LJI().getMusicOriginWithCheck();
        FlowDataMusicInfo flowDataMusicInfo = LJI().creativeFlowData.getFlowDataMusicInfo();
        if (flowDataMusicInfo != null && flowDataMusicInfo.isSelectedByAuto()) {
            str3 = "auto";
        } else {
            str3 = "manual";
        }
        TimeSpeedModelExtension timeSpeedModelExtension2 = (TimeSpeedModelExtension) ORZ.LJLLLL(LJIIJJI);
        if (timeSpeedModelExtension2 != null && (effectInfo = timeSpeedModelExtension2.getEffectInfo()) != null) {
            urlModel = effectInfo.getIconUrl();
        } else {
            urlModel = null;
        }
        V0O v0o = new V0O(str5, str, str2, isAllowClearMusic, z, z4, str6, creationId, LJIIJJI2, z2, useMusicBeatSticker, LJJJJL, j, videoLength, missionId, LIZ, z3, null, null, musicModel, musicOriginWithCheck, str3, urlModel);
        V0N v0n = this.LJLJJL;
        ActivityC45651qj activityC45651qj = this.LJLIL;
        AqS168S0100000_2 aqS168S0100000_2 = new AqS168S0100000_2(this, 237);
        AqS152S0100000_2 aqS152S0100000_2 = new AqS152S0100000_2(this, 395);
        UrlModel reuseOriginalSoundUrls = LJI().getReuseOriginalSoundUrls();
        int reuseOriginalSoundLength = LJI().getReuseOriginalSoundLength();
        String reuseOriginalSoundId = LJI().getReuseOriginalSoundId();
        v0n.getClass();
        V0N.LJJIJLIJ(activityC45651qj, v0o, aqS168S0100000_2, aqS152S0100000_2, reuseOriginalSoundUrls, reuseOriginalSoundLength, reuseOriginalSoundId);
    }

    @Override // X.InterfaceC145495nN
    public final int y3() {
        if (this.LLII) {
            C78934UyQ.LJLIL.getMusicService().LJIL();
            new TCM();
            Integer LJIILLIIL = TCM.LJIILLIIL();
            if (LJIILLIIL != null) {
                return LJIILLIIL.intValue();
            }
        } else if (this.LLIIII) {
            return MusicService.LJJLIIIJJI().LJIJI();
        }
        return -1;
    }

    @Override // X.InterfaceC145495nN
    public final void G() {
        InterfaceC145405nE LJFF = LJFF();
        if (LJFF != null) {
            LJFF.G();
        }
    }

    public final void LJII() {
        MusicBeanUtilKt.extractAVMusic(LJI().creativeModel.musicBuzModel);
        InterfaceC153275zv LJ = LJ();
        if (LJ != null) {
            LJ.gv(R.raw.icon_music_note_s_alt);
        }
    }

    public final void LJIIIIZZ() {
        String str;
        AVMusic extractAVMusic = MusicBeanUtilKt.extractAVMusic(LJI().creativeModel.musicBuzModel);
        String LJIILLIIL = C78841Uwv.LJIILLIIL(extractAVMusic);
        String LJIIZILJ = C78841Uwv.LJIIZILJ(extractAVMusic);
        VEPreviewMusicParams vEPreviewMusicParams = new VEPreviewMusicParams();
        vEPreviewMusicParams.mPath = null;
        vEPreviewMusicParams.mInPoint = 0;
        vEPreviewMusicParams.musicId = LJIILLIIL;
        if (extractAVMusic != null) {
            str = extractAVMusic.musicName;
        } else {
            str = null;
        }
        vEPreviewMusicParams.musicName = str;
        vEPreviewMusicParams.mDuration = 0;
        vEPreviewMusicParams.mShootDuration = 0;
        if (extractAVMusic != null) {
            vEPreviewMusicParams.previewStartTime = extractAVMusic.getPreviewStartTime();
        }
        vEPreviewMusicParams.bgmDelay = 0;
        vEPreviewMusicParams.bgmLoudness = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        vEPreviewMusicParams.peakLoudness = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        vEPreviewMusicParams.avgLoudness = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        LIZLLL().x70(vEPreviewMusicParams);
        LJI().getMMusicPath();
        LJI().setMMusicPath(null);
        LJI().setMusicId(LJIILLIIL);
        LJI().setMusicRequestId(LJIIZILJ);
        LJI().setMMusicStart(0);
        LJI().setIsSoundLoop(Boolean.FALSE);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SoundLoop, AiMusic PreviewMusicRemove isSoundLoop = ");
        LIZ.append(LJI().getIsSoundLoop());
        LIZ.append(' ');
        H78.LIZ(X1D.LIZIZ(LIZ));
        B8(C44384HbQ.LJIIL(LJI().getCurMusicServerLength(), LJI(), LJI().getMMusicPath()));
        LJII();
        this.LLIFFJFJJ = null;
    }

    @Override // X.InterfaceC145495nN
    public final void clearMusic() {
        Integer num;
        C5XM c5xm;
        InterfaceC153045zY value = LIZLLL().Kh().getValue();
        Integer num2 = null;
        if (value != null) {
            num = Integer.valueOf(value.getDuration());
        } else {
            num = null;
        }
        MusicBeanUtilKt.updateAVMusic(LJI().creativeModel.musicBuzModel, null);
        LIZLLL().x70(new VEPreviewMusicParams());
        LJI().getMMusicPath();
        LJI().setMMusicPath(null);
        LJI().setMusicId("");
        LJI().setMusicRequestId("");
        LJI().setPreviewStartTime(0.0f);
        LJI().isOriginalSound = false;
        LJI().setCommerceMusic(false);
        LJI().setMMusicStart(0);
        LJI().setMusicOrigin("");
        LJI().setIsSoundLoop(Boolean.FALSE);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SoundLoop, NormalMusic clearMusic isSoundLoop = ");
        LIZ.append(LJI().getIsSoundLoop());
        H78.LIZ(X1D.LIZIZ(LIZ));
        B8(false);
        LJII();
        LIZ(false);
        C82631Wbr c82631Wbr = this.LJLJLJ;
        InterfaceC74236TBo<?>[] interfaceC74236TBoArr = LLIIJLIL;
        InterfaceC143845ki interfaceC143845ki = (InterfaceC143845ki) c82631Wbr.LIZ(this, interfaceC74236TBoArr[3]);
        if (interfaceC143845ki != null) {
            interfaceC143845ki.Ex();
        }
        this.LJZI.LJI(new C45927I0t<>(new C145265n0(null, null, 6)));
        InterfaceC145325n6 LIZIZ = LIZIZ();
        if (LIZIZ != null) {
            LIZIZ.xl(null);
        }
        C143115jX c143115jX = (C143115jX) this.LLI.LIZ(this, interfaceC74236TBoArr[12]);
        if (c143115jX != null) {
            c143115jX.LIZ(false);
        }
        if (LJI().isCutSameVideoType() && (c5xm = (C5XM) this.LJLL.LIZ(this, interfaceC74236TBoArr[4])) != null) {
            c5xm.RU(true);
        }
        if (C44384HbQ.LJJIFFI()) {
            LJIIIIZZ();
            this.LLIIIILZ.clear();
            this.LLII = false;
        }
        InterfaceC153045zY value2 = LIZLLL().Kh().getValue();
        if (value2 != null) {
            num2 = Integer.valueOf(value2.getDuration());
        }
        if (!o.LJ(num, num2)) {
            this.LL.LJI(new C145425nG());
        }
        InterfaceC143855kj interfaceC143855kj = (InterfaceC143855kj) this.LJLLLL.LIZ(this, interfaceC74236TBoArr[6]);
        if (interfaceC143855kj != null) {
            interfaceC143855kj.notifyMusicChange();
        }
        InterfaceC150685vk interfaceC150685vk = (InterfaceC150685vk) this.LJLLLLLL.LIZ(this, interfaceC74236TBoArr[7]);
        if (interfaceC150685vk != null) {
            interfaceC150685vk.Pr();
        }
    }

    @Override // X.InterfaceC145495nN
    public final void o3() {
        InterfaceC145405nE LJFF = LJFF();
        if (LJFF != null) {
            LJFF.I30(null);
        }
    }

    @Override // X.InterfaceC145495nN
    public final void u3() {
        InterfaceC145405nE LJFF = LJFF();
        if (LJFF != null) {
            LJFF.RJ("", false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [X.5n8] */
    @Override // X.InterfaceC145495nN
    public final void x3() {
        if (!LJI().isDraftMusicIllegal() && LJI().isMvThemeVideoType() && !C77413UZt.LJIILL(LJI().mvCreateVideoData.musicIds)) {
            C149835uN LJJIII = C78934UyQ.LJLIL.getMusicService().LJJIII(new InterfaceC149485to() { // from class: X.5nA
                @Override // X.InterfaceC149485to
                public final MusicBuzModel LIZIZ() {
                    return C145335n7.this.LJI().creativeModel.musicBuzModel;
                }

                @Override // X.InterfaceC149485to
                public final void LIZ(AVMusic aVMusic) {
                    C145335n7.this.LJZI.LJI(new C45927I0t<>(new C145265n0(aVMusic, null, 6)));
                    I9T.LJI(aVMusic, false, C145335n7.this.LJI().creativeModel.musicBuzModel);
                }
            });
            LJJIII.LIZIZ(new InterfaceC145435nH() { // from class: X.5n8
                @Override // X.InterfaceC145435nH
                public final void LIZ(AVMusic aVMusic, MusicModel musicModel, boolean z) {
                    InterfaceC145325n6 LIZIZ;
                    VEMVAudioInfo LLJZIJLIL;
                    if (aVMusic == null) {
                        return;
                    }
                    C145335n7 c145335n7 = C145335n7.this;
                    c145335n7.LLIIIZ = musicModel;
                    c145335n7.LJLLJ = aVMusic.isMvThemeMusic();
                    C145335n7 c145335n72 = C145335n7.this;
                    c145335n72.getClass();
                    if (z) {
                        c145335n72.LJI().setMusicId(aVMusic.getMusicId());
                        c145335n72.LJI().setMusicOrigin("mv_default");
                        c145335n72.LJZI.LJI(new C45927I0t<>(new C145265n0(aVMusic, null, 6)));
                        InterfaceC145325n6 LIZIZ2 = c145335n72.LIZIZ();
                        if (LIZIZ2 != null) {
                            LIZIZ2.xl(aVMusic);
                        }
                        c145335n72.LJI().setMusicRequestId(C78841Uwv.LJIIZILJ(aVMusic));
                        c145335n72.LJI().setPreviewStartTime(aVMusic.getPreviewStartTime());
                        c145335n72.LJI().setCommerceMusic(aVMusic.isCommerceMusic());
                        c145335n72.LJI().isOriginalSound = aVMusic.isOriginalSound();
                        InterfaceC153045zY value = c145335n72.LIZLLL().Kh().getValue();
                        if (value != null && (LLJZIJLIL = value.LLJZIJLIL()) != null) {
                            c145335n72.LJI().setMMusicStart(LLJZIJLIL.trimIn);
                            c145335n72.LJI().setMMusicEnd(LLJZIJLIL.trimOut);
                        } else {
                            c145335n72.LJI().setMMusicStart(0);
                            c145335n72.LJI().setMMusicEnd(Math.min(aVMusic.getPresenterDuration(), 60000));
                        }
                        c145335n72.w3(aVMusic.getMusicId(), "mv_default");
                    }
                    if (C44384HbQ.LJJIFFI() && z && (LIZIZ = c145335n72.LIZIZ()) != null) {
                        LIZIZ.ra0(aVMusic);
                    }
                }
            });
            LJJIII.LIZ(LJI().mvCreateVideoData.musicIds);
        }
    }

    @Override // X.InterfaceC145495nN
    public final MusicModel LIZJ() {
        return this.LLIIIZ;
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLJI;
    }

    @Override // X.InterfaceC145495nN
    public final C0IB<C145425nG> n3() {
        return this.LLFFF;
    }

    @Override // X.InterfaceC145495nN
    public final C0IB<C145425nG> p3() {
        return this.LLD;
    }

    @Override // X.InterfaceC145495nN
    public final C0IB<C45927I0t<C145265n0>> z3() {
        return this.LJZL;
    }

    @Override // X.InterfaceC145495nN
    public final void B8(boolean z) {
        if (C44384HbQ.LJJIFFI()) {
            InterfaceC145325n6 LIZIZ = LIZIZ();
            if (LIZIZ != null) {
                LIZIZ.B8(z);
                return;
            }
            return;
        }
        if (C1DG.LJIIIIZZ()) {
            ((FTCEditToolbarViewModel) C163726bg.LIZLLL((WM7) this.LLFZ.LIZ(this, LLIIJLIL[11])).LIZ(FTCEditToolbarViewModel.class)).Jf(8, z);
            return;
        }
        InterfaceC153275zv LJ = LJ();
        if (LJ == null) {
            return;
        }
        LJ.Jf(8, z);
    }

    public final void LIZ(boolean z) {
        if (!this.LLF) {
            return;
        }
        if (!z || ((WM7) this.LLFZ.LIZ(this, LLIIJLIL[11])).getLifecycle().getCurrentState() == Lifecycle.State.RESUMED) {
            MutableLiveData<C5MM> DM = LIZLLL().DM();
            DM.setValue(C5MM.LIZJ());
            DM.setValue(C5MM.LIZLLL(0L));
            DM.setValue(C5MM.LIZ());
        }
    }

    @Override // X.InterfaceC145495nN
    public final void q3(final C145355n9 result) {
        Integer num;
        int intValue;
        String str;
        int i;
        float f;
        Integer num2;
        int intValue2;
        boolean z;
        InterfaceC136115Vv interfaceC136115Vv;
        InterfaceC153275zv LJ;
        int musicStartFromCut;
        C5L0 c5l0;
        String str2;
        o.LJIIIZ(result, "result");
        Integer num3 = 0;
        if (result.LIZ || result.LIZJ == null) {
            clearMusic();
            InterfaceC153275zv LJ2 = LJ();
            if (LJ2 != null) {
                LJ2.ks0(0);
            }
        } else if (C1JD.LJIIJJI(LJI()) && C1JD.LJIIL(result.LIZJ)) {
            LIZLLL().DM().setValue(C5MM.LIZ());
            C5S1 c5s1 = new C5S1(this.LJLIL);
            c5s1.LIZJ(R.string.hyq);
            c5s1.LJ();
        } else if (!TextUtils.isEmpty(result.LIZLLL)) {
            String str3 = result.LIZLLL;
            String str4 = result.LIZIZ;
            AVMusic aVMusic = result.LIZJ;
            long j = result.LJI;
            long j2 = result.LJII;
            boolean z2 = !TextUtils.isEmpty(LJI().getMusicId());
            MusicBeanUtilKt.updateAVMusic(LJI().creativeModel.musicBuzModel, aVMusic);
            String str5 = "";
            if (aVMusic != null && (c5l0 = (C5L0) this.LJZ.LIZ(this, LLIIJLIL[9])) != null) {
                MusicModel LJJIJIL = C78915Uy7.LJJIJIL(aVMusic);
                if (str4 == null) {
                    str2 = "";
                } else {
                    str2 = str4;
                }
                c5l0.Lp(LJJIJIL, str2);
            }
            String LJIILLIIL = C78841Uwv.LJIILLIIL(aVMusic);
            VEPreviewMusicParams vEPreviewMusicParams = new VEPreviewMusicParams();
            vEPreviewMusicParams.mPath = str3;
            if (j2 >= 0) {
                intValue = (int) j2;
            } else {
                if (aVMusic == null || (num = aVMusic.ccTemplateMusicStartTime) == null) {
                    num = num3;
                }
                intValue = num.intValue();
            }
            vEPreviewMusicParams.mInPoint = intValue;
            vEPreviewMusicParams.bgmDelay = LJI().recordBgmDelay;
            if (LJI().loudnessBalanceParam != null) {
                vEPreviewMusicParams.bgmLoudness = LJI().loudnessBalanceParam.getBgmLoudness();
                vEPreviewMusicParams.peakLoudness = LJI().loudnessBalanceParam.getPeakLoudness();
                vEPreviewMusicParams.avgLoudness = LJI().loudnessBalanceParam.getAvgLoudness();
            }
            vEPreviewMusicParams.musicId = LJIILLIIL;
            if (aVMusic != null) {
                str = aVMusic.musicName;
            } else {
                str = null;
            }
            vEPreviewMusicParams.musicName = str;
            if (aVMusic != null) {
                vEPreviewMusicParams.previewStartTime = aVMusic.getPreviewStartTime();
                i = aVMusic.getDuration();
            } else {
                i = -1;
            }
            int LIZ = HOH.LIZ(i, str3);
            vEPreviewMusicParams.mDuration = LIZ;
            if (aVMusic != null && aVMusic.getShootDuration() > 0 && Math.abs(vEPreviewMusicParams.mDuration - aVMusic.getShootDuration()) >= 1000) {
                vEPreviewMusicParams.mShootDuration = aVMusic.getShootDuration();
            } else {
                vEPreviewMusicParams.mShootDuration = vEPreviewMusicParams.mDuration;
            }
            if (j > 0 && j < vEPreviewMusicParams.mShootDuration) {
                vEPreviewMusicParams.mShootDuration = (int) j;
            }
            vEPreviewMusicParams.isSoundLoop = false;
            if (!z2) {
                f = WUK.LJIJI;
            } else {
                f = LJI().musicVolume;
            }
            vEPreviewMusicParams.mVolume = f;
            LIZLLL().x70(vEPreviewMusicParams);
            PerformanceMonitor remove = C5IO.LIZ.remove(LJIILLIIL);
            if (remove != null) {
                G8G.LIZ.end(remove, "edit page choose music end", 0L);
            }
            LJI().getMMusicPath();
            LJI().setMMusicPath(str3);
            LJI().setMusicId(LJIILLIIL);
            LJI().setMusicRequestId(C78841Uwv.LJIIZILJ(aVMusic));
            VideoPublishEditModel LJI = LJI();
            if (j2 >= 0) {
                intValue2 = (int) j2;
            } else {
                if (aVMusic == null || (num2 = aVMusic.ccTemplateMusicStartTime) == null) {
                    num2 = num3;
                }
                intValue2 = num2.intValue();
            }
            LJI.setMMusicStart(intValue2);
            LJI().setIsSoundLoop(Boolean.FALSE);
            if (aVMusic != null && (musicStartFromCut = aVMusic.getMusicStartFromCut()) > 0) {
                LJI().setMMusicStart(musicStartFromCut);
                InterfaceC143655kP LIZLLL = LIZLLL();
                int mMusicStart = LJI().getMMusicStart();
                int LJLIIL = C44384HbQ.LJLIIL(LIZLLL());
                Boolean isSoundLoop = LJI().getIsSoundLoop();
                o.LJIIIIZZ(isSoundLoop, "mModel.isSoundLoop");
                LIZLLL.uC(new C123774tR(mMusicStart, LJLIIL, isSoundLoop.booleanValue()));
                LIZLLL().rZ(true);
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("SoundLoop, NormalMusic MusicChoose isSoundLoop = ");
            LIZ2.append(LJI().getIsSoundLoop());
            H78.LIZ(X1D.LIZIZ(LIZ2));
            if (aVMusic != null) {
                LJI().setCommerceMusic(aVMusic.isCommerceMusic());
                LJI().isOriginalSound = aVMusic.isOriginalSound();
            }
            if (vEPreviewMusicParams.mShootDuration > 0) {
                LJI().setMMusicEnd(Math.min(vEPreviewMusicParams.mShootDuration, 60000));
            } else {
                LJI().setMMusicEnd(Math.min(vEPreviewMusicParams.mDuration, 60000));
            }
            LJI().setMusicOrigin(str4);
            if (!LJI().isDuet() && LJI().getMMusicPath() != null && !LJI().isStickPointMode) {
                z = true;
            } else {
                z = false;
            }
            B8(z);
            if (LJI().isMvThemeVideoType() && !C77413UZt.LJIILL(LJI().mvCreateVideoData.musicIds) && LJI().mvCreateVideoData.musicIds.contains(LJIILLIIL)) {
                B8(false);
            }
            LJI().setMCurMusicLength(LIZ);
            if (C44384HbQ.LJLIIL(LIZLLL()) > LIZ && (LJ = LJ()) != null) {
                LJ.fg0(8, false);
            }
            LJII();
            if (LJI().isMvThemeVideoType() && LJI().mvCreateVideoData.mvType == 1) {
                if (str3 != null) {
                    this.LJLILLLLZI.LLIIIZ(LJI().getMMusicStart(), LJI().getMMusicEnd(), true, str3, LIZ);
                }
            } else {
                LIZ(false);
                this.LJZI.LJI(new C45927I0t<>(new C145265n0(aVMusic, null, 6)));
                InterfaceC145325n6 LIZIZ = LIZIZ();
                if (LIZIZ != null) {
                    LIZIZ.xl(aVMusic);
                }
                if (C1DG.LJIIIIZZ()) {
                    ((InterfaceC145415nF) this.LJLLI.getValue()).LJJLIIIJ(C44384HbQ.LJLIIL(LIZLLL()));
                } else {
                    ((InterfaceC145455nJ) this.LJLJLLL.getValue()).LJJLIIIJ(C44384HbQ.LJLIIL(LIZLLL()));
                }
            }
            C82631Wbr c82631Wbr = this.LJLJLJ;
            InterfaceC74236TBo<?>[] interfaceC74236TBoArr = LLIIJLIL;
            InterfaceC143845ki interfaceC143845ki = (InterfaceC143845ki) c82631Wbr.LIZ(this, interfaceC74236TBoArr[3]);
            if (interfaceC143845ki != null) {
                interfaceC143845ki.Ex();
            }
            if (C44384HbQ.LJJIFFI()) {
                w3(C78841Uwv.LJIILLIIL(aVMusic), str4);
                this.LLII = false;
                this.LLIFFJFJJ = aVMusic;
            }
            this.LLIIII = o.LJ(str4, "edit_page_list");
            InterfaceC143855kj interfaceC143855kj = (InterfaceC143855kj) this.LJLLLL.LIZ(this, interfaceC74236TBoArr[6]);
            if (interfaceC143855kj != null) {
                interfaceC143855kj.notifyMusicChange();
            }
            if (LJI().creativeModel.postPageModel.isEnterFromEPDirectly && (interfaceC136115Vv = (InterfaceC136115Vv) this.LLFII.LIZ(this, interfaceC74236TBoArr[10])) != null) {
                interfaceC136115Vv.mt0();
            }
            InterfaceC150685vk interfaceC150685vk = (InterfaceC150685vk) this.LJLLLLLL.LIZ(this, interfaceC74236TBoArr[7]);
            if (interfaceC150685vk != null) {
                interfaceC150685vk.Pr();
            }
            InterfaceC153275zv LJ3 = LJ();
            if (LJ3 != null) {
                LJ3.ks0(1);
            }
            AVMusic aVMusic2 = result.LIZJ;
            if (aVMusic2 != null && (num3 = aVMusic2.ccTemplateMusicStartTime) == null) {
                num3 = Integer.valueOf(aVMusic2.getMusicStartFromCut());
            }
            final int intValue3 = num3.intValue();
            AVMusic aVMusic3 = result.LIZJ;
            if (aVMusic3 != null) {
                if (!C81995WFz.LJ(aVMusic3.getMusicWaveData())) {
                    WG0.LJFF(result.LIZLLL, new WG2() { // from class: X.5nB
                        @Override // X.WG2
                        public final void LIZ(AVMusicWaveBean aVMusicWaveBean) {
                            AVMusic aVMusic4;
                            if (aVMusicWaveBean != null && (aVMusic4 = result.LIZJ) != null) {
                                aVMusic4.setMusicWaveData(aVMusicWaveBean.getMusicWavePointArray());
                            }
                            if (C1DG.LJIIIIZZ()) {
                                InterfaceC145415nF interfaceC145415nF = (InterfaceC145415nF) C145335n7.this.LJLLI.getValue();
                                AVMusic aVMusic5 = result.LIZJ;
                                o.LJI(aVMusic5);
                                interfaceC145415nF.ds0(aVMusicWaveBean, aVMusic5.getDuration(), intValue3);
                            }
                        }
                    });
                } else {
                    AVMusicWaveBean aVMusicWaveBean = new AVMusicWaveBean();
                    float[] musicWaveData = aVMusic3.getMusicWaveData();
                    o.LJIIIIZZ(musicWaveData, "bean.musicWaveData");
                    float[] copyOf = Arrays.copyOf(musicWaveData, musicWaveData.length);
                    o.LJIIIIZZ(copyOf, "copyOf(this, size)");
                    aVMusicWaveBean.setMusicWavePointArray(copyOf);
                    aVMusicWaveBean.setMusicPath(C78934UyQ.LJLIL.getMusicService().LJIIJJI(aVMusic3));
                    if (C1DG.LJIIIIZZ()) {
                        InterfaceC145415nF interfaceC145415nF = (InterfaceC145415nF) this.LJLLI.getValue();
                        AVMusic aVMusic4 = result.LIZJ;
                        o.LJI(aVMusic4);
                        interfaceC145415nF.ds0(aVMusicWaveBean, aVMusic4.getDuration(), intValue3);
                    }
                }
                if (!C1DG.LJIIIIZZ()) {
                    InterfaceC145455nJ interfaceC145455nJ = (InterfaceC145455nJ) this.LJLJLLL.getValue();
                    AVMusic aVMusic5 = result.LIZJ;
                    String str6 = result.LIZLLL;
                    if (str6 != null) {
                        str5 = str6;
                    }
                    o.LJI(aVMusic5);
                    interfaceC145455nJ.c70(aVMusic5, str5, aVMusic5.getDuration(), intValue3, null);
                }
            }
        }
        InterfaceC145315n5 interfaceC145315n5 = (InterfaceC145315n5) this.LJLLL.LIZ(this, LLIIJLIL[5]);
        if (interfaceC145315n5 != null) {
            interfaceC145315n5.J60();
        }
    }

    @Override // X.InterfaceC145495nN
    public final void s3(boolean z) {
        this.LLF = z;
    }

    @Override // X.InterfaceC145495nN
    public final void v3(MusicModel musicModel) {
        this.LLIIIZ = musicModel;
    }

    @Override // X.InterfaceC145495nN
    public final void V7(AVMusic aVMusic, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        InterfaceC146755pP interfaceC146755pP = (InterfaceC146755pP) ((C1EP) this.LJLJI.LJ(C1EP.class, null)).sO(InterfaceC146755pP.class);
        if (interfaceC146755pP == null) {
            ((AqS57S1200000_2) interfaceC65784Pro).invoke();
        } else {
            interfaceC146755pP.V7(aVMusic, interfaceC65784Pro);
        }
    }

    @Override // X.InterfaceC145495nN
    public final void w3(String str, String str2) {
        this.LLIIIILZ.put(str, str2);
    }

    public C145335n7(ActivityC45651qj activityC45651qj, InterfaceC145445nI musicCallback, C82622Wbi c82622Wbi) {
        o.LJIIIZ(musicCallback, "musicCallback");
        this.LJLIL = activityC45651qj;
        this.LJLILLLLZI = musicCallback;
        this.LJLJI = c82622Wbi;
        this.LJLJJI = UCI.LJI(c82622Wbi, VideoPublishEditModel.class, null);
        this.LJLJJL = new V0N();
        this.LJLJJLL = UCI.LJII(c82622Wbi, InterfaceC153275zv.class, null);
        this.LJLJL = UCI.LJII(c82622Wbi, InterfaceC148865so.class, null);
        this.LJLJLJ = UCI.LJII(c82622Wbi, InterfaceC143845ki.class, null);
        this.LJLJLLL = C269113v.LIZ(this, InterfaceC145455nJ.class);
        this.LJLL = UCI.LJII(c82622Wbi, C5XM.class, null);
        this.LJLLI = C269113v.LIZ(this, InterfaceC145415nF.class);
        this.LJLLILLLL = C269113v.LIZ(this, InterfaceC143655kP.class);
        this.LJLLL = UCI.LJII(c82622Wbi, InterfaceC145315n5.class, null);
        this.LJLLLL = UCI.LJII(c82622Wbi, InterfaceC143855kj.class, null);
        this.LJLLLLLL = UCI.LJII(c82622Wbi, InterfaceC150685vk.class, null);
        this.LJLZ = new C145465nK(this);
        this.LJZ = UCI.LJII(c82622Wbi, C5L0.class, null);
        C40871j1<C45927I0t<C145265n0>> c40871j1 = new C40871j1<>(null);
        this.LJZI = c40871j1;
        this.LJZL = c40871j1;
        C40871j1<C145425nG> c40871j12 = new C40871j1<>(null);
        this.LL = c40871j12;
        this.LLD = c40871j12;
        this.LLF = true;
        C40871j1<C145425nG> c40871j13 = new C40871j1<>(null);
        this.LLFF = c40871j13;
        this.LLFFF = c40871j13;
        this.LLFII = UCI.LJII(c82622Wbi, InterfaceC136115Vv.class, null);
        this.LLFZ = UCI.LJI(c82622Wbi, AbstractC42651GoZ.class, null);
        this.LLI = UCI.LJII(c82622Wbi, C143115jX.class, null);
        ArrayMap<String, String> arrayMap = new ArrayMap<>();
        arrayMap.put(LJI().getMusicId(), LJI().getMusicOrigin());
        this.LLIIIILZ = arrayMap;
        this.LLIIIJ = UCI.LJII(c82622Wbi, InterfaceC145405nE.class, null);
        try {
            J9B j9b = J9B.LJLIL;
            C5MG WS = LIZLLL().WS();
            if (WS != null) {
                ((C133765Mu) WS.LJJ()).LLIIJLIL(j9b);
            }
        } catch (Exception e) {
            C78983UzD.LJIJ(e, "Error while setting up VE audio first frame listener");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    @Override // X.InterfaceC145495nN
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t3(java.lang.String r30, final com.ss.android.ugc.aweme.shortvideo.AVMusic r31, boolean r32, boolean r33, boolean r34, boolean r35, long r36, boolean r38, boolean r39) {
        /*
            Method dump skipped, instructions count: 1344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C145335n7.t3(java.lang.String, com.ss.android.ugc.aweme.shortvideo.AVMusic, boolean, boolean, boolean, boolean, long, boolean, boolean):void");
    }
}
