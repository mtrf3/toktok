package com.ss.android.ugc.aweme.music.ab;

import X.C48339Iy7;
import X.InterfaceC65349Pkn;
import X.X1D;

/* loaded from: classes4.dex */
public final class MusicDetailRedesignV2Experiment {
    public static final MusicDetailRedesignV2Experiment LIZ = new MusicDetailRedesignV2Experiment();
    public static final RedesignFeature LIZIZ = new RedesignFeature(false, false);

    /* loaded from: classes4.dex */
    public static final class RedesignFeature {

        @InterfaceC65349Pkn("enlarge_music_play_button")
        public final boolean enlargePlayBtn;

        @InterfaceC65349Pkn("gradient_colors_background")
        public final boolean gradientColorsBackground;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RedesignFeature)) {
                return false;
            }
            RedesignFeature redesignFeature = (RedesignFeature) obj;
            return this.enlargePlayBtn == redesignFeature.enlargePlayBtn && this.gradientColorsBackground == redesignFeature.gradientColorsBackground;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v4 */
        public final int hashCode() {
            boolean z = this.enlargePlayBtn;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            return (r0 * 31) + (this.gradientColorsBackground ? 1 : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("RedesignFeature(enlargePlayBtn=");
            LIZ.append(this.enlargePlayBtn);
            LIZ.append(", gradientColorsBackground=");
            return C48339Iy7.LIZJ(LIZ, this.gradientColorsBackground, ')', LIZ);
        }

        public RedesignFeature(boolean z, boolean z2) {
            this.enlargePlayBtn = z;
            this.gradientColorsBackground = z2;
        }
    }
}
