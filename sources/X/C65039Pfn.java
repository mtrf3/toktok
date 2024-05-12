package X;

import java.util.concurrent.CompletableFuture;

/* renamed from: X.Pfn, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65039Pfn implements InterfaceC64642PYo<Object> {
    public final /* synthetic */ CompletableFuture LIZ;

    public C65039Pfn(C65043Pfr c65043Pfr) {
        this.LIZ = c65043Pfr;
    }

    @Override // X.InterfaceC64642PYo
    public final void onFailure(InterfaceC65079PgR<Object> interfaceC65079PgR, Throwable th) {
        this.LIZ.completeExceptionally(th);
    }

    @Override // X.InterfaceC64642PYo
    public final void onResponse(InterfaceC65079PgR<Object> interfaceC65079PgR, C64653PYz<Object> c64653PYz) {
        if (c64653PYz.LIZ()) {
            this.LIZ.complete(c64653PYz.LIZIZ);
        } else {
            this.LIZ.completeExceptionally(new PZF(c64653PYz));
        }
    }
}
