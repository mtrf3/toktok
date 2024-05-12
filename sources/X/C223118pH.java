package X;

import com.bytedance.ies.abmock.SettingsManager;

/* renamed from: X.8pH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C223118pH extends AbstractC65781Prl implements InterfaceC65784Pro<E9Y<String, C223128pI>> {
    public static final C223118pH LJLIL = new C223118pH();

    public C223118pH() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final E9Y<String, C223128pI> invoke() {
        SettingsManager.LIZLLL().getClass();
        return new E9Y<>(SettingsManager.LJ("tt_story_guide_card_limit_per_day", 3) * 2);
    }
}
