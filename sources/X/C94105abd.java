package X;

import com.bef.effectsdk.ResourceFinder;
import com.bytedance.effectcreatormobile.resource.ep.api.IVERourceProvider;

/* renamed from: X.abd, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94105abd implements InterfaceC84427XBn {
    public final XBC LIZ;

    public C94105abd() {
        XBE.LJIIIIZZ.getClass();
        this.LIZ = C84419XBf.LIZ().LIZIZ();
    }

    @Override // X.InterfaceC84427XBn
    public final XBW<C84430XBq> LIZ(C84415XBb c84415XBb) {
        XAT ePABTest;
        IVERourceProvider<? extends ResourceFinder, XAT> iVERourceProvider = C93798aWg.LIZ;
        if (iVERourceProvider != null && (ePABTest = iVERourceProvider.getEPABTest()) != null) {
            c84415XBb.LJLJJI = ePABTest;
        }
        return this.LIZ.LIZ(c84415XBb);
    }
}
