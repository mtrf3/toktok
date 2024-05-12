package X;

import com.ss.android.ugc.aweme.ml.api.ISmartPreloadProfileV2Service;
import com.ss.android.ugc.aweme.ml.impl.SmartPreloadProfileV2ServiceImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.J4h, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48567J4h {
    public static final ISmartPreloadProfileV2Service LIZ;

    static {
        ISmartPreloadProfileV2Service iSmartPreloadProfileV2Service;
        Object LIZ2 = C58096Mr6.LIZ(ISmartPreloadProfileV2Service.class, false);
        if (LIZ2 != null) {
            iSmartPreloadProfileV2Service = (ISmartPreloadProfileV2Service) LIZ2;
        } else {
            if (C58096Mr6.Y2 == null) {
                synchronized (ISmartPreloadProfileV2Service.class) {
                    if (C58096Mr6.Y2 == null) {
                        C58096Mr6.Y2 = new SmartPreloadProfileV2ServiceImpl();
                    }
                }
            }
            iSmartPreloadProfileV2Service = C58096Mr6.Y2;
        }
        o.LJIIIIZZ(iSmartPreloadProfileV2Service, "get().getService(ISmartP…ileV2Service::class.java)");
        LIZ = iSmartPreloadProfileV2Service;
    }
}
