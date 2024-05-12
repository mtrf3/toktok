package X;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.livesdk.impl.revenue.starcomment.paymentdialog.StarCommentPaymentDialog;
import com.bytedance.android.livesdk.livesetting.starcomment.LiveStarCommentSchemaConfig;
import kotlin.jvm.internal.o;

/* renamed from: X.BJy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28590BJy extends ClickableSpan {
    public final /* synthetic */ C72242sW LJLIL;
    public final /* synthetic */ StarCommentPaymentDialog LJLILLLLZI;
    public final /* synthetic */ Context LJLJI;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View widget) {
        int i;
        o.LJIIIZ(widget, "widget");
        if (Math.abs(this.LJLIL.element - System.currentTimeMillis()) < 1000) {
            return;
        }
        this.LJLIL.element = System.currentTimeMillis();
        C32364Cn2 c32364Cn2 = new C32364Cn2(LiveStarCommentSchemaConfig.INSTANCE.getSettingValue().bubblePageFaq);
        View view = this.LJLILLLLZI.LLD;
        if (view != null) {
            i = view.getHeight();
        } else {
            i = 505;
        }
        c32364Cn2.LIZJ("height", String.valueOf((int) C15380j0.LJIJ(i)));
        Context context = this.LJLJI;
        if (context != null) {
            ((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).handle(context, c32364Cn2.LIZLLL());
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds) {
        o.LJIIIZ(ds, "ds");
        super.updateDrawState(ds);
        ds.setUnderlineText(false);
    }

    public C28590BJy(C72242sW c72242sW, StarCommentPaymentDialog starCommentPaymentDialog, Context context) {
        this.LJLIL = c72242sW;
        this.LJLILLLLZI = starCommentPaymentDialog;
        this.LJLJI = context;
    }
}
