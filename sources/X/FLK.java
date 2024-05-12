package X;

import android.content.Context;
import com.bytedance.bpea.cert.token.TokenCert;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.compliance.api.model.UltimateCmplSettings;
import com.ss.android.ugc.aweme.legoImp.task.FetchUltimateComplianceSettingsTask;
import kotlin.jvm.internal.AqS22S2100000_11;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FLK implements InterfaceC62925Omn {
    @Override // X.InterfaceC62925Omn
    public final void onFailed() {
        FLN.LIZ("", true, true);
    }

    @Override // X.InterfaceC62925Omn
    public final void LIZ(UltimateCmplSettings data) {
        String str;
        o.LJIIIZ(data, "data");
        FLN.LIZ(data.country, data.setAnonymizeUserForAF, data.delayAFStart);
        Context context = FetchUltimateComplianceSettingsTask.LJLIL;
        if (context != null) {
            boolean z = data.setAnonymizeUserForFireBase;
            C63053Oor LIZ = C63053Oor.LIZIZ.LIZ(context);
            if (z) {
                str = "false";
            } else {
                str = "true";
            }
            TokenCert cert = TokenCert.Companion.with("bpea-firebase_androidsdk_5744");
            o.LJIIIZ(cert, "cert");
            C1GE.LJIJJ(cert, "Firebase", "setUserProperty", new AqS22S2100000_11(LIZ, str, 1));
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("setFirebaseRDP: ");
            LIZ2.append(z);
            ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogD("FetchUltimateComplianceSettingsTask", X1D.LIZIZ(LIZ2));
        }
    }
}
