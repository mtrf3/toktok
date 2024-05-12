package com.bytedance.android.livesdkapi.message;

import X.C30957CCz;
import X.CD6;
import X.InterfaceC64604PXc;

/* loaded from: classes16.dex */
public final class ImEnterRoom_ProtoEncoder implements InterfaceC64604PXc<ImEnterRoom> {
    @Override // X.InterfaceC64604PXc
    public final void LIZ(CD6 cd6, ImEnterRoom imEnterRoom) {
        ImEnterRoom imEnterRoom2 = imEnterRoom;
        long j = imEnterRoom2.roomId;
        cd6.LIZLLL(1, 0);
        cd6.LJFF(j);
        C30957CCz.LIZLLL(cd6, 2, imEnterRoom2.roomTag);
        C30957CCz.LIZLLL(cd6, 3, imEnterRoom2.liveRegion);
        long j2 = imEnterRoom2.liveId;
        cd6.LIZLLL(4, 0);
        cd6.LJFF(j2);
        C30957CCz.LIZLLL(cd6, 5, imEnterRoom2.identity);
        C30957CCz.LIZLLL(cd6, 6, imEnterRoom2.cursor);
        long j3 = imEnterRoom2.accountType;
        cd6.LIZLLL(7, 0);
        cd6.LJFF(j3);
        long j4 = imEnterRoom2.enterUniqueId;
        cd6.LIZLLL(8, 0);
        cd6.LJFF(j4);
        C30957CCz.LIZLLL(cd6, 9, imEnterRoom2.filterWelcomeMsg);
    }
}
