package X;

import kotlin.jvm.internal.o;

/* renamed from: X.SqD, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73329SqD extends AbstractC65781Prl implements InterfaceC88471Ynr<AbstractC73672Svk<Object>, AbstractC73672Svk<Object>, AbstractC73672Svk<Object>> {
    public static final C73329SqD LJLIL = new C73329SqD();

    public C73329SqD() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final AbstractC73672Svk<Object> invoke(AbstractC73672Svk<Object> fetcher, AbstractC73672Svk<Object> abstractC73672Svk) {
        AbstractC73672Svk<Object> cache = abstractC73672Svk;
        o.LJIIJ(fetcher, "fetcher");
        o.LJIIJ(cache, "cache");
        C73615Sup LJJJJI = cache.LJJJJI(C73536StY.LJLIL);
        C73320Sq4.LIZ(fetcher, "source2 is null");
        AbstractC73672Svk<Object> LJIIIIZZ = AbstractC73672Svk.LJIIIIZZ(LJJJJI, fetcher);
        o.LJFF(LJIIIIZZ, "cache.onExceptionResumeN…     .concatWith(fetcher)");
        return LJIIIIZZ;
    }
}
