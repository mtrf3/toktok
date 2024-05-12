package X;

import android.text.TextPaint;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.MqT, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58057MqT extends AnonymousClass899 {
    public final /* synthetic */ C58053MqP LJLIL;
    public final /* synthetic */ int LJLILLLLZI;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View widget) {
        o.LJIIIZ(widget, "widget");
        try {
            InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns = this.LJLIL.LJIIIIZZ;
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(Integer.valueOf(this.LJLILLLLZI));
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds) {
        o.LJIIIZ(ds, "ds");
        ds.setUnderlineText(false);
    }

    public C58057MqT(C58053MqP c58053MqP, int i) {
        this.LJLIL = c58053MqP;
        this.LJLILLLLZI = i;
    }
}
