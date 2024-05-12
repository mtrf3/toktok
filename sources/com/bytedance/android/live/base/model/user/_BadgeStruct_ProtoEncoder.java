package com.bytedance.android.live.base.model.user;

import X.C30957CCz;
import X.CD6;
import X.InterfaceC64604PXc;
import com.bytedance.android.live.base.model._ImageModel_ProtoEncoder;

/* loaded from: classes.dex */
public final class _BadgeStruct_ProtoEncoder implements InterfaceC64604PXc<BadgeStruct> {
    public static int LIZJ(BadgeStruct badgeStruct) {
        int LIZ;
        int LIZ2;
        int LIZ3;
        int i = 0;
        int LJ = _PrivilegeLogExtra_ProtoEncoder.LJ(12, badgeStruct.logExtra) + C30957CCz.LJ(11) + C30957CCz.LJIIL(10, badgeStruct.schemaUrl) + C30957CCz.LJI(7, badgeStruct.exhibitionType) + C30957CCz.LJIIIZ(6, badgeStruct.greyedByClient) + C30957CCz.LJII(5, badgeStruct.displayStatus) + C30957CCz.LJII(4, badgeStruct.position) + C30957CCz.LJI(3, badgeStruct.badgeScene) + C30957CCz.LJI(2, badgeStruct.badgePriorityType) + C30957CCz.LJI(1, badgeStruct.badgeDisplayType);
        ImageBadge imageBadge = badgeStruct.imageBadge;
        if (imageBadge == null) {
            LIZ = 0;
        } else {
            int LJ2 = _ImageModel_ProtoEncoder.LJ(2, imageBadge.imageModel) + C30957CCz.LJI(1, imageBadge.badgeDisplayType);
            LIZ = CD6.LIZ(20) + CD6.LIZIZ(LJ2) + LJ2;
        }
        int i2 = LJ + LIZ;
        TextBadge textBadge = badgeStruct.textBadge;
        if (textBadge == null) {
            LIZ2 = 0;
        } else {
            int LIZJ = _TextBadge_ProtoEncoder.LIZJ(textBadge);
            LIZ2 = CD6.LIZ(21) + CD6.LIZIZ(LIZJ) + LIZJ;
        }
        int i3 = i2 + LIZ2;
        StringBadge stringBadge = badgeStruct.stringBadge;
        if (stringBadge == null) {
            LIZ3 = 0;
        } else {
            int LJIIL = C30957CCz.LJIIL(2, stringBadge.contentStr) + C30957CCz.LJI(1, stringBadge.badgeDisplayType);
            LIZ3 = CD6.LIZ(22) + CD6.LIZIZ(LJIIL) + LJIIL;
        }
        int i4 = i3 + LIZ3;
        CombineBadgeStruct combineBadgeStruct = badgeStruct.combineBadgeStruct;
        if (combineBadgeStruct != null) {
            int LIZJ2 = _CombineBadgeStruct_ProtoEncoder.LIZJ(combineBadgeStruct);
            i = CD6.LIZ(23) + CD6.LIZIZ(LIZJ2) + LIZJ2;
        }
        return i4 + i;
    }

    public static void LIZIZ(CD6 cd6, BadgeStruct badgeStruct) {
        int i = badgeStruct.badgeDisplayType;
        cd6.LIZLLL(1, 0);
        cd6.LIZJ(i);
        int i2 = badgeStruct.badgePriorityType;
        cd6.LIZLLL(2, 0);
        cd6.LIZJ(i2);
        int i3 = badgeStruct.badgeScene;
        cd6.LIZLLL(3, 0);
        cd6.LIZJ(i3);
        C30957CCz.LIZIZ(cd6, 4, badgeStruct.position);
        C30957CCz.LIZIZ(cd6, 5, badgeStruct.displayStatus);
        long j = badgeStruct.greyedByClient;
        cd6.LIZLLL(6, 0);
        cd6.LJFF(j);
        int i4 = badgeStruct.exhibitionType;
        cd6.LIZLLL(7, 0);
        cd6.LIZJ(i4);
        C30957CCz.LIZLLL(cd6, 10, badgeStruct.schemaUrl);
        boolean z = badgeStruct.display;
        cd6.LIZLLL(11, 0);
        cd6.LJ(z ? 1 : 0);
        _PrivilegeLogExtra_ProtoEncoder.LIZJ(cd6, 12, badgeStruct.logExtra);
        ImageBadge imageBadge = badgeStruct.imageBadge;
        if (imageBadge != null) {
            cd6.LIZLLL(20, 2);
            cd6.LJ(_ImageModel_ProtoEncoder.LJ(2, imageBadge.imageModel) + C30957CCz.LJI(1, imageBadge.badgeDisplayType));
            int i5 = imageBadge.badgeDisplayType;
            cd6.LIZLLL(1, 0);
            cd6.LIZJ(i5);
            _ImageModel_ProtoEncoder.LIZJ(cd6, 2, imageBadge.imageModel);
        }
        TextBadge textBadge = badgeStruct.textBadge;
        if (textBadge != null) {
            cd6.LIZLLL(21, 2);
            cd6.LJ(_TextBadge_ProtoEncoder.LIZJ(textBadge));
            _TextBadge_ProtoEncoder.LIZIZ(cd6, textBadge);
        }
        StringBadge stringBadge = badgeStruct.stringBadge;
        if (stringBadge != null) {
            cd6.LIZLLL(22, 2);
            cd6.LJ(C30957CCz.LJIIL(2, stringBadge.contentStr) + C30957CCz.LJI(1, stringBadge.badgeDisplayType));
            int i6 = stringBadge.badgeDisplayType;
            cd6.LIZLLL(1, 0);
            cd6.LIZJ(i6);
            C30957CCz.LIZLLL(cd6, 2, stringBadge.contentStr);
        }
        CombineBadgeStruct combineBadgeStruct = badgeStruct.combineBadgeStruct;
        if (combineBadgeStruct == null) {
            return;
        }
        cd6.LIZLLL(23, 2);
        cd6.LJ(_CombineBadgeStruct_ProtoEncoder.LIZJ(combineBadgeStruct));
        _CombineBadgeStruct_ProtoEncoder.LIZIZ(cd6, combineBadgeStruct);
    }

    @Override // X.InterfaceC64604PXc
    public final void LIZ(CD6 cd6, BadgeStruct badgeStruct) {
        LIZIZ(cd6, badgeStruct);
    }
}
