package X;

import com.ss.android.ugc.aweme.app.services.WebviewService;
import com.ss.android.ugc.aweme.framework.services.ServiceProvider;

/* renamed from: X.MrI, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58108MrI<T> implements ServiceProvider {
    public static final C58108MrI<T> LIZ = new C58108MrI<>();

    @Override // com.ss.android.ugc.aweme.framework.services.ServiceProvider
    public final Object get() {
        return new WebviewService();
    }
}
