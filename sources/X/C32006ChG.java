package X;

import com.bytedance.android.livesdk.ExclusiveGiftUnlockEvent;
import com.bytedance.android.livesdk.api.revenue.level.IUserLevelService;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.GiftLockInfo;
import com.bytedance.android.livesdk.widgets.giftwidget.GiftWidget;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;

/* renamed from: X.ChG, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32006ChG extends AbstractC32474Coo {
    public final /* synthetic */ C32005ChF LIZ;

    @Override // X.AbstractC32474Coo
    public final void LIZIZ() {
    }

    public C32006ChG(C32005ChF c32005ChF) {
        this.LIZ = c32005ChF;
    }

    @Override // X.AbstractC32474Coo
    public final void LIZJ(List list) {
        List<GiftPage> list2;
        List<GiftPage> list3;
        if (this.LIZ.LIZJ != null) {
            if (list == null) {
                list2 = C61878OQg.INSTANCE;
            } else {
                list2 = list;
            }
            for (GiftPage giftPage : list2) {
                if (giftPage.pageType == 15 && giftPage.display) {
                    for (Gift gift : giftPage.gifts) {
                        GiftLockInfo giftLockInfo = gift.giftSubInfo;
                        if (giftLockInfo != null) {
                            C32005ChF c32005ChF = this.LIZ;
                            if (giftLockInfo.mLockType == 1 && !giftLockInfo.mLock) {
                                DataChannel dataChannel = c32005ChF.LIZ;
                                if (dataChannel != null) {
                                    dataChannel.qv0(ExclusiveGiftUnlockEvent.class, gift);
                                }
                                ((IUserLevelService) CN1.LIZ(IUserLevelService.class)).Un(gift.id);
                            }
                        }
                    }
                }
            }
            InterfaceC31765CdN interfaceC31765CdN = this.LIZ.LIZJ;
            if (list != null) {
                list3 = ORZ.LLJILJILJ(list);
            } else {
                list3 = null;
            }
            ((GiftWidget) interfaceC31765CdN).LLFFF(list3);
        }
    }
}
