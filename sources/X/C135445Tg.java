package X;

import Y.ARunnableS21S0200000_2;
import Y.ARunnableS38S0100000_2;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLEStyCanvas;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.AqS149S0200000_2;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS165S0200000_2;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.AqS27S0001000_2;
import kotlin.jvm.internal.AqS7S0010000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5Tg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C135445Tg extends AbstractC48231ut<InterfaceC169246ka, C5TK, C5TX, C5TL> implements InterfaceC169246ka, InterfaceC135635Tz {
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
    public AudioRecorderParam LJZI;
    public AudioRecorderParam LJZL;
    public AudioRecorderParam LL;
    public boolean LLD;
    public C5FJ LLF;
    public DialogC135475Tj LLFF;
    public final InterfaceC65784Pro<C5TK> LLFFF;
    public final InterfaceC65784Pro<C76800UCe> LLFII;

    static {
        TBT tbt = new TBT(C135445Tg.class, "aePreviewApiComponent", "getAePreviewApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioedit/preview/AEPreviewApiComponent;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLFZ = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C135445Tg.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0, c65351Pkp), C61845OOz.LIZJ(C135445Tg.class, "audioEditingApiComponent", "getAudioEditingApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioedit/AudioEditingApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C135445Tg.class, "voApiComponent", "getVoApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioedit/common/VOApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C135445Tg.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0, c65351Pkp), C61845OOz.LIZJ(C135445Tg.class, "editVolumeV2Api", "getEditVolumeV2Api()Lcom/ss/android/ugc/gamora/editor/volume/EditVolumeV2Api;", 0, c65351Pkp), C61845OOz.LIZJ(C135445Tg.class, "editTextAdapterApi", "getEditTextAdapterApi()Lcom/ss/android/ugc/aweme/sticker/text/EditTextAdapterApi;", 0, c65351Pkp), C61845OOz.LIZJ(C135445Tg.class, "aeVoiceChangeApiComponent", "getAeVoiceChangeApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/edit/audioedit/voicechange/AEVoiceChangeApiComponent;", 0, c65351Pkp)};
    }

    private final C5VE LLIFFJFJJ() {
        return (C5VE) this.LJLLJ.LIZ(this, LLFZ[2]);
    }

    private final C5XM LLIIZ() {
        return (C5XM) this.LJLLLLLL.LIZ(this, LLFZ[5]);
    }

    private final void LLILZLL() {
        XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C131165Cu(this, null), 3);
    }

    @Override // X.InterfaceC169246ka
    public boolean Bl0() {
        if (this.LLF != C5FJ.IDLE) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<C5TX> LJJLIIIJJI() {
        return new AqS152S0100000_2(this, 184);
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<C5TL> LJJLIIIJJIZ() {
        return new AqS152S0100000_2(this, 187);
    }

    public final void LJZI() {
        II(new AqS152S0100000_2(this, 183));
    }

    public final C5U4 LLF() {
        return (C5U4) this.LJLLI.LIZ(this, LLFZ[0]);
    }

    public final InterfaceC135485Tk LLFFF() {
        return (InterfaceC135485Tk) this.LJZ.LIZ(this, LLFZ[7]);
    }

    public final InterfaceC143655kP LLIIIL() {
        return (InterfaceC143655kP) this.LJLLILLLL.LIZ(this, LLFZ[1]);
    }

    public final InterfaceC139655dx LLIILZL() {
        return (InterfaceC139655dx) this.LJLZ.LIZ(this, LLFZ[6]);
    }

    public final AudioRecorderParam LLILL() {
        Boolean bool;
        if (this.LJZL == null) {
            AudioRecorderParam audioRecorderParam = new AudioRecorderParam();
            audioRecorderParam.copyFrom(LLILZIL().Ar0());
            this.LJZL = audioRecorderParam;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" getRecordParam curRecordParam?.needOriginalSound = ");
        AudioRecorderParam audioRecorderParam2 = this.LJZL;
        if (audioRecorderParam2 != null) {
            bool = Boolean.valueOf(audioRecorderParam2.getNeedOriginalSound());
        } else {
            bool = null;
        }
        LIZ.append(bool);
        X1D.LIZIZ(LIZ);
        AudioRecorderParam audioRecorderParam3 = this.LJZL;
        if (audioRecorderParam3 == null) {
            return new AudioRecorderParam();
        }
        return audioRecorderParam3;
    }

    public final InterfaceC135455Th LLILZIL() {
        return (InterfaceC135455Th) this.LJLLL.LIZ(this, LLFZ[3]);
    }

    public final VideoPublishEditModel LLLLIL() {
        return (VideoPublishEditModel) this.LJLLLL.LIZ(this, LLFZ[4]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC169246ka
    public boolean NW() {
        return ((Boolean) ((C08630Vn) LJJLIIIJILLIZJL(new TBT() { // from class: X.5TW
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((C5TX) obj).LJLJJLL;
            }
        }).LIZ()).LIZIZ).booleanValue();
    }

    private final void LLIZ() {
        LLJJ();
        LLILZIL().rr0(LLFFF().fg());
    }

    private final void LLJJ() {
        LLILZIL().km(new C5F9() { // from class: X.5Tp
            @Override // X.C5F9
            public final void LIZ() {
            }

            @Override // X.C5F9
            public final void LIZIZ() {
            }
        });
    }

    @Override // X.AbstractC48231ut, X.InterfaceC145485nM
    public void hide() {
        super.hide();
        LLIFFJFJJ().CI("ae_record");
        this.LLD = false;
        LLIFFJFJJ().tV(this.LLFII);
        LLF().OZ(true);
        LLFFF().fg().LIZJ = true;
    }

    @Override // X.InterfaceC169246ka
    public boolean isRecording() {
        return LLILZIL().isRecording();
    }

    @Override // X.InterfaceC169246ka
    public void mh0() {
        boolean LIZIZ = C5TI.LIZIZ(LLIIZ(), LLLLIL());
        LJJZZI(new AqS7S0010000_2(LIZIZ, 20));
        InterfaceC135455Th LLILZIL = LLILZIL();
        AudioRecorderParam w5 = LLILZIL().w5();
        w5.setNeedOriginalSound(LIZIZ);
        LLILZIL.xA(w5);
        AudioRecorderParam audioRecorderParam = this.LJZL;
        if (audioRecorderParam == null) {
            return;
        }
        audioRecorderParam.setNeedOriginalSound(LIZIZ);
    }

    @Override // X.InterfaceC169246ka
    public boolean p4() {
        boolean z;
        Boolean bool;
        AudioRecorderParam audioRecorderParam;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" oldRecordParam == ");
        if (this.LJZI == null) {
            z = true;
        } else {
            z = false;
        }
        LIZ.append(z);
        LIZ.append(" , needOriginalSound = ");
        AudioRecorderParam audioRecorderParam2 = this.LJZL;
        if (audioRecorderParam2 != null) {
            bool = Boolean.valueOf(audioRecorderParam2.getNeedOriginalSound());
        } else {
            bool = null;
        }
        LIZ.append(bool);
        X1D.LIZIZ(LIZ);
        AudioRecorderParam audioRecorderParam3 = this.LJZI;
        if (audioRecorderParam3 == null || (audioRecorderParam = this.LJZL) == null) {
            return false;
        }
        return audioRecorderParam.hasChange(audioRecorderParam3, C5TI.LIZIZ(LLIIZ(), LLLLIL()));
    }

    @Override // X.AbstractC48231ut, X.InterfaceC145485nM
    public void show() {
        super.show();
        LLIFFJFJJ().Nr0("ae_record");
        this.LLD = true;
        LLIFFJFJJ().Yc(this.LLFII);
        LLILZLL();
        LLIZ();
        LLF().OZ(false);
        LJJZZI(new AqS168S0100000_2(this, 122));
        LLFFF().fg().LIZJ = false;
        LLIFFJFJJ().B60(new AqS152S0100000_2(this, 189));
    }

    @Override // X.InterfaceC169246ka
    public void xa() {
        C122034qd LJJI;
        NLEEditor nLEEditor;
        NLESegmentVideo LJJ;
        InterfaceC153045zY value = LLIIIL().Kh().getValue();
        if (value == null || (LJJI = C17N.LJJI(value)) == null || (nLEEditor = LJJI.LJIIJ) == null || (LJJ = NLESegmentVideo.LJJ(nLEEditor.LJ().getMainTrack().LJIILIIL(0).LJI())) == null || LJJ.LJJI() != null) {
            return;
        }
        NLEStyCanvas nLEStyCanvas = new NLEStyCanvas();
        nLEStyCanvas.setExtra("extra_canvas_style_from", "audioEditing");
        LJJ.LJJIII(nLEStyCanvas);
        nLEEditor.LIZIZ();
    }

    @Override // X.InterfaceC169246ka
    public AudioRecorderParam IM() {
        return this.LJZI;
    }

    @Override // X.AbstractC48231ut
    public InterfaceC65784Pro<C5TK> LJLJJLL() {
        return this.LLFFF;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLL;
    }

    @Override // X.InterfaceC169246ka
    public AudioRecorderParam w5() {
        return this.LJZL;
    }

    @Override // X.InterfaceC169246ka
    public void II(InterfaceC65784Pro<C76800UCe> block) {
        o.LJIIIZ(block, "block");
        LLF().LLJILJIL(false);
        LLILZIL().T80(NW(), null, C135555Tr.LJLIL, C135525To.LJLIL, new AqS165S0200000_2(this, (C135445Tg) block, (InterfaceC65784Pro<C76800UCe>) 1));
    }

    public final void LJLZ(Cert cert) {
        LLILZIL().EU(new AqS152S0100000_2(this, 182), C135495Tl.LJLIL, cert);
    }

    public final void LLJ(boolean z) {
        C5XM LLIIZ = LLIIZ();
        if (LLIIZ != null) {
            LLIIZ.RU(z);
        }
        LJJZZI(new AqS7S0010000_2(z, 18));
        InterfaceC135455Th LLILZIL = LLILZIL();
        AudioRecorderParam w5 = LLILZIL().w5();
        w5.setNeedOriginalSound(z);
        LLILZIL.xA(w5);
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", LLLLIL().getCreationId());
        c145995oB.LJI("content_source", H8F.LJI(LLLLIL()));
        c145995oB.LJI("content_type", H7R.LJIIIZ(LLLLIL()));
        c145995oB.LJI("enter_from", "video_edit_page");
        c145995oB.LJI("shoot_way", LLLLIL().mShootWay);
        c145995oB.LIZ(z ? 1 : 0, "status");
        c145995oB.LJI("enter_method", "click_audio_editing_panel");
        FMX.LJIIL("click_original_sound", c145995oB.LIZ);
    }

    @Override // X.InterfaceC169246ka
    public void LLJILJIL(boolean z) {
        LJJZZI(new AqS7S0010000_2(z, 19));
    }

    public final void LLJJIII(int i) {
        LJJZZI(new AqS27S0001000_2(i, 12));
    }

    @Override // X.InterfaceC169246ka
    public void Mq0(InterfaceC88472Yns<? super Boolean, C76800UCe> function) {
        o.LJIIIZ(function, "function");
        if (this.LLD) {
            AudioRecorderParam audioRecorderParam = this.LJZL;
            if (audioRecorderParam != null && AudioRecorderParam.hasChange$default(audioRecorderParam, LLILZIL().w5(), false, 2, null)) {
                LLFFF().Z80(LLILZIL().w5());
                AudioRecorderParam audioRecorderParam2 = new AudioRecorderParam();
                audioRecorderParam2.copyFrom(LLILZIL().w5());
                this.LJZL = audioRecorderParam2;
                function.invoke(Boolean.TRUE);
                return;
            }
            function.invoke(Boolean.FALSE);
            return;
        }
        function.invoke(Boolean.FALSE);
    }

    @Override // X.InterfaceC169246ka
    public void Z3(C5F9 callback) {
        o.LJIIIZ(callback, "callback");
        AudioRecorderParam audioRecorderParam = this.LJZI;
        AudioRecorderParam audioRecorderParam2 = this.LJZL;
        if (audioRecorderParam != null && audioRecorderParam2 != null) {
            cr0(new AqS149S0200000_2(this, callback, 19));
            return;
        }
        LLILZIL().Z3(callback);
        this.LJZI = null;
        this.LJZL = null;
    }

    @Override // X.InterfaceC169246ka
    public void cr0(final InterfaceC65784Pro<C76800UCe> block) {
        o.LJIIIZ(block, "block");
        LLILZIL().Vc0();
        AudioRecorderParam audioRecorderParam = this.LJZI;
        AudioRecorderParam audioRecorderParam2 = this.LJZL;
        if (audioRecorderParam != null && audioRecorderParam2 != null) {
            LLILZIL().l90(audioRecorderParam, audioRecorderParam2, new C5F9() { // from class: X.5Ti
                @Override // X.C5F9
                public final void LIZ() {
                    C1DH.LJJIJIIJI(new ARunnableS21S0200000_2(block, C135445Tg.this, 12));
                }

                @Override // X.C5F9
                public final void LIZIZ() {
                    C1DH.LJJIJIIJI(new ARunnableS38S0100000_2(C135445Tg.this, 54));
                }
            });
        } else {
            block.invoke();
        }
    }

    @Override // X.InterfaceC169246ka
    public void s(C5F9 callback) {
        o.LJIIIZ(callback, "callback");
        t7(NW(), null, C135545Tq.LJLIL, C135505Tm.LJLIL);
        this.LJZI = null;
        this.LJZL = null;
        LLILZIL().s(callback);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C135445Tg(WMH parentScene, C82622Wbi diContainer) {
        super(parentScene);
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLL = diContainer;
        this.LJLLI = UCI.LJI(getDiContainer(), C5U4.class, null);
        this.LJLLILLLL = UCI.LJI(getDiContainer(), InterfaceC143655kP.class, null);
        this.LJLLJ = UCI.LJI(getDiContainer(), C5VE.class, null);
        this.LJLLL = UCI.LJI(getDiContainer(), InterfaceC135455Th.class, null);
        this.LJLLLL = UCI.LJI(getDiContainer(), VideoPublishEditModel.class, null);
        this.LJLLLLLL = UCI.LJII(getDiContainer(), C5XM.class, null);
        this.LJLZ = UCI.LJII(getDiContainer(), InterfaceC139655dx.class, null);
        this.LJZ = UCI.LJI(getDiContainer(), InterfaceC135485Tk.class, null);
        this.LLF = C5FJ.IDLE;
        this.LLFFF = new AqS152S0100000_2(this, 188);
        this.LLFII = new AqS152S0100000_2(this, 185);
    }

    public final void LLJJI(Cert cert, String str) {
        LLILZIL().Eq(cert, new AqS152S0100000_2(this, 190));
        if (str.length() > 0) {
            LLILZIL().hu(str);
        }
    }

    public final void LLJI(boolean z, int i, Cert cert, String str) {
        LLILZIL().rg0(z, i, cert, new AqS152S0100000_2(this, 186), C135515Tn.LJLIL);
        LLFFF().Yq0();
        if (str.length() > 0) {
            LLILZIL().jY(str);
        }
    }

    @Override // X.InterfaceC169246ka
    public void t7(boolean z, Cert cert, InterfaceC65784Pro<C76800UCe> updateUIBeforePause, InterfaceC88472Yns<? super Boolean, C76800UCe> updateUIAfterPause) {
        o.LJIIIZ(updateUIBeforePause, "updateUIBeforePause");
        o.LJIIIZ(updateUIAfterPause, "updateUIAfterPause");
        LLILZIL().t7(z, cert, updateUIBeforePause, updateUIAfterPause);
    }
}
