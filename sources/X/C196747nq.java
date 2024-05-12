package X;

import android.os.Bundle;
import kotlin.jvm.internal.o;

/* renamed from: X.7nq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C196747nq extends C196977oD implements InterfaceC53896LDg {
    public final ActivityC45651qj LJLILLLLZI;
    public final String LJLJI;

    @Override // X.InterfaceC53907LDr
    public final String L6() {
        return "";
    }

    @Override // X.C196977oD, X.InterfaceC197027oI
    public final void onDetach() {
        this.LJLIL = null;
        com.bytedance.hox.Hox.LJLLI.LIZ(this.LJLILLLLZI).zv0(this.LJLJI, this);
    }

    @Override // X.C196977oD, X.InterfaceC197027oI
    public final void LIZ(InterfaceC196737np player) {
        o.LJIIIZ(player, "player");
        this.LJLIL = player;
        com.bytedance.hox.Hox.LJLLI.LIZ(this.LJLILLLLZI).hv0(this.LJLJI, this);
    }

    @Override // X.InterfaceC53896LDg
    public final void LLLLILI(Bundle bundle) {
        InterfaceC196737np interfaceC196737np = this.LJLIL;
        if (interfaceC196737np != null) {
            interfaceC196737np.LJIIJJI(EnumC196787nu.NODE);
        }
    }

    @Override // X.InterfaceC53896LDg
    public final void LLLLLLZ(Bundle args) {
        o.LJIIIZ(args, "args");
        InterfaceC196737np interfaceC196737np = this.LJLIL;
        if (interfaceC196737np != null) {
            interfaceC196737np.LJIILJJIL(EnumC196787nu.NODE);
        }
    }

    public C196747nq(ActivityC45651qj activityC45651qj, String str) {
        this.LJLILLLLZI = activityC45651qj;
        this.LJLJI = str;
    }
}
