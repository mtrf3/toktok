package com.bytedance.android.livesdk.chatroom.api;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;

/* loaded from: classes6.dex */
public final class _CommunityContent_ProtoDecoder implements InterfaceC31105CIr<CommunityContent> {
    public static CommunityContent LIZIZ(Q9H q9h) {
        CommunityContent communityContent = new CommunityContent();
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
                                    communityContent.titleTemplateId = Q9J.LIZIZ(q9h);
                                }
                            } else {
                                communityContent.communityContentDisplayOrder = q9h.LJIIJ();
                            }
                        } else {
                            communityContent.communityContentImage = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        communityContent.communityContentText = Q9J.LIZIZ(q9h);
                    }
                } else {
                    communityContent.communityContentType = q9h.LJIIJ();
                }
            } else {
                q9h.LJ(LIZJ);
                return communityContent;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final CommunityContent LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
