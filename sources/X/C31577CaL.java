package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import kotlin.jvm.internal.o;

/* renamed from: X.CaL, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31577CaL extends AnimatorListenerAdapter {
    public final /* synthetic */ InterfaceC31578CaM LJLIL;
    public final /* synthetic */ C31576CaK LJLILLLLZI;
    public final /* synthetic */ float LJLJI;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animation) {
        o.LJIIIZ(animation, "animation");
        InterfaceC31578CaM interfaceC31578CaM = this.LJLIL;
        if (interfaceC31578CaM != null) {
            interfaceC31578CaM.LIZ();
        }
        this.LJLILLLLZI.LJLJJL = this.LJLJI;
    }

    public C31577CaL(InterfaceC31578CaM interfaceC31578CaM, C31576CaK c31576CaK, float f) {
        this.LJLIL = interfaceC31578CaM;
        this.LJLILLLLZI = c31576CaK;
        this.LJLJI = f;
    }
}
