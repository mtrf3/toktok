package com.ss.android.ugc.aweme.im.sdk.chat.experiment;

import X.C221108m2;
import X.C62822Ol8;
import X.C75742yA;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class FakeMessageConfig {
    public static final Config LIZ;
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C75742yA.LJLIL);

    static {
        long j = 0;
        LIZ = new Config(0, j, j, j, 15, null);
    }

    /* loaded from: classes2.dex */
    public static final class Config {

        @InterfaceC65349Pkn("max_search_index")
        public final int maxSearchIndex;

        @InterfaceC65349Pkn("report_insert_perf_interval")
        public final long reportInsertPerfInterval;

        @InterfaceC65349Pkn("request_content_interval")
        public final long requestContentInterval;

        @InterfaceC65349Pkn("request_content_retry_interval")
        public final long requestContentRetryInterval;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public Config() {
            /*
                r10 = this;
                r1 = 0
                r2 = 0
                r8 = 15
                r9 = 0
                r0 = r10
                r4 = r2
                r6 = r2
                r0.<init>(r1, r2, r4, r6, r8, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.experiment.FakeMessageConfig.Config.<init>():void");
        }

        public Config(int i, long j, long j2, long j3) {
            this.maxSearchIndex = i;
            this.reportInsertPerfInterval = j;
            this.requestContentInterval = j2;
            this.requestContentRetryInterval = j3;
        }

        public /* synthetic */ Config(int i, long j, long j2, long j3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 1000 : i, (i2 & 2) != 0 ? 600000L : j, (i2 & 4) != 0 ? 60000L : j2, (i2 & 8) != 0 ? 3000L : j3);
        }
    }
}
