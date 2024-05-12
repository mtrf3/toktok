package com.bytedance.android.livesdk.chatroom.model.interact;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.chatroom.model.interact.TagV2;

/* loaded from: classes14.dex */
public final class _TagV2_SecondDegreeRelationContent_UserInfo_ProtoDecoder implements InterfaceC31105CIr<TagV2.SecondDegreeRelationContent.UserInfo> {
    public static TagV2.SecondDegreeRelationContent.UserInfo LIZIZ(Q9H q9h) {
        TagV2.SecondDegreeRelationContent.UserInfo userInfo = new TagV2.SecondDegreeRelationContent.UserInfo();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            userInfo.avatarThumb = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        userInfo.nickName = Q9J.LIZIZ(q9h);
                    }
                } else {
                    userInfo.userId = q9h.LJIIJJI();
                }
            } else {
                q9h.LJ(LIZJ);
                return userInfo;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final TagV2.SecondDegreeRelationContent.UserInfo LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
