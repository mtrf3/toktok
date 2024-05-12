package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.JRb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49159JRb extends AbstractC030309z {
    public float LJLIL;
    public final Paint LJLILLLLZI;
    public int LJLJI = 1;

    public C49159JRb() {
        Paint paint = new Paint();
        this.LJLILLLLZI = paint;
        paint.setAntiAlias(true);
        paint.setColor(0);
    }

    @Override // X.AbstractC030309z
    public final void LJFF(Canvas canvas, RecyclerView recyclerView, C0AC c0ac) {
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            int LJJJJIZL = RecyclerView.LJJJJIZL(recyclerView.getChildAt(i));
            if (LJJJJIZL != 0 && LJJJJIZL != childCount - 1) {
                if (this.LJLJI == 1) {
                    canvas.drawRect(recyclerView.getPaddingLeft() + 0.0f, r5.getTop() - this.LJLIL, (recyclerView.getWidth() - recyclerView.getPaddingRight()) - 0.0f, r5.getTop(), this.LJLILLLLZI);
                } else {
                    canvas.drawRect(r5.getLeft() - this.LJLIL, recyclerView.getPaddingTop() + 0.0f, r5.getLeft(), (recyclerView.getHeight() - recyclerView.getPaddingBottom()) - 0.0f, this.LJLILLLLZI);
                }
            }
        }
    }

    @Override // X.AbstractC030309z
    public final void LJ(Rect rect, View view, RecyclerView recyclerView, C0AC c0ac) {
        super.LJ(rect, view, recyclerView, c0ac);
        recyclerView.getClass();
        if (RecyclerView.LJJJJIZL(view) == 0) {
            return;
        }
        if (this.LJLJI == 1) {
            rect.top = (int) this.LJLIL;
        } else if (C26338AVi.LIZJ(view.getContext())) {
            rect.right = (int) this.LJLIL;
        } else {
            rect.left = (int) this.LJLIL;
        }
    }
}
