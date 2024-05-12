package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.im.core.client.ReportTaskInfoConfig;

/* renamed from: X.Ote, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63350Ote extends AbstractC65781Prl implements InterfaceC65784Pro<ReportTaskInfoConfig> {
    public static final C63350Ote LJLIL = new C63350Ote();

    public C63350Ote() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final ReportTaskInfoConfig invoke() {
        ReportTaskInfoConfig reportTaskInfoConfig;
        try {
            SettingsManager.LIZLLL().getClass();
            reportTaskInfoConfig = (ReportTaskInfoConfig) SettingsManager.LJII("im_sdk_report_task_info", ReportTaskInfoConfig.class);
        } catch (Throwable unused) {
            reportTaskInfoConfig = C63349Otd.LIZ;
        }
        if (reportTaskInfoConfig == null) {
            return C63349Otd.LIZ;
        }
        return reportTaskInfoConfig;
    }
}
