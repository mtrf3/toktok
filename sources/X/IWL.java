package X;

import Y.ARunnableS10S0101000_6;
import Y.ARunnableS16S0201000_13;
import Y.ARunnableS8S0201000_5;
import Y.ARunnableS9S0201000_6;
import Y.IDRunnableS6S0101000;
import android.os.Handler;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class IWL extends IWK {
    public final IWK LIZLLL;
    public final Handler LJ;

    @Override // X.IWK, X.InterfaceC229738zx
    public final void LIZIZ() {
        this.LJ.post(new IDRunnableS6S0101000(10, this, 4));
    }

    @Override // X.IWK, X.InterfaceC229738zx
    public final void LIZJ() {
        this.LJ.post(new ARunnableS10S0101000_6(4, this, 9));
    }

    public static void LJFF(IWL this$0) {
        o.LJIIIZ(this$0, "this$0");
        super.LIZIZ();
    }

    public static void LJIIIIZZ(IWL this$0) {
        o.LJIIIZ(this$0, "this$0");
        super.LIZJ();
    }

    @Override // X.IWK, X.InterfaceC229738zx
    public final void LIZ(String str) {
        this.LJ.post(new ARunnableS9S0201000_6(0, this, str, 9));
    }

    @Override // X.IWK, X.InterfaceC229738zx
    public final void LIZLLL(IP0 ip0) {
        this.LJ.post(new ARunnableS8S0201000_5(3, this, ip0, 1));
    }

    @Override // X.IWK, X.InterfaceC229738zx
    public final void LJ(IGM igm) {
        this.LJ.post(new ARunnableS16S0201000_13(3, this, igm, 2));
    }

    public static void LJI(IWL this$0, String str) {
        o.LJIIIZ(this$0, "this$0");
        super.LIZ(str);
        this$0.LIZLLL.LIZ(str);
    }

    @Override // X.IWK, X.InterfaceC229738zx
    public final void setVolume(final float f, final float f2) {
        this.LJ.post(new Runnable() { // from class: X.IWN
            @Override // java.lang.Runnable
            public final void run() {
                IWL.LJII(IWL.this, f, f2);
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IWL(InterfaceC46747IWh interfaceC46747IWh, IWK iwk, Handler workHandler) {
        super(interfaceC46747IWh);
        o.LJIIIZ(workHandler, "workHandler");
        this.LIZLLL = iwk;
        this.LJ = workHandler;
    }

    public static void LJII(IWL this$0, float f, float f2) {
        o.LJIIIZ(this$0, "this$0");
        super.setVolume(f, f2);
    }
}
