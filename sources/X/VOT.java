package X;

import Y.ARunnableS42S0100000_6;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import com.lynx.tasm.base.TraceEvent;
import java.lang.ref.WeakReference;

/* loaded from: classes15.dex */
public class VOT extends FrameLayout implements VPU {
    public VPJ mAccessibilityDelegate;
    public VPN mAccessibilityNodeProvider;
    public VOV mDrawChildHook;
    public boolean mEnableNewAccessibility;
    public boolean mHasMeaningfulLayout;
    public boolean mHasMeaningfulPaint;
    public long mMeaningfulPaintTiming;
    public WeakReference<C79600VLw> mTimingHandlerRef;

    public void clearMeaningfulFlag() {
        this.mHasMeaningfulLayout = false;
        this.mHasMeaningfulPaint = false;
        this.mMeaningfulPaintTiming = 0L;
    }

    public void notifyMeaningfulLayout() {
        this.mHasMeaningfulLayout = true;
    }

    public long getMeaningfulPaintTiming() {
        return this.mMeaningfulPaintTiming;
    }

    public VOT(Context context) {
        super(context);
        this.mTimingHandlerRef = new WeakReference<>(null);
        this.mEnableNewAccessibility = false;
    }

    public void bindDrawChildHook(VOV vov) {
        this.mDrawChildHook = vov;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        TraceEvent.LIZ(1L, "DispatchDraw");
        VOV vov = this.mDrawChildHook;
        if (vov != null) {
            vov.beforeDispatchDraw(canvas);
        }
        super.dispatchDraw(canvas);
        VOV vov2 = this.mDrawChildHook;
        if (vov2 != null) {
            vov2.afterDispatchDraw(canvas);
        }
        if (this.mHasMeaningfulLayout && !this.mHasMeaningfulPaint) {
            TraceEvent.LJII("FirstMeaningfulPaint", "#0CCE6A");
            this.mMeaningfulPaintTiming = System.currentTimeMillis();
            this.mHasMeaningfulPaint = true;
        }
        C79600VLw c79600VLw = this.mTimingHandlerRef.get();
        if (c79600VLw != null) {
            C79411VEp.LJ(new ARunnableS42S0100000_6(c79600VLw, 25));
        }
        TraceEvent.LIZLLL(1L, "DispatchDraw");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        VPJ vpj;
        VPN vpn;
        if (!this.mEnableNewAccessibility && (vpn = this.mAccessibilityNodeProvider) != null && vpn.LJII(motionEvent)) {
            return true;
        }
        if (this.mEnableNewAccessibility && (vpj = this.mAccessibilityDelegate) != null && vpj.LIZ(motionEvent)) {
            return true;
        }
        return onHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public void setChildrenDrawingOrderEnabled(boolean z) {
        super.setChildrenDrawingOrderEnabled(z);
    }

    public void setEnableAccessibilityElement(boolean z) {
        this.mEnableNewAccessibility = z;
    }

    public void setTimingHandler(C79600VLw c79600VLw) {
        this.mTimingHandlerRef = new WeakReference<>(c79600VLw);
    }

    public VOT(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mTimingHandlerRef = new WeakReference<>(null);
        this.mEnableNewAccessibility = false;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        VOV vov = this.mDrawChildHook;
        if (vov != null) {
            return vov.getChildDrawingOrder(i, i2);
        }
        return super.getChildDrawingOrder(i, i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 2048) {
            accessibilityEvent.setSource(this);
        }
        return super.requestSendAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j) {
        boolean drawChild;
        Rect beforeDrawChild;
        VOV vov = this.mDrawChildHook;
        if (vov != null && (beforeDrawChild = vov.beforeDrawChild(canvas, view, j)) != null) {
            canvas.save();
            canvas.clipRect(beforeDrawChild);
            drawChild = super.drawChild(canvas, view, j);
            canvas.restore();
        } else {
            drawChild = super.drawChild(canvas, view, j);
        }
        VOV vov2 = this.mDrawChildHook;
        if (vov2 != null) {
            vov2.afterDrawChild(canvas, view, j);
        }
        return drawChild;
    }
}
