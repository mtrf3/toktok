package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;

/* renamed from: X.EaD, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36665EaD extends AbstractC65781Prl implements InterfaceC65784Pro<LocalTestApi> {
    public static final C36665EaD LJLIL = new C36665EaD();

    public C36665EaD() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.local_test.LocalTestApi, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final LocalTestApi invoke() {
        return ServiceManager.get().getService(LocalTestApi.class);
    }
}
