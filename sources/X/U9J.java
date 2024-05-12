package X;

/* loaded from: classes14.dex */
public final class U9J extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ long LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ C76671U7f LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U9J(long j, long j2, C76671U7f c76671U7f) {
        super(0);
        this.LJLIL = j;
        this.LJLILLLLZI = j2;
        this.LJLJI = c76671U7f;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        Long l;
        BZI LIZ = C28787BRn.LIZ("livesdk_linkmic_rtc_room_message");
        LIZ.LJIJJ(Long.valueOf(this.LJLIL), "total_num");
        LIZ.LJIJJ(Long.valueOf(this.LJLILLLLZI), "received_num");
        U66 u66 = this.LJLJI.LIZIZ;
        if (u66 != null) {
            l = Long.valueOf(u66.LJJLI());
        } else {
            l = null;
        }
        LIZ.LJIJJ(l, "channel_id");
        LIZ.LJJIIJZLJL();
        return C76800UCe.LIZ;
    }
}
