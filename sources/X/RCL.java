package X;

import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class RCL<T> implements InterfaceC64592gB {
    public final /* synthetic */ ActivityC45651qj LJLIL;
    public final /* synthetic */ int LJLILLLLZI;

    public RCL(int i, ActivityC45651qj activityC45651qj) {
        this.LJLIL = activityC45651qj;
        this.LJLILLLLZI = i;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        ActivityC45651qj activityC45651qj = this.LJLIL;
        int i = this.LJLILLLLZI;
        if (RCN.LIZ == null) {
            RCN.LIZ = new R7H(activityC45651qj);
        }
        R7H r7h = RCN.LIZ;
        if (r7h != null) {
            r7h.LJJIII("normal", new RCM(i, activityC45651qj));
        } else {
            o.LJIJI("accountApi");
            throw null;
        }
    }
}
