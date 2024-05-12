package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.WM7;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class WriteImpressionRequest {

    @InterfaceC65349Pkn("feed_list")
    public final List<Feed> feeds;

    @InterfaceC65349Pkn(WM7.SCENE_SERVICE)
    public final String scene;

    /* JADX WARN: Multi-variable type inference failed */
    public WriteImpressionRequest() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WriteImpressionRequest)) {
            return false;
        }
        WriteImpressionRequest writeImpressionRequest = (WriteImpressionRequest) obj;
        return o.LJ(this.scene, writeImpressionRequest.scene) && o.LJ(this.feeds, writeImpressionRequest.feeds);
    }

    public final int hashCode() {
        String str = this.scene;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<Feed> list = this.feeds;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("WriteImpressionRequest(scene=");
        LIZ.append(this.scene);
        LIZ.append(", feeds=");
        return C1NE.LIZIZ(LIZ, this.feeds, ')', LIZ);
    }

    public WriteImpressionRequest(String str, List<Feed> list) {
        this.scene = str;
        this.feeds = list;
    }

    public /* synthetic */ WriteImpressionRequest(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list);
    }
}
