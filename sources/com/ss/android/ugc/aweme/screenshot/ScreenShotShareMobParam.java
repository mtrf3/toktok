package com.ss.android.ugc.aweme.screenshot;

import X.F9E;
import X.HH1;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class ScreenShotShareMobParam extends F9E {
    public final String enterFrom;
    public final String itemId;
    public final String itemType;

    public static /* synthetic */ ScreenShotShareMobParam copy$default(ScreenShotShareMobParam screenShotShareMobParam, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = screenShotShareMobParam.enterFrom;
        }
        if ((i & 2) != 0) {
            str2 = screenShotShareMobParam.itemId;
        }
        if ((i & 4) != 0) {
            str3 = screenShotShareMobParam.itemType;
        }
        return screenShotShareMobParam.copy(str, str2, str3);
    }

    public final ScreenShotShareMobParam copy(String enterFrom, String itemId, String itemType) {
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(itemId, "itemId");
        o.LJIIIZ(itemType, "itemType");
        return new ScreenShotShareMobParam(enterFrom, itemId, itemType);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.enterFrom, this.itemId, this.itemType};
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final String getItemId() {
        return this.itemId;
    }

    public final String getItemType() {
        return this.itemType;
    }

    public ScreenShotShareMobParam(String str, String str2, String str3) {
        HH1.LIZ(str, "enterFrom", str2, "itemId", str3, "itemType");
        this.enterFrom = str;
        this.itemId = str2;
        this.itemType = str3;
    }
}
