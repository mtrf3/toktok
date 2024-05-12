package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.4mN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C119394mN extends AbstractC030309z {
    public final Paint LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;
    public final int LJLJJI = -1;

    public C119394mN(int i, int i2, int i3) {
        this.LJLILLLLZI = i2;
        this.LJLJI = i3;
        Paint paint = new Paint(1);
        this.LJLIL = paint;
        paint.setColor(i);
        paint.setStyle(Paint.Style.FILL);
    }

    @Override // X.AbstractC030309z
    public final void LJI(Canvas canvas, RecyclerView recyclerView, C0AC c0ac) {
        if (this.LJLJI == 1) {
            int measuredWidth = recyclerView.getMeasuredWidth();
            int childCount = recyclerView.getChildCount();
            int itemCount = recyclerView.getAdapter().getItemCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                int LJJJJIZL = RecyclerView.LJJJJIZL(childAt);
                if (LJJJJIZL > 0 && LJJJJIZL < itemCount - 1 && LJJJJIZL != this.LJLJJI + 1) {
                    int top = childAt.getTop() + ((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).topMargin;
                    float f = top;
                    float f2 = top + 1;
                    canvas.drawRect(0.0f, f, 0.0f, f2, this.LJLIL);
                    float f3 = measuredWidth;
                    canvas.drawRect(f3 - 0.0f, f, f3, f2, this.LJLIL);
                }
            }
            return;
        }
        int measuredHeight = recyclerView.getMeasuredHeight();
        int childCount2 = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount2; i2++) {
            View childAt2 = recyclerView.getChildAt(i2);
            int LJJJJIZL2 = RecyclerView.LJJJJIZL(childAt2);
            if (LJJJJIZL2 > 0 && LJJJJIZL2 < childCount2 - 1 && LJJJJIZL2 != this.LJLJJI + 1) {
                int left = childAt2.getLeft() + ((ViewGroup.MarginLayoutParams) childAt2.getLayoutParams()).leftMargin;
                float f4 = left - this.LJLILLLLZI;
                float f5 = 0;
                canvas.drawRect(f4, f5, f4, f5 + 0.0f, this.LJLIL);
                float f6 = left;
                float f7 = measuredHeight;
                canvas.drawRect(f6, f7 - 0.0f, f6, f7, this.LJLIL);
            }
        }
    }

    @Override // X.AbstractC030309z
    public final void LJ(Rect rect, View view, RecyclerView recyclerView, C0AC c0ac) {
        int i;
        int i2;
        recyclerView.getClass();
        int LJJJJIZL = RecyclerView.LJJJJIZL(view);
        if (this.LJLJI == 1) {
            if (LJJJJIZL == this.LJLJJI) {
                i2 = 0;
            } else {
                i2 = this.LJLILLLLZI;
            }
            rect.set(0, 0, 0, i2);
            return;
        }
        if (LJJJJIZL == this.LJLJJI) {
            i = 0;
        } else {
            i = this.LJLILLLLZI;
        }
        rect.set(0, 0, i, 0);
    }
}
