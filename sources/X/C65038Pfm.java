package X;

import java.util.concurrent.CompletableFuture;

/* renamed from: X.Pfm, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65038Pfm implements InterfaceC64642PYo<Object> {
    public final /* synthetic */ CompletableFuture LIZ;

    public C65038Pfm(C65042Pfq c65042Pfq) {
        this.LIZ = c65042Pfq;
    }

    @Override // X.InterfaceC64642PYo
    public final void onFailure(InterfaceC65079PgR<Object> interfaceC65079PgR, Throwable th) {
        this.LIZ.completeExceptionally(th);
    }

    @Override // X.InterfaceC64642PYo
    public final void onResponse(InterfaceC65079PgR<Object> interfaceC65079PgR, C64653PYz<Object> c64653PYz) {
        this.LIZ.complete(c64653PYz);
    }
}
