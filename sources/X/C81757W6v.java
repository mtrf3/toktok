package X;

import android.content.ContentResolver;
import java.util.concurrent.Executor;

/* renamed from: X.W6v, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81757W6v implements W70<W8X> {
    public final Executor LIZ;
    public final W84 LIZIZ;
    public final ContentResolver LIZJ;

    @Override // X.W70
    public final boolean LIZ(C79238V7y c79238V7y) {
        return C78926UyI.LJJIIZI(512, 512, c79238V7y);
    }

    @Override // X.InterfaceC81759W6x
    public final void LIZIZ(W7F<W8X> w7f, InterfaceC81770W7i interfaceC81770W7i) {
        W67 w67 = new W67(this, w7f, interfaceC81770W7i.LIZ(), interfaceC81770W7i.getId(), interfaceC81770W7i.LJ());
        interfaceC81770W7i.LIZLLL(new C81760W6y(w67));
        this.LIZ.execute(w67);
    }

    public C81757W6v(Executor executor, W84 w84, ContentResolver contentResolver) {
        this.LIZ = executor;
        this.LIZIZ = w84;
        this.LIZJ = contentResolver;
    }
}
