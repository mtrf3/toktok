package X;

import com.ss.android.ugc.aweme.framework.services.ServiceProvider;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KJD<T> implements ServiceProvider {
    public final /* synthetic */ Class<?> LIZ;

    public KJD(Class<?> cls) {
        this.LIZ = cls;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.ServiceProvider
    public final Object get() {
        Object newInstance = this.LIZ.newInstance();
        o.LJII(newInstance, "null cannot be cast to non-null type com.ss.android.ugc.aweme.search.ISearchDynamicService");
        return newInstance;
    }
}
