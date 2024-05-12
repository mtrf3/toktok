package com.bytedance.android.livesdk.model.message.common;

import X.C30957CCz;
import X.CD6;
import X.InterfaceC64604PXc;
import com.bytedance.android.live.base.model._ImageModel_ProtoEncoder;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user._User_ProtoEncoder;

/* loaded from: classes6.dex */
public final class _TextPiece_ProtoEncoder implements InterfaceC64604PXc<TextPiece> {
    public static int LIZJ(TextPiece textPiece) {
        int LIZ;
        int LIZ2;
        int LIZ3;
        int LIZ4;
        int LIZ5;
        int LIZ6;
        int LJI = C30957CCz.LJI(1, textPiece.type);
        int i = 0;
        TextFormat textFormat = textPiece.format;
        if (textFormat == null) {
            LIZ = 0;
        } else {
            int LIZJ = _TextFormat_ProtoEncoder.LIZJ(textFormat);
            LIZ = CD6.LIZ(2) + CD6.LIZIZ(LIZJ) + LIZJ;
        }
        int LJIIL = C30957CCz.LJIIL(11, textPiece.stringValue) + LIZ + LJI;
        TextPieceUser textPieceUser = textPiece.userValue;
        if (textPieceUser == null) {
            LIZ3 = 0;
        } else {
            User user = textPieceUser.user;
            if (user == null) {
                LIZ2 = 0;
            } else {
                int LIZJ2 = _User_ProtoEncoder.LIZJ(user);
                LIZ2 = CD6.LIZ(1) + CD6.LIZIZ(LIZJ2) + LIZJ2;
            }
            int LJ = C30957CCz.LJ(2) + LIZ2;
            LIZ3 = CD6.LIZ(21) + CD6.LIZIZ(LJ) + LJ;
        }
        int i2 = LJIIL + LIZ3;
        TextPieceGift textPieceGift = textPiece.giftValue;
        if (textPieceGift == null) {
            LIZ4 = 0;
        } else {
            int LIZJ3 = _TextPieceGift_ProtoEncoder.LIZJ(textPieceGift);
            LIZ4 = CD6.LIZ(22) + CD6.LIZIZ(LIZJ3) + LIZJ3;
        }
        int i3 = i2 + LIZ4;
        TextPieceHeart textPieceHeart = textPiece.heartValue;
        if (textPieceHeart == null) {
            LIZ5 = 0;
        } else {
            int LJIIL2 = C30957CCz.LJIIL(1, textPieceHeart.color);
            LIZ5 = CD6.LIZ(23) + CD6.LIZIZ(LJIIL2) + LJIIL2;
        }
        int i4 = i3 + LIZ5;
        TextPiecePatternRef textPiecePatternRef = textPiece.patternRefValue;
        if (textPiecePatternRef == null) {
            LIZ6 = 0;
        } else {
            int LJIIL3 = C30957CCz.LJIIL(2, textPiecePatternRef.defaultPattern) + C30957CCz.LJIIL(1, textPiecePatternRef.key);
            LIZ6 = CD6.LIZ(24) + CD6.LIZIZ(LJIIL3) + LJIIL3;
        }
        int i5 = i4 + LIZ6;
        TextPieceImage textPieceImage = textPiece.imageValue;
        if (textPieceImage != null) {
            int LJ2 = _ImageModel_ProtoEncoder.LJ(1, textPieceImage.imageModel);
            i = CD6.LIZ(25) + CD6.LIZIZ(LJ2) + LJ2;
        }
        return i5 + i;
    }

    public static void LIZIZ(CD6 cd6, TextPiece textPiece) {
        int LIZ;
        int i = textPiece.type;
        cd6.LIZLLL(1, 0);
        cd6.LIZJ(i);
        TextFormat textFormat = textPiece.format;
        if (textFormat != null) {
            cd6.LIZLLL(2, 2);
            cd6.LJ(_TextFormat_ProtoEncoder.LIZJ(textFormat));
            _TextFormat_ProtoEncoder.LIZIZ(cd6, textFormat);
        }
        C30957CCz.LIZLLL(cd6, 11, textPiece.stringValue);
        TextPieceUser textPieceUser = textPiece.userValue;
        if (textPieceUser != null) {
            cd6.LIZLLL(21, 2);
            User user = textPieceUser.user;
            if (user == null) {
                LIZ = 0;
            } else {
                int LIZJ = _User_ProtoEncoder.LIZJ(user);
                LIZ = CD6.LIZ(1) + CD6.LIZIZ(LIZJ) + LIZJ;
            }
            cd6.LJ(C30957CCz.LJ(2) + LIZ);
            User user2 = textPieceUser.user;
            if (user2 != null) {
                cd6.LIZLLL(1, 2);
                cd6.LJ(_User_ProtoEncoder.LIZJ(user2));
                _User_ProtoEncoder.LIZIZ(cd6, user2);
            }
            boolean z = textPieceUser.withColon;
            cd6.LIZLLL(2, 0);
            cd6.LJ(z ? 1 : 0);
        }
        TextPieceGift textPieceGift = textPiece.giftValue;
        if (textPieceGift != null) {
            cd6.LIZLLL(22, 2);
            cd6.LJ(_TextPieceGift_ProtoEncoder.LIZJ(textPieceGift));
            _TextPieceGift_ProtoEncoder.LIZIZ(cd6, textPieceGift);
        }
        TextPieceHeart textPieceHeart = textPiece.heartValue;
        if (textPieceHeart != null) {
            cd6.LIZLLL(23, 2);
            cd6.LJ(C30957CCz.LJIIL(1, textPieceHeart.color));
            C30957CCz.LIZLLL(cd6, 1, textPieceHeart.color);
        }
        TextPiecePatternRef textPiecePatternRef = textPiece.patternRefValue;
        if (textPiecePatternRef != null) {
            cd6.LIZLLL(24, 2);
            cd6.LJ(C30957CCz.LJIIL(2, textPiecePatternRef.defaultPattern) + C30957CCz.LJIIL(1, textPiecePatternRef.key));
            C30957CCz.LIZLLL(cd6, 1, textPiecePatternRef.key);
            C30957CCz.LIZLLL(cd6, 2, textPiecePatternRef.defaultPattern);
        }
        TextPieceImage textPieceImage = textPiece.imageValue;
        if (textPieceImage == null) {
            return;
        }
        cd6.LIZLLL(25, 2);
        cd6.LJ(_ImageModel_ProtoEncoder.LJ(1, textPieceImage.imageModel));
        _ImageModel_ProtoEncoder.LIZJ(cd6, 1, textPieceImage.imageModel);
    }

    @Override // X.InterfaceC64604PXc
    public final void LIZ(CD6 cd6, TextPiece textPiece) {
        LIZIZ(cd6, textPiece);
    }
}
