package X;

import Y.ALAdapterS3S0100000_4;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.LyE, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55990LyE extends FrameLayout {
    public EnumC55993LyH LJLIL;
    public final C5CR LJLILLLLZI;
    public final C5CQ LJLJI;
    public AnimatorSet LJLJJI;
    public AnimatorSet LJLJJL;

    public final void LIZIZ() {
        AnimatorSet animatorSet = this.LJLJJI;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = this.LJLJJL;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        int i = C55992LyG.LIZ[this.LJLIL.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                this.LJLILLLLZI.setVisibility(0);
                AnimatorSet animatorSet3 = this.LJLJJI;
                if (animatorSet3 != null) {
                    animatorSet3.cancel();
                }
                AnimatorSet LIZ = LIZ(-10.0f, this.LJLILLLLZI);
                this.LJLJJI = LIZ;
                LIZ.start();
                this.LJLJI.setVisibility(0);
                AnimatorSet animatorSet4 = this.LJLJJL;
                if (animatorSet4 != null) {
                    animatorSet4.cancel();
                }
                AnimatorSet LIZ2 = LIZ(10.0f, this.LJLJI);
                this.LJLJJL = LIZ2;
                LIZ2.start();
                return;
            }
            this.LJLJI.setVisibility(0);
            AnimatorSet animatorSet5 = this.LJLJJL;
            if (animatorSet5 != null) {
                animatorSet5.cancel();
            }
            AnimatorSet LIZ3 = LIZ(10.0f, this.LJLJI);
            this.LJLJJL = LIZ3;
            LIZ3.start();
            return;
        }
        this.LJLILLLLZI.setVisibility(0);
        AnimatorSet animatorSet6 = this.LJLJJI;
        if (animatorSet6 != null) {
            animatorSet6.cancel();
        }
        AnimatorSet LIZ4 = LIZ(-10.0f, this.LJLILLLLZI);
        this.LJLJJI = LIZ4;
        LIZ4.start();
    }

    public final void setRippleType(EnumC55993LyH type) {
        o.LJIIIZ(type, "type");
        this.LJLIL = type;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55990LyE(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLIL = EnumC55993LyH.NONE_RIPPLE;
        C5CR c5cr = new C5CR(context, null, 6);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 8388611;
        c5cr.setLayoutParams(layoutParams);
        c5cr.setVisibility(8);
        this.LJLILLLLZI = c5cr;
        C5CQ c5cq = new C5CQ(context, null, 6);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.gravity = 8388613;
        c5cq.setLayoutParams(layoutParams2);
        c5cq.setVisibility(8);
        this.LJLJI = c5cq;
        addView(c5cr);
        addView(c5cq);
    }

    public static AnimatorSet LIZ(float f, View view) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "translationX", f, 0.0f);
        AnimatorSet LIZ = C1DD.LIZ(600L);
        LIZ.setInterpolator(new SJM());
        LIZ.playTogether(ofFloat, ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view, "translationX", 0.0f, f);
        AnimatorSet LIZ2 = C1DD.LIZ(600L);
        LIZ2.setInterpolator(new SJJ());
        LIZ2.playTogether(ofFloat3, ofFloat4);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.addListener(new ALAdapterS3S0100000_4(view, 0));
        animatorSet.play(LIZ2).after(LIZ);
        return animatorSet;
    }
}
