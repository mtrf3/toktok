package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import defpackage.a1;

/* loaded from: classes6.dex */
public final class CW0 extends C31255COl {
    public int LLLIIL;

    public final int getMaxHeight() {
        return this.LLLIIL;
    }

    public final void setMaxHeight(int i) {
        this.LLLIIL = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CW0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC13950gh());
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = this.LLLIIL;
        if (i3 > 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(i3, LiveLayoutPreloadThreadPriority.DEFAULT);
        }
        super.onMeasure(i, i2);
    }
}
