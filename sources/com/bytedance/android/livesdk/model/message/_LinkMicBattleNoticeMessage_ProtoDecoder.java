package com.bytedance.android.livesdk.model.message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.model.message.battle._BattleNoticeAnchorGiftGuide_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.battle._BattleNoticeAnchorGuide_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.battle._BattleNoticeBubbleGuide_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.battle._BattleNoticeRuleGuide_ProtoDecoder;
import com.bytedance.android.livesdk.model.message.battle._BattleNoticeToast_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _LinkMicBattleNoticeMessage_ProtoDecoder implements InterfaceC31105CIr<LinkMicBattleNoticeMessage> {
    @Override // X.InterfaceC31105CIr
    public final LinkMicBattleNoticeMessage LIZ(Q9H q9h) {
        LinkMicBattleNoticeMessage linkMicBattleNoticeMessage = new LinkMicBattleNoticeMessage();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        linkMicBattleNoticeMessage.baseMessage = _CommonMessageData_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        linkMicBattleNoticeMessage.noticeType = q9h.LJIIJ();
                        break;
                    case 3:
                        linkMicBattleNoticeMessage.anchorGuide = _BattleNoticeAnchorGuide_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 4:
                        linkMicBattleNoticeMessage.toast = _BattleNoticeToast_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 5:
                        linkMicBattleNoticeMessage.bubbleGuide = _BattleNoticeBubbleGuide_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 6:
                        linkMicBattleNoticeMessage.anchorGiftGuide = _BattleNoticeAnchorGiftGuide_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 7:
                        linkMicBattleNoticeMessage.battleRuleGuide = _BattleNoticeRuleGuide_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 8:
                        linkMicBattleNoticeMessage.commonGuide = _BattleNoticeCommonGuide_ProtoDecoder.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return linkMicBattleNoticeMessage;
            }
        }
    }
}
