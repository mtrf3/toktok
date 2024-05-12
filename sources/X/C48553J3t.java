package X;

import com.ss.android.ugc.aweme.ml.infra.ISmartPlaytimePredictService;
import com.ss.android.ugc.aweme.ml.infra.SmartPlaytimePredictServiceImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.J3t, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48553J3t {
    public static final ISmartPlaytimePredictService LIZ;

    static {
        ISmartPlaytimePredictService iSmartPlaytimePredictService;
        Object LIZ2 = C58096Mr6.LIZ(ISmartPlaytimePredictService.class, false);
        if (LIZ2 != null) {
            iSmartPlaytimePredictService = (ISmartPlaytimePredictService) LIZ2;
        } else {
            if (C58096Mr6.d3 == null) {
                synchronized (ISmartPlaytimePredictService.class) {
                    if (C58096Mr6.d3 == null) {
                        C58096Mr6.d3 = new SmartPlaytimePredictServiceImpl();
                    }
                }
            }
            iSmartPlaytimePredictService = C58096Mr6.d3;
        }
        o.LJIIIIZZ(iSmartPlaytimePredictService, "get().getService(ISmartP…edictService::class.java)");
        LIZ = iSmartPlaytimePredictService;
    }
}
