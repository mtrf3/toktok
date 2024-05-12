package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.4Ha, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C106784Ha extends SYL {
    public int LLLFF;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C106784Ha(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.b0b});
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…le.MaxHeightRecyclerView)");
        this.LLLFF = obtainStyledAttributes.getLayoutDimension(0, this.LLLFF);
        obtainStyledAttributes.recycle();
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC13950gh());
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = this.LLLFF;
        if (i3 > 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(i3, LiveLayoutPreloadThreadPriority.DEFAULT);
        }
        super.onMeasure(i, i2);
    }
}
