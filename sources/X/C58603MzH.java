package X;

import com.ss.android.ugc.aweme.framework.services.ServiceProvider;
import kotlin.jvm.internal.o;

/* renamed from: X.MzH, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58603MzH<T> implements ServiceProvider {
    public final /* synthetic */ Class<?> LIZ;

    public C58603MzH(Class<?> cls) {
        this.LIZ = cls;
    }

    @Override // com.ss.android.ugc.aweme.framework.services.ServiceProvider
    public final Object get() {
        Object newInstance = this.LIZ.newInstance();
        o.LJII(newInstance, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ug.brand.ITranssonicService");
        return newInstance;
    }
}
