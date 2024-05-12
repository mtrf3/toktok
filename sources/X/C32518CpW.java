package X;

import com.bytedance.android.livesdk.livesetting.gift.LiveGiftColorSetting;

/* renamed from: X.CpW, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32518CpW extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C32518CpW LJLIL = new C32518CpW();

    public C32518CpW() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(LiveGiftColorSetting.INSTANCE.getValue());
    }
}
