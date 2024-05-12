package com.bytedance.android.livesdk.chatroom.model.interact;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.livesdk.chatroom.model.interact.TagV2;
import java.util.ArrayList;

/* loaded from: classes14.dex */
public final class _TagV2_SecondDegreeRelationContent_ProtoDecoder implements InterfaceC31105CIr<TagV2.SecondDegreeRelationContent> {
    public static TagV2.SecondDegreeRelationContent LIZIZ(Q9H q9h) {
        TagV2.SecondDegreeRelationContent secondDegreeRelationContent = new TagV2.SecondDegreeRelationContent();
        secondDegreeRelationContent.relatedUsers = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        secondDegreeRelationContent.totalRelatedUserCnt = q9h.LJIIJJI();
                    }
                } else {
                    secondDegreeRelationContent.relatedUsers.add(_TagV2_SecondDegreeRelationContent_UserInfo_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return secondDegreeRelationContent;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final TagV2.SecondDegreeRelationContent LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
