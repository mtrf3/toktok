package X;

import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class O6K extends O6R {
    public final /* synthetic */ InterfaceC60761Nsz LJLJJI;

    public O6K(InterfaceC60761Nsz interfaceC60761Nsz) {
        this.LJLJJI = interfaceC60761Nsz;
    }

    @Override // X.O6R
    public final void LJJ(String bridgeName, String str, C37945Eur c37945Eur) {
        o.LJIIIZ(bridgeName, "bridgeName");
        Object obj = this.LJLJJI;
        o.LJII(obj, "null cannot be cast to non-null type com.lynx.tasm.LynxView");
        VNS vns = (VNS) obj;
        vns.addLynxViewClient(new O6L(vns));
    }
}
