package X;

import com.ss.android.ugc.aweme.services.now.ICreativeNowService;

/* loaded from: classes13.dex */
public final class SP5 implements InterfaceC71919SKl {
    public final InterfaceC71919SKl LIZ;
    public final /* synthetic */ C72037SOz LIZIZ;

    @Override // X.InterfaceC71919SKl
    public final boolean isEnabled() {
        InterfaceC71919SKl interfaceC71919SKl;
        if (!((ICreativeNowService) this.LIZIZ.LJLZ.getValue()).isUnder18() && ((interfaceC71919SKl = this.LIZ) == null || interfaceC71919SKl.isEnabled())) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC71919SKl
    public final boolean isVisible() {
        InterfaceC71919SKl interfaceC71919SKl = this.LIZ;
        if (interfaceC71919SKl != null) {
            return interfaceC71919SKl.isVisible();
        }
        return true;
    }

    public SP5(SL4 sl4, C72037SOz c72037SOz) {
        this.LIZIZ = c72037SOz;
        this.LIZ = sl4.LJII;
    }
}
