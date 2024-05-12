package com.bytedance.android.live.base.model.user;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;

/* loaded from: classes.dex */
public final class _ProjectionConfig_ProtoDecoder implements InterfaceC31105CIr<ProjectionConfig> {
    public static ProjectionConfig LIZIZ(Q9H q9h) {
        ProjectionConfig projectionConfig = new ProjectionConfig();
        long LIZJ = q9h.LIZJ();
        while (true) {
            int LJI = q9h.LJI();
            if (LJI != -1) {
                if (LJI != 1) {
                    if (LJI != 2) {
                        Q9J.LIZJ(q9h);
                    } else {
                        projectionConfig.icon = _ImageModel_ProtoDecoder.LIZIZ(q9h);
                    }
                } else {
                    projectionConfig.useProjection = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return projectionConfig;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final ProjectionConfig LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
