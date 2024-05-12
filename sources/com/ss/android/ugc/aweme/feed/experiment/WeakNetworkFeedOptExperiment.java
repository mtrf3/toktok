package com.ss.android.ugc.aweme.feed.experiment;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.b0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes12.dex */
public final class WeakNetworkFeedOptExperiment {
    public static final WeakNetworkOptConfig LIZ;

    /* loaded from: classes12.dex */
    public static final class WeakNetworkOptConfig {

        @InterfaceC65349Pkn("initial")
        public final int initial;

        @InterfaceC65349Pkn("level")
        public final int level;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public WeakNetworkOptConfig() {
            /*
                r3 = this;
                r2 = 3
                r1 = 0
                r0 = 0
                r3.<init>(r0, r0, r2, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.experiment.WeakNetworkFeedOptExperiment.WeakNetworkOptConfig.<init>():void");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WeakNetworkOptConfig)) {
                return false;
            }
            WeakNetworkOptConfig weakNetworkOptConfig = (WeakNetworkOptConfig) obj;
            return this.level == weakNetworkOptConfig.level && this.initial == weakNetworkOptConfig.initial;
        }

        public final int hashCode() {
            return (this.level * 31) + this.initial;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("WeakNetworkOptConfig(level=");
            LIZ.append(this.level);
            LIZ.append(", initial=");
            return b0.LIZJ(LIZ, this.initial, ')', LIZ);
        }

        public WeakNetworkOptConfig(int i, int i2) {
            this.level = i;
            this.initial = i2;
        }

        public /* synthetic */ WeakNetworkOptConfig(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
        }
    }

    static {
        int i = 0;
        LIZ = new WeakNetworkOptConfig(i, i, 3, null);
    }
}
