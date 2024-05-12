package X;

import com.ss.android.ugc.aweme.ml.infra.ISmartMLSceneService;
import com.ss.android.ugc.aweme.ml.infra.SmartMLSceneServiceImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.J2g, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48514J2g {
    public static final ISmartMLSceneService LIZ;

    static {
        ISmartMLSceneService iSmartMLSceneService;
        Object LIZ2 = C58096Mr6.LIZ(ISmartMLSceneService.class, false);
        if (LIZ2 != null) {
            iSmartMLSceneService = (ISmartMLSceneService) LIZ2;
        } else {
            if (C58096Mr6.c3 == null) {
                synchronized (ISmartMLSceneService.class) {
                    if (C58096Mr6.c3 == null) {
                        C58096Mr6.c3 = new SmartMLSceneServiceImpl();
                    }
                }
            }
            iSmartMLSceneService = C58096Mr6.c3;
        }
        o.LJIIIIZZ(iSmartMLSceneService, "get().getService(ISmartMLSceneService::class.java)");
        LIZ = iSmartMLSceneService;
    }
}
