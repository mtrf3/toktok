package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.feedback.GuestFeedbackSubmitResponse;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.feedback.MultiGuestFeedbackController;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.TRo, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74652TRo<T> implements InterfaceC64592gB {
    public static final C74652TRo<T> LJLIL = new C74652TRo<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        GuestFeedbackSubmitResponse guestFeedbackSubmitResponse = (GuestFeedbackSubmitResponse) obj;
        int i = guestFeedbackSubmitResponse.errorCode;
        if (i != 0) {
            if (i != 9) {
                C30868C9o.LIZJ(R.string.neq);
            } else {
                C30868C9o.LIZJ(R.string.nfb);
            }
        } else {
            C30868C9o.LIZJ(R.string.nfc);
        }
        TQS tqs = MultiGuestFeedbackController.LJIIJ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onSuccess: ");
        LIZ.append(guestFeedbackSubmitResponse);
        String msg = X1D.LIZIZ(LIZ);
        tqs.getClass();
        o.LJIIIZ(msg, "msg");
        TYQ.LIZ("MultiGuestFeedbackController", msg);
    }
}
