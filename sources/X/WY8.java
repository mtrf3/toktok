package X;

import Y.AObjectS89S0100000_14;
import Y.AObserverS82S0100000_14;
import Y.ARunnableS25S0300000_14;
import android.graphics.Bitmap;
import android.os.Handler;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.ss.android.ugc.asve.context.PreviewSize;
import com.ss.android.ugc.aweme.creative.model.NowsShootModel;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.vesdk.VESize;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.AqS196S0100000_14;
import kotlin.jvm.internal.o;
import v5.n;

/* loaded from: classes15.dex */
public final class WY8 implements WXY, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJZ;
    public final ActivityC45651qj LJLIL;
    public final C82622Wbi LJLILLLLZI;
    public final CameraComponentModel LJLJI;
    public boolean LJLJJI;
    public final C82632Wbs LJLJJL;
    public final C82632Wbs LJLJJLL;
    public final C5H3 LJLJL;
    public float LJLJLJ;
    public final PreviewSize LJLJLLL;
    public VESize LJLL;
    public VESize LJLLI;
    public VESize LJLLILLLL;
    public boolean LJLLJ;
    public boolean LJLLL;
    public final C82632Wbs LJLLLL;
    public final C82632Wbs LJLLLLLL;
    public final C62822Ol8 LJLZ;

    static {
        TBT tbt = new TBT(WY8.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJZ = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(WY8.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0, c65351Pkp), C61845OOz.LIZJ(WY8.class, "shootModel", "getShootModel()Lcom/ss/android/ugc/aweme/creative/model/NowsShootModel;", 0, c65351Pkp), C61845OOz.LIZJ(WY8.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0, c65351Pkp)};
    }

    @Override // X.WXY
    public final void LLLLZLLLI() {
        this.LJLLJ = false;
    }

    @Override // X.WXY
    public final void V0() {
        this.LJLLL = true;
    }

    public final InterfaceC82086WJm LIZ() {
        return (InterfaceC82086WJm) this.LJLJJL.LIZ(this, LJZ[0]);
    }

    @Override // X.WXY
    public final void LJJJJIZL() {
        I9L i9l = new I9L("record end");
        i9l.LIZ = 5;
        ((I3X) this.LJLJL.getValue()).Ec0(i9l);
    }

    @Override // X.WXY
    public final void LLJJJJ() {
        ((I3X) this.LJLJL.getValue()).Sk0(0);
    }

    @Override // X.WXY
    public final boolean LLFZ() {
        return LIZ().LLFZ();
    }

    @Override // X.WXY
    public final LiveData<HK7> LLL() {
        return LIZ().LLL();
    }

    @Override // X.WXY
    public final void LLLIILIL() {
        LIZ().z6(false, C83728WtY.LIZIZ.LIZIZ(EnumC83729WtZ.NOW_SWITCH_CAMERA, WYE.NOW), null);
        ((NowsShootModel) this.LJLLLL.LIZ(this, LJZ[2])).switchCameraStartTime = System.currentTimeMillis();
    }

    @Override // X.WXY
    public final void S0() {
        LIZ().Os(C83728WtY.LIZIZ.LIZIZ(EnumC83729WtZ.NOW_OPEN_CAMERA_FIRST, WYE.NOW), false);
    }

    @Override // X.WXY
    public final void W0() {
        LIZ().jL().LIZIZ(I0E.NOW_PHOTO_PUBLISH_PAGE, C83728WtY.LIZIZ.LIZIZ(EnumC83729WtZ.NOW_OPEN_CAMERA_BACK_TO_PREVIEW, WYE.NOW));
    }

    @Override // X.WXY
    public final void X0() {
        LIZ().jL().LIZJ(I0E.NOW_PHOTO_PUBLISH_PAGE, C83728WtY.LIZIZ.LIZJ(EnumC83730Wta.CLOSE_CAMERA_NOW_PREVIEW_EDIT, EnumC158826Le.USER_OPERATION));
    }

    @Override // X.WXY
    public final boolean Y0() {
        return this.LJLJJI;
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLILLLLZI;
    }

    @Override // X.WXY
    public final void U0(boolean z) {
        this.LJLJJI = z;
    }

    @Override // X.WXY
    public final void a1(AqS164S0100000_14 aqS164S0100000_14) {
        C83817Wuz LIZ = C78594Usw.LIZ(2);
        LIZ().e8().LLLLLLLZIL(LIZ, new AqS180S0100000_14(this, 313), new WYD(aqS164S0100000_14), C83728WtY.LIZIZ.LIZIZ(EnumC83729WtZ.NOW_SWITCH_CAMERA_FROM_MAIN, null));
        LIZ().e8().getCameraController().LJ(true);
        int[] LJIILIIL = LIZ.LJIILIIL();
        InterfaceC83865Wvl mediaController = LIZ().e8().getMediaController();
        mediaController.a9(new VESize(LJIILIIL[0], LJIILIIL[1]));
        mediaController.d9(WYC.LIZ(this.LJLIL, true, this.LJLJI));
        this.LJLLJ = true;
    }

    @Override // X.WXY
    public final void l8(float f) {
        LIZ().e8().LLJJLIIIJLLLLLLLZ(0.0f, f / this.LJLJLJ);
        this.LJLJLJ = f;
    }

    public final void LIZJ(InterfaceC65784Pro interfaceC65784Pro, InterfaceC88471Ynr interfaceC88471Ynr) {
        LIZ().e8().getEffectController().ga(C44317HaL.LIZ(), C44317HaL.LIZLLL, new HJP(System.currentTimeMillis(), interfaceC65784Pro, interfaceC88471Ynr));
    }

    @Override // X.WXY
    public final void R0(float f, float f2) {
        LIZ().R0(f, f2 - C6IA.LIZLLL(this.LJLIL));
    }

    @Override // X.WXY
    public final void T0(C82444WXg onFail, AqS180S0100000_14 aqS180S0100000_14) {
        o.LJIIIZ(onFail, "onFail");
        LIZJ(onFail, new AqS196S0100000_14(aqS180S0100000_14, 35));
    }

    public WY8(ActivityC45651qj activity, C82622Wbi c82622Wbi, CameraComponentModel cameraComponentModel) {
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(cameraComponentModel, "cameraComponentModel");
        this.LJLIL = activity;
        this.LJLILLLLZI = c82622Wbi;
        this.LJLJI = cameraComponentModel;
        this.LJLJJL = UCI.LJI(c82622Wbi, InterfaceC82086WJm.class, null);
        this.LJLJJLL = UCI.LJI(c82622Wbi, I0N.class, null);
        this.LJLJL = C269113v.LIZ(this, I3X.class);
        this.LJLJLJ = 1.0f;
        C221108m2.LIZIZ(new AqS164S0100000_14(this, 309));
        InterfaceC44798Hi6.LJFF.getClass();
        this.LJLJLLL = C44740HhA.LIZIZ();
        this.LJLL = new VESize(960, 720);
        this.LJLLI = C44739Hh9.LJ();
        this.LJLLJ = true;
        this.LJLLLL = UCI.LJI(c82622Wbi, NowsShootModel.class, null);
        this.LJLLLLLL = UCI.LJI(c82622Wbi, ShortVideoContext.class, null);
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AqS164S0100000_14(this, 307));
        LIZ().uB().LIZLLL((LifecycleOwner) LIZIZ.getValue(), new AObjectS89S0100000_14(this, 446));
        LIZ().Au().observe((LifecycleOwner) LIZIZ.getValue(), new AObserverS82S0100000_14(this, 61));
        LIZ().vV().LIZLLL((LifecycleOwner) LIZIZ.getValue(), new AObjectS89S0100000_14(this, 447));
        InterfaceC83863Wvj cameraController = LIZ().e8().getCameraController();
        cameraController.LJJIJ(new WYA(this));
        cameraController.LJIIJJI(new WY9(this));
        LIZ().e8().A9(false);
        this.LJLZ = C221108m2.LIZIZ(new AqS164S0100000_14(this, 308));
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x007c, code lost:
    
        if (r2.LJLJI == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00aa, code lost:
    
        if (r9 >= 0) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.vesdk.VESize LIZIZ(java.util.List r15, com.ss.android.vesdk.VESize r16, float r17) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WY8.LIZIZ(java.util.List, com.ss.android.vesdk.VESize, float):com.ss.android.vesdk.VESize");
    }

    public static final void LIZLLL(WY8 wy8, InterfaceC88471Ynr<? super Bitmap, ? super Long, C76800UCe> interfaceC88471Ynr, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        if (C82398WVm.LIZJ((InterfaceC82400WVo) wy8.LJLJJLL.LIZ(wy8, LJZ[1])) != null) {
            wy8.LIZ().rX().LJ().LJIIJJI(C44317HaL.LIZ(), C44317HaL.LIZLLL, new HKB(System.currentTimeMillis(), interfaceC65784Pro, interfaceC88471Ynr), true, new C43913HLh(new n(), wy8));
            return;
        }
        wy8.LIZJ(interfaceC65784Pro, interfaceC88471Ynr);
    }

    @Override // X.WXY
    public final void Z0(C82447WXj onFail, AqS196S0100000_14 aqS196S0100000_14, boolean z) {
        o.LJIIIZ(onFail, "onFail");
        if (C44318HaM.LIZ() && this.LJLJJI) {
            if (!z) {
                LIZ().s9(2);
            }
            ((Handler) this.LJLZ.getValue()).postDelayed(new ARunnableS25S0300000_14(onFail, this, aqS196S0100000_14, 17), 400L);
            return;
        }
        LIZLLL(this, aqS196S0100000_14, onFail);
    }
}
