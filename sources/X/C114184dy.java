package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.4dy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C114184dy extends RelativeLayout {
    public final float LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C114184dy(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
        if (attributeSet == null) {
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.b0j});
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…eable.SurveyMaxWidthView)");
        this.LJLIL = obtainStyledAttributes.getDimension(0, 0.0f);
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        float f = this.LJLIL;
        if (f != 0.0f && size > f) {
            size = (int) f;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), View.MeasureSpec.getMode(i2)));
    }
}
