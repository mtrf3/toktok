package X;

import Y.ARunnableS29S0200000_10;
import java.util.HashMap;

/* renamed from: X.Ng8, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59964Ng8 implements InterfaceC41034G8o {
    public final InterfaceC59966NgA LJLIL;

    @Override // X.InterfaceC41000G7g
    public final void initialize() {
    }

    public final void LIZ() {
        if (!C59411NTj.LIZIZ.LJ()) {
            return;
        }
        HashMap hashMap = new HashMap();
        InterfaceC59966NgA interfaceC59966NgA = this.LJLIL;
        hashMap.put("ad_id", String.valueOf(interfaceC59966NgA.LIZLLL()));
        hashMap.put("creative_id", String.valueOf(interfaceC59966NgA.LJIJI()));
        String logExtra = this.LJLIL.getLogExtra();
        if (logExtra != null) {
            hashMap.put("log_extra", logExtra);
        }
        String roomId = this.LJLIL.getRoomId();
        if (roomId != null) {
            hashMap.put("room_id", roomId);
        }
        QJY.LJI(hashMap, true);
        C38995FSd.LIZIZ().execute(new ARunnableS29S0200000_10(this, hashMap, 74));
    }

    @Override // X.InterfaceC41034G8o
    public final /* bridge */ /* synthetic */ Object L9() {
        return this.LJLIL;
    }

    public C59964Ng8(InterfaceC59967NgB interfaceC59967NgB) {
        this.LJLIL = interfaceC59967NgB;
    }
}
