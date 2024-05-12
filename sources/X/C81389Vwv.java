package X;

import java.io.FileInputStream;
import java.util.concurrent.Executor;

/* renamed from: X.Vwv, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81389Vwv extends AbstractC81781W7t {
    @Override // X.AbstractC81781W7t
    public final String LJ() {
        return "LocalFileFetchProducer";
    }

    @Override // X.AbstractC81781W7t
    public final W8X LIZLLL(W5O w5o) {
        return LIZJ(new FileInputStream(w5o.LIZJ().toString()), (int) w5o.LIZJ().length());
    }

    public C81389Vwv(Executor executor, W84 w84) {
        super(executor, w84);
    }
}
