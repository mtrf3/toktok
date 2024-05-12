package X;

import android.app.Application;
import com.bytedance.ies.bullet.service.base.IResourceLoaderService;
import com.bytedance.ies.bullet.service.base.resourceloader.config.GeckoConfig;
import java.util.LinkedHashMap;

/* loaded from: classes11.dex */
public final class O1R {
    public static final /* synthetic */ int LIZLLL = 0;
    public final O1E LIZ;
    public final java.util.Map<IResourceLoaderService, O1E> LIZIZ = new LinkedHashMap();
    public Application LIZJ;

    public O1R() {
        boolean z = false;
        this.LIZ = new O1E("", "", C47261Igj.LJJIJIL(""), "", "", "", new GeckoConfig("", "", new O1S(), z, z, 24, null), new C61232O1k(), null, 1664);
    }

    public final O1E LIZ(IResourceLoaderService iResourceLoaderService) {
        O1E o1e = (O1E) ((LinkedHashMap) this.LIZIZ).get(iResourceLoaderService);
        if (o1e != null) {
            return o1e;
        }
        return this.LIZ;
    }
}
