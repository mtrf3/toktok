package X;

import java.util.concurrent.Executor;
import okhttp3.Request;

/* renamed from: X.PgQ, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65078PgQ<T> implements InterfaceC65079PgR<T> {
    public final Executor LJLIL;
    public final InterfaceC65079PgR<T> LJLILLLLZI;

    @Override // X.InterfaceC65079PgR
    public final void cancel() {
        this.LJLILLLLZI.cancel();
    }

    @Override // X.InterfaceC65079PgR
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final InterfaceC65079PgR<T> m32clone() {
        return new C65078PgQ(this.LJLIL, this.LJLILLLLZI.m32clone());
    }

    @Override // X.InterfaceC65079PgR
    public final C64653PYz<T> execute() {
        return this.LJLILLLLZI.execute();
    }

    @Override // X.InterfaceC65079PgR
    public final boolean isCanceled() {
        return this.LJLILLLLZI.isCanceled();
    }

    @Override // X.InterfaceC65079PgR
    public final Request request() {
        return this.LJLILLLLZI.request();
    }

    @Override // X.InterfaceC65079PgR
    public final void LLLZ(InterfaceC64642PYo<T> interfaceC64642PYo) {
        this.LJLILLLLZI.LLLZ(new C65080PgS(this, interfaceC64642PYo));
    }

    public C65078PgQ(Executor executor, InterfaceC65079PgR<T> interfaceC65079PgR) {
        this.LJLIL = executor;
        this.LJLILLLLZI = interfaceC65079PgR;
    }
}
