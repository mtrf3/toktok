package X;

import android.text.TextPaint;
import android.view.View;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CV0 extends C6L {
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJL;

    @Override // X.C8FQ
    public final void LIZ(View widget) {
        o.LJIIIZ(widget, "widget");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds) {
        o.LJIIIZ(ds, "ds");
    }

    public CV0(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.LJLJJL = interfaceC65784Pro;
    }

    @Override // X.C6L
    public final void LIZIZ(View widget) {
        o.LJIIIZ(widget, "widget");
        this.LJLJJL.invoke();
    }
}
