package X;

import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.3SA, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3SA extends AbstractC65781Prl implements InterfaceC88472Yns<FVC, View> {
    public static final C3SA LJLIL = new C3SA();

    public C3SA() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final View invoke(FVC fvc) {
        FVC params = fvc;
        o.LJIIIZ(params, "params");
        View LIZLLL = C16970lZ.LIZLLL(C45804HyK.LJIJJ(params.LIZIZ), R.layout.avs);
        o.LJIIIIZZ(LIZLLL, "inflate(params.context.a…ow_feed_item_feed_follow)");
        return LIZLLL;
    }
}
