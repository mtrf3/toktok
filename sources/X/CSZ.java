package X;

import android.text.TextPaint;
import android.view.View;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CSZ extends C6L {
    public final /* synthetic */ C31358CSk LJLJJL;

    @Override // X.C8FQ
    public final void LIZ(View widget) {
        o.LJIIIZ(widget, "widget");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds) {
        o.LJIIIZ(ds, "ds");
    }

    public CSZ(C31358CSk c31358CSk) {
        this.LJLJJL = c31358CSk;
    }

    @Override // X.C6L
    public final void LIZIZ(View widget) {
        o.LJIIIZ(widget, "widget");
        this.LJLJJL.LJJIIJ.invoke();
    }
}
