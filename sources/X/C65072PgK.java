package X;

import com.bytedance.retrofit2.client.Request;
import java.util.concurrent.Executor;

/* renamed from: X.PgK, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65072PgK<T> implements InterfaceC37276Ek4<T>, InterfaceC37818Eso {
    public final Executor LJLIL;
    public final InterfaceC37276Ek4<T> LJLILLLLZI;

    @Override // X.InterfaceC37276Ek4
    public final void cancel() {
        this.LJLILLLLZI.cancel();
    }

    @Override // X.InterfaceC37276Ek4
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final InterfaceC37276Ek4<T> m31clone() {
        return new C65072PgK(this.LJLIL, this.LJLILLLLZI.m31clone());
    }

    @Override // X.InterfaceC37818Eso
    public final void doCollect() {
        InterfaceC37276Ek4<T> interfaceC37276Ek4 = this.LJLILLLLZI;
        if (interfaceC37276Ek4 instanceof InterfaceC37818Eso) {
            ((InterfaceC37818Eso) interfaceC37276Ek4).doCollect();
        }
    }

    @Override // X.InterfaceC37276Ek4
    public final C64797Pbt execute() {
        return this.LJLILLLLZI.execute();
    }

    @Override // X.InterfaceC37276Ek4
    public final boolean isCanceled() {
        return this.LJLILLLLZI.isCanceled();
    }

    @Override // X.InterfaceC37276Ek4
    public final Request request() {
        return this.LJLILLLLZI.request();
    }

    @Override // X.InterfaceC37276Ek4
    public final void enqueue(InterfaceC36621EYv<T> interfaceC36621EYv) {
        C65139PhP.LIZ(interfaceC36621EYv, "callback == null");
        this.LJLILLLLZI.enqueue(new C65073PgL(this, interfaceC36621EYv));
    }

    public C65072PgK(Executor executor, InterfaceC37276Ek4<T> interfaceC37276Ek4) {
        this.LJLIL = executor;
        this.LJLILLLLZI = interfaceC37276Ek4;
    }
}
