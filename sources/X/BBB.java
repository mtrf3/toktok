package X;

import androidx.fragment.app.Fragment;
import com.bytedance.android.live.adminsetting.IAdminSettingService;

/* loaded from: classes6.dex */
public final class BBB extends AbstractC65781Prl implements InterfaceC65784Pro<Fragment> {
    public static final BBB LJLIL = new BBB();

    public BBB() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Fragment invoke() {
        return ((IAdminSettingService) CN1.LIZ(IAdminSettingService.class)).SK();
    }
}
