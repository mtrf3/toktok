package X;

import androidx.lifecycle.MutableLiveData;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.SDu, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71746SDu<T> {
    public T LIZ;
    public final ConcurrentHashMap<TBW<T, ?>, InterfaceC88471Ynr<T, T, C76800UCe>> LIZIZ = new ConcurrentHashMap<>();
    public final C62822Ol8 LIZJ = C221108m2.LIZIZ(new AqS162S0100000_12(this, 988));

    public C71746SDu(T t) {
        this.LIZ = t;
    }

    public final void LIZ(InterfaceC88472Yns<? super T, ? extends T> block) {
        o.LJIIIZ(block, "block");
        T t = block.invoke(this.LIZ);
        if (o.LJ(this.LIZ, t)) {
            return;
        }
        synchronized (this) {
            o.LJIIIZ(t, "t");
            T old = this.LIZ;
            o.LJIIIZ(old, "old");
            Iterator<Map.Entry<TBW<T, ?>, InterfaceC88471Ynr<T, T, C76800UCe>>> it = this.LIZIZ.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().invoke(old, t);
            }
            this.LIZ = t;
            ((MutableLiveData) this.LIZJ.getValue()).setValue(this.LIZ);
        }
    }
}
