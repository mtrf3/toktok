package com.ss.android.ugc.aweme.net.experiment;

import X.C16880lQ;
import X.C47135Ieh;
import X.C77275UUl;
import X.FFL;
import X.InterfaceC65349Pkn;
import X.JBR;
import X.X1D;
import java.util.Set;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class NetTimeOutExperiment {
    public static final NetTimeOutConfig LIZ;

    /* loaded from: classes10.dex */
    public static final class NetTimeOutConfig {

        @InterfaceC65349Pkn("socket_connect_timeout")
        public final long connectLimit;

        @InterfaceC65349Pkn("path")
        public final Set<String> pathList;

        @InterfaceC65349Pkn("protect_timeout")
        public final long protectLimit;

        @InterfaceC65349Pkn("socket_read_timeout")
        public final long readLimit;

        @InterfaceC65349Pkn("socket_write_timeout")
        public final long writeLimit;

        public NetTimeOutConfig() {
            this(null, 0L, 0L, 0L, 0L, 31, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NetTimeOutConfig)) {
                return false;
            }
            NetTimeOutConfig netTimeOutConfig = (NetTimeOutConfig) obj;
            return o.LJ(this.pathList, netTimeOutConfig.pathList) && this.connectLimit == netTimeOutConfig.connectLimit && this.readLimit == netTimeOutConfig.readLimit && this.writeLimit == netTimeOutConfig.writeLimit && this.protectLimit == netTimeOutConfig.protectLimit;
        }

        public final int hashCode() {
            return C16880lQ.LLJIJIL(this.protectLimit) + JBR.LIZJ(this.writeLimit, JBR.LIZJ(this.readLimit, JBR.LIZJ(this.connectLimit, this.pathList.hashCode() * 31, 31), 31), 31);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("NetTimeOutConfig(pathList=");
            LIZ.append(this.pathList);
            LIZ.append(", connectLimit=");
            LIZ.append(this.connectLimit);
            LIZ.append(", readLimit=");
            LIZ.append(this.readLimit);
            LIZ.append(", writeLimit=");
            LIZ.append(this.writeLimit);
            LIZ.append(", protectLimit=");
            return C47135Ieh.LIZIZ(LIZ, this.protectLimit, ')', LIZ);
        }

        public NetTimeOutConfig(Set<String> pathList, long j, long j2, long j3, long j4) {
            o.LJIIIZ(pathList, "pathList");
            this.pathList = pathList;
            this.connectLimit = j;
            this.readLimit = j2;
            this.writeLimit = j3;
            this.protectLimit = j4;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public NetTimeOutConfig(java.util.Set r11, long r12, long r14, long r16, long r18, int r20, kotlin.jvm.internal.DefaultConstructorMarker r21) {
            /*
                r10 = this;
                r8 = r18
                r4 = r14
                r1 = r11
                r2 = r12
                r0 = r20 & 1
                if (r0 == 0) goto Lb
                X.OQY r1 = X.OQY.INSTANCE
            Lb:
                r0 = r20 & 2
                r6 = 15000(0x3a98, double:7.411E-320)
                if (r0 == 0) goto L13
                r2 = 15000(0x3a98, double:7.411E-320)
            L13:
                r0 = r20 & 4
                if (r0 == 0) goto L19
                r4 = 15000(0x3a98, double:7.411E-320)
            L19:
                r0 = r20 & 8
                if (r0 == 0) goto L29
            L1d:
                r0 = r20 & 16
                if (r0 == 0) goto L24
                long r8 = r2 + r4
                long r8 = r8 + r6
            L24:
                r0 = r10
                r0.<init>(r1, r2, r4, r6, r8)
                return
            L29:
                r6 = r16
                goto L1d
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.net.experiment.NetTimeOutExperiment.NetTimeOutConfig.<init>(java.util.Set, long, long, long, long, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }

    static {
        NetTimeOutConfig netTimeOutConfig = new NetTimeOutConfig(C77275UUl.LJIIIIZZ("/aweme/v1/feed/", "/aweme/v2/feed/", "/aweme/v1/follow/feed/", "/aweme/v2/follow/feed/", "/aweme/v1/aweme/post/", "/aweme/v2/aweme/post/", "/aweme/v1/user/", "/aweme/v1/user/profile/self", "/aweme/v1/user/profile/other", "/aweme/v1/nearby/feed/", "/aweme/v1/create/aweme/", "/aweme/v2/comment/list/", "/aweme/v1/comment/publish/"), 60000L, 60000L, 60000L, 180000L);
        new NetTimeOutConfig(null, 0L, 0L, 0L, 0L, 31, null);
        FFL.LJIIIZ().getClass();
        NetTimeOutConfig netTimeOutConfig2 = (NetTimeOutConfig) FFL.LJIJ(true, "net_common_time_out", 31744, NetTimeOutConfig.class, netTimeOutConfig);
        if (netTimeOutConfig2 != null) {
            netTimeOutConfig = netTimeOutConfig2;
        }
        LIZ = netTimeOutConfig;
    }
}
