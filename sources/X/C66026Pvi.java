package X;

import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.Pvi, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66026Pvi implements InterfaceC66028Pvk {
    @Override // X.InterfaceC66028Pvk
    public void onEventCreated(VMM event) {
        o.LJIIJ(event, "event");
        event.LIZJ.LIZ = EnumC65356Pku.EVENT_CREATE;
        Iterator<InterfaceC66028Pvk> it = C40064Fnw.LIZ.iterator();
        while (it.hasNext()) {
            try {
                it.next().onEventCreated(event);
            } catch (Throwable th) {
                C77117UOj.LJIIZILJ(th);
            }
        }
        Iterator<InterfaceC66027Pvj> it2 = C40064Fnw.LIZIZ.iterator();
        while (it2.hasNext()) {
            InterfaceC66027Pvj next = it2.next();
            try {
                String str = event.LJIIJ;
                C65357Pkv c65357Pkv = event.LIZJ;
                String uuid = event.LIZ().toString();
                o.LJFF(uuid, "event.eventId.toString()");
                next.onEventCreated(new C66025Pvh(str, c65357Pkv, uuid, VMV.LJ(event)));
            } catch (Throwable unused) {
            }
        }
    }

    @Override // X.InterfaceC66028Pvk
    public void onEventSampled(VMM event) {
        o.LJIIJ(event, "event");
        event.LIZJ.LIZ = EnumC65356Pku.SAMPLE_THROW;
        Iterator<InterfaceC66028Pvk> it = C40064Fnw.LIZ.iterator();
        while (it.hasNext()) {
            try {
                it.next().onEventSampled(event);
            } catch (Throwable th) {
                C77117UOj.LJIIZILJ(th);
            }
        }
        Iterator<InterfaceC66027Pvj> it2 = C40064Fnw.LIZIZ.iterator();
        while (it2.hasNext()) {
            InterfaceC66027Pvj next = it2.next();
            try {
                String str = event.LJIIJ;
                C65357Pkv c65357Pkv = event.LIZJ;
                String uuid = event.LIZ().toString();
                o.LJFF(uuid, "event.eventId.toString()");
                next.onEventSampled(new C66025Pvh(str, c65357Pkv, uuid, VMV.LJ(event)));
            } catch (Throwable unused) {
            }
        }
    }

    @Override // X.InterfaceC66028Pvk
    public void onEventTerminated(VMM event) {
        o.LJIIJ(event, "event");
        event.LIZJ.LIZ = EnumC65356Pku.EVENT_TERMINATED;
        Iterator<InterfaceC66028Pvk> it = C40064Fnw.LIZ.iterator();
        while (it.hasNext()) {
            try {
                it.next().onEventTerminated(event);
            } catch (Throwable th) {
                C77117UOj.LJIIZILJ(th);
            }
        }
        Iterator<InterfaceC66027Pvj> it2 = C40064Fnw.LIZIZ.iterator();
        while (it2.hasNext()) {
            InterfaceC66027Pvj next = it2.next();
            try {
                String str = event.LJIIJ;
                C65357Pkv c65357Pkv = event.LIZJ;
                String uuid = event.LIZ().toString();
                o.LJFF(uuid, "event.eventId.toString()");
                next.onEventTerminated(new C66025Pvh(str, c65357Pkv, uuid, VMV.LJ(event)));
            } catch (Throwable unused) {
            }
        }
    }

    @Override // X.InterfaceC66028Pvk
    public void onEventUpdated(VMM event) {
        o.LJIIJ(event, "event");
        event.LIZJ.LIZ = EnumC65356Pku.EVENT_UPDATED;
        Iterator<InterfaceC66028Pvk> it = C40064Fnw.LIZ.iterator();
        while (it.hasNext()) {
            try {
                it.next().onEventUpdated(event);
            } catch (Throwable th) {
                C77117UOj.LJIIZILJ(th);
            }
        }
        Iterator<InterfaceC66027Pvj> it2 = C40064Fnw.LIZIZ.iterator();
        while (it2.hasNext()) {
            InterfaceC66027Pvj next = it2.next();
            try {
                String str = event.LJIIJ;
                C65357Pkv c65357Pkv = event.LIZJ;
                String uuid = event.LIZ().toString();
                o.LJFF(uuid, "event.eventId.toString()");
                next.onEventUpdated(new C66025Pvh(str, c65357Pkv, uuid, VMV.LJ(event)));
            } catch (Throwable unused) {
            }
        }
    }

    @Override // X.InterfaceC66028Pvk
    public void onEventUploaded(VMM event) {
        o.LJIIJ(event, "event");
        event.LIZJ.LIZ = EnumC65356Pku.EVENT_UPLOAD;
        Iterator<InterfaceC66028Pvk> it = C40064Fnw.LIZ.iterator();
        while (it.hasNext()) {
            try {
                it.next().onEventUploaded(event);
            } catch (Throwable th) {
                C77117UOj.LJIIZILJ(th);
            }
        }
        Iterator<InterfaceC66027Pvj> it2 = C40064Fnw.LIZIZ.iterator();
        while (it2.hasNext()) {
            InterfaceC66027Pvj next = it2.next();
            try {
                String str = event.LJIIJ;
                C65357Pkv c65357Pkv = event.LIZJ;
                String uuid = event.LIZ().toString();
                o.LJFF(uuid, "event.eventId.toString()");
                next.onEventUploaded(new C66025Pvh(str, c65357Pkv, uuid, VMV.LJ(event)));
            } catch (Throwable unused) {
            }
        }
    }
}
