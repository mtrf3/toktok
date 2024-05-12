package X;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.ss.android.ugc.aweme.sticker.widget.AVRtlViewPager$SavedState;
import java.util.HashMap;

/* loaded from: classes15.dex */
public class VWH extends ViewPager {
    public int LJLIL;
    public final HashMap<C0C3, VWI> LJLILLLLZI;
    public boolean LJLJI;

    public final boolean LIZJ() {
        if (this.LJLIL == 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public PagerAdapter getAdapter() {
        C80778Vn4 c80778Vn4 = (C80778Vn4) super.getAdapter();
        if (c80778Vn4 == null) {
            return null;
        }
        return c80778Vn4.LJLJJLL;
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
        return new AVRtlViewPager$SavedState(super.onSaveInstanceState(), this.LJLIL);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final void addOnPageChangeListener(C0C3 c0c3) {
        VWI vwi = new VWI(this, c0c3);
        this.LJLILLLLZI.put(c0c3, vwi);
        super.addOnPageChangeListener(vwi);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof AVRtlViewPager$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        AVRtlViewPager$SavedState aVRtlViewPager$SavedState = (AVRtlViewPager$SavedState) parcelable;
        this.LJLIL = aVRtlViewPager$SavedState.mLayoutDirection;
        super.onRestoreInstanceState(aVRtlViewPager$SavedState.mViewPagerSavedState);
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
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onTouchEvent(motionEvent);
        } catch (Exception unused) {
            if (motionEvent.getAction() == 1) {
                motionEvent.setAction(3);
                return super.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final void removeOnPageChangeListener(C0C3 c0c3) {
        super.removeOnPageChangeListener(this.LJLILLLLZI.get(c0c3));
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setAdapter(PagerAdapter pagerAdapter) {
        if (pagerAdapter != null) {
            pagerAdapter = new C80777Vn3(this, pagerAdapter);
        }
        super.setAdapter(pagerAdapter);
        setCurrentItem(0);
    }

    public void setCheckScrollXWhenIdle(boolean z) {
        this.LJLJI = z;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i) {
        PagerAdapter adapter = super.getAdapter();
        if (adapter != null && LIZJ()) {
            i = TB3.LIZ(adapter, i, -1);
        }
        super.setCurrentItem(i);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setOnPageChangeListener(C0C3 c0c3) {
        super.setOnPageChangeListener(new VWI(this, c0c3));
    }

    public VWH(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJLILLLLZI = new HashMap<>();
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
    public final void onMeasure(int i, int i2) {
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
    public final void setCurrentItem(int i, boolean z) {
        PagerAdapter adapter = super.getAdapter();
        if (adapter != null && LIZJ()) {
            i = TB3.LIZ(adapter, i, -1);
        }
        super.setCurrentItem(i, z);
    }
}
