package X;

import java.util.List;

/* renamed from: X.1om, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C44441om extends AbstractC38521fE {
    @Override // X.InterfaceC268913t
    public final AbstractC22650uj<Integer, Integer> LIZ() {
        final List list = (List) this.LJLILLLLZI;
        return new AbstractC35131Zl<Integer>(list) { // from class: X.1ne
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.AbstractC22650uj
            public final Object LJII(C06780Ok c06780Ok, float f) {
                T t = c06780Ok.LIZIZ;
                if (t != 0 && c06780Ok.LIZJ != 0) {
                    int intValue = ((Integer) t).intValue();
                    int intValue2 = ((Integer) c06780Ok.LIZJ).intValue();
                    C06800Om<A> c06800Om = this.LJFF;
                    if (c06800Om != 0) {
                        c06780Ok.LJFF.floatValue();
                        return c06800Om.LIZIZ(Integer.valueOf(intValue), Integer.valueOf(intValue2), LJ());
                    }
                    return Integer.valueOf(C06210Mf.LIZJ(f, intValue, intValue2));
                }
                throw new IllegalStateException("Missing values for keyframe.");
            }
        };
    }

    public C44441om(List<C06780Ok<Integer>> list) {
        super(list, 0);
    }
}
