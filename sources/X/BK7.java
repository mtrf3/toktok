package X;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.android.live.browser.IBrowserService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BK7 extends ClickableSpan {
    public final String LJLIL;
    public final Context LJLILLLLZI;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View widget) {
        o.LJIIIZ(widget, "widget");
        ((IBrowserService) CN1.LIZ(IBrowserService.class)).Lu();
        C30882CAc.LJII(this.LJLILLLLZI, new C28871BUt(this.LJLIL));
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds) {
        o.LJIIIZ(ds, "ds");
        super.updateDrawState(ds);
        ds.setColor(C15380j0.LIZIZ(R.color.a7f));
        ds.setUnderlineText(false);
        ds.setFakeBoldText(true);
    }

    public BK7(String str, Context context) {
        this.LJLIL = str;
        this.LJLILLLLZI = context;
    }
}
