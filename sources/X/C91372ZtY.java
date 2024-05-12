package X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.widget.TextView;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.ZtY, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91372ZtY extends C91165ZqD {
    public final float LLD;
    public final /* synthetic */ C91171ZqJ LLF;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C91372ZtY(C91171ZqJ c91171ZqJ, Context context) {
        super(c91171ZqJ, context);
        this.LLF = c91171ZqJ;
        new LinkedHashMap();
        this.LLD = 0.6f;
        new AnimatorSet();
        c91171ZqJ.LJLLI.add(new C91371ZtX(this, c91171ZqJ));
    }

    public final void LIZJ(C91169ZqH c91169ZqH, boolean z) {
        C91170ZqI c91170ZqI;
        TextView mCustomTextView$music_dsp_release;
        float f;
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2 = null;
        if (c91169ZqH != null && (c91170ZqI = c91169ZqH.LIZLLL) != null && (mCustomTextView$music_dsp_release = c91170ZqI.getMCustomTextView$music_dsp_release()) != null) {
            float f2 = 1.0f;
            if (!z) {
                if (this.LLF.getEnableAnimation()) {
                    objectAnimator2 = ObjectAnimator.ofFloat(mCustomTextView$music_dsp_release, "scaleX", mCustomTextView$music_dsp_release.getScaleX(), 1.25f, 1.125f).setDuration(300L);
                    objectAnimator2.setInterpolator(C91166ZqE.LIZ);
                    objectAnimator = ObjectAnimator.ofFloat(mCustomTextView$music_dsp_release, "scaleY", mCustomTextView$music_dsp_release.getScaleY(), 1.25f, 1.125f).setDuration(300L);
                    objectAnimator.setInterpolator(C91167ZqF.LIZ);
                } else {
                    objectAnimator = null;
                }
                f2 = 1.125f;
                f = 1.0f;
            } else {
                f = 0.6f;
                if (this.LLF.getEnableAnimation()) {
                    objectAnimator2 = ObjectAnimator.ofFloat(mCustomTextView$music_dsp_release, "scaleX", mCustomTextView$music_dsp_release.getScaleX(), 1.0f).setDuration(200L);
                    objectAnimator = ObjectAnimator.ofFloat(mCustomTextView$music_dsp_release, "scaleY", mCustomTextView$music_dsp_release.getScaleY(), 1.0f).setDuration(200L);
                } else {
                    objectAnimator = null;
                }
            }
            if (this.LLF.getEnableAnimation()) {
                ObjectAnimator duration = ObjectAnimator.ofFloat(mCustomTextView$music_dsp_release, "alpha", mCustomTextView$music_dsp_release.getAlpha(), f).setDuration(200L);
                o.LJIIIIZZ(duration, "ofFloat(textView, \"alpha…        .setDuration(200)");
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(duration, objectAnimator2, objectAnimator);
                animatorSet.start();
                return;
            }
            mCustomTextView$music_dsp_release.setScaleX(f2);
            mCustomTextView$music_dsp_release.setScaleY(f2);
            mCustomTextView$music_dsp_release.setAlpha(f);
        }
    }
}
