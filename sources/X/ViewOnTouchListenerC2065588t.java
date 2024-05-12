package X;

import Y.ARunnableS39S0100000_3;
import android.os.Handler;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.TextView;
import kotlin.jvm.internal.o;

/* renamed from: X.88t, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class ViewOnTouchListenerC2065588t implements View.OnTouchListener {
    public View LJLILLLLZI;
    public long LJLIL = -1;
    public final Handler LJLJI = new Handler(C16880lQ.LLJJJJ());
    public final ARunnableS39S0100000_3 LJLJJI = new ARunnableS39S0100000_3(this, 177);

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View v, MotionEvent event) {
        o.LJIIIZ(v, "v");
        o.LJIIIZ(event, "event");
        int action = event.getAction();
        TextView textView = (TextView) v;
        CharSequence text = textView.getText();
        if (action != 2) {
            this.LJLJI.removeCallbacksAndMessages(null);
        }
        if (action == 0) {
            this.LJLIL = System.currentTimeMillis();
            this.LJLILLLLZI = v;
            this.LJLJI.postDelayed(this.LJLJJI, ViewConfiguration.getLongPressTimeout());
            v.setAlpha(0.5f);
        } else {
            v.setAlpha(1.0f);
            if (System.currentTimeMillis() - this.LJLIL < ViewConfiguration.getLongPressTimeout() && action == 1) {
                v.setAlpha(1.0f);
                if (text instanceof Spanned) {
                    int x = (int) event.getX();
                    int y = (int) event.getY();
                    int totalPaddingLeft = x - textView.getTotalPaddingLeft();
                    int totalPaddingTop = y - textView.getTotalPaddingTop();
                    int scrollX = textView.getScrollX() + totalPaddingLeft;
                    int scrollY = textView.getScrollY() + totalPaddingTop;
                    Layout layout = textView.getLayout();
                    int LLLLLLL = C16880lQ.LLLLLLL(layout, layout.getLineForVertical(scrollY), scrollX);
                    ClickableSpan[] link = (ClickableSpan[]) ((Spanned) text).getSpans(LLLLLLL, LLLLLLL, ClickableSpan.class);
                    o.LJIIIIZZ(link, "link");
                    if (link.length == 0) {
                        v.performClick();
                    } else {
                        link[0].onClick(textView);
                    }
                } else {
                    v.performClick();
                }
            }
        }
        return true;
    }
}
