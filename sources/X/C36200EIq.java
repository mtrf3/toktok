package X;

import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: X.EIq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36200EIq extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C36200EIq LJLIL = new C36200EIq();

    public C36200EIq() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int i = 1;
        try {
            SettingsManager.LIZLLL().getClass();
            i = SettingsManager.LJ("friends_tab_cold_start_request_query_param", 1);
        } catch (Throwable unused) {
        }
        return Integer.valueOf(i);
    }
}
