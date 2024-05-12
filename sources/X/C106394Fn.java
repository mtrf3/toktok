package X;

/* renamed from: X.4Fn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C106394Fn implements InterfaceC106434Fr {
    @Override // X.InterfaceC106434Fr
    public final long now() {
        return System.currentTimeMillis();
    }

    @Override // X.InterfaceC106434Fr
    public final void LIZ(boolean z) {
        C85323Wm LIZ = C772831o.LIZ();
        C1HQ LIZ2 = C77800Ug8.LIZ(LIZ, "onEventV3");
        LIZ2.put("success", String.valueOf(z));
        LIZ.LIZIZ("gif_analytics", LIZ2);
    }

    @Override // X.InterfaceC106434Fr
    public final void LIZIZ(long j) {
        C85323Wm LIZ = C772831o.LIZ();
        C1HQ LIZ2 = C77800Ug8.LIZ(LIZ, "onEventV3");
        LIZ2.put("enter_from", "chat");
        LIZ2.put("process_id", C3Y4.LIZJ);
        LIZ2.put("duration", String.valueOf(j));
        LIZ.LIZIZ("gif_stay_time", LIZ2);
    }
}
