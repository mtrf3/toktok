package X;

import com.ss.android.deviceregister.DeviceRegisterManager;
import java.util.concurrent.ConcurrentLinkedDeque;

/* renamed from: X.Rwy, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71200Rwy {
    public final ConcurrentLinkedDeque<C71218RxG> LIZ = new ConcurrentLinkedDeque<>();
    public final ConcurrentLinkedDeque<C71231RxT> LIZIZ = new ConcurrentLinkedDeque<>();
    public final String LIZJ = DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId();

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0077, code lost:
    
        if (r0 > 0) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.InterfaceC70422pa r15, com.bytedance.android.livesdk.model.message.ext.ECommerceMessage r16, X.InterfaceC65784Pro<X.C76800UCe> r17) {
        /*
            r14 = this;
            java.lang.String r0 = "viewModelScope"
            kotlin.jvm.internal.o.LJIIIZ(r15, r0)
            java.lang.String r0 = "message"
            r12 = r16
            kotlin.jvm.internal.o.LJIIIZ(r12, r0)
            long r1 = r12.pinCardDelayTime
            r13 = 0
            r6 = 0
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            r11 = r14
            if (r0 != 0) goto L33
            java.util.concurrent.ConcurrentLinkedDeque<X.RxG> r0 = r11.LIZ
            java.util.Iterator r1 = r0.iterator()
        L1c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L2e
            java.lang.Object r0 = r1.next()
            X.RxG r0 = (X.C71218RxG) r0
            X.V4o r0 = r0.LJLILLLLZI
            r0.LIZIZ(r13)
            goto L1c
        L2e:
            java.util.concurrent.ConcurrentLinkedDeque<X.RxG> r0 = r11.LIZ
            r0.clear()
        L33:
            java.util.concurrent.ConcurrentLinkedDeque<X.RxG> r0 = r11.LIZ
            java.util.Iterator r5 = r0.iterator()
        L39:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L5e
            java.lang.Object r1 = r5.next()
            X.RxG r1 = (X.C71218RxG) r1
            com.bytedance.android.livesdk.model.message.ext.TraceInfo r0 = r12.traceInfo
            if (r0 == 0) goto L5b
            long r2 = r0.operateTime
        L4b:
            com.bytedance.android.livesdk.model.message.ext.ECommerceMessage r0 = r1.LJLJI
            com.bytedance.android.livesdk.model.message.ext.TraceInfo r0 = r0.traceInfo
            if (r0 == 0) goto L58
            long r0 = r0.operateTime
        L53:
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 >= 0) goto L39
            return
        L58:
            r0 = 0
            goto L53
        L5b:
            r2 = 0
            goto L4b
        L5e:
            long r2 = java.lang.System.currentTimeMillis()
            X.Ol8 r4 = X.C53162Kti.LIZ
            java.lang.Object r0 = r4.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            r0 = -1
            r10 = r17
            if (r1 != r0) goto L92
            long r0 = r12.pinCardDelayTime
            int r4 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r4 <= 0) goto L7d
        L79:
            int r4 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r4 != 0) goto L81
        L7d:
            r10.invoke()
            return
        L81:
            java.lang.String r5 = r11.LIZJ
            java.lang.String r4 = "did"
            kotlin.jvm.internal.o.LJIIIIZZ(r5, r4)
            long r8 = com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(r5)
            long r8 = r8 % r0
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 != 0) goto L9e
            goto L7d
        L92:
            java.lang.Object r0 = r4.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            long r0 = (long) r0
            goto L79
        L9e:
            X.XIF r4 = X.C36576EXc.LIZJ
            X.Rwx r7 = new X.Rwx
            r1 = r7
            r7.<init>(r8, r10, r11, r12, r13)
            r0 = 2
            X.XKQ r4 = X.XKX.LIZLLL(r15, r4, r13, r1, r0)
            java.util.concurrent.ConcurrentLinkedDeque<X.RxG> r1 = r11.LIZ
            X.RxG r0 = new X.RxG
            long r2 = r2 + r8
            r0.<init>(r2, r4, r12)
            r1.add(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71200Rwy.LIZ(X.2pa, com.bytedance.android.livesdk.model.message.ext.ECommerceMessage, X.Pro):void");
    }
}
