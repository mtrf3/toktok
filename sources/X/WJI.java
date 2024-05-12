package X;

import Y.AObjectS89S0100000_14;
import android.app.Activity;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.cert.token.TokenCert;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WJI extends WJB {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLLI;
    public final LifecycleOwner LJLJI;
    public final C82622Wbi LJLJJI;
    public final InterfaceC65784Pro<C76800UCe> LJLJJL;
    public final int LJLJJLL;
    public final C82632Wbs LJLJL;
    public final C82632Wbs LJLJLJ;
    public final C82632Wbs LJLJLLL;
    public final WJM LJLL;

    static {
        TBT tbt = new TBT(WJI.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLLI = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(WJI.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(WJI.class, "activity", "getActivity()Landroid/app/Activity;", 0, c65351Pkp)};
    }

    public WJI() {
        throw null;
    }

    @Override // X.WJB
    public final void LIZLLL() {
        ((WLT) this.LJLJLJ.LIZ(this, LJLLI[1])).kw().LIZLLL(this.LJLJI, new AObjectS89S0100000_14(this, 424));
    }

    @Override // X.WJB
    public final void LJFF() {
        if (this.LJLL.LIZ != EnumC147935rJ.DISABLE_CLICK) {
            int i = 2;
            if (!C78605Ut7.LJFF("android.permission.RECORD_AUDIO")) {
                if (C53210KuU.LIZ()) {
                    OHI ohi = OHI.LIZ;
                    C82632Wbs c82632Wbs = this.LJLJLLL;
                    InterfaceC74236TBo<?>[] interfaceC74236TBoArr = LJLLI;
                    Activity activity = (Activity) c82632Wbs.LIZ(this, interfaceC74236TBoArr[2]);
                    ohi.getClass();
                    C61099NyR.LIZIZ.LIZIZ((Activity) this.LJLJLLL.LIZ(this, interfaceC74236TBoArr[2]), TokenCert.Companion.with("bpea-request_audio_by_click_mic_new")).LIZ("android.permission.RECORD_AUDIO").LIZJ(new WJK(OHI.LJI(activity, "android.permission.RECORD_AUDIO"), this));
                    return;
                }
                return;
            }
            if (V16.LJJJIL(LJIIIZ())) {
                if (LJIIIZ().cameraComponentModel.isMuted) {
                    HKZ.LIZ(LJIIIZ(), "on");
                } else {
                    HKZ.LIZ(LJIIIZ(), "off");
                }
            }
            if (LJIIIZ().cameraComponentModel.isMuted) {
                i = 1;
            }
            C05L.LIZJ(i, (InterfaceC82086WJm) this.LJLJLJ.LIZ(this, LJLLI[1]));
        }
    }

    public final ShortVideoContext LJIIIZ() {
        return (ShortVideoContext) this.LJLJL.LIZ(this, LJLLI[0]);
    }

    @Override // X.WJB
    public final boolean LJIIIIZZ() {
        if (V16.LJJLIIIJILLIZJL(LJIIIZ())) {
            return true;
        }
        C78934UyQ.LJLIL.LIZLLL().getClass();
        if (L95.LIZIZ()) {
            return true;
        }
        ShortVideoContext LJIIIZ = LJIIIZ();
        boolean z = WJR.LIZ().enableMicButton;
        if (V16.LJJLIIIJILLIZJL(LJIIIZ) || z) {
            return true;
        }
        return false;
    }

    @Override // X.WJB
    public final WI1 LIZJ() {
        return this.LJLL;
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLJJI;
    }

    public WJI(LifecycleOwner lifecycleOwner, C82622Wbi diContainer, InterfaceC65784Pro showSVCAssem) {
        int i;
        boolean z;
        int i2;
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(showSVCAssem, "showSVCAssem");
        this.LJLJI = lifecycleOwner;
        this.LJLJJI = diContainer;
        this.LJLJJL = showSVCAssem;
        this.LJLJJLL = 1;
        this.LJLJL = UCI.LJI(diContainer, ShortVideoContext.class, null);
        this.LJLJLJ = UCI.LJI(diContainer, InterfaceC82086WJm.class, null);
        this.LJLJLLL = UCI.LJI(diContainer, Activity.class, null);
        C83728WtY.LIZIZ.LIZIZ(EnumC83729WtZ.AUDIO_START_RECORD_START_EDIT_PRO_TOOL_BAR, HX4.EDIT);
        WJM wjm = new WJM(LJIIIZ());
        this.LJLJJLL = 1;
        wjm.LJI = Integer.valueOf(R.raw.icon_color_right_bottom_none);
        boolean z2 = false;
        if (V16.LJJJIL(wjm.LJIIIZ)) {
            ShortVideoContext shortVideoContext = wjm.LJIIIZ;
            if (!shortVideoContext.mIsFromDraft) {
                CameraComponentModel cameraComponentModel = shortVideoContext.cameraComponentModel;
                int i3 = cameraComponentModel.mRestoreType;
                if (i3 != 2 && i3 != 1) {
                    cameraComponentModel.isMuted = true;
                }
            } else {
                if (!shortVideoContext.creativeModel.micDataModel.enableMicWithBgm) {
                    shortVideoContext.cameraComponentModel.isMuted = !r1.audioAlgorithmModel.isMicEnabled;
                }
            }
            if (shortVideoContext.cameraComponentModel.mDurings.size() > 0) {
                wjm.LJIIJ(EnumC147935rJ.DISABLE_CLICK);
            }
            HB4.LJIIIIZZ(wjm.LJIIIZ.cameraComponentModel.isMuted);
            if (wjm.LJIIIZ.cameraComponentModel.isMuted) {
                i2 = 2;
            } else {
                i2 = 1;
            }
            this.LJLJJLL = i2;
            wjm.LJIILIIL = new WI0(wjm.LJIILIIL.LJLIL, WJV.LIZ().LJIIJJI(), wjm.LJIILIIL.LJLJI);
        }
        if (wjm.LJIIIZ.LJJIJIIJI() || C43846HIs.LIZ(wjm.LJIIIZ)) {
            if (wjm.LJIIIZ.cameraComponentModel.mDurings.size() > 0) {
                wjm.LJIIJ(EnumC147935rJ.DISABLE_CLICK);
            }
            if (wjm.LJIIIZ.cameraComponentModel.isMuted) {
                i = 2;
            } else {
                i = 1;
            }
            this.LJLJJLL = i;
        }
        ShortVideoContext shortVideoContext2 = wjm.LJIIIZ;
        if (!shortVideoContext2.mIsFromDraft && shortVideoContext2.LJJJI()) {
            CameraComponentModel cameraComponentModel2 = wjm.LJIIIZ.cameraComponentModel;
            boolean z3 = cameraComponentModel2.duetContext.micDefaultState;
            cameraComponentModel2.isMuted = !z3;
            this.LJLJJLL = z3 ? 1 : 2;
        }
        if (C53210KuU.LIZ() && !C78605Ut7.LJFF("android.permission.RECORD_AUDIO")) {
            z = true;
            if (wjm.LJIIIZ.cameraComponentModel.mDurings.size() > 0) {
                wjm.LJIIJ(EnumC147935rJ.DISABLE_CLICK);
            }
            this.LJLJJLL = 1;
        } else {
            z = false;
        }
        WJR wjr = WJR.LIZ;
        boolean LJJIJIL = wjm.LJIIIZ.LJJIJIL();
        wjr.getClass();
        boolean LIZIZ = WJR.LIZIZ(LJJIJIL);
        WJU wju = WJU.LIZ;
        boolean LJJJI = wjm.LJIIIZ.LJJJI();
        wju.getClass();
        if (WJU.LIZ().useRedButton && LJJJI) {
            z2 = true;
        }
        if (this.LJLJJLL == 1) {
            wjm.LJIIJJI = R.raw.icon_mic_fill;
        } else if (LIZIZ || z2) {
            wjm.LJIIL = R.attr.e7;
            wjm.LJIIJJI = R.raw.icon_mic_slash_fill;
        } else {
            wjm.LJIIJJI = R.raw.icon_mic_slash_fill;
        }
        if (V16.LJJJJLI(wjm.LJIIIZ) && !z) {
            wjm.LJIILIIL = new WI0(wjm.LJIILIIL.LJLIL, WJV.LIZ().LJIIJJI(), true);
        }
        this.LJLL = wjm;
    }
}
