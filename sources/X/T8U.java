package X;

import Y.ARunnableS38S0100000_2;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class T8U extends ConstraintLayout {
    public final TextView LJLIL;
    public final T8V LJLILLLLZI;
    public String LJLJI;

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        Animation animation;
        super.onDetachedFromWindow();
        TextView textView = this.LJLIL;
        if (textView != null && (animation = textView.getAnimation()) != null) {
            animation.cancel();
        }
        TextView textView2 = this.LJLIL;
        if (textView2 != null) {
            textView2.clearAnimation();
        }
        T8V t8v = this.LJLILLLLZI;
        t8v.LJFF = 0;
        TextView textView3 = t8v.LIZ;
        if (textView3 != null) {
            textView3.setText((CharSequence) null);
        }
        t8v.LJ = null;
        t8v.LJFF = -1;
        TextSwitcher textSwitcher = t8v.LIZIZ;
        if (textSwitcher != null) {
            textSwitcher.setText(null);
        }
        t8v.LIZ().removeCallbacks((Runnable) t8v.LJIIIZ.getValue());
        t8v.LIZJ = true;
    }

    public final String getEnterFrom() {
        return this.LJLJI;
    }

    public final void setEnterFrom(String str) {
        this.LJLJI = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T8U(final Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        new LinkedHashMap();
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.au2, this, true);
        View findViewById = findViewById(R.id.llw);
        o.LJII(findViewById, "null cannot be cast to non-null type android.widget.TextSwitcher");
        final TextSwitcher textSwitcher = (TextSwitcher) findViewById;
        textSwitcher.setFactory(new ViewSwitcher.ViewFactory() { // from class: X.5GY
            @Override // android.widget.ViewSwitcher.ViewFactory
            public final View makeView() {
                View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.c_a, textSwitcher, false);
                o.LJII(LLLLIILL, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView = (TextView) LLLLIILL;
                textSwitcher.post(new ARunnableS38S0100000_2(textView, 147));
                return textView;
            }
        });
        View findViewById2 = textSwitcher.findViewById(R.id.text);
        o.LJIIIIZZ(findViewById2, "tsMarqueeText.findViewById(R.id.text)");
        TextView textView = (TextView) findViewById2;
        this.LJLIL = textView;
        T8V t8v = new T8V(textView, textSwitcher);
        this.LJLILLLLZI = t8v;
        t8v.LJ = C47261Igj.LJJIJIL("");
        t8v.LJFF = -1;
        t8v.LIZLLL = 4000L;
        t8v.LIZJ(0, false);
        t8v.LIZIZ(t8v.LIZLLL);
    }
}
