package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.3nA, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C94403nA extends ViewPager {
    public java.util.Map<Integer, View> _$_findViewCache;
    public Boolean disableSwiping;
    public boolean smoothScroll;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C94403nA(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        o.LJIIIZ(context, "context");
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i) {
        java.util.Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (o.LJ(this.disableSwiping, Boolean.FALSE)) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (o.LJ(this.disableSwiping, Boolean.FALSE)) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i) {
        super.setCurrentItem(i, this.smoothScroll);
    }

    public final void setDisableSwiping(Boolean bool) {
        this.disableSwiping = bool;
    }

    public final void setSmoothScroll(boolean z) {
        this.smoothScroll = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94403nA(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this._$_findViewCache = C62850Ola.LJFF(context, "context");
        this.disableSwiping = Boolean.FALSE;
        this.smoothScroll = true;
    }

    public /* synthetic */ C94403nA(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
