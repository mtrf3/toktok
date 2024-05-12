package X;

import com.ss.android.ugc.aweme.ml.api.ISmartPreloadCommentV2Service;
import com.ss.android.ugc.aweme.ml.impl.SmartPreloadCommentV2ServiceImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.J4g, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48566J4g {
    public static final ISmartPreloadCommentV2Service LIZ;

    static {
        ISmartPreloadCommentV2Service iSmartPreloadCommentV2Service;
        Object LIZ2 = C58096Mr6.LIZ(ISmartPreloadCommentV2Service.class, false);
        if (LIZ2 != null) {
            iSmartPreloadCommentV2Service = (ISmartPreloadCommentV2Service) LIZ2;
        } else {
            if (C58096Mr6.X2 == null) {
                synchronized (ISmartPreloadCommentV2Service.class) {
                    if (C58096Mr6.X2 == null) {
                        C58096Mr6.X2 = new SmartPreloadCommentV2ServiceImpl();
                    }
                }
            }
            iSmartPreloadCommentV2Service = C58096Mr6.X2;
        }
        o.LJIIIIZZ(iSmartPreloadCommentV2Service, "get().getService(ISmartP…entV2Service::class.java)");
        LIZ = iSmartPreloadCommentV2Service;
    }
}
