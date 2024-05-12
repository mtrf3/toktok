package X;

import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.livesdk.chatroom.ui.GameBroadcastFragment;
import com.bytedance.android.livesdk.model.Creator;
import kotlin.jvm.internal.AqS30S0001000_5;

/* renamed from: X.Bt9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30195Bt9 implements InterfaceC10990bv {
    public final /* synthetic */ GameBroadcastFragment LJLIL;

    public C30195Bt9(GameBroadcastFragment gameBroadcastFragment) {
        this.LJLIL = gameBroadcastFragment;
    }

    @Override // X.InterfaceC10990bv
    public final void p8(int i) {
        int i2;
        Integer num;
        if (i != 30001 && i != 30003 && i != 50002 && i != 30003001) {
            return;
        }
        IBroadcastService iBroadcastService = (IBroadcastService) CN1.LIZ(IBroadcastService.class);
        long Al = this.LJLIL.Al();
        long roomId = this.LJLIL.getRoomId();
        GameBroadcastFragment gameBroadcastFragment = this.LJLIL;
        boolean z = gameBroadcastFragment.LJLLILLLL;
        Creator creator = gameBroadcastFragment.xl().creator;
        if (creator != null && (num = creator.roomContinue) != null) {
            i2 = num.intValue();
        } else {
            i2 = 0;
        }
        iBroadcastService.reportStreamEndForApi(i, Al, roomId, z, i2);
        C29689Bkz.LIZ.LJIIL(new AqS30S0001000_5(i, 0));
        this.LJLIL.fm(1, C78857UxB.LJJIIJ(1476788483, "bpea-413"), i);
    }
}
