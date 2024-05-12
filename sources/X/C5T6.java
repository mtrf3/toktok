package X;

import Y.ACallableS105S0100000_2;
import Y.ARunnableS21S0200000_2;
import android.graphics.Rect;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.audiorecord.Point;
import com.ss.android.ugc.aweme.creative.model.VoiceConversionModel;
import com.ss.android.ugc.aweme.services.edit.IEditVideoInfoService;
import com.ss.android.ugc.aweme.services.edit.VideoInfoData;
import com.ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editor.EditVideoInfoServiceImpl;
import com.ss.android.vesdk.VEException;
import defpackage.t1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5T6, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5T6 extends AbstractC29891Fh<InterfaceC135455Th> implements InterfaceC135455Th, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJZ;
    public final C82622Wbi LJLIL;
    public boolean LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJI;
    public final InterfaceC135455Th LJLJJL;
    public final InterfaceC115514g7 LJLJJLL;
    public final C5H3 LJLJL;
    public final InterfaceC115514g7 LJLJLJ;
    public final InterfaceC115514g7 LJLJLLL;
    public final InterfaceC115514g7 LJLL;
    public final InterfaceC115514g7 LJLLI;
    public final InterfaceC115514g7 LJLLILLLL;
    public C5T9 LJLLJ;
    public AudioRecorderParam LJLLL;
    public C5T7 LJLLLL;
    public AudioRecorderParam LJLLLLLL;
    public final C5H3 LJLZ;

    static {
        TBT tbt = new TBT(C5T6.class, "mVideoPublishEditModel", "getMVideoPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJZ = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C5T6.class, "editVolumeV2Api", "getEditVolumeV2Api()Lcom/ss/android/ugc/gamora/editor/volume/EditVolumeV2Api;", 0, c65351Pkp), C61845OOz.LIZJ(C5T6.class, "musicController", "getMusicController()Lcom/ss/android/ugc/gamora/editor/IEditMusicController;", 0, c65351Pkp), C61845OOz.LIZJ(C5T6.class, "editSubtitleApi", "getEditSubtitleApi()Lcom/ss/android/ugc/gamora/editor/subtitle/EditSubtitleApi;", 0, c65351Pkp), C61845OOz.LIZJ(C5T6.class, "editLoudnessApi", "getEditLoudnessApi()Lcom/ss/android/ugc/gamora/editor/loudness/EditLoudnessApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C5T6.class, "editAudioMetricsApi", "getEditAudioMetricsApi()Lcom/ss/android/ugc/gamora/editor/audiometrics/EditAudioMetricsApiComponent;", 0, c65351Pkp)};
    }

    private final void LJJLI() {
        C5T7 c5t7 = this.LJLLLL;
        if (c5t7 != null && !c5t7.LIZIZ) {
            c5t7.LIZIZ = true;
            c5t7.LIZJ.destory();
        }
        this.LJLLLL = null;
    }

    private final C5TG LJJLIIIJLLLLLLLZ() {
        return (C5TG) this.LJLLILLLL.LIZ(this, LJZ[5]);
    }

    private final C5TD LJJLIIJ() {
        return (C5TD) this.LJLLI.LIZ(this, LJZ[4]);
    }

    private final InterfaceC143855kj LJJLJ() {
        return (InterfaceC143855kj) this.LJLL.LIZ(this, LJZ[3]);
    }

    private final C5XM LJJLJLI() {
        return (C5XM) this.LJLJLJ.LIZ(this, LJZ[1]);
    }

    private final C145995oB LJJLL() {
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("content_source", H8F.LJI(LJJZZI()));
        c145995oB.LJI("enter_from", "video_edit_page");
        c145995oB.LJI("shoot_way", LJJZZI().mShootWay);
        c145995oB.LJI("creation_id", LJJZZI().getCreationId());
        c145995oB.LJI("content_type", "video");
        return c145995oB;
    }

    private final boolean LJLIIL() {
        Stack<Point> stack;
        AudioRecorderParam audioRecorderParam = this.LJLLL;
        C5T9 c5t9 = this.LJLLJ;
        if (c5t9 != null) {
            stack = c5t9.LIZJ();
        } else {
            stack = new Stack<>();
        }
        audioRecorderParam.setMStack(stack);
        return !this.LJLLL.getMStack().isEmpty();
    }

    @Override // X.InterfaceC135455Th
    public AudioRecorderParam Ar0() {
        this.LJLLL = new AudioRecorderParam();
        this.LJLLLLLL = new AudioRecorderParam();
        if (LJJZZI().veAudioRecorderParam == null) {
            this.LJLLL.setHasOriginalSound(C5TI.LIZ(LJJZZI()));
            this.LJLLL.setNeedOriginalSound(C5TI.LIZIZ(LJJLJLI(), LJJZZI()));
        } else {
            this.LJLLL.copyFrom(LJJZZI().veAudioRecorderParam);
        }
        if (this.LJLLL.getNeedOriginalSound()) {
            this.LJLLL.setVoiceVolume(LJJZZI().voiceVolume);
        }
        return this.LJLLL;
    }

    @Override // X.InterfaceC135455Th
    public void Jb0() {
        String str;
        C122034qd LJJI;
        InterfaceC123794tT LJFF;
        C122004qa c122004qa = null;
        boolean hasChange$default = AudioRecorderParam.hasChange$default(this.LJLLLLLL, this.LJLLL, false, 2, null);
        InterfaceC153045zY value = Ll0().Kh().getValue();
        if (value != null && (LJJI = C17N.LJJI(value)) != null && (LJFF = LJJI.LJFF()) != null) {
            c122004qa = LJFF.LJ(EnumC122254qz.ORIGIN_VOICE_CONVERSION);
        }
        if (!hasChange$default && c122004qa == null) {
            return;
        }
        this.LJLLLLLL.copyFrom(this.LJLLL);
        C5TD LJJLIIJ = LJJLIIJ();
        if (LJJLIIJ != null) {
            if (hasChange$default) {
                str = this.LJLLL.getAudioUrl();
            } else {
                str = "";
            }
            LJJLIIJ.fP(str, this.LJLLL.getAudioRecordIndex(), Ll0().Kh().getValue());
        }
    }

    public final String LJJLIIIJJIZ() {
        return (String) this.LJLZ.getValue();
    }

    public final VideoPublishEditModel LJJZZI() {
        return (VideoPublishEditModel) this.LJLJJLL.LIZ(this, LJZ[0]);
    }

    public final InterfaceC145495nN LJJZZIII() {
        return (InterfaceC145495nN) this.LJLJLLL.LIZ(this, LJZ[2]);
    }

    @Override // X.InterfaceC135455Th
    public InterfaceC142545ic Ll0() {
        return (InterfaceC142545ic) this.LJLJL.getValue();
    }

    @Override // X.InterfaceC135455Th
    public boolean p4() {
        return this.LJLLL.hasChange(LJJZZI().veAudioRecorderParam, C5TI.LIZIZ(LJJLJLI(), LJJZZI()));
    }

    private final void LJJLIIIIJ() {
        InterfaceC153045zY value = Ll0().Kh().getValue();
        if (value == null) {
            return;
        }
        C122034qd LJJI = C17N.LJJI(value);
        if (LJJI != null) {
            LJJI.LJIIJ.LJFF();
            if (this.LJLLL.getNeedOriginalSound()) {
                C5XM LJJLJLI = LJJLJLI();
                if (LJJLJLI != null) {
                    LJJLJLI.vt0(LJJZZI().voiceVolume);
                }
            } else {
                C5XM LJJLJLI2 = LJJLJLI();
                if (LJJLJLI2 != null) {
                    LJJLJLI2.RU(true);
                }
                C5XM LJJLJLI3 = LJJLJLI();
                if (LJJLJLI3 != null) {
                    LJJLJLI3.vt0(0.0f);
                }
            }
            C5XM LJJLJLI4 = LJJLJLI();
            if (LJJLJLI4 != null) {
                LJJLJLI4.RU(this.LJLLL.getNeedOriginalSound());
            }
            LJJZZIII().s3(true);
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    private final void LJLJJL() {
        FMX.LJIIL("cancel_dub", LJJLL().LIZ);
    }

    private final void LJLJJLL() {
        FMX.LJIIL("delete_dub", LJJLL().LIZ);
    }

    @Override // X.InterfaceC135455Th
    public void LJJJJLI() {
        C122034qd LJJI;
        NLEEditor nLEEditor;
        if (!LJJZZI().hasRecord()) {
            return;
        }
        AudioRecorderParam audioRecorderParam = LJJZZI().veAudioRecorderParam;
        InterfaceC153045zY value = Ll0().Kh().getValue();
        if (value != null && (LJJI = C17N.LJJI(value)) != null && (nLEEditor = LJJI.LJIIJ) != null) {
            C122494rN.LIZ(nLEEditor);
        }
        LJJZZI().voiceVolume = audioRecorderParam.getVoiceVolume();
        C5XM LJJLJLI = LJJLJLI();
        if (LJJLJLI != null) {
            LJJLJLI.RU(true);
        }
        LJJZZI().veAudioRecorderParam = null;
    }

    public final void LJJLIIIJILLIZJL() {
        InterfaceC153045zY value = Ll0().Kh().getValue();
        if (value == null) {
            return;
        }
        C122034qd LJJI = C17N.LJJI(value);
        if (LJJI != null) {
            LJJI.LJIIJ.LIZJ();
        } else {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    @Override // X.InterfaceC135455Th
    public void Vc0() {
        NLEModel LJJ;
        String str;
        NLESegment LJI;
        NLEResourceNode LIZIZ;
        InterfaceC153045zY value = Ll0().Kh().getValue();
        if (value != null && (LJJ = C17N.LJJ(value)) != null) {
            AudioRecorderParam audioRecorderParam = this.LJLLL;
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            VecNLETrackSPtr tracks = LJJ.getTracks();
            ArrayList LIZ = C07080Po.LIZ(tracks, "nleModel.tracks");
            Iterator<NLETrack> it = tracks.iterator();
            while (it.hasNext()) {
                NLETrack next = it.next();
                NLETrack it2 = next;
                o.LJIIIIZZ(it2, "it");
                if (C124574uj.LJJIJIL(it2) || (it2.LJIIZILJ() == EnumC123864ta.AUDIO && o.LJ(it2.getExtra("AudioTrackType"), EnumC122254qz.DUB.name()))) {
                    LIZ.add(next);
                }
            }
            ArrayList arrayList = new ArrayList();
            Iterator it3 = LIZ.iterator();
            while (it3.hasNext()) {
                ORS.LJJLIIIJILLIZJL(((NLETrack) it3.next()).LJIILL(), arrayList);
            }
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                NLETrackSlot slot = (NLETrackSlot) it4.next();
                o.LJIIIIZZ(slot, "slot");
                String LJ = C122424rG.LJ(slot);
                if (C78685UuP.LJJJZ(LJ)) {
                    linkedHashSet.add(LJ);
                }
            }
            audioRecorderParam.setMultiTrackAudio(ORZ.LLJI(linkedHashSet));
            VoiceConversionModel voiceConversionModel = LJJZZI().creativeModel.voiceConversionModel;
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            VecNLETrackSPtr tracks2 = LJJ.getTracks();
            ArrayList LIZ2 = C07080Po.LIZ(tracks2, "nleModel.tracks");
            Iterator<NLETrack> it5 = tracks2.iterator();
            while (it5.hasNext()) {
                NLETrack next2 = it5.next();
                NLETrack it6 = next2;
                o.LJIIIIZZ(it6, "it");
                if (C124574uj.LJJIJIL(it6) || (it6.LJIIZILJ() == EnumC123864ta.AUDIO && o.LJ(it6.getExtra("AudioTrackType"), EnumC122254qz.DUB.name()))) {
                    LIZ2.add(next2);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it7 = LIZ2.iterator();
            while (it7.hasNext()) {
                ORS.LJJLIIIJILLIZJL(((NLETrack) it7.next()).LJIILL(), arrayList2);
            }
            Iterator it8 = arrayList2.iterator();
            while (it8.hasNext()) {
                NLETrackSlot slot2 = (NLETrackSlot) it8.next();
                o.LJIIIIZZ(slot2, "slot");
                if (slot2.hasExtra("extra_origin_voice_file_path") && (LJI = slot2.LJI()) != null && (LIZIZ = LJI.LIZIZ()) != null) {
                    str = LIZIZ.LIZJ();
                } else {
                    str = null;
                }
                if (C78685UuP.LJJJZ(str)) {
                    linkedHashSet2.add(str);
                }
            }
            List<String> LLJI = ORZ.LLJI(linkedHashSet2);
            voiceConversionModel.getClass();
            o.LJIIIZ(LLJI, "<set-?>");
            voiceConversionModel.vcMultiRecordPathList = LLJI;
            LJJZZI().creativeModel.voiceConversionModel.hasDubVoiceConversion = !LJJZZI().creativeModel.voiceConversionModel.vcMultiRecordPathList.isEmpty();
            VoiceConversionModel voiceConversionModel2 = LJJZZI().creativeModel.voiceConversionModel;
            List<String> LIZLLL = C122424rG.LIZLLL(LJJ);
            voiceConversionModel2.getClass();
            o.LJIIIZ(LIZLLL, "<set-?>");
            voiceConversionModel2.vcMultiOriginPathList = LIZLLL;
            LJJZZI().creativeModel.voiceConversionModel.hasOriginVoiceConversion = !LJJZZI().creativeModel.voiceConversionModel.vcMultiOriginPathList.isEmpty();
            VoiceConversionModel voiceConversionModel3 = LJJZZI().creativeModel.voiceConversionModel;
            java.util.Set<String> LLJJ = ORZ.LLJJ(C122784rq.LJIIIIZZ(LJJ));
            voiceConversionModel3.getClass();
            o.LJIIIZ(LLJJ, "<set-?>");
            voiceConversionModel3.voiceModifyIds = LLJJ;
        }
    }

    @Override // X.InterfaceC135455Th
    public boolean FS() {
        return this.LJLJJI;
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ InterfaceC135455Th getApiComponent() {
        return this.LJLJJL;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC135455Th
    public boolean isPlaying() {
        return this.LJLJI;
    }

    @Override // X.InterfaceC135455Th
    public boolean isRecording() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC135455Th
    public void p90() {
        LJJLIIIJILLIZJL();
    }

    @Override // X.InterfaceC135455Th
    public AudioRecorderParam w5() {
        return this.LJLLL;
    }

    public C5T6(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLJJL = this;
        this.LJLJJLL = UCI.LJI(getDiContainer(), VideoPublishEditModel.class, null);
        this.LJLJL = C269113v.LIZ(this, InterfaceC142545ic.class);
        this.LJLJLJ = UCI.LJII(getDiContainer(), C5XM.class, null);
        this.LJLJLLL = UCI.LJI(getDiContainer(), InterfaceC145495nN.class, null);
        this.LJLL = UCI.LJII(getDiContainer(), InterfaceC143855kj.class, null);
        this.LJLLI = UCI.LJII(getDiContainer(), C5TD.class, null);
        this.LJLLILLLL = UCI.LJII(getDiContainer(), C5TG.class, null);
        AudioRecorderParam audioRecorderParam = new AudioRecorderParam();
        audioRecorderParam.setHasOriginalSound(C5TI.LIZ(LJJZZI()));
        audioRecorderParam.setNeedOriginalSound(C5TI.LIZIZ(LJJLJLI(), LJJZZI()));
        this.LJLLL = audioRecorderParam;
        AudioRecorderParam audioRecorderParam2 = new AudioRecorderParam();
        audioRecorderParam2.setHasOriginalSound(C5TI.LIZ(LJJZZI()));
        audioRecorderParam2.setNeedOriginalSound(C5TI.LIZIZ(LJJLJLI(), LJJZZI()));
        this.LJLLLLLL = audioRecorderParam2;
        this.LJLZ = C221108m2.LIZIZ(new AqS152S0100000_2(this, 149));
    }

    private final void LJJLIIIJJI(boolean z) {
        InterfaceC153045zY value = Ll0().Kh().getValue();
        if (value == null) {
            return;
        }
        C122034qd LJJI = C17N.LJJI(value);
        if (LJJI != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("enableAddedAudio, isEnable:");
            LIZ.append(z);
            H7B.LIZIZ("EditAudioRecordScene", X1D.LIZIZ(LIZ));
            VecNLETrackSPtr tracks = LJJI.LJIIJ.LJ().getTracks();
            o.LJIIIIZZ(tracks, "editorPro.editor.model.tracks");
            ArrayList arrayList = new ArrayList();
            Iterator<NLETrack> it = tracks.iterator();
            while (it.hasNext()) {
                NLETrack next = it.next();
                NLETrack it2 = next;
                o.LJIIIIZZ(it2, "it");
                if (C124574uj.LJJJJZ(it2) || C124574uj.LJJJJLL(it2)) {
                    arrayList.add(next);
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                ((NLENode) it3.next()).setEnable(z);
            }
            LJJI.LJIIJ.LIZIZ();
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    private final void LJLJLJ(boolean z) {
        float f;
        C145995oB LJJLL = LJJLL();
        LJJLL.LIZ(z ? 1 : 0, "original_sound");
        FMX.LJIIL("save_dub", LJJLL.LIZ);
        VideoInfoData videoInfoData = EditVideoInfoServiceImpl.LIZ().getVideoInfoData(LJJZZI().getCreationId());
        if (videoInfoData == null || videoInfoData.getRusumeVolumeRecord() != 0.0f || this.LJLLL.getMStack().isEmpty()) {
            return;
        }
        IEditVideoInfoService LIZ = EditVideoInfoServiceImpl.LIZ();
        String creationId = LJJZZI().getCreationId();
        float rusumeVolumeRecord = videoInfoData.getRusumeVolumeRecord();
        float rusumeVolumeMusic = videoInfoData.getRusumeVolumeMusic();
        AudioRecorderParam audioRecorderParam = LJJZZI().veAudioRecorderParam;
        if (audioRecorderParam != null) {
            f = audioRecorderParam.getRecordVolume();
        } else {
            f = 1.0f;
        }
        LIZ.setVideoInfoData(creationId, new VideoInfoData(rusumeVolumeRecord, rusumeVolumeMusic, f));
    }

    private final void LJLLILLLL(boolean z) {
        Stack<Point> stack;
        AudioRecorderParam audioRecorderParam = this.LJLLL;
        C5T9 c5t9 = this.LJLLJ;
        if (c5t9 != null) {
            stack = c5t9.LIZJ();
        } else {
            stack = new Stack<>();
        }
        audioRecorderParam.setMStack(stack);
        this.LJLLL.setNeedOriginalSound(z);
    }

    @Override // X.InterfaceC135455Th
    public void F90(InterfaceC63875P5b listener) {
        o.LJIIIZ(listener, "listener");
        C5T7 c5t7 = this.LJLLLL;
        if (c5t7 != null) {
            c5t7.LIZJ.setRecorderListener(listener);
        }
    }

    public final void LJLLL(String str) {
        NLEModel nLEModel;
        this.LJLLL.setAudioUrl(str);
        LJJZZI().veAudioRecorderParam.copyFrom(this.LJLLL);
        VoiceConversionModel voiceConversionModel = LJJZZI().creativeModel.voiceConversionModel;
        voiceConversionModel.getClass();
        o.LJIIIZ(str, "<set-?>");
        voiceConversionModel.originalRecordPath = str;
        InterfaceC143855kj LJJLJ = LJJLJ();
        if (LJJLJ != null && C5TH.LIZ(LJJZZI()) && LJJLJ.Xg()) {
            LJJLJ.LE();
            InterfaceC153045zY value = Ll0().Kh().getValue();
            if (value != null) {
                nLEModel = C17N.LJJ(value);
            } else {
                nLEModel = null;
            }
            LJJLJ.Jp(nLEModel);
        }
        Jb0();
        C5TG LJJLIIIJLLLLLLLZ = LJJLIIIJLLLLLLLZ();
        if (LJJLIIIJLLLLLLLZ != null) {
            LJJLIIIJLLLLLLLZ.bO();
        }
    }

    @Override // X.InterfaceC135455Th
    public void Vq(InterfaceC65784Pro<C76800UCe> updateUI) {
        o.LJIIIZ(updateUI, "updateUI");
        updateUI.invoke();
        p0(true);
        C5T9 c5t9 = this.LJLLJ;
        if (c5t9 != null) {
            c5t9.LJI();
        }
        Jb0();
    }

    @Override // X.InterfaceC135455Th
    public void Z3(C5F9 callback) {
        o.LJIIIZ(callback, "callback");
        callback.LIZIZ();
        LJJLI();
        LJJLIIIIJ();
        callback.LIZ();
    }

    @Override // X.InterfaceC135455Th
    public void dT(boolean z) {
        this.LJLJJI = z;
    }

    @Override // X.InterfaceC135455Th
    public void hu(String method) {
        o.LJIIIZ(method, "method");
        C145995oB LJJLL = LJJLL();
        LJJLL.getClass();
        LJJLL.LJI("enter_method", method);
        FMX.LJIIL("record_dub_start", LJJLL.LIZ);
    }

    @Override // X.InterfaceC135455Th
    public void jY(String method) {
        o.LJIIIZ(method, "method");
        C145995oB LJJLL = LJJLL();
        LJJLL.getClass();
        LJJLL.LJI("enter_method", method);
        FMX.LJIIL("record_dub_end", LJJLL.LIZ);
    }

    @Override // X.InterfaceC135455Th
    public void km(C5F9 callback) {
        C122034qd LJJI;
        NLEEditor nLEEditor;
        Object obj;
        NLESegmentAudio nLESegmentAudio;
        o.LJIIIZ(callback, "callback");
        LJJZZIII().s3(false);
        InterfaceC153045zY value = Ll0().Kh().getValue();
        if (value != null && (LJJI = C17N.LJJI(value)) != null && (nLEEditor = LJJI.LJIIJ) != null) {
            VideoPublishEditModel editModel = LJJZZI();
            o.LJIIIZ(editModel, "editModel");
            AudioRecorderParam audioRecorderParam = editModel.veAudioRecorderParam;
            if (audioRecorderParam != null && !audioRecorderParam.getMStack().isEmpty()) {
                NLEModel LJ = nLEEditor.LJ();
                Iterator LIZJ = t1.LIZJ(LJ, "nleModel.tracks");
                while (true) {
                    if (LIZJ.hasNext()) {
                        obj = LIZJ.next();
                        if (o.LJ(((NLENode) obj).getExtra("AudioTrackType"), EnumC122254qz.DUB.name())) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                NLETrack nLETrack = (NLETrack) obj;
                if (nLETrack != null) {
                    NLEModel LJ2 = nLEEditor.LJ();
                    ArrayList arrayList = new ArrayList();
                    VecNLETrackSPtr tracks = LJ2.getTracks();
                    ArrayList LIZ = C07080Po.LIZ(tracks, "nleModel.tracks");
                    Iterator<NLETrack> it = tracks.iterator();
                    while (it.hasNext()) {
                        NLETrack next = it.next();
                        if (o.LJ(next.getExtra("AudioTrackType"), EnumC122254qz.AUDIO_RECORD.name())) {
                            LIZ.add(next);
                        }
                    }
                    Iterator it2 = LIZ.iterator();
                    while (it2.hasNext()) {
                        Iterator<NLETrackSlot> it3 = ((NLETrack) it2.next()).LJIILL().iterator();
                        while (it3.hasNext()) {
                            NLETrackSlot slot = it3.next();
                            o.LJIIIIZZ(slot, "slot");
                            arrayList.add(slot);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        if (nLETrack.LJIILL().size() != editModel.veAudioRecorderParam.getMStack().size()) {
                            C56R c56r = new C56R(editModel);
                            C122494rN.LIZ(nLEEditor);
                            int i = 0;
                            for (Object obj2 : editModel.veAudioRecorderParam.getMStack()) {
                                int i2 = i + 1;
                                if (i >= 0) {
                                    Point point = (Point) obj2;
                                    String audioUrl = editModel.veAudioRecorderParam.getAudioUrl();
                                    o.LJIIIIZZ(point, "point");
                                    String LIZJ2 = C56J.LIZJ(audioUrl, point, c56r);
                                    if (LIZJ2.length() != 0) {
                                        C122494rN.LIZIZ(LJ).LIZIZ(C56J.LIZ(new C5D4(point, LIZJ2), i));
                                    }
                                    i = i2;
                                } else {
                                    C47261Igj.LJJJJJ();
                                    throw null;
                                }
                            }
                            nLEEditor.LIZIZ();
                        }
                    } else {
                        C122494rN.LIZ(nLEEditor);
                        NLETrack LIZIZ = C122494rN.LIZIZ(LJ2);
                        Iterator it4 = arrayList.iterator();
                        while (it4.hasNext()) {
                            NLETrackSlot nLETrackSlot = (NLETrackSlot) it4.next();
                            NLESegment LJI = nLETrackSlot.LJI();
                            if ((LJI instanceof NLESegmentAudio) && (nLESegmentAudio = (NLESegmentAudio) LJI) != null) {
                                nLESegmentAudio.LJIJI(true);
                            }
                            LIZIZ.LIZIZ(NLETrackSlot.LIZ(nLETrackSlot.deepClone(true)));
                        }
                        nLEEditor.LIZIZ();
                    }
                }
            }
        }
        this.LJLLLL = new C5T7();
        C10K.LIZIZ(new ACallableS105S0100000_2(new ARunnableS21S0200000_2(this, callback, 10), 11), C38995FSd.LIZLLL(), null);
    }

    @Override // X.InterfaceC135455Th
    public void p0(boolean z) {
        this.LJLJI = z;
    }

    @Override // X.InterfaceC135455Th
    public void rr0(C5T9 editProgressHelper) {
        o.LJIIIZ(editProgressHelper, "editProgressHelper");
        this.LJLLJ = editProgressHelper;
    }

    @Override // X.InterfaceC135455Th
    public void s(C5F9 callback) {
        o.LJIIIZ(callback, "callback");
        callback.LIZIZ();
        AudioRecorderParam audioRecorderParam = LJJZZI().veAudioRecorderParam;
        boolean needOriginalSound = this.LJLLL.getNeedOriginalSound();
        if (audioRecorderParam == null) {
            this.LJLLL = new AudioRecorderParam();
        } else {
            this.LJLLL.copyFrom(audioRecorderParam);
        }
        this.LJLLL.setNeedOriginalSound(needOriginalSound);
        LJJLI();
        LJJLIIIIJ();
        callback.LIZ();
    }

    @Override // X.InterfaceC135455Th
    public void tj(boolean z) {
        this.LJLILLLLZI = z;
    }

    @Override // X.InterfaceC135455Th
    public void xA(AudioRecorderParam param) {
        o.LJIIIZ(param, "param");
        AudioRecorderParam audioRecorderParam = this.LJLLL;
        boolean LIZIZ = C5TI.LIZIZ(LJJLJLI(), LJJZZI());
        o.LJIIIZ(audioRecorderParam, "<this>");
        if (!o.LJ(audioRecorderParam.getAudioUrl(), param.getAudioUrl()) || audioRecorderParam.getNeedDel() != param.getNeedDel() || audioRecorderParam.getRecordVolume() != param.getRecordVolume() || audioRecorderParam.hasChange(param, LIZIZ)) {
            this.LJLLL.copyFrom(param);
        }
    }

    @Override // X.InterfaceC135455Th
    public void Eq(Cert cert, InterfaceC65784Pro<C76800UCe> updateUI) {
        Integer num;
        int i;
        InterfaceC153045zY interfaceC153045zY;
        o.LJIIIZ(updateUI, "updateUI");
        InterfaceC153045zY value = Ll0().Kh().getValue();
        if (value == null) {
            return;
        }
        updateUI.invoke();
        C5XM LJJLJLI = LJJLJLI();
        int i2 = 0;
        if (LJJLJLI != null) {
            LJJLJLI.DE(false);
        }
        LJJLIIIJJI(false);
        C5T9 c5t9 = this.LJLLJ;
        if (c5t9 != null && (interfaceC153045zY = c5t9.LIZLLL) != null && c5t9.LJIIIZ != null) {
            if (c5t9.LJII != null) {
                c5t9.LJFF.setValue(C5MM.LIZLLL(r0.getY()));
                C5T8 c5t8 = c5t9.LJIIIZ;
                o.LJI(c5t8);
                Point point = c5t9.LJII;
                o.LJI(point);
                c5t9.LJII = c5t8.LIZLLL(point.getY());
            } else {
                int LJZL = interfaceC153045zY.LJZL();
                if (LJZL >= 50) {
                    i2 = LJZL;
                }
                C5T8 c5t82 = c5t9.LJIIIZ;
                o.LJI(c5t82);
                c5t9.LJII = c5t82.LIZLLL(i2);
            }
        }
        tj(true);
        C5T7 c5t7 = this.LJLLLL;
        if (c5t7 != null) {
            num = Integer.valueOf(c5t7.LIZIZ(value.LJZL(), value.getDuration(), cert));
        } else {
            num = null;
        }
        C5T9 c5t92 = this.LJLLJ;
        if (c5t92 != null) {
            c5t92.LJI();
        }
        String creationId = LJJZZI().getCreationId();
        o.LJIIIIZZ(creationId, "mVideoPublishEditModel.creationId");
        C6YR.LIZIZ(creationId);
        if (num == null || num.intValue() != 0) {
            String creationId2 = LJJZZI().getCreationId();
            o.LJIIIIZZ(creationId2, "mVideoPublishEditModel.creationId");
            if (num != null) {
                i = num.intValue();
            } else {
                i = Integer.MAX_VALUE;
            }
            C6YR.LIZJ(i, creationId2, "");
            return;
        }
        String creationId3 = LJJZZI().getCreationId();
        o.LJIIIIZZ(creationId3, "mVideoPublishEditModel.creationId");
        C6YR.LIZLLL(creationId3);
    }

    @Override // X.InterfaceC135455Th
    public void G4(float f, float f2) {
        if (LJJZZI().isStitchMode()) {
            if (LJJZZI().isMuted) {
                InterfaceC142545ic Ll0 = Ll0();
                VEVolumeChangeOp ofVoice = VEVolumeChangeOp.ofVoice(0.0f);
                o.LJIIIIZZ(ofVoice, "ofVoice(0f)");
                Ll0.Dl0(ofVoice);
                InterfaceC142545ic Ll02 = Ll0();
                VEVolumeChangeOp ofMusic = VEVolumeChangeOp.ofMusic(f);
                o.LJIIIIZZ(ofMusic, "ofMusic(musicRatio)");
                Ll02.Dl0(ofMusic);
                return;
            }
            InterfaceC142545ic Ll03 = Ll0();
            VEVolumeChangeOp ofVoice2 = VEVolumeChangeOp.ofVoice(f2);
            o.LJIIIIZZ(ofVoice2, "ofVoice(voiceRatio)");
            Ll03.Dl0(ofVoice2);
            InterfaceC142545ic Ll04 = Ll0();
            VEVolumeChangeOp ofMusic2 = VEVolumeChangeOp.ofMusic(f);
            o.LJIIIIZZ(ofMusic2, "ofMusic(musicRatio)");
            Ll04.Dl0(ofMusic2);
            return;
        }
        if ((!LJJZZI().isFastImport && !LJJZZI().hasOriginalSound()) || LJJZZI().isMuted) {
            if (f == -1.0f) {
                return;
            }
            InterfaceC142545ic Ll05 = Ll0();
            VEVolumeChangeOp ofMusic3 = VEVolumeChangeOp.ofMusic(f);
            o.LJIIIIZZ(ofMusic3, "ofMusic(musicRatio)");
            Ll05.Dl0(ofMusic3);
            return;
        }
        if (f2 != -1.0f) {
            InterfaceC142545ic Ll06 = Ll0();
            VEVolumeChangeOp ofVoice3 = VEVolumeChangeOp.ofVoice(f2);
            o.LJIIIIZZ(ofVoice3, "ofVoice(voiceRatio)");
            Ll06.Dl0(ofVoice3);
        }
        if (LJJZZI().getMMusicPath() == null || f == -1.0f) {
            return;
        }
        InterfaceC142545ic Ll07 = Ll0();
        VEVolumeChangeOp ofMusic4 = VEVolumeChangeOp.ofMusic(f);
        o.LJIIIIZZ(ofMusic4, "ofMusic(musicRatio)");
        Ll07.Dl0(ofMusic4);
    }

    @Override // X.InterfaceC135455Th
    public void EU(InterfaceC65784Pro<C76800UCe> updateUIBeforePause, InterfaceC88472Yns<? super Boolean, C76800UCe> updateUIAfterPause, Cert cert) {
        Rect rect;
        Point point;
        Stack<Point> stack;
        InterfaceC153045zY value;
        C122034qd LJJI;
        NLEEditor nLEEditor;
        C122034qd LJJI2;
        NLEEditor nLEEditor2;
        Object obj;
        VecNLETrackSlotSPtr LJIILL;
        C5T8 c5t8;
        o.LJIIIZ(updateUIBeforePause, "updateUIBeforePause");
        o.LJIIIZ(updateUIAfterPause, "updateUIAfterPause");
        InterfaceC153045zY value2 = Ll0().Kh().getValue();
        if (value2 != null) {
            rect = value2.t5();
        } else {
            rect = null;
        }
        if (isRecording() || isPlaying()) {
            C5TC.LIZ(this, cert, updateUIBeforePause, updateUIAfterPause);
        }
        LJLJJLL();
        C5T9 c5t9 = this.LJLLJ;
        if (c5t9 == null || (c5t8 = c5t9.LJIIIZ) == null || (point = c5t8.LIZJ()) == null) {
            point = null;
        } else {
            float x = point.getX() / c5t9.LJ;
            point.setY(point.getY() + 100);
            int y = point.getY();
            int i = c5t9.LJ;
            if (y > i) {
                point.setY(i);
            }
            c5t9.LJIIJJI.LIZ(x, true);
            C5T8 c5t82 = c5t9.LJIIIZ;
            if (c5t82 != null) {
                c5t82.LJJIIJ(x);
            }
            C5TF c5tf = c5t9.LJIIJ;
            if (c5tf != null) {
                c5tf.LJJIIJ(x);
            }
        }
        InterfaceC153045zY value3 = Ll0().Kh().getValue();
        if (value3 != null && (LJJI2 = C17N.LJJI(value3)) != null && (nLEEditor2 = LJJI2.LJIIJ) != null && point != null) {
            Iterator LIZJ = C141415gn.LIZJ(nLEEditor2, "nleEditor.model.tracks");
            while (true) {
                if (LIZJ.hasNext()) {
                    obj = LIZJ.next();
                    if (o.LJ(((NLENode) obj).getExtra("AudioTrackType"), EnumC122254qz.DUB.name())) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            NLETrack nLETrack = (NLETrack) obj;
            ArrayList arrayList = new ArrayList();
            if (nLETrack != null) {
                Iterator<NLETrackSlot> it = nLETrack.LJIILL().iterator();
                while (it.hasNext()) {
                    NLETrackSlot next = it.next();
                    if (next.getStartTime() >= point.getX() * 1000 && next.getEndTime() <= point.getY() * 1000) {
                        arrayList.add(next);
                    }
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                NLETrackSlot nLETrackSlot = (NLETrackSlot) it2.next();
                if (nLETrack != null) {
                    nLETrack.LJIJJLI(nLETrackSlot);
                }
            }
            if (nLETrack == null || (LJIILL = nLETrack.LJIILL()) == null || LJIILL.isEmpty()) {
                nLEEditor2.LJ().removeTrack(nLETrack);
            }
            nLEEditor2.LIZIZ();
        }
        if (this.LJLLL.getMStack().isEmpty()) {
            this.LJLLL.setAudioRecordIndex(-1);
            InterfaceC153045zY value4 = Ll0().Kh().getValue();
            if (value4 != null && (LJJI = C17N.LJJI(value4)) != null && (nLEEditor = LJJI.LJIIJ) != null) {
                C122494rN.LIZ(nLEEditor);
            }
        }
        AudioRecorderParam audioRecorderParam = this.LJLLL;
        C5T9 c5t92 = this.LJLLJ;
        if (c5t92 != null) {
            stack = c5t92.LIZJ();
        } else {
            stack = new Stack<>();
        }
        audioRecorderParam.setMStack(stack);
        updateUIAfterPause.invoke(Boolean.valueOf(!this.LJLLL.getMStack().isEmpty()));
        if (rect != null) {
            if ((rect.left > 0 || rect.top > 0 || rect.right > 0 || rect.bottom > 0) && (value = Ll0().Kh().getValue()) != null) {
                value.LIZ(rect.left, rect.top, rect.right, rect.bottom);
            }
        }
    }

    @Override // X.InterfaceC135455Th
    public void l90(AudioRecorderParam oldParam, AudioRecorderParam newParam, C5F9 callback) {
        o.LJIIIZ(oldParam, "oldParam");
        o.LJIIIZ(newParam, "newParam");
        o.LJIIIZ(callback, "callback");
        LJJLI();
        XKX.LIZLLL(C48841JEv.LIZ(C36636EZk.LIZ), null, null, new C5F8(callback, LJLIIL(), this, oldParam, newParam, null), 3);
    }

    @Override // X.InterfaceC135455Th
    public void t7(boolean z, Cert cert, InterfaceC65784Pro<C76800UCe> updateUIBeforePause, InterfaceC88472Yns<? super Boolean, C76800UCe> updateUIAfterPause) {
        o.LJIIIZ(updateUIBeforePause, "updateUIBeforePause");
        o.LJIIIZ(updateUIAfterPause, "updateUIAfterPause");
        if (isRecording() || isPlaying()) {
            C5TC.LIZ(this, cert, updateUIBeforePause, updateUIAfterPause);
        }
        LJLJJL();
        LJLLILLLL(z);
        LJJLIIIJJI(true);
    }

    @Override // X.InterfaceC135455Th
    public void T80(boolean z, Cert cert, InterfaceC65784Pro<C76800UCe> updateUIBeforePause, InterfaceC88472Yns<? super Boolean, C76800UCe> updateUIAfterPause, InterfaceC88471Ynr<? super AudioRecorderParam, ? super AudioRecorderParam, C76800UCe> synVideoPublishModelFun) {
        o.LJIIIZ(updateUIBeforePause, "updateUIBeforePause");
        o.LJIIIZ(updateUIAfterPause, "updateUIAfterPause");
        o.LJIIIZ(synVideoPublishModelFun, "synVideoPublishModelFun");
        if (isRecording() || isPlaying()) {
            C5TC.LIZ(this, cert, updateUIBeforePause, updateUIAfterPause);
        }
        LJLLILLLL(z);
        C5XM LJJLJLI = LJJLJLI();
        if (LJJLJLI != null) {
            LJJLJLI.RU(z);
        }
        LJJLIIIJJI(true);
        if (LJJZZI().veAudioRecorderParam == null) {
            VideoPublishEditModel LJJZZI = LJJZZI();
            AudioRecorderParam audioRecorderParam = new AudioRecorderParam();
            audioRecorderParam.setNeedOriginalSound(C5TI.LIZIZ(LJJLJLI(), LJJZZI()));
            audioRecorderParam.setHasOriginalSound(C5TI.LIZ(LJJZZI()));
            LJJZZI.veAudioRecorderParam = audioRecorderParam;
            LJJZZI().creativeModel.micDataModel.editVolumeChangeMark = true;
        }
        AudioRecorderParam audioRecorderParam2 = new AudioRecorderParam();
        audioRecorderParam2.copyFrom(LJJZZI().veAudioRecorderParam);
        LJLJLJ(this.LJLLL.getNeedOriginalSound());
        synVideoPublishModelFun.invoke(audioRecorderParam2, this.LJLLL);
    }

    @Override // X.InterfaceC135455Th
    public void rg0(boolean z, int i, Cert cert, InterfaceC65784Pro<C76800UCe> updateUIBeforePause, InterfaceC88472Yns<? super Boolean, C76800UCe> updateUIAfterPause) {
        Stack<Point> stack;
        Point point;
        int i2;
        String str;
        long j;
        int i3;
        C122034qd LJJI;
        NLEEditor nLEEditor;
        float f;
        String str2;
        int i4 = i;
        o.LJIIIZ(updateUIBeforePause, "updateUIBeforePause");
        o.LJIIIZ(updateUIAfterPause, "updateUIAfterPause");
        C5T9 c5t9 = this.LJLLJ;
        if (c5t9 != null) {
            if (!z) {
                c5t9.LJFF.setValue(C5MM.LIZJ());
            }
            InterfaceC153045zY interfaceC153045zY = c5t9.LIZLLL;
            if (interfaceC153045zY != null) {
                interfaceC153045zY.LIZJ();
                c5t9.LIZIZ().setValue(Long.valueOf(interfaceC153045zY.LJZL()));
            }
        }
        updateUIBeforePause.invoke();
        if (isRecording()) {
            C5T9 c5t92 = this.LJLLJ;
            if (c5t92 != null) {
                String creationId = LJJZZI().getCreationId();
                o.LJIIIIZZ(creationId, "mVideoPublishEditModel.creationId");
                C5T7 c5t7 = this.LJLLLL;
                VideoPublishEditModel mVideoPublishEditModel = LJJZZI();
                o.LJIIIZ(mVideoPublishEditModel, "mVideoPublishEditModel");
                if (c5t7 != null) {
                    if (z) {
                        Point point2 = c5t92.LJII;
                        if (point2 != null) {
                            point2.setY(c5t92.LJ);
                        }
                        c5t7.LIZJ(cert);
                    } else {
                        c5t7.LIZJ(cert);
                        InterfaceC153045zY interfaceC153045zY2 = c5t92.LIZLLL;
                        if (interfaceC153045zY2 != null) {
                            i2 = interfaceC153045zY2.LJZL();
                        } else {
                            i2 = 0;
                        }
                        if (i4 == -1) {
                            i4 = i2;
                        }
                        Point point3 = c5t92.LJII;
                        if (point3 != null) {
                            point3.setY(i4);
                        }
                        c5t92.LJFF.setValue(C5MM.LIZLLL(i4));
                        C5T8 c5t8 = c5t92.LJIIIZ;
                        if (c5t8 != null) {
                            c5t8.LJJIIJ(i4 / c5t92.LJ);
                        }
                        C5TF c5tf = c5t92.LJIIJ;
                        if (c5tf != null) {
                            c5tf.LJJIIJ(i4 / c5t92.LJ);
                        }
                    }
                    try {
                        str = c5t7.LIZJ.getWavFilePath();
                        o.LJIIIIZZ(str, "{\n            mVEAudioRe…der.wavFilePath\n        }");
                    } catch (VEException unused) {
                        str = "";
                    }
                    Point point4 = c5t92.LJII;
                    if (point4 != null) {
                        j = point4.getX();
                    } else {
                        j = 0;
                    }
                    Point point5 = c5t92.LJII;
                    if (point5 != null) {
                        i3 = point5.getY();
                    } else {
                        i3 = c5t92.LJ;
                    }
                    long j2 = i3;
                    if (j2 > j) {
                        InterfaceC153045zY interfaceC153045zY3 = c5t92.LIZLLL;
                        if (interfaceC153045zY3 != null && (LJJI = C17N.LJJI(interfaceC153045zY3)) != null && (nLEEditor = LJJI.LJIIJ) != null) {
                            C122004qa c122004qa = new C122004qa(EnumC122254qz.DUB);
                            c122004qa.LIZ = str;
                            c122004qa.LIZJ = 0L;
                            c122004qa.LIZLLL = j2 - j;
                            c122004qa.LJ = j;
                            c122004qa.LJFF = j2;
                            AudioRecorderParam audioRecorderParam = mVideoPublishEditModel.veAudioRecorderParam;
                            if (audioRecorderParam != null) {
                                f = audioRecorderParam.getRecordVolume();
                            } else {
                                f = 1.0f;
                            }
                            c122004qa.LJI = f;
                            String str3 = c122004qa.LIZ;
                            if (str3 == null || str3.length() != 0) {
                                C56R c56r = new C56R(mVideoPublishEditModel);
                                Point point6 = new Point((int) c122004qa.LJ, (int) c122004qa.LJFF, c122004qa.LIZLLL);
                                String str4 = c122004qa.LIZ;
                                if (str4 != null) {
                                    str2 = C56J.LIZJ(str4, point6, c56r);
                                } else {
                                    str2 = null;
                                }
                                NLETrackSlot nLETrackSlot = new NLETrackSlot();
                                long j3 = c122004qa.LIZLLL;
                                NLESegmentAudio nLESegmentAudio = new NLESegmentAudio();
                                NLEResourceAV nLEResourceAV = new NLEResourceAV();
                                nLEResourceAV.LJIIJJI("Record");
                                nLEResourceAV.LJIILIIL(EnumC123874tb.RECORD);
                                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                                nLEResourceAV.setDuration(timeUnit.toMicros(j3));
                                nLEResourceAV.LJIIIZ(str2);
                                nLESegmentAudio.LJIILL(nLEResourceAV);
                                nLESegmentAudio.LJIJJLI(0L);
                                nLESegmentAudio.LJIJJ(timeUnit.toMicros(j3));
                                nLESegmentAudio.LJIJI(true);
                                nLESegmentAudio.LJIL(c122004qa.LJI);
                                nLETrackSlot.LJIIL(nLESegmentAudio);
                                nLETrackSlot.setDuration(j3 * 1000);
                                nLETrackSlot.setStartTime(c122004qa.LJ * 1000);
                                nLETrackSlot.setEndTime(c122004qa.LJFF * 1000);
                                NLEModel LJ = nLEEditor.LJ();
                                o.LJIIIIZZ(LJ, "nleEditor.model");
                                C122494rN.LIZIZ(LJ).LIZIZ(nLETrackSlot);
                                nLEEditor.LIZIZ();
                            }
                        }
                        C5T8 c5t82 = c5t92.LJIIIZ;
                        if (c5t82 != null) {
                            c5t82.LIZIZ();
                        }
                    } else {
                        C5T8 c5t83 = c5t92.LJIIIZ;
                        if (c5t83 != null) {
                            c5t83.LIZJ();
                        }
                    }
                    C6YR.LJ(creationId);
                }
            }
            tj(false);
            C5T9 c5t93 = this.LJLLJ;
            if (c5t93 != null && (point = c5t93.LJII) != null) {
                c5t93.LIZIZ().setValue(Long.valueOf(point.getY()));
            }
            AudioRecorderParam audioRecorderParam2 = this.LJLLL;
            C5T9 c5t94 = this.LJLLJ;
            if (c5t94 != null) {
                stack = c5t94.LIZJ();
            } else {
                stack = new Stack<>();
            }
            audioRecorderParam2.setMStack(stack);
            if (this.LJLLL.getMStack().isEmpty()) {
                this.LJLLL.setAudioRecordIndex(-1);
            } else {
                this.LJLLL.setAudioRecordIndex(0);
            }
            updateUIAfterPause.invoke(Boolean.valueOf(!this.LJLLL.getMStack().isEmpty()));
            C5XM LJJLJLI = LJJLJLI();
            if (LJJLJLI != null) {
                LJJLJLI.DE(true);
            }
        }
        C5XM LJJLJLI2 = LJJLJLI();
        if (LJJLJLI2 != null) {
            LJJLJLI2.Fu0(this.LJLLL.getNeedOriginalSound());
        }
        p0(false);
        LJJLIIIJJI(true);
    }
}
