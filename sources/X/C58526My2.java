package X;

import com.bytedance.android.livesdk.livesetting.gift.LiveFirstRechargeGiftIapidSetting;

/* renamed from: X.My2, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58526My2 extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public static final C58526My2 LJLIL = new C58526My2();

    public C58526My2() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        return LiveFirstRechargeGiftIapidSetting.INSTANCE.getValue();
    }
}
