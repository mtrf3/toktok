package X;

import android.view.View;
import com.ss.android.ugc.aweme.compliance.business.report.ReportWebPageDialogActivity;
import kotlin.jvm.internal.o;
import o3.h0;

/* renamed from: X.NqO, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60600NqO implements InterfaceC16710l9 {
    public final /* synthetic */ ReportWebPageDialogActivity LIZ;

    public C60600NqO(ReportWebPageDialogActivity reportWebPageDialogActivity) {
        this.LIZ = reportWebPageDialogActivity;
    }

    @Override // X.InterfaceC16710l9
    public final C16800lI LIZ(View v, C16800lI c16800lI) {
        o.LJIIIZ(v, "v");
        if (v.getHeight() == 0) {
            ReportWebPageDialogActivity reportWebPageDialogActivity = this.LIZ;
            reportWebPageDialogActivity.LLFZ(C60996Nwm.LJ(reportWebPageDialogActivity));
        } else {
            this.LIZ.LLFZ((v.getHeight() - c16800lI.LIZIZ()) - c16800lI.LJ());
        }
        h0.LJIILIIL(v, c16800lI.LJIIIIZZ(0, c16800lI.LJ(), 0, c16800lI.LIZIZ()));
        return c16800lI;
    }
}
