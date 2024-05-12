package com.bytedance.android.live.base.model.user;

import X.C30957CCz;
import X.CD6;
import X.InterfaceC64604PXc;
import com.bytedance.android.live.base.model._ImageModel_ProtoEncoder;

/* loaded from: classes.dex */
public final class _CombineBadgeStruct_ProtoEncoder implements InterfaceC64604PXc<CombineBadgeStruct> {
    public static int LIZJ(CombineBadgeStruct combineBadgeStruct) {
        int LIZ;
        int LIZ2;
        int LIZ3;
        int LIZ4;
        int LIZ5;
        int i = 0;
        int LJ = _ImageModel_ProtoEncoder.LJ(2, combineBadgeStruct.icon) + C30957CCz.LJI(1, combineBadgeStruct.badgeDisplayType);
        BadgeText badgeText = combineBadgeStruct.text;
        if (badgeText == null) {
            LIZ = 0;
        } else {
            int LIZJ = _BadgeText_ProtoEncoder.LIZJ(badgeText);
            LIZ = CD6.LIZ(3) + CD6.LIZIZ(LIZJ) + LIZJ;
        }
        int LJIIL = C30957CCz.LJIIL(4, combineBadgeStruct.str) + LJ + LIZ;
        PaddingInfo paddingInfo = combineBadgeStruct.padding;
        if (paddingInfo == null) {
            LIZ2 = 0;
        } else {
            int LIZJ2 = _PaddingInfo_ProtoEncoder.LIZJ(paddingInfo);
            LIZ2 = CD6.LIZ(5) + CD6.LIZIZ(LIZJ2) + LIZJ2;
        }
        int i2 = LIZ2 + LJIIL;
        FontStyle fontStyle = combineBadgeStruct.fontStyle;
        if (fontStyle == null) {
            LIZ3 = 0;
        } else {
            int LIZJ3 = _FontStyle_ProtoEncoder.LIZJ(fontStyle);
            LIZ3 = CD6.LIZ(6) + CD6.LIZIZ(LIZJ3) + LIZJ3;
        }
        int i3 = LIZ3 + i2;
        ProfileCardPanel profileCardPanel = combineBadgeStruct.profileCardPanel;
        if (profileCardPanel == null) {
            LIZ4 = 0;
        } else {
            int LIZJ4 = _ProfileCardPanel_ProtoEncoder.LIZJ(profileCardPanel);
            LIZ4 = CD6.LIZ(7) + CD6.LIZIZ(LIZJ4) + LIZJ4;
        }
        int LJII = C30957CCz.LJII(18, combineBadgeStruct.multiGuestShowStyle) + C30957CCz.LJII(17, combineBadgeStruct.rankListOnlineAudienceShowStyle) + C30957CCz.LJII(16, combineBadgeStruct.personalCardShowStyle) + C30957CCz.LJII(15, combineBadgeStruct.publicScreenShowStyle) + C30957CCz.LJFF(14, combineBadgeStruct.bgAutoMirrored) + C30957CCz.LJFF(13, combineBadgeStruct.iconAutoMirrored) + _CombineBadgeBackground_ProtoEncoder.LIZLLL(12, combineBadgeStruct.backgroundDarkMode) + _CombineBadgeBackground_ProtoEncoder.LIZLLL(11, combineBadgeStruct.background) + i3 + LIZ4;
        ArrowConfig arrowConfig = combineBadgeStruct.arrowConfig;
        if (arrowConfig == null) {
            LIZ5 = 0;
        } else {
            int LJ2 = _ImageModel_ProtoEncoder.LJ(1, arrowConfig.icon);
            LIZ5 = CD6.LIZ(19) + CD6.LIZIZ(LJ2) + LJ2;
        }
        int i4 = LJII + LIZ5;
        PaddingInfo paddingInfo2 = combineBadgeStruct.paddingNewFont;
        if (paddingInfo2 != null) {
            int LIZJ5 = _PaddingInfo_ProtoEncoder.LIZJ(paddingInfo2);
            i = CD6.LIZ(20) + CD6.LIZIZ(LIZJ5) + LIZJ5;
        }
        return i + i4;
    }

    public static void LIZIZ(CD6 cd6, CombineBadgeStruct combineBadgeStruct) {
        int i = combineBadgeStruct.badgeDisplayType;
        cd6.LIZLLL(1, 0);
        cd6.LIZJ(i);
        _ImageModel_ProtoEncoder.LIZJ(cd6, 2, combineBadgeStruct.icon);
        BadgeText badgeText = combineBadgeStruct.text;
        if (badgeText != null) {
            cd6.LIZLLL(3, 2);
            cd6.LJ(_BadgeText_ProtoEncoder.LIZJ(badgeText));
            _BadgeText_ProtoEncoder.LIZIZ(cd6, badgeText);
        }
        C30957CCz.LIZLLL(cd6, 4, combineBadgeStruct.str);
        PaddingInfo paddingInfo = combineBadgeStruct.padding;
        if (paddingInfo != null) {
            cd6.LIZLLL(5, 2);
            cd6.LJ(_PaddingInfo_ProtoEncoder.LIZJ(paddingInfo));
            _PaddingInfo_ProtoEncoder.LIZIZ(cd6, paddingInfo);
        }
        FontStyle fontStyle = combineBadgeStruct.fontStyle;
        if (fontStyle != null) {
            cd6.LIZLLL(6, 2);
            cd6.LJ(_FontStyle_ProtoEncoder.LIZJ(fontStyle));
            _FontStyle_ProtoEncoder.LIZIZ(cd6, fontStyle);
        }
        ProfileCardPanel profileCardPanel = combineBadgeStruct.profileCardPanel;
        if (profileCardPanel != null) {
            cd6.LIZLLL(7, 2);
            cd6.LJ(_ProfileCardPanel_ProtoEncoder.LIZJ(profileCardPanel));
            _ProfileCardPanel_ProtoEncoder.LIZIZ(cd6, profileCardPanel);
        }
        _CombineBadgeBackground_ProtoEncoder.LIZIZ(cd6, 11, combineBadgeStruct.background);
        _CombineBadgeBackground_ProtoEncoder.LIZIZ(cd6, 12, combineBadgeStruct.backgroundDarkMode);
        C30957CCz.LIZ(cd6, 13, combineBadgeStruct.iconAutoMirrored);
        C30957CCz.LIZ(cd6, 14, combineBadgeStruct.bgAutoMirrored);
        C30957CCz.LIZIZ(cd6, 15, combineBadgeStruct.publicScreenShowStyle);
        C30957CCz.LIZIZ(cd6, 16, combineBadgeStruct.personalCardShowStyle);
        C30957CCz.LIZIZ(cd6, 17, combineBadgeStruct.rankListOnlineAudienceShowStyle);
        C30957CCz.LIZIZ(cd6, 18, combineBadgeStruct.multiGuestShowStyle);
        ArrowConfig arrowConfig = combineBadgeStruct.arrowConfig;
        if (arrowConfig != null) {
            cd6.LIZLLL(19, 2);
            cd6.LJ(_ImageModel_ProtoEncoder.LJ(1, arrowConfig.icon));
            _ImageModel_ProtoEncoder.LIZJ(cd6, 1, arrowConfig.icon);
        }
        PaddingInfo paddingInfo2 = combineBadgeStruct.paddingNewFont;
        if (paddingInfo2 == null) {
            return;
        }
        cd6.LIZLLL(20, 2);
        cd6.LJ(_PaddingInfo_ProtoEncoder.LIZJ(paddingInfo2));
        _PaddingInfo_ProtoEncoder.LIZIZ(cd6, paddingInfo2);
    }

    @Override // X.InterfaceC64604PXc
    public final void LIZ(CD6 cd6, CombineBadgeStruct combineBadgeStruct) {
        LIZIZ(cd6, combineBadgeStruct);
    }
}
