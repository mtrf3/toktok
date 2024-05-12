package X;

import fjb.a;
import java.util.Iterator;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.newtoolbar.PartitionToolbarScene$dismissInitText$1$1", f = "PartitionToolbarScene.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class WKO extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C82101WKb LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WKO(C82101WKb c82101WKb, InterfaceC67352kd<? super WKO> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c82101WKb;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new WKO(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C82101WKb c82101WKb = this.LJLIL;
        if (c82101WKb.LJLLLLLL == 1) {
            return C76800UCe.LIZ;
        }
        Iterator<WI1> it = c82101WKb.getUiStates().LJ.LIZIZ.LJIIJ().iterator();
        while (it.hasNext()) {
            it.next().LJ = false;
        }
        this.LJLIL.getUiActions().LJLJJL.invoke(Boolean.FALSE);
        this.LJLIL.getUiStates().LJ.LIZIZ.LJIIJJI();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
