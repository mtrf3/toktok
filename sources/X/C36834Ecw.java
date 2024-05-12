package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.Ecw, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C36834Ecw implements InterfaceC63764P0u {
    public long LJLIL;

    @Override // X.InterfaceC63764P0u
    public final void onAppBackground() {
        if (this.LJLIL != 0) {
            C36833Ecv.LIZLLL += System.currentTimeMillis() - this.LJLIL;
        }
        if (C36833Ecv.LIZIZ) {
            return;
        }
        C36833Ecv.LIZIZ = true;
        C36832Ecu c36832Ecu = new C36832Ecu();
        C36833Ecv.LJFF = c36832Ecu;
        C36833Ecv.LJ = (C73411SrX) AbstractC73672Svk.LJJIJIIJI((C36833Ecv.LIZ * 60) / 6, TimeUnit.SECONDS).LJJJJZI(c36832Ecu);
    }

    @Override // X.InterfaceC63764P0u
    public final void onAppForeground() {
        this.LJLIL = System.currentTimeMillis();
        if (!C36833Ecv.LIZIZ) {
            return;
        }
        C36833Ecv.LIZIZ = false;
        C73411SrX c73411SrX = C36833Ecv.LJ;
        C36833Ecv.LJ = null;
        C36833Ecv.LJFF = null;
        if (c73411SrX == null) {
            return;
        }
        c73411SrX.dispose();
    }
}
