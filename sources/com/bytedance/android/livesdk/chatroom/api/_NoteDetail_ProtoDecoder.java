package com.bytedance.android.livesdk.chatroom.api;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class _NoteDetail_ProtoDecoder implements InterfaceC31105CIr<NoteDetail> {
    public static NoteDetail LIZIZ(Q9H q9h) {
        NoteDetail noteDetail = new NoteDetail();
        noteDetail.noteContentList = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        noteDetail.noteVersion = q9h.LJIIJJI();
                    }
                } else {
                    noteDetail.noteContentList.add(_NoteContent_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return noteDetail;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final NoteDetail LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
