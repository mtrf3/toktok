package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.Nom, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60500Nom implements InterfaceC60501Non {
    public final /* synthetic */ AtomicInteger LIZ;
    public final /* synthetic */ InterfaceC60501Non LIZIZ;

    @Override // X.InterfaceC60501Non
    public final void LIZ() {
        InterfaceC60501Non interfaceC60501Non;
        if (this.LIZ.decrementAndGet() == 0 && (interfaceC60501Non = this.LIZIZ) != null) {
            interfaceC60501Non.LIZ();
        }
    }

    public C60500Nom(AtomicInteger atomicInteger, C60497Noj c60497Noj) {
        this.LIZ = atomicInteger;
        this.LIZIZ = c60497Noj;
    }
}
