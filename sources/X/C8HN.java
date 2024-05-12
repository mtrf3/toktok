package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.appcompat.widget.AppCompatTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.8HN, reason: invalid class name */
/* loaded from: classes4.dex */
public class C8HN extends AppCompatTextView {
    @Override // android.view.View
    public final AccessibilityNodeInfo createAccessibilityNodeInfo() {
        try {
            return super.createAccessibilityNodeInfo();
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean performLongClick() {
        try {
            return super.performLongClick();
        } catch (Exception unused) {
            getText();
            return false;
        }
    }

    @Override // android.view.View
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(super.toString());
        LIZ.append(", text: ");
        LIZ.append(getText());
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C8HN(Context context) {
        this(context, null);
        o.LJIIIZ(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8HN(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        o.LJIIIZ(context, "context");
        C78882Uxa.LIZ(EnumC49617Jdd.MEDIUM.getFONT_NAME());
        LJJIJIL(context, attributeSet);
    }

    public final void LJJIJIL(Context context, AttributeSet attributeSet) {
        o.LJIIIZ(context, "context");
        C78880UxY.LJJJJJ(this, attributeSet, false);
        GradientDrawable LJJLJ = C78880UxY.LJJLJ(context, attributeSet, false);
        if (LJJLJ != null) {
            setBackground(LJJLJ);
        }
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.bla, R.attr.blb, R.attr.blc, R.attr.bld, R.attr.ble, R.attr.blf, R.attr.blg, R.attr.blh, R.attr.bli, R.attr.blj, R.attr.blk, R.attr.bll, R.attr.blm, R.attr.bln, R.attr.blo, R.attr.blp, R.attr.blq, R.attr.blr, R.attr.bls, R.attr.blt, R.attr.blu, R.attr.blv, R.attr.blw, R.attr.blx, R.attr.bly, R.attr.blz, R.attr.bm0});
            o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…styleable.ToolsStyleView)");
            boolean z = obtainStyledAttributes.getBoolean(4, true);
            ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(20);
            obtainStyledAttributes.recycle();
            if (z) {
                if (colorStateList != null) {
                    setTextColor(colorStateList);
                    return;
                }
            } else {
                return;
            }
        }
        setTextColor(context.getResources().getColor(R.color.y0));
    }

    @Override // android.widget.TextView, android.view.View
    public final void onVisibilityChanged(View changedView, int i) {
        o.LJIIIZ(changedView, "changedView");
        try {
            super.onVisibilityChanged(changedView, i);
        } catch (NullPointerException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8HN(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        o.LJIIIZ(context, "context");
        C78882Uxa.LIZ(EnumC49617Jdd.MEDIUM.getFONT_NAME());
        LJJIJIL(context, attributeSet);
    }
}
