package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;

/* loaded from: classes7.dex */
public final class E7C extends AbstractC65781Prl implements InterfaceC65784Pro<LocalTestApi> {
    public static final E7C LJLIL = new E7C();

    public E7C() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.local_test.LocalTestApi, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final LocalTestApi invoke() {
        return ServiceManager.get().getService(LocalTestApi.class);
    }
}
