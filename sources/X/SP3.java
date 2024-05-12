package X;

import com.ss.android.ugc.aweme.compliance.privacy.settings.video.items.permission.BaseVisibilityViewModel;

/* loaded from: classes13.dex */
public final class SP3 implements InterfaceC71919SKl {
    public final InterfaceC71919SKl LIZ;
    public final /* synthetic */ BaseVisibilityViewModel LIZIZ;

    @Override // X.InterfaceC71919SKl
    public final boolean isEnabled() {
        InterfaceC71919SKl interfaceC71919SKl;
        Integer value = this.LIZIZ.LJLJI.getValue();
        if (value == null || value.intValue() != -1000 || (interfaceC71919SKl = this.LIZ) == null || !interfaceC71919SKl.isEnabled()) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC71919SKl
    public final boolean isVisible() {
        InterfaceC71919SKl interfaceC71919SKl = this.LIZ;
        if (interfaceC71919SKl != null) {
            return interfaceC71919SKl.isVisible();
        }
        return false;
    }

    public SP3(SL4 sl4, BaseVisibilityViewModel baseVisibilityViewModel) {
        this.LIZIZ = baseVisibilityViewModel;
        this.LIZ = sl4.LJII;
    }
}
