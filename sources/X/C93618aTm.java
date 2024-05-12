package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.aTm, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93618aTm extends FrameLayout {
    public float LJLIL;

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return true;
    }

    private final void setDragAreaHeight(float f) {
        this.LJLIL = f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float f;
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        float f2 = this.LJLIL;
        if (motionEvent != null) {
            f = motionEvent.getY();
        } else {
            f = Float.MAX_VALUE;
        }
        if (f2 <= f) {
            setNestedScrollingEnabled(false);
            return true;
        }
        setNestedScrollingEnabled(true);
        return dispatchTouchEvent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C93618aTm(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
        float f = Float.MAX_VALUE;
        this.LJLIL = Float.MAX_VALUE;
        TypedArray typedArray = null;
        if (attributeSet != null) {
            try {
                typedArray = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.byn});
                if (typedArray != null) {
                    f = typedArray.getDimension(0, Float.MAX_VALUE);
                }
            } catch (Exception unused) {
                if (typedArray == null) {
                    return;
                }
            } catch (Throwable th) {
                if (typedArray != null) {
                    typedArray.recycle();
                }
                throw th;
            }
        }
        this.LJLIL = f;
        if (typedArray != null) {
            typedArray.recycle();
        }
    }
}
