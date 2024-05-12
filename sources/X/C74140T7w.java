package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a1;

/* renamed from: X.T7w, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74140T7w extends RecyclerView {
    public float LLLF;
    public T80 LLLFF;

    public final T80 getPrevDragDir() {
        return this.LLLFF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            this.LLLF = motionEvent.getY();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 1) {
            if (motionEvent.getY() - this.LLLF > 0.0f) {
                this.LLLFF = T80.DOWN;
            } else {
                this.LLLFF = T80.UP;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setPrevDragDir(T80 t80) {
        this.LLLFF = t80;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74140T7w(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
        this.LLLF = -1.0f;
    }
}
