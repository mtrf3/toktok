package com.bytedance.android.livesdk.chatroom.api;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _SubGoalPinCard_ProtoDecoder implements InterfaceC31105CIr<SubGoalPinCard> {
    public static SubGoalPinCard LIZIZ(Q9H q9h) {
        SubGoalPinCard subGoalPinCard = new SubGoalPinCard();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                if (LJI != 5) {
                                    Q9J.LIZJ(q9h);
                                } else {
                                    subGoalPinCard.progress = q9h.LJIIJJI();
                                }
                            } else {
                                subGoalPinCard.target = q9h.LJIIJJI();
                            }
                        } else {
                            subGoalPinCard.desc = _SubPinCardText_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        subGoalPinCard.timeToLive = q9h.LJIIJJI();
                    }
                } else {
                    subGoalPinCard.goalId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return subGoalPinCard;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final SubGoalPinCard LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
