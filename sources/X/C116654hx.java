package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.4hx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C116654hx extends FrameLayout {
    public final boolean LJLIL;
    public final java.util.Map<Integer, View> LJLILLLLZI;

    public final View LIZ(int i) {
        java.util.Map<Integer, View> map = this.LJLILLLLZI;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C116654hx(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TextPaint paint;
        this.LJLILLLLZI = C62850Ola.LJFF(context, "context");
        this.LJLIL = true;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.a_4, R.attr.a_5, R.attr.a_6, R.attr.a_7, R.attr.b5g, R.attr.b5h});
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr….AnchorScribingPriceView)");
        int i = obtainStyledAttributes.getInt(5, 51);
        int i2 = obtainStyledAttributes.getInt(2, 91);
        int color = obtainStyledAttributes.getColor(4, R.attr.gp);
        int color2 = obtainStyledAttributes.getColor(1, R.attr.eb);
        obtainStyledAttributes.getColor(0, R.attr.c_);
        boolean z = obtainStyledAttributes.getBoolean(3, true);
        this.LJLIL = z;
        obtainStyledAttributes.recycle();
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.xp, this, true);
        TextView textView = (TextView) LIZ(R.id.i6c);
        if (textView != null && (paint = textView.getPaint()) != null) {
            paint.setFlags(16);
            paint.setAntiAlias(true);
        }
        TuxTextView tuxTextView = (TuxTextView) LIZ(R.id.i6c);
        tuxTextView.setTuxFont(i);
        tuxTextView.setTextColorRes(color);
        TuxTextView tuxTextView2 = (TuxTextView) LIZ(R.id.i5v);
        tuxTextView2.setTuxFont(i2);
        tuxTextView2.setTextColorRes(color2);
        Integer LJI = C79045V0n.LJI(R.attr.c_, context);
        if (LJI != null) {
            tuxTextView2.setBackgroundColor(LJI.intValue());
        }
        if (!z) {
            KL2.LJIILLIIL(4, tuxTextView2);
        }
    }
}
