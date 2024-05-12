package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.compliance.api.model.ConsentAcceptanceResponse;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EKV extends AbstractC73391SrD<ConsentAcceptanceResponse> {
    @Override // X.InterfaceC116954iR
    public final void onComplete() {
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable e) {
        o.LJIIIZ(e, "e");
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(Object obj) {
        ConsentAcceptanceResponse consentAcceptanceResponse = (ConsentAcceptanceResponse) obj;
        o.LJIIIZ(consentAcceptanceResponse, "consentAcceptanceResponse");
        Keva.getRepo("tpc_consent").storeBoolean("ug_should_show", consentAcceptanceResponse.shouldShow);
        Keva.getRepo("tpc_consent").storeBoolean("ug_record_found", consentAcceptanceResponse.recordFound);
    }
}
