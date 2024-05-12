package X;

import java.util.concurrent.Callable;

/* renamed from: X.PXp, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class CallableC64617PXp implements Callable<Void> {
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        if (r3 != null) goto L12;
     */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Void call() {
        /*
            r7 = this;
            com.bytedance.common.utility.Logger.debug()
            java.util.concurrent.atomic.AtomicBoolean r6 = X.C64616PXo.LIZIZ
            r5 = 0
            r4 = 0
            java.net.DatagramSocket r3 = new java.net.DatagramSocket     // Catch: java.io.IOException -> L3b java.lang.Throwable -> L3f
            r3.<init>()     // Catch: java.io.IOException -> L3b java.lang.Throwable -> L3f
            java.net.InetSocketAddress r2 = new java.net.InetSocketAddress     // Catch: java.io.IOException -> L34 java.lang.Throwable -> L41
            java.lang.String r1 = X.C64616PXo.LIZ     // Catch: java.io.IOException -> L34 java.lang.Throwable -> L41
            r0 = 53
            r2.<init>(r1, r0)     // Catch: java.io.IOException -> L34 java.lang.Throwable -> L41
            r3.connect(r2)     // Catch: java.io.IOException -> L34 java.lang.Throwable -> L41
            java.net.InetAddress r1 = r3.getLocalAddress()     // Catch: java.io.IOException -> L34 java.lang.Throwable -> L41
            boolean r0 = r1 instanceof java.net.Inet6Address     // Catch: java.io.IOException -> L34 java.lang.Throwable -> L41
            if (r0 == 0) goto L38
            boolean r0 = r1.isLinkLocalAddress()     // Catch: java.io.IOException -> L34 java.lang.Throwable -> L41
            r2 = r0 ^ 1
            java.lang.String r1 = r1.getHostAddress()     // Catch: java.io.IOException -> L34 java.lang.Throwable -> L41
            java.lang.String r0 = "2001:0000"
            boolean r0 = r1.startsWith(r0)     // Catch: java.io.IOException -> L34 java.lang.Throwable -> L41
            if (r0 == 0) goto L37
            goto L38
        L34:
            if (r3 == 0) goto L3b
            goto L38
        L37:
            r4 = r2
        L38:
            r3.close()
        L3b:
            r6.set(r4)
            return r5
        L3f:
            r0 = move-exception
            goto L45
        L41:
            r0 = move-exception
            r3.close()
        L45:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CallableC64617PXp.call():java.lang.Object");
    }
}
