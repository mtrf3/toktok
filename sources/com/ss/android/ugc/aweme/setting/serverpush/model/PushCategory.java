package com.ss.android.ugc.aweme.setting.serverpush.model;

import X.C48339Iy7;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes13.dex */
public final class PushCategory {
    public boolean LIZ;

    @InterfaceC65349Pkn("category_title")
    public final String categoryTitle = "";

    @InterfaceC65349Pkn("category_tips")
    public final String categoryTips = "";

    @InterfaceC65349Pkn("item_list")
    public final List<PushItem> itemList = new ArrayList();

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PushCategory(categoryTitle='");
        LIZ.append(this.categoryTitle);
        LIZ.append("', items=");
        LIZ.append(this.itemList);
        LIZ.append(", checkFriendOnlyStatus=");
        return C48339Iy7.LIZJ(LIZ, this.LIZ, ')', LIZ);
    }
}
