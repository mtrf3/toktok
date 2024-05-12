package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.ISurveyDebuggerService;

/* loaded from: classes11.dex */
public final class OMZ extends AbstractC65781Prl implements InterfaceC65784Pro<ISurveyDebuggerService> {
    public static final OMZ LJLIL = new OMZ();

    public OMZ() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.ss.android.ugc.aweme.service.ISurveyDebuggerService] */
    @Override // X.InterfaceC65784Pro
    public final ISurveyDebuggerService invoke() {
        return ServiceManager.get().getService(ISurveyDebuggerService.class);
    }
}
