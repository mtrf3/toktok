package X;

import Y.AObjectS119S0200000_14;
import Y.AObjectS89S0100000_14;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.jvm.internal.AqS180S0100000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WJH extends WJB {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LJLJL;
    public final LifecycleOwner LJLJI;
    public final C82622Wbi LJLJJI;
    public boolean LJLJJL;
    public final C82070WIw LJLJJLL;

    static {
        TBT tbt = new TBT(WJH.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        C65352Pkq.LIZ.getClass();
        LJLJL = new InterfaceC74236TBo[]{tbt};
    }

    @Override // X.WJB
    public final void LIZLLL() {
        C82622Wbi c82622Wbi = this.LJLJJI;
        if (L2L.LIZ(c82622Wbi)) {
            ((C1EP) c82622Wbi.LJ(C1EP.class, null)).m3(InterfaceC45921I0n.class, new AqS180S0100000_14(this, 283));
            return;
        }
        C0I6 c0i6 = (C0I6) c82622Wbi.LJIIIIZZ(null, InterfaceC45921I0n.class);
        if (c0i6 == null) {
            return;
        }
        InterfaceC45921I0n interfaceC45921I0n = (InterfaceC45921I0n) c0i6;
        if (!HWY.LIZ()) {
            return;
        }
        new SafeHandler(this.LJLJI);
        interfaceC45921I0n.qc().LIZIZ(this.LJLJI, new AObjectS89S0100000_14(this, 414));
        interfaceC45921I0n.t5().LIZLLL(this.LJLJI, new AObjectS119S0200000_14(interfaceC45921I0n, this, 5));
    }

    @Override // X.WJB
    public final void LJFF() {
        InterfaceC45921I0n interfaceC45921I0n = (InterfaceC45921I0n) this.LJLJJI.LJIIIIZZ(null, InterfaceC45921I0n.class);
        if (interfaceC45921I0n != null) {
            interfaceC45921I0n.oP();
        }
    }

    @Override // X.WJB
    public final boolean LJIIIIZZ() {
        if (HWY.LIZ()) {
            if (!((ShortVideoContext) this.LJLJJI.LJ(ShortVideoContext.class, null)).LJJJI()) {
                C78934UyQ.LJLIL.LIZLLL().getClass();
                if (L95.LIZIZ()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // X.WJB
    public final WI1 LIZJ() {
        return this.LJLJJLL;
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLJJI;
    }

    public WJH(LifecycleOwner lifecycleOwner, C82622Wbi diContainer) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLJI = lifecycleOwner;
        this.LJLJJI = diContainer;
        C82632Wbs LJI = UCI.LJI(diContainer, ShortVideoContext.class, null);
        InterfaceC74236TBo<?>[] interfaceC74236TBoArr = LJLJL;
        this.LJLJJL = !((ShortVideoContext) LJI.LIZ(this, interfaceC74236TBoArr[0])).mIsFromDraft;
        C82070WIw c82070WIw = new C82070WIw();
        if (C43846HIs.LIZ((ShortVideoContext) LJI.LIZ(this, interfaceC74236TBoArr[0]))) {
            WI0 wi0 = c82070WIw.LJIIIZ;
            c82070WIw.LJIIIZ = new WI0(wi0.LJLIL, wi0.LJLILLLLZI, false);
        } else {
            WI0 wi02 = c82070WIw.LJIIIZ;
            c82070WIw.LJIIIZ = new WI0(wi02.LJLIL, wi02.LJLILLLLZI, true);
        }
        this.LJLJJLL = c82070WIw;
    }
}
