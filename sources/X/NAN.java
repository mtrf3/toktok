package X;

import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NAN<T, V> {
    public final NAJ LIZ;
    public final Class<? extends V> LIZIZ;
    public V LIZJ;
    public final AtomicBoolean LIZLLL;

    public final Object LIZ(InterfaceC74236TBo property) {
        o.LJIIIZ(property, "property");
        if (!this.LIZLLL.getAndSet(true)) {
            InterfaceC65784Pro interfaceC65784Pro = (InterfaceC65784Pro) ((LinkedHashMap) this.LIZ.LIZ).get(this.LIZIZ);
            if (interfaceC65784Pro != null) {
                this.LIZJ = (V) interfaceC65784Pro.invoke();
            } else {
                String cls = this.LIZIZ.toString();
                o.LJIIIIZZ(cls, "clazz.toString()");
                throw new NAQ(cls, property.getName());
            }
        }
        return this.LIZJ;
    }

    public NAN(NAJ injectValueContainer, Class<? extends V> cls) {
        o.LJIIIZ(injectValueContainer, "injectValueContainer");
        this.LIZ = injectValueContainer;
        this.LIZIZ = cls;
        this.LIZLLL = new AtomicBoolean(false);
    }
}
