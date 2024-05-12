package X;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.Spanned;
import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;
import kotlin.jvm.internal.o;

/* renamed from: X.89d, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2066589d extends AnonymousClass899 implements C89A {
    public final InterfaceC65784Pro<C76800UCe> LJLIL;
    public final int LJLILLLLZI;
    public int LJLJI;

    public final void LJ(Spanned spanned) {
        Object[] spans = spanned.getSpans(0, spanned.length(), C8FR.class);
        o.LJIIIIZZ(spans, "text.getSpans(0, text.le…TuxImageSpan::class.java)");
        for (Object obj : spans) {
            int i = this.LJLJI;
            Drawable drawable = ((C8FR) obj).LJLJJLL;
            if (drawable != null) {
                drawable.setAlpha(i);
            }
        }
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View widget) {
        o.LJIIIZ(widget, "widget");
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLIL;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds) {
        o.LJIIIZ(ds, "ds");
        ds.setColor(Color.argb(this.LJLJI, Color.red(this.LJLILLLLZI), Color.green(this.LJLILLLLZI), Color.blue(this.LJLILLLLZI)));
    }

    public C2066589d(int i, InterfaceC65784Pro interfaceC65784Pro) {
        this.LJLIL = interfaceC65784Pro;
        this.LJLILLLLZI = i;
        this.LJLJI = Color.alpha(i);
    }

    @Override // X.C89A
    public final void LIZ(TextView widget, Spanned text) {
        o.LJIIIZ(widget, "widget");
        o.LJIIIZ(text, "text");
        this.LJLJI = Color.alpha(this.LJLILLLLZI);
        LJ(text);
    }

    @Override // X.C89A
    public final void LIZIZ(TextView widget, Spanned text) {
        o.LJIIIZ(widget, "widget");
        o.LJIIIZ(text, "text");
        float alpha = Color.alpha(this.LJLILLLLZI);
        Context context = widget.getContext();
        o.LJIIIIZZ(context, "widget.context");
        this.LJLJI = (int) (C78897Uxp.LJJI(context) * alpha);
        LJ(text);
    }
}
