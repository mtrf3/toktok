package X;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.4Yh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C111274Yh extends LinearLayout {
    public static float LIZ(int i) {
        return (EF7.LIZIZ().getResources().getDisplayMetrics().density * i) + 0.5f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C111274Yh(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        setId(R.id.l4t);
        LinearLayout.inflate(context, R.layout.cq9, this);
        GradientDrawable gradientDrawable = new GradientDrawable();
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "getContext()");
        gradientDrawable.setColor(AnonymousClass636.LJIIIIZZ(R.attr.d7, context2));
        gradientDrawable.setCornerRadius(LIZ(2));
        setBackground(gradientDrawable);
        C2055284u.LJFF((TuxTextView) findViewById(R.id.m_d));
        int LJJIIZ = O6R.LJJIIZ(LIZ(5));
        setPadding(LJJIIZ, 0, LJJIIZ, 0);
        setGravity(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, O6R.LJJIIZ(LIZ(22)));
        layoutParams.setMarginEnd(O6R.LJJIIZ(LIZ(8)));
        setLayoutParams(layoutParams);
    }
}
