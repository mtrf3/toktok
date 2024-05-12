package X;

import com.ss.android.ugc.aweme.framework.services.ServiceProvider;
import kotlin.jvm.internal.o;

/* renamed from: X.KLf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51555KLf<T> implements ServiceProvider {
    public final /* synthetic */ Class<?> LIZ;

    public C51555KLf(Class<?> cls) {
        this.LIZ = cls;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.ServiceProvider
    public final Object get() {
        Object newInstance = this.LIZ.newInstance();
        o.LJII(newInstance, "null cannot be cast to non-null type com.ss.android.ugc.aweme.poi_api.service.IPoiService");
        return newInstance;
    }
}
