package com.bytedance.netecho;

import X.C16880lQ;
import X.C68322mC;
import X.X1D;
import com.bytedance.netecho.result.DnsResolveResult;
import com.bytedance.netecho.result.IcmpDetectResult;
import com.bytedance.netecho.result.IcmpPacketResult;
import com.bytedance.netecho.result.TcpDetectResult;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import java.net.InetAddress;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class Netecho {
    public static final Netecho INSTANCE = new Netecho();
    public static final String TAG = TAG;
    public static final String TAG = TAG;
    public static final String LIB_NAME = LIB_NAME;
    public static final String LIB_NAME = LIB_NAME;
    public static final int STAGE_ATON = 1;
    public static final int STAGE_SOCKET = 2;
    public static final int STAGE_SET_OPT = 3;
    public static final int STAGE_SEND = 4;
    public static final int STAGE_RECV = 5;
    public static final int STAGE_FINISH = 6;

    public static final native IcmpDetectResult nativeDetectIcmp(String str, long j, int i);

    public static final native IcmpDetectResult nativeDetectIcmpV6(String str, int i, long j, int i2);

    public static final native TcpDetectResult nativeDetectTcp(String str, int i, long j);

    public static final native TcpDetectResult nativeDetectTcpV6(String str, int i, long j);

    static {
        NetechoConfig.INSTANCE.getLoadLibrary().invoke(LIB_NAME);
    }

    public static final IcmpPacketResult[] createIcmpPacketResultsArray(int i) {
        IcmpPacketResult[] icmpPacketResultArr = new IcmpPacketResult[i];
        for (int i2 = 0; i2 < i; i2++) {
            icmpPacketResultArr[i2] = null;
        }
        return icmpPacketResultArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.concurrent.CountDownLatch, T] */
    public final DnsResolveResult resolveDns(final String hostName, long j) {
        o.LJIIJ(hostName, "hostName");
        final C68322mC c68322mC = new C68322mC();
        boolean z = true;
        c68322mC.element = new CountDownLatch(1);
        final C68322mC c68322mC2 = new C68322mC();
        c68322mC2.element = null;
        final C68322mC c68322mC3 = new C68322mC();
        c68322mC3.element = null;
        new PthreadThread(new Runnable() { // from class: com.bytedance.netecho.Netecho$resolveDns$1
            @Override // java.lang.Runnable
            public final void run() {
                com_bytedance_netecho_Netecho$resolveDns$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v10, types: [T, java.lang.String] */
            /* JADX WARN: Type inference failed for: r0v4, types: [T, java.lang.String] */
            public final void com_bytedance_netecho_Netecho$resolveDns$1__run$___twin___() {
                try {
                    C68322mC c68322mC4 = C68322mC.this;
                    InetAddress byName = InetAddress.getByName(hostName);
                    o.LJFF(byName, "InetAddress.getByName(hostName)");
                    c68322mC4.element = byName.getHostAddress();
                } catch (Throwable th) {
                    th = th;
                    do {
                        C68322mC c68322mC5 = c68322mC3;
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append(C16880lQ.LJLLJ(th.getClass()));
                        LIZ.append(":");
                        LIZ.append(th.getMessage());
                        c68322mC5.element = X1D.LIZIZ(LIZ);
                        th = th.getCause();
                    } while (th != null);
                }
                ((CountDownLatch) c68322mC.element).countDown();
            }

            public static void com_bytedance_netecho_Netecho$resolveDns$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(Netecho$resolveDns$1 netecho$resolveDns$1) {
                boolean LIZ;
                try {
                    netecho$resolveDns$1.com_bytedance_netecho_Netecho$resolveDns$1__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }
        }, "techo/Netecho").start();
        ((CountDownLatch) c68322mC.element).await(j, TimeUnit.MILLISECONDS);
        T t = c68322mC2.element;
        if (t == 0) {
            z = false;
        }
        return new DnsResolveResult(z, (String) t, (String) c68322mC3.element);
    }

    public static final TcpDetectResult createTcpDetectResult(boolean z, int i, int i2) {
        return new TcpDetectResult(z, i, i2);
    }

    public final IcmpDetectResult detectIcmp(String hostIp, long j, int i) {
        o.LJIIJ(hostIp, "hostIp");
        return nativeDetectIcmp(hostIp, j, i);
    }

    public final TcpDetectResult detectTcp(String hostIp, int i, long j) {
        o.LJIIJ(hostIp, "hostIp");
        return nativeDetectTcp(hostIp, i, j);
    }

    public final TcpDetectResult detectTcpV6(String hostIp, int i, long j) {
        o.LJIIJ(hostIp, "hostIp");
        return nativeDetectTcpV6(hostIp, i, j);
    }

    public static final IcmpDetectResult createIcmpDetectResult(boolean z, IcmpPacketResult[] icmpPacketResultArr, int i, int i2) {
        return new IcmpDetectResult(z, icmpPacketResultArr, i, i2);
    }

    public final IcmpDetectResult detectIcmpV6(String hostIp, int i, long j, int i2) {
        o.LJIIJ(hostIp, "hostIp");
        return nativeDetectIcmpV6(hostIp, i, j, i2);
    }

    public static final void addIcmpPacketResultToArray(IcmpPacketResult[] packetResultsArray, int i, boolean z, int i2, float f, int i3) {
        o.LJIIJ(packetResultsArray, "packetResultsArray");
        packetResultsArray[i] = new IcmpPacketResult(z, i2, f, i3);
    }
}
