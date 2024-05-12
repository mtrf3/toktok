package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.ies.sdk.widgets.ConstraintOptimizer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class CVM extends C1AF {
    public java.util.Map<Integer, View> _$_findViewCache;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CVM(Context context) {
        this(context, null, 0, 6, 0 == true ? 1 : 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CVM(Context context, AttributeSet attributeSet) {
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

    public void callSuperSetLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null) {
            ConstraintOptimizer.INSTANCE.correctHelperParams$live_widget_release(layoutParams);
        }
        callSuperSetLayoutParams(layoutParams);
    }

    @Override // X.AbstractC019505v
    public void updatePreLayout(ConstraintLayout constraintLayout) {
        super.updatePreLayout(constraintLayout);
        if (constraintLayout == null) {
            return;
        }
        int i = this.mCount;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 < i) {
                View viewById = constraintLayout.getViewById(this.mIds[i3]);
                if (viewById != null && (viewById.getVisibility() == 0 || viewById.getVisibility() == 4)) {
                    break;
                } else {
                    i3++;
                }
            } else {
                i2 = 8;
                break;
            }
        }
        setVisibility(i2);
    }

    @Override // X.AbstractC019505v, android.view.View
    public void onMeasure(int i, int i2) {
        ConstraintOptimizer constraintOptimizer = ConstraintOptimizer.INSTANCE;
        setMeasuredDimension(constraintOptimizer.getOptMeasureSize$live_widget_release(getLayoutParams().width, i), constraintOptimizer.getOptMeasureSize$live_widget_release(getLayoutParams().height, i2));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CVM(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this._$_findViewCache = C62850Ola.LJFF(context, "context");
        setVisibility(0);
    }

    public /* synthetic */ CVM(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
