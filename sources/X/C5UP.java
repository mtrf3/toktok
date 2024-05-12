package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.viewpager.widget.ViewPager;

/* renamed from: X.5UP, reason: invalid class name */
/* loaded from: classes3.dex */
public class C5UP extends FrameLayout {
    public LinearLayout LJLIL;
    public int LJLILLLLZI;
    public C5UQ LJLJI;
    public FrameLayout LJLJJI;

    private void setIndicatorPosition(int i) {
    }

    public View getLastSelectedTab() {
        return null;
    }

    public ViewPager getViewPager() {
        return null;
    }

    static {
        C16880lQ.LJLLJ(C5UP.class);
    }

    public int getTabCount() {
        return this.LJLIL.getChildCount();
    }

    public int getAllTabWidth() {
        return this.LJLILLLLZI;
    }

    public void setAllTabWidth(int i) {
        this.LJLILLLLZI = i;
    }

    public void setScrollable(boolean z) {
        this.LJLJI.setScrollable(z);
    }

    public C5UP(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLILLLLZI = -1;
        C5UQ c5uq = new C5UQ(getContext());
        this.LJLJI = c5uq;
        c5uq.setScrollable(false);
        this.LJLJI.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(this.LJLJI);
        this.LJLJI.setHorizontalFadingEdgeEnabled(false);
        this.LJLJI.setHorizontalScrollBarEnabled(false);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.LJLJJI = frameLayout;
        this.LJLJI.addView(frameLayout, new ViewGroup.LayoutParams(-2, -1));
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.LJLIL = linearLayout;
        linearLayout.setOrientation(0);
        this.LJLIL.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.LJLJJI.addView(this.LJLIL);
    }
}
