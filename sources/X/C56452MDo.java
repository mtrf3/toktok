package X;

import android.view.View;
import com.bytedance.tux.input.TuxTextView;

/* renamed from: X.MDo, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56452MDo extends AbstractC65781Prl implements InterfaceC88472Yns<View, C76800UCe> {
    public static final C56452MDo LJLIL = new C56452MDo();

    public C56452MDo() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(View view) {
        View view2 = view;
        if (view2 instanceof TuxTextView) {
            TuxTextView tuxTextView = (TuxTextView) view2;
            tuxTextView.setText(C56451MDn.LIZ(0, false));
            if (C34131DaR.LIZ()) {
                tuxTextView.LJJJ(20.0f);
            } else {
                tuxTextView.LJJJ(28.0f);
            }
        }
        return C76800UCe.LIZ;
    }
}
