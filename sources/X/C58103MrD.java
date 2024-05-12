package X;

import com.ss.android.ugc.aweme.framework.services.ServiceProvider;
import com.ss.android.ugc.aweme.setting.services.AppUpdateService;
import com.ss.android.ugc.aweme.setting.services.IAppUpdateService;

/* renamed from: X.MrD, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58103MrD<T> implements ServiceProvider {
    public static final C58103MrD<T> LIZ = new C58103MrD<>();

    @Override // com.ss.android.ugc.aweme.framework.services.ServiceProvider
    public final Object get() {
        if (C58096Mr6.w6 == null) {
            synchronized (IAppUpdateService.class) {
                if (C58096Mr6.w6 == null) {
                    C58096Mr6.w6 = new AppUpdateService();
                }
            }
        }
        return C58096Mr6.w6;
    }
}
