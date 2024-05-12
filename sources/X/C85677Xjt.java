package X;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Xjt, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85677Xjt extends AbstractC188397aN {
    public final /* synthetic */ Integer LJLJJI;
    public final /* synthetic */ Context LJLJJL;
    public final /* synthetic */ View.OnClickListener LJLJJLL;
    public final /* synthetic */ Integer LJLJL;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        if (this.LJLJJI.intValue() == 4) {
            Context context = this.LJLJJL;
            SmartRoute buildRoute = SmartRouter.buildRoute(context, "aweme://webview");
            UZF.LIZ.getClass();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("https://support.tiktok.com/");
            LIZ.append(UZF.LIZ());
            LIZ.append("/account-and-privacy/personalized-ads-and-data/how-your-phone-number-is-used-on-tiktok#3");
            buildRoute.withParam("url", X1D.LIZIZ(LIZ));
            buildRoute.withParam("title", context.getString(R.string.c2h));
            buildRoute.withParam("show_separate_line", true);
            buildRoute.withParam("use_spark", true);
            buildRoute.open();
        } else {
            V1B.LJLJJL(DialogC81625W1t.LIZ(this.LJLJJL));
        }
        View.OnClickListener onClickListener = this.LJLJJLL;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    @Override // X.AbstractC188397aN, android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setTypeface(C85837XmT.LJ());
        boolean z = true;
        if (this.LJLJL.intValue() != 1) {
            z = false;
        }
        textPaint.setUnderlineText(z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85677Xjt(int i, int i2, Integer num, Context context, View.OnClickListener onClickListener, Integer num2) {
        super(i, i2);
        this.LJLJJI = num;
        this.LJLJJL = context;
        this.LJLJJLL = onClickListener;
        this.LJLJL = num2;
    }
}
