package X;

import com.bytedance.android.livesdk.livesetting.gift.GiftUnlockExperiment;

/* renamed from: X.CHj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31071CHj extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C31071CHj LJLIL = new C31071CHj();

    public C31071CHj() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(GiftUnlockExperiment.showLock());
    }
}
