package X;

import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TZN extends AbstractC65781Prl implements InterfaceC88472Yns<LinkPlayerInfo, Boolean> {
    public static final TZN LJLIL = new TZN();

    public TZN() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(LinkPlayerInfo linkPlayerInfo) {
        LinkPlayerInfo it = linkPlayerInfo;
        o.LJIIIZ(it, "it");
        return Boolean.valueOf(it.isLastMeetGiftScoreThresholdApplier);
    }
}
