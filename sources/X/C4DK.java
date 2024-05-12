package X;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* renamed from: X.4DK, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4DK extends AbstractC030309z {
    public final Drawable LJLIL;
    public int LJLJJI;
    public int LJLJJL;
    public final Rect LJLJI = new Rect();
    public final int LJLILLLLZI = 1;

    public C4DK(Drawable drawable) {
        this.LJLIL = drawable;
    }

    @Override // X.AbstractC030309z
    public final void LJFF(Canvas c, RecyclerView parent, C0AC state) {
        int height;
        int i;
        int width;
        int i2;
        o.LJIIIZ(c, "c");
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(state, "state");
        if (parent.getLayoutManager() == null) {
            return;
        }
        int i3 = 0;
        if (this.LJLILLLLZI == 1) {
            c.save();
            if (parent.getClipToPadding()) {
                i2 = parent.getPaddingLeft();
                width = parent.getWidth() - parent.getPaddingRight();
                c.clipRect(i2, parent.getPaddingTop(), width, parent.getHeight() - parent.getPaddingBottom());
            } else {
                width = parent.getWidth();
                i2 = 0;
            }
            int i4 = i2 + this.LJLJJI;
            int i5 = width - this.LJLJJL;
            int childCount = parent.getChildCount() - 1;
            while (i3 < childCount) {
                View childAt = parent.getChildAt(i3);
                RecyclerView.LJJJJLI(this.LJLJI, childAt);
                int round = Math.round(childAt.getTranslationY()) + this.LJLJI.bottom;
                this.LJLIL.setBounds(i4, round - this.LJLIL.getIntrinsicHeight(), i5, round);
                this.LJLIL.draw(c);
                i3++;
            }
            c.restore();
            return;
        }
        c.save();
        if (parent.getClipToPadding()) {
            i = parent.getPaddingTop();
            height = parent.getHeight() - parent.getPaddingBottom();
            c.clipRect(parent.getPaddingLeft(), i, parent.getWidth() - parent.getPaddingRight(), height);
        } else {
            height = parent.getHeight();
            i = 0;
        }
        int i6 = i + this.LJLJJI;
        int i7 = height - this.LJLJJL;
        int childCount2 = parent.getChildCount() - 1;
        while (i3 < childCount2) {
            View childAt2 = parent.getChildAt(i3);
            o.LJI(parent.getLayoutManager());
            RecyclerView.LJJJJLI(this.LJLJI, childAt2);
            int round2 = Math.round(childAt2.getTranslationX()) + this.LJLJI.right;
            this.LJLIL.setBounds(round2 - this.LJLIL.getIntrinsicWidth(), i6, round2, i7);
            this.LJLIL.draw(c);
            i3++;
        }
        c.restore();
    }

    @Override // X.AbstractC030309z
    public final void LJ(Rect rect, View view, RecyclerView recyclerView, C0AC c0ac) {
        T28.LJ(rect, "outRect", view, "view", recyclerView, "parent", c0ac, "state");
        if (this.LJLILLLLZI == 1) {
            rect.set(0, 0, 0, this.LJLIL.getIntrinsicHeight());
        } else {
            rect.set(0, 0, this.LJLIL.getIntrinsicWidth(), 0);
        }
    }
}
