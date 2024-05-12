package X;

import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: X.KJj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51507KJj extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C51507KJj LJLIL = new C51507KJj();

    public C51507KJj() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        SettingsManager.LIZLLL().getClass();
        return Integer.valueOf(SettingsManager.LJ("trending_sounds_rank_num", 12) - 1);
    }
}
