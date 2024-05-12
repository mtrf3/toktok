package X;

import android.animation.ValueAnimator;
import com.bytedance.android.livesdk.chatroom.ui.LiveEmojiInputDialogFragment;

/* loaded from: classes6.dex */
public final class CIC implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ LiveEmojiInputDialogFragment LJLJI;

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float f = this.LJLIL;
        float LIZIZ = C06420Na.LIZIZ(-this.LJLILLLLZI, f, floatValue, f);
        this.LJLJI.LLIIII.setTranslationY(LIZIZ);
        this.LJLJI.LLIIIZ.setTranslationY(LIZIZ);
    }

    public CIC(LiveEmojiInputDialogFragment liveEmojiInputDialogFragment, float f, int i) {
        this.LJLJI = liveEmojiInputDialogFragment;
        this.LJLIL = f;
        this.LJLILLLLZI = i;
    }
}
