package X;

import android.content.Context;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NPF implements InterfaceC59069NGf {
    public final NMV LJLIL;
    public final C59572NZo LJLILLLLZI;
    public final NPG LJLJI;
    public volatile boolean LJLJJI;

    @Override // X.NZ2
    public final void LJ() {
    }

    @Override // X.NZ2
    public final void LJJLI() {
    }

    @Override // X.NZ2
    public final void onPause() {
    }

    @Override // X.NZ2
    public final void onResume() {
    }

    @Override // X.NZ2
    public final void LLLJL() {
        if (this.LJLJJI) {
            return;
        }
        this.LJLJJI = true;
    }

    @Override // X.NZ2
    public final void onDestroy() {
        this.LJLJI.dispose();
    }

    @Override // X.NZ2
    public final void onHide() {
        NMV nmv = this.LJLIL;
        if (nmv != null) {
            nmv.LJFF(false);
        }
    }

    @Override // X.NZ2
    public final void onShow() {
        NMV nmv = this.LJLIL;
        if (nmv != null) {
            nmv.LJFF(true);
        }
        NMV nmv2 = this.LJLIL;
        if (nmv2 == null) {
            return;
        }
        nmv2.LJFF = false;
    }

    @Override // X.NZ2
    public final void LLLL() {
        C84763XOl.LJI().LIZ(this.LJLJI);
    }

    @Override // X.InterfaceC59499NWt
    public final C59572NZo LIZ() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC59499NWt
    public final NMV LIZIZ() {
        return this.LJLIL;
    }

    public NPF(Context context) {
        o.LJIIIZ(context, "context");
        this.LJLJI = new NPG();
        this.LJLILLLLZI = new C59572NZo(context);
        this.LJLIL = new NMV(context);
    }

    @Override // X.NZ2
    public final void LLLJIL(Runnable runnable) {
        NMV nmv = this.LJLIL;
        if (nmv == null) {
            return;
        }
        nmv.LIZIZ = runnable;
    }
}
