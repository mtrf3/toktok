package X;

import android.content.ContentResolver;
import java.util.concurrent.Executor;

/* renamed from: X.W6w, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81758W6w implements InterfaceC81759W6x<C81392Vwy<W5A>> {
    public final Executor LIZ;
    public final ContentResolver LIZIZ;

    public C81758W6w(Executor executor, ContentResolver contentResolver) {
        this.LIZ = executor;
        this.LIZIZ = contentResolver;
    }

    @Override // X.InterfaceC81759W6x
    public final void LIZIZ(W7F<C81392Vwy<W5A>> w7f, InterfaceC81770W7i interfaceC81770W7i) {
        InterfaceC81754W6s LIZ = interfaceC81770W7i.LIZ();
        String id = interfaceC81770W7i.getId();
        W5Q w5q = new W5Q(this, w7f, LIZ, id, LIZ, id, interfaceC81770W7i.LJ());
        interfaceC81770W7i.LIZLLL(new C81761W6z(w5q));
        this.LIZ.execute(w5q);
    }
}
