package X;

import com.bytedance.geckox.model.LocalPackageModel;
import com.bytedance.geckox.model.UpdatePackage;
import java.io.File;

/* loaded from: classes11.dex */
public final class OSV extends AbstractC61537ODd {
    public final /* synthetic */ C34K LIZ;
    public final /* synthetic */ XJL<Boolean> LIZIZ;
    public final /* synthetic */ String LIZJ;

    @Override // X.AbstractC61537ODd
    public final void LJIIIZ(LocalPackageModel localPackageModel) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLocalNewestVersion is ");
        LIZ.append(Long.valueOf(localPackageModel.getLatestVersion()));
        LIZ.append(" is already resume ");
        FT5.LJ(LIZ, this.LIZ.element, LIZ, "LynxGiftChannelPreload");
        if (!this.LIZ.element) {
            XJL<Boolean> xjl = this.LIZIZ;
            Boolean bool = Boolean.TRUE;
            C3C5.m7constructorimpl(bool);
            xjl.resumeWith(bool);
            this.LIZ.element = true;
        }
    }

    @Override // X.AbstractC61537ODd
    public final void LIZLLL(Throwable th, java.util.Map map) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onCheckServerVersionFail ");
        LIZ.append(th);
        LIZ.append(" already resume ");
        LIZ.append(this.LIZ.element);
        C0NB.LJIIIZ("LynxGiftChannelPreload", X1D.LIZIZ(LIZ));
        C78983UzD.LJIJ(th, "LynxGiftChannelPreload");
        if (!this.LIZ.element) {
            XJL<Boolean> xjl = this.LIZIZ;
            Boolean bool = Boolean.FALSE;
            C3C5.m7constructorimpl(bool);
            xjl.resumeWith(bool);
            this.LIZ.element = true;
        }
    }

    @Override // X.AbstractC61537ODd
    public final void LJIIJ(UpdatePackage updatePackage, Throwable th) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" update gecko fail ");
        LIZ.append(th);
        LIZ.append(" already resume ");
        LIZ.append(this.LIZ.element);
        C0NB.LJIIIZ("LynxGiftChannelPreload", X1D.LIZIZ(LIZ));
        C78983UzD.LJIJ(th, "LynxGiftChannelPreload");
        if (!this.LIZ.element) {
            XJL<Boolean> xjl = this.LIZIZ;
            Boolean bool = Boolean.FALSE;
            C3C5.m7constructorimpl(bool);
            xjl.resumeWith(bool);
            this.LIZ.element = true;
        }
    }

    @Override // X.AbstractC61537ODd
    public final void LJIILL(UpdatePackage updatePackage, long j) {
        Boolean bool;
        File LJFF = C15510jD.LJFF(this.LIZJ, "/");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(" update gecko success ");
        if (LJFF != null) {
            bool = Boolean.valueOf(LJFF.exists());
        } else {
            bool = null;
        }
        LIZ.append(bool);
        LIZ.append(", update package is ");
        LIZ.append(updatePackage);
        LIZ.append(" version is ");
        LIZ.append(j);
        LIZ.append(" already resume ");
        FT5.LJ(LIZ, this.LIZ.element, LIZ, "LynxGiftChannelPreload");
        if (!this.LIZ.element) {
            XJL<Boolean> xjl = this.LIZIZ;
            Boolean bool2 = Boolean.TRUE;
            C3C5.m7constructorimpl(bool2);
            xjl.resumeWith(bool2);
            this.LIZ.element = true;
        }
    }

    public OSV(C34K c34k, XKS xks, String str) {
        this.LIZ = c34k;
        this.LIZIZ = xks;
        this.LIZJ = str;
    }

    @Override // X.AbstractC61537ODd
    public final void LIZJ(int i, Throwable th, java.util.Map map) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onCheckRequestIntercept ");
        LIZ.append(th);
        LIZ.append(", error code is ");
        LIZ.append(i);
        LIZ.append(" is already resume ");
        LIZ.append(this.LIZ.element);
        C0NB.LJIIIZ("LynxGiftChannelPreload", X1D.LIZIZ(LIZ));
        C78983UzD.LJIJ(new Throwable("load gecko resource intercept"), "LynxGiftChannelPreload");
        if (!this.LIZ.element) {
            XJL<Boolean> xjl = this.LIZIZ;
            Boolean bool = Boolean.FALSE;
            C3C5.m7constructorimpl(bool);
            xjl.resumeWith(bool);
            this.LIZ.element = true;
        }
    }
}
