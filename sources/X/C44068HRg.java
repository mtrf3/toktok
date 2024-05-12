package X;

import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.services.external.ui.IRecordService;

/* renamed from: X.HRg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C44068HRg implements IRecordService.UICallback {
    public final /* synthetic */ C44066HRe LIZ;

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService.UICallback
    public final void postFail() {
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService.UICallback
    public final boolean checkIsCanceled() {
        return this.LIZ.LJIJ;
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService.UICallback
    public final void postSuccess() {
        C44066HRe c44066HRe = this.LIZ;
        InterfaceC44080HRs interfaceC44080HRs = c44066HRe.LJIIL;
        c44066HRe.LJIILL.getAid();
        interfaceC44080HRs.onSuccess();
        C188727au c188727au = new C188727au();
        this.LIZ.LJI(c188727au);
        c188727au.LIZLLL(1, "loading_status");
        AVExternalServiceImpl.LIZ().getAVMobService().onEventV3("loading_finish", c188727au.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService.UICallback
    public final void preSuccess() {
        C44066HRe c44066HRe = this.LIZ;
        c44066HRe.LJFF(c44066HRe.LJIJJ, null, Boolean.TRUE);
        this.LIZ.LIZ();
    }

    public C44068HRg(C44066HRe c44066HRe) {
        this.LIZ = c44066HRe;
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService.UICallback
    public final void preFail(int i) {
        this.LIZ.LIZLLL();
    }
}
