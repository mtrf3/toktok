package X;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes11.dex */
public final class ODK {
    public static final ConcurrentHashMap<String, Long> LJ = new ConcurrentHashMap<>();
    public static final AtomicLong LJFF = new AtomicLong(System.currentTimeMillis());
    public final AtomicBoolean LIZ;
    public final boolean LIZIZ;
    public final String LIZJ;
    public final InterfaceC61584OEy LIZLLL;

    public ODK(boolean z, boolean z2, String str, OEP oep) {
        this.LIZ = new AtomicBoolean(z);
        this.LIZIZ = z2;
        this.LIZJ = str;
        this.LIZLLL = oep;
    }
}
