package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Fo4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40072Fo4 implements InterfaceC66028Pvk {
    @Override // X.InterfaceC66028Pvk
    public void onEventCreated(VMM event) {
        o.LJIIJ(event, "event");
        C65354Pks.LJFF.getClass();
        C65354Pks.LIZLLL(event);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(event.LIZ());
        LIZ.append(" - ");
        LIZ.append(event.LJIIJ);
        LIZ.append(' ');
        LIZ.append("onEventCreate");
        X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC66028Pvk
    public void onEventSampled(VMM event) {
        o.LJIIJ(event, "event");
        C65354Pks.LJFF.getClass();
        C65354Pks.LIZLLL(event);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(event.LIZ());
        LIZ.append(" - ");
        LIZ.append(event.LJIIJ);
        LIZ.append(' ');
        LIZ.append("onEventSampled");
        X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC66028Pvk
    public void onEventTerminated(VMM event) {
        o.LJIIJ(event, "event");
        C65354Pks.LJFF.getClass();
        C65354Pks.LIZLLL(event);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(event.LIZ());
        LIZ.append(" - ");
        Q89.LIZIZ(LIZ, event.LJIIJ, ' ', "onEventTerminated eventPhase: + ");
        LIZ.append(event.LIZJ.LIZ);
        X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC66028Pvk
    public void onEventUpdated(VMM event) {
        o.LJIIJ(event, "event");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(event.LIZ());
        LIZ.append(" - ");
        LIZ.append(event.LJIIJ);
        LIZ.append(' ');
        LIZ.append("onEventUpdated");
        X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC66028Pvk
    public void onEventUploaded(VMM event) {
        o.LJIIJ(event, "event");
        C65354Pks.LJFF.getClass();
        C65354Pks.LIZLLL(event);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(event.LIZ());
        LIZ.append(" - ");
        LIZ.append(event.LJIIJ);
        LIZ.append(' ');
        LIZ.append("onEventUploaded");
        X1D.LIZIZ(LIZ);
    }
}
