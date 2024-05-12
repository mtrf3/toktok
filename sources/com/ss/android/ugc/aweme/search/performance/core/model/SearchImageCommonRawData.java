package com.ss.android.ugc.aweme.search.performance.core.model;

import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.search.lynx.core.model.LynxImageUrl;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class SearchImageCommonRawData implements Serializable {
    public static final int $stable = 8;

    @InterfaceC65349Pkn(alternate = {"music_list", "display"}, value = "user_list")
    public List<LynxImageUrl> lynxImageUrl = new ArrayList();

    public final List<LynxImageUrl> getLynxImageUrl() {
        return this.lynxImageUrl;
    }

    public final void setLynxImageUrl(List<LynxImageUrl> list) {
        o.LJIIIZ(list, "<set-?>");
        this.lynxImageUrl = list;
    }
}
