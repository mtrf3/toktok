package X;

import com.bytedance.keva.Keva;
import com.bytedance.pia.core.cache.IPiaCacheProvider;
import com.bytedance.pia.core.setting.Settings;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.Elf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC37375Elf implements Runnable {
    public static final RunnableC37375Elf LJLIL = new RunnableC37375Elf();

    public static void LIZ() {
        Object LIZ;
        Number number;
        C37376Elg.LIZLLL = System.currentTimeMillis();
        if (!C37413EmH.LIZ(Settings.LJIIIZ).isCacheEnabled || !C37376Elg.LJ.get()) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        Keva keva = C37376Elg.LIZ;
        if (keva != null) {
            java.util.Map<String, ?> all = keva.getAll();
            o.LJFF(all, "indexRepo.all");
            Iterator<Map.Entry<String, ?>> it = all.entrySet().iterator();
            while (it.hasNext()) {
                String key = it.next().getKey();
                o.LJFF(key, "key");
                if (!ujb.o.LJJJJ(key, "_extraVary", false)) {
                    Keva LIZJ = C37376Elg.LIZJ(key);
                    if (LIZJ != null) {
                        java.util.Map<String, ?> all2 = LIZJ.getAll();
                        o.LJFF(all2, "configRepo.all");
                        for (Map.Entry<String, ?> entry : all2.entrySet()) {
                            String url = entry.getKey();
                            Object value = entry.getValue();
                            if (!(value instanceof String)) {
                                value = null;
                            }
                            String str = (String) value;
                            if (str != null) {
                                try {
                                    LIZ = (IPiaCacheProvider.CacheConfig) C37376Elg.LIZJ.LJI(str, IPiaCacheProvider.CacheConfig.class);
                                    C3C5.m7constructorimpl(LIZ);
                                } catch (Throwable th) {
                                    LIZ = C141335gf.LIZ(th);
                                    C3C5.m7constructorimpl(LIZ);
                                }
                                if (C3C5.m12isFailureimpl(LIZ)) {
                                    LIZ = null;
                                }
                                IPiaCacheProvider.CacheConfig cacheConfig = (IPiaCacheProvider.CacheConfig) LIZ;
                                if (cacheConfig != null && (number = cacheConfig.expire) != null) {
                                    if (number.longValue() <= currentTimeMillis) {
                                        o.LJFF(url, "url");
                                        C37376Elg.LIZ(LIZJ, url);
                                        StringBuilder LIZ2 = X1D.LIZ();
                                        LIZ2.append("[PIACacheManager] Remove Stale Cache Success. (URL: ");
                                        LIZ2.append(url);
                                        LIZ2.append(", config = ");
                                        LIZ2.append(cacheConfig);
                                        LIZ2.append(')');
                                        C37238EjS.LJI(6, X1D.LIZIZ(LIZ2), null);
                                    }
                                } else {
                                    o.LJFF(url, "url");
                                    C37376Elg.LIZ(LIZJ, url);
                                }
                            } else {
                                o.LJFF(url, "url");
                                C37376Elg.LIZ(LIZJ, url);
                            }
                        }
                    } else {
                        C37376Elg.LJIIL(key);
                    }
                }
            }
            return;
        }
        o.LJIJI("indexRepo");
        throw null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
