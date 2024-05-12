package X;

import Y.AObjectS89S0100000_14;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.AqS18S0010000_14;
import kotlin.jvm.internal.AqS69S0110000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WYW extends AbstractC48231ut<InterfaceC82341WTh, C46009I3x, I4A, I4R> implements InterfaceC135635Tz, InterfaceC82341WTh {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLZ;
    public final WMH LJLL;
    public final C82622Wbi LJLLI;
    public final InterfaceC115514g7 LJLLILLLL;
    public final InterfaceC115514g7 LJLLJ;
    public final InterfaceC115514g7 LJLLL;
    public final InterfaceC65784Pro<I4A> LJLLLL;
    public final InterfaceC65784Pro<I4R> LJLLLLLL;

    static {
        TBT tbt = new TBT(WYW.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LJLZ = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(WYW.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0, c65351Pkp), C61845OOz.LIZJ(WYW.class, "dockBarApiComponent", "getDockBarApiComponent()Lcom/ss/android/ugc/gamora/recorder/control/DockBarApiComponent;", 0, c65351Pkp)};
    }

    @Override // X.InterfaceC82341WTh
    public void LJIJI() {
        LJJZZI(WYX.LJLIL);
    }

    public final InterfaceC45889Hzh LJLZ() {
        return (InterfaceC45889Hzh) this.LJLLL.LIZ(this, LJLZ[2]);
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LJLLJ.LIZ(this, LJLZ[1]);
    }

    public final I0N getStickerApiComponent() {
        return (I0N) this.LJLLILLLL.LIZ(this, LJLZ[0]);
    }

    @Override // X.AbstractC48231ut, X.AbstractC29891Fh
    public void onCreate() {
        super.onCreate();
        C82622Wbi diContainer = getDiContainer();
        if (L2L.LIZ(diContainer)) {
            ((C1EP) diContainer.LJ(C1EP.class, null)).m3(InterfaceC82129WLd.class, new AqS180S0100000_14(this, 83));
            return;
        }
        C0I6 c0i6 = (C0I6) diContainer.LJIIIIZZ(null, InterfaceC82129WLd.class);
        if (c0i6 == null) {
            return;
        }
        InterfaceC82129WLd interfaceC82129WLd = (InterfaceC82129WLd) c0i6;
        if (o.LJ(interfaceC82129WLd.bL().LIZJ(), Boolean.TRUE)) {
            LJJZZI(WYY.LJLIL);
        }
        interfaceC82129WLd.bL().LIZLLL(this, new AObjectS89S0100000_14(this, 104));
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<I4A> LJJLIIIJJI() {
        return this.LJLLLL;
    }

    @Override // X.AbstractC41331jl
    public InterfaceC65784Pro<I4R> LJJLIIIJJIZ() {
        return this.LJLLLLLL;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLLI;
    }

    @Override // X.InterfaceC82341WTh
    public void GP(boolean z) {
        LJJZZI(new AqS18S0010000_14(z, 9));
    }

    @Override // X.InterfaceC82341WTh
    public void Lc(boolean z) {
        LJJZZI(new AqS18S0010000_14(z, 8));
    }

    @Override // X.InterfaceC82341WTh
    public void t0(boolean z) {
        LJJZZI(new AqS18S0010000_14(z, 7));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WYW(WMH parentScene, C82622Wbi diContainer, boolean z) {
        super(parentScene);
        o.LJIIIZ(parentScene, "parentScene");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLL = parentScene;
        this.LJLLI = diContainer;
        this.LJLLILLLL = UCI.LJI(getDiContainer(), I0N.class, null);
        this.LJLLJ = UCI.LJI(getDiContainer(), ShortVideoContext.class, null);
        this.LJLLL = UCI.LJII(getDiContainer(), InterfaceC45889Hzh.class, null);
        this.LJLLLL = new AqS69S0110000_14(this, z, 1);
        this.LJLLLLLL = new AqS157S0100000_7(this, 146);
    }
}
