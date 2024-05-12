package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.4mo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C119664mo extends ConstraintLayout {
    private final void setBackground(int i) {
        Drawable LIZIZ;
        if (C15380j0.LJIIZILJ()) {
            LIZIZ = C04270Et.LIZIZ(getContext(), R.drawable.cf2);
        } else {
            LIZIZ = C04270Et.LIZIZ(getContext(), R.drawable.cf1);
        }
        o.LJII(LIZIZ, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        GradientDrawable gradientDrawable = (GradientDrawable) LIZIZ;
        float LIZ = C15380j0.LIZ(8.0f);
        if (i != 0) {
            if (i == 1) {
                gradientDrawable.setCornerRadii(new float[]{LIZ, LIZ, LIZ, LIZ, 0.0f, 0.0f, 0.0f, 0.0f});
            }
        } else {
            gradientDrawable.setCornerRadius(LIZ);
        }
        setBackground(gradientDrawable);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C119664mo(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C04560Fw.LIZ(context, "context", attributeSet, "attrs");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.b9c});
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…le.RtlAwareSubFestBanner)");
        int i = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        setBackground(i);
    }
}
