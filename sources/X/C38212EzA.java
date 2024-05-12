package X;

import com.ss.android.ugc.aweme.setting.api.AvailableWaysResponse;
import java.lang.ref.SoftReference;
import kotlin.jvm.internal.o;

/* renamed from: X.EzA, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38212EzA<TTaskResult, TContinuationResult> implements C10I {
    public static final C38212EzA<TTaskResult, TContinuationResult> LIZ = new C38212EzA<>();

    @Override // X.C10I
    public final Object then(C10K c10k) {
        InterfaceC38216EzE interfaceC38216EzE;
        InterfaceC38216EzE interfaceC38216EzE2;
        if (C82544WaS.LJ(c10k) && ((AvailableWaysResponse) c10k.LJIIJJI()).data != null) {
            AvailableWaysResponse.Data data = ((AvailableWaysResponse) c10k.LJIIJJI()).data;
            o.LJI(data);
            SoftReference<InterfaceC38216EzE> softReference = C38215EzD.LIZ;
            if (softReference != null && (interfaceC38216EzE2 = softReference.get()) != null) {
                interfaceC38216EzE2.LIZ(data.hasEmail, data.hasPwd);
            }
            C38215EzD.LIZ = null;
        } else {
            SoftReference<InterfaceC38216EzE> softReference2 = C38215EzD.LIZ;
            if (softReference2 != null && (interfaceC38216EzE = softReference2.get()) != null) {
                interfaceC38216EzE.LIZ(false, false);
            }
            C38215EzD.LIZ = null;
        }
        return C76800UCe.LIZ;
    }
}
