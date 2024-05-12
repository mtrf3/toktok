package X;

import com.bytedance.android.livesdk.comp.impl.game.linkmic.api.GameLinkApi;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TTF implements InterfaceC72822Si2 {
    public final /* synthetic */ TSY LJLIL;

    public TTF(TSY tsy) {
        this.LJLIL = tsy;
    }

    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        InterfaceC78280Uns interfaceC78280Uns;
        java.util.Map<String, Object> LIZIZ;
        if (!o.LJ(c199097rd.LJLIL, "Multi_guest_feedback_submit") || (interfaceC78280Uns = c199097rd.LJLILLLLZI) == null || (LIZIZ = interfaceC78280Uns.LIZIZ()) == null) {
            return;
        }
        TSY tsy = this.LJLIL;
        tsy.getClass();
        C65814PsI.LIZ().getClass();
        InterfaceC92693kP LJJJLIIL = C1EW.LIZ(((GameLinkApi) C65814PsI.LIZJ(GameLinkApi.class)).submitFeedback(C29306Beo.LJJLJ(LIZIZ))).LJJJLIIL(C74679TSp.LJLIL, C74664TSa.LJLIL);
        C73318Sq2 cb = (C73318Sq2) tsy.LJII.getValue();
        o.LJIIIZ(cb, "cb");
        cb.LIZ(LJJJLIIL);
    }
}
