package com.bytedance.android.live.effect;

import X.C0TY;
import X.C12880ey;
import X.C2A9;
import X.C2AA;
import X.C2AB;
import X.C2AC;
import X.C36636EZk;
import X.C42681lw;
import X.C48841JEv;
import X.XKX;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class LiveEffectTestHelper {
    public static final LiveEffectTestHelper INSTANCE = new LiveEffectTestHelper();

    public static final void removeEffect() {
        C42681lw LIZ = C12880ey.LIZ();
        String STICKER = C0TY.LIZIZ;
        o.LJIIIIZZ(STICKER, "STICKER");
        LIZ.LIZLLL(STICKER);
    }

    public static final void removeFilter() {
        C12880ey.LIZ().LIZLLL("livefiltercomposer");
    }

    public static final void removeMakeUp() {
        C42681lw LIZ = C12880ey.LIZ();
        String SMALL_ITEM_BEAUTY_PANEL = C0TY.LIZLLL;
        o.LJIIIIZZ(SMALL_ITEM_BEAUTY_PANEL, "SMALL_ITEM_BEAUTY_PANEL");
        for (LiveEffect liveEffect : LIZ.LJIIIIZZ(SMALL_ITEM_BEAUTY_PANEL)) {
            if (liveEffect.isExclusive && !liveEffect.isSubItem()) {
                C42681lw LIZ2 = C12880ey.LIZ();
                String SMALL_ITEM_BEAUTY_PANEL2 = C0TY.LIZLLL;
                o.LJIIIIZZ(SMALL_ITEM_BEAUTY_PANEL2, "SMALL_ITEM_BEAUTY_PANEL");
                LIZ2.LJIILL(liveEffect, SMALL_ITEM_BEAUTY_PANEL2);
            }
        }
    }

    public static final void setEffect(String resourceId, String tabKey) {
        o.LJIIIZ(resourceId, "resourceId");
        o.LJIIIZ(tabKey, "tabKey");
        XKX.LIZLLL(C48841JEv.LIZ(C36636EZk.LIZ), null, null, new C2A9(resourceId, tabKey, null), 3);
    }

    public static final void updateFilter(String resourceId, int i) {
        o.LJIIIZ(resourceId, "resourceId");
        XKX.LIZLLL(C48841JEv.LIZ(C36636EZk.LIZ), null, null, new C2AB(resourceId, i, null), 3);
    }

    public static final void updateBeauty(String resourceId, String tabKey, int i) {
        o.LJIIIZ(resourceId, "resourceId");
        o.LJIIIZ(tabKey, "tabKey");
        XKX.LIZLLL(C48841JEv.LIZ(C36636EZk.LIZ), null, null, new C2AA(i, resourceId, tabKey, null), 3);
    }

    public static final void updateMakeUp(String resourceId, String tabKey, int i) {
        o.LJIIIZ(resourceId, "resourceId");
        o.LJIIIZ(tabKey, "tabKey");
        XKX.LIZLLL(C48841JEv.LIZ(C36636EZk.LIZ), null, null, new C2AC(i, resourceId, tabKey, null), 3);
    }
}
