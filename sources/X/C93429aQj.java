package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.IDqS419S0100000_42;
import kotlin.jvm.internal.o;

/* renamed from: X.aQj, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93429aQj extends FrameLayout {
    public final C94356afg LJLIL;

    public C93429aQj(Context context) {
        super(context, null, 0);
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.dva, this, false);
        addView(LLLLIILL);
        int i = R.id.nlv;
        TextView textView = (TextView) LLLLIILL.findViewById(R.id.nlv);
        if (textView != null) {
            i = R.id.no2;
            LinearLayout linearLayout = (LinearLayout) LLLLIILL.findViewById(R.id.no2);
            if (linearLayout != null) {
                this.LJLIL = new C94356afg((FrameLayout) LLLLIILL, textView, linearLayout);
                return;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(LLLLIILL.getResources().getResourceName(i)));
    }

    public final void setRetryAction(InterfaceC88472Yns<? super View, C76800UCe> callback) {
        o.LJIIIZ(callback, "callback");
        TextView textView = this.LJLIL.LJLILLLLZI;
        o.LJIIIIZZ(textView, "binding.btRetry");
        C93750aVu.LIZ(textView, 800L, new IDqS419S0100000_42(callback, 1));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredHeight = (int) ((getMeasuredHeight() * 0.4d) - C93742aVm.LIZIZ(114));
        int measuredHeight2 = (int) ((getMeasuredHeight() * 0.7d) + C93742aVm.LIZIZ(42));
        LinearLayout linearLayout = this.LJLIL.LJLJI;
        o.LJIIIIZZ(linearLayout, "binding.llStatus");
        if (((int) linearLayout.getTranslationY()) != measuredHeight) {
            LinearLayout linearLayout2 = this.LJLIL.LJLJI;
            o.LJIIIIZZ(linearLayout2, "binding.llStatus");
            linearLayout2.setTranslationY(measuredHeight);
        }
        TextView textView = this.LJLIL.LJLILLLLZI;
        o.LJIIIIZZ(textView, "binding.btRetry");
        if (((int) textView.getTranslationY()) != measuredHeight2) {
            TextView textView2 = this.LJLIL.LJLILLLLZI;
            o.LJIIIIZZ(textView2, "binding.btRetry");
            textView2.setTranslationY(measuredHeight2);
        }
    }
}
