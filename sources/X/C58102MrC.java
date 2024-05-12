package X;

import com.ss.android.ugc.aweme.framework.services.ServiceProvider;
import com.ss.android.ugc.aweme.main.service.ILanguageService;
import com.ss.android.ugc.aweme.setting.services.LanguageService;

/* renamed from: X.MrC, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58102MrC<T> implements ServiceProvider {
    public static final C58102MrC<T> LIZ = new C58102MrC<>();

    @Override // com.ss.android.ugc.aweme.framework.services.ServiceProvider
    public final Object get() {
        if (C58096Mr6.y6 == null) {
            synchronized (ILanguageService.class) {
                if (C58096Mr6.y6 == null) {
                    C58096Mr6.y6 = new LanguageService();
                }
            }
        }
        return C58096Mr6.y6;
    }
}
