package X;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NAP<T, V> {
    public final NAJ LIZ;
    public final String LIZIZ;
    public InterfaceC65784Pro<? extends Object> LIZJ;

    public final Object LIZ(InterfaceC74236TBo property) {
        o.LJIIIZ(property, "property");
        if (this.LIZJ == null) {
            InterfaceC65784Pro<? extends Object> interfaceC65784Pro = (InterfaceC65784Pro) ((LinkedHashMap) this.LIZ.LIZIZ).get(this.LIZIZ);
            if (interfaceC65784Pro != null) {
                this.LIZJ = interfaceC65784Pro;
            } else {
                throw new NAQ(this.LIZIZ, property.getName());
            }
        }
        InterfaceC65784Pro<? extends Object> interfaceC65784Pro2 = this.LIZJ;
        if (interfaceC65784Pro2 != null) {
            return interfaceC65784Pro2.invoke();
        }
        o.LJIJI("getter");
        throw null;
    }

    public NAP(NAJ injectValueContainer, String str) {
        o.LJIIIZ(injectValueContainer, "injectValueContainer");
        this.LIZ = injectValueContainer;
        this.LIZIZ = str;
    }
}
