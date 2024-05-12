package com.ss.android.ugc.aweme.encouragepublish.config;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.bytedance.ies.abmock.SettingsManager;
import defpackage.b0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class NearbyEncouragePublishCardShowInterval {
    public static final NearbyEncouragePublishCardShowInterval LIZ = new NearbyEncouragePublishCardShowInterval();
    public static final InnerConfig LIZIZ = new InnerConfig(2, 432000, 864000);

    /* loaded from: classes10.dex */
    public static final class InnerConfig {

        @InterfaceC65349Pkn("interval_with_user_interact")
        public final int intervalWithUserInteract;

        @InterfaceC65349Pkn("interval_without_user_interact")
        public final int intervalWithoutUserInteract;

        @InterfaceC65349Pkn("max_count")
        public final int maxCount;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public InnerConfig() {
            /*
                r6 = this;
                r1 = 0
                r4 = 7
                r5 = 0
                r0 = r6
                r2 = r1
                r3 = r1
                r0.<init>(r1, r2, r3, r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.encouragepublish.config.NearbyEncouragePublishCardShowInterval.InnerConfig.<init>():void");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InnerConfig)) {
                return false;
            }
            InnerConfig innerConfig = (InnerConfig) obj;
            return this.maxCount == innerConfig.maxCount && this.intervalWithUserInteract == innerConfig.intervalWithUserInteract && this.intervalWithoutUserInteract == innerConfig.intervalWithoutUserInteract;
        }

        public final int hashCode() {
            return (((this.maxCount * 31) + this.intervalWithUserInteract) * 31) + this.intervalWithoutUserInteract;
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("InnerConfig(maxCount=");
            LIZ.append(this.maxCount);
            LIZ.append(", intervalWithUserInteract=");
            LIZ.append(this.intervalWithUserInteract);
            LIZ.append(", intervalWithoutUserInteract=");
            return b0.LIZJ(LIZ, this.intervalWithoutUserInteract, ')', LIZ);
        }

        public InnerConfig(int i, int i2, int i3) {
            this.maxCount = i;
            this.intervalWithUserInteract = i2;
            this.intervalWithoutUserInteract = i3;
        }

        public /* synthetic */ InnerConfig(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? 2 : i, (i4 & 2) != 0 ? 432000 : i2, (i4 & 4) != 0 ? 864000 : i3);
        }
    }

    public static InnerConfig LIZ() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        InnerConfig innerConfig = LIZIZ;
        InnerConfig innerConfig2 = (InnerConfig) LIZLLL.LJIIIIZZ("nearby_encourage_publish_card_show_interval", InnerConfig.class, innerConfig);
        if (innerConfig2 != null) {
            innerConfig = innerConfig2;
        }
        o.LJIIIIZZ(innerConfig, "SettingsManager.getInsta…s.java)\n            ?: V0");
        return innerConfig;
    }
}
