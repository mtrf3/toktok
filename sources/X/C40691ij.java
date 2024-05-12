package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1ij, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C40691ij extends AbstractC29891Fh<C1EP> implements InterfaceC135635Tz, C0IA, C1EP {
    public final C1EP LJLIL;
    public final String LJLILLLLZI;
    public final C82622Wbi LJLJI;

    @Override // X.AbstractC29891Fh
    public /* bridge */ /* synthetic */ C1EP getApiComponent() {
        return this.LJLIL;
    }

    @Override // X.AbstractC29891Fh
    public String getComponentName() {
        return this.LJLILLLLZI;
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        return this.LJLJI;
    }

    public C40691ij(C82622Wbi diContainer) {
        o.LJIIIZ(diContainer, "diContainer");
        this.LJLJI = diContainer;
        this.LJLIL = this;
        this.LJLILLLLZI = "ALSInternalLazyHelperComponent";
    }

    @Override // X.C1EP
    public <T extends C0I6> T sO(Class<T> clazz) {
        o.LJIIIZ(clazz, "clazz");
        return findReadyComponent(this, clazz);
    }

    @Override // X.C1EP
    public <T extends C0I6> void m3(Class<T> clazz, InterfaceC88472Yns<? super T, C76800UCe> callback) {
        o.LJIIIZ(clazz, "clazz");
        o.LJIIIZ(callback, "callback");
        whenReady(this, clazz, callback);
    }

    @Override // X.C1EP
    public <T extends C0I6> void wt0(Class<T> clazz, InterfaceC88472Yns<? super T, C76800UCe> callback) {
        o.LJIIIZ(clazz, "clazz");
        o.LJIIIZ(callback, "callback");
        whenReadyOrThrow(this, clazz, callback);
    }
}
