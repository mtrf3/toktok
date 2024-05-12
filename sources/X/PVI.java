package X;

import java.io.IOException;

/* loaded from: classes12.dex */
public final class PVI extends PUD {
    public final /* synthetic */ PVK LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PVI(PVK pvk, PW3 pw3) {
        super(pw3);
        this.LJLIL = pvk;
    }

    @Override // X.PUD, X.PUC
    public final long read(C64533PUj c64533PUj, long j) {
        try {
            return super.read(c64533PUj, j);
        } catch (IOException e) {
            this.LJLIL.LJLJI = e;
            throw e;
        }
    }
}
