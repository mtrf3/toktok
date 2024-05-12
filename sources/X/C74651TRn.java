package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.feedback.MultiGuestFeedbackController;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.TRn, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74651TRn<T> implements InterfaceC64592gB {
    public static final C74651TRn<T> LJLIL = new C74651TRn<>();

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        TQS tqs = MultiGuestFeedbackController.LJIIJ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onError: ");
        LIZ.append(obj);
        String msg = X1D.LIZIZ(LIZ);
        tqs.getClass();
        o.LJIIIZ(msg, "msg");
        TYQ.LIZ("MultiGuestFeedbackController", msg);
        C30868C9o.LIZJ(R.string.neq);
    }
}
