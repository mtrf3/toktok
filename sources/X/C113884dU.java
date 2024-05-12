package X;

import android.view.View;
import kotlin.jvm.internal.AqS151S0100000_1;
import kotlin.jvm.internal.o;

/* renamed from: X.4dU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C113884dU extends AbstractC13940gg {
    public InterfaceC65784Pro<String> LJ = new AqS151S0100000_1(this, 859);
    public final C113874dT LJFF = new InterfaceC19530ph() { // from class: X.4dT
        @Override // X.InterfaceC19530ph
        public final void LIZ(View view, String itemID) {
            o.LJIIIZ(itemID, "itemID");
            C62468OfQ.LIZ(C113884dU.this.LJIIIIZZ.LJLJI);
        }
    };
    public final int LJI = 100;
    public final float LJII = 0.1f;
    public final /* synthetic */ C113864dS LJIIIIZZ;

    @Override // X.AbstractC13940gg
    public final int LIZIZ() {
        return this.LJI;
    }

    @Override // X.AbstractC13940gg
    public final InterfaceC65784Pro<String> LIZJ() {
        return this.LJ;
    }

    @Override // X.AbstractC13940gg
    public final /* bridge */ /* synthetic */ InterfaceC19530ph LJ() {
        return this.LJFF;
    }

    @Override // X.AbstractC13940gg
    public final float LJIIIZ() {
        return this.LJII;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.4dT] */
    public C113884dU(C113864dS c113864dS) {
        this.LJIIIIZZ = c113864dS;
    }

    @Override // X.AbstractC13940gg
    public final void LJIIJJI(InterfaceC65784Pro<String> interfaceC65784Pro) {
        this.LJ = interfaceC65784Pro;
    }
}
