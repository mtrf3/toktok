package X;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* renamed from: X.4DO, reason: invalid class name */
/* loaded from: classes2.dex */
public class C4DO extends AbstractC030309z {
    public final int LJLIL;
    public final int LJLILLLLZI;
    public final Drawable LJLJJI;
    public final int LJLJI = 1;
    public final Rect LJLJJLL = new Rect();
    public int LJLJJL = 1;

    public C4DO(int i, int i2, int i3) {
        this.LJLIL = i2;
        this.LJLILLLLZI = i3;
        this.LJLJJI = new ColorDrawable(i);
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
        if (this.LJLJJL == 1) {
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
                this.LJLJJI.setBounds(this.LJLIL + i2, round - this.LJLJI, width - this.LJLILLLLZI, round);
                this.LJLJJI.draw(c);
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
            this.LJLJJI.setBounds(round2 - this.LJLJJI.getIntrinsicWidth(), i, round2, height);
            this.LJLJJI.draw(c);
            i3++;
        }
        c.restore();
    }
}
