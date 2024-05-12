package X;

import kotlin.jvm.internal.o;

/* renamed from: X.aji, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94606aji extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ C94140acC LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ C76732zl LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94606aji(C94140acC c94140acC, boolean z, C76732zl c76732zl) {
        super(0);
        this.LJLIL = c94140acC;
        this.LJLILLLLZI = z;
        this.LJLJI = c76732zl;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        C94338afO c94338afO;
        C94613ajp c94613ajp;
        AbstractC029409q adapter;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("animation100:");
        LIZ.append(this.LJLILLLLZI);
        C94034aaU.LIZ("CanvasFragment", X1D.LIZIZ(LIZ));
        ActivityC45651qj requireActivity = this.LJLIL.LIZ.requireActivity();
        o.LJIIIIZZ(requireActivity, "requireActivity()");
        if (!requireActivity.isDestroyed()) {
            ActivityC45651qj requireActivity2 = this.LJLIL.LIZ.requireActivity();
            o.LJIIIIZZ(requireActivity2, "requireActivity()");
            if (!requireActivity2.isFinishing() && (c94338afO = this.LJLIL.LIZ.LJLILLLLZI) != null && (c94613ajp = c94338afO.LJLJI) != null && (adapter = c94613ajp.getAdapter()) != null) {
                adapter.notifyItemChanged(this.LJLJI.element);
            }
        }
        return C76800UCe.LIZ;
    }
}
