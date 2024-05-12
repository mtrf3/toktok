package com.ss.android.ugc.aweme.notice.api.ab;

import X.C16880lQ;
import X.C221108m2;
import X.C47135Ieh;
import X.C62822Ol8;
import X.EI8;
import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public final class InboxNoticeCountStrategyExperiment {
    public static final InboxNoticeCountStrategyExperiment LIZ = new InboxNoticeCountStrategyExperiment();
    public static final MetaData LIZIZ = new MetaData(0, 0, 3, null);
    public static final C62822Ol8 LIZJ;
    public static final long LIZLLL;

    /* loaded from: classes7.dex */
    public static final class MetaData {

        @InterfaceC65349Pkn("delay_milli_seconds")
        public final long delayMilliSeconds;

        @InterfaceC65349Pkn("strategy")
        public final int strategy;

        public MetaData() {
            this(0, 0L, 3, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MetaData)) {
                return false;
            }
            MetaData metaData = (MetaData) obj;
            return this.strategy == metaData.strategy && this.delayMilliSeconds == metaData.delayMilliSeconds;
        }

        public final int hashCode() {
            return C16880lQ.LLJIJIL(this.delayMilliSeconds) + (this.strategy * 31);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("MetaData(strategy=");
            LIZ.append(this.strategy);
            LIZ.append(", delayMilliSeconds=");
            return C47135Ieh.LIZIZ(LIZ, this.delayMilliSeconds, ')', LIZ);
        }

        public MetaData(int i, long j) {
            this.strategy = i;
            this.delayMilliSeconds = j;
        }

        public /* synthetic */ MetaData(int i, long j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? 8000L : j);
        }
    }

    static {
        C62822Ol8 LIZIZ2 = C221108m2.LIZIZ(EI8.LJLIL);
        LIZJ = LIZIZ2;
        LIZLLL = ((MetaData) LIZIZ2.getValue()).delayMilliSeconds;
    }
}
