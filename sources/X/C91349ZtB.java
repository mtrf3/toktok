package X;

import android.R;
import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;
import kotlin.jvm.internal.o;

/* renamed from: X.ZtB, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91349ZtB implements InterfaceC53908LDs {
    public final View LJLIL;
    public final LCP LJLILLLLZI;

    @Override // X.InterfaceC53908LDs
    public final float getTextWidth() {
        float f;
        TextPaint paint;
        TextView textView = (TextView) this.LJLIL.findViewById(R.id.text1);
        if (textView != null && (paint = textView.getPaint()) != null) {
            f = paint.measureText(this.LJLILLLLZI.LIZJ);
        } else {
            f = 0.0f;
        }
        return f + C91073Zoj.LIZ(12);
    }

    @Override // X.InterfaceC53908LDs
    public final View getView() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC53908LDs
    public final void setText(String text) {
        o.LJIIIZ(text, "text");
        TextView textView = (TextView) this.LJLIL.findViewById(R.id.text1);
        if (textView == null) {
            return;
        }
        textView.setText(text);
    }

    @Override // X.InterfaceC53908LDs
    public final void setTextSize(float f) {
        TextView textView = (TextView) this.LJLIL.findViewById(R.id.text1);
        if (textView != null) {
            textView.setTextSize(1, f);
        }
    }

    public C91349ZtB(View view, LCP lcp) {
        this.LJLIL = view;
        this.LJLILLLLZI = lcp;
    }
}
