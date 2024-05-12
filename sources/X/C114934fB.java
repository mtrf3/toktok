package X;

import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: X.4fB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C114934fB extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C114934fB LJLIL = new C114934fB();

    public C114934fB() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = false;
        try {
            SettingsManager.LIZLLL().getClass();
            z = SettingsManager.LIZ("im_message_local_ext_concurrent_hashmap", false);
        } catch (Exception unused) {
        }
        return Boolean.valueOf(z);
    }
}
