package X;

import java.lang.Enum;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS103S0300000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.WwF, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83895WwF<KEY extends Enum<KEY>> implements InterfaceC83838WvK {
    public final C62822Ol8 LIZ;
    public final InterfaceC83821Wv3<KEY> LIZIZ;
    public final C83899WwJ<KEY> LIZJ;

    @Override // X.InterfaceC83838WvK
    public final java.util.Map<Class<InterfaceC83847WvT>, InterfaceC83847WvT> LIZ() {
        return (java.util.Map) this.LIZ.getValue();
    }

    public C83895WwF(InterfaceC83821Wv3<KEY> key, C83899WwJ<KEY> c83899WwJ) {
        o.LJIIIZ(key, "key");
        this.LIZIZ = key;
        this.LIZJ = c83899WwJ;
        new LinkedHashMap();
        this.LIZ = C221108m2.LIZIZ(new C83896WwG(this));
    }

    @Override // X.InterfaceC83838WvK
    public final C83935Wwt LIZIZ(InterfaceC83821Wv3<?> targetKey, C83935Wwt c83935Wwt, C83935Wwt sourceContext) {
        C83935Wwt c83935Wwt2;
        o.LJIIIZ(targetKey, "targetKey");
        o.LJIIIZ(sourceContext, "sourceContext");
        C83898WwI<KEY> LIZ = this.LIZJ.LIZ();
        java.util.Set<? extends TBW<C83935Wwt, ? extends Object>> set = (java.util.Set) ((LinkedHashMap) LIZ.LJFF).get(targetKey);
        if (set == null || set.isEmpty()) {
            c83935Wwt2 = c83935Wwt;
        } else {
            c83935Wwt2 = LIZ.LJ(c83935Wwt, sourceContext, set);
        }
        new AqS103S0300000_14(c83935Wwt2, c83935Wwt, sourceContext, 5);
        C82891Wg3.LIZIZ();
        return c83935Wwt2;
    }
}
