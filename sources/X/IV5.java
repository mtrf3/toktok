package X;

import Y.ARunnableS12S0101000_8;
import Y.IDRunnableS6S0101000;
import android.os.Handler;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class IV5 extends IUG {
    public final Handler LIZLLL;

    @Override // X.IUE, X.InterfaceC46645ISj
    public final void LJJJLIIL() {
        this.LIZLLL.post(new HZE(4, this));
    }

    @Override // X.IUE, X.InterfaceC46645ISj
    public final void LJJJZ() {
        this.LIZLLL.post(new IDRunnableS6S0101000(7, this, 23));
    }

    public static void LJIIZILJ(IV5 this$0) {
        o.LJIIIZ(this$0, "this$0");
        super.LJJJLIIL();
    }

    public static void LJIJI(IV5 this$0) {
        o.LJIIIZ(this$0, "this$0");
        super.LJJJZ();
    }

    @Override // X.IUE, X.InterfaceC46645ISj
    public final void LJJJLZIJ(int i) {
        this.LIZLLL.post(new ARunnableS12S0101000_8(i, this, 38));
    }

    public static void LJIJ(IV5 this$0, int i) {
        o.LJIIIZ(this$0, "this$0");
        super.LJJJLZIJ(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IV5(InterfaceC46747IWh interfaceC46747IWh, C46748IWi simPlayer, IUF iuf, Handler workHandler) {
        super(interfaceC46747IWh, simPlayer, iuf);
        o.LJIIIZ(simPlayer, "simPlayer");
        o.LJIIIZ(workHandler, "workHandler");
        this.LIZLLL = workHandler;
    }
}
