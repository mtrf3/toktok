package X;

import com.bytedance.android.livesdk.livesetting.game.partnership.GameLivePartnershipDropsSetting;

/* renamed from: X.BxJ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30453BxJ extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C30453BxJ LJLIL = new C30453BxJ();

    public C30453BxJ() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(GameLivePartnershipDropsSetting.INSTANCE.getConfig().dropsPreviewShowCnt);
    }
}
