package X;

import Y.ACListenerS21S0100000_1;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.4nB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C119894nB extends LinearLayout {
    public View LJLIL;
    public ValueAnimator LJLILLLLZI;
    public final java.util.Map<Integer, View> LJLJI;

    public final View LIZ(int i) {
        java.util.Map<Integer, View> map = this.LJLJI;
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

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.LJLILLLLZI;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
    }

    public final ValueAnimator getCurrentAnimator() {
        return this.LJLILLLLZI;
    }

    public final View getUnderView() {
        return this.LJLIL;
    }

    public final void setCurrentAnimator(ValueAnimator valueAnimator) {
        this.LJLILLLLZI = valueAnimator;
    }

    public final void setUnderView(View view) {
        this.LJLIL = view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C119894nB(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLJI = C62850Ola.LJFF(context, "context");
        View.inflate(context, R.layout.dti, this);
        setOrientation(1);
        C16880lQ.LJJJ((TuxIconView) LIZ(R.id.l1t), new ACListenerS21S0100000_1(this, 278));
        String string = getContext().getString(R.string.rg4);
        o.LJIIIIZZ(string, "context.getString(R.string.sound_page_switch_2)");
        String string2 = getContext().getString(R.string.rg3);
        o.LJIIIIZZ(string2, "context.getString(R.string.sound_page_switch_1)");
        SpannableString spannableString = new SpannableString(getContext().getString(R.string.rg3, string));
        int LJJLIIIJL = s.LJJLIIIJL(string2, "%s", 0, false, 6);
        int length = string.length() + s.LJJLIIIJL(string2, "%s", 0, false, 6);
        if (LJJLIIIJL >= 0 && length <= spannableString.length()) {
            spannableString.setSpan(new StyleSpan(1), LJJLIIIJL, length, 33);
        }
        ((ImageView) LIZ(R.id.kby)).setImageResource(R.drawable.b9h);
        ((TextView) LIZ(R.id.kbz)).setText(spannableString);
        setLayerType(1, null);
    }
}
