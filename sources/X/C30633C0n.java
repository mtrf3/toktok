package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.roomfunction.CustomPollVotingUrlNew;

/* renamed from: X.C0n, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30633C0n extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public static final C30633C0n LJLIL = new C30633C0n();

    public C30633C0n() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        String stringValue = SettingsManager.INSTANCE.getStringValue(CustomPollVotingUrlNew.class);
        if (stringValue.length() == 0) {
            return CustomPollVotingUrlNew.DEFAULT;
        }
        return stringValue;
    }
}
