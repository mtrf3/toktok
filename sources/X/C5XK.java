package X;

import Y.ARunnableS38S0100000_2;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5XK, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5XK extends AbstractC48231ut<InterfaceC168156ip, C136545Xm, C136595Xr, C5XQ> implements InterfaceC168156ip, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLFZ;
    public final C82622Wbi LJLL;
    public final InterfaceC115514g7 LJLLI;
    public final InterfaceC115514g7 LJLLILLLL;
    public final InterfaceC115514g7 LJLLJ;
    public final InterfaceC115514g7 LJLLL;
    public final InterfaceC115514g7 LJLLLL;
    public final InterfaceC115514g7 LJLLLLLL;
    public final InterfaceC115514g7 LJLZ;
    public final InterfaceC115514g7 LJZ;
    public final InterfaceC115514g7 LJZI;
    public boolean LJZL;
    public boolean LL;
    public boolean LLD;
    public int LLF;
    public int LLFF;
    public int LLFFF;
    public final InterfaceC65784Pro<C76800UCe> LLFII;

    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void LLJJIJI() {
        /*
            r9 = this;
            r4 = r9
            X.5XM r0 = r4.LLIZ()
            if (r0 == 0) goto L64
            boolean r6 = r0.F10()
        Lb:
            r2 = 100
            if (r6 == 0) goto L62
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r4.LLLLIL()
            float r1 = r0.voiceVolume
            float r0 = (float) r2
            float r1 = r1 * r0
            int r3 = (int) r1
        L18:
            X.5XM r0 = r4.LLIZ()
            if (r0 == 0) goto L60
            boolean r7 = r0.EN()
            if (r7 == 0) goto L5e
        L24:
            com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam r0 = r4.LLILL()
            float r1 = r0.getRecordVolume()
            float r0 = (float) r2
            float r1 = r1 * r0
            int r5 = (int) r1
        L2f:
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r4.LLLLIL()
            boolean r0 = X.C44384HbQ.LJLJL(r0)
            if (r0 == 0) goto L52
            android.app.Activity r1 = X.C78688UuS.LJIJJ(r4)
            r0 = 2131845664(0x7f116220, float:1.9324755E38)
            java.lang.String r8 = r1.getString(r0)
        L44:
            java.lang.String r0 = "if (publishEditModel.has…ecord_cta_desc)\n        }"
            kotlin.jvm.internal.o.LJIIIIZZ(r8, r0)
            X.5XL r2 = new X.5XL
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r4.LJJZZI(r2)
            return
        L52:
            android.app.Activity r1 = X.C78688UuS.LJIJJ(r4)
            r0 = 2131824085(0x7f110dd5, float:1.9280988E38)
            java.lang.String r8 = r1.getString(r0)
            goto L44
        L5e:
            r5 = 0
            goto L2f
        L60:
            r7 = 1
            goto L24
        L62:
            r3 = 0
            goto L18
        L64:
            boolean r6 = r4.LJLZ()
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5XK.LLJJIJI():void");
    }

    @Override // X.InterfaceC168156ip
    public void fi() {
        this.LL = false;
        float f = 100;
        this.LLF = (int) (LLLLIL().voiceVolume * f);
        this.LLFFF = (int) (LLLLIL().musicVolume * f);
        this.LLFF = (int) (LLILL().getRecordVolume() * f);
    }

    @Override // X.InterfaceC168156ip
    public void uT() {
        this.LL = false;
        this.LLD = true;
        LLJJI(this.LLFF);
        LLJI(this.LLFFF);
        LLJJ(this.LLF);
    }

    static {
        TBT tbt = new TBT(C5XK.class, "aePreviewApiComponent", "getAePreviewApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioedit/preview/AEPreviewApiComponent;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLFZ = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C5XK.class, "aeVoiceChangeApiComponent", "getAeVoiceChangeApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioedit/voicechange/AEVoiceChangeApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C5XK.class, "audioEditingApiComponent", "getAudioEditingApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioedit/AudioEditingApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C5XK.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0, c65351Pkp), C61845OOz.LIZJ(C5XK.class, "editVolumeV2Api", "getEditVolumeV2Api()Lcom/ss/android/ugc/gamora/editor/volume/EditVolumeV2Api;", 0, c65351Pkp), C61845OOz.LIZJ(C5XK.class, "aeRecordApiComponent", "getAeRecordApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioedit/record/AERecordApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C5XK.class, "editSubtitleApi", "getEditSubtitleApi()Lcom/ss/android/ugc/gamora/editor/subtitle/EditSubtitleApi;", 0, c65351Pkp), C61845OOz.LIZJ(C5XK.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0, c65351Pkp), C61845OOz.LIZJ(C5XK.class, "voApiComponent", "getVoApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioedit/common/VOApiComponent;", 0, c65351Pkp)};
    }

    private final void LJZI() {
        boolean z;
        Float f;
        if (this.LJZL) {
            return;
        }
        if (LLLLIL().voiceVolume == 0.0f) {
            z = true;
        } else {
            z = false;
        }
        NLEModel nLEModel = null;
        if (!z) {
            AudioRecorderParam audioRecorderParam = LLLLIL().veAudioRecorderParam;
            if (audioRecorderParam != null) {
                f = Float.valueOf(audioRecorderParam.getRecordVolume());
            } else {
                f = null;
            }
            if (!o.LIZJ(f, 0.0f)) {
                return;
            }
        }
        this.LJZL = true;
        InterfaceC143855kj LLILZLL = LLILZLL();
        if (LLILZLL != null && C5TH.LIZ(LLLLIL()) && LLILZLL.Xg()) {
            LLILZLL.LE();
            InterfaceC153045zY value = LLILZIL().Kh().getValue();
            if (value != null) {
                nLEModel = C17N.LJJ(value);
            }
            LLILZLL.Jp(nLEModel);
        }
    }

    private final InterfaceC169246ka LLIIIL() {
        return (InterfaceC169246ka) this.LJLLLLLL.LIZ(this, LLFZ[5]);
    }

    private final InterfaceC135485Tk LLIILZL() {
        return (InterfaceC135485Tk) this.LJLLILLLL.LIZ(this, LLFZ[1]);
    }

    private final C5VE LLIIZ() {
        return (C5VE) this.LJLLJ.LIZ(this, LLFZ[2]);
    }

    private final InterfaceC143655kP LLILZIL() {
        return (InterfaceC143655kP) this.LJZ.LIZ(this, LLFZ[7]);
    }

    private final InterfaceC143855kj LLILZLL() {
        return (InterfaceC143855kj) this.LJLZ.LIZ(this, LLFZ[6]);
    }

    private final C5XM LLIZ() {
        return (C5XM) this.LJLLLL.LIZ(this, LLFZ[4]);
    }

    private final InterfaceC135455Th LLJ() {
        return (InterfaceC135455Th) this.LJZI.LIZ(this, LLFZ[8]);
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<C5XQ> LJJLIIIJJIZ() {
        return new AqS152S0100000_2(this, 212);
    }

    public final C5U4 LLIFFJFJJ() {
        return (C5U4) this.LJLLI.LIZ(this, LLFZ[0]);
    }

    public final void LLJJIII() {
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", LLLLIL().getCreationId());
        c145995oB.LJI("content_source", H8F.LJI(LLLLIL()));
        c145995oB.LJI("content_type", H7R.LJIIIZ(LLLLIL()));
        c145995oB.LJI("enter_from", "video_edit_page");
        c145995oB.LJI("shoot_way", LLLLIL().mShootWay);
        c145995oB.LIZJ(Float.valueOf(LLLLIL().musicVolume), "volume_cnt");
        c145995oB.LIZLLL("volume_track", "background");
        FMX.LJIIL("music_volume_control", c145995oB.LIZ);
        c145995oB.LIZJ(Float.valueOf(LLLLIL().voiceVolume), "volume_cnt");
        c145995oB.LIZLLL("volume_track", "voice");
        FMX.LJIIL("music_volume_control", c145995oB.LIZ);
        c145995oB.LIZJ(Float.valueOf(LLILL().getRecordVolume()), "volume_cnt");
        c145995oB.LIZLLL("volume_track", "record");
        FMX.LJIIL("music_volume_control", c145995oB.LIZ);
    }

    public final VideoPublishEditModel LLLLIL() {
        return (VideoPublishEditModel) this.LJLLL.LIZ(this, LLFZ[3]);
    }

    private final boolean LJLZ() {
        boolean z;
        AudioRecorderParam audioRecorderParam;
        StitchParams stitchParams = LLLLIL().stitchParams;
        if (((stitchParams != null && stitchParams.getEnableMic()) || LLLLIL().isFastImport || LLLLIL().isCutSameVideoType() || LLLLIL().hasOriginalSound() || LLLLIL().isUploadDuetMode() || (LLLLIL().isCurrentAutoCutMode() && HRX.LIZLLL())) && !LLLLIL().isMuted) {
            z = true;
        } else {
            z = false;
        }
        if (LLLLIL().isLibraryMaterialUsed() && !LLLLIL().isCurrentAutoCutMode()) {
            z = !LLLLIL().isLibraryPhotoOnly();
        }
        if (z && !LLLLIL().isGifMaterialOnly() && (((audioRecorderParam = LLLLIL().veAudioRecorderParam) == null || audioRecorderParam.getNeedOriginalSound()) && (!LLLLIL().isCurrentAutoCutMode() || LLLLIL().voiceVolume != 0.0f))) {
            return true;
        }
        return false;
    }

    private final AudioRecorderParam LLILL() {
        AudioRecorderParam w5;
        if (LLLLIL().veAudioRecorderParam != null && LLIIIL().w5() != null && (w5 = LLIIIL().w5()) != null) {
            w5.setRecordVolume(LLLLIL().veAudioRecorderParam.getRecordVolume());
        }
        AudioRecorderParam w52 = LLIIIL().w5();
        if (w52 == null) {
            AudioRecorderParam audioRecorderParam = LLLLIL().veAudioRecorderParam;
            if (audioRecorderParam == null) {
                return new AudioRecorderParam();
            }
            return audioRecorderParam;
        }
        return w52;
    }

    public final void LLFFF() {
        LLJJIII();
        hide();
    }

    @Override // X.AbstractC48231ut, X.InterfaceC145485nM
    public void hide() {
        super.hide();
        LLIIZ().CI("ae_volume");
        LLIFFJFJJ().LLJILJIL(false);
        LLIIZ().tV(this.LLFII);
        LLIFFJFJJ().OZ(true);
        LJZI();
        LLIILZL().fg().LJ();
        C1DH.LJJIJIIJIL(500L, new ARunnableS38S0100000_2(this, 62));
    }

    @Override // X.AbstractC48231ut, X.InterfaceC145485nM
    public void show() {
        LLJJIJI();
        super.show();
        LLIIZ().Nr0("ae_volume");
        this.LL = false;
        this.LLD = false;
        LLIIZ().Yc(this.LLFII);
        LLIFFJFJJ().OZ(false);
    }

    @Override // X.InterfaceC168156ip
    public boolean LJJJLZIJ() {
        return this.LL;
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<C136595Xr> LJJLIIIJJI() {
        return C5XO.LJLIL;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLL;
    }

    public final void LLJI(int i) {
        if (this.LLFFF != i) {
            this.LL = true;
        }
        C5XM LLIZ = LLIZ();
        if (LLIZ != null) {
            LLIZ.Dz((i * 1.0f) / 100);
        }
    }

    public final void LLJJ(int i) {
        if (this.LLF != i) {
            this.LL = true;
        }
        this.LJZL = false;
        C5XM LLIZ = LLIZ();
        if (LLIZ != null) {
            LLIZ.vt0((i * 1.0f) / 100);
        }
    }

    public final void LLJJI(int i) {
        if (this.LLFF != i) {
            this.LL = true;
        }
        float f = (i * 1.0f) / 100;
        LLILL().setRecordVolume(f);
        InterfaceC135455Th LLJ = LLJ();
        AudioRecorderParam w5 = LLJ().w5();
        w5.setRecordVolume(f);
        LLJ.xA(w5);
        this.LJZL = false;
        C5XM LLIZ = LLIZ();
        if (LLIZ != null) {
            LLIZ.vB(f);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5XK(WMH parentScene, C82622Wbi diContainer) {
        super(parentScene);
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLL = diContainer;
        this.LJLLI = UCI.LJI(getDiContainer(), C5U4.class, null);
        this.LJLLILLLL = UCI.LJI(getDiContainer(), InterfaceC135485Tk.class, null);
        this.LJLLJ = UCI.LJI(getDiContainer(), C5VE.class, null);
        this.LJLLL = UCI.LJI(getDiContainer(), VideoPublishEditModel.class, null);
        this.LJLLLL = UCI.LJII(getDiContainer(), C5XM.class, null);
        this.LJLLLLLL = UCI.LJI(getDiContainer(), InterfaceC169246ka.class, null);
        this.LJLZ = UCI.LJII(getDiContainer(), InterfaceC143855kj.class, null);
        this.LJZ = UCI.LJI(getDiContainer(), InterfaceC143655kP.class, null);
        this.LJZI = UCI.LJI(getDiContainer(), InterfaceC135455Th.class, null);
        this.LLFII = new AqS152S0100000_2(this, 211);
    }

    public final void LLF(int i, int i2, int i3) {
        this.LL = false;
        LLJJ(i);
        LLJI(i2);
        LLJJI(i3);
        if (!this.LLD) {
            hide();
        }
    }
}
