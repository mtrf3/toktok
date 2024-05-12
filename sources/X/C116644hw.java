package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;

/* renamed from: X.4hw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C116644hw extends AbstractC030309z {
    public final int LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;
    public final Paint LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;

    static {
        C16880lQ.LJLLJ(C116644hw.class);
    }

    public static C116644hw LJII(Context context) {
        C116644hw c116644hw = new C116644hw(1, 1, context.getResources().getColor(R.color.bu));
        int LJIILL = C17N.LJIILL(16.0d);
        int LJIILL2 = C17N.LJIILL(16.0d);
        c116644hw.LJLJJL = LJIILL;
        c116644hw.LJLJJLL = LJIILL2;
        return c116644hw;
    }

    public C116644hw(int i, int i2, int i3) {
        Paint paint = new Paint();
        this.LJLJJI = paint;
        paint.setAntiAlias(true);
        paint.setColor(i3);
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = i2;
    }

    @Override // X.AbstractC030309z
    public final void LJFF(Canvas canvas, RecyclerView recyclerView, C0AC c0ac) {
        int i = 0;
        if (this.LJLIL == 1) {
            int childCount = recyclerView.getChildCount();
            int paddingLeft = recyclerView.getPaddingLeft() + this.LJLJJL;
            int width = (recyclerView.getWidth() - recyclerView.getPaddingRight()) - this.LJLJJLL;
            while (i < childCount) {
                View childAt = recyclerView.getChildAt(i);
                if (childAt == null) {
                    return;
                }
                canvas.drawRect(paddingLeft, childAt.getBottom() + ((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).bottomMargin, width, this.LJLJI + r1, this.LJLJJI);
                i++;
            }
            return;
        }
        int childCount2 = recyclerView.getChildCount();
        int paddingTop = recyclerView.getPaddingTop();
        while (i < childCount2) {
            View childAt2 = recyclerView.getChildAt(i);
            if (childAt2 == null) {
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt2.getLayoutParams();
            int height = childAt2.getHeight() - recyclerView.getPaddingBottom();
            canvas.drawRect(childAt2.getRight() + marginLayoutParams.rightMargin, paddingTop, this.LJLJI + r1, height, this.LJLJJI);
            i++;
        }
    }

    @Override // X.AbstractC030309z
    public final void LJ(Rect rect, View view, RecyclerView recyclerView, C0AC c0ac) {
        super.LJ(rect, view, recyclerView, c0ac);
        C0A2 layoutManager = recyclerView.getLayoutManager();
        int LIZIZ = c0ac.LIZIZ();
        int LJJJJJ = RecyclerView.LJJJJJ(view);
        if (LJJJJJ != -1 && (layoutManager instanceof LinearLayoutManager) && !(layoutManager instanceof GridLayoutManager)) {
            if (this.LJLIL == 1) {
                if (LJJJJJ == LIZIZ) {
                    rect.set(0, 0, 0, 0);
                    return;
                } else {
                    rect.set(0, 0, 0, this.LJLILLLLZI);
                    return;
                }
            }
            if (LJJJJJ == LIZIZ) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(0, 0, this.LJLILLLLZI, 0);
            }
        }
    }
}
