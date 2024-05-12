package X;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: X.1dN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C37371dN extends FrameLayout implements InterfaceC25590zT {
    public final CollapsibleActionView LJLIL;

    @Override // X.InterfaceC25590zT
    public final void onActionViewCollapsed() {
        this.LJLIL.onActionViewCollapsed();
    }

    @Override // X.InterfaceC25590zT
    public final void onActionViewExpanded() {
        this.LJLIL.onActionViewExpanded();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C37371dN(View view) {
        super(view.getContext());
        this.LJLIL = (CollapsibleActionView) view;
        addView(view);
    }
}
