package X;

import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WL9 extends AbstractC29891Fh<W13> implements W13 {
    public final C82622Wbi LJLIL;
    public final C40871j1<Boolean> LJLILLLLZI;

    public W13 LJJLI() {
        return this;
    }

    @Override // X.W13
    public void jD() {
        this.LJLILLLLZI.LJI(Boolean.TRUE);
    }

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ W13 getApiComponent() {
        LJJLI();
        return this;
    }

    @Override // X.W13, X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLIL;
    }

    @Override // X.W13
    public /* bridge */ /* synthetic */ C0IB tu0() {
        return this.LJLILLLLZI;
    }

    public WL9(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLIL = diContainer;
        this.LJLILLLLZI = new C40871j1<>(Boolean.FALSE);
    }

    @Override // X.W13
    public <T extends C0I6> void m3(Class<T> clazz, InterfaceC88472Yns<? super T, C76800UCe> callback) {
        o.LJIIIZ(clazz, "clazz");
        o.LJIIIZ(callback, "callback");
        whenReady(this, clazz, callback);
    }
}
