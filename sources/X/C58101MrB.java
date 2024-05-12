package X;

import com.ss.android.ugc.aweme.framework.services.IWebViewTweaker;
import com.ss.android.ugc.aweme.framework.services.ServiceProvider;
import com.ss.android.ugc.aweme.services.WebViewTweakerService;

/* renamed from: X.MrB, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58101MrB<T> implements ServiceProvider {
    public static final C58101MrB<T> LIZ = new C58101MrB<>();

    @Override // com.ss.android.ugc.aweme.framework.services.ServiceProvider
    public final Object get() {
        if (C58096Mr6.g6 == null) {
            synchronized (IWebViewTweaker.class) {
                if (C58096Mr6.g6 == null) {
                    C58096Mr6.g6 = new WebViewTweakerService();
                }
            }
        }
        return C58096Mr6.g6;
    }
}
