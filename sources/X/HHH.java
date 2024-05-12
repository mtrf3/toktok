package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HHH extends AbstractC65781Prl implements InterfaceC88472Yns<View, C76800UCe> {
    public static final HHH LJLIL = new HHH();

    public HHH() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(View view) {
        View secondaryButton = view;
        o.LJIIIZ(secondaryButton, "$this$secondaryButton");
        secondaryButton.setTag(C8QI.LJI, "negative");
        return C76800UCe.LIZ;
    }
}
