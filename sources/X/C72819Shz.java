package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Shz, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72819Shz implements InterfaceC40311Frv {
    public final /* synthetic */ InterfaceC72822Si2 LIZ;

    public C72819Shz(InterfaceC72822Si2 interfaceC72822Si2) {
        this.LIZ = interfaceC72822Si2;
    }

    @Override // X.InterfaceC40311Frv
    public final void LIZ(InterfaceC78280Uns interfaceC78280Uns, String eventName) {
        o.LJIIJ(eventName, "eventName");
        this.LIZ.onReceiveJsEvent(new C199097rd(interfaceC78280Uns, eventName));
    }
}
