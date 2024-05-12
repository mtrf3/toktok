package X;

import java.util.concurrent.atomic.AtomicLong;
import webcast.api.game.TnsPiracyDetail;

/* renamed from: X.1XC, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1XC implements InterfaceC18260ne {
    public final AtomicLong LIZ = new AtomicLong(0);
    public final AtomicLong LIZIZ = new AtomicLong(0);

    @Override // X.InterfaceC18260ne
    public final void start() {
        if (C30922CBq.LIZIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("TouchSignalSource. start. ThreadName=");
            LIZ.append(C18280ng.LIZ());
            C0NB.LJIIIZ("TouchSignalSource", X1D.LIZIZ(LIZ));
        }
    }

    @Override // X.InterfaceC18260ne
    public final void stop() {
        if (C30922CBq.LIZIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("TouchSignalSource. stop. ThreadName=");
            LIZ.append(C18280ng.LIZ());
            C0NB.LJIIIZ("TouchSignalSource", X1D.LIZIZ(LIZ));
        }
    }

    @Override // X.InterfaceC18260ne
    public final void LIZ(TnsPiracyDetail tnsPiracyDetail) {
        if (C30922CBq.LIZIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("TouchSignalSource. flush. ThreadName=");
            LIZ.append(C18280ng.LIZ());
            C0NB.LJIIIZ("TouchSignalSource", X1D.LIZIZ(LIZ));
        }
        tnsPiracyDetail.frontScreenClicks = this.LIZ.get();
        tnsPiracyDetail.backScreenClicks = this.LIZIZ.get();
        this.LIZ.set(0L);
        this.LIZIZ.set(0L);
    }
}
