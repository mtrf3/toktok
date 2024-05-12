package X;

import kotlin.jvm.internal.o;

/* renamed from: X.MyQ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58550MyQ implements InterfaceC58549MyP {
    public final /* synthetic */ InterfaceC58549MyP LIZ;
    public final /* synthetic */ InterfaceC58549MyP LIZIZ;

    public C58550MyQ(InterfaceC58549MyP interfaceC58549MyP, InterfaceC58549MyP interfaceC58549MyP2) {
        this.LIZ = interfaceC58549MyP;
        this.LIZIZ = interfaceC58549MyP2;
    }

    @Override // X.InterfaceC58549MyP
    public final java.util.Map LIZ(M95 m95, String eventName, java.util.Map map) {
        o.LJIIIZ(eventName, "eventName");
        if (this.LIZ.LIZ(m95, eventName, map) == null) {
            return null;
        }
        return this.LIZIZ.LIZ(m95, eventName, map);
    }
}
