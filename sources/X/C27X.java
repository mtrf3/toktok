package X;

import com.bytedance.android.livesdk.livesetting.other.LiveClientAISettings;
import com.bytedance.android.livesdk.livesetting.other.LiveRevenueFeatureCollectService;

/* renamed from: X.27X, reason: invalid class name */
/* loaded from: classes.dex */
public final class C27X extends AbstractC65781Prl implements InterfaceC65784Pro<LiveRevenueFeatureCollectService> {
    public static final C27X LJLIL = new C27X();

    public C27X() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final LiveRevenueFeatureCollectService invoke() {
        return LiveClientAISettings.INSTANCE.aiServices().liveRevenueFeatureCollectService;
    }
}
