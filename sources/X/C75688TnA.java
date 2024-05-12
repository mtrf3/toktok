package X;

import com.bytedance.android.live.liveinteract.multihost.biz.quickpairing.RandomLinkMicManager;

/* renamed from: X.TnA, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75688TnA extends AbstractC75865Tq1 {
    public final String LJ = "ttlive_client_anchor_cohost_monitor";

    @Override // X.AbstractC75865Tq1
    public final boolean LJIILL() {
        return true;
    }

    @Override // X.AbstractC75865Tq1
    public final void LJIILIIL() {
        long j;
        String str;
        InterfaceC29405BgP LIZIZ = B83.LIZ().LIZIZ();
        if (LIZIZ != null) {
            j = ((C29374Bfu) LIZIZ).getCurrentUserId();
        } else {
            j = 0;
        }
        C75883TqJ LJI = C8E.LIZLLL().LJI(j);
        if (LJI == null || (str = LJI.LJII) == null) {
            str = B5G.LIZIZ().LJJIJIIJI;
        }
        AbstractC75865Tq1.LJIIIZ(this.LIZLLL, "link_mic_id", str, true);
        AbstractC75865Tq1.LJIIIZ(this.LIZIZ, "quick_linkmic_state", Integer.valueOf(RandomLinkMicManager.LJLJLJ.getType()), true);
    }

    @Override // X.AbstractC75865Tq1
    public final String LJIILJJIL() {
        return this.LJ;
    }
}
