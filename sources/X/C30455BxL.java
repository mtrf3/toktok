package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.game.partnership.DropsPageSchemaData;
import com.bytedance.android.livesdk.livesetting.game.partnership.GameLivePartnershipDropsSchema;

/* renamed from: X.BxL, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30455BxL extends AbstractC65781Prl implements InterfaceC65784Pro<DropsPageSchemaData> {
    public static final C30455BxL LJLIL = new C30455BxL();

    public C30455BxL() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.bytedance.android.livesdk.livesetting.game.partnership.DropsPageSchemaData] */
    @Override // X.InterfaceC65784Pro
    public final DropsPageSchemaData invoke() {
        ?? valueSafely = SettingsManager.INSTANCE.getValueSafely(GameLivePartnershipDropsSchema.class);
        if (valueSafely == 0) {
            return GameLivePartnershipDropsSchema.DEFAULT;
        }
        return valueSafely;
    }
}
