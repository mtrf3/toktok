package X;

import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: X.3Us, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C84863Us extends AbstractC65781Prl implements InterfaceC65784Pro<Long> {
    public static final C84863Us LJLIL = new C84863Us();

    public C84863Us() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        SettingsManager.LIZLLL().getClass();
        return Long.valueOf(SettingsManager.LJFF("is_reply_window_seconds_since_last_read", 43200L));
    }
}
