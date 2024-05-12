package X;

import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: X.8pG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C223108pG extends AbstractC65781Prl implements InterfaceC65784Pro<E9Y<String, Boolean>> {
    public static final C223108pG LJLIL = new C223108pG();

    public C223108pG() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final E9Y<String, Boolean> invoke() {
        SettingsManager.LIZLLL().getClass();
        return new E9Y<>(SettingsManager.LJ("tt_story_guide_card_limit_per_day", 3) * 2);
    }
}
