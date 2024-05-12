package com.bytedance.android.livesdk.subscribe.model.invite;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class _SubInvitationListData_ProtoDecoder implements InterfaceC31105CIr<SubInvitationListData> {
    @Override // X.InterfaceC31105CIr
    public final SubInvitationListData LIZ(Q9H q9h) {
        SubInvitationListData subInvitationListData = new SubInvitationListData();
        subInvitationListData.invitationCodeList = new ArrayList();
        subInvitationListData.invitersInfo = new HashMap();
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
                                    long LIZJ2 = q9h.LIZJ();
                                    String str = null;
                                    User user = null;
                                    while (true) {
                                        int LJI2 = q9h.LJI();
                                        if (LJI2 == -1) {
                                            break;
                                        }
                                        if (LJI2 != 1) {
                                            if (LJI2 == 2) {
                                                user = _User_ProtoDecoder.LIZIZ(q9h);
                                            }
                                        } else {
                                            str = Q9J.LIZIZ(q9h);
                                        }
                                    }
                                    q9h.LJ(LIZJ2);
                                    if (str != null) {
                                        if (user != null) {
                                            subInvitationListData.invitersInfo.put(str, user);
                                        } else {
                                            throw new IllegalStateException("Map value must not be null!");
                                        }
                                    } else {
                                        throw new IllegalStateException("Map key must not be null!");
                                    }
                                }
                            } else {
                                subInvitationListData.selfInfo = _User_ProtoDecoder.LIZIZ(q9h);
                            }
                        } else {
                            subInvitationListData.switcher = _SubInvitationFunctionSwitcher_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        subInvitationListData.totalCount = q9h.LJIIJ();
                    }
                } else {
                    subInvitationListData.invitationCodeList.add(_SubInvitationCode_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return subInvitationListData;
            }
        }
    }
}
