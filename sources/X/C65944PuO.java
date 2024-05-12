package X;

import com.bytedance.helios.network.api.service.IAppLogService;

/* renamed from: X.PuO, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65944PuO extends AbstractC65781Prl implements InterfaceC65784Pro<IAppLogService> {
    public static final C65944PuO LJLIL = new C65944PuO();

    public C65944PuO() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.bytedance.helios.network.api.service.IAppLogService] */
    @Override // X.InterfaceC65784Pro
    public final IAppLogService invoke() {
        return C65940PuK.LIZ("com.bytedance.helios.network.applog.impl.AppLogServiceImpl");
    }
}
