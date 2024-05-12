package X;

import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: X.Kh2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C52376Kh2 extends AbstractC65781Prl implements InterfaceC65784Pro<Long> {
    public static final C52376Kh2 LJLIL = new C52376Kh2();

    public C52376Kh2() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        SettingsManager.LIZLLL().getClass();
        return Long.valueOf(SettingsManager.LJFF("ttlive_broadcast_game_related_live_validity_period", 120000L));
    }
}
