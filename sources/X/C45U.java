package X;

import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: X.45U, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C45U extends AbstractC65781Prl implements InterfaceC65784Pro<Long> {
    public static final C45U LJLIL = new C45U();

    public C45U() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        SettingsManager.LIZLLL().getClass();
        return Long.valueOf(SettingsManager.LJFF("im_permission_popup_send_delay", 0L));
    }
}
