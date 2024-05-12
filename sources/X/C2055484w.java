package X;

import android.graphics.Color;
import android.text.Spanned;
import android.text.TextPaint;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.84w, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2055484w extends AnonymousClass899 implements InterfaceC224678rn {
    public int LJLIL;
    public final float LJLILLLLZI;
    public final Object LJLJI;
    public InterfaceC88472Yns<Object, C76800UCe> LJLJJI;
    public boolean LJLJJL;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View widget) {
        InterfaceC88472Yns<Object, C76800UCe> interfaceC88472Yns;
        o.LJIIIZ(widget, "widget");
        if (!C6ZT.LIZ(widget) && (interfaceC88472Yns = this.LJLJJI) != null) {
            interfaceC88472Yns.invoke(this.LJLJI);
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds) {
        float f;
        o.LJIIIZ(ds, "ds");
        int i = this.LJLIL;
        if (i == 0) {
            i = ds.linkColor;
        }
        float alpha = Color.alpha(i);
        if (this.LJLJJL) {
            f = this.LJLILLLLZI;
        } else {
            f = 1.0f;
        }
        ds.setColor(Color.argb((int) (alpha * f), Color.red(i), Color.green(i), Color.blue(i)));
    }

    @Override // X.InterfaceC224678rn
    public final void LIZJ(View widget, Spanned text) {
        o.LJIIIZ(widget, "widget");
        o.LJIIIZ(text, "text");
        this.LJLJJL = true;
    }

    @Override // X.InterfaceC224678rn
    public final void LIZLLL(View widget, Spanned text) {
        o.LJIIIZ(widget, "widget");
        o.LJIIIZ(text, "text");
        this.LJLJJL = false;
    }

    public C2055484w(float f, int i, Object obj) {
        this.LJLIL = i;
        this.LJLILLLLZI = f;
        this.LJLJI = obj;
    }
}
