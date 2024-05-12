package X;

import sun.misc.Unsafe;

/* renamed from: X.ZbW, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final /* synthetic */ class C90254ZbW {
    public static /* synthetic */ boolean LIZ(Unsafe unsafe, Object obj, long j, Object obj2, Object obj3) {
        while (!unsafe.compareAndSwapObject(obj, j, obj2, obj3)) {
            if (unsafe.getObject(obj, j) != obj2) {
                return false;
            }
        }
        return true;
    }
}
