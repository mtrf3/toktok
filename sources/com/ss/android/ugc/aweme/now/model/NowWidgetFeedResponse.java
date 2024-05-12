package com.ss.android.ugc.aweme.now.model;

import X.C61878OQg;
import X.C78966Uyw;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class NowWidgetFeedResponse extends BaseResponse implements Serializable {

    @InterfaceC65349Pkn("has_now_in_feed")
    public final boolean hasNowInFeed;

    @InterfaceC65349Pkn("need_load_interaction_info")
    public final boolean needLoadInteractionInfo;

    @InterfaceC65349Pkn("now_info")
    public final List<Aweme> nowInfo;

    public NowWidgetFeedResponse() {
        this(false, null, false, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NowWidgetFeedResponse copy$default(NowWidgetFeedResponse nowWidgetFeedResponse, boolean z, List list, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = nowWidgetFeedResponse.hasNowInFeed;
        }
        if ((i & 2) != 0) {
            list = nowWidgetFeedResponse.nowInfo;
        }
        if ((i & 4) != 0) {
            z2 = nowWidgetFeedResponse.needLoadInteractionInfo;
        }
        return nowWidgetFeedResponse.copy(z, list, z2);
    }

    public final NowWidgetFeedResponse copy(boolean z, List<? extends Aweme> nowInfo, boolean z2) {
        o.LJIIIZ(nowInfo, "nowInfo");
        return new NowWidgetFeedResponse(z, nowInfo, z2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NowWidgetFeedResponse) {
            return C78966Uyw.LJIIIZ(((NowWidgetFeedResponse) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.hasNowInFeed), this.nowInfo, Boolean.valueOf(this.needLoadInteractionInfo)};
    }

    public int hashCode() {
        return Objects.hash(getObjects());
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        return C78966Uyw.LJJJLL("NowWidgetFeedResponse:%s,%s,%s", getObjects());
    }

    public final boolean getHasNowInFeed() {
        return this.hasNowInFeed;
    }

    public final boolean getNeedLoadInteractionInfo() {
        return this.needLoadInteractionInfo;
    }

    public final List<Aweme> getNowInfo() {
        return this.nowInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NowWidgetFeedResponse(boolean z, List<? extends Aweme> nowInfo, boolean z2) {
        o.LJIIIZ(nowInfo, "nowInfo");
        this.hasNowInFeed = z;
        this.nowInfo = nowInfo;
        this.needLoadInteractionInfo = z2;
    }

    public NowWidgetFeedResponse(boolean z, List list, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? C61878OQg.INSTANCE : list, (i & 4) != 0 ? false : z2);
    }
}
