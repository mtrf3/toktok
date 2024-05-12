package X;

import kotlin.jvm.internal.o;

/* renamed from: X.MyK, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58544MyK implements InterfaceC58549MyP {
    public final InterfaceC58547MyN<OSH<M95, java.util.Map<String, Object>, String>> LIZ;

    public C58544MyK(C58545MyL c58545MyL) {
        this.LIZ = c58545MyL;
    }

    @Override // X.InterfaceC58549MyP
    public final java.util.Map LIZ(M95 m95, String eventName, java.util.Map map) {
        o.LJIIIZ(eventName, "eventName");
        this.LIZ.invoke(new OSH<>(m95, map, eventName));
        return map;
    }
}
