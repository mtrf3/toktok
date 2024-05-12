package X;

import com.ss.android.ugc.aweme.framework.services.ServiceProvider;
import com.ss.android.ugc.aweme.main.service.II18nService;
import com.ss.android.ugc.aweme.setting.services.I18nService;

/* renamed from: X.Mr9, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58099Mr9<T> implements ServiceProvider {
    public static final C58099Mr9<T> LIZ = new C58099Mr9<>();

    @Override // com.ss.android.ugc.aweme.framework.services.ServiceProvider
    public final Object get() {
        if (C58096Mr6.x6 == null) {
            synchronized (II18nService.class) {
                if (C58096Mr6.x6 == null) {
                    C58096Mr6.x6 = new I18nService();
                }
            }
        }
        return C58096Mr6.x6;
    }
}
