package com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.libra;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.b0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes11.dex */
public final class FeedEcCardClientConfigSettings {
    public static final FeedEcCardClientConfigModel LIZ = new FeedEcCardClientConfigModel(false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, null);

    /* loaded from: classes11.dex */
    public static final class FeedEcCardClientConfigModel {

        @InterfaceC65349Pkn("enable_insert_card")
        public final boolean enableInsertCard;

        @InterfaceC65349Pkn("no_interest_count_never_show")
        public final int noInterestCountNeverShow;

        @InterfaceC65349Pkn("no_interest_frequency_control")
        public final boolean noInterestFrequencyControl;

        @InterfaceC65349Pkn("no_interest_interval_not_show")
        public final int noInterestIntervalNotShow;

        /* JADX WARN: Multi-variable type inference failed */
        public FeedEcCardClientConfigModel() {
            this(false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, null);
        }

        public static /* synthetic */ FeedEcCardClientConfigModel copy$default(FeedEcCardClientConfigModel feedEcCardClientConfigModel, boolean z, boolean z2, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                z = feedEcCardClientConfigModel.enableInsertCard;
            }
            if ((i3 & 2) != 0) {
                z2 = feedEcCardClientConfigModel.noInterestFrequencyControl;
            }
            if ((i3 & 4) != 0) {
                i = feedEcCardClientConfigModel.noInterestIntervalNotShow;
            }
            if ((i3 & 8) != 0) {
                i2 = feedEcCardClientConfigModel.noInterestCountNeverShow;
            }
            return feedEcCardClientConfigModel.copy(z, z2, i, i2);
        }

        public final FeedEcCardClientConfigModel copy(boolean z, boolean z2, int i, int i2) {
            return new FeedEcCardClientConfigModel(z, z2, i, i2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FeedEcCardClientConfigModel)) {
                return false;
            }
            FeedEcCardClientConfigModel feedEcCardClientConfigModel = (FeedEcCardClientConfigModel) obj;
            return this.enableInsertCard == feedEcCardClientConfigModel.enableInsertCard && this.noInterestFrequencyControl == feedEcCardClientConfigModel.noInterestFrequencyControl && this.noInterestIntervalNotShow == feedEcCardClientConfigModel.noInterestIntervalNotShow && this.noInterestCountNeverShow == feedEcCardClientConfigModel.noInterestCountNeverShow;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v5 */
        /* JADX WARN: Type inference failed for: r0v6 */
        public int hashCode() {
            boolean z = this.enableInsertCard;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            return (((((r0 * 31) + (this.noInterestFrequencyControl ? 1 : 0)) * 31) + this.noInterestIntervalNotShow) * 31) + this.noInterestCountNeverShow;
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("FeedEcCardClientConfigModel(enableInsertCard=");
            LIZ.append(this.enableInsertCard);
            LIZ.append(", noInterestFrequencyControl=");
            LIZ.append(this.noInterestFrequencyControl);
            LIZ.append(", noInterestIntervalNotShow=");
            LIZ.append(this.noInterestIntervalNotShow);
            LIZ.append(", noInterestCountNeverShow=");
            return b0.LIZJ(LIZ, this.noInterestCountNeverShow, ')', LIZ);
        }

        public final boolean getEnableInsertCard() {
            return this.enableInsertCard;
        }

        public final int getNoInterestCountNeverShow() {
            return this.noInterestCountNeverShow;
        }

        public final boolean getNoInterestFrequencyControl() {
            return this.noInterestFrequencyControl;
        }

        public final int getNoInterestIntervalNotShow() {
            return this.noInterestIntervalNotShow;
        }

        public FeedEcCardClientConfigModel(boolean z, boolean z2, int i, int i2) {
            this.enableInsertCard = z;
            this.noInterestFrequencyControl = z2;
            this.noInterestIntervalNotShow = i;
            this.noInterestCountNeverShow = i2;
        }

        public /* synthetic */ FeedEcCardClientConfigModel(boolean z, boolean z2, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? true : z2, (i3 & 4) != 0 ? 1440 : i, (i3 & 8) != 0 ? 3 : i2);
        }
    }
}
