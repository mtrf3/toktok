package X;

import Y.AObjectS84S0100000_2;
import com.ss.android.ugc.aweme.ftc.components.audiorecord.FTCEditAudioRecordScene;
import com.ss.android.ugc.aweme.ftc.components.audiorecord.FTCEditAudioRecordState;
import com.ss.android.ugc.aweme.ftc.components.audiorecord.FTCEditAudioRecordViewModel;
import com.ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.AqS184S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6Kl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C158636Kl extends AbstractC163776bl<FTCEditAudioRecordViewModel> implements InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLLLL;
    public final C82622Wbi LJLJLJ;
    public final WMH LJLJLLL;
    public final int LJLL;
    public final C62822Ol8 LJLLI;
    public final C82632Wbs LJLLILLLL;
    public final C5H3 LJLLJ;
    public final C158656Kn LJLLL;

    static {
        TBT tbt = new TBT(C158636Kl.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C65352Pkq.LIZ.getClass();
        LJLLLL = new InterfaceC74236TBo[]{tbt};
    }

    @Override // X.AbstractC165596eh
    public final void LJJLIIIJJIZ() {
        ((FTCEditAudioRecordScene) this.LJLLI.getValue()).showOrHideScene$tools_camera_edit_release(false);
    }

    @Override // X.AbstractC165596eh
    public final void LJJLIIIJLLLLLLLZ() {
        ((FTCEditAudioRecordScene) this.LJLLI.getValue()).showOrHideScene$tools_camera_edit_release(true);
    }

    public final VideoPublishEditModel LJJLIIJ() {
        return (VideoPublishEditModel) this.LJLLILLLL.LIZ(this, LJLLLL[0]);
    }

    public final InterfaceC143655kP LJJLJ() {
        return (InterfaceC143655kP) this.LJLLJ.getValue();
    }

    @Override // X.AbstractC165596eh, X.AbstractC29891Fh
    public final void onCreate() {
        super.onCreate();
        C73156SnQ.LJIIIIZZ(this, LJJLIIIJJI(), new TBT() { // from class: X.6Km
            @Override // X.TBT, X.TBZ, X.TBW
            public final Object get(Object obj) {
                return ((FTCEditAudioRecordState) obj).getClearAudioData();
            }
        }, new AqS184S0100000_2(this, 15));
        ((FTCEditAudioRecordViewModel) LJJLIIIJJI()).LJLJLLL.LIZLLL(this, new AObjectS84S0100000_2(this, 12));
    }

    @Override // X.AbstractC165596eh
    public final WMH LJJLI() {
        return this.LJLJLLL;
    }

    @Override // X.AbstractC165596eh
    public final InterfaceC65784Pro<FTCEditAudioRecordViewModel> LJJLIIIJILLIZJL() {
        return this.LJLLL;
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLJLJ;
    }

    public C158636Kl(C82622Wbi diContainer, WMH parentScene) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(parentScene, "parentScene");
        this.LJLJLJ = diContainer;
        this.LJLJLLL = parentScene;
        this.LJLL = R.id.fns;
        this.LJLLI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 75));
        this.LJLLILLLL = UCI.LJI(diContainer, VideoPublishEditModel.class, null);
        this.LJLLJ = C269113v.LIZ(this, InterfaceC143655kP.class);
        this.LJLLL = C158656Kn.LJLIL;
    }

    public final void G4(float f, float f2) {
        if (LJJLIIJ().isStitchMode()) {
            if (LJJLIIJ().isMuted) {
                InterfaceC143655kP LJJLJ = LJJLJ();
                VEVolumeChangeOp ofVoice = VEVolumeChangeOp.ofVoice(0.0f);
                o.LJIIIIZZ(ofVoice, "ofVoice(0f)");
                LJJLJ.Dl0(ofVoice);
                InterfaceC143655kP LJJLJ2 = LJJLJ();
                VEVolumeChangeOp ofMusic = VEVolumeChangeOp.ofMusic(f);
                o.LJIIIIZZ(ofMusic, "ofMusic(musicRatio)");
                LJJLJ2.Dl0(ofMusic);
                return;
            }
            InterfaceC143655kP LJJLJ3 = LJJLJ();
            VEVolumeChangeOp ofVoice2 = VEVolumeChangeOp.ofVoice(f2);
            o.LJIIIIZZ(ofVoice2, "ofVoice(voiceRatio)");
            LJJLJ3.Dl0(ofVoice2);
            InterfaceC143655kP LJJLJ4 = LJJLJ();
            VEVolumeChangeOp ofMusic2 = VEVolumeChangeOp.ofMusic(f);
            o.LJIIIIZZ(ofMusic2, "ofMusic(musicRatio)");
            LJJLJ4.Dl0(ofMusic2);
            return;
        }
        if ((!LJJLIIJ().isFastImport && !LJJLIIJ().hasOriginalSound()) || LJJLIIJ().isMuted) {
            if (f == -1.0f) {
                return;
            }
            InterfaceC143655kP LJJLJ5 = LJJLJ();
            VEVolumeChangeOp ofMusic3 = VEVolumeChangeOp.ofMusic(f);
            o.LJIIIIZZ(ofMusic3, "ofMusic(musicRatio)");
            LJJLJ5.Dl0(ofMusic3);
            return;
        }
        if (f2 != -1.0f) {
            InterfaceC143655kP LJJLJ6 = LJJLJ();
            VEVolumeChangeOp ofVoice3 = VEVolumeChangeOp.ofVoice(f2);
            o.LJIIIIZZ(ofVoice3, "ofVoice(voiceRatio)");
            LJJLJ6.Dl0(ofVoice3);
        }
        if (LJJLIIJ().getMMusicPath() == null || f == -1.0f) {
            return;
        }
        InterfaceC143655kP LJJLJ7 = LJJLJ();
        VEVolumeChangeOp ofMusic4 = VEVolumeChangeOp.ofMusic(f);
        o.LJIIIIZZ(ofMusic4, "ofMusic(musicRatio)");
        LJJLJ7.Dl0(ofMusic4);
    }
}
