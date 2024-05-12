package X;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes12.dex */
public final class QRA {
    public static int LIZ;
    public static int LIZIZ;
    public static C36913EeD LIZJ;
    public static final Handler LIZLLL = new Handler(C16880lQ.LLJJJJ());

    public static void LIZ(Context context) {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("method_push_start_frontier_push");
        int i = LIZ;
        LIZ = i + 1;
        LIZ2.append(i);
        C77413UZt.LJI(X1D.LIZIZ(LIZ2));
        QR9 LIZIZ2 = QR9.LIZIZ(context);
        QP2 qp2 = QP2.LIZ;
        AtomicReference<QRB> atomicReference = LIZIZ2.LJLIL;
        while (!atomicReference.compareAndSet(null, qp2) && atomicReference.get() == null) {
        }
        QR9 LIZIZ3 = QR9.LIZIZ(context);
        String curSecUserId = ((RBX) HG3.LJIILL()).getCurSecUserId();
        LIZIZ3.getClass();
        if (!TextUtils.isEmpty(curSecUserId)) {
            LIZIZ3.LJLJJI = curSecUserId;
        }
        ((RBX) HG3.LJIILL()).addUserChangeListener(new C66989QQv(context));
        if (!((Boolean) C88117Yi9.LJFF.getValue()).booleanValue() && !C51934KZu.LIZ) {
            C67003QRj.LJFF().LJII(context);
        }
        C77413UZt.LJIIJ("method_push_start_frontier_push");
    }
}
