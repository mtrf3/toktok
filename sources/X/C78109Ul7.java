package X;

import com.bytedance.android.livesdk.livesetting.gift.GiftConfigParams;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftConfigParams;

/* renamed from: X.Ul7, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78109Ul7 extends AbstractC65781Prl implements InterfaceC65784Pro<GiftConfigParams> {
    public static final C78109Ul7 LJLIL = new C78109Ul7();

    public C78109Ul7() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final GiftConfigParams invoke() {
        return LiveGiftConfigParams.INSTANCE.getValue();
    }
}
