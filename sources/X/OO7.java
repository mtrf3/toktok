package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import defpackage.a1;

/* loaded from: classes11.dex */
public final class OO7 extends FrameLayout {
    public OOA LJLIL;

    public final OOA getScrollIntercept() {
        return this.LJLIL;
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        OOA ooa = this.LJLIL;
        if (ooa == null || !ooa.LJ(i)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        OOA ooa = this.LJLIL;
        if (ooa == null || !ooa.LIZ(i)) {
            return false;
        }
        return true;
    }

    public final void setScrollIntercept(OOA ooa) {
        this.LJLIL = ooa;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OO7(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
    }
}
