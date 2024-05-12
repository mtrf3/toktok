package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.recommendationcard.data.CardContent;
import com.ss.android.ugc.aweme.recommendationcard.data.EffectStructV2;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KND extends AnimatorListenerAdapter {
    public final /* synthetic */ C51606KNe LJLIL;
    public final /* synthetic */ CardContent LJLILLLLZI;
    public final /* synthetic */ TuxTextView LJLJI;
    public final /* synthetic */ CharSequence LJLJJI;
    public final /* synthetic */ AnimatorSet LJLJJL;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        String str;
        EffectStructV2 effectStructV2;
        o.LJIIIZ(animation, "animation");
        super.onAnimationEnd(animation);
        C51606KNe c51606KNe = this.LJLIL;
        CardContent cardContent = this.LJLILLLLZI;
        if (cardContent != null && (effectStructV2 = cardContent.effect) != null) {
            str = effectStructV2.name;
        } else {
            str = null;
        }
        c51606KNe.setText(str, TextView.BufferType.NORMAL);
        this.LJLJI.setText(this.LJLJJI);
        this.LJLJJL.start();
    }

    public KND(C51606KNe c51606KNe, CardContent cardContent, TuxTextView tuxTextView, CharSequence charSequence, AnimatorSet animatorSet) {
        this.LJLIL = c51606KNe;
        this.LJLILLLLZI = cardContent;
        this.LJLJI = tuxTextView;
        this.LJLJJI = charSequence;
        this.LJLJJL = animatorSet;
    }
}
