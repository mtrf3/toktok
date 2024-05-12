package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class WQC extends AbstractC65781Prl implements InterfaceC88472Yns<View, WQB> {
    public static final WQC LJLIL = new WQC();

    public WQC() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final WQB invoke(View view) {
        View outsideView = view;
        o.LJIIIZ(outsideView, "outsideView");
        return new WQB(outsideView);
    }
}
