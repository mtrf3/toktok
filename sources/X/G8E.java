package X;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class G8E implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ ArgbEvaluator LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ SpannableString LJLJJL;
    public final /* synthetic */ SpannableString LJLJJLL;
    public final /* synthetic */ C40984G6q LJLJL;

    public G8E(int i, ArgbEvaluator argbEvaluator, int i2, int i3, SpannableString spannableString, SpannableString spannableString2, C40984G6q c40984G6q) {
        this.LJLIL = i;
        this.LJLILLLLZI = argbEvaluator;
        this.LJLJI = i2;
        this.LJLJJI = i3;
        this.LJLJJL = spannableString;
        this.LJLJJLL = spannableString2;
        this.LJLJL = c40984G6q;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int intValue;
        SpannableString spannableString;
        float floatValue = ((Float) C264612c.LIZ(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        if (floatValue <= 3000.0f) {
            intValue = this.LJLIL;
        } else if (floatValue > 3000.0f && floatValue <= 3300.0f) {
            Object evaluate = this.LJLILLLLZI.evaluate((floatValue - 3000) / 300.0f, Integer.valueOf(this.LJLIL), Integer.valueOf(this.LJLJI));
            o.LJII(evaluate, "null cannot be cast to non-null type kotlin.Int");
            intValue = ((Integer) evaluate).intValue();
        } else {
            Object evaluate2 = this.LJLILLLLZI.evaluate((floatValue - 3300) / 300.0f, Integer.valueOf(this.LJLJI), Integer.valueOf(this.LJLJJI));
            o.LJII(evaluate2, "null cannot be cast to non-null type kotlin.Int");
            intValue = ((Integer) evaluate2).intValue();
        }
        this.LJLJJL.setSpan(new ForegroundColorSpan(intValue), 0, this.LJLJJL.length(), 33);
        this.LJLJJLL.setSpan(new ForegroundColorSpan(intValue), 0, this.LJLJJLL.length(), 33);
        AI8 ai8 = this.LJLJL.LJIILJJIL;
        if (ai8 == null) {
            return;
        }
        if (floatValue < 3300.0f) {
            spannableString = this.LJLJJL;
        } else {
            spannableString = this.LJLJJLL;
        }
        ai8.setSubtitle(spannableString);
    }
}
