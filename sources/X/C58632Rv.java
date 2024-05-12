package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.relation.experiment.SettingsValue;

/* renamed from: X.2Rv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C58632Rv extends AbstractC65781Prl implements InterfaceC65784Pro<SettingsValue> {
    public static final C58632Rv LJLIL = new C58632Rv();

    public C58632Rv() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.relation.experiment.SettingsValue, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final SettingsValue invoke() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        SettingsValue settingsValue = C58622Ru.LIZ;
        ?? LJIIIIZZ = LIZLLL.LJIIIIZZ("relation_invite_channel_block_list", SettingsValue.class, settingsValue);
        if (LJIIIIZZ == 0) {
            return settingsValue;
        }
        return LJIIIIZZ;
    }
}
