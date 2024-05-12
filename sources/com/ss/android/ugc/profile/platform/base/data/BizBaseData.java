package com.ss.android.ugc.profile.platform.base.data;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes5.dex */
public class BizBaseData implements Serializable {

    @InterfaceC65349Pkn("describe")
    public Describe describe;

    @InterfaceC65349Pkn("icon")
    public Icon icon;

    public final Describe getDescribe() {
        return this.describe;
    }

    public final Icon getIcon() {
        return this.icon;
    }

    public final void setDescribe(Describe describe) {
        this.describe = describe;
    }

    public final void setIcon(Icon icon) {
        this.icon = icon;
    }
}
