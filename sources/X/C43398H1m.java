package X;

import kotlin.jvm.internal.o;

/* renamed from: X.H1m, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43398H1m implements InterfaceC36938Eec {
    public final /* synthetic */ InterfaceC88472Yns LIZ;

    public C43398H1m(InterfaceC88472Yns interfaceC88472Yns) {
        this.LIZ = interfaceC88472Yns;
    }

    @Override // X.InterfaceC36938Eec
    public void onEvent(AbstractC41872Gc0 event) {
        o.LJIIIZ(event, "event");
        this.LIZ.invoke(event);
    }
}
