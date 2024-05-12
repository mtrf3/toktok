package com.bytedance.android.livesdk.chatroom.interact.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* loaded from: classes14.dex */
public final class _AnchorLinkmicUserSettings_ProtoDecoder implements InterfaceC31105CIr<AnchorLinkmicUserSettings> {
    public static AnchorLinkmicUserSettings LIZIZ(Q9H q9h) {
        AnchorLinkmicUserSettings anchorLinkmicUserSettings = new AnchorLinkmicUserSettings();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        anchorLinkmicUserSettings.isTurnOn = Q9J.LIZ(q9h);
                        break;
                    case 2:
                        anchorLinkmicUserSettings.acceptMultiLinkmic = Q9J.LIZ(q9h);
                        break;
                    case 3:
                        anchorLinkmicUserSettings.acceptNotFollowerInvite = Q9J.LIZ(q9h);
                        break;
                    case 4:
                        anchorLinkmicUserSettings.allowGiftToOtherAnchors = Q9J.LIZ(q9h);
                        break;
                    case 5:
                        anchorLinkmicUserSettings.blockInvitationOfThisLive = Q9J.LIZ(q9h);
                        break;
                    case 6:
                        anchorLinkmicUserSettings.receiveFriendMultiHostInvites = Q9J.LIZ(q9h);
                        break;
                    case 7:
                        anchorLinkmicUserSettings.receiveFriendMultiHostApplication = Q9J.LIZ(q9h);
                        break;
                    case 8:
                        anchorLinkmicUserSettings.blockThisMultiHostInvites = Q9J.LIZ(q9h);
                        break;
                    case 9:
                        anchorLinkmicUserSettings.blockThisMultiHostApplication = Q9J.LIZ(q9h);
                        break;
                    case 10:
                        anchorLinkmicUserSettings.receiveNotFriendMultiHostInvites = Q9J.LIZ(q9h);
                        break;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                        anchorLinkmicUserSettings.receiveNotFriendMultiHostApplication = Q9J.LIZ(q9h);
                        break;
                    case 12:
                        anchorLinkmicUserSettings.allowLiveNoticeOfFriends = Q9J.LIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return anchorLinkmicUserSettings;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final AnchorLinkmicUserSettings LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
