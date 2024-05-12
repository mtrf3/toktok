package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import com.ss.android.ugc.aweme.setting.ui.I18nSettingNewVersionFragment;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Xln, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85795Xln implements Animator.AnimatorListener {
    public final /* synthetic */ ValueAnimator LJLIL;
    public final /* synthetic */ ValueAnimator LJLILLLLZI;
    public final /* synthetic */ I18nSettingNewVersionFragment LJLJI;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        Context context = this.LJLJI.getContext();
        if (context != null) {
            this.LJLJI.mCommonProtocolItem.LJIIJJI(C89953fz.LIZ(context));
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.LJLILLLLZI.start();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        Context context = this.LJLJI.getContext();
        if (context != null) {
            this.LJLJI.mCommonProtocolItem.LJIIJJI(new ColorDrawable(C04330Ez.LIZIZ(context, R.color.t2)));
            this.LJLJI.mCurrentAnimator = this.LJLIL;
        }
    }

    public C85795Xln(I18nSettingNewVersionFragment i18nSettingNewVersionFragment, ValueAnimator valueAnimator, ValueAnimator valueAnimator2) {
        this.LJLJI = i18nSettingNewVersionFragment;
        this.LJLIL = valueAnimator;
        this.LJLILLLLZI = valueAnimator2;
    }
}
