package X;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.7Ez, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C182697Ez extends ClickableSpan {
    public final InterfaceC65784Pro<C76800UCe> LJLIL;
    public final Context LJLILLLLZI;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View widget) {
        o.LJIIIZ(widget, "widget");
        this.LJLIL.invoke();
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds) {
        o.LJIIIZ(ds, "ds");
        super.updateDrawState(ds);
        Context context = this.LJLILLLLZI;
        if (context != null) {
            ds.setColor(context.getResources().getColor(R.color.c0));
            ds.setUnderlineText(false);
        }
    }

    public C182697Ez(Context context, InterfaceC65784Pro interfaceC65784Pro) {
        this.LJLIL = interfaceC65784Pro;
        this.LJLILLLLZI = context;
    }
}
