package X;

import Y.AObjectS84S0100000_2;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.EditAudioRecordScene;
import kotlin.jvm.internal.o;

/* renamed from: X.5U1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5U1 extends AbstractC29891Fh<InterfaceC146665pG> implements InterfaceC146665pG, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLLILLLL;
    public final C82622Wbi LJLIL;
    public final WMH LJLILLLLZI;
    public final int LJLJI;
    public EditAudioRecordScene LJLJJI;
    public final InterfaceC115514g7 LJLJJL;
    public final InterfaceC115514g7 LJLJJLL;
    public final InterfaceC115514g7 LJLJL;
    public final C29901Fi<C76800UCe> LJLJLJ;
    public final LiveEvent<C76800UCe> LJLJLLL;
    public boolean LJLL;
    public final MutableLiveData<Boolean> LJLLI;

    static {
        TBT tbt = new TBT(C5U1.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLLILLLL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C5U1.class, "editVolumeV2Api", "getEditVolumeV2Api()Lcom/ss/android/ugc/gamora/editor/volume/EditVolumeV2Api;", 0, c65351Pkp), C61845OOz.LIZJ(C5U1.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0, c65351Pkp)};
    }

    public InterfaceC146665pG LJJLI() {
        return this;
    }

    @Override // X.InterfaceC146665pG
    public void LJJJJLI() {
        this.LJLJLJ.LJII(C76800UCe.LIZ);
    }

    public final VideoPublishEditModel LJJLIIIIJ() {
        return (VideoPublishEditModel) this.LJLJJL.LIZ(this, LJLLILLLL[0]);
    }

    public final InterfaceC143655kP LJJLIIIJILLIZJL() {
        return (InterfaceC143655kP) this.LJLJL.LIZ(this, LJLLILLLL[2]);
    }

    public final C5XM LJJLIIIJJI() {
        return (C5XM) this.LJLJJLL.LIZ(this, LJLLILLLL[1]);
    }

    @Override // X.InterfaceC146665pG
    public void LLD() {
        EditAudioRecordScene editAudioRecordScene = this.LJLJJI;
        if (editAudioRecordScene != null && (this.LJLL || editAudioRecordScene.needReset$tools_camera_edit_release())) {
            this.LJLL = false;
            WMH wmh = this.LJLILLLLZI;
            EditAudioRecordScene editAudioRecordScene2 = this.LJLJJI;
            if (editAudioRecordScene2 != null) {
                wmh.remove(editAudioRecordScene2);
                this.LJLJJI = null;
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        if (this.LJLJJI == null) {
            EditAudioRecordScene editAudioRecordScene3 = new EditAudioRecordScene(getDiContainer());
            this.LJLJJI = editAudioRecordScene3;
            this.LJLILLLLZI.add(this.LJLJI, editAudioRecordScene3, "EditAudioRecordScene");
        }
        EditAudioRecordScene editAudioRecordScene4 = this.LJLJJI;
        if (editAudioRecordScene4 != null) {
            editAudioRecordScene4.showOrHideScene$tools_camera_edit_release(true);
        } else {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    @Override // X.InterfaceC146665pG
    public void LLLLIILLL() {
        EditAudioRecordScene editAudioRecordScene = this.LJLJJI;
        if (editAudioRecordScene != null) {
            editAudioRecordScene.showOrHideScene$tools_camera_edit_release(false);
        }
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        uy().LIZLLL(this, new AObjectS84S0100000_2(this, 54));
    }

    @Override // X.InterfaceC146665pG
    public LiveData<Boolean> LLIIIZ() {
        return this.LJLLI;
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ InterfaceC146665pG getApiComponent() {
        LJJLI();
        return this;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC146665pG
    public LiveEvent<C76800UCe> uy() {
        return this.LJLJLLL;
    }

    @Override // X.InterfaceC146665pG
    public void mJ(boolean z) {
        this.LJLLI.setValue(Boolean.valueOf(z));
    }

    @Override // X.InterfaceC146665pG
    public void G4(float f, float f2) {
        if (LJJLIIIIJ().isStitchMode()) {
            if (LJJLIIIIJ().isMuted) {
                InterfaceC143655kP LJJLIIIJILLIZJL = LJJLIIIJILLIZJL();
                VEVolumeChangeOp ofVoice = VEVolumeChangeOp.ofVoice(0.0f);
                o.LJIIIIZZ(ofVoice, "ofVoice(0f)");
                LJJLIIIJILLIZJL.Dl0(ofVoice);
                InterfaceC143655kP LJJLIIIJILLIZJL2 = LJJLIIIJILLIZJL();
                VEVolumeChangeOp ofMusic = VEVolumeChangeOp.ofMusic(f);
                o.LJIIIIZZ(ofMusic, "ofMusic(musicRatio)");
                LJJLIIIJILLIZJL2.Dl0(ofMusic);
                return;
            }
            InterfaceC143655kP LJJLIIIJILLIZJL3 = LJJLIIIJILLIZJL();
            VEVolumeChangeOp ofVoice2 = VEVolumeChangeOp.ofVoice(f2);
            o.LJIIIIZZ(ofVoice2, "ofVoice(voiceRatio)");
            LJJLIIIJILLIZJL3.Dl0(ofVoice2);
            InterfaceC143655kP LJJLIIIJILLIZJL4 = LJJLIIIJILLIZJL();
            VEVolumeChangeOp ofMusic2 = VEVolumeChangeOp.ofMusic(f);
            o.LJIIIIZZ(ofMusic2, "ofMusic(musicRatio)");
            LJJLIIIJILLIZJL4.Dl0(ofMusic2);
            return;
        }
        if ((!LJJLIIIIJ().isFastImport && !LJJLIIIIJ().hasOriginalSound()) || LJJLIIIIJ().isMuted) {
            if (f == -1.0f) {
                return;
            }
            InterfaceC143655kP LJJLIIIJILLIZJL5 = LJJLIIIJILLIZJL();
            VEVolumeChangeOp ofMusic3 = VEVolumeChangeOp.ofMusic(f);
            o.LJIIIIZZ(ofMusic3, "ofMusic(musicRatio)");
            LJJLIIIJILLIZJL5.Dl0(ofMusic3);
            return;
        }
        if (f2 != -1.0f) {
            InterfaceC143655kP LJJLIIIJILLIZJL6 = LJJLIIIJILLIZJL();
            VEVolumeChangeOp ofVoice3 = VEVolumeChangeOp.ofVoice(f2);
            o.LJIIIIZZ(ofVoice3, "ofVoice(voiceRatio)");
            LJJLIIIJILLIZJL6.Dl0(ofVoice3);
        }
        if (LJJLIIIIJ().getMMusicPath() == null || f == -1.0f) {
            return;
        }
        InterfaceC143655kP LJJLIIIJILLIZJL7 = LJJLIIIJILLIZJL();
        VEVolumeChangeOp ofMusic4 = VEVolumeChangeOp.ofMusic(f);
        o.LJIIIIZZ(ofMusic4, "ofMusic(musicRatio)");
        LJJLIIIJILLIZJL7.Dl0(ofMusic4);
    }

    public C5U1(C82622Wbi diContainer, WMH parentScene, int i) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(parentScene, "parentScene");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = parentScene;
        this.LJLJI = i;
        this.LJLJJL = UCI.LJI(getDiContainer(), VideoPublishEditModel.class, null);
        this.LJLJJLL = UCI.LJII(getDiContainer(), C5XM.class, null);
        this.LJLJL = UCI.LJI(getDiContainer(), InterfaceC143655kP.class, null);
        C29901Fi<C76800UCe> c29901Fi = new C29901Fi<>();
        this.LJLJLJ = c29901Fi;
        this.LJLJLLL = c29901Fi;
        this.LJLLI = new MutableLiveData<>();
    }
}
