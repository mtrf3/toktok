package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.IToolsVQEvaluationService;

/* renamed from: X.5eQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C139945eQ extends AbstractC65781Prl implements InterfaceC65784Pro<IToolsVQEvaluationService> {
    public static final C139945eQ LJLIL = new C139945eQ();

    public C139945eQ() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.service.IToolsVQEvaluationService, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final IToolsVQEvaluationService invoke() {
        return ServiceManager.get().getService(IToolsVQEvaluationService.class);
    }
}
