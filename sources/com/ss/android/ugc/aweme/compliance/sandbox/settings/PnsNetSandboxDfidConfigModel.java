package com.ss.android.ugc.aweme.compliance.sandbox.settings;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class PnsNetSandboxDfidConfigModel extends F9E {

    @InterfaceC65349Pkn("host_white_list")
    public final List<String> hostWhiteList;

    @InterfaceC65349Pkn("stack_dfid_sample_rate")
    public final double stackDfidSampleRate;

    @InterfaceC65349Pkn("stack_sample_rate")
    public final double stackSampleRate;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public PnsNetSandboxDfidConfigModel() {
        /*
            r8 = this;
            r1 = 0
            r5 = 0
            r6 = 7
            r0 = r8
            r3 = r1
            r7 = r5
            r0.<init>(r1, r3, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.sandbox.settings.PnsNetSandboxDfidConfigModel.<init>():void");
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Double.valueOf(this.stackDfidSampleRate), Double.valueOf(this.stackSampleRate), this.hostWhiteList};
    }

    public PnsNetSandboxDfidConfigModel(double d, double d2, List<String> hostWhiteList) {
        o.LJIIIZ(hostWhiteList, "hostWhiteList");
        this.stackDfidSampleRate = d;
        this.stackSampleRate = d2;
        this.hostWhiteList = hostWhiteList;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ PnsNetSandboxDfidConfigModel(double r29, double r31, java.util.List r33, int r34, kotlin.jvm.internal.DefaultConstructorMarker r35) {
        /*
            r28 = this;
            r23 = r29
            r27 = r33
            r0 = r34 & 1
            r25 = 0
            if (r0 == 0) goto Lc
            r23 = 0
        Lc:
            r0 = r34 & 2
            if (r0 == 0) goto L50
        L10:
            r0 = r34 & 4
            if (r0 == 0) goto L4a
            java.lang.String r0 = "tiktokv.com"
            java.lang.String r1 = ".tiktokcdn.com"
            java.lang.String r2 = ".tiktokcdn-us.com"
            java.lang.String r3 = ".byteoversea.com"
            java.lang.String r4 = ".sgsnssdk.com"
            java.lang.String r5 = ".isnssdk.com"
            java.lang.String r6 = ".ibyteimg.com"
            java.lang.String r7 = ".ibytedtos.com"
            java.lang.String r8 = ".tiktok.com"
            java.lang.String r9 = ".xzcs3zlph.com"
            java.lang.String r10 = ".helo-api.com"
            java.lang.String r11 = ".byteoversea.net"
            java.lang.String r12 = ".byteintl.net"
            java.lang.String r13 = ".byteintl.com"
            java.lang.String r14 = ".pitaya-clientai.com"
            java.lang.String r15 = ".bytegecko-i18n.com"
            java.lang.String r16 = ".goofy-cdn.com"
            java.lang.String r17 = "akamaized.net"
            java.lang.String r18 = "byteicdn.com"
            java.lang.String r19 = "byteeffecttos-g.com"
            java.lang.String r20 = "ttlstatic.com"
            java.lang.String r21 = "ttwstatic.com"
            java.lang.String r22 = "bytedapm.com"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22}
            java.util.List r27 = X.C47261Igj.LJJIJIIJI(r0)
        L4a:
            r22 = r28
            r22.<init>(r23, r25, r27)
            return
        L50:
            r25 = r31
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.sandbox.settings.PnsNetSandboxDfidConfigModel.<init>(double, double, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
