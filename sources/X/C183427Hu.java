package X;

import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: X.7Hu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C183427Hu extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C183427Hu LJLIL = new C183427Hu();

    public C183427Hu() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int i = 0;
        try {
            SettingsManager.LIZLLL().getClass();
            i = SettingsManager.LJ("viewer_list_authorization_popup_max_times", 0);
        } catch (Exception unused) {
        }
        return Integer.valueOf(i);
    }
}
