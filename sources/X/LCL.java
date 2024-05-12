package X;

import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LCL implements InterfaceC53908LDs {
    public final /* synthetic */ TextView LJLIL;
    public final /* synthetic */ LCP LJLILLLLZI;
    public final /* synthetic */ View LJLJI;

    @Override // X.InterfaceC53908LDs
    public final float getTextWidth() {
        TextPaint paint;
        TextView textView = this.LJLIL;
        if (textView != null && (paint = textView.getPaint()) != null) {
            return paint.measureText(this.LJLILLLLZI.LIZJ);
        }
        return 0.0f;
    }

    @Override // X.InterfaceC53908LDs
    public final View getView() {
        View view = this.LJLJI;
        o.LJIIIIZZ(view, "view");
        return view;
    }

    @Override // X.InterfaceC53908LDs
    public final void setText(String text) {
        o.LJIIIZ(text, "text");
        TextView textView = this.LJLIL;
        if (textView == null) {
            return;
        }
        textView.setText(text);
    }

    @Override // X.InterfaceC53908LDs
    public final void setTextSize(float f) {
        TextView textView = this.LJLIL;
        if (textView != null) {
            textView.setTextSize(1, f);
        }
    }

    public LCL(TextView textView, LCP lcp, View view) {
        this.LJLIL = textView;
        this.LJLILLLLZI = lcp;
        this.LJLJI = view;
    }
}
