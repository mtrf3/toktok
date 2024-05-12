package X;

import X.C8W0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.8V1, reason: invalid class name */
/* loaded from: classes4.dex */
public abstract class C8V1<T extends C8W0> {
    public InterfaceC65350Pko<? extends T> LIZ;
    public String LIZIZ;
    public C8VK LIZJ = C8VK.IMMEDIATE;
    public transient List<C62582cw> LIZLLL = new ArrayList();
    public java.util.Map<String, Object> LJ = new LinkedHashMap();

    public final void LIZ() {
    }

    public final InterfaceC65350Pko<? extends T> LIZJ() {
        InterfaceC65350Pko<? extends T> interfaceC65350Pko = this.LIZ;
        if (interfaceC65350Pko != null) {
            return interfaceC65350Pko;
        }
        o.LJIJI("type");
        throw null;
    }

    public T build() {
        Object newInstance = C39557Ffl.LIZ(LIZJ()).newInstance();
        o.LJIIIIZZ(newInstance, "type.java.newInstance()");
        T t = (T) newInstance;
        LIZIZ(t);
        return t;
    }

    public T LIZIZ(T t) {
        boolean z;
        t.setConfig(this);
        if (this.LIZJ == C8VK.IMMEDIATE) {
            z = true;
        } else {
            z = false;
        }
        t.active = z;
        t.assemTagInternal = this.LIZIZ;
        return t;
    }

    public final void LIZLLL(InterfaceC65350Pko<? extends T> interfaceC65350Pko) {
        o.LJIIIZ(interfaceC65350Pko, "<set-?>");
        this.LIZ = interfaceC65350Pko;
    }

    public final void LJ(Object prop, String str) {
        o.LJIIIZ(prop, "prop");
        this.LJ.put(str, prop);
    }
}
