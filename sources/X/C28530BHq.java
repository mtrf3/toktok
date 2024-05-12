package X;

import com.bytedance.android.live.slot.model.ECBcToggleChannel;
import com.bytedance.android.live.slot.util.BcToggleToggleService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.google.android.play.core.appupdate.u;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.o;

/* renamed from: X.BHq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28530BHq implements InterfaceC72822Si2 {
    public LiveMode LJLIL;
    public InterfaceC65784Pro<C76800UCe> LJLILLLLZI;
    public InterfaceC65784Pro<C76800UCe> LJLJI;
    public boolean LJLJJI = true;
    public final C62822Ol8 LJLJJL = C221108m2.LIZIZ(new AqS155S0100000_5(this, 70));

    public final C28527BHn LIZIZ() {
        return (C28527BHn) this.LJLJJL.getValue();
    }

    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        String str;
        int i;
        if (o.LJ("liveBrandToggle", c199097rd.LJLIL)) {
            InterfaceC78280Uns interfaceC78280Uns = c199097rd.LJLILLLLZI;
            if (interfaceC78280Uns != null) {
                str = u.LJJIJIL(interfaceC78280Uns, "toggle_status", "");
            } else {
                str = null;
            }
            boolean LJ = o.LJ(str, "open");
            if (LJ) {
                i = 2;
            } else {
                i = 0;
            }
            C28530BHq c28530BHq = BcToggleToggleService.LJLILLLLZI;
            C28531BHr c28531BHr = c28530BHq.LIZIZ().LIZ;
            c28531BHr.getClass();
            C28531BHr c28531BHr2 = new C28531BHr(c28531BHr.LIZ, c28531BHr.LIZIZ, c28531BHr.LIZLLL, c28531BHr.LJFF, c28531BHr.LIZJ, c28531BHr.LJ);
            LiveMode liveMode = LiveMode.THIRD_PARTY;
            if (ORZ.LJLJJI(this.LJLIL, C47261Igj.LJJIJIIJI(LiveMode.SCREEN_RECORD, liveMode)) && c28531BHr2.LIZJ != 3) {
                LIZIZ().LIZ.LIZLLL = LJ;
                LIZ(i, 2, null);
            }
            LiveMode liveMode2 = this.LJLIL;
            LiveMode liveMode3 = LiveMode.VIDEO;
            if (liveMode2 == liveMode3 && c28531BHr2.LJ != 3) {
                LIZIZ().LIZ.LJFF = LJ;
                LIZ(i, 2, null);
            }
            if (ORZ.LJLJJI(this.LJLIL, C47261Igj.LJJIJIIJI(liveMode3, liveMode)) && c28531BHr2.LIZ != 3) {
                LIZIZ().LIZ.LIZIZ = LJ;
                LIZ(i, 1, null);
            }
            if (!o.LJ(c28531BHr2, c28530BHq.LIZIZ().LIZ)) {
                DataChannelGlobal.LJLJJI.tv0(ECBcToggleChannel.class, c28530BHq.LIZIZ());
            }
        }
    }

    public final void LIZ(int i, int i2, LiveMode liveMode) {
        if (liveMode == null) {
            liveMode = this.LJLIL;
        }
        StringBuilder LIZJ = C06460Ne.LIZJ("BcToggleBusinessID = ", i2, ", BcToggleStatus = ", i, ", currentLiveMode=");
        LIZJ.append(this.LJLIL);
        C0NB.LIZIZ("BcToggleToggleService", X1D.LIZIZ(LIZJ));
        C28531BHr c28531BHr = LIZIZ().LIZ;
        if (i2 != 1) {
            if (i2 != 2) {
                return;
            }
            if (liveMode == LiveMode.VIDEO) {
                c28531BHr.LJ = i;
                return;
            } else {
                c28531BHr.LIZJ = i;
                return;
            }
        }
        c28531BHr.LIZ = i;
    }
}
