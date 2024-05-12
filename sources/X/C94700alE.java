package X;

import android.view.View;
import kotlin.jvm.internal.IDqS423S0100000_42;

/* renamed from: X.alE, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94700alE extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ C93913aYX LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI = false;
    public final /* synthetic */ InterfaceC93911aYV LJLJI;
    public final /* synthetic */ View LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94700alE(C93913aYX c93913aYX, C94420agi c94420agi, View view) {
        super(0);
        this.LJLIL = c93913aYX;
        this.LJLJI = c94420agi;
        this.LJLJJI = view;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        if (this.LJLILLLLZI) {
            InterfaceC93911aYV interfaceC93911aYV = this.LJLJI;
            if (interfaceC93911aYV != null) {
                interfaceC93911aYV.LIZIZ(null);
            }
            C93912aYW c93912aYW = this.LJLIL.LIZ;
            View view = this.LJLJJI;
            IDqS423S0100000_42 iDqS423S0100000_42 = new IDqS423S0100000_42(this, 139);
            c93912aYW.getClass();
            C93912aYW.LIZ(view, iDqS423S0100000_42);
        } else {
            InterfaceC93911aYV interfaceC93911aYV2 = this.LJLJI;
            if (interfaceC93911aYV2 != null) {
                interfaceC93911aYV2.LIZIZ(new C93909aYT(new IDqS423S0100000_42(this, 141)));
            }
        }
        return C76800UCe.LIZ;
    }
}
