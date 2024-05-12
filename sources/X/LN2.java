package X;

import Y.IDgS138S0200000_9;
import kotlin.jvm.internal.o;

@InterfaceC55642Lsc("profile_login_sign_up")
/* loaded from: classes10.dex */
public final class LN2 extends M71 {
    public final ActivityC45651qj LJLIL;

    @Override // X.InterfaceC56321M8n
    public final int getPriority() {
        return 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LN2(InterfaceC56322M8o scene, ActivityC45651qj activity) {
        super(scene);
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(activity, "activity");
        this.LJLIL = activity;
    }

    @Override // X.M72
    public final void LIZLLL(C54082LKk context, M78 wrapper) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(wrapper, "wrapper");
        if (!((RBX) HG3.LJIILL()).isLogin()) {
            J9P.LIZIZ(this.LJLIL, "personal_homepage", "click_mine", null, new IDgS138S0200000_9(this, wrapper, 0));
            C46340IGq.LIZ("personal_homepage", "click_mine");
        }
    }
}
