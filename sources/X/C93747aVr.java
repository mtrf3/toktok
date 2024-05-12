package X;

import Y.IDCListenerS86S0200000_42;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.aVr, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93747aVr {
    public static void LIZ(long j, boolean z) {
        if (j > 0) {
            C93750aVu.LIZ.postDelayed(new RunnableC93746aVq(C93748aVs.LJ), j);
        }
        C93748aVs.LJ = z;
    }

    public static void LIZIZ(View onClickWithScope, C93748aVs scope, InterfaceC88472Yns interfaceC88472Yns) {
        o.LJIIIZ(onClickWithScope, "$this$onClickWithScope");
        o.LJIIIZ(scope, "scope");
        C16880lQ.LJIIJ(new IDCListenerS86S0200000_42(scope, interfaceC88472Yns, 1), onClickWithScope);
    }
}
