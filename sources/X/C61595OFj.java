package X;

import android.animation.Animator;
import android.view.View;
import com.ss.android.ugc.aweme.base.ui.bottom.banner.FeedBottomBannerView;
import kotlin.jvm.internal.o;

/* renamed from: X.OFj, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61595OFj implements Animator.AnimatorListener {
    public final /* synthetic */ OM7 LJLIL;
    public final /* synthetic */ C59091NHb LJLILLLLZI;
    public final /* synthetic */ View LJLJI;
    public final /* synthetic */ FeedBottomBannerView LJLJJI;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        o.LJIIIZ(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        o.LJIIIZ(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        o.LJIIIZ(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        o.LJIIIZ(animator, "animator");
        if (((C61593OFh) this.LJLIL).LIZ.size() == 2) {
            InterfaceC88472Yns<View, C76800UCe> interfaceC88472Yns = this.LJLILLLLZI.LIZLLL;
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(this.LJLJI);
                return;
            }
            return;
        }
        InterfaceC88472Yns<View, C76800UCe> interfaceC88472Yns2 = this.LJLILLLLZI.LIZLLL;
        if (interfaceC88472Yns2 != null) {
            interfaceC88472Yns2.invoke(this.LJLJI);
        }
        this.LJLJJI.performClick();
    }

    public C61595OFj(OM7 om7, C59091NHb c59091NHb, View view, FeedBottomBannerView feedBottomBannerView) {
        this.LJLIL = om7;
        this.LJLILLLLZI = c59091NHb;
        this.LJLJI = view;
        this.LJLJJI = feedBottomBannerView;
    }
}
