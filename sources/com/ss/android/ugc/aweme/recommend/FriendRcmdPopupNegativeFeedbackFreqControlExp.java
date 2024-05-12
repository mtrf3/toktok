package com.ss.android.ugc.aweme.recommend;

import X.C221108m2;
import X.C62822Ol8;
import X.C78654Utu;
import X.C78655Utv;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import defpackage.b0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes14.dex */
public final class FriendRcmdPopupNegativeFeedbackFreqControlExp {
    public static final SocialFriendRcmdPopupPortraitFreqLimitConfig LIZ = new SocialFriendRcmdPopupPortraitFreqLimitConfig(false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 127, null);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C78654Utu.LJLIL);
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C78655Utv.LJLIL);

    /* loaded from: classes14.dex */
    public static final class SocialFriendRcmdPopupPortraitFreqLimitConfig {

        @InterfaceC65349Pkn("dislike_total_count_30days_real_upper_bound")
        public int dislikeTotalCount30daysRealUpperBound;

        @InterfaceC65349Pkn("dislike_total_count_3days_real_upper_bound")
        public int dislikeTotalCount3daysRealUpperBound;

        @InterfaceC65349Pkn("dislike_total_count_7days_real_upper_bound")
        public int dislikeTotalCount7daysRealUpperBound;

        @InterfaceC65349Pkn("enable_rule_based_model")
        public boolean enableRuleBasedModel;

        @InterfaceC65349Pkn("follow_total_count_30days_enum_lower_bound")
        public int followTotalCount30daysEnumLowerBound;

        @InterfaceC65349Pkn("follow_total_count_3days_enum_lower_bound")
        public int followTotalCount3daysEnumLowerBound;

        @InterfaceC65349Pkn("follow_total_count_7days_enum_lower_bound")
        public int followTotalCount7daysEnumLowerBound;

        /* JADX WARN: Multi-variable type inference failed */
        public SocialFriendRcmdPopupPortraitFreqLimitConfig() {
            this(false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 127, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SocialFriendRcmdPopupPortraitFreqLimitConfig)) {
                return false;
            }
            SocialFriendRcmdPopupPortraitFreqLimitConfig socialFriendRcmdPopupPortraitFreqLimitConfig = (SocialFriendRcmdPopupPortraitFreqLimitConfig) obj;
            return this.enableRuleBasedModel == socialFriendRcmdPopupPortraitFreqLimitConfig.enableRuleBasedModel && this.followTotalCount3daysEnumLowerBound == socialFriendRcmdPopupPortraitFreqLimitConfig.followTotalCount3daysEnumLowerBound && this.followTotalCount7daysEnumLowerBound == socialFriendRcmdPopupPortraitFreqLimitConfig.followTotalCount7daysEnumLowerBound && this.followTotalCount30daysEnumLowerBound == socialFriendRcmdPopupPortraitFreqLimitConfig.followTotalCount30daysEnumLowerBound && this.dislikeTotalCount3daysRealUpperBound == socialFriendRcmdPopupPortraitFreqLimitConfig.dislikeTotalCount3daysRealUpperBound && this.dislikeTotalCount7daysRealUpperBound == socialFriendRcmdPopupPortraitFreqLimitConfig.dislikeTotalCount7daysRealUpperBound && this.dislikeTotalCount30daysRealUpperBound == socialFriendRcmdPopupPortraitFreqLimitConfig.dislikeTotalCount30daysRealUpperBound;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v8 */
        /* JADX WARN: Type inference failed for: r0v9 */
        public final int hashCode() {
            boolean z = this.enableRuleBasedModel;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            return (((((((((((r0 * 31) + this.followTotalCount3daysEnumLowerBound) * 31) + this.followTotalCount7daysEnumLowerBound) * 31) + this.followTotalCount30daysEnumLowerBound) * 31) + this.dislikeTotalCount3daysRealUpperBound) * 31) + this.dislikeTotalCount7daysRealUpperBound) * 31) + this.dislikeTotalCount30daysRealUpperBound;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("SocialFriendRcmdPopupPortraitFreqLimitConfig(enableRuleBasedModel=");
            LIZ.append(this.enableRuleBasedModel);
            LIZ.append(", followTotalCount3daysEnumLowerBound=");
            LIZ.append(this.followTotalCount3daysEnumLowerBound);
            LIZ.append(", followTotalCount7daysEnumLowerBound=");
            LIZ.append(this.followTotalCount7daysEnumLowerBound);
            LIZ.append(", followTotalCount30daysEnumLowerBound=");
            LIZ.append(this.followTotalCount30daysEnumLowerBound);
            LIZ.append(", dislikeTotalCount3daysRealUpperBound=");
            LIZ.append(this.dislikeTotalCount3daysRealUpperBound);
            LIZ.append(", dislikeTotalCount7daysRealUpperBound=");
            LIZ.append(this.dislikeTotalCount7daysRealUpperBound);
            LIZ.append(", dislikeTotalCount30daysRealUpperBound=");
            return b0.LIZJ(LIZ, this.dislikeTotalCount30daysRealUpperBound, ')', LIZ);
        }

        public SocialFriendRcmdPopupPortraitFreqLimitConfig(boolean z, int i, int i2, int i3, int i4, int i5, int i6) {
            this.enableRuleBasedModel = z;
            this.followTotalCount3daysEnumLowerBound = i;
            this.followTotalCount7daysEnumLowerBound = i2;
            this.followTotalCount30daysEnumLowerBound = i3;
            this.dislikeTotalCount3daysRealUpperBound = i4;
            this.dislikeTotalCount7daysRealUpperBound = i5;
            this.dislikeTotalCount30daysRealUpperBound = i6;
        }

        public /* synthetic */ SocialFriendRcmdPopupPortraitFreqLimitConfig(boolean z, int i, int i2, int i3, int i4, int i5, int i6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
            this((i7 & 1) != 0 ? false : z, (i7 & 2) != 0 ? Integer.MAX_VALUE : i, (i7 & 4) != 0 ? Integer.MAX_VALUE : i2, (i7 & 8) == 0 ? i3 : Integer.MAX_VALUE, (i7 & 16) != 0 ? LiveLayoutPreloadThreadPriority.DEFAULT : i4, (i7 & 32) != 0 ? LiveLayoutPreloadThreadPriority.DEFAULT : i5, (i7 & 64) != 0 ? LiveLayoutPreloadThreadPriority.DEFAULT : i6);
        }
    }

    public static SocialFriendRcmdPopupPortraitFreqLimitConfig LIZ() {
        return (SocialFriendRcmdPopupPortraitFreqLimitConfig) LIZJ.getValue();
    }
}
