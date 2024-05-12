package com.bytedance.android.livesdk.model.message.linker.linked_list_change_message;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import java.util.ArrayList;

/* loaded from: classes14.dex */
public final class _LinkedListChangeContent_ProtoDecoder implements InterfaceC31105CIr<LinkedListChangeContent> {
    public static LinkedListChangeContent LIZIZ(Q9H q9h) {
        LinkedListChangeContent linkedListChangeContent = new LinkedListChangeContent();
        linkedListChangeContent.listUsers = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    Q9J.LIZJ(q9h);
                } else {
                    linkedListChangeContent.listUsers.add(_ListUser_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return linkedListChangeContent;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final LinkedListChangeContent LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
