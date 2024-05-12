package X;

import Y.AObjectS89S0100000_14;
import Y.ARunnableS50S0100000_14;
import android.graphics.Bitmap;
import android.os.Handler;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.creative.model.NowsShootModel;
import com.ss.android.ugc.aweme.services.recording.NowsShootActivityArg;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WXZ implements WXV, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJZL;
    public final ActivityC45651qj LJLIL;
    public final C82622Wbi LJLILLLLZI;
    public final WXY LJLJJI;
    public final C82632Wbs LJLJJL;
    public final C82632Wbs LJLJL;
    public final C82632Wbs LJLJLJ;
    public final C62822Ol8 LJLJLLL;
    public int LJLL;
    public InterfaceC82440WXc LJLLI;
    public boolean LJLLILLLL;
    public final C62822Ol8 LJLLJ;
    public final long LJLLL;
    public boolean LJLLLL;
    public boolean LJLLLLLL;
    public boolean LJLZ;
    public boolean LJZ;
    public final ARunnableS50S0100000_14 LJZI;
    public final boolean LJLJI = true;
    public final C5H3 LJLJJLL = C269113v.LIZ(this, I3X.class);

    static {
        TBT tbt = new TBT(WXZ.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJZL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(WXZ.class, "shootModel", "getShootModel()Lcom/ss/android/ugc/aweme/creative/model/NowsShootModel;", 0, c65351Pkp), C61845OOz.LIZJ(WXZ.class, "enterPramas", "getEnterPramas()Lcom/ss/android/ugc/aweme/services/recording/NowsShootActivityArg;", 0, c65351Pkp)};
    }

    @Override // X.WXV
    public final void p() {
        this.LJLLILLLL = false;
        ((Handler) this.LJLLJ.getValue()).removeCallbacksAndMessages(null);
        LJ().removeCallbacks(this.LJZI);
        if (this.LJLLLL) {
            I9L i9l = new I9L("forceStopRecord");
            i9l.LIZIZ = true;
            ((I3X) this.LJLJJLL.getValue()).Ec0(i9l);
            this.LJLLLL = false;
        }
    }

    @Override // X.WXV
    public final void LIZ() {
        if (this.LJLL != 4) {
            LJ().setVisibility(8);
            LJI().firstContentType = "video";
            LJIIIIZZ();
            this.LJLLILLLL = true;
        }
    }

    @Override // X.WXV
    public final void LIZIZ() {
        if (this.LJLL != 4) {
            if (this.LJLLLLLL) {
                LJFF().s9(0);
                this.LJLLLLLL = false;
            }
            LJII(new AqS180S0100000_14(this, 311));
        }
    }

    @Override // X.WXV
    public final void LIZJ() {
        if (this.LJLL == 4) {
            LJ().setVisibility(8);
            LJI().firstContentType = "photo";
            LJIIIIZZ();
            this.LJLLILLLL = true;
            return;
        }
        LJ().setVisibility(8);
        C6IA.LJFF(LJ(), this.LJLJI);
    }

    public final InterfaceC82086WJm LJFF() {
        return (InterfaceC82086WJm) this.LJLJJL.LIZ(this, LJZL[0]);
    }

    public final NowsShootModel LJI() {
        return (NowsShootModel) this.LJLJL.LIZ(this, LJZL[1]);
    }

    @Override // X.WXV
    public final void LJJJJIZL() {
        this.LJLJJI.LJJJJIZL();
        this.LJLLLL = false;
    }

    @Override // X.WXV
    public final void M5() {
        HZ2.LIZ((I3X) this.LJLJJLL.getValue(), false, 3);
        I3X i3x = (I3X) this.LJLJJLL.getValue();
        I9L i9l = new I9L("reset progress");
        i9l.LIZ = 3;
        i3x.hb0(i9l);
    }

    public final View LJ() {
        return LJFF().e8().getViewFunction().getView();
    }

    public final void LJIIIIZZ() {
        LJFF().z6(false, C83728WtY.LIZIZ.LIZIZ(EnumC83729WtZ.NOW_SWITCH_CAMERA_VIDEO, WYE.NOW), null);
        LJI().switchCameraStartTime = System.currentTimeMillis();
    }

    @Override // X.WXV
    public final void LJL() {
        LJFF().LJL();
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLILLLLZI;
    }

    @Override // X.WXV
    public final boolean isRecording() {
        return this.LJLLLL;
    }

    public final void LJII(InterfaceC88472Yns<? super Bitmap, C76800UCe> interfaceC88472Yns) {
        this.LJZ = true;
        LJFF().e8().getEffectController().ga(C44317HaL.LIZ, C44317HaL.LIZIZ, new C82439WXb(interfaceC88472Yns, this));
    }

    @Override // X.WXV
    public final void LIZLLL(int i, boolean z) {
        this.LJLL = i;
        this.LJLZ = z;
        if (i == 4) {
            LJII(new AqS180S0100000_14(this, 312));
            return;
        }
        if (z) {
            LJFF().s9(2);
            this.LJLLLLLL = true;
        }
        this.LJLJJI.LLJJJJ();
        this.LJLLLL = true;
    }

    @Override // X.WXV
    public final void LLILII(float f, float f2) {
        float LIZ;
        LJFF().mi(false);
        float floatValue = C82442WXe.LIZ.invoke().floatValue();
        if (f < 0.0f || floatValue == 0.0f || this.LJZ) {
            return;
        }
        float LIZ2 = HDE.LIZ(this.LJLIL, f2);
        if (C52264KfE.LIZ) {
            ActivityC45651qj context = this.LJLIL;
            o.LJIIIZ(context, "context");
            LIZ = HDE.LIZ(context, f2);
        } else {
            ActivityC45651qj context2 = this.LJLIL;
            o.LJIIIZ(context2, "context");
            LIZ = HDE.LIZ(context2, f2);
        }
        float f3 = f / LIZ;
        if (!C19N.LJ("enable_max_zoom_optimized", true) && f3 > 0.98f) {
            f3 = 1.0f;
        } else if (f3 > 1.0f) {
            return;
        }
        C82442WXe.LIZIZ = true;
        LJFF().Ya0(f3, LIZ2);
    }

    public WXZ(ActivityC45651qj activityC45651qj, C82622Wbi c82622Wbi, WXY wxy) {
        this.LJLIL = activityC45651qj;
        this.LJLILLLLZI = c82622Wbi;
        this.LJLJJI = wxy;
        this.LJLJJL = UCI.LJI(c82622Wbi, InterfaceC82086WJm.class, null);
        this.LJLJL = UCI.LJI(c82622Wbi, NowsShootModel.class, null);
        this.LJLJLJ = UCI.LJI(c82622Wbi, NowsShootActivityArg.class, null);
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AqS164S0100000_14(this, 305));
        this.LJLJLLL = LIZIZ;
        this.LJLLJ = C221108m2.LIZIZ(new AqS164S0100000_14(this, 306));
        C74275TDb.LIZ(18.0f);
        this.LJLLL = 300L;
        this.LJZI = new ARunnableS50S0100000_14(this, 169);
        LJFF().uB().LIZLLL((LifecycleOwner) LIZIZ.getValue(), new AObjectS89S0100000_14(this, 445));
    }
}
