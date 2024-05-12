package com.bytedance.ies.ugc.statisticlogger.config;

import X.FI7;
import X.InterfaceC65349Pkn;

@FI7("AppLog_send_callback_config")
/* loaded from: classes7.dex */
public final class AppLogSendCallbackConfig {
    public static final AppLogSendCallbackConfig LIZ = new AppLogSendCallbackConfig();
    public static final String[] LIZIZ = new String[0];
    public static final Model LIZJ = new Model(null, null, 3, null);

    /* loaded from: classes7.dex */
    public static final class Model {

        @InterfaceC65349Pkn("ban_header_list")
        public final String[] banHeaderList;

        @InterfaceC65349Pkn("enable")
        public final Boolean enable;

        public Model() {
            this(null, null, 3, null);
        }

        public Model(Boolean bool, String[] strArr) {
            this.enable = bool;
            this.banHeaderList = strArr;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public Model(java.lang.Boolean r2, java.lang.String[] r3, int r4, kotlin.jvm.internal.DefaultConstructorMarker r5) {
            /*
                r1 = this;
                r0 = r4 & 1
                if (r0 == 0) goto L6
                java.lang.Boolean r2 = java.lang.Boolean.TRUE
            L6:
                r0 = r4 & 2
                if (r0 == 0) goto L11
                com.bytedance.ies.ugc.statisticlogger.config.AppLogSendCallbackConfig r0 = com.bytedance.ies.ugc.statisticlogger.config.AppLogSendCallbackConfig.LIZ
                r0.getClass()
                java.lang.String[] r3 = com.bytedance.ies.ugc.statisticlogger.config.AppLogSendCallbackConfig.LIZIZ
            L11:
                r1.<init>(r2, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.ugc.statisticlogger.config.AppLogSendCallbackConfig.Model.<init>(java.lang.Boolean, java.lang.String[], int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }
}
