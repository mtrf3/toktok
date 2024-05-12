package com.bytedance.common.jato.memory.gcblocker;

import X.QXX;
import android.os.Build;
import java.util.HashMap;

/* loaded from: classes7.dex */
public final class GcBlocker extends QXX {
    public final HashMap<String, Integer> LJLIL;

    public static native int nativeCreateToken(boolean z);

    public static native void nativeReleaseToken(int i);

    public static native void nativeRequestBlockGc(long j);

    public static native void nativeSetMaxGcBlockTime(int i);

    public static native int nativeStartBlockGc(int i);

    public static native void nativeStopBlockGc(int i);

    public static boolean LLLLZ() {
        long j = Runtime.getRuntime().totalMemory();
        if ((Build.VERSION.SDK_INT >= 29 && j >= 536870912) || j < 209715200) {
            return true;
        }
        return false;
    }

    public GcBlocker(int i) {
        super((Object) null);
        this.LJLIL = new HashMap<>();
        nativeSetMaxGcBlockTime(i);
    }

    @Override // X.QXX
    public final void LLLLIL(long j) {
        if (LLLLZ() && j > 0 && j <= 5000) {
            nativeRequestBlockGc(j);
        }
    }

    @Override // X.QXX
    public final void LLLLJI(int i) {
        nativeSetMaxGcBlockTime(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
    
        if (r1 != null) goto L10;
     */
    @Override // X.QXX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLLLJLJLL(java.lang.String r4) {
        /*
            r3 = this;
            boolean r0 = LLLLZ()
            if (r0 == 0) goto L35
            java.util.HashMap<java.lang.String, java.lang.Integer> r2 = r3.LJLIL
            monitor-enter(r2)
            java.util.HashMap<java.lang.String, java.lang.Integer> r0 = r3.LJLIL     // Catch: java.lang.Throwable -> L32
            java.lang.Object r1 = r0.get(r4)     // Catch: java.lang.Throwable -> L32
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L32
            if (r1 != 0) goto L23
            r0 = 0
            int r0 = nativeCreateToken(r0)     // Catch: java.lang.Throwable -> L32
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L32
            java.util.HashMap<java.lang.String, java.lang.Integer> r0 = r3.LJLIL     // Catch: java.lang.Throwable -> L32
            r0.put(r4, r1)     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L30
        L23:
            int r0 = r1.intValue()     // Catch: java.lang.Throwable -> L32
            if (r0 < 0) goto L30
            int r0 = r1.intValue()     // Catch: java.lang.Throwable -> L32
            nativeStartBlockGc(r0)     // Catch: java.lang.Throwable -> L32
        L30:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L32
            goto L35
        L32:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L32
            throw r0
        L35:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.jato.memory.gcblocker.GcBlocker.LLLLLJLJLL(java.lang.String):void");
    }

    @Override // X.QXX
    public final void LLLLLLIL(String str) {
        synchronized (this.LJLIL) {
            Integer remove = this.LJLIL.remove(str);
            if (remove != null && remove.intValue() >= 0) {
                nativeStopBlockGc(remove.intValue());
                nativeReleaseToken(remove.intValue());
            }
        }
    }
}
