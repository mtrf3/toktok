package X;

import android.content.ContentResolver;
import java.util.concurrent.Executor;

/* renamed from: X.Vwn, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81381Vwn extends AbstractC81781W7t {
    public final ContentResolver LIZJ;

    @Override // X.AbstractC81781W7t
    public final String LJ() {
        return "QualifiedResourceFetchProducer";
    }

    @Override // X.AbstractC81781W7t
    public final W8X LIZLLL(W5O w5o) {
        return LIZJ(this.LIZJ.openInputStream(w5o.LIZIZ), -1);
    }

    public C81381Vwn(Executor executor, W84 w84, ContentResolver contentResolver) {
        super(executor, w84);
        this.LIZJ = contentResolver;
    }
}
