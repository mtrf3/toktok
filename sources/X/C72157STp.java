package X;

import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: X.STp, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72157STp extends AbstractC65781Prl implements InterfaceC65784Pro<Long> {
    public static final C72157STp LJLIL = new C72157STp();

    public C72157STp() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        SettingsManager.LIZLLL().getClass();
        return Long.valueOf(SettingsManager.LJFF("aigc_creative_polling_frequency", 5000L));
    }
}
