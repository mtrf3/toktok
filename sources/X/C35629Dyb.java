package X;

import com.ss.android.ugc.aweme.sync.SyncConfigSettings;

/* renamed from: X.Dyb, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35629Dyb extends AbstractC65781Prl implements InterfaceC65784Pro<SyncConfigSettings.SyncSdkConfigModel> {
    public static final C35629Dyb LJLIL = new C35629Dyb();

    public C35629Dyb() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final SyncConfigSettings.SyncSdkConfigModel invoke() {
        try {
            FFL LJIIIZ = FFL.LJIIIZ();
            SyncConfigSettings.SyncSdkConfigModel syncSdkConfigModel = SyncConfigSettings.LIZ;
            LJIIIZ.getClass();
            SyncConfigSettings.SyncSdkConfigModel syncSdkConfigModel2 = (SyncConfigSettings.SyncSdkConfigModel) FFL.LJIJ(true, "bsync_sdk_configs", 31744, SyncConfigSettings.SyncSdkConfigModel.class, syncSdkConfigModel);
            if (syncSdkConfigModel2 != null) {
                return syncSdkConfigModel2;
            }
            return syncSdkConfigModel;
        } catch (Throwable unused) {
            return SyncConfigSettings.LIZ;
        }
    }
}
