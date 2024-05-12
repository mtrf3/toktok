package com.bytedance.android.live.base.model.user;

import X.C30957CCz;
import X.CD6;
import X.InterfaceC64604PXc;
import com.bytedance.android.live.base.model._ImageModel_ProtoEncoder;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* loaded from: classes.dex */
public final class _ProfileContent_ProtoEncoder implements InterfaceC64604PXc<ProfileContent> {
    public static int LIZJ(ProfileContent profileContent) {
        int LIZ;
        int LJ = C30957CCz.LJ(1);
        int i = 0;
        List<IconConfig> list = profileContent.iconList;
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < profileContent.iconList.size(); i2++) {
                IconConfig iconConfig = (IconConfig) ListProtector.get(profileContent.iconList, i2);
                if (iconConfig == null) {
                    LIZ = 0;
                } else {
                    int LIZLLL = _CombineBadgeBackground_ProtoEncoder.LIZLLL(2, iconConfig.background) + _ImageModel_ProtoEncoder.LJ(1, iconConfig.icon);
                    LIZ = CD6.LIZ(2) + CD6.LIZIZ(LIZLLL) + LIZLLL;
                }
                LJ += LIZ;
            }
        }
        NumberConfig numberConfig = profileContent.numberConfig;
        if (numberConfig != null) {
            int LIZIZ = _NumberConfig_ProtoEncoder.LIZIZ(numberConfig);
            i = CD6.LIZ(3) + CD6.LIZIZ(LIZIZ) + LIZIZ;
        }
        return LJ + i;
    }

    public static void LIZIZ(CD6 cd6, ProfileContent profileContent) {
        boolean z = profileContent.useContent;
        cd6.LIZLLL(1, 0);
        cd6.LJ(z ? 1 : 0);
        List<IconConfig> list = profileContent.iconList;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < profileContent.iconList.size(); i++) {
                IconConfig iconConfig = (IconConfig) ListProtector.get(profileContent.iconList, i);
                if (iconConfig != null) {
                    cd6.LIZLLL(2, 2);
                    cd6.LJ(_CombineBadgeBackground_ProtoEncoder.LIZLLL(2, iconConfig.background) + _ImageModel_ProtoEncoder.LJ(1, iconConfig.icon));
                    _ImageModel_ProtoEncoder.LIZJ(cd6, 1, iconConfig.icon);
                    _CombineBadgeBackground_ProtoEncoder.LIZIZ(cd6, 2, iconConfig.background);
                }
            }
        }
        NumberConfig numberConfig = profileContent.numberConfig;
        if (numberConfig == null) {
            return;
        }
        cd6.LIZLLL(3, 2);
        cd6.LJ(_NumberConfig_ProtoEncoder.LIZIZ(numberConfig));
        long j = numberConfig.number;
        cd6.LIZLLL(1, 0);
        cd6.LJFF(j);
        FontStyle fontStyle = numberConfig.fontStyle;
        if (fontStyle != null) {
            cd6.LIZLLL(2, 2);
            cd6.LJ(_FontStyle_ProtoEncoder.LIZJ(fontStyle));
            _FontStyle_ProtoEncoder.LIZIZ(cd6, fontStyle);
        }
        _CombineBadgeBackground_ProtoEncoder.LIZIZ(cd6, 3, numberConfig.background);
    }

    @Override // X.InterfaceC64604PXc
    public final void LIZ(CD6 cd6, ProfileContent profileContent) {
        LIZIZ(cd6, profileContent);
    }
}
