package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Ac4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26588Ac4 extends AbstractC03160Am<Object> {
    @Override // X.AbstractC03160Am
    public final boolean LIZ(Object obj, Object obj2) {
        return o.LJ(obj, obj2);
    }

    @Override // X.AbstractC03160Am
    public final boolean LIZIZ(Object obj, Object obj2) {
        if ((obj instanceof C27021Aj3) && (obj2 instanceof C27021Aj3)) {
            return o.LJ(((C27021Aj3) obj).LIZ.key, ((C27021Aj3) obj2).LIZ.key);
        }
        return o.LJ(obj, obj2);
    }
}
