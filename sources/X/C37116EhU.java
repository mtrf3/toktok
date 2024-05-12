package X;

import com.ss.android.ugc.aweme.setting.services.ISettingService;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;

/* renamed from: X.EhU, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37116EhU extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C37116EhU LJLIL = new C37116EhU();

    public C37116EhU() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean booleanValue;
        ISettingService LIZ = SettingServiceImpl.LIZ();
        if (LIZ != null) {
            booleanValue = LIZ.shouldUseFasterPaging();
        } else {
            booleanValue = ((Boolean) DTZ.LIZJ.getValue()).booleanValue();
        }
        return Boolean.valueOf(booleanValue);
    }
}
