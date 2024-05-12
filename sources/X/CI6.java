package X;

import android.animation.ValueAnimator;
import android.widget.LinearLayout;
import com.bytedance.android.livesdk.chatroom.ui.LiveEmojiInputDialogFragment;

/* loaded from: classes6.dex */
public final class CI6 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ LinearLayout.LayoutParams LJLJI;
    public final /* synthetic */ int LJLJJI;
    public final /* synthetic */ int LJLJJL;
    public final /* synthetic */ LiveEmojiInputDialogFragment LJLJJLL;

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float f = this.LJLIL;
        float LIZIZ = C06420Na.LIZIZ(-this.LJLILLLLZI, f, floatValue, f);
        this.LJLJJLL.LLIIII.setTranslationY(LIZIZ);
        this.LJLJJLL.LLIIIZ.setTranslationY(LIZIZ);
        LinearLayout.LayoutParams layoutParams = this.LJLJI;
        layoutParams.width = (int) (((this.LJLJJL - r2) * floatValue) + this.LJLJJI);
        this.LJLJJLL.LLIIIILZ.setLayoutParams(layoutParams);
    }

    public CI6(LiveEmojiInputDialogFragment liveEmojiInputDialogFragment, float f, int i, LinearLayout.LayoutParams layoutParams, int i2, int i3) {
        this.LJLJJLL = liveEmojiInputDialogFragment;
        this.LJLIL = f;
        this.LJLILLLLZI = i;
        this.LJLJI = layoutParams;
        this.LJLJJI = i2;
        this.LJLJJL = i3;
    }
}
