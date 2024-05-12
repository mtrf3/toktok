package X;

import android.content.Context;
import com.ss.android.ugc.aweme.pns.agegate.IPNSAgeGateService;
import com.ss.android.ugc.aweme.pns.agegate.data.PNSFeedbackModel;
import com.ss.android.ugc.aweme.pns.agegate.network.PNSAgeGateApi;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.OnN, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62961OnN implements IPNSAgeGateService {
    @Override // com.ss.android.ugc.aweme.pns.agegate.IPNSAgeGateService
    public final void LIZ(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.pns.agegate.IPNSAgeGateService
    public final void LIZIZ(java.util.Map<String, String> passedMap) {
        o.LJIIIZ(passedMap, "passedMap");
    }

    @Override // com.ss.android.ugc.aweme.pns.agegate.IPNSAgeGateService
    public final void LIZJ(PNSAgeGateApi api) {
        o.LJIIIZ(api, "api");
    }

    @Override // com.ss.android.ugc.aweme.pns.agegate.IPNSAgeGateService
    public final void LIZLLL() {
    }

    @Override // com.ss.android.ugc.aweme.pns.agegate.IPNSAgeGateService
    public final void LJ(C61502OBu apiMonitor) {
        o.LJIIIZ(apiMonitor, "apiMonitor");
    }

    @Override // com.ss.android.ugc.aweme.pns.agegate.IPNSAgeGateService
    public final void LJFF(int i) {
    }

    @Override // com.ss.android.ugc.aweme.pns.agegate.IPNSAgeGateService
    public final void LJI(PNSFeedbackModel pNSFeedbackModel, InterfaceC65784Pro<C76800UCe> action) {
        o.LJIIIZ(action, "action");
    }

    @Override // com.ss.android.ugc.aweme.pns.agegate.IPNSAgeGateService
    public final void LJII(Locale locale) {
    }

    @Override // com.ss.android.ugc.aweme.pns.agegate.IPNSAgeGateService
    public final void LJIIIIZZ(EnumC86095Xqd scenario, AbstractC40941G4z abstractC40941G4z, Context context, InterfaceC86100Xqi interfaceC86100Xqi, InterfaceC86091XqZ interfaceC86091XqZ, C63062Op0 c63062Op0) {
        o.LJIIIZ(scenario, "scenario");
        o.LJIIIZ(context, "context");
    }

    @Override // com.ss.android.ugc.aweme.pns.agegate.IPNSAgeGateService
    public final void LJIIIZ(boolean z) {
    }

    @Override // com.ss.android.ugc.aweme.pns.agegate.IPNSAgeGateService
    public final void addValuesToLogParams(java.util.Map<String, String> passedMap) {
        o.LJIIIZ(passedMap, "passedMap");
    }

    @Override // com.ss.android.ugc.aweme.pns.agegate.IPNSAgeGateService
    public final void dismiss() {
    }

    @Override // com.ss.android.ugc.aweme.pns.agegate.IPNSAgeGateService
    public final void refreshUiModel() {
    }
}
