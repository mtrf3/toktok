package com.bytedance.android.livesdk.guide.model;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.guide.model.GuideInfoResponse;
import com.bytedance.android.livesdk.model.message.common._Text_ProtoDecoder;
import java.util.ArrayList;

/* loaded from: classes14.dex */
public final class _GuideInfoResponse_GuidePageResource_ProtoDecoder implements InterfaceC31105CIr<GuideInfoResponse.GuidePageResource> {
    public static GuideInfoResponse.GuidePageResource LIZIZ(Q9H q9h) {
        GuideInfoResponse.GuidePageResource guidePageResource = new GuideInfoResponse.GuidePageResource();
        guidePageResource.texts = new ArrayList();
        guidePageResource.animations = new ArrayList();
        guidePageResource.icons = new ArrayList();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        if (LJI != 3) {
                            Q9J.LIZJ(q9h);
                        } else {
                            guidePageResource.animations.add(_ImageModel_ProtoDecoder.LIZIZ(q9h));
                        }
                    } else {
                        guidePageResource.icons.add(_ImageModel_ProtoDecoder.LIZIZ(q9h));
                    }
                } else {
                    guidePageResource.texts.add(_Text_ProtoDecoder.LIZIZ(q9h));
                }
            } else {
                q9h.LJ(LIZJ);
                return guidePageResource;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final GuideInfoResponse.GuidePageResource LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
