package com.ss.android.ugc.aweme.property;

import X.C221108m2;
import X.C53543Kzr;
import X.C62822Ol8;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import defpackage.b0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes10.dex */
public final class EffectPlatformSingleConfig {
    public static final PlatformAPIConfig LIZ;
    public static final C62822Ol8 LIZIZ;

    /* loaded from: classes10.dex */
    public static final class PlatformAPIConfig {

        @InterfaceC65349Pkn("dirCacheSizeInMB")
        public final int dirCacheSizeInMB;

        @InterfaceC65349Pkn("useIOExecutor")
        public final boolean useIOExecutor;

        /* JADX WARN: Multi-variable type inference failed */
        public PlatformAPIConfig() {
            this(false, 0 == true ? 1 : 0, 3, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PlatformAPIConfig)) {
                return false;
            }
            PlatformAPIConfig platformAPIConfig = (PlatformAPIConfig) obj;
            return this.useIOExecutor == platformAPIConfig.useIOExecutor && this.dirCacheSizeInMB == platformAPIConfig.dirCacheSizeInMB;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v4 */
        public final int hashCode() {
            boolean z = this.useIOExecutor;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            return (r0 * 31) + this.dirCacheSizeInMB;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("PlatformAPIConfig(useIOExecutor=");
            LIZ.append(this.useIOExecutor);
            LIZ.append(", dirCacheSizeInMB=");
            return b0.LIZJ(LIZ, this.dirCacheSizeInMB, ')', LIZ);
        }

        public PlatformAPIConfig(boolean z, int i) {
            this.useIOExecutor = z;
            this.dirCacheSizeInMB = i;
        }

        public /* synthetic */ PlatformAPIConfig(boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? LiveChatShowDelayForHotLiveSetting.DEFAULT : i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Object[] objArr = 0 == true ? 1 : 0;
        LIZ = new PlatformAPIConfig(false, objArr, 3, null);
        LIZIZ = C221108m2.LIZIZ(C53543Kzr.LJLIL);
    }
}
