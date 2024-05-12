package com.ss.android.ugc.aweme.feed.model;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class CaptionVideoPlayerListModel implements Serializable {

    @InterfaceC65349Pkn("list")
    public final List<CaptionVideoPlayerItemModel> list;

    /* JADX WARN: Multi-variable type inference failed */
    public CaptionVideoPlayerListModel() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CaptionVideoPlayerListModel copy$default(CaptionVideoPlayerListModel captionVideoPlayerListModel, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = captionVideoPlayerListModel.list;
        }
        return captionVideoPlayerListModel.copy(list);
    }

    public final CaptionVideoPlayerListModel copy(List<CaptionVideoPlayerItemModel> list) {
        return new CaptionVideoPlayerListModel(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CaptionVideoPlayerListModel) && o.LJ(this.list, ((CaptionVideoPlayerListModel) obj).list);
    }

    public int hashCode() {
        List<CaptionVideoPlayerItemModel> list = this.list;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CaptionVideoPlayerListModel(list=");
        return C1NE.LIZIZ(LIZ, this.list, ')', LIZ);
    }

    public final List<CaptionVideoPlayerItemModel> getList() {
        return this.list;
    }

    public CaptionVideoPlayerListModel(List<CaptionVideoPlayerItemModel> list) {
        this.list = list;
    }

    public /* synthetic */ CaptionVideoPlayerListModel(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }
}
