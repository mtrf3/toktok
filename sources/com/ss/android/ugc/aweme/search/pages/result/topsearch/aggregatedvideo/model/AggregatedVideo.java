package com.ss.android.ugc.aweme.search.pages.result.topsearch.aggregatedvideo.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import defpackage.q;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class AggregatedVideo {

    @InterfaceC65349Pkn("item_list")
    public final List<Aweme> awemes;

    @InterfaceC65349Pkn("card_title")
    public final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public AggregatedVideo() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AggregatedVideo)) {
            return false;
        }
        AggregatedVideo aggregatedVideo = (AggregatedVideo) obj;
        return o.LJ(this.awemes, aggregatedVideo.awemes) && o.LJ(this.title, aggregatedVideo.title);
    }

    public final int hashCode() {
        List<Aweme> list = this.awemes;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.title;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AggregatedVideo(awemes=");
        LIZ.append(this.awemes);
        LIZ.append(", title=");
        return q.LIZIZ(LIZ, this.title, ')', LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AggregatedVideo(List<? extends Aweme> list, String str) {
        this.awemes = list;
        this.title = str;
    }

    public /* synthetic */ AggregatedVideo(List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str);
    }
}
