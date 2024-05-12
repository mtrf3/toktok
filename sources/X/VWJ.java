package X;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.live.uikit.rtl.RtlViewPager$SavedState;
import java.util.HashMap;

/* loaded from: classes15.dex */
public class VWJ extends ViewPager {
    public int LJLIL;
    public final HashMap<C0C3, VWK> LJLILLLLZI;

    public final boolean LIZJ() {
        if (this.LJLIL == 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final void clearOnPageChangeListeners() {
        super.clearOnPageChangeListeners();
        this.LJLILLLLZI.clear();
    }

    @Override // androidx.viewpager.widget.ViewPager
    public PagerAdapter getAdapter() {
        C80782Vn8 c80782Vn8 = (C80782Vn8) super.getAdapter();
        if (c80782Vn8 == null) {
            return null;
        }
        return c80782Vn8.LJLILLLLZI;
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

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final Parcelable onSaveInstanceState() {
        return new RtlViewPager$SavedState(super.onSaveInstanceState(), this.LJLIL);
    }

    public VWJ(Context context) {
        super(context);
        this.LJLILLLLZI = new HashMap<>();
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final void addOnPageChangeListener(C0C3 c0c3) {
        VWK vwk = new VWK(this, c0c3);
        this.LJLILLLLZI.put(c0c3, vwk);
        super.addOnPageChangeListener(vwk);
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

    @Override // androidx.viewpager.widget.ViewPager
    public final void removeOnPageChangeListener(C0C3 c0c3) {
        VWK remove = this.LJLILLLLZI.remove(c0c3);
        if (remove != null) {
            super.removeOnPageChangeListener(remove);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setAdapter(PagerAdapter pagerAdapter) {
        if (pagerAdapter != null) {
            pagerAdapter = new C80783Vn9(this, pagerAdapter);
        }
        super.setAdapter(pagerAdapter);
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
        super.setOnPageChangeListener(new VWK(this, c0c3));
    }

    public VWJ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJLILLLLZI = new HashMap<>();
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
