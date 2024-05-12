package com.bytedance.android.live.base.model.user;

import X.CD6;
import X.InterfaceC64604PXc;
import com.bytedance.android.live.base.model._ImageModel_ProtoEncoder;

/* loaded from: classes.dex */
public final class _ProjectionConfig_ProtoEncoder implements InterfaceC64604PXc<ProjectionConfig> {
    @Override // X.InterfaceC64604PXc
    public final void LIZ(CD6 cd6, ProjectionConfig projectionConfig) {
        ProjectionConfig projectionConfig2 = projectionConfig;
        boolean z = projectionConfig2.useProjection;
        cd6.LIZLLL(1, 0);
        cd6.LJ(z ? 1 : 0);
        _ImageModel_ProtoEncoder.LIZJ(cd6, 2, projectionConfig2.icon);
    }
}
