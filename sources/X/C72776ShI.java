package X;

import Y.IDObjectS0S0101000;
import android.view.View;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.ShI, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72776ShI<T> {
    public final InterfaceC65784Pro<T> LIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public C72776ShI(InterfaceC65784Pro<? extends T> interfaceC65784Pro) {
        this.LIZ = interfaceC65784Pro;
    }

    public final T LIZ(AbstractC72775ShH thisRef, InterfaceC74236TBo<?> property) {
        o.LJIIIZ(thisRef, "thisRef");
        o.LJIIIZ(property, "property");
        return (T) thisRef.LIZIZ(property.getName(), this.LIZ);
    }

    public final void LIZIZ(AbstractC72775ShH thisRef, InterfaceC74236TBo<?> property, T t) {
        InterfaceC88471Ynr interfaceC88471Ynr;
        o.LJIIIZ(thisRef, "thisRef");
        o.LJIIIZ(property, "property");
        String prop = property.getName();
        InterfaceC65784Pro<T> defaultValue = this.LIZ;
        o.LJIIIZ(prop, "prop");
        o.LJIIIZ(defaultValue, "defaultValue");
        Object LIZIZ = thisRef.LIZIZ(prop, defaultValue);
        thisRef.LJLILLLLZI.put(prop, t);
        Object LIZIZ2 = thisRef.LIZIZ(prop, defaultValue);
        if (!o.LJ(LIZIZ, LIZIZ2)) {
            Object obj = ((LinkedHashMap) thisRef.LJLJI).get(prop);
            if (C65777Prh.LJFF(2, obj) && (interfaceC88471Ynr = (InterfaceC88471Ynr) obj) != null) {
                interfaceC88471Ynr.invoke(LIZIZ, LIZIZ2);
            }
            Iterator<View> it = C78924UyG.LIZLLL(thisRef).iterator();
            while (true) {
                IDObjectS0S0101000 iDObjectS0S0101000 = (IDObjectS0S0101000) it;
                if (iDObjectS0S0101000.hasNext()) {
                    AbstractC72775ShH.LIZ((View) iDObjectS0S0101000.next(), prop, LIZIZ, LIZIZ2);
                } else {
                    return;
                }
            }
        }
    }
}
