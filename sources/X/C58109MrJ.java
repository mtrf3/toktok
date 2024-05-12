package X;

import com.ss.android.ugc.aweme.app.services.RegionService;
import com.ss.android.ugc.aweme.framework.services.ServiceProvider;

/* renamed from: X.MrJ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58109MrJ<T> implements ServiceProvider {
    public static final C58109MrJ<T> LIZ = new C58109MrJ<>();

    @Override // com.ss.android.ugc.aweme.framework.services.ServiceProvider
    public final Object get() {
        return new RegionService();
    }
}
