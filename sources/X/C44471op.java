package X;

import java.util.List;

/* renamed from: X.1op, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C44471op extends AbstractC38521fE {
    public C44471op() {
        super(0, (Object) 100);
    }

    @Override // X.InterfaceC268913t
    public final AbstractC22650uj<Integer, Integer> LIZ() {
        final List list = (List) this.LJLILLLLZI;
        return new AbstractC35131Zl<Integer>(list) { // from class: X.1nh
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.AbstractC22650uj
            public final Object LJII(C06780Ok c06780Ok, float f) {
                T t = c06780Ok.LIZIZ;
                if (t != 0 && c06780Ok.LIZJ != 0) {
                    C06800Om<A> c06800Om = this.LJFF;
                    if (c06800Om != 0) {
                        c06780Ok.LJFF.floatValue();
                        return c06800Om.LIZIZ(c06780Ok.LIZIZ, c06780Ok.LIZJ, LJ());
                    }
                    return Integer.valueOf((int) ((f * (((Integer) c06780Ok.LIZJ).intValue() - r2)) + ((Integer) t).intValue()));
                }
                throw new IllegalStateException("Missing values for keyframe.");
            }
        };
    }

    public C44471op(List<C06780Ok<Integer>> list) {
        super(list, 0);
    }
}
