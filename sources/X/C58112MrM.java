package X;

import com.ss.android.ugc.aweme.app.services.PushLaunchPageAssistantService;
import com.ss.android.ugc.aweme.framework.services.ServiceProvider;

/* renamed from: X.MrM, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58112MrM<T> implements ServiceProvider {
    public static final C58112MrM<T> LIZ = new C58112MrM<>();

    @Override // com.ss.android.ugc.aweme.framework.services.ServiceProvider
    public final Object get() {
        return new PushLaunchPageAssistantService();
    }
}
