package com.bytedance.android.livesdkapi.message;

import X.CD6;
import X.InterfaceC64604PXc;

/* loaded from: classes16.dex */
public final class HeartBeat_ProtoEncoder implements InterfaceC64604PXc<HeartBeat> {
    @Override // X.InterfaceC64604PXc
    public final void LIZ(CD6 cd6, HeartBeat heartBeat) {
        HeartBeat heartBeat2 = heartBeat;
        long j = heartBeat2.roomId;
        cd6.LIZLLL(1, 0);
        cd6.LJFF(j);
        long j2 = heartBeat2.sendPacketSeqId;
        cd6.LIZLLL(2, 0);
        cd6.LJFF(j2);
    }
}
