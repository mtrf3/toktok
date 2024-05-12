package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.ss.android.ugc.aweme.app.host.AwemeHostApplication;
import kotlin.jvm.internal.o;

/* renamed from: X.Arv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27571Arv extends ClickableSpan {
    public final /* synthetic */ InterfaceC65784Pro<Object> LJLIL;
    public final /* synthetic */ int LJLILLLLZI;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View widget) {
        o.LJIIIZ(widget, "widget");
        InterfaceC65784Pro<Object> interfaceC65784Pro = this.LJLIL;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds) {
        o.LJIIIZ(ds, "ds");
        ds.setUnderlineText(false);
        AwemeHostApplication LIZ = FKM.LIZ();
        if (LIZ != null) {
            ds.setColor(C04330Ez.LIZIZ(LIZ, this.LJLILLLLZI));
        }
    }

    public C27571Arv(int i, InterfaceC65784Pro interfaceC65784Pro) {
        this.LJLIL = interfaceC65784Pro;
        this.LJLILLLLZI = i;
    }
}
