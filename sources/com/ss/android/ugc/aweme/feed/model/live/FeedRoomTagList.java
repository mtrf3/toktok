package com.ss.android.ugc.aweme.feed.model.live;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class FeedRoomTagList implements Serializable {

    @InterfaceC65349Pkn("bc_toggle_tag")
    public List<FeedRoomTag> bcToggleTags;

    @InterfaceC65349Pkn("boost_toggle_tag")
    public List<FeedRoomTag> boostToggleTags;

    @InterfaceC65349Pkn("bottom_sub_tag")
    public List<FeedRoomTag> bottomSubTags;

    @InterfaceC65349Pkn("bottom_tag")
    public List<FeedRoomTag> bottomTags;
    public transient HashMap<String, String> firstSubTagDaInfoLocal;

    @InterfaceC65349Pkn("tag")
    public List<FeedRoomTag> firstTags;

    @InterfaceC65349Pkn("sub_tag")
    public List<FeedRoomTag> subTags;

    /* JADX WARN: Multi-variable type inference failed */
    public FeedRoomTagList() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FeedRoomTagList copy$default(FeedRoomTagList feedRoomTagList, List list, List list2, List list3, List list4, List list5, List list6, int i, Object obj) {
        if ((i & 1) != 0) {
            list = feedRoomTagList.firstTags;
        }
        if ((i & 2) != 0) {
            list2 = feedRoomTagList.subTags;
        }
        if ((i & 4) != 0) {
            list3 = feedRoomTagList.bcToggleTags;
        }
        if ((i & 8) != 0) {
            list4 = feedRoomTagList.bottomTags;
        }
        if ((i & 16) != 0) {
            list5 = feedRoomTagList.bottomSubTags;
        }
        if ((i & 32) != 0) {
            list6 = feedRoomTagList.boostToggleTags;
        }
        return feedRoomTagList.copy(list, list2, list3, list4, list5, list6);
    }

    public final FeedRoomTagList copy(List<FeedRoomTag> list, List<FeedRoomTag> list2, List<FeedRoomTag> list3, List<FeedRoomTag> list4, List<FeedRoomTag> list5, List<FeedRoomTag> list6) {
        return new FeedRoomTagList(list, list2, list3, list4, list5, list6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FeedRoomTagList)) {
            return false;
        }
        FeedRoomTagList feedRoomTagList = (FeedRoomTagList) obj;
        return o.LJ(this.firstTags, feedRoomTagList.firstTags) && o.LJ(this.subTags, feedRoomTagList.subTags) && o.LJ(this.bcToggleTags, feedRoomTagList.bcToggleTags) && o.LJ(this.bottomTags, feedRoomTagList.bottomTags) && o.LJ(this.bottomSubTags, feedRoomTagList.bottomSubTags) && o.LJ(this.boostToggleTags, feedRoomTagList.boostToggleTags);
    }

    public int hashCode() {
        List<FeedRoomTag> list = this.firstTags;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<FeedRoomTag> list2 = this.subTags;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<FeedRoomTag> list3 = this.bcToggleTags;
        int hashCode3 = (hashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<FeedRoomTag> list4 = this.bottomTags;
        int hashCode4 = (hashCode3 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<FeedRoomTag> list5 = this.bottomSubTags;
        int hashCode5 = (hashCode4 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<FeedRoomTag> list6 = this.boostToggleTags;
        return hashCode5 + (list6 != null ? list6.hashCode() : 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        if (r0 != null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.HashMap<java.lang.String, java.lang.String> getFirstSubTagDaInfoLocal() {
        /*
            r3 = this;
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r3.firstSubTagDaInfoLocal
            if (r0 != 0) goto L34
            java.util.List<com.ss.android.ugc.aweme.feed.model.live.FeedRoomTag> r0 = r3.subTags
            if (r0 == 0) goto L2d
            java.lang.Object r0 = X.ORZ.LJLLLL(r0)
            com.ss.android.ugc.aweme.feed.model.live.FeedRoomTag r0 = (com.ss.android.ugc.aweme.feed.model.live.FeedRoomTag) r0
            if (r0 == 0) goto L2d
            java.lang.String r2 = r0.getDaInfo()
            if (r2 == 0) goto L2d
            com.google.gson.Gson r1 = X.C69432nz.LIZ()     // Catch: java.lang.Exception -> L2a
            com.ss.android.ugc.aweme.feed.model.live.FeedRoomTagList$getFirstSubTagDaInfoLocal$1$1 r0 = new com.ss.android.ugc.aweme.feed.model.live.FeedRoomTagList$getFirstSubTagDaInfoLocal$1$1     // Catch: java.lang.Exception -> L2a
            r0.<init>()     // Catch: java.lang.Exception -> L2a
            java.lang.reflect.Type r0 = r0.getType()     // Catch: java.lang.Exception -> L2a
            java.lang.Object r0 = r1.LJII(r2, r0)     // Catch: java.lang.Exception -> L2a
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch: java.lang.Exception -> L2a
            goto L2b
        L2a:
            r0 = 0
        L2b:
            if (r0 != 0) goto L32
        L2d:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
        L32:
            r3.firstSubTagDaInfoLocal = r0
        L34:
            java.util.HashMap<java.lang.String, java.lang.String> r0 = r3.firstSubTagDaInfoLocal
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.model.live.FeedRoomTagList.getFirstSubTagDaInfoLocal():java.util.HashMap");
    }

    public final String getFirstTagsRecommendInfo() {
        List<FeedRoomTag> list = this.firstTags;
        if (list != null) {
            for (FeedRoomTag feedRoomTag : list) {
                if (feedRoomTag.getRecommendInfo() != null) {
                    return feedRoomTag.getRecommendInfo();
                }
            }
            return null;
        }
        return null;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FeedRoomTagList(firstTags=");
        LIZ.append(this.firstTags);
        LIZ.append(", subTags=");
        LIZ.append(this.subTags);
        LIZ.append(", bcToggleTags=");
        LIZ.append(this.bcToggleTags);
        LIZ.append(", bottomTags=");
        LIZ.append(this.bottomTags);
        LIZ.append(", bottomSubTags=");
        LIZ.append(this.bottomSubTags);
        LIZ.append(", boostToggleTags=");
        return C1NE.LIZIZ(LIZ, this.boostToggleTags, ')', LIZ);
    }

    public final List<FeedRoomTag> getBcToggleTags() {
        return this.bcToggleTags;
    }

    public final List<FeedRoomTag> getBoostToggleTags() {
        return this.boostToggleTags;
    }

    public final List<FeedRoomTag> getBottomSubTags() {
        return this.bottomSubTags;
    }

    public final List<FeedRoomTag> getBottomTags() {
        return this.bottomTags;
    }

    public final List<FeedRoomTag> getFirstTags() {
        return this.firstTags;
    }

    public final List<FeedRoomTag> getSubTags() {
        return this.subTags;
    }

    public final void setBcToggleTags(List<FeedRoomTag> list) {
        this.bcToggleTags = list;
    }

    public final void setBoostToggleTags(List<FeedRoomTag> list) {
        this.boostToggleTags = list;
    }

    public final void setBottomSubTags(List<FeedRoomTag> list) {
        this.bottomSubTags = list;
    }

    public final void setBottomTags(List<FeedRoomTag> list) {
        this.bottomTags = list;
    }

    public final void setFirstTags(List<FeedRoomTag> list) {
        this.firstTags = list;
    }

    public final void setSubTags(List<FeedRoomTag> list) {
        this.subTags = list;
    }

    public FeedRoomTagList(List<FeedRoomTag> list, List<FeedRoomTag> list2, List<FeedRoomTag> list3, List<FeedRoomTag> list4, List<FeedRoomTag> list5, List<FeedRoomTag> list6) {
        this.firstTags = list;
        this.subTags = list2;
        this.bcToggleTags = list3;
        this.bottomTags = list4;
        this.bottomSubTags = list5;
        this.boostToggleTags = list6;
    }

    public /* synthetic */ FeedRoomTagList(List list, List list2, List list3, List list4, List list5, List list6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : list3, (i & 8) != 0 ? null : list4, (i & 16) != 0 ? null : list5, (i & 32) == 0 ? list6 : null);
    }
}
