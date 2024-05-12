package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.8uu */
/* loaded from: classes4.dex */
public final class C226608uu extends C45631qh {
    public int LLIFFJFJJ;
    public final C62822Ol8 LLII;

    @Override // X.C45631qh, android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        return false;
    }

    private final C226618uv getContainer() {
        return (C226618uv) this.LLII.getValue();
    }

    public final int getTotalScrollY() {
        return this.LLIFFJFJJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C226608uu(Context context) {
        super(context, null);
        new LinkedHashMap();
        this.LLII = C221108m2.LIZIZ(new AqS153S0100000_3(this, 1655));
    }

    @Override // X.C45631qh
    public final void LJ(int i) {
        if (this.LLIFFJFJJ >= getContainer().getHeaderHeight()) {
            return;
        }
        super.LJ(i);
    }

    public final int LJIJJ(int i) {
        int min = Math.min(this.LLIFFJFJJ + i, getContainer().getHeaderHeight()) - this.LLIFFJFJJ;
        scrollBy(0, min);
        return i - min;
    }

    @Override // X.C45631qh, android.view.ViewGroup
    public final void addView(View child) {
        o.LJIIIZ(child, "child");
        addView(child, -1);
    }

    @Override // X.C45631qh, android.view.ViewGroup
    public final void addView(View view, int i) {
        addView(view, i, generateDefaultLayoutParams());
    }

    @Override // X.C45631qh, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addView(view, -1, layoutParams);
    }

    public static final /* synthetic */ void LJIJI(C226608uu c226608uu, C226618uv c226618uv, ViewGroup.LayoutParams layoutParams) {
        super.addView(c226618uv, 0, layoutParams);
    }

    @Override // X.C45631qh, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        getContainer().addView(view, i, layoutParams);
    }

    @Override // X.C45631qh, android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View target, int i, int i2, int[] consumed) {
        o.LJIIIZ(target, "target");
        o.LJIIIZ(consumed, "consumed");
        super.onNestedPreScroll(target, i, i2, consumed);
        if (this.LLIFFJFJJ < getContainer().getHeaderHeight()) {
            consumed[0] = i;
            consumed[1] = i2;
            scrollBy(0, i2);
        }
    }

    @Override // X.C45631qh, android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        this.LLIFFJFJJ = i2;
    }

    @Override // X.C45631qh, X.C1V0
    public final void LJJIIJ(View target, int i, int i2, int[] consumed, int i3) {
        o.LJIIIZ(target, "target");
        o.LJIIIZ(consumed, "consumed");
        super.LJJIIJ(target, i, i2, consumed, i3);
        if (this.LLIFFJFJJ < getContainer().getHeaderHeight()) {
            consumed[0] = i;
            consumed[1] = i2;
            scrollBy(0, i2);
        }
    }

    @Override // X.C45631qh, android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        if (view != null) {
            view.measure(i, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), LiveLayoutPreloadThreadPriority.DEFAULT));
        }
    }
}
