package X;

import android.graphics.Color;
import android.text.Spanned;
import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;
import kotlin.jvm.internal.AqS174S0100000_8;
import kotlin.jvm.internal.o;

/* renamed from: X.89G, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C89G<T> extends C89F implements C89E {
    public final int LJLIL;
    public final float LJLILLLLZI;
    public final T LJLJI;
    public final InterfaceC88472Yns<T, C76800UCe> LJLJJI;
    public boolean LJLJJL;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View widget) {
        InterfaceC88472Yns<T, C76800UCe> interfaceC88472Yns;
        o.LJIIIZ(widget, "widget");
        if (!C6ZT.LIZ(widget) && (interfaceC88472Yns = this.LJLJJI) != null) {
            interfaceC88472Yns.invoke(this.LJLJI);
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds) {
        float f;
        o.LJIIIZ(ds, "ds");
        float alpha = Color.alpha(this.LJLIL);
        if (this.LJLJJL) {
            f = this.LJLILLLLZI;
        } else {
            f = 1.0f;
        }
        ds.setColor(Color.argb((int) (alpha * f), Color.red(this.LJLIL), Color.green(this.LJLIL), Color.blue(this.LJLIL)));
    }

    @Override // X.C89E
    public final void LIZ(TextView widget, Spanned text) {
        o.LJIIIZ(widget, "widget");
        o.LJIIIZ(text, "text");
        this.LJLJJL = false;
        onClick(widget);
    }

    @Override // X.C89E
    public final void LIZIZ(TextView widget, Spanned text) {
        o.LJIIIZ(widget, "widget");
        o.LJIIIZ(text, "text");
        this.LJLJJL = true;
    }

    @Override // X.C89E
    public final void LIZJ(TextView widget, Spanned text) {
        o.LJIIIZ(widget, "widget");
        o.LJIIIZ(text, "text");
        this.LJLJJL = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C89G(int i, float f, Object obj, AqS174S0100000_8 aqS174S0100000_8) {
        this.LJLIL = i;
        this.LJLILLLLZI = f;
        this.LJLJI = obj;
        this.LJLJJI = aqS174S0100000_8;
    }
}
