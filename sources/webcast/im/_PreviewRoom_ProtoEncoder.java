package webcast.im;

import X.C30957CCz;
import X.CD6;
import X.InterfaceC64604PXc;

/* loaded from: classes16.dex */
public final class _PreviewRoom_ProtoEncoder implements InterfaceC64604PXc<PreviewRoom> {
    @Override // X.InterfaceC64604PXc
    public final void LIZ(CD6 cd6, PreviewRoom previewRoom) {
        PreviewRoom previewRoom2 = previewRoom;
        long j = previewRoom2.roomId;
        cd6.LIZLLL(1, 0);
        cd6.LJFF(j);
        long j2 = previewRoom2.liveId;
        cd6.LIZLLL(2, 0);
        cd6.LJFF(j2);
        C30957CCz.LIZLLL(cd6, 3, previewRoom2.identity);
        C30957CCz.LIZLLL(cd6, 4, previewRoom2.cursor);
        long j3 = previewRoom2.accountType;
        cd6.LIZLLL(5, 0);
        cd6.LJFF(j3);
        long j4 = previewRoom2.enterUniqId;
        cd6.LIZLLL(6, 0);
        cd6.LJFF(j4);
    }
}
