package X;

import com.ss.android.ugc.aweme.framework.services.ServiceProvider;
import com.ss.android.ugc.aweme.services.AccountHelperService;
import com.ss.android.ugc.aweme.services.IAccountHelperService;

/* renamed from: X.MrA, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58100MrA<T> implements ServiceProvider {
    public static final C58100MrA<T> LIZ = new C58100MrA<>();

    @Override // com.ss.android.ugc.aweme.framework.services.ServiceProvider
    public final Object get() {
        if (C58096Mr6.x5 == null) {
            synchronized (IAccountHelperService.class) {
                if (C58096Mr6.x5 == null) {
                    C58096Mr6.x5 = new AccountHelperService();
                }
            }
        }
        return C58096Mr6.x5;
    }
}
