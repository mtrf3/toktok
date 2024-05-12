package X;

import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;
import kotlin.jvm.internal.AqS159S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LCJ implements InterfaceC53908LDs {
    public final View LJLIL;
    public final String LJLILLLLZI;
    public final C62822Ol8 LJLJI;

    @Override // X.InterfaceC53908LDs
    public final float getTextWidth() {
        Object value = this.LJLJI.getValue();
        o.LJIIIIZZ(value, "<get-textView>(...)");
        TextPaint paint = ((TextView) value).getPaint();
        if (paint != null) {
            return paint.measureText(this.LJLILLLLZI);
        }
        return 0.0f;
    }

    @Override // X.InterfaceC53908LDs
    public final View getView() {
        return this.LJLIL;
    }

    @Override // X.InterfaceC53908LDs
    public final void setText(String text) {
        o.LJIIIZ(text, "text");
        Object value = this.LJLJI.getValue();
        o.LJIIIIZZ(value, "<get-textView>(...)");
        ((TextView) value).setText(text);
    }

    @Override // X.InterfaceC53908LDs
    public final void setTextSize(float f) {
        Object value = this.LJLJI.getValue();
        o.LJIIIIZZ(value, "<get-textView>(...)");
        ((TextView) value).setTextSize(1, f);
    }

    public LCJ(View view, String title) {
        o.LJIIIZ(title, "title");
        this.LJLIL = view;
        this.LJLILLLLZI = title;
        this.LJLJI = C221108m2.LIZIZ(new AqS159S0100000_9(this, 1039));
    }
}
