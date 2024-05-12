package X;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class G8D implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ ArgbEvaluator LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ SpannableString LJLJJI;
    public final /* synthetic */ C40984G6q LJLJJL;

    public G8D(int i, ArgbEvaluator argbEvaluator, int i2, SpannableString spannableString, C40984G6q c40984G6q) {
        this.LJLIL = i;
        this.LJLILLLLZI = argbEvaluator;
        this.LJLJI = i2;
        this.LJLJJI = spannableString;
        this.LJLJJL = c40984G6q;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int intValue;
        float floatValue = ((Float) C264612c.LIZ(valueAnimator, "it", "null cannot be cast to non-null type kotlin.Float")).floatValue();
        if (floatValue <= 2000.0f) {
            intValue = this.LJLIL;
        } else if (floatValue > 2000.0f && floatValue <= 2200.0f) {
            Object evaluate = this.LJLILLLLZI.evaluate((floatValue / 200.0f) - 10.0f, Integer.valueOf(this.LJLIL), Integer.valueOf(this.LJLJI));
            o.LJII(evaluate, "null cannot be cast to non-null type kotlin.Int");
            intValue = ((Integer) evaluate).intValue();
        } else if (floatValue > 2200.0f && floatValue <= 5200.0f) {
            intValue = this.LJLJI;
        } else {
            Object evaluate2 = this.LJLILLLLZI.evaluate((floatValue / 200.0f) - 26.0f, Integer.valueOf(this.LJLJI), Integer.valueOf(this.LJLIL));
            o.LJII(evaluate2, "null cannot be cast to non-null type kotlin.Int");
            intValue = ((Integer) evaluate2).intValue();
        }
        this.LJLJJI.setSpan(new ForegroundColorSpan(intValue), 0, this.LJLJJI.length(), 33);
        AI8 ai8 = this.LJLJJL.LJIILJJIL;
        if (ai8 == null) {
            return;
        }
        ai8.setSubtitle(this.LJLJJI);
    }
}
