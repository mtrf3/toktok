package X;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.Spanned;
import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import kotlin.jvm.internal.AqS139S0200000_8;
import kotlin.jvm.internal.o;

/* renamed from: X.89e, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2066689e<T> extends AnonymousClass899 implements InterfaceC224678rn, C89A {
    public final T LJLIL;
    public final int LJLILLLLZI;
    public final InterfaceC88472Yns<T, C76800UCe> LJLJI;
    public int LJLJJI;

    public final void LJ(Spanned spanned) {
        Object[] spans = spanned.getSpans(0, spanned.length(), C8FR.class);
        o.LJIIIIZZ(spans, "text.getSpans(0, text.le…TuxImageSpan::class.java)");
        for (Object obj : spans) {
            int i = this.LJLJJI;
            Drawable drawable = ((C8FR) obj).LJLJJLL;
            if (drawable != null) {
                drawable.setAlpha(i);
            }
        }
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View widget) {
        o.LJIIIZ(widget, "widget");
        this.LJLJI.invoke(this.LJLIL);
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds) {
        o.LJIIIZ(ds, "ds");
        ds.setColor(Color.argb(this.LJLJJI, Color.red(this.LJLILLLLZI), Color.green(this.LJLILLLLZI), Color.blue(this.LJLILLLLZI)));
    }

    @Override // X.C89A
    public final void LIZ(TextView widget, Spanned text) {
        o.LJIIIZ(widget, "widget");
        o.LJIIIZ(text, "text");
        this.LJLJJI = Color.alpha(this.LJLILLLLZI);
        LJ(text);
    }

    @Override // X.C89A
    public final void LIZIZ(TextView widget, Spanned text) {
        float f;
        o.LJIIIZ(widget, "widget");
        o.LJIIIZ(text, "text");
        float alpha = Color.alpha(this.LJLILLLLZI);
        Context context = widget.getContext();
        o.LJIIIIZZ(context, "widget.context");
        Float LJIIIZ = C79045V0n.LJIIIZ(context);
        if (LJIIIZ != null) {
            f = LJIIIZ.floatValue();
        } else {
            f = 0.2f;
        }
        this.LJLJJI = (int) (alpha * f);
        LJ(text);
    }

    @Override // X.InterfaceC224678rn
    public final void LIZJ(View widget, Spanned text) {
        float f;
        o.LJIIIZ(widget, "widget");
        o.LJIIIZ(text, "text");
        float alpha = Color.alpha(this.LJLILLLLZI);
        Context context = widget.getContext();
        o.LJIIIIZZ(context, "widget.context");
        Float LJIIIZ = C79045V0n.LJIIIZ(context);
        if (LJIIIZ != null) {
            f = LJIIIZ.floatValue();
        } else {
            f = 0.2f;
        }
        this.LJLJJI = (int) (alpha * f);
        LJ(text);
    }

    @Override // X.InterfaceC224678rn
    public final void LIZLLL(View widget, Spanned text) {
        o.LJIIIZ(widget, "widget");
        o.LJIIIZ(text, "text");
        this.LJLJJI = Color.alpha(this.LJLILLLLZI);
        LJ(text);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2066689e(int i, TextExtraStruct textExtraStruct, AqS139S0200000_8 aqS139S0200000_8) {
        this.LJLIL = textExtraStruct;
        this.LJLILLLLZI = i;
        this.LJLJI = aqS139S0200000_8;
        this.LJLJJI = Color.alpha(i);
    }
}
