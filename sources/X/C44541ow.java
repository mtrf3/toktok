package X;

import kotlin.jvm.internal.o;

/* renamed from: X.1ow, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C44541ow<K, V> extends AbstractC35957E9h<K, V> implements InterfaceC37431dT<K, V> {
    public static final C44541ow LJLJI = new C44541ow(C14U.LJ, 0);
    public final C14U<K, V> LJLIL;
    public final int LJLILLLLZI;

    @Override // X.InterfaceC37431dT
    public final C44551ox builder() {
        return new C44551ox(this);
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        int i;
        C14U<K, V> c14u = this.LJLIL;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return c14u.LIZLLL(i, 0, obj);
    }

    @Override // java.util.Map
    public final V get(Object obj) {
        int i;
        C14U<K, V> c14u = this.LJLIL;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return (V) c14u.LJI(i, 0, obj);
    }

    public C44541ow(C14U<K, V> node, int i) {
        o.LJIIIZ(node, "node");
        this.LJLIL = node;
        this.LJLILLLLZI = i;
    }

    public final C44541ow LIZ(Object obj, C15Z c15z) {
        int i;
        C14U<K, V> c14u = this.LJLIL;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        C14T LJIJJ = c14u.LJIJJ(i, 0, obj, c15z);
        if (LJIJJ == null) {
            return this;
        }
        return new C44541ow(LJIJJ.LIZ, this.LJLILLLLZI + LJIJJ.LIZIZ);
    }
}
