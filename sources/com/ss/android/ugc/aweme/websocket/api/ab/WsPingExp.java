package com.ss.android.ugc.aweme.websocket.api.ab;

import X.C221108m2;
import X.C62822Ol8;
import X.C79062V1e;
import X.C87334YPi;
import X.C87335YPj;
import X.C87336YPk;
import X.C87337YPl;
import X.C87338YPm;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import defpackage.b0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class WsPingExp {
    public static final MetaData LIZ = new MetaData(false, 0, null, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C87337YPl.LJLIL);
    public static final C62822Ol8 LIZJ = C221108m2.LIZIZ(C87335YPj.LJLIL);
    public static final C62822Ol8 LIZLLL = C221108m2.LIZIZ(C87334YPi.LJLIL);
    public static final C62822Ol8 LJ = C221108m2.LIZIZ(C87338YPm.LJLIL);
    public static final C62822Ol8 LJFF = C221108m2.LIZIZ(C87336YPk.LJLIL);

    /* loaded from: classes16.dex */
    public static final class MetaData {

        @InterfaceC65349Pkn("delay_seconds")
        public final long delaySeconds;

        @InterfaceC65349Pkn("enabled")
        public final boolean enabled;

        @InterfaceC65349Pkn("host")
        public final String host;

        @InterfaceC65349Pkn("timeout_seconds")
        public final int timeoutSeconds;

        /* JADX WARN: Multi-variable type inference failed */
        public MetaData() {
            this(false, 0L, null, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MetaData)) {
                return false;
            }
            MetaData metaData = (MetaData) obj;
            return this.enabled == metaData.enabled && this.delaySeconds == metaData.delaySeconds && o.LJ(this.host, metaData.host) && this.timeoutSeconds == metaData.timeoutSeconds;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v5 */
        /* JADX WARN: Type inference failed for: r0v6 */
        public final int hashCode() {
            boolean z = this.enabled;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            return C79062V1e.LJ(this.host, JBR.LIZJ(this.delaySeconds, r0 * 31, 31), 31) + this.timeoutSeconds;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("MetaData(enabled=");
            LIZ.append(this.enabled);
            LIZ.append(", delaySeconds=");
            LIZ.append(this.delaySeconds);
            LIZ.append(", host=");
            LIZ.append(this.host);
            LIZ.append(", timeoutSeconds=");
            return b0.LIZJ(LIZ, this.timeoutSeconds, ')', LIZ);
        }

        public MetaData(boolean z, long j, String host, int i) {
            o.LJIIIZ(host, "host");
            this.enabled = z;
            this.delaySeconds = j;
            this.host = host;
            this.timeoutSeconds = i;
        }

        public /* synthetic */ MetaData(boolean z, long j, String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? 0L : j, (i2 & 4) != 0 ? "www.google.com" : str, (i2 & 8) != 0 ? 2 : i);
        }
    }
}
