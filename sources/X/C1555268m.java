package X;

import Y.IDLListenerS56S0200000_2;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.HorizontalScrollView;

/* renamed from: X.68m, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1555268m extends HorizontalScrollView {
    public static final /* synthetic */ int LJLIL = 0;

    public final void LIZ(View view) {
        if (getWidth() == 0) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(new IDLListenerS56S0200000_2(this, view, 0));
        } else {
            smoothScrollTo(((view.getRight() + view.getLeft()) / 2) - (getWidth() / 2), 0);
        }
    }

    public C1555268m(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOverScrollMode(2);
    }
}
