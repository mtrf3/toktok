package com.ss.android.ugc.aweme.experiment;

import X.C221108m2;
import X.C62822Ol8;
import X.C69651RVf;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.b0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes13.dex */
public final class TikTokResolution {
    public static final TiktokResolution LIZ;
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C69651RVf.LJLIL);

    /* loaded from: classes13.dex */
    public static final class TiktokResolution {

        @InterfaceC65349Pkn("height")
        public final int height;

        @InterfaceC65349Pkn("width")
        public final int width;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public TiktokResolution() {
            /*
                r3 = this;
                r2 = 3
                r1 = 0
                r0 = 0
                r3.<init>(r0, r0, r2, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.experiment.TikTokResolution.TiktokResolution.<init>():void");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TiktokResolution)) {
                return false;
            }
            TiktokResolution tiktokResolution = (TiktokResolution) obj;
            return this.width == tiktokResolution.width && this.height == tiktokResolution.height;
        }

        public final int hashCode() {
            return (this.width * 31) + this.height;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("TiktokResolution(width=");
            LIZ.append(this.width);
            LIZ.append(", height=");
            return b0.LIZJ(LIZ, this.height, ')', LIZ);
        }

        public TiktokResolution(int i, int i2) {
            this.width = i;
            this.height = i2;
        }

        public /* synthetic */ TiktokResolution(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? 720 : i, (i3 & 2) != 0 ? 1280 : i2);
        }
    }

    static {
        int i = 0;
        LIZ = new TiktokResolution(i, i, 3, null);
    }
}
