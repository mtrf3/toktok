package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.dsp.playpage.pageitem.v2.audio.collect.CollectAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.ZrI, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91232ZrI extends AnimatorListenerAdapter {
    public final /* synthetic */ CollectAssem LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        o.LJIIIZ(animation, "animation");
        this.LJLIL.l4(this.LJLILLLLZI);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animation) {
        o.LJIIIZ(animation, "animation");
        TuxIconView tuxIconView = this.LJLIL.LLIFFJFJJ;
        if (tuxIconView != null) {
            tuxIconView.setVisibility(0);
        }
        TuxIconView tuxIconView2 = this.LJLIL.LLI;
        if (tuxIconView2 == null) {
            return;
        }
        tuxIconView2.setVisibility(0);
    }

    public C91232ZrI(CollectAssem collectAssem, boolean z) {
        this.LJLIL = collectAssem;
        this.LJLILLLLZI = z;
    }
}
