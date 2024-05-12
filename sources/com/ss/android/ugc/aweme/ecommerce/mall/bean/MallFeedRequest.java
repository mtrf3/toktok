package com.ss.android.ugc.aweme.ecommerce.mall.bean;

import X.C61878OQg;
import X.InterfaceC65349Pkn;
import X.WM7;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MallFeedRequest {

    @InterfaceC65349Pkn("context_product_ids")
    public final List<Long> contextProductIDS;

    @InterfaceC65349Pkn("cursor")
    public final int cursor;

    @InterfaceC65349Pkn("exposure_item_list")
    public final List<MallFeed> exposureItemList;

    @InterfaceC65349Pkn("related_gid")
    public final long relatedGID;

    @InterfaceC65349Pkn("request_type")
    public final int request_type;

    @InterfaceC65349Pkn(WM7.SCENE_SERVICE)
    public final String scene;

    @InterfaceC65349Pkn("session_id")
    public final String sessionId;

    @InterfaceC65349Pkn("size")
    public final int size;

    public final List<Long> getContextProductIDS() {
        return this.contextProductIDS;
    }

    public final int getCursor() {
        return this.cursor;
    }

    public final List<MallFeed> getExposureItemList() {
        return this.exposureItemList;
    }

    public final long getRelatedGID() {
        return this.relatedGID;
    }

    public final int getRequest_type() {
        return this.request_type;
    }

    public final String getScene() {
        return this.scene;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final int getSize() {
        return this.size;
    }

    public MallFeedRequest(String scene, int i, int i2, int i3, String str, long j, List<Long> contextProductIDS, List<MallFeed> exposureItemList) {
        o.LJIIIZ(scene, "scene");
        o.LJIIIZ(contextProductIDS, "contextProductIDS");
        o.LJIIIZ(exposureItemList, "exposureItemList");
        this.scene = scene;
        this.request_type = i;
        this.size = i2;
        this.cursor = i3;
        this.sessionId = str;
        this.relatedGID = j;
        this.contextProductIDS = contextProductIDS;
        this.exposureItemList = exposureItemList;
    }

    public MallFeedRequest(String str, int i, int i2, int i3, String str2, long j, List list, List list2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i2, i3, (i4 & 16) != 0 ? null : str2, (i4 & 32) != 0 ? 0L : j, (i4 & 64) != 0 ? C61878OQg.INSTANCE : list, (i4 & 128) != 0 ? C61878OQg.INSTANCE : list2);
    }
}
