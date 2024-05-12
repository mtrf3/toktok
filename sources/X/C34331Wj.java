package X;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.1Wj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34331Wj extends AbstractC17640me implements Iterable<AbstractC17640me>, InterfaceC90533gv {
    public final String LJLIL;
    public final float LJLILLLLZI;
    public final float LJLJI;
    public final float LJLJJI;
    public final float LJLJJL;
    public final float LJLJJLL;
    public final float LJLJL;
    public final float LJLJLJ;
    public final List<AbstractC17560mW> LJLJLLL;
    public final List<AbstractC17640me> LJLL;

    public C34331Wj() {
        this("", 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, C17630md.LIZ, C61878OQg.INSTANCE);
    }

    public final int hashCode() {
        return this.LJLL.hashCode() + AnonymousClass391.LIZIZ(this.LJLJLLL, C47959Irz.LIZIZ(this.LJLJLJ, C47959Irz.LIZIZ(this.LJLJL, C47959Irz.LIZIZ(this.LJLJJLL, C47959Irz.LIZIZ(this.LJLJJL, C47959Irz.LIZIZ(this.LJLJJI, C47959Irz.LIZIZ(this.LJLJI, C47959Irz.LIZIZ(this.LJLILLLLZI, this.LJLIL.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    @Override // java.lang.Iterable
    public final Iterator<AbstractC17640me> iterator() {
        return new C34321Wi(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C34331Wj)) {
            return false;
        }
        C34331Wj c34331Wj = (C34331Wj) obj;
        if (o.LJ(this.LJLIL, c34331Wj.LJLIL) && this.LJLILLLLZI == c34331Wj.LJLILLLLZI && this.LJLJI == c34331Wj.LJLJI && this.LJLJJI == c34331Wj.LJLJJI && this.LJLJJL == c34331Wj.LJLJJL && this.LJLJJLL == c34331Wj.LJLJJLL && this.LJLJL == c34331Wj.LJLJL && this.LJLJLJ == c34331Wj.LJLJLJ && o.LJ(this.LJLJLLL, c34331Wj.LJLJLLL) && o.LJ(this.LJLL, c34331Wj.LJLL)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C34331Wj(String name, float f, float f2, float f3, float f4, float f5, float f6, float f7, List<? extends AbstractC17560mW> clipPathData, List<? extends AbstractC17640me> children) {
        o.LJIIIZ(name, "name");
        o.LJIIIZ(clipPathData, "clipPathData");
        o.LJIIIZ(children, "children");
        this.LJLIL = name;
        this.LJLILLLLZI = f;
        this.LJLJI = f2;
        this.LJLJJI = f3;
        this.LJLJJL = f4;
        this.LJLJJLL = f5;
        this.LJLJL = f6;
        this.LJLJLJ = f7;
        this.LJLJLLL = clipPathData;
        this.LJLL = children;
    }
}
