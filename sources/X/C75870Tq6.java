package X;

/* renamed from: X.Tq6, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75870Tq6 extends AbstractC75866Tq2 {
    public final String LJ = "ttlive_client_interact_feed_audience_monitor";

    @Override // X.AbstractC75866Tq2
    public final void LJIILIIL() {
        long j;
        InterfaceC29405BgP LIZIZ = B83.LIZ().LIZIZ();
        if (LIZIZ != null) {
            j = ((C29374Bfu) LIZIZ).getCurrentUserId();
        } else {
            j = 0;
        }
        AbstractC75866Tq2.LJIIIZ(this.LIZLLL, "current_user_id", Long.valueOf(j), true);
    }

    public final void LJIILL(InterfaceC75871Tq7 interfaceC75871Tq7) {
        long j;
        long j2;
        C75989Ts1 LJFF;
        long j3 = 0;
        if (interfaceC75871Tq7 != null) {
            j = interfaceC75871Tq7.LIZJ();
        } else {
            j = 0;
        }
        AbstractC75866Tq2.LJIIIZ(this.LIZLLL, "room_id", Long.valueOf(j), true);
        if (interfaceC75871Tq7 != null && (LJFF = interfaceC75871Tq7.LJFF()) != null) {
            j2 = LJFF.LIZLLL;
        } else {
            j2 = 0;
        }
        AbstractC75866Tq2.LJIIIZ(this.LIZLLL, "channel_id", Long.valueOf(j2), false);
        if (interfaceC75871Tq7 != null) {
            j3 = interfaceC75871Tq7.LIZIZ();
        }
        AbstractC75866Tq2.LJIIIZ(this.LIZLLL, "anchor_id", Long.valueOf(j3), true);
    }

    public final void LJIIZILJ(C76111Ttz c76111Ttz, long j, int i) {
        LJIIL();
        AbstractC75866Tq2.LJIIIZ(this.LIZLLL, "sei_channel_id", Long.valueOf(j), true);
        AbstractC75866Tq2.LJIIIZ(this.LIZLLL, "linker_arch_type", Integer.valueOf(i), true);
        LJIILL(c76111Ttz);
        LJIILJJIL("cohost_info_succeed");
    }

    public final void LJIILLIIL(C76111Ttz c76111Ttz, long j, int i, Throwable th) {
        LJIIL();
        AbstractC75866Tq2.LJIIIZ(this.LIZLLL, "sei_channel_id", Long.valueOf(j), true);
        AbstractC75866Tq2.LJIIIZ(this.LIZLLL, "linker_arch_type", Integer.valueOf(i), true);
        LJIIJ(th);
        LJIILL(c76111Ttz);
        LJIILJJIL("cohost_info_failed");
    }
}
