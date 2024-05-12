package X;

import java.lang.Enum;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.WvJ, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83837WvJ<KEY extends Enum<KEY>> implements InterfaceC83836WvI<KEY> {
    public final java.util.Map<InterfaceC83821Wv3<KEY>, C83935Wwt> LIZ;
    public final java.util.Map<InterfaceC83821Wv3<KEY>, java.util.Map<Class<InterfaceC83847WvT>, InterfaceC83847WvT>> LIZIZ;
    public final java.util.Map<InterfaceC83821Wv3<KEY>, C83841WvN> LIZJ;

    public C83837WvJ(java.util.Map<InterfaceC83821Wv3<KEY>, C83841WvN> contextCreators) {
        o.LJIIIZ(contextCreators, "contextCreators");
        this.LIZJ = contextCreators;
        this.LIZ = new LinkedHashMap();
        this.LIZIZ = new LinkedHashMap();
    }

    @Override // X.InterfaceC83836WvI
    public final C83935Wwt LIZIZ(InterfaceC83821Wv3<KEY> key) {
        o.LJIIIZ(key, "key");
        return LIZJ(key);
    }

    public final C83935Wwt LIZJ(InterfaceC83821Wv3<KEY> key) {
        o.LJIIIZ(key, "key");
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LIZ;
        Object obj = linkedHashMap.get(key);
        if (obj == null) {
            obj = (C83935Wwt) LIZLLL(key).LIZ.invoke();
            linkedHashMap.put(key, obj);
        }
        return (C83935Wwt) obj;
    }

    public final C83841WvN LIZLLL(InterfaceC83821Wv3<KEY> interfaceC83821Wv3) {
        C83841WvN c83841WvN = this.LIZJ.get(interfaceC83821Wv3);
        if (c83841WvN != null) {
            return c83841WvN;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("context of session [");
        LIZ.append(interfaceC83821Wv3);
        LIZ.append("] not found");
        String LIZIZ = X1D.LIZIZ(LIZ);
        LIZIZ.toString();
        throw new IllegalArgumentException(LIZIZ);
    }

    @Override // X.InterfaceC83836WvI
    public final C83935Wwt LIZ(InterfaceC83821Wv3<KEY> interfaceC83821Wv3, InterfaceC83821Wv3<KEY> to) {
        o.LJIIIZ(to, "to");
        C83935Wwt origin = LIZJ(to);
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LIZIZ;
        Object obj = linkedHashMap.get(to);
        if (obj == null) {
            obj = LIZLLL(to).LIZIZ.LIZ();
            linkedHashMap.put(to, obj);
        }
        List strategies = ORZ.LLJI(((java.util.Map) obj).values());
        o.LJIIIZ(strategies, "strategies");
        o.LJIIIZ(origin, "origin");
        if (interfaceC83821Wv3 != null) {
            C83935Wwt LIZIZ = LIZLLL(interfaceC83821Wv3).LIZIZ.LIZIZ(to, origin, LIZJ(interfaceC83821Wv3));
            if (LIZIZ != null) {
                origin = LIZIZ;
            }
        }
        this.LIZ.put(to, origin);
        return origin;
    }
}
