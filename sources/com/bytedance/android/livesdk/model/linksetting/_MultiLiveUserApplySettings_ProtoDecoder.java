package com.bytedance.android.livesdk.model.linksetting;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.liveinteract.multilive.model._RoomHostMultiGuestPermissionInfo_ProtoDecoder;
import webcast.data._RoomMultiGuestLinkmicInfo_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _MultiLiveUserApplySettings_ProtoDecoder implements InterfaceC31105CIr<MultiLiveUserApplySettings> {
    public static MultiLiveUserApplySettings LIZIZ(Q9H q9h) {
        MultiLiveUserApplySettings multiLiveUserApplySettings = new MultiLiveUserApplySettings();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        multiLiveUserApplySettings.multiLiveUserApplyPermission = _MultiLiveUserApplyPermission_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 2:
                        multiLiveUserApplySettings.linkMicServiceVersion = Integer.valueOf(q9h.LJIIJ());
                        break;
                    case 3:
                        multiLiveUserApplySettings.roomHostMultiGuestPermissionInfo = _RoomHostMultiGuestPermissionInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 4:
                        multiLiveUserApplySettings.tryOpenMultiGuest = Q9J.LIZ(q9h);
                        break;
                    case 5:
                        multiLiveUserApplySettings.roomAudienceMultiGuestPermissionInfo = _RoomAudienceMultiGuestPermissionInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 6:
                        multiLiveUserApplySettings.roomMultiGuestLinkmicInfo = _RoomMultiGuestLinkmicInfo_ProtoDecoder.LIZIZ(q9h);
                        break;
                    case 7:
                        multiLiveUserApplySettings.hostMultiGuestDevMode = q9h.LJIIJJI();
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return multiLiveUserApplySettings;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final MultiLiveUserApplySettings LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
