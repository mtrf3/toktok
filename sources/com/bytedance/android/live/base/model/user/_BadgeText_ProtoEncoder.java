package com.bytedance.android.live.base.model.user;

import X.C30957CCz;
import X.CD6;
import X.InterfaceC64604PXc;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* loaded from: classes.dex */
public final class _BadgeText_ProtoEncoder implements InterfaceC64604PXc<BadgeText> {
    public static int LIZJ(BadgeText badgeText) {
        int LJIIL = C30957CCz.LJIIL(2, badgeText.defaultPattern) + C30957CCz.LJIIL(1, badgeText.key);
        List<String> list = badgeText.pieces;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < badgeText.pieces.size(); i++) {
                LJIIL += C30957CCz.LJIIL(3, (String) ListProtector.get(badgeText.pieces, i));
            }
        }
        return LJIIL;
    }

    public static void LIZIZ(CD6 cd6, BadgeText badgeText) {
        C30957CCz.LIZLLL(cd6, 1, badgeText.key);
        C30957CCz.LIZLLL(cd6, 2, badgeText.defaultPattern);
        List<String> list = badgeText.pieces;
        if (list != null && !list.isEmpty()) {
            for (int i = 0; i < badgeText.pieces.size(); i++) {
                C30957CCz.LIZLLL(cd6, 3, (String) ListProtector.get(badgeText.pieces, i));
            }
        }
    }

    @Override // X.InterfaceC64604PXc
    public final void LIZ(CD6 cd6, BadgeText badgeText) {
        LIZIZ(cd6, badgeText);
    }
}
