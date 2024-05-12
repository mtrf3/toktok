package X;

import android.os.Handler;
import com.bytedance.common.utility.reflect.Reflect;
import java.lang.reflect.Field;

/* loaded from: classes7.dex */
public final class EYG implements Handler.Callback {
    public Reflect LJLIL;
    public Field LJLILLLLZI;

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0019, code lost:
    
        if (r1 != 160) goto L15;
     */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean handleMessage(android.os.Message r7) {
        /*
            r6 = this;
            r4 = 0
            if (r7 != 0) goto L4
            return r4
        L4:
            int r1 = r7.what
            r0 = 103(0x67, float:1.44E-43)
            r3 = 1
            if (r1 == r0) goto L55
            r0 = 104(0x68, float:1.46E-43)
            if (r1 == r0) goto L55
            r0 = 126(0x7e, float:1.77E-43)
            if (r1 == r0) goto L39
            r0 = 156(0x9c, float:2.19E-43)
            if (r1 == r0) goto L1c
            r0 = 160(0xa0, float:2.24E-43)
            if (r1 == r0) goto L39
        L1b:
            return r4
        L1c:
            X.Ol8 r0 = X.EYL.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 <= 0) goto L1b
            android.os.Handler r5 = X.C37179EiV.LIZ()
            Y.ARunnableS1S0102000_6 r2 = new Y.ARunnableS1S0102000_6
            r1 = 2
            r0 = 0
            r2.<init>(r1, r3, r6, r0)
            r5.post(r2)
            goto L1b
        L39:
            X.Ol8 r0 = X.EYL.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 <= 0) goto L1b
            android.os.Handler r2 = X.C37179EiV.LIZ()
            Y.ARunnableS1S0102000_6 r1 = new Y.ARunnableS1S0102000_6
            r0 = 0
            r1.<init>(r3, r3, r6, r0)
            r2.post(r1)
            goto L1b
        L55:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L1b
            r0 = 24
            if (r1 < r0) goto L78
            java.lang.reflect.Field r0 = r6.LJLILLLLZI     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> Laf
            if (r0 != 0) goto L6d
            java.lang.String r0 = "com.android.internal.os.SomeArgs"
            java.lang.Class r1 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> Laf
            java.lang.String r0 = "arg1"
            java.lang.reflect.Field r0 = r1.getDeclaredField(r0)     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> Laf
            r6.LJLILLLLZI = r0     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> Laf
        L6d:
            java.lang.reflect.Field r1 = r6.LJLILLLLZI     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> Laf
            java.lang.Object r0 = r7.obj     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> Laf
            java.lang.Object r5 = r1.get(r0)     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> Laf
            android.os.IBinder r5 = (android.os.IBinder) r5     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> Laf
            goto L80
        L78:
            java.lang.Object r5 = r7.obj     // Catch: java.lang.Throwable -> L1b
            boolean r0 = r5 instanceof android.os.IBinder     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto Laf
            android.os.IBinder r5 = (android.os.IBinder) r5     // Catch: java.lang.Throwable -> L1b
        L80:
            com.bytedance.common.utility.reflect.Reflect r0 = r6.LJLIL     // Catch: java.lang.Throwable -> L1b
            if (r0 != 0) goto L96
            java.lang.String r0 = "android.app.ActivityThread"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L1b
            com.bytedance.common.utility.reflect.Reflect r1 = com.bytedance.common.utility.reflect.Reflect.on(r0)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r0 = "currentActivityThread"
            com.bytedance.common.utility.reflect.Reflect r0 = r1.call(r0)     // Catch: java.lang.Throwable -> L1b
            r6.LJLIL = r0     // Catch: java.lang.Throwable -> L1b
        L96:
            com.bytedance.common.utility.reflect.Reflect r2 = r6.LJLIL     // Catch: java.lang.Throwable -> L1b
            java.lang.String r1 = "mActivities"
            java.lang.Class[] r0 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L1b
            com.bytedance.common.utility.reflect.Reflect r0 = r2.field(r1, r0)     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L1b
            android.util.ArrayMap r0 = (android.util.ArrayMap) r0     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L1b
            boolean r0 = r0.containsKey(r5)     // Catch: java.lang.Throwable -> L1b
            if (r0 != 0) goto L1b
            goto Lb1
        Laf:
            r5 = 0
            goto L80
        Lb1:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EYG.handleMessage(android.os.Message):boolean");
    }
}
