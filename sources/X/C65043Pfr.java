package X;

import java.util.concurrent.CompletableFuture;

/* renamed from: X.Pfr, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65043Pfr extends CompletableFuture<Object> {
    public final /* synthetic */ InterfaceC65079PgR LJLIL;

    public C65043Pfr(C64639PYl c64639PYl) {
        this.LJLIL = c64639PYl;
    }

    @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        if (z) {
            this.LJLIL.cancel();
        }
        return super.cancel(z);
    }
}
