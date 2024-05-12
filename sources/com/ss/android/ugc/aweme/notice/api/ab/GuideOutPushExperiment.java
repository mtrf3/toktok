package com.ss.android.ugc.aweme.notice.api.ab;

import X.C221108m2;
import X.C48339Iy7;
import X.C62822Ol8;
import X.C87343YPr;
import X.C87344YPs;
import X.C87345YPt;
import X.C87346YPu;
import X.C87347YPv;
import X.C87348YPw;
import X.C87349YPx;
import X.C87350YPy;
import X.C87351YPz;
import X.InterfaceC65349Pkn;
import X.X1D;
import X.YQ0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes16.dex */
public final class GuideOutPushExperiment {
    public static final MetaData LIZ = new MetaData(0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 127, null);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C87346YPu.LJLIL);
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C87350YPy.LJLIL);
    public static final C62822Ol8 LIZLLL = C221108m2.LIZIZ(C87344YPs.LJLIL);
    public static final C62822Ol8 LJ = C221108m2.LIZIZ(C87345YPt.LJLIL);
    public static final C62822Ol8 LJFF = C221108m2.LIZIZ(YQ0.LJLIL);
    public static final C62822Ol8 LJI = C221108m2.LIZIZ(C87351YPz.LJLIL);
    public static final C62822Ol8 LJII = C221108m2.LIZIZ(C87343YPr.LJLIL);
    public static final C62822Ol8 LJIIIIZZ = C221108m2.LIZIZ(C87347YPv.LJLIL);
    public static final C62822Ol8 LJIIIZ = C221108m2.LIZIZ(C87348YPw.LJLIL);
    public static final C62822Ol8 LJIIJ = C221108m2.LIZIZ(C87349YPx.LJLIL);

    /* loaded from: classes16.dex */
    public static final class MetaData {

        @InterfaceC65349Pkn("close_time_limit")
        public final int closeTimesLimit;

        @InterfaceC65349Pkn("freq_control_enable")
        public final boolean enableFrequencyCtrl;

        @InterfaceC65349Pkn("push_feature_exp")
        public final int featureExp;

        @InterfaceC65349Pkn("share_ug_freq")
        public final boolean shareUGFrequency;

        @InterfaceC65349Pkn("show_dm_first_dialog")
        public final boolean showDMFirstDialog;

        @InterfaceC65349Pkn("show_up_after_3times_interval")
        public final int showUpAfter3TimesInterval;

        @InterfaceC65349Pkn("show_up_interval")
        public final int showUpInterval;

        /* JADX WARN: Multi-variable type inference failed */
        public MetaData() {
            this(0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 127, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MetaData)) {
                return false;
            }
            MetaData metaData = (MetaData) obj;
            return this.featureExp == metaData.featureExp && this.closeTimesLimit == metaData.closeTimesLimit && this.showUpInterval == metaData.showUpInterval && this.showUpAfter3TimesInterval == metaData.showUpAfter3TimesInterval && this.shareUGFrequency == metaData.shareUGFrequency && this.enableFrequencyCtrl == metaData.enableFrequencyCtrl && this.showDMFirstDialog == metaData.showDMFirstDialog;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final int hashCode() {
            int i = ((((((this.featureExp * 31) + this.closeTimesLimit) * 31) + this.showUpInterval) * 31) + this.showUpAfter3TimesInterval) * 31;
            boolean z = this.shareUGFrequency;
            int i2 = z;
            if (z != 0) {
                i2 = 1;
            }
            int i3 = (i + i2) * 31;
            boolean z2 = this.enableFrequencyCtrl;
            int i4 = z2;
            if (z2 != 0) {
                i4 = 1;
            }
            return ((i3 + i4) * 31) + (this.showDMFirstDialog ? 1 : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("MetaData(featureExp=");
            LIZ.append(this.featureExp);
            LIZ.append(", closeTimesLimit=");
            LIZ.append(this.closeTimesLimit);
            LIZ.append(", showUpInterval=");
            LIZ.append(this.showUpInterval);
            LIZ.append(", showUpAfter3TimesInterval=");
            LIZ.append(this.showUpAfter3TimesInterval);
            LIZ.append(", shareUGFrequency=");
            LIZ.append(this.shareUGFrequency);
            LIZ.append(", enableFrequencyCtrl=");
            LIZ.append(this.enableFrequencyCtrl);
            LIZ.append(", showDMFirstDialog=");
            return C48339Iy7.LIZJ(LIZ, this.showDMFirstDialog, ')', LIZ);
        }

        public MetaData(int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3) {
            this.featureExp = i;
            this.closeTimesLimit = i2;
            this.showUpInterval = i3;
            this.showUpAfter3TimesInterval = i4;
            this.shareUGFrequency = z;
            this.enableFrequencyCtrl = z2;
            this.showDMFirstDialog = z3;
        }

        public /* synthetic */ MetaData(int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, int i5, DefaultConstructorMarker defaultConstructorMarker) {
            this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 3 : i2, (i5 & 4) != 0 ? 15 : i3, (i5 & 8) != 0 ? 60 : i4, (i5 & 16) != 0 ? false : z, (i5 & 32) != 0 ? true : z2, (i5 & 64) != 0 ? false : z3);
        }
    }

    public static MetaData LIZ() {
        return (MetaData) LIZIZ.getValue();
    }

    public static boolean LIZIZ() {
        return ((Boolean) LJIIIZ.getValue()).booleanValue();
    }

    public static boolean LIZJ() {
        return ((Boolean) LJ.getValue()).booleanValue();
    }
}
