package X;

import Y.IDAListenerS69S0100000;
import android.animation.Animator;
import android.view.View;
import java.util.List;

/* renamed from: X.1s7, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C46511s7 extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ C04590Fz LJLIL;
    public final /* synthetic */ View LJLILLLLZI;
    public final /* synthetic */ View LJLJI;
    public final /* synthetic */ List<String> LJLJJI;
    public final /* synthetic */ long LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46511s7(C04590Fz c04590Fz, View view, View view2, List<String> list, long j) {
        super(0);
        this.LJLIL = c04590Fz;
        this.LJLILLLLZI = view;
        this.LJLJI = view2;
        this.LJLJJI = list;
        this.LJLJJL = j;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        C04590Fz c04590Fz = this.LJLIL;
        Animator LIZJ = c04590Fz.LIZJ(this.LJLILLLLZI, c04590Fz.LIZLLL, this.LJLJI, this.LJLJJL);
        if (LIZJ != null) {
            LIZJ.addListener(new IDAListenerS69S0100000(this.LJLIL, 0));
        } else {
            LIZJ = null;
        }
        c04590Fz.LJII = LIZJ;
        this.LJLIL.LJFF = null;
        return C76800UCe.LIZ;
    }
}
