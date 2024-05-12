package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.feedback.MultiGuestFeedbackController;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final /* synthetic */ class TQY extends TBS implements InterfaceC88473Ynt<String, String, Integer, C76800UCe> {
    public TQY(TQV tqv) {
        super(3, tqv, TQV.class, "exitInteractInNormalWayAfterFeedback", "exitInteractInNormalWayAfterFeedback(Ljava/lang/String;Ljava/lang/String;I)V", 0);
    }

    @Override // X.InterfaceC88473Ynt
    public final C76800UCe invoke(String str, String p1, Integer num) {
        String p0 = str;
        int intValue = num.intValue();
        o.LJIIIZ(p0, "p0");
        o.LJIIIZ(p1, "p1");
        TQV tqv = (TQV) this.receiver;
        tqv.getClass();
        TQC.LJ.getClass();
        tqv.LJZL = TQB.LIZ(p0);
        MultiGuestFeedbackController.LJIIJ.getClass();
        TQ4 LIZ = TQS.LIZ();
        if (LIZ != null && LIZ.LIZIZ(new C74636TQy(p0))) {
            InterfaceC74617TQf interfaceC74617TQf = (InterfaceC74617TQf) tqv.mView;
            if (interfaceC74617TQf != null) {
                interfaceC74617TQf.forceDismissApplyDialog();
            }
        } else {
            tqv.exitInteractInNormalWay(String.valueOf(tqv.LJZL), false, intValue);
        }
        return C76800UCe.LIZ;
    }
}
