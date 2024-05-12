package X;

import com.ss.android.ugc.aweme.app.services.Feed0VVManagerService;
import com.ss.android.ugc.aweme.framework.services.ServiceProvider;

/* renamed from: X.MrL, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58111MrL<T> implements ServiceProvider {
    public static final C58111MrL<T> LIZ = new C58111MrL<>();

    @Override // com.ss.android.ugc.aweme.framework.services.ServiceProvider
    public final Object get() {
        return new Feed0VVManagerService();
    }
}
