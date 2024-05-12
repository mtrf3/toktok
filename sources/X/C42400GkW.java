package X;

import com.ss.android.ugc.aweme.services.external.ui.IRecordService;

/* renamed from: X.GkW, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42400GkW implements IRecordService.UICallback {
    public final /* synthetic */ C42393GkP LIZ;

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService.UICallback
    public final void preFail(int i) {
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService.UICallback
    public final void preSuccess() {
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService.UICallback
    public final void postFail() {
        this.LIZ.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService.UICallback
    public final void postSuccess() {
        this.LIZ.LIZ(true);
    }

    @Override // com.ss.android.ugc.aweme.services.external.ui.IRecordService.UICallback
    public final boolean checkIsCanceled() {
        return IRecordService.UICallback.DefaultImpls.checkIsCanceled(this);
    }

    public C42400GkW(C42393GkP c42393GkP) {
        this.LIZ = c42393GkP;
    }
}
