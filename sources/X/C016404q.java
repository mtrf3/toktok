package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.04q, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C016404q extends ViewGroup {
    public final HashMap<AbstractC531926x, C29321Dc> LJLIL;
    public final HashMap<C29321Dc, AbstractC531926x> LJLILLLLZI;

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View child, View target) {
        o.LJIIIZ(child, "child");
        o.LJIIIZ(target, "target");
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C29321Dc c29321Dc = this.LJLIL.get(childAt);
            if (childAt.isLayoutRequested() && c29321Dc != null) {
                c29321Dc.LJJJJJ(false);
            }
        }
    }

    public final HashMap<AbstractC531926x, C29321Dc> getHolderToLayoutNode() {
        return this.LJLIL;
    }

    public final HashMap<C29321Dc, AbstractC531926x> getLayoutNodeToHolder() {
        return this.LJLILLLLZI;
    }

    public C016404q(Context context) {
        super(context);
        setClipChildren(false);
        this.LJLIL = new HashMap<>();
        this.LJLILLLLZI = new HashMap<>();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (View.MeasureSpec.getMode(i2) == 1073741824) {
                setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
                java.util.Set<AbstractC531926x> keySet = this.LJLIL.keySet();
                o.LJIIIIZZ(keySet, "holderToLayoutNode.keys");
                for (AbstractC531926x abstractC531926x : keySet) {
                    int i4 = abstractC531926x.LJLLLLLL;
                    if (i4 != Integer.MIN_VALUE && (i3 = abstractC531926x.LJLZ) != Integer.MIN_VALUE) {
                        abstractC531926x.measure(i4, i3);
                    }
                }
                return;
            }
            "Failed requirement.".toString();
            throw new IllegalArgumentException("Failed requirement.");
        }
        "Failed requirement.".toString();
        throw new IllegalArgumentException("Failed requirement.");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        java.util.Set<AbstractC531926x> keySet = this.LJLIL.keySet();
        o.LJIIIIZZ(keySet, "holderToLayoutNode.keys");
        for (AbstractC531926x abstractC531926x : keySet) {
            abstractC531926x.layout(abstractC531926x.getLeft(), abstractC531926x.getTop(), abstractC531926x.getRight(), abstractC531926x.getBottom());
        }
    }
}
