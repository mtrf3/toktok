package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.Xmw, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85866Xmw<T> implements InterfaceC15040iS {
    public final /* synthetic */ boolean LIZ;
    public final /* synthetic */ C85865Xmv LIZIZ;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LIZJ;

    public C85866Xmw(boolean z, C85865Xmv c85865Xmv, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.LIZ = z;
        this.LIZIZ = c85865Xmv;
        this.LIZJ = interfaceC65784Pro;
    }

    @Override // X.InterfaceC15040iS
    public final void accept(Object obj) {
        if (this.LIZ) {
            View view = this.LIZIZ.LJLJJI;
            if (view != null) {
                view.setVisibility(0);
                View view2 = this.LIZIZ.LJLJI;
                if (view2 != null) {
                    view2.setVisibility(0);
                } else {
                    o.LJIJI("cancelBtn");
                    throw null;
                }
            } else {
                o.LJIJI("saveBtn");
                throw null;
            }
        }
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LIZJ;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }
}
