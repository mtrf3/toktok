package X;

import androidx.fragment.app.Fragment;
import com.bytedance.android.live.adminsetting.IAdminSettingService;

/* loaded from: classes6.dex */
public final class BBU extends AbstractC65781Prl implements InterfaceC65784Pro<Fragment> {
    public static final BBU LJLIL = new BBU();

    public BBU() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Fragment invoke() {
        return ((IAdminSettingService) CN1.LIZ(IAdminSettingService.class)).G50("from_page_approve_comment");
    }
}
