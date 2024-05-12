package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.o;

/* renamed from: X.ah8, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94446ah8 extends C94163acZ {
    public boolean LJLJL;

    public C94446ah8(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C54339LUh.LIZ(this);
    }

    public final boolean getConstraintWidth() {
        return this.LJLJL;
    }

    public final void setConstraintWidth(boolean z) {
        this.LJLJL = z;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        int size;
        super.onMeasure(i, i2);
        if (this.LJLJL) {
            size = View.MeasureSpec.getSize(i2);
        } else {
            size = View.MeasureSpec.getSize(i);
        }
        setMeasuredDimension(size, size);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94446ah8(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        o.LJIIIZ(context, "context");
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    }

    public /* synthetic */ C94446ah8(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
