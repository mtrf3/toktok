package com.ss.android.ugc.aweme.paidcontent.experiment;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.bytedance.ies.abmock.SettingsManager;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PaidContentFeedbackIntegrationURLSetting {
    static {
        new PaidContentFeedbackIntegrationURLSetting();
    }

    /* loaded from: classes5.dex */
    public static final class FeedbackIntegrationInfoStructJsonModel {

        @InterfaceC65349Pkn("feedback_icon_entrance_url")
        public final String feedbackUrl;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FeedbackIntegrationInfoStructJsonModel) && o.LJ(this.feedbackUrl, ((FeedbackIntegrationInfoStructJsonModel) obj).feedbackUrl);
        }

        public final int hashCode() {
            return this.feedbackUrl.hashCode();
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("FeedbackIntegrationInfoStructJsonModel(feedbackUrl=");
            return q.LIZIZ(LIZ, this.feedbackUrl, ')', LIZ);
        }

        public FeedbackIntegrationInfoStructJsonModel(String feedbackUrl) {
            o.LJIIIZ(feedbackUrl, "feedbackUrl");
            this.feedbackUrl = feedbackUrl;
        }
    }

    public static final FeedbackIntegrationInfoStructJsonModel LIZ() {
        return (FeedbackIntegrationInfoStructJsonModel) SettingsManager.LIZLLL().LJIIIIZZ("feedback_integration_info_struct_json", FeedbackIntegrationInfoStructJsonModel.class, null);
    }
}
