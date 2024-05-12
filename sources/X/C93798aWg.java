package X;

import com.bef.effectsdk.ResourceFinder;
import com.bytedance.effectcreatormobile.resource.ep.api.IVERourceProvider;
import com.bytedance.news.common.service.manager.IService;

/* renamed from: X.aWg, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93798aWg {
    public static final IVERourceProvider<? extends ResourceFinder, XAT> LIZ;

    static {
        IService iService;
        C93970aZS LIZ2 = C93971aZT.LIZ();
        if (LIZ2 != null) {
            iService = (IService) LIZ2.LIZ(IVERourceProvider.class);
        } else {
            iService = null;
        }
        LIZ = (IVERourceProvider) iService;
    }
}
