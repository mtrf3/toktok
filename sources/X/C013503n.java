package X;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.AdapterView;
import android.widget.HorizontalScrollView;
import com.zhiliaoapp.musically.R;

/* renamed from: X.03n, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C013503n extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {
    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z) {
    }

    static {
        new DecelerateInterpolator();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Context context = getContext();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{R.attr.x8, R.attr.xi, R.attr.xj, R.attr.a70, R.attr.a71, R.attr.a72, R.attr.a73, R.attr.a74, R.attr.a75, R.attr.a8z, R.attr.a_9, R.attr.a_b, R.attr.ab6, R.attr.afg, R.attr.afo, R.attr.ag1, R.attr.ag2, R.attr.ag7, R.attr.ahg, R.attr.aj3, R.attr.ay3, R.attr.b1u, R.attr.b52, R.attr.b5w, R.attr.b5x, R.attr.bfi, R.attr.bfl, R.attr.bje, R.attr.bjt}, R.attr.u3, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(13, 0);
        Resources resources = context.getResources();
        if (!context.getResources().getBoolean(R.bool.b)) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(R.dimen.bi));
        }
        obtainStyledAttributes.recycle();
        setContentHeight(layoutDimension);
        context.getResources().getDimensionPixelSize(R.dimen.bj);
    }

    public void setContentHeight(int i) {
        requestLayout();
    }

    public void setTabSelected(int i) {
        throw null;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            z = true;
        } else {
            z = false;
        }
        setFillViewport(z);
        throw null;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        ((C013403m) view).getTab().LIZ();
    }
}
