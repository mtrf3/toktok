package X;

import Y.AObjectS84S0100000_2;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.creative.model.music.MusicObject;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.services.audio.VoiceDetectionListener;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.FlowDataMusicInfo;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.gamora.editor.audioservice.service.voicedetection.VoiceDetectorService;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import kotlin.jvm.internal.AqS57S1200000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5n1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C145275n1 extends WM7 implements InterfaceC143795kd, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLF;
    public final C82622Wbi LJLIL;
    public final C82632Wbs LJLILLLLZI;
    public boolean LJLJI;
    public String LJLJJI;
    public boolean LJLJJL;
    public String LJLJJLL;
    public final C82632Wbs LJLJL;
    public final C82631Wbr LJLJLJ;
    public final C82632Wbs LJLJLLL;
    public final C82632Wbs LJLL;
    public final C82631Wbr LJLLI;
    public InterfaceC133285Ky LJLLILLLL;
    public final C82632Wbs LJLLJ;
    public final C82631Wbr LJLLL;
    public final C82631Wbr LJLLLL;
    public final C82631Wbr LJLLLLLL;
    public final C82631Wbr LJLZ;
    public final C82631Wbr LJZ;
    public C5L2 LJZI;
    public boolean LJZL;
    public final C82631Wbr LL;
    public final C145285n2 LLD;

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
        TBT tbt = new TBT(C145275n1.class, "mModel", "getMModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLF = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C145275n1.class, "editMusicApi", "getEditMusicApi()Lcom/ss/android/ugc/gamora/editor/music/EditMusicApi;", 0, c65351Pkp), C61845OOz.LIZJ(C145275n1.class, "editorProApi", "getEditorProApi()Lcom/ss/android/ugc/gamora/editorpro/EditorProApi;", 0, c65351Pkp), C61845OOz.LIZJ(C145275n1.class, "editCutMusicApi", "getEditCutMusicApi()Lcom/ss/android/ugc/gamora/editor/cutmusic/EditCutMusicApi;", 0, c65351Pkp), C61845OOz.LIZJ(C145275n1.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0, c65351Pkp), C61845OOz.LIZJ(C145275n1.class, "replaceManager", "getReplaceManager()Lcom/ss/android/ugc/gamora/editor/toolbar/ReplaceMusicToolbarApi;", 0, c65351Pkp), C61845OOz.LIZJ(C145275n1.class, "musicController", "getMusicController()Lcom/ss/android/ugc/gamora/editor/IEditMusicController;", 0, c65351Pkp), C61845OOz.LIZJ(C145275n1.class, "editVolumeV2Api", "getEditVolumeV2Api()Lcom/ss/android/ugc/gamora/editor/volume/EditVolumeV2Api;", 0, c65351Pkp), C61845OOz.LIZJ(C145275n1.class, "stsApi", "getStsApi()Lcom/ss/android/ugc/gamora/editor/audioservice/service/speechtosong/components/SpeechToSongApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C145275n1.class, "editStickerApi", "getEditStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/EditStickerApi;", 0, c65351Pkp), C61845OOz.LIZJ(C145275n1.class, "lighteningMusicApi", "getLighteningMusicApi()Lcom/ss/android/ugc/gamora/editor/lightening/music/LighteningMusicApi;", 0, c65351Pkp), C61845OOz.LIZJ(C145275n1.class, "musicReplaceApi", "getMusicReplaceApi()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioedit/musicreplace/MusicReplaceApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C145275n1.class, "recentMusicApi", "getRecentMusicApi()Lcom/ss/android/ugc/aweme/tools/music/music/recent/components/RecentMusicAddApi;", 0, c65351Pkp)};
    }

    public final InterfaceC145455nJ LLJILJIL() {
        return (InterfaceC145455nJ) this.LJLJLLL.LIZ(this, LLF[3]);
    }

    public final InterfaceC145325n6 LLJILJILJ() {
        return (InterfaceC145325n6) this.LJLJL.LIZ(this, LLF[1]);
    }

    public final VideoPublishEditModel LLJJ() {
        return (VideoPublishEditModel) this.LJLILLLLZI.LIZ(this, LLF[0]);
    }

    public final InterfaceC145495nN LLJJI() {
        return (InterfaceC145495nN) this.LJLLJ.LIZ(this, LLF[6]);
    }

    public final InterfaceC162426Za LLJJIJI() {
        return (InterfaceC162426Za) this.LJLLLL.LIZ(this, LLF[8]);
    }

    public final InterfaceC143655kP getEditPreviewApi() {
        return (InterfaceC143655kP) this.LJLL.LIZ(this, LLF[4]);
    }

    public final C5XM getEditVolumeV2Api() {
        return (C5XM) this.LJLLL.LIZ(this, LLF[7]);
    }

    public final C149795uJ LLJJIII() {
        C149795uJ c149795uJ;
        boolean z;
        boolean z2;
        boolean z3;
        float voiceVolume;
        boolean z4;
        boolean z5;
        if (LLJJ().veAudioRecorderParam != null) {
            boolean hasOriginalSound = LLJJ().veAudioRecorderParam.getHasOriginalSound();
            boolean needOriginalSound = LLJJ().veAudioRecorderParam.getNeedOriginalSound();
            boolean muteByAudioCopyright = LLJJ().veAudioRecorderParam.getMuteByAudioCopyright();
            if (LLJJ().veAudioRecorderParam.getNeedOriginalSound()) {
                voiceVolume = LLJJ().voiceVolume;
            } else {
                voiceVolume = LLJJ().veAudioRecorderParam.getVoiceVolume();
            }
            boolean isCurrentAutoCutMode = LLJJ().isCurrentAutoCutMode();
            if (LLJJ().isCurrentAutoCutMode() && LLJJ().mOrigin != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean LJLL = C44384HbQ.LJLL(LLJJ());
            if (LLJJ().creativeModel.audioCopyrightDetectModel.getHasMusicReplaced() && LLJJ().veAudioEffectParam == null && LLJJ().creativeModel.streamVoiceConversionModel.vcEffectId.length() == 0) {
                z5 = true;
            } else {
                z5 = false;
            }
            c149795uJ = new C149795uJ(hasOriginalSound, needOriginalSound, muteByAudioCopyright, voiceVolume, isCurrentAutoCutMode, z4, LJLL, z5, LLJJ().creativeModel.audioCopyrightDetectModel.getReplaceRecommendID());
        } else {
            boolean hasOriginalSound2 = LLJJ().hasOriginalSound(HRX.LIZLLL());
            if ((LLJJ().creativeModel.micDataModel.editDefaultVolume != 0.0f || LLJJ().creativeModel.micDataModel.editVolumeChangeMark) && (!LLJJ().isCurrentAutoCutMode() || C44384HbQ.LJLL(LLJJ()))) {
                z = true;
            } else {
                z = false;
            }
            float f = LLJJ().voiceVolume;
            boolean isCurrentAutoCutMode2 = LLJJ().isCurrentAutoCutMode();
            if (LLJJ().isCurrentAutoCutMode() && LLJJ().mOrigin != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean LJLL2 = C44384HbQ.LJLL(LLJJ());
            if (LLJJ().creativeModel.audioCopyrightDetectModel.getHasMusicReplaced() && LLJJ().veAudioEffectParam == null && LLJJ().creativeModel.streamVoiceConversionModel.vcEffectId.length() == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            c149795uJ = new C149795uJ(hasOriginalSound2, z, false, f, isCurrentAutoCutMode2, z2, LJLL2, z3, LLJJ().creativeModel.audioCopyrightDetectModel.getReplaceRecommendID());
        }
        return c149795uJ;
    }

    @Override // X.WM7
    public final void onDestroyView() {
        super.onDestroyView();
        InterfaceC133285Ky interfaceC133285Ky = this.LJLLILLLL;
        if (interfaceC133285Ky != null) {
            interfaceC133285Ky.destroy();
        }
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    @Override // X.WM7
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        VoiceDetectorService.LIZ().setVoiceDetectionListener(0, new VoiceDetectionListener() { // from class: X.5my
            @Override // com.ss.android.ugc.aweme.services.audio.VoiceDetectionListener
            public final void onVoiceActivityDetected(boolean z, double d) {
                if (z) {
                    C145275n1 c145275n1 = C145275n1.this;
                    InterfaceC133285Ky interfaceC133285Ky = c145275n1.LJLLILLLL;
                    if (interfaceC133285Ky == null) {
                        c145275n1.LJZL = true;
                    } else {
                        interfaceC133285Ky.LJFF();
                    }
                }
            }
        });
        LLJILJILJ().LD().LIZLLL(this, new AObjectS84S0100000_2(this, 0));
    }

    /* JADX WARN: Type inference failed for: r0v29, types: [X.5n2] */
    public C145275n1(C82622Wbi diContainer, WMH objectParentScene) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(objectParentScene, "objectParentScene");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = UCI.LJI(diContainer, VideoPublishEditModel.class, null);
        this.LJLJJLL = "";
        this.LJLJL = UCI.LJI(diContainer, InterfaceC145325n6.class, null);
        this.LJLJLJ = UCI.LJII(diContainer, InterfaceC136115Vv.class, null);
        this.LJLJLLL = UCI.LJI(diContainer, InterfaceC145455nJ.class, null);
        this.LJLL = UCI.LJI(diContainer, InterfaceC143655kP.class, null);
        this.LJLLI = UCI.LJII(diContainer, InterfaceC145315n5.class, null);
        this.LJLLJ = UCI.LJI(diContainer, InterfaceC145495nN.class, null);
        this.LJLLL = UCI.LJII(diContainer, C5XM.class, null);
        this.LJLLLL = UCI.LJII(diContainer, InterfaceC162426Za.class, null);
        this.LJLLLLLL = UCI.LJII(diContainer, InterfaceC147865rC.class, null);
        this.LJLZ = UCI.LJII(diContainer, InterfaceC145405nE.class, null);
        this.LJZ = UCI.LJII(diContainer, InterfaceC149715uB.class, null);
        this.LL = UCI.LJII(diContainer, C5L0.class, null);
        this.LLD = new XZN() { // from class: X.5n2
            @Override // X.XZN
            public final void R9() {
            }

            @Override // X.XZN
            public final void W9() {
            }

            @Override // X.XZN
            public final void X9(boolean z) {
            }

            @Override // X.XZN
            public final void ca() {
            }

            @Override // X.XZN
            public final void da() {
            }

            @Override // X.XZN
            public final boolean LIZIZ() {
                VideoPublishEditModel LLJJ = C145275n1.this.LLJJ();
                o.LJIIIZ(LLJJ, "<this>");
                return H7R.LJJJJL(LLJJ);
            }

            @Override // X.XZN
            public final MusicModel LIZJ() {
                return C145275n1.this.LLJJI().LIZJ();
            }

            @Override // X.XZN
            public final boolean LIZLLL() {
                return C44384HbQ.LJJIIZ(C145275n1.this.LLJJ());
            }

            @Override // X.XZN
            public final void N9() {
                C145275n1 c145275n1 = C145275n1.this;
                InterfaceC149715uB interfaceC149715uB = (InterfaceC149715uB) c145275n1.LJZ.LIZ(c145275n1, C145275n1.LLF[11]);
                if (interfaceC149715uB != null) {
                    interfaceC149715uB.N9();
                }
            }

            @Override // X.XZN
            public final void Q9() {
                InterfaceC153045zY value = C145275n1.this.getEditPreviewApi().Kh().getValue();
                if (value != null) {
                    C122034qd LJJI = C17N.LJJI(value);
                    if (LJJI != null) {
                        C123454sv.LIZ(LJJI.LJIIJ);
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
            }

            @Override // X.XZN
            public final void S9() {
                C145275n1 c145275n1 = C145275n1.this;
                c145275n1.LJLJJL = true;
                c145275n1.LLJILJILJ().hide();
            }

            @Override // X.XZN
            public final void Y9() {
                C145275n1 c145275n1 = C145275n1.this;
                boolean z = false;
                if (c145275n1.LJLJI) {
                    c145275n1.LJLJI = false;
                    c145275n1.LLJILJIL().hZ(true);
                    C145275n1.this.LLJILJIL().C3(false);
                    C145275n1 c145275n12 = C145275n1.this;
                    String str = c145275n12.LJLJJI;
                    if (str != null) {
                        c145275n12.LLJILJIL().Dl(str);
                    }
                    C145275n1.this.LLJILJIL().show();
                } else if (c145275n1.LJLJJL) {
                    c145275n1.LJLJJL = false;
                    C5XM editVolumeV2Api = c145275n1.getEditVolumeV2Api();
                    if (editVolumeV2Api != null) {
                        editVolumeV2Api.show();
                    }
                } else if (!c145275n1.LLJJ().creativeModel.postPageModel.isEnterFromEPDirectly) {
                    C145275n1.this.getEditPreviewApi().U2(true, false, true);
                }
                C145275n1.this.getClass();
                Long l = null;
                if (C146535p3.LIZJ(-1)) {
                    C145275n1 c145275n13 = C145275n1.this;
                    InterfaceC145405nE interfaceC145405nE = (InterfaceC145405nE) c145275n13.LJLZ.LIZ(c145275n13, C145275n1.LLF[10]);
                    if (interfaceC145405nE != null) {
                        interfaceC145405nE.I30(null);
                    }
                }
                C145275n1 c145275n14 = C145275n1.this;
                C82631Wbr c82631Wbr = c145275n14.LJLLI;
                InterfaceC74236TBo<?>[] interfaceC74236TBoArr = C145275n1.LLF;
                InterfaceC145315n5 interfaceC145315n5 = (InterfaceC145315n5) c82631Wbr.LIZ(c145275n14, interfaceC74236TBoArr[5]);
                if (interfaceC145315n5 != null) {
                    if (C145275n1.this.LLJJ().creativeModel.musicBuzModel.music != null) {
                        z = true;
                    }
                    interfaceC145315n5.Im(z);
                }
                AVMusic extractAVMusic = MusicBeanUtilKt.extractAVMusic(C145275n1.this.LLJJ().creativeModel.musicBuzModel);
                if (extractAVMusic != null) {
                    if (true ^ o.LJ(extractAVMusic.getMusicId(), C145275n1.this.LJLJJLL)) {
                        C145275n1 c145275n15 = C145275n1.this;
                        C5L0 c5l0 = (C5L0) c145275n15.LL.LIZ(c145275n15, interfaceC74236TBoArr[12]);
                        if (c5l0 != null) {
                            MusicModel LJJIJIL = C78915Uy7.LJJIJIL(extractAVMusic);
                            String musicOriginWithCheck = c145275n15.LLJJ().getMusicOriginWithCheck();
                            o.LJIIIIZZ(musicOriginWithCheck, "mModel.musicOriginWithCheck");
                            c5l0.Lp(LJJIJIL, musicOriginWithCheck);
                        }
                    }
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("panelHide: music: ");
                MusicObject musicObject = C145275n1.this.LLJJ().creativeModel.musicBuzModel.music;
                if (musicObject != null) {
                    l = Long.valueOf(musicObject.id);
                }
                LIZ.append(l);
                X1D.LIZIZ(LIZ);
                if (C145275n1.this.LLJJ().creativeModel.postPageModel.isEnterFromEPDirectly) {
                    C145275n1 c145275n16 = C145275n1.this;
                    InterfaceC136115Vv interfaceC136115Vv = (InterfaceC136115Vv) c145275n16.LJLJLJ.LIZ(c145275n16, interfaceC74236TBoArr[2]);
                    if (interfaceC136115Vv != null) {
                        interfaceC136115Vv.mt0();
                    }
                }
            }

            @Override // X.XZN
            public final void aa() {
                C145275n1.this.LLJILJILJ().hide();
                C145275n1.this.getEditPreviewApi().DM().setValue(C5MM.LIZJ());
                C145275n1.this.LLJJI().r3();
                H8F.LJIJ(C145275n1.this.LLJJ(), false);
            }

            @Override // X.XZN
            public final void O9(String str) {
                MutableLiveData<Boolean> A10;
                C145275n1 c145275n1 = C145275n1.this;
                c145275n1.LJLJI = true;
                c145275n1.LJLJJI = str;
                c145275n1.LLJILJILJ().hide();
                C145275n1 c145275n12 = C145275n1.this;
                InterfaceC140385f8 interfaceC140385f8 = (InterfaceC140385f8) c145275n12.LJLLLLLL.LIZ(c145275n12, C145275n1.LLF[9]);
                if (interfaceC140385f8 == null || (A10 = interfaceC140385f8.A10()) == null) {
                    return;
                }
                A10.setValue(Boolean.FALSE);
            }

            @Override // X.XZN
            public final void T9(C149795uJ c149795uJ) {
                if (C145275n1.this.LLJJ().veAudioRecorderParam == null) {
                    C145275n1.this.LLJJ().veAudioRecorderParam = new AudioRecorderParam();
                }
                C145275n1.this.LLJJ().veAudioRecorderParam.setHasOriginalSound(c149795uJ.LIZ);
                C145275n1.this.LLJJ().veAudioRecorderParam.setNeedOriginalSound(c149795uJ.LIZIZ);
            }

            @Override // X.XZN
            public final void V9(boolean z) {
                FlowDataMusicInfo flowDataMusicInfo = C145275n1.this.LLJJ().creativeFlowData.getFlowDataMusicInfo();
                if (flowDataMusicInfo != null) {
                    flowDataMusicInfo.setSelectedByAuto(z);
                } else {
                    C145275n1.this.LLJJ().creativeFlowData.setFlowDataMusicInfo(new FlowDataMusicInfo(z));
                }
            }

            @Override // X.XZN
            public final void Z9(float f) {
                boolean z;
                C145275n1.this.getClass();
                C5XM editVolumeV2Api = C145275n1.this.getEditVolumeV2Api();
                if (editVolumeV2Api != null) {
                    if (f == 0.0f) {
                        z = true;
                    } else {
                        z = false;
                    }
                    editVolumeV2Api.RU(!z);
                }
            }

            @Override // X.XZN
            public final void ba(AVMusic aVMusic, AqS57S1200000_2 aqS57S1200000_2) {
                if (e1.LIZ(31744, "optimize_music_sync_dialog", true, false)) {
                    C145275n1.this.LLJJI().V7(aVMusic, aqS57S1200000_2);
                } else {
                    aqS57S1200000_2.invoke();
                }
            }

            @Override // X.XZN
            public final void U9(MusicModel musicModel, boolean z, String currentTab, long j) {
                String str;
                o.LJIIIZ(currentTab, "currentTab");
                if (musicModel != null) {
                    VideoPublishEditModel model = C145275n1.this.LLJJ();
                    long currentTimeMillis = System.currentTimeMillis() - j;
                    o.LJIIIZ(model, "model");
                    C145995oB c145995oB = new C145995oB();
                    c145995oB.LJI("content_source", H7R.LJIIIIZZ(model));
                    c145995oB.LJI("content_type", H7R.LJIIIZ(model));
                    c145995oB.LJI("shoot_way", model.mShootWay);
                    c145995oB.LJI("creation_id", model.getCreationId());
                    c145995oB.LJI("music_id", model.getMusicId());
                    if (z) {
                        str = "auto";
                    } else {
                        str = "manual";
                    }
                    c145995oB.LJI("music_selected_method", str);
                    c145995oB.LJI("tab_name", currentTab);
                    c145995oB.LIZ(0, "status");
                    c145995oB.LIZIZ(currentTimeMillis, "duration");
                    FMX.LJIIL("ai_recommend_panel_music_play_duration", c145995oB.LIZ);
                }
            }

            /* JADX WARN: Code restructure failed: missing block: B:4:0x0021, code lost:
            
                if (r11 > 0) goto L6;
             */
            @Override // X.XZN
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void P9(java.lang.String r16, com.ss.android.ugc.aweme.shortvideo.AVMusic r17, boolean r18, boolean r19, boolean r20, boolean r21, java.lang.String r22, java.lang.String r23) {
                /*
                    r15 = this;
                    java.lang.String r0 = "currentTab"
                    r1 = r22
                    kotlin.jvm.internal.o.LJIIIZ(r1, r0)
                    X.5n1 r0 = X.C145275n1.this
                    com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r0.LLJJ()
                    boolean r0 = r0.isCurrentAutoCutMode()
                    if (r0 == 0) goto L7d
                    X.5n1 r0 = X.C145275n1.this
                    X.5kP r0 = r0.getEditPreviewApi()
                    long r11 = X.C45087Hml.LJIIJJI(r0)
                    r2 = 0
                    int r0 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
                    if (r0 <= 0) goto L7d
                L23:
                    X.5n1 r0 = X.C145275n1.this
                    com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r0.LLJJ()
                    com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r0.creativeModel
                    com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel r0 = r0.musicBuzModel
                    r0.musicSelectTab = r1
                    r2 = r23
                    r0.musicRecTypeRecent = r2
                    X.5n1 r0 = X.C145275n1.this
                    X.5nN r2 = r0.LLJJI()
                    r6 = 0
                    r9 = 0
                    java.lang.String r0 = "recent"
                    boolean r13 = kotlin.jvm.internal.o.LJ(r1, r0)
                    r14 = 616(0x268, float:8.63E-43)
                    r4 = r17
                    r3 = r16
                    r5 = r18
                    r7 = r19
                    r8 = r6
                    X.C145505nO.LIZ(r2, r3, r4, r5, r6, r7, r8, r9, r11, r13, r14)
                    r2 = 31744(0x7c00, float:4.4483E-41)
                    java.lang.String r1 = "av_mute_sound_with_music"
                    r0 = 1
                    int r1 = X.C00F.LIZ(r2, r6, r1, r0)
                    r0 = 2
                    if (r1 != r0) goto L7c
                    if (r21 == 0) goto L7c
                    X.5n1 r0 = X.C145275n1.this
                    com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r0.LLJJ()
                    java.lang.String r1 = X.H7R.LJIIIIZZ(r0)
                    java.lang.String r0 = "upload"
                    boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
                    if (r0 == 0) goto L7c
                    X.5n1 r0 = X.C145275n1.this
                    X.5XM r1 = r0.getEditVolumeV2Api()
                    if (r1 == 0) goto L7c
                    r0 = 0
                    r1.vt0(r0)
                L7c:
                    return
                L7d:
                    r11 = -1
                    goto L23
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C145285n2.P9(java.lang.String, com.ss.android.ugc.aweme.shortvideo.AVMusic, boolean, boolean, boolean, boolean, java.lang.String, java.lang.String):void");
            }
        };
    }

    @Override // X.InterfaceC73150SnK
    public final <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C73297Sph.LJIIZILJ(vm1, interfaceC88472Yns);
    }

    @Override // X.WM7
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View LIZJ = C6D8.LIZJ(layoutInflater, "inflater", viewGroup, "container", layoutInflater, R.layout.cci, viewGroup, false, "null cannot be cast to non-null type android.widget.FrameLayout");
        LIZJ.findViewById(R.id.j_u);
        return LIZJ;
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
