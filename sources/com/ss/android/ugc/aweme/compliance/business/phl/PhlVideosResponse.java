package com.ss.android.ugc.aweme.compliance.business.phl;

import X.C78966Uyw;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.compliance.api.phl.model.PrivacyHighlightsForTeens;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.Objects;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class PhlVideosResponse extends BaseResponse {

    @InterfaceC65349Pkn("log_pb")
    public final LogPbBean logPb;

    @InterfaceC65349Pkn("privacy_highlights_teens")
    public final PrivacyHighlightsForTeens phlTeens;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PhlVideosResponse) {
            return C78966Uyw.LJIIIZ(((PhlVideosResponse) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final Object[] getObjects() {
        return new Object[]{this.phlTeens, this.logPb};
    }

    public final int hashCode() {
        return Objects.hash(getObjects());
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return C78966Uyw.LJJJLL("PhlVideosResponse:%s,%s", getObjects());
    }

    public PhlVideosResponse(PrivacyHighlightsForTeens phlTeens, LogPbBean logPb) {
        o.LJIIIZ(phlTeens, "phlTeens");
        o.LJIIIZ(logPb, "logPb");
        this.phlTeens = phlTeens;
        this.logPb = logPb;
    }
}
