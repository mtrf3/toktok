package X;

import Y.AObjectS89S0100000_14;
import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.jvm.internal.o;

/* renamed from: X.WHc, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82024WHc extends WJB {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJLLL;
    public final LifecycleOwner LJLJI;
    public final C82622Wbi LJLJJI;
    public final C82632Wbs LJLJJL;
    public final C82632Wbs LJLJJLL;
    public final C82632Wbs LJLJL;
    public final C82025WHd LJLJLJ;

    static {
        TBT tbt = new TBT(C82024WHc.class, "activity", "getActivity()Landroid/app/Activity;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLJLLL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C82024WHc.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0, c65351Pkp), C61845OOz.LIZJ(C82024WHc.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0, c65351Pkp)};
    }

    @Override // X.WJB
    public final void LIZLLL() {
        ((WLT) this.LJLJL.LIZ(this, LJLJLLL[2])).ln0().LIZLLL(this.LJLJI, new AObjectS89S0100000_14(this, 432));
    }

    @Override // X.WJB
    public final void LJFF() {
        String str;
        if (C76917UGr.LJLIL) {
            return;
        }
        C82632Wbs c82632Wbs = this.LJLJJL;
        InterfaceC74236TBo<?>[] interfaceC74236TBoArr = LJLJLLL;
        boolean z = !C82127WLb.LIZ((Context) c82632Wbs.LIZ(this, interfaceC74236TBoArr[0]));
        ((InterfaceC82086WJm) this.LJLJL.LIZ(this, interfaceC74236TBoArr[2])).Za(z, C83728WtY.LIZIZ.LIZIZ(EnumC83729WtZ.SHAKE_FREE_TOOL_BAR, null));
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", LJIIIZ().LJI());
        c145995oB.LJI("shoot_way", LJIIIZ().shootWay);
        c145995oB.LJI("enter_from", "video_shoot_page");
        if (z) {
            str = "on";
        } else {
            str = "off";
        }
        c145995oB.LJI("to_status", str);
        if (LJIIIZ().draftId != 0) {
            c145995oB.LIZ(LJIIIZ().draftId, "draft_id");
        }
        String str2 = LJIIIZ().newDraftId;
        o.LJIIIIZZ(str2, "shortVideoContext.newDraftId");
        if (str2.length() > 0) {
            c145995oB.LIZLLL("new_draft_id", LJIIIZ().newDraftId);
        }
        FMX.LJIIL("click_anti_shake", c145995oB.LIZ);
    }

    public final ShortVideoContext LJIIIZ() {
        return (ShortVideoContext) this.LJLJJLL.LIZ(this, LJLJLLL[1]);
    }

    @Override // X.WJB
    public final WI1 LIZJ() {
        return this.LJLJLJ;
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLJJI;
    }

    public C82024WHc(LifecycleOwner lifecycleOwner, C82622Wbi diContainer) {
        boolean z;
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLJI = lifecycleOwner;
        this.LJLJJI = diContainer;
        C82632Wbs LJI = UCI.LJI(diContainer, Activity.class, null);
        this.LJLJJL = LJI;
        this.LJLJJLL = UCI.LJI(diContainer, ShortVideoContext.class, null);
        C82632Wbs LJI2 = UCI.LJI(diContainer, InterfaceC82086WJm.class, null);
        this.LJLJL = LJI2;
        WKP wkp = new WKP(new C82040WHs(null));
        LJIIIZ();
        if (wkp.LIZ() == 1) {
            z = true;
        } else {
            z = false;
        }
        InterfaceC74236TBo<?>[] interfaceC74236TBoArr = LJLJLLL;
        C82025WHd c82025WHd = new C82025WHd((Activity) LJI.LIZ(this, interfaceC74236TBoArr[0]));
        WI0 wi0 = c82025WHd.LJIIJ;
        if (((WLT) LJI2.LIZ(this, interfaceC74236TBoArr[2])).zy(z, false)) {
            c82025WHd.LJIIJ = new WI0(wi0.LJLIL, wi0.LJLILLLLZI, false);
        } else {
            c82025WHd.LJIIJ = new WI0(wi0.LJLIL, wi0.LJLILLLLZI, true);
        }
        this.LJLJLJ = c82025WHd;
    }
}
