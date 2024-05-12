package com.ss.android.ugc.tiktok.security.settings;

import X.C48339Iy7;
import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public final class WebViewHttpsGuardSettings {
    public static final HttpsGuardConfig LIZ = new HttpsGuardConfig(false, 1, null);

    /* loaded from: classes7.dex */
    public static final class HttpsGuardConfig {

        @InterfaceC65349Pkn("enabled")
        public boolean enable;

        public HttpsGuardConfig() {
            this(false, 1, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HttpsGuardConfig) && this.enable == ((HttpsGuardConfig) obj).enable;
        }

        public final int hashCode() {
            boolean z = this.enable;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("HttpsGuardConfig(enable=");
            return C48339Iy7.LIZJ(LIZ, this.enable, ')', LIZ);
        }

        public HttpsGuardConfig(boolean z) {
            this.enable = z;
        }

        public /* synthetic */ HttpsGuardConfig(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }
    }
}
