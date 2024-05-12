package X;

import java.util.concurrent.CompletableFuture;

/* renamed from: X.Pfq, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65042Pfq extends CompletableFuture<C64653PYz<Object>> {
    public final /* synthetic */ InterfaceC65079PgR LJLIL;

    public C65042Pfq(C64639PYl c64639PYl) {
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
