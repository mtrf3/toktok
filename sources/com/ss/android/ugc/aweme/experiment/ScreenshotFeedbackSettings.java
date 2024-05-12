package com.ss.android.ugc.aweme.experiment;

import X.C61878OQg;
import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.b0;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ScreenshotFeedbackSettings {
    public static final ScreenFeedbackConfig LIZ;

    /* loaded from: classes2.dex */
    public static final class ScreenFeedbackConfig {

        @InterfaceC65349Pkn("avoid_in_app_push")
        public final int avoidInAppPush;

        @InterfaceC65349Pkn("black_page_list")
        public final List<String> blackPageList;

        @InterfaceC65349Pkn("feedback_url")
        public final String feedbackURL;

        @InterfaceC65349Pkn("feedback_useable")
        public final int feedbackUsable;

        @InterfaceC65349Pkn("valid_channel")
        public final String[] validChannel;

        public ScreenFeedbackConfig() {
            this(null, null, 0, null, 0, 31, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ScreenFeedbackConfig)) {
                return false;
            }
            ScreenFeedbackConfig screenFeedbackConfig = (ScreenFeedbackConfig) obj;
            return o.LJ(this.validChannel, screenFeedbackConfig.validChannel) && o.LJ(this.feedbackURL, screenFeedbackConfig.feedbackURL) && this.feedbackUsable == screenFeedbackConfig.feedbackUsable && o.LJ(this.blackPageList, screenFeedbackConfig.blackPageList) && this.avoidInAppPush == screenFeedbackConfig.avoidInAppPush;
        }

        public final int hashCode() {
            int hashCode;
            int LJ = (C79062V1e.LJ(this.feedbackURL, Arrays.hashCode(this.validChannel) * 31, 31) + this.feedbackUsable) * 31;
            List<String> list = this.blackPageList;
            if (list == null) {
                hashCode = 0;
            } else {
                hashCode = list.hashCode();
            }
            return ((LJ + hashCode) * 31) + this.avoidInAppPush;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ScreenFeedbackConfig(validChannel=");
            LIZ.append(Arrays.toString(this.validChannel));
            LIZ.append(", feedbackURL=");
            LIZ.append(this.feedbackURL);
            LIZ.append(", feedbackUsable=");
            LIZ.append(this.feedbackUsable);
            LIZ.append(", blackPageList=");
            LIZ.append(this.blackPageList);
            LIZ.append(", avoidInAppPush=");
            return b0.LIZJ(LIZ, this.avoidInAppPush, ')', LIZ);
        }

        public ScreenFeedbackConfig(String[] validChannel, String feedbackURL, int i, List<String> list, int i2) {
            o.LJIIIZ(validChannel, "validChannel");
            o.LJIIIZ(feedbackURL, "feedbackURL");
            this.validChannel = validChannel;
            this.feedbackURL = feedbackURL;
            this.feedbackUsable = i;
            this.blackPageList = list;
            this.avoidInAppPush = i2;
        }

        public ScreenFeedbackConfig(String[] strArr, String str, int i, List list, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? new String[0] : strArr, (i3 & 2) != 0 ? "" : str, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? C61878OQg.INSTANCE : list, (i3 & 16) == 0 ? i2 : 0);
        }
    }

    static {
        new ScreenshotFeedbackSettings();
        LIZ = new ScreenFeedbackConfig(new String[]{"lark_inhouse", "local_test"}, "", 0, null, 0, 28, null);
    }
}
