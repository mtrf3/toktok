package X;

import com.google.gson.m;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Eog, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37562Eog implements InterfaceC37591Ep9 {
    public final AtomicBoolean LIZ = new AtomicBoolean(false);
    public final C37558Eoc LIZIZ;

    @Override // X.InterfaceC37591Ep9
    public final void close() {
        this.LIZ.compareAndSet(false, true);
    }

    public C37562Eog(C37558Eoc c37558Eoc) {
        this.LIZIZ = c37558Eoc;
    }

    @Override // X.InterfaceC37591Ep9
    public final void LIZ(final C37583Ep1 c37583Ep1) {
        C37558Eoc c37558Eoc = this.LIZIZ;
        c37558Eoc.LIZLLL.LIZJ(new BQ6() { // from class: X.Eom
            @Override // X.BQ6
            public final void accept(Object obj) {
                C37562Eog c37562Eog = C37562Eog.this;
                BQ6 bq6 = c37583Ep1;
                if (c37562Eog.LIZ.get() || obj == null) {
                    return;
                }
                bq6.accept(obj);
            }
        });
    }

    @Override // X.InterfaceC37591Ep9
    public final void LIZIZ(m mVar) {
        if (this.LIZ.get()) {
            return;
        }
        this.LIZIZ.LJ.sendWorkerBridgeMessage(C37697Eqr.LIZIZ(mVar));
    }
}
