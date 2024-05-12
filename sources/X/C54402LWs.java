package X;

import kotlin.jvm.internal.o;

/* renamed from: X.LWs, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54402LWs implements InterfaceC43927HLv {
    public final /* synthetic */ InterfaceC54403LWt LIZ;
    public final /* synthetic */ C54762LeQ LIZIZ;

    @Override // X.InterfaceC43927HLv
    public final void LIZJ(String scheduleId, C221958nP data) {
        o.LJIIIZ(scheduleId, "scheduleId");
        o.LJIIIZ(data, "data");
    }

    @Override // X.InterfaceC43927HLv
    public final void LIZLLL(int i) {
    }

    @Override // X.InterfaceC43927HLv
    public final void LJI(String scheduleId, C189737cX schedule) {
        o.LJIIIZ(scheduleId, "scheduleId");
        o.LJIIIZ(schedule, "schedule");
    }

    @Override // X.InterfaceC43927HLv
    public final void onStart() {
        this.LIZ.onStart();
    }

    @Override // X.InterfaceC43927HLv
    public final void LIZ(float f) {
        this.LIZ.LIZ(f);
    }

    @Override // X.InterfaceC43927HLv
    public final void LIZIZ(EnumC221928nM result) {
        o.LJIIIZ(result, "result");
        this.LIZ.LIZIZ(this.LIZIZ.LJIILJJIL());
    }

    @Override // X.InterfaceC43927HLv
    public final void LJFF(String scheduleId) {
        o.LJIIIZ(scheduleId, "scheduleId");
        this.LIZ.LJ(this.LIZIZ.LJIILJJIL());
    }

    public C54402LWs(InterfaceC54403LWt interfaceC54403LWt, C54762LeQ c54762LeQ) {
        this.LIZ = interfaceC54403LWt;
        this.LIZIZ = c54762LeQ;
    }

    @Override // X.InterfaceC43927HLv
    public final void LJ(String scheduleId, C221958nP data) {
        o.LJIIIZ(scheduleId, "scheduleId");
        o.LJIIIZ(data, "data");
    }
}
