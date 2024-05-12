package com.bytedance.android.livesdk.chatroom.model.interact;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes14.dex */
public final class _TagV2_ProtoDecoder implements InterfaceC31105CIr<TagV2> {
    public static TagV2 LIZIZ(Q9H q9h) {
        TagV2 tagV2 = new TagV2();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            if (LJI != 4) {
                                if (LJI != 10) {
                                    if (LJI != 11) {
                                        Q9J.LIZJ(q9h);
                                    } else {
                                        tagV2.cohostHistoryDay = q9h.LJIIJJI();
                                    }
                                } else {
                                    tagV2.secondDegreeRelationContent = _TagV2_SecondDegreeRelationContent_ProtoDecoder.LIZIZ(q9h);
                                }
                            } else {
                                tagV2.starlingKey = Q9J.LIZIZ(q9h);
                            }
                        } else {
                            tagV2.tagValue = Q9J.LIZIZ(q9h);
                        }
                    } else {
                        tagV2.tagType = q9h.LJIIJ();
                    }
                } else {
                    tagV2.tagClassification = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return tagV2;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final TagV2 LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
