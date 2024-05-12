package X;

import Y.AObjectS86S0100000_7;
import Y.AObjectS89S0100000_14;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.ss.android.vesdk.VERecorder;
import com.ss.android.vesdk.effect.IEffect;
import com.ss.android.vesdk.filterparam.VEAudioLoudnessBalanceFilter;
import defpackage.e1;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.AqS27S0010000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.Wbu, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82634Wbu extends AbstractC29891Fh<WTW> implements WTW, InterfaceC135635Tz {
    public static final C82638Wby LJZ;
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJZI;
    public final C82622Wbi LJLIL;
    public final InterfaceC115514g7 LJLILLLLZI;
    public final InterfaceC115514g7 LJLJI;
    public final InterfaceC115514g7 LJLJJI;
    public final InterfaceC115514g7 LJLJJL;
    public final InterfaceC83624Wrs LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public int LJLJLLL;
    public String LJLL;
    public int LJLLI;
    public boolean LJLLILLLL;
    public final IAP LJLLJ;
    public String LJLLL;
    public boolean LJLLLL;
    public HJ0 LJLLLLLL;
    public final WTW LJLZ;

    static {
        TBT tbt = new TBT(C82634Wbu.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        C65352Pkq.LIZ.getClass();
        LJZI = new InterfaceC74236TBo[]{tbt, new TBT(C82634Wbu.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0), new TBT(C82634Wbu.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0), new TBT(C82634Wbu.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0)};
        LJZ = new C82638Wby();
    }

    public final boolean LJJLIIIJLLLLLLLZ() {
        if (e1.LIZ(31744, "enable_open_AEC_record_original_sound_with_music", true, false) && !getShortVideoContext().LJJJI() && !getShortVideoContext().LJJIJIIJI() && !C82636Wbw.LJFF) {
            return true;
        }
        return false;
    }

    public final void LJJLJ() {
        if (this.LJLJLLL != -1) {
            IEffect LIZIZ = getCameraApiComponent().rX().LJ().LIZIZ();
            if (LIZIZ != null) {
                LIZIZ.removeTrackFilter(this.LJLJLLL);
            }
            this.LJLJLLL = -1;
        }
    }

    public final void LJJLJLI() {
        if (this.LJLJLJ != -1) {
            IEffect LIZIZ = getCameraApiComponent().rX().LJ().LIZIZ();
            if (LIZIZ != null) {
                LIZIZ.removeTrackFilter(this.LJLJLJ);
            }
            this.LJLJLJ = -1;
        }
    }

    public final void LJJLL() {
        if (this.LJLLI != -1) {
            this.LJLJJLL.L9(this.LJLLJ);
            int removeTrackAlgorithm = this.LJLJJLL.getAudioController().removeTrackAlgorithm(this.LJLLI);
            this.LJLLI = -1;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("zyc audio removeTrackAlgorithm ret=");
            LIZ.append(removeTrackAlgorithm);
            H7B.LIZ(X1D.LIZIZ(LIZ));
        }
    }

    public final InterfaceC82086WJm getCameraApiComponent() {
        return (InterfaceC82086WJm) this.LJLJJI.LIZ(this, LJZI[2]);
    }

    public final I3X getRecordControlApi() {
        return (I3X) this.LJLJI.LIZ(this, LJZI[1]);
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LJLILLLLZI.LIZ(this, LJZI[0]);
    }

    public final I0N getStickerApiComponent() {
        return (I0N) this.LJLJJL.LIZ(this, LJZI[3]);
    }

    private final boolean LJJZZI() {
        if ((WJR.LIZ().enableMicButton && WJR.LIZ().enableAEC && !getShortVideoContext().LJJJI() && !getShortVideoContext().LJJIJIIJI()) || (WJU.LIZ().enableAEC && getShortVideoContext().LJJJI() && !C82636Wbw.LJFF)) {
            return true;
        }
        return false;
    }

    @Override // X.WTW
    public int AK() {
        return getShortVideoContext().recordBGMDelay;
    }

    public final void LJJLI() {
        int duetAVTrackIndex;
        int i;
        VERecorder LJ = getCameraApiComponent().rX().LJ();
        float f = getShortVideoContext().creativeModel.musicVolumeInfoModel.duetSrcLoudness;
        float LIZIZ = C47130Iec.LIZIZ();
        if (C47130Iec.LIZJ(Float.valueOf(f)) && C47130Iec.LIZJ(Float.valueOf(LIZIZ)) && (duetAVTrackIndex = LJ.LIZIZ.getDuetAVTrackIndex(1)) != -1) {
            VEAudioLoudnessBalanceFilter vEAudioLoudnessBalanceFilter = new VEAudioLoudnessBalanceFilter();
            double d = LIZIZ;
            if (getShortVideoContext().cameraComponentModel.isMuted) {
                i = C168356j9.LIZ.shootingPageBgmLoudnessBiasMicOff;
            } else {
                i = C168356j9.LIZ.shootingPageBgmLoudnessBiasMicOn;
            }
            vEAudioLoudnessBalanceFilter.targetLoudness = d + i;
            vEAudioLoudnessBalanceFilter.peakLoudness = 1.0E-6d;
            vEAudioLoudnessBalanceFilter.avgLoudness = f;
            vEAudioLoudnessBalanceFilter.isOnLine = false;
            vEAudioLoudnessBalanceFilter.isBGM = false;
            LJJLJ();
            this.LJLJLLL = LJ.LIZIZ().addTrackFilter(1, duetAVTrackIndex, vEAudioLoudnessBalanceFilter, 0, Integer.MAX_VALUE);
        }
    }

    public final void LJJLIIIIJ() {
        int i;
        VERecorder LJ = getCameraApiComponent().rX().LJ();
        float LJ2 = C47130Iec.LJ(getShortVideoContext().creativeModel.musicVolumeInfoModel.musicVolumeInfo);
        float LIZIZ = C47130Iec.LIZIZ();
        if (C47130Iec.LIZJ(Float.valueOf(LJ2)) && C47130Iec.LIZJ(Float.valueOf(LIZIZ))) {
            VEAudioLoudnessBalanceFilter vEAudioLoudnessBalanceFilter = new VEAudioLoudnessBalanceFilter();
            double d = LIZIZ;
            if (getShortVideoContext().cameraComponentModel.isMuted) {
                i = C168366jA.LIZ.shootingPageBgmLoudnessBiasMicOff;
            } else {
                i = C168366jA.LIZ.shootingPageBgmLoudnessBiasMicOn;
            }
            vEAudioLoudnessBalanceFilter.targetLoudness = d + i;
            vEAudioLoudnessBalanceFilter.peakLoudness = 1.0E-6d;
            vEAudioLoudnessBalanceFilter.avgLoudness = LJ2;
            vEAudioLoudnessBalanceFilter.isOnLine = false;
            vEAudioLoudnessBalanceFilter.isBGM = true;
            LJJLJLI();
            IEffect LIZIZ2 = LJ.LIZIZ();
            int bGMTrackIndex = LJ.LIZIZ.getBGMTrackIndex();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("bgm index is ");
            LIZ.append(bGMTrackIndex);
            P4Q.LIZ("VERecorder", X1D.LIZIZ(LIZ));
            this.LJLJLJ = LIZIZ2.addTrackFilter(1, LJ.LIZIZ.getBGMTrackIndex(), vEAudioLoudnessBalanceFilter, 0, Integer.MAX_VALUE);
        }
    }

    public final boolean LJJLIIIJJI() {
        if ((LJJZZI() && V16.LJJJIL(getShortVideoContext())) || (WJU.LIZ().enableAEC && getShortVideoContext().LJJJI() && !getShortVideoContext().cameraComponentModel.isMuted && !C82636Wbw.LJFF)) {
            return true;
        }
        return false;
    }

    public final boolean LJJLIIIJJIZ() {
        boolean z;
        boolean z2;
        boolean z3;
        if (getShortVideoContext().LJJJI() && !getShortVideoContext().cameraComponentModel.isMuted && WJU.LIZ().enableTimeAlignment) {
            z = true;
        } else {
            z = false;
        }
        if (getShortVideoContext().LJJIJIL() && getShortVideoContext().creativeModel.micDataModel.recordOriginalSoundWithBGM && e1.LIZ(31744, "enable_open_TA_record_original_sound_with_music", true, false)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (V16.LJJJIL(getShortVideoContext()) && !getShortVideoContext().cameraComponentModel.isMuted && WJR.LIZ().enableTimeAlignment) {
            z3 = true;
        } else {
            z3 = false;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RecordBGMComponent zyc audio enableAudioAlignModel, duetMic=");
        LIZ.append(z);
        LIZ.append(" enableRecordOriginalSoundWithBGM = ");
        LIZ.append(z2);
        H7B.LIZ(X1D.LIZIZ(LIZ));
        if ((z || z2 || z3) && !C82636Wbw.LJFF) {
            return true;
        }
        return false;
    }

    public final boolean LJJLIIJ() {
        boolean z;
        boolean z2;
        if (V16.LJJIJIL(getShortVideoContext()) && WJR.LIZ().enableLoudnessNorm) {
            z = true;
        } else {
            z = false;
        }
        if (getShortVideoContext().LJJJI() && !getShortVideoContext().cameraComponentModel.isMuted && WJU.LIZ().enableLoudnessNorm) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((z || z2) && !C82636Wbw.LJFF) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        boolean z;
        Intent LJJLIIIJILLIZJL;
        super.onCreate();
        Context LJIL = C78688UuS.LJIL(this);
        if (C82636Wbw.LIZIZ == null) {
            C82636Wbw.LIZ = C16880lQ.LLLLL(LJIL);
            C82636Wbw.LIZIZ = new C82635Wbv();
            boolean z2 = true;
            if (LJIL.getPackageManager().checkPermission("android.permission.BLUETOOTH", LJIL.getPackageName()) == 0) {
                z = true;
            } else {
                z = false;
            }
            C82636Wbw.LIZJ = z;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.HEADSET_PLUG");
            intentFilter.addAction("android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
            Context context = C82636Wbw.LIZ;
            if (context != null && (LJJLIIIJILLIZJL = C16880lQ.LJJLIIIJILLIZJL(C82636Wbw.LIZIZ, context, intentFilter)) != null) {
                if (LJJLIIIJILLIZJL.getIntExtra("state", 0) != 1) {
                    z2 = false;
                }
                if (C82636Wbw.LIZLLL != z2) {
                    C82636Wbw.LIZLLL = z2;
                    C6QQ.LIZ(new AqS27S0010000_14(z2, 1));
                }
                boolean LIZ = C82636Wbw.LIZ();
                if (C82636Wbw.LJ != LIZ) {
                    C82636Wbw.LJ = LIZ;
                    C6QQ.LIZ(new AqS27S0010000_14(LIZ, 0));
                }
            }
        }
        if (LJJLIIIJLLLLLLLZ() || LJJZZI()) {
            InterfaceC83624Wrs asCameraView = this.LJLJJLL;
            C43965HNh c43965HNh = new C43965HNh(this);
            o.LJIIIZ(asCameraView, "asCameraView");
            AbstractC45908I0a.LIZ(new I0X(c43965HNh));
        }
        if (!C39579Fg7.LIZIZ(this.LJLL)) {
            LJJLIIIJILLIZJL(new AqS180S0100000_14(this, 128), HDV.LJLIL);
        }
        getRecordControlApi().s10().LIZLLL(this, new AObjectS89S0100000_14(this, 133));
        getRecordControlApi().Li().LIZLLL(this, new AObjectS86S0100000_7(this, 36));
        getRecordControlApi().aL().LIZLLL(this, new AObjectS86S0100000_7(this, 37));
        getRecordControlApi().Rr0().LIZLLL(this, new AObjectS86S0100000_7(this, 38));
        getShortVideoContext().creativeModel.audioAlgorithmModel.shootVolumeStart = (float) C47636Imm.LJII(2);
    }

    @Override // X.AbstractC29891Fh
    public void onDestroy() {
        super.onDestroy();
        LJJLL();
        try {
            Context context = C82636Wbw.LIZ;
            if (context != null) {
                C16880lQ.LJJLIIIJL(context, C82636Wbw.LIZIZ);
            }
        } catch (Exception e) {
            H78.LJ(e);
        }
        C82636Wbw.LJI.clear();
        C82636Wbw.LIZIZ = null;
        C82636Wbw.LIZ = null;
        C82636Wbw.LIZLLL = false;
        C82636Wbw.LJ = false;
        C82636Wbw.LIZJ = false;
        C82636Wbw.LJFF = false;
        int i = this.LJLJL;
        VERecorder recorder = getCameraApiComponent().rX().LJ();
        o.LJIIIZ(recorder, "recorder");
        if (i != -1) {
            recorder.LIZIZ().removeTrackFilter(i);
        }
        LJJLJLI();
        LJJLJ();
        HJ0 hj0 = this.LJLLLLLL;
        if (hj0 != null) {
            this.LJLJJLL.q9(hj0);
        }
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ WTW getApiComponent() {
        return this.LJLZ;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public C82634Wbu(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = UCI.LJI(getDiContainer(), ShortVideoContext.class, null);
        this.LJLJI = UCI.LJI(getDiContainer(), I3X.class, null);
        this.LJLJJI = UCI.LJI(getDiContainer(), InterfaceC82086WJm.class, null);
        this.LJLJJL = UCI.LJII(getDiContainer(), I0N.class, null);
        this.LJLJJLL = getCameraApiComponent().e8();
        this.LJLJL = -1;
        this.LJLJLJ = -1;
        this.LJLJLLL = -1;
        this.LJLLI = -1;
        this.LJLLJ = new IAP((InterfaceC81640W2i) getDiContainer().LJIIIIZZ(null, InterfaceC81640W2i.class), this, EnumC45994I3i.NORMAL, new WU2(this));
        this.LJLZ = this;
    }

    @Override // X.WTW
    public void rn0(int i) {
        getShortVideoContext().recordBGMDelay = i;
    }

    private final void LJJLIIIJILLIZJL(InterfaceC88472Yns<? super String, C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<? super Exception, C76800UCe> interfaceC88472Yns2) {
        DownloadableModelSupport.getInstance().fetchResourcesByRequirementsAndModelNames(new String[]{"AudioTimeAlignModel"}, C113554cx.LJJLIIIIJ(new OSZ("AudioTimeAlignModel", C47261Igj.LJJIJIL("time_align_44k.model"))), new C45961I2b(interfaceC88472Yns, interfaceC88472Yns2));
    }
}
