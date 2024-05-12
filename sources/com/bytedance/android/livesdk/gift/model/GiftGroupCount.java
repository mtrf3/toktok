package com.bytedance.android.livesdk.gift.model;

import X.InterfaceC65349Pkn;
import android.text.TextUtils;

/* loaded from: classes6.dex */
public class GiftGroupCount {

    @InterfaceC65349Pkn("group_count")
    public int groupCount;

    @InterfaceC65349Pkn("group_text")
    public String groupText;

    public final boolean equals(Object obj) {
        if (!(obj instanceof GiftGroupCount)) {
            return false;
        }
        GiftGroupCount giftGroupCount = (GiftGroupCount) obj;
        if (giftGroupCount.groupCount != this.groupCount || !TextUtils.equals(giftGroupCount.groupText, this.groupText)) {
            return false;
        }
        return true;
    }
}
