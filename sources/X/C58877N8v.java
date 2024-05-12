package X;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import com.ss.android.ugc.aweme.autofill.AdAutofillService;
import com.ss.android.ugc.aweme.autofill.IAdAutofillService;
import kotlin.jvm.internal.o;

/* renamed from: X.N8v, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58877N8v extends AnonymousClass899 {
    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds) {
        o.LJIIIZ(ds, "ds");
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        o.LJIIIZ(view, "view");
        IAdAutofillService LJIIIIZZ = AdAutofillService.LJIIIIZZ();
        Context context = view.getContext();
        o.LJIIIIZZ(context, "view.context");
        LJIIIIZZ.LJII(context);
    }
}
