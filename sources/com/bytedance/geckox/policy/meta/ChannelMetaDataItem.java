package com.bytedance.geckox.policy.meta;

import X.C53783L8x;
import java.io.Serializable;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class ChannelMetaDataItem implements Serializable {
    public static final C53783L8x Companion = new C53783L8x();
    public static final long serialVersionUID = 1;
    public Map<String, String> bizExtra;

    public final Map<String, String> getBizExtra() {
        return this.bizExtra;
    }

    public ChannelMetaDataItem(Map<String, String> bizExtra) {
        o.LJIIJ(bizExtra, "bizExtra");
        this.bizExtra = bizExtra;
    }

    public final void setBizExtra(Map<String, String> map) {
        o.LJIIJ(map, "<set-?>");
        this.bizExtra = map;
    }
}
