package X;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.Ixo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC48320Ixo implements Runnable {
    public final /* synthetic */ C48317Ixl LJLIL;
    public final /* synthetic */ InterfaceC88472Yns<Long, C76800UCe> LJLILLLLZI;
    public final /* synthetic */ long LJLJI = 2592000000L;

    public RunnableC48320Ixo(C48317Ixl c48317Ixl, AqS173S0100000_7 aqS173S0100000_7) {
        this.LJLIL = c48317Ixl;
        this.LJLILLLLZI = aqS173S0100000_7;
    }

    public final void LIZ() {
        this.LJLIL.LJII.lock();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        long j = 0;
        try {
            java.util.Set<Map.Entry<String, C48321Ixp>> entrySet = this.LJLIL.LJ.entrySet();
            o.LJIIIIZZ(entrySet, "cache.entries");
            long j2 = this.LJLJI;
            C48317Ixl c48317Ixl = this.LJLIL;
            for (Map.Entry<String, C48321Ixp> entry : entrySet) {
                if (System.currentTimeMillis() - entry.getValue().LIZIZ > j2) {
                    if (!c48317Ixl.LIZJ.contains(entry.getValue().LIZ.getPath())) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("MusicDiskLruCache  ");
                        LIZ.append(entry.getKey());
                        LIZ.append("  to be removed");
                        H7B.LIZ(X1D.LIZIZ(LIZ));
                        if (entry.getValue().LIZ.exists()) {
                            long length = entry.getValue().LIZ.length();
                            if (C16880lQ.LLLZZIL(entry.getValue().LIZ)) {
                                String key = entry.getKey();
                                o.LJIIIIZZ(key, "entry.key");
                                linkedHashSet.add(key);
                                j += length;
                                StringBuilder LIZ2 = X1D.LIZ();
                                LIZ2.append("MusicDiskLruCache  ");
                                LIZ2.append(entry.getKey());
                                LIZ2.append("  removed");
                                H7B.LJ(X1D.LIZIZ(LIZ2));
                            }
                        } else {
                            StringBuilder LIZ3 = X1D.LIZ();
                            LIZ3.append("MusicDiskLruCache  ");
                            LIZ3.append(entry.getKey());
                            LIZ3.append("  is not exist.");
                            H7B.LIZJ(X1D.LIZIZ(LIZ3));
                        }
                    } else {
                        StringBuilder LIZ4 = X1D.LIZ();
                        LIZ4.append("MusicDiskLruCache  ");
                        LIZ4.append(entry.getKey());
                        LIZ4.append("   is in whiteMusicFilePathList.");
                        H7B.LIZJ(X1D.LIZIZ(LIZ4));
                    }
                }
            }
            C48317Ixl c48317Ixl2 = this.LJLIL;
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                c48317Ixl2.LJ.remove((String) it.next());
            }
        } finally {
            this.LJLILLLLZI.invoke(Long.valueOf(j));
            this.LJLIL.LJII.unlock();
        }
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
