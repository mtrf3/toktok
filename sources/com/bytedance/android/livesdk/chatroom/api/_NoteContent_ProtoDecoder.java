package com.bytedance.android.livesdk.chatroom.api;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _NoteContent_ProtoDecoder implements InterfaceC31105CIr<NoteContent> {
    public static NoteContent LIZIZ(Q9H q9h) {
        NoteContent noteContent = new NoteContent();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                if (LJI != 5) {
                                    Q9J.LIZJ(q9h);
                                } else {
                                    noteContent.noteTimeMs = q9h.LJIIJJI();
                                }
                            } else {
                                noteContent.noteContentDisplayOrder = q9h.LJIIJ();
                            }
                        } else {
                            noteContent.noteContentImage = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        noteContent.noteContentText = Q9J.LIZIZ(q9h);
                    }
                } else {
                    noteContent.noteContentType = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return noteContent;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final NoteContent LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
