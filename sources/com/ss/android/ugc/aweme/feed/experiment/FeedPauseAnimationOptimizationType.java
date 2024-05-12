package com.ss.android.ugc.aweme.feed.experiment;

import X.C74221TAz;
import X.FFL;
import X.InterfaceC65349Pkn;
import X.X1D;

/* loaded from: classes2.dex */
public final class FeedPauseAnimationOptimizationType {
    public static final FeedPauseAnimationOptimizationType LIZ = new FeedPauseAnimationOptimizationType();
    public static final IconStyle LIZIZ = new IconStyle(false, 1.0f);
    public static IconStyle LIZJ;

    /* loaded from: classes2.dex */
    public static final class IconStyle {

        @InterfaceC65349Pkn("icon_alpha")
        public final float iconAlpha;

        @InterfaceC65349Pkn("use_new_style")
        public final boolean isNewStyle;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IconStyle)) {
                return false;
            }
            IconStyle iconStyle = (IconStyle) obj;
            return this.isNewStyle == iconStyle.isNewStyle && Float.compare(this.iconAlpha, iconStyle.iconAlpha) == 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v5 */
        /* JADX WARN: Type inference failed for: r0v6 */
        public final int hashCode() {
            boolean z = this.isNewStyle;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            return Float.floatToIntBits(this.iconAlpha) + (r0 * 31);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("IconStyle(isNewStyle=");
            LIZ.append(this.isNewStyle);
            LIZ.append(", iconAlpha=");
            return C74221TAz.LIZLLL(LIZ, this.iconAlpha, ')', LIZ);
        }

        public IconStyle(boolean z, float f) {
            this.isNewStyle = z;
            this.iconAlpha = f;
        }
    }

    public static IconStyle LIZ() {
        if (LIZJ == null) {
            try {
                FFL LJIIIZ = FFL.LJIIIZ();
                IconStyle iconStyle = LIZIZ;
                LJIIIZ.getClass();
                IconStyle iconStyle2 = (IconStyle) FFL.LJIJ(true, "feed_pause_animation_optimization_type", 31744, IconStyle.class, iconStyle);
                if (iconStyle2 != null) {
                    iconStyle = iconStyle2;
                }
                if (iconStyle instanceof IconStyle) {
                    if (iconStyle.iconAlpha <= 0.0f) {
                        LIZJ = new IconStyle(iconStyle.isNewStyle, 1.0f);
                    }
                    LIZJ = iconStyle;
                }
            } catch (Throwable unused) {
                LIZJ = LIZIZ;
            }
        }
        return LIZJ;
    }

    public static boolean LIZIZ() {
        IconStyle LIZ2 = LIZ();
        if (LIZ2 != null) {
            return LIZ2.isNewStyle;
        }
        return false;
    }
}
