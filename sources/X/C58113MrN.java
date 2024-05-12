package X;

import com.ss.android.ugc.aweme.app.services.DownloadService;
import com.ss.android.ugc.aweme.framework.services.ServiceProvider;

/* renamed from: X.MrN, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58113MrN<T> implements ServiceProvider {
    public static final C58113MrN<T> LIZ = new C58113MrN<>();

    @Override // com.ss.android.ugc.aweme.framework.services.ServiceProvider
    public final Object get() {
        return new DownloadService();
    }
}
