package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;

/* renamed from: X.Vfe, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80318Vfe extends AnimatorListenerAdapter {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ TextView LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ TextView LJLJJI;
    public final /* synthetic */ C80316Vfc LJLJJL;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        AppCompatTextView appCompatTextView;
        C80316Vfc c80316Vfc = this.LJLJJL;
        c80316Vfc.LJII = this.LJLIL;
        c80316Vfc.LJFF = null;
        TextView textView = this.LJLILLLLZI;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.LJLJI == 1 && (appCompatTextView = this.LJLJJL.LJIIJJI) != null) {
                appCompatTextView.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.LJLJJI;
        if (textView2 != null) {
            textView2.setTranslationY(0.0f);
            this.LJLJJI.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.LJLJJI;
        if (textView != null) {
            textView.setVisibility(0);
        }
    }

    public C80318Vfe(C80316Vfc c80316Vfc, int i, TextView textView, int i2, TextView textView2) {
        this.LJLJJL = c80316Vfc;
        this.LJLIL = i;
        this.LJLILLLLZI = textView;
        this.LJLJI = i2;
        this.LJLJJI = textView2;
    }
}
