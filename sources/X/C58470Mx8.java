package X;

import com.bytedance.android.livesdk.livesetting.gift.LiveGiftFeedEffectPlayForYouTabSetting;

/* renamed from: X.Mx8, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58470Mx8 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C58470Mx8 LJLIL = new C58470Mx8();

    public C58470Mx8() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(LiveGiftFeedEffectPlayForYouTabSetting.INSTANCE.getValue());
    }
}
