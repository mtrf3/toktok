package X;

import com.bytedance.android.livesdk.livesetting.other.GiftPanelOpenPredictService;
import com.bytedance.android.livesdk.livesetting.other.LiveClientAISettings;

/* renamed from: X.1sT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C46731sT extends AbstractC65781Prl implements InterfaceC65784Pro<GiftPanelOpenPredictService> {
    public static final C46731sT LJLIL = new C46731sT();

    public C46731sT() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final GiftPanelOpenPredictService invoke() {
        return LiveClientAISettings.INSTANCE.aiServices().giftPanelOpenPredictService;
    }
}
