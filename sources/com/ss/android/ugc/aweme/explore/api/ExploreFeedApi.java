package com.ss.android.ugc.aweme.explore.api;

import X.C10K;
import X.E8M;
import X.InterfaceC195757mF;
import X.InterfaceC64985Pev;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.explore.data.ExploreAwemeList;
import com.ss.android.ugc.aweme.explore.data.ExploreRelatedAwemeList;
import defpackage.b0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class ExploreFeedApi {
    public static final /* synthetic */ int LIZ = 0;

    /* loaded from: classes4.dex */
    public interface ExploreFeedRetrofitService {
        @E8M("/tiktok/feed/explore/v1")
        @InterfaceC195757mF
        C10K<ExploreAwemeList> queryExploreAwemeList(@InterfaceC64985Pev("count") int i, @InterfaceC64985Pev("tab_type") int i2, @InterfaceC64985Pev("interacted_ids") String str);

        @E8M("/tiktok/feed/explore/related/v1")
        @InterfaceC195757mF
        C10K<ExploreRelatedAwemeList> queryRelatedExploreAwemeList(@InterfaceC64985Pev("aweme_infos") String str, @InterfaceC64985Pev("is_preload") int i, @InterfaceC64985Pev("tab_type") int i2, @InterfaceC64985Pev("interacted_ids") String str2);
    }

    /* loaded from: classes2.dex */
    public static final class ExploreAwemeReqestParam {

        @InterfaceC65349Pkn("aweme_id")
        public final String aid;

        @InterfaceC65349Pkn("aweme_type")
        public final int awemeType;

        @InterfaceC65349Pkn("count")
        public final int count;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ExploreAwemeReqestParam)) {
                return false;
            }
            ExploreAwemeReqestParam exploreAwemeReqestParam = (ExploreAwemeReqestParam) obj;
            return o.LJ(this.aid, exploreAwemeReqestParam.aid) && this.awemeType == exploreAwemeReqestParam.awemeType && this.count == exploreAwemeReqestParam.count;
        }

        public final int hashCode() {
            return (((this.aid.hashCode() * 31) + this.awemeType) * 31) + this.count;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ExploreAwemeReqestParam(aid=");
            LIZ.append(this.aid);
            LIZ.append(", awemeType=");
            LIZ.append(this.awemeType);
            LIZ.append(", count=");
            return b0.LIZJ(LIZ, this.count, ')', LIZ);
        }

        public ExploreAwemeReqestParam(String aid, int i, int i2) {
            o.LJIIIZ(aid, "aid");
            this.aid = aid;
            this.awemeType = i;
            this.count = i2;
        }

        public /* synthetic */ ExploreAwemeReqestParam(String str, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, (i3 & 4) != 0 ? 1 : i2);
        }
    }
}
