package X;

import com.bytedance.android.livesdk.livesetting.gift.LiveGiftPanelShowOptSetting;

/* renamed from: X.CpX, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32519CpX extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C32519CpX LJLIL = new C32519CpX();

    public C32519CpX() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(LiveGiftPanelShowOptSetting.INSTANCE.getValue());
    }
}
