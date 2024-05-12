package X;

import kotlin.jvm.internal.o;

/* renamed from: X.GbN, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41833GbN implements InterfaceC43927HLv {
    @Override // X.InterfaceC43927HLv
    public final void LIZ(float f) {
    }

    @Override // X.InterfaceC43927HLv
    public final void LIZIZ(EnumC221928nM result) {
        o.LJIIIZ(result, "result");
    }

    @Override // X.InterfaceC43927HLv
    public final void LIZLLL(int i) {
    }

    @Override // X.InterfaceC43927HLv
    public final void LJ(String scheduleId, C221958nP data) {
        o.LJIIIZ(scheduleId, "scheduleId");
        o.LJIIIZ(data, "data");
    }

    @Override // X.InterfaceC43927HLv
    public final void LJFF(String scheduleId) {
        o.LJIIIZ(scheduleId, "scheduleId");
    }

    @Override // X.InterfaceC43927HLv
    public final void onStart() {
    }

    @Override // X.InterfaceC43927HLv
    public final void LIZJ(String scheduleId, C221958nP data) {
        C41826GbG LIZJ;
        o.LJIIIZ(scheduleId, "scheduleId");
        o.LJIIIZ(data, "data");
        if (L1F.LIZIZ() && (LIZJ = C41825GbF.LIZJ(scheduleId)) != null && !LIZJ.LIZLLL) {
            XKX.LIZLLL((InterfaceC70422pa) C41825GbF.LJ.getValue(), null, null, new C41832GbM(LIZJ, scheduleId, null), 3);
            LIZJ.LIZLLL = true;
        }
    }

    @Override // X.InterfaceC43927HLv
    public final void LJI(String scheduleId, C189737cX schedule) {
        o.LJIIIZ(scheduleId, "scheduleId");
        o.LJIIIZ(schedule, "schedule");
        C41825GbF.LIZ(scheduleId);
    }
}
