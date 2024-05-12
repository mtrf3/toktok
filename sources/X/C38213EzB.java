package X;

import com.ss.android.ugc.aweme.account.login.twostep.AddVerificationResponse;
import com.ss.android.ugc.aweme.account.login.twostep.VerifyWay;
import com.ss.android.ugc.aweme.setting.api.IChangePhoneHelperApi;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.EzB, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38213EzB<TTaskResult, TContinuationResult> implements C10I {
    public static final C38213EzB<TTaskResult, TContinuationResult> LIZ = new C38213EzB<>();

    @Override // X.C10I
    public final Object then(C10K c10k) {
        InterfaceC38216EzE interfaceC38216EzE;
        if (C82544WaS.LJ(c10k) && ((AddVerificationResponse) c10k.LJIIJJI()).getData() != null) {
            AddVerificationResponse.Data data = ((AddVerificationResponse) c10k.LJIIJJI()).getData();
            o.LJI(data);
            List<VerifyWay> two_step_verify_ways = data.getTwo_step_verify_ways();
            if (two_step_verify_ways != null) {
                ArrayList arrayList = new ArrayList();
                for (VerifyWay verifyWay : two_step_verify_ways) {
                    if (o.LJ(verifyWay.is_available(), Boolean.TRUE)) {
                        arrayList.add(verifyWay);
                    }
                }
                if (arrayList.size() < 2) {
                    IChangePhoneHelperApi.LIZ.getClass();
                    C35968E9s.LIZIZ.availableVerifyWays().LIZLLL(C38212EzA.LIZ);
                    return C76800UCe.LIZ;
                }
            }
        }
        SoftReference<InterfaceC38216EzE> softReference = C38215EzD.LIZ;
        if (softReference != null && (interfaceC38216EzE = softReference.get()) != null) {
            interfaceC38216EzE.LIZ(false, false);
        }
        C38215EzD.LIZ = null;
        return C76800UCe.LIZ;
    }
}
