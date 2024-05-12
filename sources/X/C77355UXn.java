package X;

import com.bytedance.android.livesdk.livesetting.gift.HotWordGiftSettings;
import com.bytedance.android.livesdk.livesetting.gift.HotWordGiftStruct;

/* renamed from: X.UXn, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77355UXn extends AbstractC65781Prl implements InterfaceC65784Pro<HotWordGiftStruct.FrequencyControl> {
    public static final C77355UXn LJLIL = new C77355UXn();

    public C77355UXn() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final HotWordGiftStruct.FrequencyControl invoke() {
        return HotWordGiftSettings.INSTANCE.getFrequencyControl();
    }
}
