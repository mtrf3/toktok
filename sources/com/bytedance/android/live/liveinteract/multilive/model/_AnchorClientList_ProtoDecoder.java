package com.bytedance.android.live.liveinteract.multilive.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;
import tikcast.linkmic.controller._AnchorMessage_ProtoDecoder;

/* loaded from: classes14.dex */
public final class _AnchorClientList_ProtoDecoder implements InterfaceC31105CIr<AnchorClientList> {
    public static AnchorClientList LIZIZ(Q9H q9h) {
        AnchorClientList anchorClientList = new AnchorClientList();
        anchorClientList.readyUsers = new ArrayList();
        anchorClientList.rtcUsers = new ArrayList();
        anchorClientList.applyUsers = new ArrayList();
        anchorClientList.inviteUsers = new ArrayList();
        anchorClientList.linkUsers = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                switch (LJI) {
                    case 1:
                        anchorClientList.rtcUsers.add(_WaitUser_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 2:
                        anchorClientList.applyUsers.add(_WaitUser_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 3:
                        anchorClientList.inviteUsers.add(_WaitUser_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 4:
                        anchorClientList.readyUsers.add(_WaitUser_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 5:
                        anchorClientList.linkUsers.add(_LinkedUser_ProtoDecoder.LIZIZ(q9h));
                        break;
                    case 6:
                        anchorClientList.anchorMessage = _AnchorMessage_ProtoDecoder.LIZIZ(q9h);
                        break;
                    default:
                        Q9J.LIZJ(q9h);
                        break;
                }
            } else {
                q9h.LJ(LIZJ);
                return anchorClientList;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final AnchorClientList LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
