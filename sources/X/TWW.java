package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;

/* loaded from: classes14.dex */
public final class TWW extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public static final TWW LJLIL = new TWW();

    public TWW() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        MultiGuestDataHolder multiGuestDataHolder;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings;
        EnumC74991Tbv LJJ;
        String businessType;
        Object LIZ = C75559Tl5.LIZIZ.LIZ("MULTI_GUEST_DATA_HOLDER");
        if (!(LIZ instanceof MultiGuestDataHolder) || (multiGuestDataHolder = (MultiGuestDataHolder) LIZ) == null || (multiLiveAnchorPanelSettings = multiGuestDataHolder.LJIIJ) == null || (LJJ = C86793Y4n.LJJ(multiLiveAnchorPanelSettings)) == null || (businessType = LJJ.getBusinessType()) == null) {
            return "";
        }
        return businessType;
    }
}
