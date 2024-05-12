package com.bytedance.android.livesdk.game.model;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes6.dex */
public class CreateHighLightResult extends F9E {

    @InterfaceC65349Pkn("fragment_id")
    public long fragmentId;

    @InterfaceC65349Pkn("fragment_id_str")
    public String fragmentIdStr;

    @InterfaceC65349Pkn("title")
    public String title;

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Long.valueOf(this.fragmentId), this.fragmentIdStr, this.title};
    }
}
