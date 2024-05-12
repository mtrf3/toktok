package X;

import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3PerfSetting;

/* renamed from: X.UBm, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76782UBm extends AbstractC65781Prl implements InterfaceC65784Pro<UBG> {
    public static final C76782UBm LJLIL = new C76782UBm();

    public C76782UBm() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final UBG invoke() {
        if (MultiGuestV3PerfSetting.INSTANCE.getValue()) {
            return new C76783UBn();
        }
        return new C76784UBo();
    }
}
