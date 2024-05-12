package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.INUJDebugService;

/* loaded from: classes7.dex */
public final class EH1 extends AbstractC39351FcR {
    public final C62822Ol8 LJIIJJI = C221108m2.LIZIZ(EH2.LJLIL);

    @Override // X.AbstractC39351FcR
    public final int LIZJ() {
        return 3;
    }

    @Override // X.AbstractC39351FcR
    public final String LJ() {
        return "";
    }

    @Override // X.AbstractC39351FcR
    public final int LIZIZ() {
        ((INUJDebugService) ServiceManager.get().getService(INUJDebugService.class)).LIZ();
        if (((Boolean) this.LJIIJJI.getValue()).booleanValue()) {
            return 2;
        }
        return 0;
    }
}
