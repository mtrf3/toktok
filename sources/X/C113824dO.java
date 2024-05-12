package X;

import android.view.View;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.4dO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C113824dO extends AbstractC13940gg {
    public InterfaceC65784Pro<String> LJ = new AqS151S0100000_1(this, 860);
    public final C113834dP LJFF = new InterfaceC19530ph() { // from class: X.4dP
        @Override // X.InterfaceC19530ph
        public final void LIZ(View view, String itemID) {
            o.LJIIIZ(itemID, "itemID");
            C62468OfQ.LIZ(C113824dO.this.LJI.LJLJI);
        }
    };
    public final /* synthetic */ C113804dM LJI;

    @Override // X.AbstractC13940gg
    public final InterfaceC65784Pro<String> LIZJ() {
        return this.LJ;
    }

    @Override // X.AbstractC13940gg
    public final /* bridge */ /* synthetic */ InterfaceC19530ph LJ() {
        return this.LJFF;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.4dP] */
    public C113824dO(C113804dM c113804dM) {
        this.LJI = c113804dM;
    }

    @Override // X.AbstractC13940gg
    public final void LJIIJJI(InterfaceC65784Pro<String> interfaceC65784Pro) {
        this.LJ = interfaceC65784Pro;
    }
}
