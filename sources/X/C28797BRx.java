package X;

import com.google.android.play.core.appupdate.u;
import kotlin.jvm.internal.o;

/* renamed from: X.BRx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28797BRx implements InterfaceC72822Si2 {
    public final /* synthetic */ BS4 LJLIL;

    public C28797BRx(BS4 bs4) {
        this.LJLIL = bs4;
    }

    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        BS4 bs4 = this.LJLIL;
        bs4.getClass();
        String str = c199097rd.LJLIL;
        Integer num = null;
        if (o.LJ(str, "liveGoldenEnvelopCloseAll")) {
            C0NB.LIZIZ("ActivityTreasurePresenter", "handleEvent: liveGoldenEnvelopCloseAll");
            InterfaceC78280Uns interfaceC78280Uns = c199097rd.LJLILLLLZI;
            if (interfaceC78280Uns != null) {
                num = Integer.valueOf(u.LJJIJIIJI(interfaceC78280Uns, "business_type", 0));
            }
            C65777Prh.LIZJ(bs4.LJFF).remove(num);
            return;
        }
        if (o.LJ(str, "EVENT_ENVELOPE_UPDATE")) {
            C0NB.LJ("ActivityTreasurePresenter", "handleEvent: EVENT_ENVELOPE_UPDATE");
            XKX.LIZLLL(C780334l.LJLIL, null, null, new C28765BQr(null), 3);
        } else {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("handleEvent: unknown event->");
            C1EW.LIZLLL(LIZ, c199097rd.LJLIL, LIZ, "ActivityTreasurePresenter");
        }
    }
}
