package X;

import com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.ComplianceSettingsServiceImpl;

/* renamed from: X.JDo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48808JDo extends AbstractC65781Prl implements InterfaceC65784Pro<IComplianceSettingsService> {
    public static final C48808JDo LJLIL = new C48808JDo();

    public C48808JDo() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final IComplianceSettingsService invoke() {
        return ComplianceSettingsServiceImpl.LJJIFFI();
    }
}
