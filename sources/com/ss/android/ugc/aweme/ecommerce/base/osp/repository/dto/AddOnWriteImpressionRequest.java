package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.C61878OQg;
import X.F9E;
import X.InterfaceC65349Pkn;
import X.WM7;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AddOnWriteImpressionRequest extends F9E implements Serializable {

    @InterfaceC65349Pkn("feed_list")
    public final List<AddOnFeed> feedList;

    @InterfaceC65349Pkn(WM7.SCENE_SERVICE)
    public final String scene;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AddOnWriteImpressionRequest copy$default(AddOnWriteImpressionRequest addOnWriteImpressionRequest, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = addOnWriteImpressionRequest.scene;
        }
        if ((i & 2) != 0) {
            list = addOnWriteImpressionRequest.feedList;
        }
        return addOnWriteImpressionRequest.copy(str, list);
    }

    public final AddOnWriteImpressionRequest copy(String scene, List<AddOnFeed> feedList) {
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(feedList, "feedList");
        return new AddOnWriteImpressionRequest(scene, feedList);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.scene, this.feedList};
    }

    public final List<AddOnFeed> getFeedList() {
        return this.feedList;
    }

    public final String getScene() {
        return this.scene;
    }

    public AddOnWriteImpressionRequest(String scene, List<AddOnFeed> feedList) {
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(feedList, "feedList");
        this.scene = scene;
        this.feedList = feedList;
    }

    public AddOnWriteImpressionRequest(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? C61878OQg.INSTANCE : list);
    }
}
