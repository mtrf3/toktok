package X;

import Y.AfS36S0101000_5;
import com.bytedance.android.live.broadcast.api.IBroadcastService;

/* renamed from: X.BFw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28484BFw implements InterfaceC30837C8j {
    public final /* synthetic */ InterfaceC88472Yns<Integer, C76800UCe> LIZ;
    public final /* synthetic */ int LIZIZ;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LIZJ;

    @Override // X.InterfaceC30837C8j
    public final void onSuccess() {
        ((IBroadcastService) CN1.LIZ(IBroadcastService.class)).loadShortVideoRes().LJJJLIIL(new AfS36S0101000_5(this.LIZIZ, this.LIZ, 0), B6P.LJLIL);
    }

    public C28484BFw(int i, InterfaceC65784Pro interfaceC65784Pro, InterfaceC88472Yns interfaceC88472Yns) {
        this.LIZ = interfaceC88472Yns;
        this.LIZIZ = i;
        this.LIZJ = interfaceC65784Pro;
    }
}
