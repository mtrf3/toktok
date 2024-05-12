package X;

import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.aYM, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93902aYM {
    public static void LIZ(View into, ViewGroup parent) {
        o.LJIIIZ(into, "$this$into");
        o.LJIIIZ(parent, "parent");
        parent.addView(into);
    }

    public static final void LJFF(TextView setBehaviourElementFontStyle, int i) {
        o.LJIIIZ(setBehaviourElementFontStyle, "$this$setBehaviourElementFontStyle");
        setBehaviourElementFontStyle.setTextColor(C04330Ez.LIZIZ(setBehaviourElementFontStyle.getContext(), R.color.adn));
        setBehaviourElementFontStyle.setHintTextColor(C04330Ez.LIZIZ(setBehaviourElementFontStyle.getContext(), R.color.adr));
        setBehaviourElementFontStyle.setTextSize(2, 14.0f);
        setBehaviourElementFontStyle.setTypeface(Typeface.DEFAULT_BOLD);
        setBehaviourElementFontStyle.setMaxLines(1);
        setBehaviourElementFontStyle.setEllipsize(TextUtils.TruncateAt.END);
        setBehaviourElementFontStyle.setGravity(i);
    }

    public static final void LJI(View withLayoutParams, ViewGroup.LayoutParams layoutParams) {
        o.LJIIIZ(withLayoutParams, "$this$withLayoutParams");
        withLayoutParams.setLayoutParams(layoutParams);
    }

    public static C018905p LIZLLL(ConstraintLayout obtainLayoutParams, int i, int i2, int i3, InterfaceC88472Yns block, int i4) {
        int i5;
        if ((i4 & 1) != 0) {
            i5 = -1;
        } else {
            i5 = 0;
        }
        if ((i4 & 2) != 0) {
            i = -1;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = 0;
        }
        if ((i4 & 256) != 0) {
            block = C94699alD.LJLIL;
        }
        o.LJIIIZ(obtainLayoutParams, "$this$obtainLayoutParams");
        o.LJIIIZ(block, "block");
        C018905p c018905p = new C018905p(i5, i);
        c018905p.setMargins(i3, i2, i3, i2);
        block.invoke(c018905p);
        return c018905p;
    }

    public static RecyclerView.LayoutParams LJ(RecyclerView obtainLayoutParams, int i, int i2, int i3, Integer num, Integer num2, int i4) {
        int i5;
        if ((i4 & 2) != 0) {
            i = -1;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = 0;
        }
        if ((i4 & 16) != 0) {
            num = null;
        }
        if ((i4 & 128) != 0) {
            num2 = null;
        }
        o.LJIIIZ(obtainLayoutParams, "$this$obtainLayoutParams");
        RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(-1, i);
        if (num2 != null) {
            i5 = num2.intValue();
        } else {
            i5 = i2;
        }
        layoutParams.setMargins(i3, i2, i3, i5);
        if (num != null) {
            layoutParams.setMarginStart(num.intValue());
        }
        return layoutParams;
    }

    public static FrameLayout.LayoutParams LIZIZ(FrameLayout obtainLayoutParams, int i, int i2, int i3, int i4, Integer num, Integer num2, int i5) {
        if ((i5 & 1) != 0) {
            i = -1;
        }
        if ((i5 & 2) != 0) {
            i2 = -1;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = 0;
        }
        if ((i5 & 32) != 0) {
            num = null;
        }
        if ((i5 & 256) != 0) {
            num2 = null;
        }
        o.LJIIIZ(obtainLayoutParams, "$this$obtainLayoutParams");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i2);
        layoutParams.setMargins(i4, i3, i4, i3);
        if (num != null) {
            layoutParams.setMarginEnd(num.intValue());
        }
        if (num2 != null) {
            layoutParams.gravity = num2.intValue();
        }
        return layoutParams;
    }

    public static LinearLayout.LayoutParams LIZJ(LinearLayout obtainLayoutParams, int i, int i2, int i3, int i4, Integer num, Integer num2, Integer num3, Integer num4, Float f, Integer num5, int i5) {
        int i6;
        if ((i5 & 1) != 0) {
            i = -2;
        }
        if ((i5 & 2) != 0) {
            i2 = -1;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = 0;
        }
        if ((i5 & 16) != 0) {
            num = null;
        }
        if ((i5 & 32) != 0) {
            num2 = null;
        }
        if ((i5 & 64) != 0) {
            num3 = null;
        }
        if ((i5 & 128) != 0) {
            num4 = null;
        }
        if ((i5 & 256) != 0) {
            f = null;
        }
        if ((i5 & 512) != 0) {
            num5 = null;
        }
        o.LJIIIZ(obtainLayoutParams, "$this$obtainLayoutParams");
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i2);
        if (num3 != null) {
            i6 = num3.intValue();
        } else {
            i6 = i3;
        }
        if (num4 != null) {
            i3 = num4.intValue();
        }
        layoutParams.setMargins(i4, i6, i4, i3);
        if (num != null) {
            layoutParams.setMarginStart(num.intValue());
        }
        if (num2 != null) {
            layoutParams.setMarginEnd(num2.intValue());
        }
        if (f != null) {
            layoutParams.weight = f.floatValue();
        }
        if (num5 != null) {
            layoutParams.gravity = num5.intValue();
        }
        return layoutParams;
    }
}
