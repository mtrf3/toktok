package X;

import Y.AObjectS84S0100000_2;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.als.LiveEvent;
import com.bytedance.jedi.arch.JediViewModel;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS0S0000001_2;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS27S0001000_2;
import kotlin.jvm.internal.AqS7S0010000_2;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.5jn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC143275jn extends AbstractC48231ut<C5XM, C5YH, C5Y5, C5YC> implements C5XM, InterfaceC135635Tz, InterfaceC143795kd {
    public static final C5YO LLF;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLFF;
    public static final float LLFFF;
    public static final float LLFII;
    public static final float LLFZ;
    public static final float LLI;
    public final C82622Wbi LJLL;
    public final InterfaceC65784Pro<C5Y5> LJLLI;
    public final InterfaceC65784Pro<C5YC> LJLLILLLL;
    public final InterfaceC115514g7 LJLLJ;
    public final InterfaceC115514g7 LJLLL;
    public final InterfaceC115514g7 LJLLLL;
    public final InterfaceC115514g7 LJLLLLLL;
    public final InterfaceC115514g7 LJLZ;
    public final InterfaceC115514g7 LJZ;
    public final InterfaceC115514g7 LJZI;
    public final InterfaceC115514g7 LJZL;
    public final InterfaceC115514g7 LL;
    public float LLD;

    private final void LLJJ() {
        boolean z;
        String string = C78688UuS.LJIJJ(this).getString(R.string.hzr);
        o.LJIIIIZZ(string, "activity.getString(R.string.man_voice)");
        if (!LJZI() || (LLIZ().isCurrentAutoCutMode() && LLIZ().voiceVolume == 0.0f)) {
            z = false;
        } else {
            z = true;
        }
        boolean LJLZ = LJLZ();
        boolean z2 = !C44384HbQ.LJLJL(LLIZ());
        if (!z) {
            LLIZ().voiceVolume = 0.0f;
        }
        if (!LJLZ) {
            LLIZ().musicVolume = 0.0f;
        }
        LJJZZI(new C5Y8(this, z, LJLZ, z2, string));
    }

    public abstract boolean LJLZ();

    public abstract boolean LJZI();

    public abstract void LLF(VEVolumeChangeOp vEVolumeChangeOp);

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

    /* JADX WARN: Type inference failed for: r0v19, types: [X.5YO] */
    static {
        TBT tbt = new TBT(AbstractC143275jn.class, "editMusicApi", "getEditMusicApi()Lcom/ss/android/ugc/gamora/editor/music/EditMusicApi;", 0);
        C65352Pkq.LIZ.getClass();
        LLFF = new InterfaceC74236TBo[]{tbt, new TBT(AbstractC143275jn.class, "editorProApi", "getEditorProApi()Lcom/ss/android/ugc/gamora/editorpro/EditorProApi;", 0), new TBT(AbstractC143275jn.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0), new TBT(AbstractC143275jn.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0), new TBT(AbstractC143275jn.class, "editSubtitleApi", "getEditSubtitleApi()Lcom/ss/android/ugc/gamora/editor/subtitle/EditSubtitleApi;", 0), new TBT(AbstractC143275jn.class, "editAdapterApi", "getEditAdapterApi()Lcom/ss/android/ugc/gamora/editor/adapter/EditAdapterApi;", 0), new TBT(AbstractC143275jn.class, "lighteningMusicApi", "getLighteningMusicApi()Lcom/ss/android/ugc/gamora/editor/lightening/music/LighteningMusicApi;", 0), new TBT(AbstractC143275jn.class, "editAudioCopyrightDetectApi", "getEditAudioCopyrightDetectApi()Lcom/ss/android/ugc/gamora/editor/audio/copyrightdetect/EditAudioCopyrightDetectApi;", 0), new TBT(AbstractC143275jn.class, "editAutoSaveDraftApi", "getEditAutoSaveDraftApi()Lcom/ss/android/ugc/gamora/editor/draft/EditAutoSaveDraftApi;", 0)};
        LLF = new Object() { // from class: X.5YO
        };
        LLFFF = WUK.LJIIZILJ;
        LLFII = WUK.LJIJ;
        LLFZ = WUK.LJIJI;
        LLI = WUK.LJIJJ;
    }

    private final InterfaceC142515iZ LLFFF() {
        return (InterfaceC142515iZ) this.LJZ.LIZ(this, LLFF[5]);
    }

    private final InterfaceC143385jy LLIFFJFJJ() {
        return (InterfaceC143385jy) this.LJZL.LIZ(this, LLFF[7]);
    }

    private final InterfaceC150685vk LLIIIL() {
        return (InterfaceC150685vk) this.LL.LIZ(this, LLFF[8]);
    }

    private final InterfaceC145325n6 LLIILZL() {
        return (InterfaceC145325n6) this.LJLLJ.LIZ(this, LLFF[0]);
    }

    private final InterfaceC136115Vv LLILZIL() {
        return (InterfaceC136115Vv) this.LJLLL.LIZ(this, LLFF[1]);
    }

    private final InterfaceC145405nE LLILZLL() {
        return (InterfaceC145405nE) this.LJZI.LIZ(this, LLFF[6]);
    }

    @Override // X.C5XM
    public boolean EN() {
        return ((Boolean) LJJLIIIJILLIZJL(new TBT() { // from class: X.5k2
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C5Y5) obj).LJFF);
            }
        }).LIZ()).booleanValue();
    }

    @Override // X.C5XM
    public boolean F10() {
        return ((Boolean) LJJLIIIJILLIZJL(new TBT() { // from class: X.5YM
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C5Y5) obj).LIZLLL);
            }
        }).LIZ()).booleanValue();
    }

    public final InterfaceC143655kP LLIIZ() {
        return (InterfaceC143655kP) this.LJLLLLLL.LIZ(this, LLFF[3]);
    }

    public final InterfaceC143855kj LLILL() {
        return (InterfaceC143855kj) this.LJLZ.LIZ(this, LLFF[4]);
    }

    public final VideoPublishEditModel LLIZ() {
        return (VideoPublishEditModel) this.LJLLLL.LIZ(this, LLFF[2]);
    }

    private final void LLJ() {
        LiveEvent<Boolean> vQ;
        InterfaceC145325n6 LLIILZL = LLIILZL();
        if (LLIILZL != null && (vQ = LLIILZL.vQ()) != null) {
            vQ.LIZLLL(this, new AObjectS84S0100000_2(this, 214));
        }
    }

    public final boolean LLJI() {
        if ((!LLIZ().hasOriginalSound(HRX.LIZLLL()) && !C44384HbQ.LJLL(LLIZ())) || LLIZ().isMuted || LLIZ().isStitchMode() || LLIZ().isLibraryMaterialUsed()) {
            return false;
        }
        return true;
    }

    public void LLJJI() {
        if (!LLIZ().creativeModel.postPageModel.isEnterFromEPDirectly) {
            LLIIZ().U2(true, false, true);
        } else {
            InterfaceC136115Vv LLILZIL = LLILZIL();
            if (LLILZIL != null) {
                LLILZIL.mt0();
            }
        }
        try {
            InterfaceC150685vk LLIIIL = LLIIIL();
            if (LLIIIL != null) {
                LLIIIL.Pr();
            }
            int intValue = ((Number) LJJLIIIJILLIZJL(new TBT() { // from class: X.5Y3
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return Integer.valueOf(((C5Y5) obj).LIZ);
                }
            }).LIZ()).intValue();
            int intValue2 = ((Number) LJJLIIIJILLIZJL(new TBT() { // from class: X.5Y1
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return Integer.valueOf(((C5Y5) obj).LIZIZ);
                }
            }).LIZ()).intValue();
            C43882HKc.LIZ.LJIILLIIL("aweme_short_video_volume_set", null, new JSONObject().put("mVoiceVolume", intValue).put("mMusicVolume", intValue2).put("mRecordVolume", ((Number) LJJLIIIJILLIZJL(new TBT() { // from class: X.5Xz
                @Override // X.TBT, X.TBZ, X.TBW
                public final Object get(Object obj) {
                    return Integer.valueOf(((C5Y5) obj).LIZJ);
                }
            }).LIZ()).intValue()));
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        hide();
    }

    @Override // X.AbstractC48231ut, X.InterfaceC145485nM
    public void hide() {
        int i;
        InterfaceC145405nE LLILZLL;
        C6EF yu0;
        C6EJ LIZJ;
        super.hide();
        InterfaceC143385jy LLIFFJFJJ = LLIFFJFJJ();
        if (LLIFFJFJJ != null && (yu0 = LLIFFJFJJ.yu0()) != null && (LIZJ = yu0.LIZJ()) != null) {
            i = LIZJ.LIZ();
        } else {
            i = -1;
        }
        if (C146535p3.LIZJ(i) && (LLILZLL = LLILZLL()) != null) {
            LLILZLL.I30(null);
        }
        LJJZZI(C143315jr.LJLIL);
    }

    @Override // X.AbstractC48231ut, X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        InterfaceC142515iZ LLFFF2 = LLFFF();
        if (LLFFF2 != null) {
            LLFFF2.Ll(this);
        }
        LLJJ();
        LLJ();
    }

    @Override // X.AbstractC29891Fh
    public void onDestroy() {
        super.onDestroy();
        InterfaceC142515iZ LLFFF2 = LLFFF();
        if (LLFFF2 != null) {
            LLFFF2.Ll(null);
        }
    }

    @Override // X.AbstractC48231ut, X.InterfaceC145485nM
    public void show() {
        super.show();
        LLIIZ().U2(false, false, false);
        LJJZZI(C143325js.LJLIL);
    }

    @Override // X.C5XM
    public void I90() {
        LLJJ();
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<C5Y5> LJJLIIIJJI() {
        return this.LJLLI;
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<C5YC> LJJLIIIJJIZ() {
        return this.LJLLILLLL;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLL;
    }

    @Override // X.InterfaceC73149SnJ
    public /* bridge */ /* synthetic */ AML getReceiver() {
        getReceiver2();
        return this;
    }

    @Override // X.C5XM
    public void DE(boolean z) {
        Fu0(z);
        Fv(z);
    }

    @Override // X.C5XM
    public void Dz(float f) {
        if (!LJLZ()) {
            return;
        }
        LLJJL(f, true);
    }

    @Override // X.C5XM
    public void Fu0(boolean z) {
        float f = 0.0f;
        if (LLIZ().voiceVolume == 0.0f) {
            return;
        }
        if (z) {
            f = LLIZ().voiceVolume;
        }
        VEVolumeChangeOp ofVoice = VEVolumeChangeOp.ofVoice(f);
        o.LJIIIIZZ(ofVoice, "ofVoice(if (isEnable) model.voiceVolume else 0f)");
        LLF(ofVoice);
    }

    @Override // X.C5XM
    public void Fv(boolean z) {
        float f = 0.0f;
        if (LLIZ().musicVolume == 0.0f) {
            return;
        }
        if (z) {
            f = LLIZ().musicVolume;
        }
        VEVolumeChangeOp ofMusic = VEVolumeChangeOp.ofMusic(f);
        o.LJIIIIZZ(ofMusic, "ofMusic(if (isEnable) model.musicVolume else 0f)");
        LLF(ofMusic);
    }

    public final void LLJJIII(int i) {
        LLJLIL(this, (i * 1.0f) / 100, false, 2, null);
    }

    public final void LLJJIJI(int i) {
        LLJZIJLIL(this, (i * 1.0f) / 100, false, 2, null);
    }

    public final void LLJJIJIL(int i) {
        H8F.LJJJJZI(LLIZ(), i, "background");
        LJJZZI(new AqS27S0001000_2(i, 24));
    }

    public final void LLJJJIL(int i) {
        H8F.LJJJJZI(LLIZ(), i, "voice");
        LJJZZI(new AqS27S0001000_2(i, 25));
    }

    @Override // X.C5XM
    public void RU(boolean z) {
        boolean z2;
        if (z && !LLIZ().isGifMaterialOnly()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (((Boolean) LJJLIIIJILLIZJL(new TBT() { // from class: X.5YN
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C5Y5) obj).LIZLLL);
            }
        }).LIZ()).booleanValue() == z2) {
            return;
        }
        AudioRecorderParam audioRecorderParam = LLIZ().veAudioRecorderParam;
        if (audioRecorderParam == null) {
            audioRecorderParam = new AudioRecorderParam();
        }
        if (LLIZ().veAudioRecorderParam == null) {
            LLIZ().veAudioRecorderParam = audioRecorderParam;
        }
        audioRecorderParam.setNeedOriginalSound(z);
        if (z && !LJZI()) {
            return;
        }
        float f = 0.0f;
        if (!z2) {
            audioRecorderParam.setVoiceVolume(LLIZ().voiceVolume);
        } else {
            if (audioRecorderParam.getVoiceVolume() == 0.0f) {
                audioRecorderParam.setVoiceVolume(LLFFF);
            }
            f = audioRecorderParam.getVoiceVolume();
        }
        LLJLLIL(f, true);
        LJJZZI(new AqS7S0010000_2(z2, 35));
        InterfaceC145325n6 LLIILZL = LLIILZL();
        if (LLIILZL != null) {
            LLIILZL.Ei();
        }
        InterfaceC150685vk LLIIIL = LLIIIL();
        if (LLIIIL != null) {
            LLIIIL.Pr();
        }
    }

    @Override // X.C5XM
    public void U70(boolean z) {
        if (((Boolean) LJJLIIIJILLIZJL(new TBT() { // from class: X.5YA
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C5Y5) obj).LJ);
            }
        }).LIZ()).booleanValue() == z) {
            return;
        }
        if (z && !LJLZ()) {
            return;
        }
        float f = 0.0f;
        if (!z) {
            this.LLD = LLIZ().musicVolume;
        } else {
            if (this.LLD == 0.0f) {
                this.LLD = LLFZ;
            }
            f = this.LLD;
        }
        LLJJL(f, true);
        LJJZZI(new AqS7S0010000_2(z, 34));
    }

    public <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at> S1 getState(VM1 vm1) {
        return (S1) C73297Sph.LIZIZ(this, vm1);
    }

    @Override // X.C5XM
    public void og(boolean z) {
        float f;
        if (((Boolean) LJJLIIIJILLIZJL(new TBT() { // from class: X.5k1
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return Boolean.valueOf(((C5Y5) obj).LJFF);
            }
        }).LIZ()).booleanValue() == z) {
            return;
        }
        float f2 = 0.0f;
        if (!z) {
            MusicBuzModel musicBuzModel = LLIZ().creativeModel.musicBuzModel;
            AudioRecorderParam audioRecorderParam = LLIZ().veAudioRecorderParam;
            if (audioRecorderParam != null) {
                f = audioRecorderParam.getRecordVolume();
            } else {
                f = 1.0f;
            }
            musicBuzModel.stsRecordVolume = f;
        } else {
            if (LLIZ().creativeModel.musicBuzModel.stsRecordVolume == 0.0f) {
                LLIZ().creativeModel.musicBuzModel.stsRecordVolume = LLFZ;
            }
            f2 = LLIZ().creativeModel.musicBuzModel.stsRecordVolume;
        }
        LLLFFI(f2, false);
        LJJZZI(new AqS7S0010000_2(z, 36));
    }

    @Override // X.C5XM
    public void ut(boolean z) {
        RU(z);
        U70(z);
    }

    @Override // X.C5XM
    public void vB(float f) {
        LLLFFI(f, true);
    }

    @Override // X.C5XM
    public void vt0(float f) {
        if (!LJZI()) {
            return;
        }
        LLJLLIL(f, true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC143275jn(WMH parentScene, C82622Wbi diContainer) {
        super(parentScene);
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLL = diContainer;
        this.LJLLI = new AqS152S0100000_2(this, 523);
        this.LJLLILLLL = new AqS152S0100000_2(this, 524);
        this.LJLLJ = UCI.LJII(getDiContainer(), InterfaceC145325n6.class, null);
        this.LJLLL = UCI.LJII(getDiContainer(), InterfaceC136115Vv.class, null);
        this.LJLLLL = UCI.LJI(getDiContainer(), VideoPublishEditModel.class, null);
        this.LJLLLLLL = UCI.LJI(getDiContainer(), InterfaceC143655kP.class, null);
        this.LJLZ = UCI.LJII(getDiContainer(), InterfaceC143855kj.class, null);
        this.LJZ = UCI.LJII(getDiContainer(), InterfaceC142515iZ.class, null);
        this.LJZI = UCI.LJII(getDiContainer(), InterfaceC145405nE.class, null);
        this.LJZL = UCI.LJII(getDiContainer(), InterfaceC143385jy.class, null);
        this.LL = UCI.LJII(getDiContainer(), InterfaceC150685vk.class, null);
        this.LLD = LLIZ().musicVolume;
    }

    private final void LLJLLIL(float f, boolean z) {
        if (f < 0.0f || f > LLFII) {
            return;
        }
        VEVolumeChangeOp ofVoice = VEVolumeChangeOp.ofVoice(f);
        o.LJIIIIZZ(ofVoice, "ofVoice(volume)");
        LLF(ofVoice);
        LLIZ().voiceVolume = f;
        if (!z) {
            return;
        }
        LJJZZI(new AqS0S0000001_2(f, 6));
    }

    private final void LLLFFI(float f, boolean z) {
        if (f < 0.0f || f > LLFII) {
            return;
        }
        AudioRecorderParam audioRecorderParam = LLIZ().veAudioRecorderParam;
        if (audioRecorderParam == null) {
            audioRecorderParam = new AudioRecorderParam();
        }
        if (LLIZ().veAudioRecorderParam == null) {
            LLIZ().veAudioRecorderParam = audioRecorderParam;
        }
        audioRecorderParam.setNeedOriginalSound(F10());
        VEVolumeChangeOp ofRecord = VEVolumeChangeOp.ofRecord(f);
        o.LJIIIIZZ(ofRecord, "ofRecord(volume)");
        LLF(ofRecord);
        AudioRecorderParam audioRecorderParam2 = LLIZ().veAudioRecorderParam;
        if (audioRecorderParam2 != null) {
            audioRecorderParam2.setRecordVolume(f);
        }
        if (!z) {
            return;
        }
        LJJZZI(new AqS0S0000001_2(f, 7));
    }

    public void LLJJL(float f, boolean z) {
        if (f < 0.0f || f > LLI) {
            return;
        }
        VEVolumeChangeOp ofMusic = VEVolumeChangeOp.ofMusic(f);
        o.LJIIIIZZ(ofMusic, "ofMusic(volume)");
        LLF(ofMusic);
        LLIZ().musicVolume = f;
        if (!z) {
            return;
        }
        LJJZZI(new AqS0S0000001_2(f, 5));
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

    public static /* synthetic */ void LLJLIL(AbstractC143275jn abstractC143275jn, float f, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = false;
            }
            abstractC143275jn.LLJJL(f, z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setMusicVolumeInternal");
    }

    public static /* synthetic */ void LLJZIJLIL(AbstractC143275jn abstractC143275jn, float f, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = false;
            }
            abstractC143275jn.LLJLLIL(f, z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOriginalSoundVolumeInternal");
    }

    public static /* synthetic */ void LLLFZ(AbstractC143275jn abstractC143275jn, float f, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = false;
            }
            abstractC143275jn.LLLFFI(f, z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setRecordVolumeInternal");
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
