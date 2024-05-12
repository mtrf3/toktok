package com.ss.android.ugc.aweme.ecommerce.mall.bean;

import X.C61878OQg;
import X.InterfaceC65349Pkn;
import X.WM7;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class MallFeedImpressionSaveRequest {

    @InterfaceC65349Pkn("feed_list")
    public final List<MallFeed> feedList;

    @InterfaceC65349Pkn(WM7.SCENE_SERVICE)
    public final String scene;

    public final List<MallFeed> getFeedList() {
        return this.feedList;
    }

    public final String getScene() {
        return this.scene;
    }

    public MallFeedImpressionSaveRequest(String scene, List<MallFeed> feedList) {
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(feedList, "feedList");
        this.scene = scene;
        this.feedList = feedList;
    }

    public MallFeedImpressionSaveRequest(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? C61878OQg.INSTANCE : list);
    }
}
