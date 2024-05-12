package X;

import Y.AObjectS89S0100000_14;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WHY extends WJB {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJZI;
    public final LifecycleOwner LJLJI;
    public final C82622Wbi LJLJJI;
    public final boolean LJLJJL;
    public final C82632Wbs LJLJJLL;
    public final C82632Wbs LJLJL;
    public final C82632Wbs LJLJLJ;
    public final C82632Wbs LJLJLLL;
    public final WHZ LJLL;
    public boolean LJLLI;
    public final C82632Wbs LJLLILLLL;
    public int LJLLJ;
    public boolean LJLLL;
    public boolean LJLLLL;
    public int LJLLLLLL;
    public final C62822Ol8 LJLZ;
    public final SafeHandler LJZ;

    static {
        TBT tbt = new TBT(WHY.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJZI = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(WHY.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0, c65351Pkp), C61845OOz.LIZJ(WHY.class, "tiktokCameraApiComponent", "getTiktokCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/TikTokCameraApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(WHY.class, "activity", "getActivity()Landroid/app/Activity;", 0, c65351Pkp), C61845OOz.LIZJ(WHY.class, "recordAdapterComponent", "getRecordAdapterComponent()Lcom/ss/android/ugc/aweme/shortvideo/adapter/RecordAdapterComponent;", 0, c65351Pkp)};
    }

    @Override // X.WJB
    public final void LJFF() {
        int i;
        if (this.LJLLI) {
            WHV LJIIJ = LJIIJ();
            if (LJIIJ != null) {
                int nextFlashMode = LJIIJ.getNextFlashMode();
                this.LJLLJ = nextFlashMode;
                WHZ whz = this.LJLL;
                if (nextFlashMode == 0) {
                    i = 0;
                } else {
                    i = 1;
                }
                whz.LJIIIZ = WI2.LIZIZ(i);
                LJ();
            }
            LJIILIIL(this.LJLLJ);
            return;
        }
        int nextFlashMode2 = LJIIIZ().getNextFlashMode();
        LJIIIZ().s9(nextFlashMode2);
        WHV LJIIJ2 = LJIIJ();
        if (LJIIJ2 != null) {
            LJIIJ2.q90(nextFlashMode2);
        }
        this.LJLL.LJIIIZ = WI2.LIZIZ(nextFlashMode2);
        LJ();
        LJIILIIL(nextFlashMode2);
    }

    public final InterfaceC82086WJm LJIIIZ() {
        return (InterfaceC82086WJm) this.LJLJJLL.LIZ(this, LJZI[0]);
    }

    public final WHV LJIIJ() {
        return ((WLA) this.LJLLILLLL.LIZ(this, LJZI[4])).cN().LIZ();
    }

    public final ShortVideoContext LJIIJJI() {
        return (ShortVideoContext) this.LJLJL.LIZ(this, LJZI[1]);
    }

    @Override // X.WJB
    public final void LIZ() {
        if (LJIIIZ().LLJIJIL()) {
            C82632Wbs c82632Wbs = this.LJLJLLL;
            InterfaceC74236TBo<?>[] interfaceC74236TBoArr = LJZI;
            if (C83732Wtc.LJIIJ((Context) c82632Wbs.LIZ(this, interfaceC74236TBoArr[3]))) {
                C5S1 c5s1 = new C5S1((Context) this.LJLJLLL.LIZ(this, interfaceC74236TBoArr[3]));
                c5s1.LIZJ(R.string.ein);
                c5s1.LJ();
            }
        }
    }

    @Override // X.WJB
    public final void LIZLLL() {
        LJIIIZ().kp().LIZLLL(this.LJLJI, new AObjectS89S0100000_14(this, 416));
        LJIIIZ().EL().LIZLLL(this.LJLJI, new AObjectS89S0100000_14(this, 417));
        LJIIIZ().oX().LIZLLL(this.LJLJI, new AObjectS89S0100000_14(this, 418));
        LJIIIZ().ze().LIZLLL(this.LJLJI, new AObjectS89S0100000_14(this, 419));
        LJIIIZ().uB().LIZLLL(this.LJLJI, new AObjectS89S0100000_14(this, 420));
        C82632Wbs c82632Wbs = this.LJLJLJ;
        InterfaceC74236TBo<?>[] interfaceC74236TBoArr = LJZI;
        ((WRQ) c82632Wbs.LIZ(this, interfaceC74236TBoArr[2])).Wp0().LIZLLL(this.LJLJI, new AObjectS89S0100000_14(this, 421));
        ((WLA) this.LJLLILLLL.LIZ(this, interfaceC74236TBoArr[4])).cN().LIZIZ(this.LJLJI, new AObjectS89S0100000_14(this, 422));
    }

    @Override // X.WJB
    public final boolean LJIIIIZZ() {
        if (!LJIIIZ().LLJIJIL() || !LJIIIZ().Jx()) {
            return true;
        }
        return false;
    }

    public final boolean LJIIL() {
        if ((LJIIIZ().e8().getCameraController().LLJL() && !this.LJLLI) || (this.LJLLI && L2F.LIZ() && !o.LJ(LJIIJJI().enterFrom, "effect_qr_scan") && LJIIJJI().creativeModel.initialModel.recordPageOptionalConfig == null)) {
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

    @Override // X.WJB
    public final void LIZIZ(C82028WHg event) {
        WHV LJIIJ;
        o.LJIIIZ(event, "event");
        super.LIZIZ(event);
        if (!this.LJLLI) {
            return;
        }
        if (event.LJLIL == EnumC79548VJw.CLICK) {
            View view = event.LJLJI;
            WHV LJIIJ2 = LJIIJ();
            if (LJIIJ2 != null) {
                LJIIJ2.s9(this.LJLLJ);
            }
            WHV LJIIJ3 = LJIIJ();
            if (LJIIJ3 != null) {
                LJIIJ3.j80(view);
            }
            this.LJLLL = false;
            return;
        }
        if (!this.LJLLL) {
            return;
        }
        this.LJLLL = false;
        View view2 = event.LJLJI;
        WHV LJIIJ4 = LJIIJ();
        if (LJIIJ4 != null) {
            LJIIJ4.s9(this.LJLLLLLL);
        }
        this.LJLLLLLL = 0;
        if (!this.LJLLLL || (LJIIJ = LJIIJ()) == null) {
            return;
        }
        LJIIJ.j80(view2);
    }

    public final void LJIILIIL(int i) {
        String str;
        String str2;
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", LJIIJJI().LJI());
        c145995oB.LJI("shoot_way", LJIIJJI().shootWay);
        if (i == 0) {
            str = "off";
        } else {
            str = "on";
        }
        c145995oB.LJI("to_status", str);
        if (this.LJLLI) {
            str2 = "front";
        } else {
            str2 = "back";
        }
        c145995oB.LJI("camera_status", str2);
        if (LJIIJJI().draftId != 0) {
            c145995oB.LIZ(LJIIJJI().draftId, "draft_id");
        }
        String str3 = LJIIJJI().newDraftId;
        o.LJIIIIZZ(str3, "shortVideoContext.newDraftId");
        if (str3.length() > 0) {
            c145995oB.LIZLLL("new_draft_id", LJIIJJI().newDraftId);
        }
        c145995oB.LIZLLL("shoot_page", "video_shoot_page");
        c145995oB.LIZLLL("shoot_tab_name", LJIIJJI().LJIJI());
        FMX.LJIIL("light", c145995oB.LIZ);
    }

    public WHY(LifecycleOwner lifecycleOwner, C82622Wbi diContainer, boolean z) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLJI = lifecycleOwner;
        this.LJLJJI = diContainer;
        this.LJLJJL = z;
        this.LJLJJLL = UCI.LJI(diContainer, InterfaceC82086WJm.class, null);
        this.LJLJL = UCI.LJI(diContainer, ShortVideoContext.class, null);
        this.LJLJLJ = UCI.LJI(diContainer, WRQ.class, null);
        this.LJLJLLL = UCI.LJI(diContainer, Activity.class, null);
        this.LJLL = new WHZ(LJIIJJI(), z);
        WKP wkp = new WKP(new C82040WHs(LJIIJJI()));
        LJIIJJI();
        this.LJLLI = wkp.LIZ() == 1;
        this.LJLLILLLL = UCI.LJI(diContainer, WLA.class, null);
        this.LJLZ = C221108m2.LIZIZ(C82023WHb.LJLIL);
        this.LJZ = new SafeHandler(lifecycleOwner);
    }
}
