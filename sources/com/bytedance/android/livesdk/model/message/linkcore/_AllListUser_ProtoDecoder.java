package com.bytedance.android.livesdk.model.message.linkcore;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes14.dex */
public final class _AllListUser_ProtoDecoder implements InterfaceC31105CIr<AllListUser> {
    public static AllListUser LIZIZ(Q9H q9h) {
        AllListUser allListUser = new AllListUser();
        allListUser.appliedList = new ArrayList();
        allListUser.linkedList = new ArrayList();
        allListUser.readyList = new ArrayList();
        allListUser.invitedList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 2) {
                    if (LJI != 3) {
                        if (LJI != 4) {
                            if (LJI != 5) {
                                Q9J.LIZJ(q9h);
                            } else {
                                allListUser.readyList.add(_LinkLayerListUser_ProtoDecoder.LIZIZ(q9h));
                            }
                        } else {
                            allListUser.invitedList.add(_LinkLayerListUser_ProtoDecoder.LIZIZ(q9h));
                        }
                    } else {
                        allListUser.appliedList.add(_LinkLayerListUser_ProtoDecoder.LIZIZ(q9h));
                    }
                } else {
                    allListUser.linkedList.add(_LinkLayerListUser_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return allListUser;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final AllListUser LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
