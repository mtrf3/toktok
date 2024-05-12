package X;

import com.ss.android.ugc.aweme.setting.api.IChangePhoneHelperApi;
import com.ss.android.ugc.aweme.setting.api.SafeEnvResponse;
import java.lang.ref.SoftReference;

/* renamed from: X.EzC, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38214EzC<TTaskResult, TContinuationResult> implements C10I {
    public static final C38214EzC<TTaskResult, TContinuationResult> LIZ = new C38214EzC<>();

    @Override // X.C10I
    public final Object then(C10K c10k) {
        InterfaceC38216EzE interfaceC38216EzE;
        SafeEnvResponse.Data data;
        if (C82544WaS.LJ(c10k) && (data = ((SafeEnvResponse) c10k.LJIIJJI()).data) != null && data.isSafe) {
            IChangePhoneHelperApi.LIZ.getClass();
            C35968E9s.LIZIZ.check2sv().LIZLLL(C38213EzB.LIZ);
        } else {
            SoftReference<InterfaceC38216EzE> softReference = C38215EzD.LIZ;
            if (softReference != null && (interfaceC38216EzE = softReference.get()) != null) {
                interfaceC38216EzE.LIZ(false, false);
            }
            C38215EzD.LIZ = null;
        }
        return C76800UCe.LIZ;
    }
}
