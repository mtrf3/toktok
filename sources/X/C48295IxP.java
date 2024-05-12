package X;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* renamed from: X.IxP, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C48295IxP extends FrameLayout implements InterfaceC48298IxS {
    public C48294IxO mViewOptHelper;

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        int i;
        C48294IxO c48294IxO = this.mViewOptHelper;
        if (c48294IxO != null) {
            if (!c48294IxO.LIZJ) {
                c48294IxO.LIZLLL.requestLayoutDelegate();
                return;
            }
            if (!c48294IxO.LIZIZ) {
                c48294IxO.LIZLLL.requestLayoutDelegate();
                return;
            }
            if (C16880lQ.LLJJJJ().getThread() == C16880lQ.LLLLIIIILLL()) {
                try {
                    Object obj = C48294IxO.LJII.get(c48294IxO.LIZLLL);
                    if (obj != null) {
                        i = C48294IxO.LJIIJ.getInt(obj);
                        if (i != 0) {
                            C48294IxO.LJIIJ.setInt(obj, C48294IxO.LJIILIIL | i);
                        }
                    } else {
                        i = 0;
                    }
                    c48294IxO.LIZLLL.requestLayoutDelegate();
                    if (obj == null || i == 0) {
                        return;
                    }
                    C48294IxO.LJIIJ.setInt(obj, i);
                    if (c48294IxO.LIZ) {
                        return;
                    }
                    c48294IxO.LJ.postOnAnimation(c48294IxO.LJFF);
                    c48294IxO.LIZ = true;
                    return;
                } catch (IllegalAccessException e) {
                    C16880lQ.LLLLIIL(e);
                    c48294IxO.LIZLLL.requestLayoutDelegate();
                    return;
                }
            }
            throw new C48297IxR("Only the original thread that created a view hierarchy can touch its views.");
        }
        super.requestLayout();
    }

    @Override // X.InterfaceC48298IxS
    public void requestLayoutDelegate() {
        super.requestLayout();
    }

    public void requestLayoutMarginChanged() {
        super.requestLayout();
    }

    public C48295IxP(Context context) {
        super(context);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    public void setHasFixSize(boolean z) {
        if (this.mViewOptHelper == null) {
            this.mViewOptHelper = new C48294IxO(this);
        }
        this.mViewOptHelper.LIZIZ = z;
    }

    public C48295IxP(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public C48295IxP(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
