package X;

import android.view.View;
import android.widget.PopupWindow;

/* loaded from: classes16.dex */
public final class Y4B implements PopupWindow.OnDismissListener {
    public final /* synthetic */ Y4A LJLIL;
    public final /* synthetic */ View LJLILLLLZI;

    public Y4B(Y4A y4a, View view) {
        this.LJLIL = y4a;
        this.LJLILLLLZI = view;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        Y4F y4f;
        View view = this.LJLIL.LIZIZ;
        if ((view instanceof Y4F) && (y4f = (Y4F) view) != null) {
            y4f.setSupportIconState(Y4H.INITIAL);
        }
        View view2 = this.LJLILLLLZI;
        if (view2 == null) {
            return;
        }
        view2.setVisibility(8);
    }
}
