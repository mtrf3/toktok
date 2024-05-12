package X;

import com.ss.android.ugc.aweme.compliance.privacy.settings.video.items.permission.BaseVisibilityViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* loaded from: classes13.dex */
public final class SP0 implements InterfaceC71919SKl {
    public final InterfaceC71919SKl LIZ;
    public final /* synthetic */ C72037SOz LIZIZ;
    public final /* synthetic */ BaseVisibilityViewModel LIZJ;

    @Override // X.InterfaceC71919SKl
    public final boolean isEnabled() {
        InterfaceC71919SKl interfaceC71919SKl;
        C72037SOz c72037SOz = this.LIZIZ;
        Aweme nv0 = this.LIZJ.nv0();
        c72037SOz.getClass();
        if (!C72037SOz.LLIIZ(nv0) && !this.LIZIZ.LLIILII().Fd0() && !C79146V4k.LJJJJJL(this.LIZJ.nv0()) && !this.LIZJ.nv0().isTop() && ((interfaceC71919SKl = this.LIZ) == null || interfaceC71919SKl.isEnabled())) {
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

    public SP0(SL4 sl4, C72037SOz c72037SOz, BaseVisibilityViewModel baseVisibilityViewModel) {
        this.LIZIZ = c72037SOz;
        this.LIZJ = baseVisibilityViewModel;
        this.LIZ = sl4.LJII;
    }
}
