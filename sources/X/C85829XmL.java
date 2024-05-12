package X;

import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import yq4.a;

/* renamed from: X.XmL, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85829XmL extends AbstractC188397aN {
    public final /* synthetic */ TextView LJLJJI;
    public final /* synthetic */ SpannableStringBuilder LJLJJL;
    public final /* synthetic */ String[] LJLJJLL;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        if (ActivityStack.getTopActivity() != null) {
            C198517qh c198517qh = new C198517qh();
            c198517qh.LIZ.put("enter_from", "signup_login_page");
            FMX.LJIILJJIL("account_region_status_click", c198517qh.LJ());
            a.LIZ.getClass();
            a.LJIIIIZZ().LIZ(ActivityStack.getTopActivity(), new C85830XmM(this, view));
        }
    }

    @Override // X.AbstractC188397aN, android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C85829XmL(int i, int i2, TuxTextView tuxTextView, SpannableStringBuilder spannableStringBuilder, String[] strArr) {
        super(i, i2);
        this.LJLJJI = tuxTextView;
        this.LJLJJL = spannableStringBuilder;
        this.LJLJJLL = strArr;
    }
}
