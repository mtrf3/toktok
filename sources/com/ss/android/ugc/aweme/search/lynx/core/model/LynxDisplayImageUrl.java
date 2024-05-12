package com.ss.android.ugc.aweme.search.lynx.core.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class LynxDisplayImageUrl implements Serializable {
    public static final int $stable = 8;

    @InterfaceC65349Pkn("hot_list")
    public List<LynxImageUrl> hotList = new ArrayList();

    @InterfaceC65349Pkn("image")
    public String imageUrl;

    public final List<LynxImageUrl> getHotList() {
        return this.hotList;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final void setHotList(List<LynxImageUrl> list) {
        o.LJIIIZ(list, "<set-?>");
        this.hotList = list;
    }

    public final void setImageUrl(String str) {
        this.imageUrl = str;
    }
}
