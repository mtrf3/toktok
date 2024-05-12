package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.sdk.widgets.ConstraintOptimizer;
import com.bytedance.ies.sdk.widgets.LayeredElementConfiguration;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class CVQ extends View {
    public java.util.Map<Integer, View> _$_findViewCache;
    public Integer indicatorColor;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CVQ(Context context) {
        this(context, null, 0, 6, 0 == true ? 1 : 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CVQ(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
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

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    public final Integer getIndicatorColor$live_widget_release() {
        return this.indicatorColor;
    }

    public final void setIndicatorColor$live_widget_release(Integer num) {
        this.indicatorColor = num;
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null) {
            ConstraintOptimizer.INSTANCE.correctHelperParams$live_widget_release(layoutParams);
        }
        super.setLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        ConstraintOptimizer constraintOptimizer = ConstraintOptimizer.INSTANCE;
        setMeasuredDimension(constraintOptimizer.getOptMeasureSize$live_widget_release(getLayoutParams().width, i), constraintOptimizer.getOptMeasureSize$live_widget_release(getLayoutParams().height, i2));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CVQ(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this._$_findViewCache = C62850Ola.LJFF(context, "context");
        if (LayeredElementConfiguration.INSTANCE.getGuidelineIndicatorEnabled()) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ahh}, i, 0);
            o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…ineView, defStyleAttr, 0)");
            this.indicatorColor = -65536;
            obtainStyledAttributes.recycle();
        }
    }

    public /* synthetic */ CVQ(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
