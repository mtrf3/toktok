package X;

import com.ss.android.ugc.aweme.framework.services.ServiceProvider;
import com.ss.android.ugc.aweme.mapapi.IPoiMapService;

/* loaded from: classes10.dex */
public final class M3X<T> implements ServiceProvider {
    public final /* synthetic */ Class<?> LIZ;

    public M3X(Class<?> cls) {
        this.LIZ = cls;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.ServiceProvider
    public final Object get() {
        Object newInstance = this.LIZ.newInstance();
        if (newInstance instanceof IPoiMapService) {
            return newInstance;
        }
        return null;
    }
}
