package X;

import android.view.View;
import android.widget.FrameLayout;

/* renamed from: X.VPq, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C79698VPq extends FrameLayout {
    public final /* synthetic */ ViewOnAttachStateChangeListenerC79828VUq LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C79698VPq(ViewOnAttachStateChangeListenerC79828VUq viewOnAttachStateChangeListenerC79828VUq, VNU vnu) {
        super(vnu);
        this.LJLIL = viewOnAttachStateChangeListenerC79828VUq;
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        if (view instanceof C79662VOg) {
            view.measure(view.getMeasuredWidth(), view.getMeasuredHeight());
        } else {
            super.measureChildWithMargins(view, i, i2, i3, i4);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        try {
            super.onLayout(z, i, i2, i3, i4);
        } catch (NullPointerException e) {
            C16880lQ.LLLLIIL(e);
        }
        this.LJLIL.LJIJJ();
    }
}
