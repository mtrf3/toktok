package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiLiveApi;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.feedback.MultiGuestFeedbackController;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TTE implements InterfaceC72822Si2 {
    public final /* synthetic */ MultiGuestFeedbackController LJLIL;

    public TTE(MultiGuestFeedbackController multiGuestFeedbackController) {
        this.LJLIL = multiGuestFeedbackController;
    }

    @Override // X.InterfaceC72822Si2
    public final void onReceiveJsEvent(C199097rd c199097rd) {
        InterfaceC78280Uns interfaceC78280Uns;
        java.util.Map<String, Object> LIZIZ;
        if (!o.LJ(c199097rd.LJLIL, "Multi_guest_feedback_submit") || (interfaceC78280Uns = c199097rd.LJLILLLLZI) == null || (LIZIZ = interfaceC78280Uns.LIZIZ()) == null) {
            return;
        }
        MultiGuestFeedbackController multiGuestFeedbackController = this.LJLIL;
        multiGuestFeedbackController.getClass();
        C65814PsI.LIZ().getClass();
        InterfaceC92693kP LJJJLIIL = C1EW.LIZ(((MultiLiveApi) C65814PsI.LIZJ(MultiLiveApi.class)).submitFeedback(C29306Beo.LJJLJ(LIZIZ))).LJJJLIIL(C74652TRo.LJLIL, C74651TRn.LJLIL);
        C73318Sq2 cb = (C73318Sq2) multiGuestFeedbackController.LJII.getValue();
        o.LJIIIZ(cb, "cb");
        cb.LIZ(LJJJLIIL);
    }
}
