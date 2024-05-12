package com.ss.android.ugc.aweme.commercialize.live.settings;

import X.C48339Iy7;
import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes10.dex */
public final class PromoteLiveSetting {
    public static final PromoteLiveSwitch LIZ = new PromoteLiveSwitch(true, true);

    /* loaded from: classes10.dex */
    public static final class PromoteLiveSwitch {

        @InterfaceC65349Pkn("promote_before_live")
        public final boolean promoteBeforeLive;

        @InterfaceC65349Pkn("promote_in_live")
        public final boolean promoteInLive;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public PromoteLiveSwitch() {
            /*
                r3 = this;
                r2 = 3
                r1 = 0
                r0 = 0
                r3.<init>(r0, r0, r2, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.live.settings.PromoteLiveSetting.PromoteLiveSwitch.<init>():void");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PromoteLiveSwitch)) {
                return false;
            }
            PromoteLiveSwitch promoteLiveSwitch = (PromoteLiveSwitch) obj;
            return this.promoteBeforeLive == promoteLiveSwitch.promoteBeforeLive && this.promoteInLive == promoteLiveSwitch.promoteInLive;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v4 */
        public final int hashCode() {
            boolean z = this.promoteBeforeLive;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            return (r0 * 31) + (this.promoteInLive ? 1 : 0);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("PromoteLiveSwitch(promoteBeforeLive=");
            LIZ.append(this.promoteBeforeLive);
            LIZ.append(", promoteInLive=");
            return C48339Iy7.LIZJ(LIZ, this.promoteInLive, ')', LIZ);
        }

        public PromoteLiveSwitch(boolean z, boolean z2) {
            this.promoteBeforeLive = z;
            this.promoteInLive = z2;
        }

        public /* synthetic */ PromoteLiveSwitch(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2);
        }
    }
}
