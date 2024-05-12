package X;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.viewpager.widget.PagerAdapter;
import dmt.viewpager.DmtRtlViewPager$SavedState;
import dmt.viewpager.DmtViewPager$SavedState;
import java.util.HashMap;

/* renamed from: X.Vms, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80766Vms extends C80769Vmv {
    public int LLJJIJIL;
    public final HashMap<C0C3, C80721Vm9> LLJJJ;

    public final boolean LJJIJL() {
        if (this.LLJJIJIL == 1) {
            return true;
        }
        return false;
    }

    @Override // X.C80769Vmv
    public PagerAdapter getAdapter() {
        C80771Vmx c80771Vmx = (C80771Vmx) super.getAdapter();
        if (c80771Vmx == null) {
            return null;
        }
        return c80771Vmx.LJLJJLL;
    }

    @Override // X.C80769Vmv
    public int getCurrentItem() {
        int currentItem = super.getCurrentItem();
        PagerAdapter adapter = super.getAdapter();
        if (adapter != null && LJJIJL()) {
            return TB3.LIZ(adapter, currentItem, -1);
        }
        return currentItem;
    }

    @Override // X.C80769Vmv, android.view.View
    public final Parcelable onSaveInstanceState() {
        return new DmtRtlViewPager$SavedState((DmtViewPager$SavedState) super.onSaveInstanceState(), this.LLJJIJIL);
    }

    public C80766Vms(Context context) {
        super(context);
        this.LLJJJ = new HashMap<>();
    }

    @Override // X.C80769Vmv
    public final void LJFF(C0C3 c0c3) {
        C80721Vm9 c80721Vm9 = new C80721Vm9(this, c0c3);
        this.LLJJJ.put(c0c3, c80721Vm9);
        super.LJFF(c80721Vm9);
    }

    @Override // X.C80769Vmv
    public final void LJJIIJ(C0C3 c0c3) {
        super.LJJIIJ(this.LLJJJ.get(c0c3));
    }

    @Override // X.C80769Vmv, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // X.C80769Vmv, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof DmtRtlViewPager$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        DmtRtlViewPager$SavedState dmtRtlViewPager$SavedState = (DmtRtlViewPager$SavedState) parcelable;
        this.LLJJIJIL = dmtRtlViewPager$SavedState.mLayoutDirection;
        super.onRestoreInstanceState(dmtRtlViewPager$SavedState.mViewPagerSavedState);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        int i2 = 0;
        int i3 = 1;
        if (i != 1) {
            i3 = 0;
        }
        if (i3 != this.LLJJIJIL) {
            PagerAdapter adapter = super.getAdapter();
            if (adapter != null) {
                i2 = getCurrentItem();
            }
            this.LLJJIJIL = i3;
            if (adapter != null) {
                adapter.notifyDataSetChanged();
                setCurrentItem(i2);
            }
        }
    }

    @Override // X.C80769Vmv, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
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

    @Override // X.C80769Vmv
    public void setAdapter(PagerAdapter pagerAdapter) {
        if (pagerAdapter != null) {
            pagerAdapter = new C80771Vmx(this, pagerAdapter);
        }
        super.setAdapter(pagerAdapter);
        setCurrentItem(0);
    }

    @Override // X.C80769Vmv
    public void setCurrentItem(int i) {
        PagerAdapter adapter = super.getAdapter();
        if (adapter != null && LJJIJL()) {
            i = TB3.LIZ(adapter, i, -1);
        }
        super.setCurrentItem(i);
    }

    @Override // X.C80769Vmv
    public void setOnPageChangeListener(C0C3 c0c3) {
        super.setOnPageChangeListener(new C80721Vm9(this, c0c3));
    }

    public C80766Vms(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLJJJ = new HashMap<>();
    }

    @Override // X.C80769Vmv, android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        try {
            return super.getChildDrawingOrder(i, i2);
        } catch (IndexOutOfBoundsException e) {
            C16880lQ.LLLLIIL(e);
            return 0;
        }
    }

    @Override // X.C80769Vmv, android.view.View
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

    @Override // X.C80769Vmv
    public final void setCurrentItem(int i, boolean z) {
        PagerAdapter adapter = super.getAdapter();
        if (adapter != null && LJJIJL()) {
            i = TB3.LIZ(adapter, i, -1);
        }
        super.setCurrentItem(i, z);
    }
}
