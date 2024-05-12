package X;

import Y.ARunnableS21S0110000_15;
import Y.ARunnableS51S0100000_15;
import com.bytedance.lynx.hybrid.settings.SettingsConfig;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes16.dex */
public final class Y7W {
    public static final Y7Y LJIILIIL = new Y7Y();
    public static final ConcurrentHashMap<String, WeakReference<Y7W>> LJIILJJIL = new ConcurrentHashMap<>();
    public Y7R LIZ;
    public InterfaceC86860Y7c LIZIZ;
    public SettingsConfig LIZJ;
    public volatile boolean LJI;
    public volatile long LJII;
    public volatile boolean LJIIIIZZ;
    public volatile boolean LJIIIZ;
    public final String LJIIL = "SparkContainerSpace";
    public final AtomicBoolean LIZLLL = new AtomicBoolean(false);
    public final AtomicBoolean LJ = new AtomicBoolean(false);
    public final ConcurrentLinkedQueue<InterfaceC86859Y7b> LJFF = new ConcurrentLinkedQueue<>();
    public final Y7V LJIIJ = new Y7V(this);
    public final Y7U LJIIJJI = new Y7U(this);

    public final JSONObject LIZJ() {
        Object LIZ;
        Y7R y7r;
        try {
            y7r = this.LIZ;
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (y7r != null) {
            LIZ = y7r.LIZ();
            C3C5.m7constructorimpl(LIZ);
            return (JSONObject) (C3C5.m12isFailureimpl(LIZ) ? null : LIZ);
        }
        o.LJIJI("settingsData");
        throw null;
    }

    public final void LIZ(long j) {
        Long l;
        long j2;
        long j3;
        long min;
        Y7Y y7y = LJIILIIL;
        if (j != 0) {
            y7y.LIZIZ(j, new ARunnableS51S0100000_15(this, 86));
            return;
        }
        SettingsConfig settingsConfig = this.LIZJ;
        if (settingsConfig == null) {
            y7y.LIZIZ(60000L, new ARunnableS51S0100000_15(this, 87));
            return;
        }
        Long relativeInterval = settingsConfig.getRelativeInterval();
        SettingsConfig settingsConfig2 = this.LIZJ;
        if (settingsConfig2 != null) {
            l = settingsConfig2.getAbsoluteInterval();
        } else {
            l = null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (l != null) {
            if (!this.LJ.compareAndSet(false, true)) {
                return;
            }
            Y7R y7r = this.LIZ;
            if (y7r != null) {
                Long l2 = (Long) y7r.LIZIZ(Long.TYPE, 0L);
                if (l2 != null) {
                    j3 = l2.longValue();
                } else {
                    j3 = 0;
                }
                if (relativeInterval == null) {
                    min = (currentTimeMillis - l.longValue()) - j3;
                } else {
                    min = Math.min((currentTimeMillis - j3) - l.longValue(), (currentTimeMillis - this.LJII) - relativeInterval.longValue());
                }
                if (min >= 0) {
                    LIZIZ(this, true, 2);
                    return;
                } else {
                    if (!this.LJ.compareAndSet(true, false)) {
                        return;
                    }
                    y7y.LIZIZ(-min, new ARunnableS51S0100000_15(this, 85));
                    return;
                }
            }
            o.LJIJI("settingsData");
            throw null;
        }
        long j4 = currentTimeMillis - this.LJII;
        if (relativeInterval != null) {
            j2 = relativeInterval.longValue();
        } else {
            j2 = 3600000;
        }
        if (j4 >= j2 && this.LJ.compareAndSet(false, true)) {
            LIZIZ(this, true, 2);
        }
    }

    public final void LIZLLL(boolean z) {
        SettingsConfig settingsConfig;
        Long relativeInterval;
        SettingsConfig settingsConfig2;
        long j;
        Long absoluteInterval;
        Long relativeInterval2;
        if (this.LIZJ == null || !this.LJ.compareAndSet(true, false)) {
            return;
        }
        this.LJII = System.currentTimeMillis();
        Long l = null;
        if (z) {
            Y7R y7r = this.LIZ;
            if (y7r != null) {
                y7r.LJ(Long.valueOf(this.LJII));
            } else {
                o.LJIJI("settingsData");
                throw null;
            }
        }
        SettingsConfig settingsConfig3 = this.LIZJ;
        if (settingsConfig3 != null) {
            l = settingsConfig3.getRelativeInterval();
        }
        long j2 = 3600000;
        if (l != null && (settingsConfig2 = this.LIZJ) != null && settingsConfig2.getAbsoluteInterval() != null) {
            SettingsConfig settingsConfig4 = this.LIZJ;
            if (settingsConfig4 != null && (relativeInterval2 = settingsConfig4.getRelativeInterval()) != null) {
                j2 = relativeInterval2.longValue();
            }
            SettingsConfig settingsConfig5 = this.LIZJ;
            if (settingsConfig5 != null && (absoluteInterval = settingsConfig5.getAbsoluteInterval()) != null) {
                j = absoluteInterval.longValue();
            } else {
                j = 0;
            }
            j2 = Math.max(j2, j);
        } else {
            SettingsConfig settingsConfig6 = this.LIZJ;
            if ((settingsConfig6 != null && (relativeInterval = settingsConfig6.getAbsoluteInterval()) != null) || ((settingsConfig = this.LIZJ) != null && (relativeInterval = settingsConfig.getRelativeInterval()) != null)) {
                j2 = relativeInterval.longValue();
            }
        }
        LJIILIIL.LIZIZ(j2, new ARunnableS51S0100000_15(this, 88));
    }

    public static void LIZIZ(Y7W y7w, boolean z, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        Y7Y y7y = LJIILIIL;
        if (y7w.LIZLLL.get()) {
            return;
        }
        y7y.LIZ(new ARunnableS21S0110000_15(y7w, z, 4));
    }
}
