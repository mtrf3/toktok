package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.5Sz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C135375Sz extends RecyclerView {
    public double LLLF;
    public double LLLFF;

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent e) {
        o.LJIIIZ(e, "e");
        int action = e.getAction();
        if (action != 0) {
            if (action == 2) {
                double abs = Math.abs(e.getX() - this.LLLF);
                double abs2 = Math.abs(e.getY() - this.LLLFF);
                if (abs > ViewConfiguration.get(getContext()).getScaledTouchSlop() && abs > abs2) {
                    return false;
                }
            }
        } else {
            this.LLLF = e.getX();
            this.LLLFF = e.getY();
        }
        return super.onInterceptTouchEvent(e);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C135375Sz(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
    }
}
