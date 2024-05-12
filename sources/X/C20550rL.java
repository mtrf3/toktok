package X;

import android.content.Context;
import android.os.PowerManager;
import defpackage.i0;
import java.util.WeakHashMap;

/* renamed from: X.0rL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20550rL {
    public static final WeakHashMap<PowerManager.WakeLock, String> LIZ;

    static {
        C0VW.LIZIZ("WakeLocks");
        LIZ = new WeakHashMap<>();
    }

    public static PowerManager.WakeLock LIZ(Context context, String str) {
        PowerManager powerManager = (PowerManager) C16880lQ.LLILL(C16880lQ.LLLLL(context), "power");
        String LJFF = i0.LJFF("WorkManager: ", str);
        PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, LJFF);
        WeakHashMap<PowerManager.WakeLock, String> weakHashMap = LIZ;
        synchronized (weakHashMap) {
            weakHashMap.put(newWakeLock, LJFF);
        }
        return newWakeLock;
    }
}
