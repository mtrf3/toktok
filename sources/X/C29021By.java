package X;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.1By, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C29021By extends AbstractC030309z {
    public static final int[] LJLJJI = {R.attr.listDivider};
    public Drawable LJLIL;
    public int LJLILLLLZI;
    public final Rect LJLJI = new Rect();

    public C29021By(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(LJLJJI);
        this.LJLIL = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        if (i == 0 || i == 1) {
            this.LJLILLLLZI = i;
            return;
        }
        throw new IllegalArgumentException("Invalid orientation. It should be either HORIZONTAL or VERTICAL");
    }

    @Override // X.AbstractC030309z
    public final void LJFF(Canvas canvas, RecyclerView recyclerView, C0AC c0ac) {
        int height;
        int i;
        int width;
        int i2;
        if (recyclerView.getLayoutManager() == null || this.LJLIL == null) {
            return;
        }
        int i3 = 0;
        if (this.LJLILLLLZI == 1) {
            canvas.save();
            if (recyclerView.getClipToPadding()) {
                i2 = recyclerView.getPaddingLeft();
                width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                canvas.clipRect(i2, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
            } else {
                width = recyclerView.getWidth();
                i2 = 0;
            }
            int childCount = recyclerView.getChildCount();
            while (i3 < childCount) {
                View childAt = recyclerView.getChildAt(i3);
                RecyclerView.LJJJJLI(this.LJLJI, childAt);
                int round = Math.round(childAt.getTranslationY()) + this.LJLJI.bottom;
                this.LJLIL.setBounds(i2, round - this.LJLIL.getIntrinsicHeight(), width, round);
                this.LJLIL.draw(canvas);
                i3++;
            }
            canvas.restore();
            return;
        }
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i = recyclerView.getPaddingTop();
            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), i, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
        } else {
            height = recyclerView.getHeight();
            i = 0;
        }
        int childCount2 = recyclerView.getChildCount();
        while (i3 < childCount2) {
            View childAt2 = recyclerView.getChildAt(i3);
            C0A2 layoutManager = recyclerView.getLayoutManager();
            Rect rect = this.LJLJI;
            layoutManager.getClass();
            RecyclerView.LJJJJLI(rect, childAt2);
            int round2 = Math.round(childAt2.getTranslationX()) + this.LJLJI.right;
            this.LJLIL.setBounds(round2 - this.LJLIL.getIntrinsicWidth(), i, round2, height);
            this.LJLIL.draw(canvas);
            i3++;
        }
        canvas.restore();
    }

    @Override // X.AbstractC030309z
    public void LJ(Rect rect, View view, RecyclerView recyclerView, C0AC c0ac) {
        Drawable drawable = this.LJLIL;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.LJLILLLLZI == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }
}
