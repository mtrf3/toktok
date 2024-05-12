package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.9ug, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C251949ug extends ClickableSpan {
    public final int LJLIL;
    public final View.OnClickListener LJLILLLLZI;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        o.LJIIIZ(view, "view");
        View.OnClickListener onClickListener = this.LJLILLLLZI;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds) {
        o.LJIIIZ(ds, "ds");
        super.updateDrawState(ds);
        ds.setColor(this.LJLIL);
        T5S t5s = new T5S();
        t5s.LIZ(82);
        ds.setTypeface(t5s.getTypeface());
        ds.setUnderlineText(false);
    }

    public C251949ug(int i, View.OnClickListener onClickListener) {
        this.LJLIL = i;
        this.LJLILLLLZI = onClickListener;
    }
}
