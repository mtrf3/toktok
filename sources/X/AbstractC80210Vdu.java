package X;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import java.util.List;

/* renamed from: X.Vdu, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC80210Vdu extends C80214Vdy<View> {
    public final Rect LIZ;
    public final Rect LIZIZ;
    public int LIZJ;
    public int LIZLLL;

    public abstract C80217Ve1 LIZ(List list);

    public float LIZIZ(View view) {
        return 1.0f;
    }

    public AbstractC80210Vdu() {
        this.LIZ = new Rect();
        this.LIZIZ = new Rect();
        this.LIZJ = 0;
    }

    public int LIZJ(View view) {
        return view.getMeasuredHeight();
    }

    public AbstractC80210Vdu(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LIZ = new Rect();
        this.LIZIZ = new Rect();
        this.LIZJ = 0;
    }

    @Override // X.C80214Vdy
    public final void layoutChild(C45621qg c45621qg, View view, int i) {
        C80217Ve1 LIZ = LIZ(c45621qg.LIZLLL(view));
        int i2 = 0;
        if (LIZ != null) {
            C06F c06f = (C06F) view.getLayoutParams();
            Rect rect = this.LIZ;
            rect.set(c45621qg.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c06f).leftMargin, LIZ.getBottom() + ((ViewGroup.MarginLayoutParams) c06f).topMargin, (c45621qg.getWidth() - c45621qg.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c06f).rightMargin, ((LIZ.getBottom() + c45621qg.getHeight()) - c45621qg.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c06f).bottomMargin);
            C16800lI lastWindowInsets = c45621qg.getLastWindowInsets();
            if (lastWindowInsets != null && C16300kU.LIZIZ(c45621qg) && !C16300kU.LIZIZ(view)) {
                rect.left = lastWindowInsets.LIZJ() + rect.left;
                rect.right -= lastWindowInsets.LIZLLL();
            }
            Rect rect2 = this.LIZIZ;
            int i3 = c06f.LIZJ;
            if (i3 == 0) {
                i3 = 8388659;
            }
            Gravity.apply(i3, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            if (this.LIZLLL != 0) {
                float LIZIZ = LIZIZ(LIZ);
                int i4 = this.LIZLLL;
                i2 = C78609UtB.LJJIIZ((int) (LIZIZ * i4), 0, i4);
            }
            view.layout(rect2.left, rect2.top - i2, rect2.right, rect2.bottom - i2);
            this.LIZJ = rect2.top - LIZ.getBottom();
            return;
        }
        super.layoutChild(c45621qg, view, i);
        this.LIZJ = 0;
    }

    @Override // X.C06C
    public final boolean onMeasureChild(C45621qg c45621qg, View view, int i, int i2, int i3, int i4) {
        C80217Ve1 LIZ;
        int i5;
        C16800lI lastWindowInsets;
        int i6 = view.getLayoutParams().height;
        if ((i6 == -1 || i6 == -2) && (LIZ = LIZ(c45621qg.LIZLLL(view))) != null) {
            int size = View.MeasureSpec.getSize(i3);
            if (size > 0) {
                if (C16300kU.LIZIZ(LIZ) && (lastWindowInsets = c45621qg.getLastWindowInsets()) != null) {
                    size += lastWindowInsets.LIZIZ() + lastWindowInsets.LJ();
                }
            } else {
                size = c45621qg.getHeight();
            }
            int LIZJ = (LIZJ(LIZ) + size) - LIZ.getMeasuredHeight();
            if (i6 == -1) {
                i5 = 1073741824;
            } else {
                i5 = LiveLayoutPreloadThreadPriority.DEFAULT;
            }
            c45621qg.LJIIJJI(view, i, i2, View.MeasureSpec.makeMeasureSpec(LIZJ, i5), i4);
            return true;
        }
        return false;
    }
}
