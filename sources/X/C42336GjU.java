package X;

import android.os.SystemClock;
import com.bytedance.keva.Keva;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.GjU, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42336GjU {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C42338GjW.LJLIL);
    public final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C42337GjV.LJLIL);
    public final C62822Ol8 LIZJ = C221108m2.LIZIZ(C42339GjX.LJLIL);

    public final Keva LIZJ() {
        return (Keva) this.LIZIZ.getValue();
    }

    public final Keva LIZLLL() {
        return (Keva) this.LIZ.getValue();
    }

    public final void LIZIZ() {
        java.util.Map<String, ?> all = LIZJ().getAll();
        o.LJIIIIZZ(all, "countKeva.all");
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            o.LJII(value, "null cannot be cast to non-null type kotlin.Int");
            if (((Integer) value).intValue() > 1) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("LargeTransaction clear disk uuid: ");
                LIZ.append(key);
                H78.LJI(X1D.LIZIZ(LIZ));
                o.LJIIIIZZ(key, "key");
                LIZ(key);
            }
        }
        java.util.Map<String, ?> all2 = ((Keva) this.LIZJ.getValue()).getAll();
        o.LJIIIIZZ(all2, "timeKeva.all");
        for (Map.Entry<String, ?> entry2 : all2.entrySet()) {
            String key2 = entry2.getKey();
            Object value2 = entry2.getValue();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            long uptimeMillis = SystemClock.uptimeMillis();
            o.LJII(value2, "null cannot be cast to non-null type kotlin.Long");
            if (timeUnit.toHours(uptimeMillis - ((Long) value2).longValue()) > 2) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("LargeTransaction clear disk uuid: ");
                LIZ2.append(key2);
                LIZ2.append(" by time");
                H78.LJI(X1D.LIZIZ(LIZ2));
                o.LJIIIIZZ(key2, "key");
                LIZ(key2);
            } else {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("LargeTransaction skip clear disk uuid: ");
                LIZ3.append(key2);
                LIZ3.append(" by time because time is not enough");
                H78.LJI(X1D.LIZIZ(LIZ3));
            }
        }
    }

    public final void LIZ(String key) {
        o.LJIIIZ(key, "key");
        LIZLLL().erase(key);
        LIZJ().erase(key);
        ((Keva) this.LIZJ.getValue()).erase(key);
    }

    public final byte[] LJ(String key) {
        o.LJIIIZ(key, "key");
        byte[] bytesJustDisk = LIZLLL().getBytesJustDisk(key, new byte[0]);
        o.LJIIIIZZ(bytesJustDisk, "keva.getBytesJustDisk(key, ByteArray(0))");
        return bytesJustDisk;
    }

    public final void LJFF(String key, boolean z) {
        o.LJIIIZ(key, "key");
        LIZLLL().storeBoolean(key, z);
        ((Keva) this.LIZJ.getValue()).storeLong(key, SystemClock.uptimeMillis());
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LargeTransaction save bundle uuid: ");
        LIZ.append(key);
        LIZ.append(" recycle policy timestamp");
        H78.LJI(X1D.LIZIZ(LIZ));
    }

    public final void LJI(String key, byte[] bytes, boolean z) {
        o.LJIIIZ(key, "key");
        o.LJIIIZ(bytes, "bytes");
        LIZLLL().storeBytesJustDisk(key, bytes);
        if (z) {
            ((Keva) this.LIZJ.getValue()).storeLong(key, SystemClock.uptimeMillis());
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("LargeTransaction save bundle uuid: ");
            LIZ.append(key);
            LIZ.append(" recycle policy timestamp");
            H78.LJI(X1D.LIZIZ(LIZ));
            return;
        }
        LIZJ().storeInt(key, 1);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("LargeTransaction save bundle uuid: ");
        LIZ2.append(key);
        LIZ2.append(" recycle policy count ref");
        H78.LJI(X1D.LIZIZ(LIZ2));
    }
}
