package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.IDanmakuDebugService;

/* renamed from: X.8bw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C214848bw extends AbstractC65781Prl implements InterfaceC65784Pro<IDanmakuDebugService> {
    public static final C214848bw LJLIL = new C214848bw();

    public C214848bw() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.ss.android.ugc.aweme.service.IDanmakuDebugService] */
    @Override // X.InterfaceC65784Pro
    public final IDanmakuDebugService invoke() {
        return ServiceManager.get().getService(IDanmakuDebugService.class);
    }
}
