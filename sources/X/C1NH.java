package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.1NH, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1NH extends C0VK {
    public C1NH() {
        this(C1NF.LIZIZ);
    }

    public C1NH(C0VK initialExtras) {
        o.LJIIIZ(initialExtras, "initialExtras");
        this.LIZ.putAll(initialExtras.LIZ);
    }

    @Override // X.C0VK
    public final <T> T LIZ(C0VJ<T> key) {
        o.LJIIIZ(key, "key");
        return (T) ((LinkedHashMap) this.LIZ).get(key);
    }

    public final <T> void LIZIZ(C0VJ<T> key, T t) {
        o.LJIIIZ(key, "key");
        this.LIZ.put(key, t);
    }
}
