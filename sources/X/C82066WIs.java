package X;

import Y.AObjectS89S0100000_14;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.jvm.internal.o;

/* renamed from: X.WIs, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82066WIs extends WJB {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLL;
    public final LifecycleOwner LJLJI;
    public final C82622Wbi LJLJJI;
    public final C82632Wbs LJLJJL;
    public final C82632Wbs LJLJJLL;
    public final C82632Wbs LJLJL;
    public boolean LJLJLJ;
    public final C82065WIr LJLJLLL;

    static {
        TBT tbt = new TBT(C82066WIs.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C82066WIs.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(C82066WIs.class, "tikTokCameraApiComponent", "getTikTokCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/TikTokCameraApiComponent;", 0, c65351Pkp)};
    }

    public final InterfaceC82086WJm LJIIIZ() {
        return (InterfaceC82086WJm) this.LJLJJLL.LIZ(this, LJLL[1]);
    }

    public final ShortVideoContext LJIIJ() {
        return (ShortVideoContext) this.LJLJJL.LIZ(this, LJLL[0]);
    }

    @Override // X.WJB
    public final void LIZLLL() {
        LJIIIZ().MI().LIZLLL(this.LJLJI, new AObjectS89S0100000_14(this, 409));
        LJIIIZ().oX().LIZLLL(this.LJLJI, new AObjectS89S0100000_14(this, 410));
        ((WRQ) this.LJLJL.LIZ(this, LJLL[2])).iT().LIZLLL(this.LJLJI, new AObjectS89S0100000_14(this, 411));
    }

    @Override // X.WJB
    public final void LJFF() {
        boolean z = !LJIIJ().isAIEnhanceOn;
        LJIIIZ().Om(z);
        LJIIJ().isAIEnhanceOn = z;
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", LJIIJ().LJI());
        c145995oB.LJI("shoot_way", LJIIJ().shootWay);
        c145995oB.LJI("content_source", LJIIJ().LIZLLL().getContentSource());
        c145995oB.LJI("content_type", LJIIJ().LIZLLL().getContentType());
        c145995oB.LIZ(z ? 1 : 0, "status");
        c145995oB.LJI("enter_from", "video_shoot_page");
        FMX.LJIIL("click_quality_improve", c145995oB.LIZ);
    }

    @Override // X.WJB
    public final boolean LJIIIIZZ() {
        return !o.LJ(LJIIJ().enterFrom, "effect_qr_scan");
    }

    @Override // X.WJB
    public final WI1 LIZJ() {
        return this.LJLJLLL;
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLJJI;
    }

    public final boolean LJIIJJI(boolean z) {
        if (!o.LJ(LJIIJ().enterFrom, "effect_qr_scan") && LJIIIZ().H1().LIZIZ(LJIIIZ().rX().getCameraController(), z)) {
            return true;
        }
        return false;
    }

    public C82066WIs(LifecycleOwner lifecycleOwner, C82622Wbi diContainer) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLJI = lifecycleOwner;
        this.LJLJJI = diContainer;
        this.LJLJJL = UCI.LJI(diContainer, ShortVideoContext.class, null);
        this.LJLJJLL = UCI.LJI(diContainer, InterfaceC82086WJm.class, null);
        this.LJLJL = UCI.LJI(diContainer, WRQ.class, null);
        WKP wkp = new WKP(new C82040WHs(null));
        LJIIJ();
        this.LJLJLJ = wkp.LIZ() == 1;
        this.LJLJLLL = new C82065WIr(LJIIJ(), LJIIJJI(this.LJLJLJ));
    }
}
