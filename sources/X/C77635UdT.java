package X;

/* renamed from: X.UdT, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77635UdT implements InterfaceC78493UrJ {
    @Override // X.InterfaceC78493UrJ
    public final void LLIIIZ() {
    }

    @Override // X.InterfaceC78493UrJ
    public final void LJJIL() {
        if (C77659Udr.LIZ) {
            BZI LIZ = C28787BRn.LIZ("livesdk_recharge_user_destroy_panel_after_click");
            LIZ.LJIJJ(C77659Udr.LIZJ, "request_page");
            LIZ.LJIJJ(Integer.valueOf(C77659Udr.LIZIZ ? 1 : 0), "is_first_recharge");
            LIZ.LJIJJ(C77659Udr.LIZLLL, "pay_method");
            C28289B8j.LIZJ(C30725C4b.LIZ(), C77659Udr.LJFF, LIZ, "cancel_create_order_duration");
            C77659Udr.LIZ = false;
            C77659Udr.LIZJ = "";
            C77659Udr.LIZLLL = "";
            C77659Udr.LJ = "";
            C77659Udr.LJFF = 0L;
        }
    }
}
