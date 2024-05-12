package com.ss.android.ugc.aweme.poi.detail.videolist.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class PoiDetailVideoListModel {
    public static final /* synthetic */ int LIZ = 0;

    @InterfaceC65349Pkn("aweme_list")
    public final List<Aweme> awemes;

    @InterfaceC65349Pkn("cursor")
    public final Long cursor;

    @InterfaceC65349Pkn("has_more")
    public final Integer hasMore;

    @InterfaceC65349Pkn("log_pb")
    public final LogPbBean logPb;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoiDetailVideoListModel)) {
            return false;
        }
        PoiDetailVideoListModel poiDetailVideoListModel = (PoiDetailVideoListModel) obj;
        return o.LJ(this.awemes, poiDetailVideoListModel.awemes) && o.LJ(this.cursor, poiDetailVideoListModel.cursor) && o.LJ(this.hasMore, poiDetailVideoListModel.hasMore) && o.LJ(this.logPb, poiDetailVideoListModel.logPb);
    }

    public final int hashCode() {
        List<Aweme> list = this.awemes;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Long l = this.cursor;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.hasMore;
        return this.logPb.hashCode() + ((hashCode2 + (num != null ? num.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("PoiDetailVideoListModel(awemes=");
        LIZ2.append(this.awemes);
        LIZ2.append(", cursor=");
        LIZ2.append(this.cursor);
        LIZ2.append(", hasMore=");
        LIZ2.append(this.hasMore);
        LIZ2.append(", logPb=");
        LIZ2.append(this.logPb);
        LIZ2.append(')');
        return X1D.LIZIZ(LIZ2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PoiDetailVideoListModel(List<? extends Aweme> list, Long l, Integer num, LogPbBean logPb) {
        o.LJIIIZ(logPb, "logPb");
        this.awemes = list;
        this.cursor = l;
        this.hasMore = num;
        this.logPb = logPb;
    }
}
