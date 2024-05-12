package X;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import defpackage.g0;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BUU extends ClickableSpan {
    public final /* synthetic */ Context LJLIL;
    public final /* synthetic */ DataChannel LJLILLLLZI;
    public final /* synthetic */ String LJLJI;

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds) {
        o.LJIIIZ(ds, "ds");
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View widget) {
        o.LJIIIZ(widget, "widget");
        ActivityC45651qj LJIILL = g0.LJIILL(this.LJLIL);
        if (LJIILL != null) {
            DataChannel dataChannel = this.LJLILLLLZI;
            String mode = this.LJLJI;
            o.LJIIIIZZ(mode, "mode");
            C28559BIt.LIZLLL(dataChannel, mode, LJIILL);
        }
        DataChannel dataChannel2 = this.LJLILLLLZI;
        String mode2 = this.LJLJI;
        o.LJIIIIZZ(mode2, "mode");
        C28559BIt.LIZ(dataChannel2, mode2);
    }

    public BUU(Context context, DataChannel dataChannel, String str) {
        this.LJLIL = context;
        this.LJLILLLLZI = dataChannel;
        this.LJLJI = str;
    }
}
