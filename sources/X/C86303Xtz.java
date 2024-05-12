package X;

import com.ss.android.ugc.aweme.setting.services.ISettingService;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;

/* renamed from: X.Xtz, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86303Xtz extends AbstractC65781Prl implements InterfaceC65784Pro<ISettingService> {
    public static final C86303Xtz LJLIL = new C86303Xtz();

    public C86303Xtz() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final ISettingService invoke() {
        return SettingServiceImpl.LIZ();
    }
}
