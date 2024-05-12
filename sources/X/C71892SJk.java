package X;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.SJk, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71892SJk extends AbstractC030309z {
    public final RecyclerView LJLIL;
    public final TextView LJLILLLLZI;
    public int LJLJI;
    public final GradientDrawable LJLJJI;
    public final boolean LJLJJL;
    public int LJLJJLL;

    public C71892SJk(RunnableC31065CHd runnableC31065CHd, C47121t6 c47121t6) {
        int i;
        this.LJLIL = runnableC31065CHd;
        this.LJLILLLLZI = c47121t6;
        Drawable LIZIZ = C04270Et.LIZIZ(c47121t6.getContext(), R.drawable.ce1);
        o.LJII(LIZIZ, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        this.LJLJJI = (GradientDrawable) LIZIZ;
        this.LJLJJL = CCJ.LIZ(c47121t6.getContext());
        c47121t6.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        c47121t6.setText(R.string.lny);
        c47121t6.setTypeface(C49616Jdc.LIZIZ().LIZLLL("medium"));
        c47121t6.setTextSize(1, 12.0f);
        c47121t6.setTextColor(C04330Ez.LIZIZ(c47121t6.getContext(), R.color.bc));
        c47121t6.measure(View.MeasureSpec.makeMeasureSpec(1024, 1073741824), View.MeasureSpec.makeMeasureSpec(LiveMaxRetainAlogMessageSizeSetting.DEFAULT, LiveLayoutPreloadThreadPriority.DEFAULT));
        if (runnableC31065CHd != null) {
            i = C16310kV.LJFF(runnableC31065CHd);
        } else {
            i = 0;
        }
        c47121t6.layout(C47959Irz.LIZJ(6, i), C7MY.LIZIZ(8), C47959Irz.LIZJ(8, c47121t6.getMeasuredWidth()), O6R.LJJIIZ(C32151Nz.LJIIZILJ(8)) + c47121t6.getMeasuredHeight());
    }

    @Override // X.AbstractC030309z
    public final void LJFF(Canvas c, RecyclerView parent, C0AC state) {
        C0A2 layoutManager;
        View LJJIJIL;
        int right;
        int left;
        o.LJIIIZ(c, "c");
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(state, "state");
        int i = this.LJLJI;
        if (2 <= i && i < 5 && (layoutManager = parent.getLayoutManager()) != null && (LJJIJIL = layoutManager.LJJIJIL(Math.min(parent.getChildCount(), this.LJLJI) - 1)) != null) {
            int LIZJ = C47959Irz.LIZJ(8, LJJIJIL.getHeight() + this.LJLILLLLZI.getTop() + ((int) this.LJLILLLLZI.getTextSize()));
            if (LJJIJIL.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.LayoutParams layoutParams = LJJIJIL.getLayoutParams();
                o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                LIZJ += ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            }
            if (this.LJLJJL) {
                this.LJLJJI.setBounds(C47135Ieh.LIZ(3, LJJIJIL.getLeft()), 0, O6R.LJJIIZ(C32151Nz.LJIIZILJ(3)) + parent.getWidth(), LIZJ);
            } else {
                GradientDrawable gradientDrawable = this.LJLJJI;
                int LIZ = C47135Ieh.LIZ(3, C16310kV.LJFF(parent));
                if (this.LJLJJL) {
                    right = LJJIJIL.getLeft();
                } else {
                    right = LJJIJIL.getRight();
                }
                gradientDrawable.setBounds(LIZ, 0, O6R.LJJIIZ(C32151Nz.LJIIZILJ(3)) + right, LIZJ);
            }
            int save = c.save();
            c.translate(0.0f, (-parent.computeVerticalScrollOffset()) - this.LJLJJLL);
            this.LJLJJI.draw(c);
            c.save();
            if (this.LJLJJL) {
                left = (parent.getWidth() - this.LJLILLLLZI.getWidth()) - this.LJLILLLLZI.getLeft();
            } else {
                left = this.LJLILLLLZI.getLeft();
            }
            c.translate(left, this.LJLILLLLZI.getTop());
            C39214FaE c39214FaE = C37203Eit.LIZJ;
            TextView textView = this.LJLILLLLZI;
            c39214FaE.getClass();
            C39214FaE.LIZ(textView, c);
            c.restoreToCount(save);
        }
    }

    @Override // X.AbstractC030309z
    public final void LJ(Rect rect, View view, RecyclerView recyclerView, C0AC c0ac) {
        T28.LJ(rect, "outRect", view, "view", recyclerView, "parent", c0ac, "state");
        super.LJ(rect, view, recyclerView, c0ac);
        C0A2 layoutManager = recyclerView.getLayoutManager();
        o.LJII(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager");
        int i = ((GridLayoutManager) layoutManager).LLIIIL;
        if (i == 0) {
            C0NB.LJ("LiveGiftPanelFreqUsedDecoration", "spanCount == 0");
            return;
        }
        int i2 = this.LJLJI;
        if (2 <= i2 && i2 < 5 && RecyclerView.LJJJJIZL(view) < i) {
            int LIZJ = C47959Irz.LIZJ(3, this.LJLILLLLZI.getTop() + ((int) this.LJLILLLLZI.getTextSize()));
            this.LJLJJLL = LIZJ;
            rect.top = LIZJ;
            rect.bottom = C7MY.LIZIZ(4);
        }
    }
}
