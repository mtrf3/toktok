package X;

import android.animation.Animator;
import com.ss.android.ugc.aweme.profile.widgets.cta.base.ProfileCTAAbility;
import kotlin.jvm.internal.o;

/* renamed from: X.Mgy, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57468Mgy implements Animator.AnimatorListener {
    public final /* synthetic */ C57465Mgv LJLIL;
    public final /* synthetic */ String LJLILLLLZI;

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
        if (C57469Mgz.LIZJ()) {
            ProfileCTAAbility profileCTAAbility = this.LJLIL.LIZJ;
            if (profileCTAAbility != null) {
                profileCTAAbility.J00(C9IF.MESSAGE, C9HL.ICON_TEXT);
            }
            C57465Mgv c57465Mgv = this.LJLIL;
            ProfileCTAAbility profileCTAAbility2 = c57465Mgv.LIZJ;
            if (profileCTAAbility2 != null) {
                C9IF c9if = C9IF.MESSAGE;
                C57494MhO c57494MhO = c57465Mgv.LJIIJJI;
                profileCTAAbility2.m00(c9if, c57494MhO.LIZJ, c57494MhO.LIZ, C7MY.LIZIZ(2), O6R.LJJIIZ(C32151Nz.LJIIZILJ(20)));
                return;
            }
            return;
        }
        ProfileCTAAbility profileCTAAbility3 = this.LJLIL.LIZJ;
        if (profileCTAAbility3 != null) {
            profileCTAAbility3.J00(C9IF.MESSAGE, C9HL.TEXT);
        }
        ProfileCTAAbility profileCTAAbility4 = this.LJLIL.LIZJ;
        if (profileCTAAbility4 == null) {
            return;
        }
        profileCTAAbility4.EY(C9IF.MESSAGE, this.LJLILLLLZI);
    }

    public C57468Mgy(C57465Mgv c57465Mgv, String str) {
        this.LJLIL = c57465Mgv;
        this.LJLILLLLZI = str;
    }
}
