package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import ujb.s;

/* renamed from: X.Lsq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC55656Lsq implements Runnable {
    public static final RunnableC55656Lsq LJLIL = new RunnableC55656Lsq();

    public static void LIZ() {
        String string;
        HashMap hashMap;
        if (C55657Lsr.LIZJ == null) {
            C55657Lsr.LIZJ = new LinkedHashMap<>();
            InterfaceC32651Px LIZ = C25170yn.LIZ(C09160Xo.LIZ("pgc", "playlist"), "playlist_watch_history");
            C55657Lsr.LIZIZ = LIZ;
            if (LIZ != null && (string = LIZ.getString("playlist_watch_history", "")) != null) {
                Iterator it = s.LJLJJL(string, new String[]{"|"}, 0, 6).iterator();
                while (it.hasNext()) {
                    List LJLJJL = s.LJLJJL((String) it.next(), new String[]{","}, 0, 6);
                    if (LJLJJL.size() > 1 && (hashMap = C55657Lsr.LIZJ) != null) {
                        hashMap.put(ListProtector.get(LJLJJL, 0), ListProtector.get(LJLJJL, 1));
                    }
                }
            }
            C55658Lss.LJFF.LJIIIIZZ("watch history has been written into memory");
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
