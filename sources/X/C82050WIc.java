package X;

import Y.ARunnableS33S0200000_14;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.WIc, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82050WIc extends WJB {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJLLL;
    public final LifecycleOwner LJLJI;
    public final C82622Wbi LJLJJI;
    public final C82632Wbs LJLJJL;
    public final C82632Wbs LJLJJLL;
    public final C82049WIb LJLJL;
    public final boolean LJLJLJ;

    static {
        TBT tbt = new TBT(C82050WIc.class, "speedApiComponent", "getSpeedApiComponent()Lcom/ss/android/ugc/gamora/recorder/speed/SpeedApiComponent;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLJLLL = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C82050WIc.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0, c65351Pkp), C61845OOz.LIZJ(C82050WIc.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0, c65351Pkp)};
    }

    @Override // X.WJB
    public final void LIZLLL() {
        AqS180S0100000_14 aqS180S0100000_14 = new AqS180S0100000_14(this, 286);
        if (L2L.LIZ(this.LJLJJI)) {
            ((C1EP) this.LJLJJI.LJ(C1EP.class, null)).m3(WIF.class, new AqS180S0100000_14((InterfaceC88472Yns) aqS180S0100000_14, 285));
            return;
        }
        if (C53564L0m.LIZIZ()) {
            W13 w13 = (W13) this.LJLJJI.LJIIIIZZ(null, W13.class);
            if (w13 != null) {
                w13.m3(WIF.class, aqS180S0100000_14);
                if (C76800UCe.LIZ != null) {
                    return;
                }
            }
            aqS180S0100000_14.invoke(this.LJLJJI.LJ(WIF.class, null));
            return;
        }
        aqS180S0100000_14.invoke(this.LJLJJI.LJ(WIF.class, null));
    }

    @Override // X.WJB
    public final void LJFF() {
        ((WIF) this.LJLJJL.LIZ(this, LJLJLLL[0])).h1(!C60903NvH.LJIIJJI().LJJIL().getSpeedPanelOpen(false));
        MobClick obtain = MobClick.obtain();
        obtain.setEventName("speed_edit");
        obtain.setLabelName("shoot_page");
        obtain.setJsonObject(QCU.LIZIZ(this.LJLJJI));
        FMX.onEvent(obtain);
    }

    @Override // X.WJB
    public final boolean LJIIIIZZ() {
        return !((ShortVideoContext) this.LJLJJLL.LIZ(this, LJLJLLL[2])).LJJ();
    }

    @Override // X.WJB
    public final WI1 LIZJ() {
        return this.LJLJL;
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLJJI;
    }

    @Override // X.WJB
    public final void LJI(C1537261o registerEvent) {
        View view;
        o.LJIIIZ(registerEvent, "registerEvent");
        if (this.LJLJLJ) {
            if (this.LJLJL.LJ) {
                view = registerEvent.LJLILLLLZI;
            } else {
                view = registerEvent.LJLJI;
            }
            ViewTreeObserverOnPreDrawListenerC16840lM.LIZ(view, new ARunnableS33S0200000_14(this, view, 55));
        }
    }

    public C82050WIc(LifecycleOwner lifecycleOwner, C82622Wbi diContainer) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLJI = lifecycleOwner;
        this.LJLJJI = diContainer;
        this.LJLJJL = UCI.LJI(diContainer, WIF.class, null);
        UCI.LJI(diContainer, ActivityC45651qj.class, null);
        this.LJLJJLL = UCI.LJI(diContainer, ShortVideoContext.class, null);
        this.LJLJL = new C82049WIb();
        this.LJLJLJ = C53557L0f.LIZ();
    }
}
