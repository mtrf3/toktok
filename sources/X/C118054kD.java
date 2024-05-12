package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.4kD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C118054kD extends ConstraintLayout {
    public final float LJLIL;

    public final boolean LJJLJLI() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i;
        int i2;
        float paddingLeft = (this.LJLIL - getPaddingLeft()) - getPaddingRight();
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt != null) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                } else {
                    marginLayoutParams = null;
                }
                float measuredWidth = paddingLeft - childAt.getMeasuredWidth();
                if (marginLayoutParams != null) {
                    i = marginLayoutParams.leftMargin;
                } else {
                    i = 0;
                }
                float f = measuredWidth - i;
                if (marginLayoutParams != null) {
                    i2 = marginLayoutParams.rightMargin;
                } else {
                    i2 = 0;
                }
                paddingLeft = f - i2;
                if (paddingLeft < 0.0f) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public float getLeftFadingEdgeStrength() {
        if (!isHorizontalFadingEdgeEnabled() || !CCJ.LIZ(getContext()) || !LJJLJLI()) {
            return 0.0f;
        }
        return 1.0f;
    }

    @Override // android.view.View
    public float getRightFadingEdgeStrength() {
        if (!isHorizontalFadingEdgeEnabled() || CCJ.LIZ(getContext()) || !LJJLJLI()) {
            return 0.0f;
        }
        return 1.0f;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C118054kD(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C118054kD(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a1.LJFF(context, "context");
        this.LJLIL = context.getResources().getDimension(R.dimen.abb);
    }
}
