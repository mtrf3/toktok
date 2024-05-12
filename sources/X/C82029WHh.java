package X;

import Y.AObjectS89S0100000_14;
import android.app.Activity;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.WHh, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82029WHh extends WJB {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJLJ;
    public final LifecycleOwner LJLJI;
    public final C82622Wbi LJLJJI;
    public final C82632Wbs LJLJJL;
    public final C82632Wbs LJLJJLL;
    public final WI5 LJLJL;

    static {
        TBT tbt = new TBT(C82029WHh.class, "activity", "getActivity()Landroid/app/Activity;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLJLJ = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C82029WHh.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0, c65351Pkp), C61845OOz.LIZJ(C82029WHh.class, "countDownApi", "getCountDownApi()Lcom/ss/android/ugc/aweme/shortvideo/countdown/CountDownApi;", 0, c65351Pkp)};
    }

    @Override // X.WJB
    public final void LIZLLL() {
        C82622Wbi c82622Wbi = this.LJLJJI;
        if (L2L.LIZ(c82622Wbi)) {
            ((C1EP) c82622Wbi.LJ(C1EP.class, null)).m3(WHX.class, new AqS180S0100000_14(this, 282));
            return;
        }
        C0I6 c0i6 = (C0I6) c82622Wbi.LJIIIIZZ(null, WHX.class);
        if (c0i6 == null) {
            return;
        }
        ((WHX) c0i6).M2().LIZLLL(this.LJLJI, new AObjectS89S0100000_14(this, 413));
    }

    @Override // X.WJB
    public final void LJFF() {
        C145995oB c145995oB = new C145995oB();
        c145995oB.LJI("creation_id", LJIIIZ().LJI());
        c145995oB.LJI("shoot_way", LJIIIZ().shootWay);
        c145995oB.LIZ(LJIIIZ().draftId, "draft_id");
        c145995oB.LJI("enter_from", "video_shoot_page");
        c145995oB.LJI("shoot_page", "video_shoot_page");
        c145995oB.LJI("shoot_tab_name", LJIIIZ().LJIJI());
        FMX.LJIIL("count_down", c145995oB.LIZ);
        ((WHX) this.LJLJJLL.LIZ(this, LJLJLJ[2])).f2(true);
    }

    public final ShortVideoContext LJIIIZ() {
        return (ShortVideoContext) this.LJLJJL.LIZ(this, LJLJLJ[1]);
    }

    @Override // X.WJB
    public final WI1 LIZJ() {
        return this.LJLJL;
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLJJI;
    }

    public C82029WHh(LifecycleOwner lifecycleOwner, C82622Wbi diContainer) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLJI = lifecycleOwner;
        this.LJLJJI = diContainer;
        C82632Wbs LJI = UCI.LJI(diContainer, Activity.class, null);
        this.LJLJJL = UCI.LJI(diContainer, ShortVideoContext.class, null);
        this.LJLJJLL = UCI.LJI(diContainer, WHX.class, null);
        this.LJLJL = new WI5((Activity) LJI.LIZ(this, LJLJLJ[0]));
    }
}
