package X;

import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.965, reason: invalid class name */
/* loaded from: classes5.dex */
public final class AnonymousClass965 extends AbstractC65781Prl implements InterfaceC88472Yns<FVC, View> {
    public static final AnonymousClass965 LJLIL = new AnonymousClass965();

    public AnonymousClass965() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final View invoke(FVC fvc) {
        FVC params = fvc;
        o.LJIIIZ(params, "params");
        if (C208088Eq.LIZIZ()) {
            View LIZLLL = C16970lZ.LIZLLL(C45804HyK.LJIJJ(params.LIZIZ), R.layout.bh5);
            o.LJIIIIZZ(LIZLLL, "inflate(params.context.a…ed_v1_item_feed_optimize)");
            return LIZLLL;
        }
        if (C208088Eq.LIZJ()) {
            View LIZLLL2 = C16970lZ.LIZLLL(C45804HyK.LJIJJ(params.LIZIZ), R.layout.bhc);
            o.LJIIIIZZ(LIZLLL2, "inflate(params.context.a…ed_v2_item_feed_optimize)");
            return LIZLLL2;
        }
        if (C208088Eq.LIZLLL()) {
            View LIZLLL3 = C16970lZ.LIZLLL(C45804HyK.LJIJJ(params.LIZIZ), R.layout.bhk);
            o.LJIIIIZZ(LIZLLL3, "inflate(params.context.a…ed_v3_item_feed_optimize)");
            return LIZLLL3;
        }
        View LIZLLL4 = C16970lZ.LIZLLL(C45804HyK.LJIJJ(params.LIZIZ), R.layout.bhr);
        o.LJIIIIZZ(LIZLLL4, "inflate(params.context.a…yout.landscape_item_feed)");
        return LIZLLL4;
    }
}
