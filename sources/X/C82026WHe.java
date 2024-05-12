package X;

import Y.AObjectS89S0100000_14;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.jvm.internal.o;

/* renamed from: X.WHe, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82026WHe extends WJB {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJLJ;
    public final LifecycleOwner LJLJI;
    public final C82622Wbi LJLJJI;
    public final C82632Wbs LJLJJL;
    public final C82632Wbs LJLJJLL;
    public final C82027WHf LJLJL;

    static {
        TBT tbt = new TBT(C82026WHe.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLJLJ = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C82026WHe.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0, c65351Pkp)};
    }

    @Override // X.WJB
    public final void LJFF() {
        String str;
        if (C76917UGr.LJLIL) {
            return;
        }
        boolean Jx = LJIIIZ().Jx();
        C83627Wrv Bc = LJIIIZ().Bc();
        C78862UxG LIZIZ = C83728WtY.LIZIZ.LIZIZ(EnumC83729WtZ.OPEN_WIDE_TOOL_BAR, null);
        Bc.getClass();
        C83627Wrv.LIZIZ(Bc, "action_name_switch_wide_camera", LIZIZ, null);
        C145995oB c145995oB = new C145995oB();
        C82632Wbs c82632Wbs = this.LJLJJLL;
        InterfaceC74236TBo<?>[] interfaceC74236TBoArr = LJLJLJ;
        c145995oB.LJI("creation_id", ((ShortVideoContext) c82632Wbs.LIZ(this, interfaceC74236TBoArr[1])).LJI());
        c145995oB.LJI("shoot_way", ((ShortVideoContext) this.LJLJJLL.LIZ(this, interfaceC74236TBoArr[1])).shootWay);
        c145995oB.LJI("enter_from", "video_shoot_page");
        if (Jx) {
            str = "off";
        } else {
            str = "on";
        }
        c145995oB.LJI("to_status", str);
        FMX.LJIIL("wide_angle", c145995oB.LIZ);
    }

    public final InterfaceC82086WJm LJIIIZ() {
        return (InterfaceC82086WJm) this.LJLJJL.LIZ(this, LJLJLJ[0]);
    }

    @Override // X.WJB
    public final void LIZLLL() {
        LJIIIZ().ze().LIZLLL(this.LJLJI, new AObjectS89S0100000_14(this, 408));
    }

    @Override // X.WJB
    public final WI1 LIZJ() {
        return this.LJLJL;
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLJJI;
    }

    public C82026WHe(LifecycleOwner lifecycleOwner, C82622Wbi diContainer) {
        boolean z;
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLJI = lifecycleOwner;
        this.LJLJJI = diContainer;
        this.LJLJJL = UCI.LJI(diContainer, InterfaceC82086WJm.class, null);
        C82632Wbs LJI = UCI.LJI(diContainer, ShortVideoContext.class, null);
        this.LJLJJLL = LJI;
        WKP wkp = new WKP(new C82040WHs(null));
        if (wkp.LIZ() == 1) {
            z = true;
        } else {
            z = false;
        }
        C82027WHf c82027WHf = new C82027WHf(LJIIIZ());
        WI0 wi0 = c82027WHf.LJIIJJI;
        InterfaceC82086WJm interfaceC82086WJm = c82027WHf.LJIIIZ;
        if (interfaceC82086WJm.f8() && interfaceC82086WJm.LLJJJJLIIL(z)) {
            c82027WHf.LJIIJJI = new WI0(wi0.LJLIL, wi0.LJLILLLLZI, false);
        } else {
            c82027WHf.LJIIJJI = new WI0(wi0.LJLIL, wi0.LJLILLLLZI, true);
        }
        this.LJLJL = c82027WHf;
    }
}
