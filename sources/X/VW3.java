package X;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.ss.android.ugc.aweme.views.RtlViewPager$SavedState;
import java.util.HashMap;

/* loaded from: classes15.dex */
public class VW3 extends ViewPager {
    public int LJLIL;
    public final HashMap<C0C3, VW2> LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public boolean LJLJJLL;

    public final boolean LIZJ() {
        if (this.LJLIL == 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public PagerAdapter getAdapter() {
        C80780Vn6 c80780Vn6 = (C80780Vn6) super.getAdapter();
        if (c80780Vn6 == null) {
            return null;
        }
        return c80780Vn6.LJLJJLL;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public int getCurrentItem() {
        int currentItem = super.getCurrentItem();
        PagerAdapter adapter = super.getAdapter();
        if (adapter != null && LIZJ()) {
            return TB3.LIZ(adapter, currentItem, -1);
        }
        return currentItem;
    }

    public int getItemCount() {
        if (getAdapter() == null) {
            return 0;
        }
        return getAdapter().getCount();
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final Parcelable onSaveInstanceState() {
        return new RtlViewPager$SavedState(super.onSaveInstanceState(), this.LJLIL);
    }

    public VW3(Context context) {
        super(context);
        this.LJLILLLLZI = new HashMap<>();
        this.LJLJI = true;
        this.LJLJJI = true;
        this.LJLJJL = false;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final void addOnPageChangeListener(C0C3 c0c3) {
        VW2 vw2 = new VW2(this, c0c3);
        this.LJLILLLLZI.put(c0c3, vw2);
        super.addOnPageChangeListener(vw2);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            if (!this.LJLJI) {
                return false;
            }
            if (!super.onInterceptTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof RtlViewPager$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        RtlViewPager$SavedState rtlViewPager$SavedState = (RtlViewPager$SavedState) parcelable;
        this.LJLIL = rtlViewPager$SavedState.mLayoutDirection;
        super.onRestoreInstanceState(rtlViewPager$SavedState.mViewPagerSavedState);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        int i2 = 0;
        int i3 = 1;
        if (i != 1) {
            i3 = 0;
        }
        if (i3 != this.LJLIL) {
            PagerAdapter adapter = super.getAdapter();
            if (adapter != null) {
                i2 = getCurrentItem();
            }
            this.LJLIL = i3;
            if (adapter != null) {
                adapter.notifyDataSetChanged();
                setCurrentItem(i2);
            }
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            if (!this.LJLJI) {
                return false;
            }
            if (!super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            if (motionEvent.getAction() != 1) {
                return false;
            }
            motionEvent.setAction(3);
            if (!this.LJLJI || !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final void removeOnPageChangeListener(C0C3 c0c3) {
        super.removeOnPageChangeListener(this.LJLILLLLZI.get(c0c3));
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setAdapter(PagerAdapter pagerAdapter) {
        if (pagerAdapter != null) {
            pagerAdapter = new C80779Vn5(this, pagerAdapter);
        }
        super.setAdapter(pagerAdapter);
        setCurrentItem(0);
    }

    public void setCheckScrollXWhenIdle(boolean z) {
        this.LJLJJLL = z;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i) {
        PagerAdapter adapter = super.getAdapter();
        if (adapter != null && LIZJ()) {
            i = TB3.LIZ(adapter, i, -1);
        }
        if (this.LJLJJI) {
            super.setCurrentItem(i);
        } else {
            super.setCurrentItem(i, false);
        }
    }

    public void setDynamicContentHeightEnabled(boolean z) {
        this.LJLJJL = z;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setOnPageChangeListener(C0C3 c0c3) {
        super.setOnPageChangeListener(new VW2(this, c0c3));
    }

    public void setSmoothScrollEnabled(boolean z) {
        this.LJLJJI = z;
    }

    public void setSwipeable(boolean z) {
        this.LJLJI = z;
    }

    public VW3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJLILLLLZI = new HashMap<>();
        this.LJLJI = true;
        this.LJLJJI = true;
        this.LJLJJL = false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        try {
            return super.getChildDrawingOrder(i, i2);
        } catch (IndexOutOfBoundsException e) {
            C16880lQ.LLLLIIL(e);
            return 0;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public void onMeasure(int i, int i2) {
        View.MeasureSpec.getMode(i2);
        if (View.MeasureSpec.getMode(i2) == 0) {
            int i3 = 0;
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                childAt.measure(i, View.MeasureSpec.makeMeasureSpec(0, 0));
                int measuredHeight = childAt.getMeasuredHeight();
                if (measuredHeight > i3) {
                    i3 = measuredHeight;
                }
            }
            i2 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i, boolean z) {
        PagerAdapter adapter = super.getAdapter();
        boolean z2 = true;
        if (adapter != null && LIZJ()) {
            i = TB3.LIZ(adapter, i, -1);
        }
        if (!this.LJLJJI || !z) {
            z2 = false;
        }
        super.setCurrentItem(i, z2);
    }
}
