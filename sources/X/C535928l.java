package X;

import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.28l, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C535928l<E> extends OJN<E> implements InterfaceC44231oR<E> {
    public static final C535928l LJLJJI;
    public final Object LJLIL;
    public final Object LJLILLLLZI;
    public final C44541ow<E, C15Z> LJLJI;

    static {
        C00A c00a = C00A.LIZ;
        C44541ow c44541ow = C44541ow.LJLJI;
        o.LJII(c44541ow, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>");
        LJLJJI = new C535928l(c00a, c00a, c44541ow);
    }

    @Override // X.OQZ
    public final int LIZJ() {
        C44541ow<E, C15Z> c44541ow = this.LJLJI;
        c44541ow.getClass();
        return c44541ow.LJLILLLLZI;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        return new C39031g3(this.LJLIL, this.LJLJI);
    }

    @Override // X.InterfaceC44231oR
    public final C535928l LJIIL(C24700y2 c24700y2) {
        if (this.LJLJI.containsKey(c24700y2)) {
            return this;
        }
        if (isEmpty()) {
            return new C535928l(c24700y2, c24700y2, this.LJLJI.LIZ(c24700y2, new C15Z()));
        }
        Object obj = this.LJLILLLLZI;
        C15Z c15z = this.LJLJI.get(obj);
        o.LJI(c15z);
        return new C535928l(this.LJLIL, c24700y2, this.LJLJI.LIZ(obj, new C15Z(c15z.LIZ, c24700y2)).LIZ(c24700y2, new C15Z(obj, C00A.LIZ)));
    }

    @Override // X.OQZ, java.util.Collection
    public final boolean contains(Object obj) {
        return this.LJLJI.containsKey(obj);
    }

    @Override // java.util.Collection, java.util.Set, X.InterfaceC44231oR
    public final C535928l remove(Object obj) {
        int i;
        Object obj2;
        C15Z c15z = this.LJLJI.get(obj);
        if (c15z == null) {
            return this;
        }
        C44541ow<E, C15Z> c44541ow = this.LJLJI;
        C14U<E, C15Z> c14u = c44541ow.LJLIL;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        C14U<E, C15Z> LJIJJLI = c14u.LJIJJLI(i, 0, obj);
        if (c44541ow.LJLIL != LJIJJLI) {
            if (LJIJJLI == null) {
                c44541ow = C44541ow.LJLJI;
                o.LJII(c44541ow, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>");
            } else {
                c44541ow = new C44541ow<>(LJIJJLI, c44541ow.LJLILLLLZI - 1);
            }
        }
        Object obj3 = c15z.LIZ;
        C00A c00a = C00A.LIZ;
        if (obj3 != c00a) {
            C15Z c15z2 = c44541ow.get(obj3);
            o.LJI(c15z2);
            c44541ow = c44541ow.LIZ(c15z.LIZ, new C15Z(c15z2.LIZ, c15z.LIZIZ));
        }
        Object obj4 = c15z.LIZIZ;
        if (obj4 != c00a) {
            C15Z c15z3 = c44541ow.get(obj4);
            o.LJI(c15z3);
            c44541ow = c44541ow.LIZ(c15z.LIZIZ, new C15Z(c15z.LIZ, c15z3.LIZIZ));
        }
        Object obj5 = c15z.LIZ;
        if (obj5 != c00a) {
            obj2 = this.LJLIL;
        } else {
            obj2 = c15z.LIZIZ;
        }
        if (c15z.LIZIZ != c00a) {
            obj5 = this.LJLILLLLZI;
        }
        return new C535928l(obj2, obj5, c44541ow);
    }

    public C535928l(Object obj, Object obj2, C44541ow<E, C15Z> c44541ow) {
        this.LJLIL = obj;
        this.LJLILLLLZI = obj2;
        this.LJLJI = c44541ow;
    }
}
