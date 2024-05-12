package X;

import android.text.TextPaint;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.C6h, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30783C6h extends C6L {
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJLL;

    @Override // X.C8FQ
    public final void LIZ(View view) {
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLJJLL;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    @Override // X.C6L
    public final void LIZIZ(View widget) {
        o.LJIIIZ(widget, "widget");
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLJJL;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds) {
        o.LJIIIZ(ds, "ds");
        super.updateDrawState(ds);
        ds.setUnderlineText(false);
    }

    public C30783C6h(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2) {
        this.LJLJJL = interfaceC65784Pro;
        this.LJLJJLL = interfaceC65784Pro2;
    }
}
