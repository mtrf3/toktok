package X;

import com.bytedance.android.livesdk.livesetting.gift.LiveFirstRechargeGiftIapidSetting;

/* renamed from: X.My3, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58527My3 extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public static final C58527My3 LJLIL = new C58527My3();

    public C58527My3() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        return LiveFirstRechargeGiftIapidSetting.INSTANCE.getValue();
    }
}
