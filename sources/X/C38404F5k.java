package X;

import com.ss.android.ugc.aweme.aabplugin.core.base.view.DFInstallBlankActivity;
import com.ss.android.ugc.aweme.setting.services.IStorageService;

/* renamed from: X.F5k, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38404F5k implements InterfaceC38412F5s {
    public final /* synthetic */ AbstractC37134Ehm LIZ;
    public final /* synthetic */ DFInstallBlankActivity LIZIZ;
    public final /* synthetic */ IStorageService LIZJ;

    @Override // X.InterfaceC38412F5s
    public final void LIZ() {
        if (C38400F5g.LIZ(this.LIZ.LJIIJ)) {
            F5V.LIZLLL().LJFF(this.LIZ);
        } else {
            DFInstallBlankActivity dFInstallBlankActivity = this.LIZIZ;
            AbstractC37134Ehm abstractC37134Ehm = this.LIZ;
            dFInstallBlankActivity.getClass();
            DFInstallBlankActivity.LLFII(abstractC37134Ehm, false);
        }
        this.LIZJ.LIZIZ(this);
    }

    public C38404F5k(AbstractC37134Ehm abstractC37134Ehm, DFInstallBlankActivity dFInstallBlankActivity, IStorageService iStorageService) {
        this.LIZ = abstractC37134Ehm;
        this.LIZIZ = dFInstallBlankActivity;
        this.LIZJ = iStorageService;
    }
}
