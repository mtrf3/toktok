package X;

import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.livesdk.api.revenue.treasurebox.ITreasureBoxService;
import com.bytedance.android.livesdk.livesetting.portal.PortalFeatureSetting;
import com.bytedance.android.livesdk.model.message.LinkMicBattleItemCard;
import com.bytedance.android.livesdk.model.message.TeamUsersInfo;
import com.bytedance.android.livesdk.model.message.UseCriticalStrikeCard;
import com.bytedance.android.livesdk.model.message.UseSmokeCard;
import com.bytedance.android.livesdk.model.message.redenvelope.MessageRedEnvelopInfo;
import com.bytedance.android.livesdk.model.message.redenvelope.RedEnvelopMessage;
import com.ss.ugc.live.sdk.message.data.IMessage;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Bjt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29621Bjt implements InterfaceC31330CRi {
    public final /* synthetic */ int LIZ;

    public /* synthetic */ C29621Bjt(int i) {
        this.LIZ = i;
    }

    @Override // X.InterfaceC31330CRi
    public final boolean LIZ(IMessage iMessage, CQQ context) {
        List<? extends TeamUsersInfo> list;
        Long l;
        List<? extends TeamUsersInfo> list2;
        Long l2;
        Integer num;
        switch (this.LIZ) {
            case 0:
                LinkMicBattleItemCard message = (LinkMicBattleItemCard) iMessage;
                o.LJIIIZ(message, "message");
                o.LJIIIZ(context, "context");
                if (message.msgType == 2) {
                    UseCriticalStrikeCard useCriticalStrikeCard = message.useCriticalStrikeCard;
                    if (useCriticalStrikeCard != null && useCriticalStrikeCard.anchorId == context.LJIILLIIL) {
                        return false;
                    }
                    if (C76265TwT.LJIILJJIL == EnumC76330TxW.MATCH_TYPE_2V2 && (list2 = C76265TwT.LIZ.LJIL) != null) {
                        for (TeamUsersInfo teamUsersInfo : list2) {
                            if (teamUsersInfo.userIds != null) {
                                HashSet hashSet = new HashSet(teamUsersInfo.userIds);
                                if (hashSet.contains(Long.valueOf(context.LJIILLIIL))) {
                                    UseCriticalStrikeCard useCriticalStrikeCard2 = message.useCriticalStrikeCard;
                                    if (useCriticalStrikeCard2 != null) {
                                        l2 = Long.valueOf(useCriticalStrikeCard2.anchorId);
                                    } else {
                                        l2 = null;
                                    }
                                    if (hashSet.contains(l2)) {
                                        return false;
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                    }
                }
                if (message.msgType == 3) {
                    UseSmokeCard useSmokeCard = message.useSmokeCard;
                    if (useSmokeCard != null && useSmokeCard.anchorId == context.LJIILLIIL) {
                        return false;
                    }
                    if (C76265TwT.LJIILJJIL == EnumC76330TxW.MATCH_TYPE_2V2 && (list = C76265TwT.LIZ.LJIL) != null) {
                        for (TeamUsersInfo teamUsersInfo2 : list) {
                            if (teamUsersInfo2.userIds != null) {
                                HashSet hashSet2 = new HashSet(teamUsersInfo2.userIds);
                                if (hashSet2.contains(Long.valueOf(context.LJIILLIIL))) {
                                    UseSmokeCard useSmokeCard2 = message.useSmokeCard;
                                    if (useSmokeCard2 != null) {
                                        l = Long.valueOf(useSmokeCard2.anchorId);
                                    } else {
                                        l = null;
                                    }
                                    if (hashSet2.contains(l)) {
                                        return false;
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                    }
                }
                if (message.isLocalInsertMsg) {
                    return false;
                }
                return true;
            default:
                RedEnvelopMessage message2 = (RedEnvelopMessage) iMessage;
                o.LJIIIZ(message2, "message");
                o.LJIIIZ(context, "context");
                MessageRedEnvelopInfo messageRedEnvelopInfo = message2.envelopeInfo;
                if (messageRedEnvelopInfo != null && (num = messageRedEnvelopInfo.businessType) != null) {
                    if (num.intValue() == 4) {
                        message2.LJLIL = PortalFeatureSetting.INSTANCE.getValue();
                    } else if (num.intValue() == 1 || num.intValue() == 2) {
                        message2.LJLIL = ((IGiftService) CN1.LIZ(IGiftService.class)).enableRedEnvelope();
                    } else if (num.intValue() == 9) {
                        message2.LJLIL = ((IGiftService) CN1.LIZ(IGiftService.class)).enablePlatformPortal();
                    }
                    return !message2.LJLIL;
                }
                message2.LJLIL = ((ITreasureBoxService) CN1.LIZ(ITreasureBoxService.class)).tg();
                return !message2.LJLIL;
        }
    }
}
