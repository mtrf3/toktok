package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.vm.PdpViewModel;

/* renamed from: X.RdL, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69983RdL<T> implements InterfaceC64592gB {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ PdpViewModel LJLILLLLZI;

    public C69983RdL(PdpViewModel pdpViewModel, boolean z) {
        this.LJLIL = z;
        this.LJLILLLLZI = pdpViewModel;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        Throwable th = (Throwable) obj;
        if (!this.LJLIL) {
            if (th instanceof C69888Rbo) {
                PdpViewModel.yx0(this.LJLILLLLZI, null, Integer.valueOf(((C69888Rbo) th).getCode()), false, false, false, false, 124);
            } else {
                PdpViewModel.yx0(this.LJLILLLLZI, null, null, false, false, false, false, 124);
            }
        }
        PdpViewModel pdpViewModel = this.LJLILLLLZI;
        C73411SrX c73411SrX = pdpViewModel.LLJLLIL;
        if (c73411SrX != null) {
            c73411SrX.dispose();
        }
        pdpViewModel.LLJLLIL = null;
    }
}
