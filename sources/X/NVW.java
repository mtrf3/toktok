package X;

import android.view.View;
import com.ss.android.ugc.aweme.bullet.business.ReportBusiness;
import com.ss.android.ugc.aweme.bullet.module.base.BaseCommonBizRootContainer;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NVW implements InterfaceC59463NVj {
    public final /* synthetic */ BaseCommonBizRootContainer LIZ;
    public final /* synthetic */ C59472NVs LIZIZ;

    @Override // X.InterfaceC59463NVj
    public final void LJLIIIL() {
        BaseCommonBizRootContainer baseCommonBizRootContainer = this.LIZ;
        baseCommonBizRootContainer.LL = "click_button";
        C59614NaU c59614NaU = baseCommonBizRootContainer.LJLJLJ;
        if (c59614NaU != null && c59614NaU.LJLLLL()) {
            C59614NaU c59614NaU2 = baseCommonBizRootContainer.LJLJLJ;
            if (c59614NaU2 != null) {
                c59614NaU2.goBack();
                return;
            }
            return;
        }
        C188727au c188727au = new C188727au();
        c188727au.LJI("method", baseCommonBizRootContainer.LL);
        FMX.LJIIL("h5_leave_detail", c188727au.LIZ);
        baseCommonBizRootContainer.LJLLLLLL.run();
    }

    @Override // X.InterfaceC59463NVj
    public final void LJLIIL() {
        if ((this.LIZIZ instanceof C59304NPg) && this.LIZ.LJLILLLLZI.LIZ(ReportBusiness.class) != null) {
            ReportBusiness.LIZ(this.LIZ.LJLZ, ((C59304NPg) this.LIZIZ).LIZLLL());
        }
    }

    @Override // X.InterfaceC59463NVj
    public final void LJLILLLLZI() {
        if (this.LIZ.LJZ) {
            C58909NAb.LIZ.getClass();
            InterfaceC59440NUm LIZ = NH3.LIZ();
            if (LIZ != null) {
                BaseCommonBizRootContainer baseCommonBizRootContainer = this.LIZ;
                ((NTF) LIZ).LJIIIZ(baseCommonBizRootContainer, baseCommonBizRootContainer.LJLJLJ);
                return;
            }
            return;
        }
        C58909NAb.LIZ.getClass();
        if (NH3.LIZ() == null) {
            return;
        }
        NTF.LJJII(this.LIZ);
    }

    @Override // X.InterfaceC59463NVj
    public final void LJLJI() {
        this.LIZ.LJLLLLLL.run();
    }

    @Override // X.InterfaceC59463NVj
    public final void LJLIL(View view) {
        o.LJIIIZ(view, "view");
        C59455NVb c59455NVb = this.LIZ.LJLLL;
        if (c59455NVb != null) {
            c59455NVb.LIZ();
            BaseCommonBizRootContainer baseCommonBizRootContainer = this.LIZ;
            C59455NVb c59455NVb2 = baseCommonBizRootContainer.LJLLL;
            if (c59455NVb2 != null) {
                C16880lQ.LLJL(c59455NVb2.LIZIZ(baseCommonBizRootContainer.LJLLLL), view, 0, -12);
            }
        }
    }

    public NVW(BaseCommonBizRootContainer baseCommonBizRootContainer, C59472NVs c59472NVs) {
        this.LIZ = baseCommonBizRootContainer;
        this.LIZIZ = c59472NVs;
    }
}
