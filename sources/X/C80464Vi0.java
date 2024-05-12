package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: X.Vi0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80464Vi0 extends AnimatorListenerAdapter {
    public boolean LJLIL;
    public final /* synthetic */ AnonymousClass191 LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ C80463Vhz LJLJJL;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.LJLIL = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        boolean z;
        if (!this.LJLIL) {
            C80463Vhz c80463Vhz = this.LJLJJL;
            int i = c80463Vhz.LLILZ;
            if (i != 0) {
                z = true;
                c80463Vhz.LLILZ = 0;
                c80463Vhz.getMenu().clear();
                c80463Vhz.LJIIJ(i);
            } else {
                z = false;
            }
            this.LJLJJL.LJIJJLI(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, z);
        }
    }

    public C80464Vi0(C80463Vhz c80463Vhz, AnonymousClass191 anonymousClass191, int i, boolean z) {
        this.LJLJJL = c80463Vhz;
        this.LJLILLLLZI = anonymousClass191;
        this.LJLJI = i;
        this.LJLJJI = z;
    }
}
