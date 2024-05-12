package X;

import com.ss.android.ugc.aweme.im.service.appsettings.ActivityStatusAccuracyAnalysisConfig;
import com.ss.android.ugc.aweme.im.service.appsettings.ActivityStatusAccuracyPollingConfig;
import java.util.List;

/* renamed from: X.DxZ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35565DxZ extends AbstractC65781Prl implements InterfaceC65784Pro<List<? extends ActivityStatusAccuracyPollingConfig>> {
    public static final C35565DxZ LJLIL = new C35565DxZ();

    public C35565DxZ() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final List<? extends ActivityStatusAccuracyPollingConfig> invoke() {
        return ((ActivityStatusAccuracyAnalysisConfig) C35564DxY.LIZIZ.getValue()).activityStatusAccuracyPollingConfigList;
    }
}
