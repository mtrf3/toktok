package com.bytedance.android.live.base.model.user;

import X.C30957CCz;
import X.CD6;
import X.InterfaceC64604PXc;
import com.bytedance.android.live.base.model._ImageModel_ProtoEncoder;

/* loaded from: classes.dex */
public final class _ProfileCardPanel_ProtoEncoder implements InterfaceC64604PXc<ProfileCardPanel> {
    public static int LIZJ(ProfileCardPanel profileCardPanel) {
        int LIZ;
        int LIZ2;
        int i = 0;
        int LJI = C30957CCz.LJI(2, profileCardPanel.badgeTextPosition) + C30957CCz.LJ(1);
        ProjectionConfig projectionConfig = profileCardPanel.projectionConfig;
        if (projectionConfig == null) {
            LIZ = 0;
        } else {
            int LJ = _ImageModel_ProtoEncoder.LJ(2, projectionConfig.icon) + C30957CCz.LJ(1);
            LIZ = CD6.LIZ(3) + CD6.LIZIZ(LJ) + LJ;
        }
        int i2 = LJI + LIZ;
        ProfileContent profileContent = profileCardPanel.profileContent;
        if (profileContent == null) {
            LIZ2 = 0;
        } else {
            int LIZJ = _ProfileContent_ProtoEncoder.LIZJ(profileContent);
            LIZ2 = CD6.LIZ(4) + CD6.LIZIZ(LIZJ) + LIZJ;
        }
        int i3 = i2 + LIZ2;
        SeparatorConfig separatorConfig = profileCardPanel.separatorConfig;
        if (separatorConfig != null) {
            int LJIIL = C30957CCz.LJIIL(1, separatorConfig.color);
            i = CD6.LIZ(5) + CD6.LIZIZ(LJIIL) + LJIIL;
        }
        return i3 + i;
    }

    public static void LIZIZ(CD6 cd6, ProfileCardPanel profileCardPanel) {
        boolean z = profileCardPanel.useNewProfileCardStyle;
        cd6.LIZLLL(1, 0);
        cd6.LJ(z ? 1 : 0);
        int i = profileCardPanel.badgeTextPosition;
        cd6.LIZLLL(2, 0);
        cd6.LIZJ(i);
        ProjectionConfig projectionConfig = profileCardPanel.projectionConfig;
        if (projectionConfig != null) {
            cd6.LIZLLL(3, 2);
            cd6.LJ(_ImageModel_ProtoEncoder.LJ(2, projectionConfig.icon) + C30957CCz.LJ(1));
            boolean z2 = projectionConfig.useProjection;
            cd6.LIZLLL(1, 0);
            cd6.LJ(z2 ? 1 : 0);
            _ImageModel_ProtoEncoder.LIZJ(cd6, 2, projectionConfig.icon);
        }
        ProfileContent profileContent = profileCardPanel.profileContent;
        if (profileContent != null) {
            cd6.LIZLLL(4, 2);
            cd6.LJ(_ProfileContent_ProtoEncoder.LIZJ(profileContent));
            _ProfileContent_ProtoEncoder.LIZIZ(cd6, profileContent);
        }
        SeparatorConfig separatorConfig = profileCardPanel.separatorConfig;
        if (separatorConfig == null) {
            return;
        }
        cd6.LIZLLL(5, 2);
        cd6.LJ(C30957CCz.LJIIL(1, separatorConfig.color));
        C30957CCz.LIZLLL(cd6, 1, separatorConfig.color);
    }

    @Override // X.InterfaceC64604PXc
    public final void LIZ(CD6 cd6, ProfileCardPanel profileCardPanel) {
        LIZIZ(cd6, profileCardPanel);
    }
}
