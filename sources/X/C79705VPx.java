package X;

import com.bytedance.ies.xelement.reveal.LynxRevealView;
import kotlin.jvm.internal.o;

/* renamed from: X.VPx, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79705VPx implements InterfaceC79790VTe {
    public final /* synthetic */ LynxRevealView LIZ;

    @Override // X.InterfaceC79790VTe
    public final void LIZ() {
    }

    @Override // X.InterfaceC79790VTe
    public final void LLIIJLIL() {
        LynxRevealView lynxRevealView = this.LIZ;
        if (!lynxRevealView.LJLILLLLZI) {
            return;
        }
        VNU lynxContext = lynxRevealView.mContext;
        o.LJFF(lynxContext, "lynxContext");
        VNL vnl = lynxContext.LJLJJL;
        C49615Jdb c49615Jdb = new C49615Jdb(this.LIZ.getSign(), "state");
        c49615Jdb.LIZJ("closed", "state");
        vnl.LIZIZ(c49615Jdb);
    }

    @Override // X.InterfaceC79790VTe
    public final void LLIIL() {
        LynxRevealView lynxRevealView = this.LIZ;
        if (!lynxRevealView.LJLILLLLZI) {
            return;
        }
        VNU lynxContext = lynxRevealView.mContext;
        o.LJFF(lynxContext, "lynxContext");
        VNL vnl = lynxContext.LJLJJL;
        C49615Jdb c49615Jdb = new C49615Jdb(this.LIZ.getSign(), "state");
        c49615Jdb.LIZJ("opened", "state");
        vnl.LIZIZ(c49615Jdb);
    }

    public C79705VPx(LynxRevealView lynxRevealView) {
        this.LIZ = lynxRevealView;
    }
}
