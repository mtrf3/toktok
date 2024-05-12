package X;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* renamed from: X.4DM, reason: invalid class name */
/* loaded from: classes2.dex */
public class C4DM extends AbstractC030309z {
    public final Drawable LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;
    public final int LJLJJI;
    public final int LJLJJL;
    public final Rect LJLJJLL = new Rect();

    @Override // X.AbstractC030309z
    public final void LJFF(Canvas c, RecyclerView parent, C0AC state) {
        int height;
        int i;
        int width;
        int i2;
        o.LJIIIZ(c, "c");
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(state, "state");
        if (parent.getLayoutManager() == null || this.LJLIL == null) {
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
            int childCount = parent.getChildCount();
            while (i3 < childCount) {
                View childAt = parent.getChildAt(i3);
                RecyclerView.LJJJJLI(this.LJLJJLL, childAt);
                int round = Math.round(childAt.getTranslationY()) + this.LJLJJLL.bottom;
                int i4 = round - this.LJLJI;
                Drawable drawable = this.LJLIL;
                o.LJI(drawable);
                drawable.setBounds(this.LJLJJI + i2, i4, width - this.LJLJJL, round);
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
        int childCount2 = parent.getChildCount();
        while (i3 < childCount2) {
            View childAt2 = parent.getChildAt(i3);
            o.LJI(parent.getLayoutManager());
            RecyclerView.LJJJJLI(this.LJLJJLL, childAt2);
            int round2 = Math.round(childAt2.getTranslationX()) + this.LJLJJLL.right;
            int i5 = round2 - this.LJLJI;
            Drawable drawable2 = this.LJLIL;
            o.LJI(drawable2);
            drawable2.setBounds(i5, this.LJLJJI + i, round2, height - this.LJLJJL);
            this.LJLIL.draw(c);
            i3++;
        }
        c.restore();
    }

    @Override // X.AbstractC030309z
    public void LJ(Rect rect, View view, RecyclerView recyclerView, C0AC c0ac) {
        T28.LJ(rect, "outRect", view, "view", recyclerView, "parent", c0ac, "state");
        if (this.LJLIL == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.LJLILLLLZI == 1) {
            rect.set(0, 0, 0, this.LJLJI);
        } else {
            rect.set(0, 0, this.LJLJI, 0);
        }
    }

    public C4DM(int i, int i2, int i3, int i4, int i5) {
        this.LJLIL = new ColorDrawable(i);
        this.LJLJI = i2;
        this.LJLJJI = i4;
        this.LJLJJL = i5;
        this.LJLILLLLZI = i3;
    }
}
