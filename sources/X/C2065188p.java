package X;

import android.graphics.Color;
import android.text.TextPaint;
import android.view.View;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.88p, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2065188p extends AbstractC2065388r {
    public final C76Z LJLJI;
    public final TextExtraStruct LJLJJI;
    public final int LJLJJL;
    public final boolean LJLJJLL;
    public final /* synthetic */ C2064988n LJLJL;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View widget) {
        C76Z c76z;
        o.LJIIIZ(widget, "widget");
        if (!C6ZT.LIZ(widget) && (c76z = this.LJLJI) != null) {
            c76z.LIZ(this.LJLJJI);
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds) {
        o.LJIIIZ(ds, "ds");
        int i = this.LJLJJL;
        if (i == 0) {
            i = ds.linkColor;
        }
        if (this.LJLIL) {
            i = Color.argb(Math.round(Color.alpha(i) * this.LJLJL.getPressAlpha()), Color.red(i), Color.green(i), Color.blue(i));
        }
        ds.setColor(i);
        ds.setUnderlineText(this.LJLJL.getShowUnderline());
        if (this.LJLJJLL) {
            T5S t5s = new T5S();
            t5s.LIZ(82);
            ds.setTypeface(t5s.getTypeface());
        } else {
            T5S t5s2 = new T5S();
            t5s2.LIZ(81);
            ds.setTypeface(t5s2.getTypeface());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2065188p(C2064988n c2064988n, C76Z c76z, TextExtraStruct textExtraStruct, int i) {
        super(c2064988n);
        this.LJLJL = c2064988n;
        this.LJLJI = c76z;
        this.LJLJJI = textExtraStruct;
        this.LJLJJL = i;
        this.LJLJJLL = textExtraStruct.isBoldText();
    }
}
