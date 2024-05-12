package X;

import com.bytedance.android.livesdk.comp.impl.game.linkmic.utils.feedback.GuestFeedbackSubmitResponse;
import com.zhiliaoapp.musically.R;

/* renamed from: X.TSp, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74679TSp<T> implements InterfaceC64592gB {
    public static final C74679TSp<T> LJLIL = new C74679TSp<>();

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
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onSuccess: ");
        LIZ.append(guestFeedbackSubmitResponse);
        C74678TSo.LIZ(X1D.LIZIZ(LIZ));
    }
}
