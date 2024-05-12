package X;

import Y.AObjectS84S0100000_2;
import Y.AObserverS70S0100000_2;
import android.content.Context;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.ies.nle.editor_jni.NLEError;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.keva.Keva;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.audio.copyrightdetect.AudioCopyrightDetectAPI;
import com.ss.android.ugc.aweme.audio.copyrightdetect.PreCheckResult;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.audio.PreCheckResultModel;
import com.ss.android.ugc.aweme.creative.model.audio.UnavailableReason;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import kotlin.jvm.internal.AqS133S0200000_2;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.AqS40S1000000_2;
import kotlin.jvm.internal.AqS66S0201000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6EC, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6EC extends AbstractC29891Fh<InterfaceC143385jy> implements InterfaceC143385jy, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLFZ;
    public final C82622Wbi LJLIL;
    public final C6EF LJLILLLLZI;
    public final InterfaceC65784Pro<C76800UCe> LJLJI;
    public final InterfaceC65784Pro<C76800UCe> LJLJJI;
    public final InterfaceC115514g7 LJLJJL;
    public final InterfaceC115514g7 LJLJJLL;
    public final InterfaceC115514g7 LJLJL;
    public final InterfaceC115514g7 LJLJLJ;
    public final InterfaceC115514g7 LJLJLLL;
    public final InterfaceC115514g7 LJLL;
    public final InterfaceC115514g7 LJLLI;
    public final InterfaceC115514g7 LJLLILLLL;
    public final InterfaceC115514g7 LJLLJ;
    public final InterfaceC115514g7 LJLLL;
    public final C5H3 LJLLLL;
    public InterfaceC117164im LJLLLLLL;
    public boolean LJLZ;
    public boolean LJZ;
    public boolean LJZI;
    public boolean LJZL;
    public int LL;
    public int LLD;
    public C6EJ LLF;
    public String LLFF;
    public TuxSheet LLFFF;
    public InterfaceC65784Pro<C76800UCe> LLFII;

    public InterfaceC143385jy LJJLIIIIJ() {
        return this;
    }

    @Override // X.AbstractC29891Fh
    public void onResume() {
        int i;
        super.onResume();
        this.LJZL = true;
        String creationId = LJJZZI().getCreationId();
        o.LJIIIIZZ(creationId, "model.creationId");
        C6EG.LIZ(LJJLL(), creationId);
        LLFFF(null);
        this.LJLILLLLZI.LIZ();
        LLIIIL();
        if (LJJZZI().creativeModel.audioCopyrightDetectModel.getChangeMusicImmediately()) {
            LJJZZI().creativeModel.audioCopyrightDetectModel.setChangeMusicImmediately(false);
            C6EJ LIZJ = this.LJLILLLLZI.LIZJ();
            if (LIZJ != null) {
                i = LIZJ.LIZ();
            } else {
                i = -1;
            }
            if (C146535p3.LIZIZ(i)) {
                SM("video_edit_page", "click_post", true, 4, new AqS152S0100000_2(this, 328));
                return;
            } else {
                LJLJJL();
                return;
            }
        }
        if (!LJJZZI().creativeModel.audioCopyrightDetectModel.getEditorProImmediately()) {
            return;
        }
        LJJZZI().creativeModel.audioCopyrightDetectModel.setEditorProImmediately(false);
        this.LJLJJI.invoke();
    }

    static {
        TBT tbt = new TBT(C6EC.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLFZ = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C6EC.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0, c65351Pkp), C61845OOz.LIZJ(C6EC.class, "editVolumeV2Api", "getEditVolumeV2Api()Lcom/ss/android/ugc/gamora/editor/volume/EditVolumeV2Api;", 0, c65351Pkp), C61845OOz.LIZJ(C6EC.class, "editMusicApi", "getEditMusicApi()Lcom/ss/android/ugc/gamora/editor/music/EditMusicApi;", 0, c65351Pkp), C61845OOz.LIZJ(C6EC.class, "privacySettingApi", "getPrivacySettingApi()Lcom/ss/android/ugc/aweme/shortvideo/privacy/PrivacySettingApi;", 0, c65351Pkp), C61845OOz.LIZJ(C6EC.class, "editToolbarApi", "getEditToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0, c65351Pkp), C61845OOz.LIZJ(C6EC.class, "audioCopyRightDistributeComponent", "getAudioCopyRightDistributeComponent()Lcom/ss/android/ugc/aweme/shortvideo/autocut/AudioCopyRightDistributeApi;", 0, c65351Pkp), C61845OOz.LIZJ(C6EC.class, "musicReplaceApiComponent", "getMusicReplaceApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioedit/musicreplace/MusicReplaceApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C6EC.class, "lighteningMusicApi", "getLighteningMusicApi()Lcom/ss/android/ugc/gamora/editor/lightening/music/LighteningMusicApi;", 0, c65351Pkp), C61845OOz.LIZJ(C6EC.class, "editorProApi", "getEditorProApi()Lcom/ss/android/ugc/gamora/editorpro/EditorProApi;", 0, c65351Pkp)};
    }

    private final C5LI LJJLIIIJILLIZJL() {
        return (C5LI) this.LJLLI.LIZ(this, LLFZ[6]);
    }

    private final InterfaceC145325n6 LJJLIIIJJI() {
        return (InterfaceC145325n6) this.LJLJLJ.LIZ(this, LLFZ[3]);
    }

    private final InterfaceC153275zv LJJLIIIJLLLLLLLZ() {
        return (InterfaceC153275zv) this.LJLL.LIZ(this, LLFZ[5]);
    }

    private final C5XM LJJLIIJ() {
        return (C5XM) this.LJLJL.LIZ(this, LLFZ[2]);
    }

    private final InterfaceC136115Vv LJJLJ() {
        return (InterfaceC136115Vv) this.LJLLL.LIZ(this, LLFZ[9]);
    }

    private final InterfaceC145405nE LJJLJLI() {
        return (InterfaceC145405nE) this.LJLLJ.LIZ(this, LLFZ[8]);
    }

    private final InterfaceC149715uB LJJZZIII() {
        return (InterfaceC149715uB) this.LJLLILLLL.LIZ(this, LLFZ[7]);
    }

    private final C6E7 LJLIIL() {
        return (C6E7) this.LJLJLLL.LIZ(this, LLFZ[4]);
    }

    public final AudioCopyrightDetectAPI LJJLI() {
        return (AudioCopyrightDetectAPI) this.LJLLLL.getValue();
    }

    public final InterfaceC143655kP LJJLIIIJJIZ() {
        return (InterfaceC143655kP) this.LJLJJLL.LIZ(this, LLFZ[1]);
    }

    public final VideoPublishEditModel LJJZZI() {
        return (VideoPublishEditModel) this.LJLJJL.LIZ(this, LLFZ[0]);
    }

    public final boolean LJLLL() {
        int i;
        if (!this.LJLILLLLZI.LJFF()) {
            return false;
        }
        VideoPublishEditModel LJJZZI = LJJZZI();
        InterfaceC153045zY value = LJJLIIIJJIZ().Kh().getValue();
        o.LJIIIZ(LJJZZI, "<this>");
        if (LJJZZI.getEditorProModel().getHasAudioInAdvanceEdit() || (!LJJZZI.mFromCut && !LJJZZI.mFromMultiCut)) {
            if (value != null) {
                C122034qd LJJI = C17N.LJJI(value);
                if (LJJI != null) {
                    VecNLETrackSlotSPtr LJIILL = LJJI.LJIIJ.LJ().getMainTrack().LJIILL();
                    if (!LJIILL.isEmpty()) {
                        Iterator<NLETrackSlot> it = LJIILL.iterator();
                        while (it.hasNext()) {
                            NLETrackSlot next = it.next();
                            if (o.LJ(next.getExtra("slot_extra_source_type"), String.valueOf(EnumC124594ul.UploadFromEditorPro.getValue())) || o.LJ(next.getExtra("slot_extra_source_type"), String.valueOf(EnumC124594ul.UploadFromRecordPage.getValue()))) {
                                break;
                            }
                        }
                    }
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            C6EJ LIZJ = this.LJLILLLLZI.LIZJ();
            if (LIZJ != null) {
                i = LIZJ.LIZ();
            } else {
                i = -1;
            }
            if (!C146535p3.LIZJ(i)) {
                return false;
            }
        }
        if (LJJZZI().voiceVolume <= 0.0f) {
            return false;
        }
        AudioRecorderParam audioRecorderParam = LJJZZI().veAudioRecorderParam;
        if (audioRecorderParam != null && !audioRecorderParam.getNeedOriginalSound()) {
            return false;
        }
        return true;
    }

    public final void LLIFFJFJJ() {
        if (this.LJLLLLLL != null) {
            return;
        }
        this.LJLLLLLL = new InterfaceC117164im() { // from class: X.6EU
            @Override // X.InterfaceC117164im
            public final void LIZ(int i, int i2, int i3, java.util.Map map) {
                if (i == 1) {
                    C6QQ.LIZ(new AqS152S0100000_2(C6EC.this, 332));
                }
                if (i2 != 102) {
                    if (i2 != 103) {
                        return;
                    }
                    C6QQ.LIZ(new AqS66S0201000_2(C6EC.this, (C6EC) map, (java.util.Map<Integer, PreCheckResult>) i3, 2));
                    return;
                }
                C6QQ.LIZ(new AqS152S0100000_2(C6EC.this, 333));
            }
        };
        String creationId = LJJZZI().getCreationId();
        o.LJIIIIZZ(creationId, "model.creationId");
        InterfaceC117164im interfaceC117164im = this.LJLLLLLL;
        if (interfaceC117164im != null) {
            C6EG.LIZLLL(creationId, interfaceC117164im);
        } else {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    public final void LLIIIL() {
        boolean z;
        C6EJ c6ej;
        C6EJ c6ej2;
        ArrayList<UnavailableReason> arrayList;
        PreCheckResult preCheckResult;
        PreCheckResultModel preCheckResultModel;
        this.LLF = this.LJLILLLLZI.LIZJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("audioCopyrightDetectInEdit -> ditAudioCopyrightDetectComponent -> needShowUI = ");
        C6EJ c6ej3 = this.LLF;
        if (c6ej3 != null && c6ej3.LIZLLL(LJJZZI())) {
            z = true;
        } else {
            z = false;
        }
        LIZ.append(z);
        H7B.LIZ(X1D.LIZIZ(LIZ));
        if (this.LJZ && this.LJZL && !this.LJZI && (c6ej = this.LLF) != null && c6ej.LIZLLL(LJJZZI()) && (c6ej2 = this.LLF) != null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("EditAudioCopyrightDetectComponent -> showResultIfNeed -> controller.scene = ");
            LIZ2.append(c6ej2.LIZ());
            H7B.LIZ(X1D.LIZIZ(LIZ2));
            PreCheckResult preCheckResult2 = c6ej2.LIZ;
            if (preCheckResult2 == null || preCheckResult2.materialHash != this.LL || (((arrayList = preCheckResult2.unavailableReasons) == null || arrayList.isEmpty()) && (preCheckResult = c6ej2.LIZ) != null && preCheckResult.unavailableReasonsV1 == 0)) {
                c6ej2.LIZ = null;
                return;
            }
            if (C146535p3.LIZJ(c6ej2.LIZ())) {
                if (this.LLD != this.LL && C149275tT.LIZ() != 1) {
                    this.LLD = this.LL;
                    String creationId = LJJZZI().getCreationId();
                    o.LJIIIIZZ(creationId, "model.creationId");
                    String str = LJJZZI().mShootWay;
                    o.LJIIIIZZ(str, "model.mShootWay");
                    String contentType = H7R.LJIIIZ(LJJZZI());
                    String contentSource = H7R.LJIIIIZZ(LJJZZI());
                    int LIZ3 = c6ej2.LIZ();
                    int videoLength = LJJZZI().getVideoLength();
                    boolean LJJJJJL = C78983UzD.LJJJJJL(LJJZZI());
                    o.LJIIIZ(contentType, "contentType");
                    o.LJIIIZ(contentSource, "contentSource");
                    C188727au c188727au = new C188727au();
                    c188727au.LJIIIZ("creation_id", creationId);
                    c188727au.LJIIIZ("shoot_way", str);
                    c188727au.LJIIIZ("enter_from", "video_edit_page");
                    c188727au.LJIIIZ("content_type", contentType);
                    c188727au.LJIIIZ("content_source", contentSource);
                    c188727au.LIZLLL(videoLength, "creation_duration");
                    C6ES.LIZ(LIZ3, LJJJJJL ? 1 : 0, c188727au);
                    FMX.LJIIL("copyright_claim_show", c188727au.LIZ);
                }
                InterfaceC145405nE LJJLJLI = LJJLJLI();
                if (LJJLJLI != null) {
                    LJJLJLI.I30(null);
                    return;
                }
                return;
            }
            FragmentManager supportFragmentManager = ((ActivityC45651qj) C78688UuS.LJIJJ(this)).getSupportFragmentManager();
            o.LJIIIIZZ(supportFragmentManager, "activity as FragmentActi…y).supportFragmentManager");
            Context LLLLJ = C16880lQ.LLLLJ(C78688UuS.LJIJJ(this));
            o.LJIIIIZZ(LLLLJ, "activity.applicationContext");
            c6ej2.LJFF(supportFragmentManager, LLLLJ, LJJZZI(), new AqS168S0100000_2(this, 225));
            c6ej2.LIZ = null;
            HashMap<Integer, PreCheckResultModel> detectResults = LJJZZI().creativeModel.audioCopyrightDetectModel.getDetectResults();
            if (detectResults == null || (preCheckResultModel = detectResults.get(Integer.valueOf(c6ej2.LIZ()))) == null) {
                return;
            }
            preCheckResultModel.hasShowResult = true;
        }
    }

    public final void LLIIZ() {
        if (this.LJLLLLLL == null) {
            return;
        }
        String creationId = LJJZZI().getCreationId();
        o.LJIIIIZZ(creationId, "model.creationId");
        InterfaceC117164im interfaceC117164im = this.LJLLLLLL;
        if (interfaceC117164im != null) {
            List list = (List) ((LinkedHashMap) C6EG.LIZIZ).get(creationId);
            if (list != null) {
                list.remove(interfaceC117164im);
            }
            this.LJLLLLLL = null;
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.InterfaceC143385jy
    public void Nb() {
        this.LJLJJI.invoke();
    }

    private final boolean LJLLILLLL() {
        int LJJLL = LJJLL();
        if (LJJLL != this.LL) {
            this.LL = LJJLL;
            return true;
        }
        return false;
    }

    public final int LJJLL() {
        NLEModel nLEModel = null;
        if (LJJZZI().isCurrentAutoCutMode() && C45087Hml.LJIILJJIL()) {
            VideoPublishEditModel LJJZZI = LJJZZI();
            InterfaceC153045zY value = LJJLIIIJJIZ().Kh().getValue();
            if (value != null) {
                nLEModel = C17N.LJJ(value);
            }
            return C78555UsJ.LJJIIZ(nLEModel, LJJZZI);
        }
        return C78555UsJ.LJJIIZ(null, LJJZZI());
    }

    public final void LJLJJL() {
        int i;
        InterfaceC145405nE LJJLJLI;
        LJJZZI().creativeModel.audioCopyrightDetectModel.setOperation(1);
        C6EJ c6ej = this.LLF;
        if (c6ej != null) {
            i = c6ej.LIZ();
        } else {
            i = -1;
        }
        boolean LIZJ = C146535p3.LIZJ(i);
        LJZI(!LIZJ);
        if (LIZJ && (LJJLJLI = LJJLJLI()) != null) {
            LJJLJLI.I30(null);
        }
        if (C44384HbQ.LJJIFFI()) {
            InterfaceC145325n6 LJJLIIIJJI = LJJLIIIJJI();
            if (LJJLIIIJJI != null) {
                LJJLIIIJJI.show(true);
                return;
            }
            return;
        }
        LJJZZI().voiceVolume = 0.0f;
        this.LJLJI.invoke();
    }

    public final boolean LLF() {
        if (!C78688UuS.LJIJJ(this).isFinishing() && this.LJLZ && LJLLL()) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [X.4yh] */
    public final void LLIILZL() {
        if (!LJLLILLLL()) {
            return;
        }
        Future<?> future = null;
        LJJZZI().creativeModel.audioCopyrightDetectModel.setDetectResults(null);
        String creationId = LJJZZI().getCreationId();
        o.LJIIIIZZ(creationId, "model.creationId");
        int LJJLL = LJJLL();
        C6EF c6ef = this.LJLILLLLZI;
        c6ef.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator<C6EJ> it = c6ef.LIZLLL().iterator();
        while (it.hasNext()) {
            C6EJ next = it.next();
            if (next.LIZIZ(c6ef.LJ())) {
                arrayList.add(Integer.valueOf(next.LIZ()));
            }
        }
        ?? r6 = new InterfaceC117174in() { // from class: X.4yh
            @Override // X.InterfaceC117174in
            public final String LIZ() {
                NLEModel nLEModel;
                try {
                    C122234qx c122234qx = C122234qx.LJLIL;
                    InterfaceC43072GvM pathService = C60903NvH.LJIIJJI().LJJIJL().getPathService();
                    CreativeInfo creativeInfo = C6EC.this.LJJZZI().creativeInfo;
                    o.LJIIIIZZ(creativeInfo, "model.creativeInfo");
                    String LJ = pathService.LJ(creativeInfo, EnumC43650HBe.AUDIO_COPYRIGHT_DETECT, "originalAudio.wav", true);
                    InterfaceC153045zY value = C6EC.this.LJJLIIIJJIZ().Kh().getValue();
                    if (value != null) {
                        nLEModel = C17N.LJJ(value);
                    } else {
                        nLEModel = null;
                    }
                    if (nLEModel != null) {
                        return C126694y9.LIZ(LJ, nLEModel, null, c122234qx, 1, 131072, 16000, null, 384) == NLEError.SUCCESS ? LJ : "";
                    }
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                } catch (Exception unused) {
                    return "";
                }
            }
        };
        if (C6EG.LIZJ == null) {
            C6EG.LIZJ = C16880lQ.LLLLZLLIL();
        }
        C6EG.LIZIZ(creationId);
        C6BK c6bk = new C6BK();
        c6bk.LIZ.put("stage", 0);
        C43882HKc.LIZLLL(0, "creative_tool_audio_copyright_detect", c6bk.LJ(), true);
        RunnableC117154il runnableC117154il = new RunnableC117154il(r6, LJJLL, creationId, arrayList, new AqS40S1000000_2(creationId, 1));
        C6EG.LIZ.put(creationId, runnableC117154il);
        ExecutorService executorService = C6EG.LIZJ;
        if (executorService != null) {
            future = executorService.submit(runnableC117154il);
        }
        runnableC117154il.LJLJJLL = future;
    }

    @Override // X.InterfaceC143385jy
    public void No0() {
        if (LLF()) {
            LLIILZL();
            return;
        }
        LJJZZI().creativeModel.audioCopyrightDetectModel.setDetectResults(null);
        this.LL = LJJLL();
        String creationId = LJJZZI().getCreationId();
        o.LJIIIIZZ(creationId, "model.creationId");
        C6EG.LIZ(this.LL, creationId);
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        C0IB<Boolean> r50;
        LiveData<Boolean> vw;
        LiveData<Boolean> n2;
        LiveEvent<Boolean> kf0;
        super.onCreate();
        LLFFF(null);
        this.LLF = this.LJLILLLLZI.LIZJ();
        C5LI LJJLIIIJILLIZJL = LJJLIIIJILLIZJL();
        if (LJJLIIIJILLIZJL != null && (kf0 = LJJLIIIJILLIZJL.kf0()) != null) {
            kf0.LIZLLL(this, new AObjectS84S0100000_2(this, 88));
        }
        InterfaceC153275zv LJJLIIIJLLLLLLLZ = LJJLIIIJLLLLLLLZ();
        if (LJJLIIIJLLLLLLLZ != null && (n2 = LJJLIIIJLLLLLLLZ.n2()) != null) {
            n2.observe(this, new AObserverS70S0100000_2(this, 73));
        }
        C6E7 LJLIIL = LJLIIL();
        if (LJLIIL != null && (vw = LJLIIL.vw()) != null) {
            vw.observe(this, new AObjectS84S0100000_2(this, 89));
        }
        ((C1EP) getDiContainer().LJ(C1EP.class, null)).m3(InterfaceC146755pP.class, new AqS168S0100000_2(this, 224));
        InterfaceC136115Vv LJJLJ = LJJLJ();
        if (LJJLJ != null && (r50 = LJJLJ.r50()) != null) {
            r50.LIZIZ(this, new AObjectS84S0100000_2(this, 91));
        }
    }

    @Override // X.AbstractC29891Fh
    public void onDestroy() {
        super.onDestroy();
        String creationId = LJJZZI().getCreationId();
        o.LJIIIIZZ(creationId, "model.creationId");
        C6EG.LIZIZ(creationId);
    }

    @Override // X.AbstractC29891Fh
    public void onPause() {
        super.onPause();
        this.LJZL = false;
    }

    @Override // X.AbstractC29891Fh
    public void onStart() {
        super.onStart();
        InterfaceC136115Vv LJJLJ = LJJLJ();
        if (LJJLJ != null && LJJLJ.isShowing()) {
            return;
        }
        LLIFFJFJJ();
    }

    @Override // X.AbstractC29891Fh
    public void onStop() {
        super.onStop();
        InterfaceC136115Vv LJJLJ = LJJLJ();
        if (LJJLJ != null && LJJLJ.isShowing()) {
            return;
        }
        LLIIZ();
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ InterfaceC143385jy getApiComponent() {
        LJJLIIIIJ();
        return this;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC143385jy
    public void rq() {
        LJLJJL();
    }

    @Override // X.InterfaceC143385jy
    public C6EF yu0() {
        return this.LJLILLLLZI;
    }

    private final void LJZI(boolean z) {
        C5XM LJJLIIJ = LJJLIIJ();
        if (LJJLIIJ != null) {
            LJJLIIJ.RU(false);
        }
        if (LJJZZI().veAudioRecorderParam != null) {
            LJJZZI().veAudioRecorderParam.setNeedOriginalSound(false);
            LJJZZI().veAudioRecorderParam.setMuteByAudioCopyright(z);
        } else {
            VideoPublishEditModel LJJZZI = LJJZZI();
            AudioRecorderParam audioRecorderParam = new AudioRecorderParam();
            audioRecorderParam.setNeedOriginalSound(false);
            audioRecorderParam.setVoiceVolume(LJJZZI().voiceVolume);
            audioRecorderParam.setHasOriginalSound(LJJZZI().hasOriginalSound(HRX.LIZLLL()));
            audioRecorderParam.setMuteByAudioCopyright(z);
            LJJZZI.veAudioRecorderParam = audioRecorderParam;
        }
        this.LL = LJJLL();
    }

    public final void LJLJLJ(C156906Du c156906Du) {
        Object value = C6EV.LIZJ.getValue();
        o.LJIIIIZZ(value, "<get-keva>(...)");
        if (((Keva) value).getBoolean("show_authorize", false)) {
            C6EE.LIZ(this.LLF, LJJZZI(), 3);
            return;
        }
        C6EE.LIZ(this.LLF, LJJZZI(), 0);
        VideoPublishEditModel LJJZZI = LJJZZI();
        AqS168S0100000_2 aqS168S0100000_2 = new AqS168S0100000_2(this, 223);
        c156906Du.getClass();
        if (C156906Du.LJ(LJJZZI)) {
            aqS168S0100000_2.invoke(Boolean.TRUE);
        } else {
            c156906Du.LIZJ(new AqS133S0200000_2(c156906Du, (C156906Du) aqS168S0100000_2, (InterfaceC88472Yns<? super Boolean, C76800UCe>) 83));
        }
    }

    public final void LJLZ(C6EX c6ex) {
        InterfaceC149715uB LJJZZIII = LJJZZIII();
        if (LJJZZIII != null) {
            LJJZZIII.Zz(this.LLFF);
        }
        if (c6ex != null) {
            c6ex.onComplete();
        }
    }

    public final void LLFFF(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        XKX.LIZLLL(C780334l.LJLIL, C78613UtF.LIZJ, null, new C74462w6(this, interfaceC65784Pro, null), 2);
    }

    public C6EC(C82622Wbi diContainer, C6EF audioCopyrightHandler, InterfaceC65784Pro<C76800UCe> openChooseMusicPage, InterfaceC65784Pro<C76800UCe> openEditorProPage) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(audioCopyrightHandler, "audioCopyrightHandler");
        o.LJIIIZ(openChooseMusicPage, "openChooseMusicPage");
        o.LJIIIZ(openEditorProPage, "openEditorProPage");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = audioCopyrightHandler;
        this.LJLJI = openChooseMusicPage;
        this.LJLJJI = openEditorProPage;
        this.LJLJJL = UCI.LJI(getDiContainer(), VideoPublishEditModel.class, null);
        this.LJLJJLL = UCI.LJI(getDiContainer(), InterfaceC143655kP.class, null);
        this.LJLJL = UCI.LJII(getDiContainer(), C5XM.class, null);
        this.LJLJLJ = UCI.LJII(getDiContainer(), InterfaceC145325n6.class, null);
        this.LJLJLLL = UCI.LJII(getDiContainer(), C6E7.class, null);
        this.LJLL = UCI.LJI(getDiContainer(), InterfaceC153275zv.class, null);
        this.LJLLI = UCI.LJII(getDiContainer(), C5LI.class, null);
        this.LJLLILLLL = UCI.LJII(getDiContainer(), InterfaceC149715uB.class, null);
        this.LJLLJ = UCI.LJII(getDiContainer(), InterfaceC145405nE.class, null);
        this.LJLLL = UCI.LJII(getDiContainer(), InterfaceC136115Vv.class, null);
        this.LJLLLL = C221108m2.LIZIZ(C117184io.LJLIL);
        this.LJZ = true;
        this.LLFF = "";
    }

    public final String LJLJJLL(PreCheckResult preCheckResult, String str, int i, final C6EX c6ex) {
        String Sh;
        InterfaceC149715uB LJJZZIII = LJJZZIII();
        if (LJJZZIII == null || (Sh = LJJZZIII.Sh(preCheckResult, str, i, new InterfaceC149745uE() { // from class: X.6EQ
            @Override // X.InterfaceC149745uE
            public final void LIZIZ(String taskId) {
                o.LJIIIZ(taskId, "taskId");
                C6EX c6ex2 = C6EX.this;
                if (c6ex2 != null) {
                    c6ex2.onProgress(0);
                }
            }

            @Override // X.InterfaceC149745uE
            public final void onFailed(String taskId) {
                o.LJIIIZ(taskId, "taskId");
                C6EX c6ex2 = C6EX.this;
                if (c6ex2 != null) {
                    c6ex2.onComplete();
                }
            }

            @Override // X.InterfaceC149745uE
            public final void onSuccess(String taskId) {
                boolean z;
                o.LJIIIZ(taskId, "taskId");
                C6EX c6ex2 = C6EX.this;
                if (c6ex2 != null) {
                    c6ex2.onComplete();
                }
                TuxSheet tuxSheet = this.LLFFF;
                if (tuxSheet != null) {
                    z = tuxSheet.isVisible();
                } else {
                    z = false;
                }
                TuxSheet tuxSheet2 = this.LLFFF;
                if (tuxSheet2 != null) {
                    tuxSheet2.dismissAllowingStateLoss();
                }
                if (z) {
                    this.LJLJI.invoke();
                }
            }

            @Override // X.InterfaceC149745uE
            public final void LIZ(int i2, String taskId) {
                o.LJIIIZ(taskId, "taskId");
                C6EX c6ex2 = C6EX.this;
                if (c6ex2 != null) {
                    c6ex2.onProgress(i2);
                }
            }
        })) == null) {
            return "";
        }
        return Sh;
    }

    @Override // X.InterfaceC143385jy
    public boolean SM(String enterFrom, String enterMethod, boolean z, Integer num, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        int i;
        PreCheckResultModel preCheckResultModel;
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(enterMethod, "enterMethod");
        if (C146535p3.LIZLLL(LJJZZI()) && z) {
            C6EJ LIZJ = this.LJLILLLLZI.LIZJ();
            if (LIZJ != null) {
                i = LIZJ.LIZ();
            } else {
                i = -1;
            }
            HashMap<Integer, PreCheckResultModel> detectResults = LJJZZI().creativeModel.audioCopyrightDetectModel.getDetectResults();
            if (detectResults != null) {
                preCheckResultModel = detectResults.get(Integer.valueOf(i));
            } else {
                preCheckResultModel = null;
            }
            PreCheckResult LIZ = C6EY.LIZ(preCheckResultModel);
            if (LIZ != null) {
                C68322mC c68322mC = new C68322mC();
                this.LLFII = interfaceC65784Pro;
                FragmentManager supportFragmentManager = ((ActivityC45651qj) C78688UuS.LJIJJ(this)).getSupportFragmentManager();
                o.LJIIIIZZ(supportFragmentManager, "activity as FragmentActi…y).supportFragmentManager");
                this.LLFFF = C157116Ep.LIZIZ(supportFragmentManager, C78688UuS.LJIJJ(this), LIZ, LJJZZI(), enterFrom, enterMethod, i, num, new AqS168S0100000_2(c68322mC, (C68322mC<C6EX>) 222), new C6ED(this, enterFrom, c68322mC, LIZ, i));
                return true;
            }
            return false;
        }
        return false;
    }
}
