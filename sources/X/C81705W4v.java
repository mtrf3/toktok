package X;

import android.content.Context;

/* renamed from: X.W4v, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81705W4v extends AbstractC81686W4c<C81705W4v, W5O, C81392Vwy<W5A>, InterfaceC81599W0t> {
    public final W6J LJIILLIIL;
    public final C81707W4x LJIIZILJ;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC81686W4c
    public final W4O LIZLLL() {
        W4O w4o;
        V91 v91;
        C81939WDv.LIZIZ();
        try {
            InterfaceC81252Vui interfaceC81252Vui = this.LJIIL;
            String valueOf = String.valueOf(AbstractC81686W4c.LJIILL.getAndIncrement());
            if (interfaceC81252Vui instanceof W4O) {
                w4o = (W4O) interfaceC81252Vui;
            } else {
                C81707W4x c81707W4x = this.LJIIZILJ;
                w4o = new W4O(c81707W4x.LIZ, c81707W4x.LIZIZ, c81707W4x.LIZJ, c81707W4x.LIZLLL, c81707W4x.LJ, c81707W4x.LJFF);
                W4P<Boolean> w4p = c81707W4x.LJI;
                if (w4p != null) {
                    w4o.LJJIII = w4p.get().booleanValue();
                }
            }
            w4o.getClass();
            W4P LJ = LJ(w4o, valueOf);
            W5O w5o = (W5O) this.LIZLLL;
            W6O w6o = this.LJIILLIIL.LJIIIIZZ;
            if (w6o == null || w5o == null) {
                v91 = null;
            } else if (w5o.LJIILLIIL != null) {
                v91 = w6o.LIZLLL(w5o, this.LIZJ);
            } else {
                v91 = w6o.LIZIZ(w5o, this.LIZJ);
            }
            w4o.LJJII(LJ, valueOf, v91, this.LIZJ, (W5O) this.LIZLLL);
            w4o.LJJIII();
            return w4o;
        } finally {
            C81939WDv.LIZIZ();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.W5O, REQUEST] */
    public final C81705W4v LJI(android.net.Uri uri) {
        if (uri == null) {
            this.LIZLLL = null;
            return this;
        }
        W5P LIZLLL = W5P.LIZLLL(uri);
        LIZLLL.LIZLLL = V85.LJ;
        this.LIZLLL = LIZLLL.LIZ();
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.W5O, REQUEST] */
    public final C81705W4v LJII(String str) {
        if (str == null || str.isEmpty()) {
            this.LIZLLL = W5O.LIZIZ(str);
            return this;
        }
        LJI(android.net.Uri.parse(str));
        return this;
    }

    public C81705W4v(Context context, C81707W4x c81707W4x, W6J w6j, java.util.Set<W4Z> set) {
        super(context, set);
        this.LJIILLIIL = w6j;
        this.LJIIZILJ = c81707W4x;
        this.LJIIIIZZ = c81707W4x.LJII;
    }

    @Override // X.AbstractC81686W4c
    public final AbstractC48384Iyq LIZIZ(InterfaceC81252Vui interfaceC81252Vui, Object obj, Object obj2, EnumC81709W4z enumC81709W4z) {
        W50 w50;
        UF5 uf5;
        W92 w92;
        W5O w5o = (W5O) obj;
        W6J w6j = this.LJIILLIIL;
        int i = C81708W4y.LIZ[enumC81709W4z.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    w50 = W50.BITMAP_MEMORY_CACHE;
                } else {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Cache level");
                    LIZ.append(enumC81709W4z);
                    LIZ.append("is not supported. ");
                    throw new RuntimeException(X1D.LIZIZ(LIZ));
                }
            } else {
                w50 = W50.DISK_CACHE;
            }
        } else {
            w50 = W50.FULL_FETCH;
        }
        if (interfaceC81252Vui instanceof W4O) {
            uf5 = ((W4O) interfaceC81252Vui).LJJIFFI();
        } else {
            uf5 = null;
        }
        W92 w922 = W92.HIGH;
        if (w5o != null) {
            w92 = w5o.LJIIJJI;
        } else {
            w92 = w922;
        }
        return w6j.LIZLLL(w5o, obj2, w50, uf5, W92.getHigherPriority(w922, w92));
    }
}
