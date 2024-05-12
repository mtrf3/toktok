package com.ss.android.ugc.aweme.tablet.impl.settings;

import X.C1JX;
import X.C221108m2;
import X.C53946LFe;
import X.C53948LFg;
import X.C54964Lhg;
import X.C54966Lhi;
import X.C62822Ol8;
import X.C74221TAz;
import X.InterfaceC65349Pkn;
import X.LEW;
import X.LFE;
import X.X1D;
import android.app.Activity;
import android.content.res.Configuration;

/* loaded from: classes10.dex */
public final class TabletCommentSplitSettings {
    public static final TabletCommentSplitConfig LIZ;
    public static final C62822Ol8 LIZIZ;

    /* loaded from: classes7.dex */
    public static final class TabletCommentSplitConfig {

        @InterfaceC65349Pkn("min_width_support_split")
        public final int minWidthSupportSplit;

        @InterfaceC65349Pkn("panel_min_width")
        public final double panelMinWidth;

        @InterfaceC65349Pkn("provide_section_ratio")
        public final float provideSectionRatio;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TabletCommentSplitConfig)) {
                return false;
            }
            TabletCommentSplitConfig tabletCommentSplitConfig = (TabletCommentSplitConfig) obj;
            return this.minWidthSupportSplit == tabletCommentSplitConfig.minWidthSupportSplit && Double.compare(this.panelMinWidth, tabletCommentSplitConfig.panelMinWidth) == 0 && Float.compare(this.provideSectionRatio, tabletCommentSplitConfig.provideSectionRatio) == 0;
        }

        public final int hashCode() {
            return Float.floatToIntBits(this.provideSectionRatio) + C1JX.LIZIZ(this.panelMinWidth, this.minWidthSupportSplit * 31, 31);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("TabletCommentSplitConfig(minWidthSupportSplit=");
            LIZ.append(this.minWidthSupportSplit);
            LIZ.append(", panelMinWidth=");
            LIZ.append(this.panelMinWidth);
            LIZ.append(", provideSectionRatio=");
            return C74221TAz.LIZLLL(LIZ, this.provideSectionRatio, ')', LIZ);
        }

        public TabletCommentSplitConfig(int i, double d, float f) {
            this.minWidthSupportSplit = i;
            this.panelMinWidth = d;
            this.provideSectionRatio = f;
        }
    }

    static {
        TabletCommentSplitConfig tabletCommentSplitConfig = new TabletCommentSplitConfig(800, 375.0d, 0.4f);
        TabletCommentSplitConfig tabletCommentSplitConfig2 = new TabletCommentSplitConfig(660, 300.0d, 0.4f);
        if (C54966Lhi.LIZJ()) {
            tabletCommentSplitConfig = tabletCommentSplitConfig2;
        }
        LIZ = tabletCommentSplitConfig;
        LIZIZ = C221108m2.LIZIZ(LEW.LJLIL);
    }

    public static final boolean LIZ(Activity activity, Configuration configuration) {
        int i;
        if (C54964Lhg.LIZ && !C54966Lhi.LIZJ()) {
            i = 0;
        } else {
            i = ((TabletCommentSplitConfig) LIZIZ.getValue()).minWidthSupportSplit;
        }
        C53948LFg LIZJ = C53946LFe.LIZJ(activity, configuration);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("TabletMinWidthSupportCommentSplitSettings ScreenHelper.getInfo width = ");
        LIZ2.append(LIZJ.LIZIZ);
        LIZ2.append(", height = ");
        LIZ2.append(LIZJ.LIZJ);
        LIZ2.append(", isLandscape = ");
        LIZ2.append(LIZJ.LJFF);
        LFE.LIZIZ("commentSplit", X1D.LIZIZ(LIZ2));
        if (LIZJ.LIZIZ() < i) {
            return false;
        }
        return true;
    }
}
