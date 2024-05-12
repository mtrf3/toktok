package X;

import com.bytedance.android.livesdk.livesetting.roomfunction.LiveDrawGuessExitMessageCountdownSetting;

/* renamed from: X.1sC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C46561sC extends AbstractC65781Prl implements InterfaceC65784Pro<Long> {
    public static final C46561sC LJLIL = new C46561sC();

    public C46561sC() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        return Long.valueOf(LiveDrawGuessExitMessageCountdownSetting.INSTANCE.getCountdownTime());
    }
}
