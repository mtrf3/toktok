package com.ss.android.ugc.aweme.search.pages.result.common.core.config;

import X.C221108m2;
import X.C48339Iy7;
import X.C62822Ol8;
import X.InterfaceC65349Pkn;
import X.JKX;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class SearchVideoAndUserOptimizeExperiment {
    public static final OptimizeConfig LIZ;
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(JKX.LJLIL);

    /* loaded from: classes9.dex */
    public static final class OptimizeConfig {

        @InterfaceC65349Pkn("click_search_optimize")
        public final boolean clickSearchOptimize;

        @InterfaceC65349Pkn("hashtag_optimize")
        public final boolean hashTagOptimize;

        @InterfaceC65349Pkn("is_default")
        public final boolean isDefault;

        @InterfaceC65349Pkn("listener_optimize")
        public final boolean listenerOptimize;

        @InterfaceC65349Pkn("user_image_async_load")
        public final boolean userImageAsyncLoad;

        @InterfaceC65349Pkn("user_layout_optimize")
        public final boolean userLayoutOptimize;

        @InterfaceC65349Pkn("video_image_async_load")
        public final boolean videoImageAsyncLoad;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public OptimizeConfig() {
            /*
                r10 = this;
                r1 = 0
                r8 = 127(0x7f, float:1.78E-43)
                r9 = 0
                r0 = r10
                r2 = r1
                r3 = r1
                r4 = r1
                r5 = r1
                r6 = r1
                r7 = r1
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.search.pages.result.common.core.config.SearchVideoAndUserOptimizeExperiment.OptimizeConfig.<init>():void");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OptimizeConfig)) {
                return false;
            }
            OptimizeConfig optimizeConfig = (OptimizeConfig) obj;
            return this.isDefault == optimizeConfig.isDefault && this.videoImageAsyncLoad == optimizeConfig.videoImageAsyncLoad && this.userImageAsyncLoad == optimizeConfig.userImageAsyncLoad && this.userLayoutOptimize == optimizeConfig.userLayoutOptimize && this.clickSearchOptimize == optimizeConfig.clickSearchOptimize && this.hashTagOptimize == optimizeConfig.hashTagOptimize && this.listenerOptimize == optimizeConfig.listenerOptimize;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v10, types: [boolean] */
        /* JADX WARN: Type inference failed for: r0v18 */
        /* JADX WARN: Type inference failed for: r0v19 */
        /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
        /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
        /* JADX WARN: Type inference failed for: r0v6, types: [boolean] */
        /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
        public final int hashCode() {
            boolean z = this.isDefault;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            int i = r0 * 31;
            ?? r02 = this.videoImageAsyncLoad;
            int i2 = r02;
            if (r02 != 0) {
                i2 = 1;
            }
            int i3 = (i + i2) * 31;
            ?? r03 = this.userImageAsyncLoad;
            int i4 = r03;
            if (r03 != 0) {
                i4 = 1;
            }
            int i5 = (i3 + i4) * 31;
            ?? r04 = this.userLayoutOptimize;
            int i6 = r04;
            if (r04 != 0) {
                i6 = 1;
            }
            int i7 = (i5 + i6) * 31;
            ?? r05 = this.clickSearchOptimize;
            int i8 = r05;
            if (r05 != 0) {
                i8 = 1;
            }
            int i9 = (i7 + i8) * 31;
            ?? r06 = this.hashTagOptimize;
            int i10 = r06;
            if (r06 != 0) {
                i10 = 1;
            }
            return ((i9 + i10) * 31) + (this.listenerOptimize ? 1 : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("OptimizeConfig(isDefault=");
            LIZ.append(this.isDefault);
            LIZ.append(", videoImageAsyncLoad=");
            LIZ.append(this.videoImageAsyncLoad);
            LIZ.append(", userImageAsyncLoad=");
            LIZ.append(this.userImageAsyncLoad);
            LIZ.append(", userLayoutOptimize=");
            LIZ.append(this.userLayoutOptimize);
            LIZ.append(", clickSearchOptimize=");
            LIZ.append(this.clickSearchOptimize);
            LIZ.append(", hashTagOptimize=");
            LIZ.append(this.hashTagOptimize);
            LIZ.append(", listenerOptimize=");
            return C48339Iy7.LIZJ(LIZ, this.listenerOptimize, ')', LIZ);
        }

        public OptimizeConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
            this.isDefault = z;
            this.videoImageAsyncLoad = z2;
            this.userImageAsyncLoad = z3;
            this.userLayoutOptimize = z4;
            this.clickSearchOptimize = z5;
            this.hashTagOptimize = z6;
            this.listenerOptimize = z7;
        }

        public /* synthetic */ OptimizeConfig(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? true : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4, (i & 16) != 0 ? false : z5, (i & 32) != 0 ? false : z6, (i & 64) == 0 ? z7 : false);
        }
    }

    static {
        boolean z = false;
        LIZ = new OptimizeConfig(z, z, z, z, z, z, z, 127, null);
    }

    public static boolean LIZ() {
        return !((OptimizeConfig) LIZIZ.getValue()).isDefault;
    }
}
