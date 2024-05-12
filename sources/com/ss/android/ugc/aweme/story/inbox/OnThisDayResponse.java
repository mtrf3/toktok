package com.ss.android.ugc.aweme.story.inbox;

import X.C78966Uyw;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.ecommerce.core.preloader.ImagePreloadExperiment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class OnThisDayResponse extends BaseResponse implements Serializable {

    @InterfaceC65349Pkn("aweme")
    public final Aweme aweme;

    @InterfaceC65349Pkn("is_posted")
    public final int isPosted;

    @InterfaceC65349Pkn("past_memory_key")
    public final String pastMemoryKey;
    public int priority;

    @InterfaceC65349Pkn("view_count")
    public final int viewCount;

    public static /* synthetic */ OnThisDayResponse copy$default(OnThisDayResponse onThisDayResponse, Aweme aweme, int i, int i2, String str, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            aweme = onThisDayResponse.aweme;
        }
        if ((i4 & 2) != 0) {
            i = onThisDayResponse.viewCount;
        }
        if ((i4 & 4) != 0) {
            i2 = onThisDayResponse.isPosted;
        }
        if ((i4 & 8) != 0) {
            str = onThisDayResponse.pastMemoryKey;
        }
        if ((i4 & 16) != 0) {
            i3 = onThisDayResponse.priority;
        }
        return onThisDayResponse.copy(aweme, i, i2, str, i3);
    }

    private Object[] getObjects() {
        return new Object[]{this.aweme, Integer.valueOf(this.viewCount), Integer.valueOf(this.isPosted), this.pastMemoryKey, Integer.valueOf(this.priority)};
    }

    public final OnThisDayResponse copy(Aweme aweme, int i, int i2, String pastMemoryKey, int i3) {
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(pastMemoryKey, "pastMemoryKey");
        return new OnThisDayResponse(aweme, i, i2, pastMemoryKey, i3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnThisDayResponse) {
            return C78966Uyw.LJIIIZ(((OnThisDayResponse) obj).getObjects(), getObjects());
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(getObjects());
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        return C78966Uyw.LJJJLL("OnThisDayResponse:%s,%s,%s,%s,%s", getObjects());
    }

    public final Aweme getAweme() {
        return this.aweme;
    }

    public final String getPastMemoryKey() {
        return this.pastMemoryKey;
    }

    public final int getPriority() {
        return this.priority;
    }

    public final int getViewCount() {
        return this.viewCount;
    }

    public final int isPosted() {
        return this.isPosted;
    }

    public final void setPriority(int i) {
        this.priority = i;
    }

    public OnThisDayResponse(Aweme aweme, int i, int i2, String pastMemoryKey, int i3) {
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(pastMemoryKey, "pastMemoryKey");
        this.aweme = aweme;
        this.viewCount = i;
        this.isPosted = i2;
        this.pastMemoryKey = pastMemoryKey;
        this.priority = i3;
    }

    public /* synthetic */ OnThisDayResponse(Aweme aweme, int i, int i2, String str, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(aweme, (i4 & 2) != 0 ? 0 : i, (i4 & 4) != 0 ? 0 : i2, str, (i4 & 16) != 0 ? ImagePreloadExperiment.PRIORITY_DEFAULT : i3);
    }
}
