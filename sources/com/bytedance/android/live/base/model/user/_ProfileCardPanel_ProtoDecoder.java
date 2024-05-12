package com.bytedance.android.live.base.model.user;

import X.InterfaceC31105CIr;
import X.Q9H;
import X.Q9J;

/* loaded from: classes.dex */
public final class _ProfileCardPanel_ProtoDecoder implements InterfaceC31105CIr<ProfileCardPanel> {
    public static ProfileCardPanel LIZIZ(Q9H q9h) {
        ProfileCardPanel profileCardPanel = new ProfileCardPanel();
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
                                    profileCardPanel.separatorConfig = _SeparatorConfig_ProtoDecoder.LIZIZ(q9h);
                                }
                            } else {
                                profileCardPanel.profileContent = _ProfileContent_ProtoDecoder.LIZIZ(q9h);
                            }
                        } else {
                            profileCardPanel.projectionConfig = _ProjectionConfig_ProtoDecoder.LIZIZ(q9h);
                        }
                    } else {
                        profileCardPanel.badgeTextPosition = q9h.LJIIJ();
                    }
                } else {
                    profileCardPanel.useNewProfileCardStyle = Q9J.LIZ(q9h);
                }
            } else {
                q9h.LJ(LIZJ);
                return profileCardPanel;
            }
        }
    }

    @Override // X.InterfaceC31105CIr
    public final ProfileCardPanel LIZ(Q9H q9h) {
        return LIZIZ(q9h);
    }
}
