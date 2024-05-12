package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.ISurveyDebuggerService;

/* renamed from: X.OMa, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61768OMa extends AbstractC65781Prl implements InterfaceC65784Pro<ISurveyDebuggerService> {
    public static final C61768OMa LJLIL = new C61768OMa();

    public C61768OMa() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.ss.android.ugc.aweme.service.ISurveyDebuggerService] */
    @Override // X.InterfaceC65784Pro
    public final ISurveyDebuggerService invoke() {
        return ServiceManager.get().getService(ISurveyDebuggerService.class);
    }
}
