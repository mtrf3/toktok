package com.bytedance.android.livesdk.subscribe.model.invite;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _GetInvitationStatusResponse_ProtoDecoder implements InterfaceC31105CIr<GetInvitationStatusResponse> {
    @Override // X.InterfaceC31105CIr
    public final GetInvitationStatusResponse LIZ(Q9H q9h) {
        GetInvitationStatusResponse getInvitationStatusResponse = new GetInvitationStatusResponse();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 50) {
                            if (LJI != 100) {
                                if (LJI != 101) {
                                    Q9J.LIZJ(q9h);
                                } else {
                                    getInvitationStatusResponse.inviterInfo = _User_ProtoDecoder.LIZIZ(q9h);
                                }
                            } else {
                                getInvitationStatusResponse.selfInfo = _User_ProtoDecoder.LIZIZ(q9h);
                            }
                        } else {
                            getInvitationStatusResponse.switcher = _SubInvitationFunctionSwitcher_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        getInvitationStatusResponse.inviteeStatus = _SubInvitationInviteeStatus_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    getInvitationStatusResponse.inviteCodeData = _SubInvitationCode_ProtoDecoder.LIZIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return getInvitationStatusResponse;
            }
        }
    }
}
