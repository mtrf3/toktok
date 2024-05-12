package X;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.property.CreativeToolsEntranceReversalConfig;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.I1f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45939I1f extends WJB {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJLLL;
    public final LifecycleOwner LJLJI;
    public final C82622Wbi LJLJJI;
    public final C62822Ol8 LJLJJL;
    public final C82632Wbs LJLJJLL;
    public final C82632Wbs LJLJL;
    public final C82022WHa LJLJLJ;

    static {
        TBT tbt = new TBT(C45939I1f.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLJLLL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C45939I1f.class, "activity", "getActivity()Landroid/app/Activity;", 0, c65351Pkp)};
    }

    @Override // X.WJB
    public final void LJFF() {
        InterfaceC81454Vxy interfaceC81454Vxy = (InterfaceC81454Vxy) this.LJLJJL.getValue();
        if (interfaceC81454Vxy != null) {
            interfaceC81454Vxy.W9();
        }
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("shoot_way", LJIIIZ().shootWay);
        c145995oB.LJI("enter_from", "video_shoot_page");
        c145995oB.LJI("creation_id", LJIIIZ().LJI());
        c145995oB.LJI("user_id", C60903NvH.LJIIJJI().getAccountService().getCurrentUserID());
        c145995oB.LJI("content_source", "shoot");
        c145995oB.LJI("content_type", "video");
        GXR.LIZ("click_reply_entrance", c145995oB.LIZ);
    }

    @Override // X.WJB
    public final boolean LJIIIIZZ() {
        C148585sM.LIZ.getClass();
        if (((CreativeToolsEntranceReversalConfig) C148585sM.LIZJ.getValue()).getHideQAEntranceOnCameraPage()) {
            return false;
        }
        if ((C45940I1g.LIZ() != 1 && !I1S.LIZ()) || !C1B8.LIZJ() || C1DG.LJIIIIZZ()) {
            return false;
        }
        if (C74275TDb.LJII((Context) this.LJLJL.LIZ(this, LJLJLLL[1]), C81184Vtc.LIZIZ((Context) this.LJLJL.LIZ(this, r3[1]))) <= WK3.LJLLILLLL || LJIIIZ().cameraComponentModel.isRetakeMode || LJIIIZ().LJJIJIIJIL()) {
            return false;
        }
        if ((IMService.createIIMServicebyMonsterPlugin(false).getCameraService().LIZ() && ((ShortVideoContext) this.LJLJJI.LJ(ShortVideoContext.class, null)).creativeModel.initialModel.dmCameraModel.enterFromDM) || V16.LJIILLIIL(LJIIIZ())) {
            return false;
        }
        return true;
    }

    public final ShortVideoContext LJIIIZ() {
        return (ShortVideoContext) this.LJLJJLL.LIZ(this, LJLJLLL[0]);
    }

    @Override // X.WJB
    public final WI1 LIZJ() {
        return this.LJLJLJ;
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLJJI;
    }

    public C45939I1f(LifecycleOwner lifecycleOwner, C82622Wbi diContainer) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLJI = lifecycleOwner;
        this.LJLJJI = diContainer;
        this.LJLJJL = C221108m2.LIZIZ(new AqS157S0100000_7(this, 423));
        this.LJLJJLL = UCI.LJI(diContainer, ShortVideoContext.class, null);
        this.LJLJL = UCI.LJI(diContainer, Activity.class, null);
        this.LJLJLJ = new C82022WHa();
    }
}
