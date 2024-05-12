package X;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.utils.Au2S18S0100000_9;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LBV extends LinearLayout {
    public int LJLIL;
    public final C62822Ol8 LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public InterfaceC88472Yns<? super Integer, C76800UCe> LJLJJI;
    public final java.util.Map<Integer, View> LJLJJL;

    public final View LIZ(int i) {
        java.util.Map<Integer, View> map = this.LJLJJL;
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

    private final String getMRecentlyString() {
        return (String) this.LJLJI.getValue();
    }

    private final String getMRelevanceString() {
        return (String) this.LJLILLLLZI.getValue();
    }

    public final int LIZIZ() {
        float f;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i;
        Paint paint = new Paint();
        TextView textView = (TextView) LIZ(R.id.mh0);
        if (textView != null) {
            f = textView.getTextSize();
        } else {
            f = 0.0f;
        }
        paint.setTextSize(f);
        ViewGroup.LayoutParams layoutParams = LIZ(R.id.cd9).getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        int i2 = 0;
        if (marginLayoutParams != null) {
            i = marginLayoutParams.leftMargin;
            i2 = marginLayoutParams.rightMargin;
        } else {
            i = 0;
        }
        return ((int) paint.measureText(getMRelevanceString())) + i + i2 + ((int) paint.measureText(getMRecentlyString()));
    }

    public final void LIZJ(int i) {
        if (this.LJLIL == i) {
            return;
        }
        this.LJLIL = i;
        InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns = this.LJLJJI;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(Integer.valueOf(i));
        }
        if (i == 1) {
            TuxTextView tv_relevance = (TuxTextView) LIZ(R.id.mh0);
            o.LJIIIIZZ(tv_relevance, "tv_relevance");
            LIZLLL(tv_relevance, true);
            TuxTextView tv_recently = (TuxTextView) LIZ(R.id.mgp);
            o.LJIIIIZZ(tv_recently, "tv_recently");
            LIZLLL(tv_recently, false);
            return;
        }
        TuxTextView tv_recently2 = (TuxTextView) LIZ(R.id.mgp);
        o.LJIIIIZZ(tv_recently2, "tv_recently");
        LIZLLL(tv_recently2, true);
        TuxTextView tv_relevance2 = (TuxTextView) LIZ(R.id.mh0);
        o.LJIIIIZZ(tv_relevance2, "tv_relevance");
        LIZLLL(tv_relevance2, false);
    }

    public final void setOnSwitchTypeListener(InterfaceC88472Yns<? super Integer, C76800UCe> callback) {
        o.LJIIIZ(callback, "callback");
        this.LJLJJI = callback;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LBV(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLJJL = C62850Ola.LJFF(context, "context");
        this.LJLIL = 1;
        this.LJLILLLLZI = C221108m2.LIZIZ(new AqS159S0100000_9(context, 1066));
        this.LJLJI = C221108m2.LIZIZ(new AqS159S0100000_9(context, 1065));
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.a6v, this, true);
        ((TextView) LIZ(R.id.mh0)).setText(getMRelevanceString());
        ((TextView) LIZ(R.id.mgp)).setText(getMRecentlyString());
        View tv_relevance = LIZ(R.id.mh0);
        o.LJIIIIZZ(tv_relevance, "tv_relevance");
        C16880lQ.LJIIJ(new Au2S18S0100000_9(this, 5), tv_relevance);
        View tv_recently = LIZ(R.id.mgp);
        o.LJIIIIZZ(tv_recently, "tv_recently");
        C16880lQ.LJIIJ(new Au2S18S0100000_9(this, 6), tv_recently);
    }

    public static void LIZLLL(TuxTextView tuxTextView, boolean z) {
        if (z) {
            tuxTextView.setTuxFont(72);
            Context context = tuxTextView.getContext();
            o.LJIIIIZZ(context, "context");
            tuxTextView.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.go, context));
            return;
        }
        tuxTextView.setTuxFont(71);
        Context context2 = tuxTextView.getContext();
        o.LJIIIIZZ(context2, "context");
        tuxTextView.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.gv, context2));
    }
}
