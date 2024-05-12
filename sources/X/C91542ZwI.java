package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.ZwI, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91542ZwI extends RecyclerView {
    public boolean LLLF;
    public InterfaceC91108ZpI LLLFF;

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        if (this.LLLF) {
            return false;
        }
        return super.canScrollVertically(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        InterfaceC91108ZpI interfaceC91108ZpI = this.LLLFF;
        if (interfaceC91108ZpI != null) {
            interfaceC91108ZpI.LIZ(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.LLLF) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.LLLF) {
            return false;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        return super.onTouchEvent(motionEvent);
    }

    public final void setDisableTouchScroll(boolean z) {
        this.LLLF = z;
    }

    public final void setOnDispatchTouchEventListener(InterfaceC91108ZpI interfaceC91108ZpI) {
        this.LLLFF = interfaceC91108ZpI;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C91542ZwI(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        o.LJIIIZ(context, "context");
        new LinkedHashMap();
    }
}
