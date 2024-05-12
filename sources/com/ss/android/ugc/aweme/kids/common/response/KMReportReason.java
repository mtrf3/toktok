package com.ss.android.ugc.aweme.kids.common.response;

import X.C61878OQg;
import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class KMReportReason extends F9E {

    @InterfaceC65349Pkn("video")
    public final List<KMVideoReportReason> video;

    public KMReportReason() {
        this(null, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ KMReportReason copy$default(KMReportReason kMReportReason, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = kMReportReason.video;
        }
        return kMReportReason.copy(list);
    }

    public final KMReportReason copy(List<KMVideoReportReason> video) {
        o.LJIIIZ(video, "video");
        return new KMReportReason(video);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.video};
    }

    public final List<KMVideoReportReason> getVideo() {
        return this.video;
    }

    public KMReportReason(List<KMVideoReportReason> video) {
        o.LJIIIZ(video, "video");
        this.video = video;
    }

    public KMReportReason(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C61878OQg.INSTANCE : list);
    }
}
