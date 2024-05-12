package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import kotlin.jvm.internal.AqS80S1100000_13;
import kotlin.jvm.internal.o;

/* renamed from: X.Uj5, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77983Uj5 extends ClickableSpan {
    public final InterfaceC65784Pro<C76800UCe> LJLIL;

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds) {
        o.LJIIIZ(ds, "ds");
    }

    public C77983Uj5(AqS80S1100000_13 aqS80S1100000_13) {
        this.LJLIL = aqS80S1100000_13;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View widget) {
        o.LJIIIZ(widget, "widget");
        this.LJLIL.invoke();
    }
}
