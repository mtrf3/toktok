package X;

import Y.AObjectS86S0100000_7;
import android.app.Activity;
import com.bytedance.als.LiveEvent;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.jvm.internal.o;

/* renamed from: X.HqP, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45313HqP extends AbstractC29891Fh<HYQ> implements HYQ, InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJLLL;
    public final C82622Wbi LJLIL;
    public final HYQ LJLILLLLZI;
    public final InterfaceC115514g7 LJLJI;
    public final InterfaceC115514g7 LJLJJI;
    public final I3X LJLJJL;
    public final ShortVideoContext LJLJJLL;
    public final C29901Fi<Boolean> LJLJL;
    public final C29901Fi<Boolean> LJLJLJ;

    static {
        TBT tbt = new TBT(C45313HqP.class, "activity", "getActivity()Landroid/app/Activity;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLJLLL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C45313HqP.class, "cameraApi", "getCameraApi()Lcom/bytedance/creativex/recorder/camera/api/TikTokCameraApiComponent;", 0, c65351Pkp)};
    }

    public final Activity LJJLI() {
        return (Activity) this.LJLJI.LIZ(this, LJLJLLL[0]);
    }

    public final WRQ LJJLIIIIJ() {
        return (WRQ) this.LJLJJI.LIZ(this, LJLJLLL[1]);
    }

    @Override // X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        this.LJLJJL.Rr0().LIZLLL(this, new AObjectS86S0100000_7(this, 97));
        LJJLIIIIJ().kw().LIZLLL(this, new AObjectS86S0100000_7(this, 98));
    }

    @Override // X.HYQ
    public /* bridge */ /* synthetic */ LiveEvent B2() {
        return this.LJLJL;
    }

    @Override // X.HYQ
    public /* bridge */ /* synthetic */ LiveEvent C30() {
        return this.LJLJLJ;
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ HYQ getApiComponent() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    public C45313HqP(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = this;
        this.LJLJI = UCI.LJI(getDiContainer(), Activity.class, null);
        this.LJLJJI = UCI.LJI(getDiContainer(), WRQ.class, null);
        this.LJLJJL = (I3X) getDiContainer().LJ(I3X.class, null);
        this.LJLJJLL = (ShortVideoContext) getDiContainer().LJ(ShortVideoContext.class, null);
        this.LJLJL = new C29901Fi<>();
        this.LJLJLJ = new C29901Fi<>();
    }

    @Override // X.HYQ
    public void D2(boolean z) {
        this.LJLJL.LJII(Boolean.valueOf(z));
    }

    @Override // X.HYQ
    public void si0(boolean z) {
        this.LJLJLJ.LJII(Boolean.valueOf(z));
    }
}
