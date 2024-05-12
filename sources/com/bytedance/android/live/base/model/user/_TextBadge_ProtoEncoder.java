package com.bytedance.android.live.base.model.user;

import X.C30957CCz;
import X.CD6;
import X.InterfaceC64604PXc;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* loaded from: classes.dex */
public final class _TextBadge_ProtoEncoder implements InterfaceC64604PXc<TextBadge> {
    public static int LIZJ(TextBadge textBadge) {
        int LJIIL = C30957CCz.LJIIL(3, textBadge.defaultPattern) + C30957CCz.LJIIL(2, textBadge.key) + C30957CCz.LJI(1, textBadge.badgeDisplayType);
        List<String> list = textBadge.pieces;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < textBadge.pieces.size(); i++) {
                LJIIL += C30957CCz.LJIIL(4, (String) ListProtector.get(textBadge.pieces, i));
            }
        }
        return LJIIL;
    }

    public static void LIZIZ(CD6 cd6, TextBadge textBadge) {
        int i = textBadge.badgeDisplayType;
        cd6.LIZLLL(1, 0);
        cd6.LIZJ(i);
        C30957CCz.LIZLLL(cd6, 2, textBadge.key);
        C30957CCz.LIZLLL(cd6, 3, textBadge.defaultPattern);
        List<String> list = textBadge.pieces;
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < textBadge.pieces.size(); i2++) {
                C30957CCz.LIZLLL(cd6, 4, (String) ListProtector.get(textBadge.pieces, i2));
            }
        }
    }

    @Override // X.InterfaceC64604PXc
    public final void LIZ(CD6 cd6, TextBadge textBadge) {
        LIZIZ(cd6, textBadge);
    }
}
