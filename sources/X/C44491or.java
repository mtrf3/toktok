package X;

import java.util.List;

/* renamed from: X.1or, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C44491or extends AbstractC38521fE {
    public C44491or() {
        super(0, new C06810On(1.0f, 1.0f));
    }

    @Override // X.InterfaceC268913t
    public final AbstractC22650uj<C06810On, C06810On> LIZ() {
        final List list = (List) this.LJLILLLLZI;
        return new AbstractC35131Zl<C06810On>(list) { // from class: X.1nk
            public final C06810On LJIIJ;

            {
                if (C03970Dp.LIZ) {
                    this.LJIIJ = new C06810On();
                } else {
                    this.LJIIJ = null;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.AbstractC22650uj
            public final Object LJII(C06780Ok c06780Ok, float f) {
                T t;
                C06810On c06810On;
                T t2 = c06780Ok.LIZIZ;
                if (t2 != 0 && (t = c06780Ok.LIZJ) != 0) {
                    C06810On c06810On2 = (C06810On) t2;
                    C06810On c06810On3 = (C06810On) t;
                    C06800Om<A> c06800Om = this.LJFF;
                    if (c06800Om != 0) {
                        c06780Ok.LJFF.floatValue();
                        return c06800Om.LIZIZ(c06810On2, c06810On3, LJ());
                    }
                    if (C03970Dp.LIZ && (c06810On = this.LJIIJ) != null) {
                        float f2 = c06810On2.LIZ;
                        float LIZIZ = C06420Na.LIZIZ(c06810On3.LIZ, f2, f, f2);
                        float f3 = c06810On2.LIZIZ;
                        float LIZIZ2 = C06420Na.LIZIZ(c06810On3.LIZIZ, f3, f, f3);
                        c06810On.LIZ = LIZIZ;
                        c06810On.LIZIZ = LIZIZ2;
                        return c06810On;
                    }
                    float f4 = c06810On2.LIZ;
                    float LIZIZ3 = C06420Na.LIZIZ(c06810On3.LIZ, f4, f, f4);
                    float f5 = c06810On2.LIZIZ;
                    return new C06810On(LIZIZ3, C06420Na.LIZIZ(c06810On3.LIZIZ, f5, f, f5));
                }
                throw new IllegalStateException("Missing values for keyframe.");
            }
        };
    }

    public C44491or(C06810On c06810On) {
        super(0, c06810On);
    }

    public C44491or(List<C06780Ok<C06810On>> list) {
        super(list, 0);
    }
}
