package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Qqm, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68268Qqm {
    public C68246QqQ LIZ;
    public List LIZIZ;
    public List LIZJ;
    public long LIZLLL;
    public final /* synthetic */ C68241QqL LJ;

    public /* synthetic */ C68268Qqm(C68241QqL c68241QqL) {
        this.LJ = c68241QqL;
    }

    public final boolean LIZ(long j, C68260Qqe c68260Qqe) {
        if (this.LIZJ == null) {
            this.LIZJ = new ArrayList();
        }
        if (this.LIZIZ == null) {
            this.LIZIZ = new ArrayList();
        }
        if (!((ArrayList) this.LIZJ).isEmpty() && ((((C68260Qqe) ListProtector.get(this.LIZJ, 0)).zzh / 1000) / 60) / 60 != ((c68260Qqe.zzh / 1000) / 60) / 60) {
            return false;
        }
        long LIZ = this.LIZLLL + c68260Qqe.LIZ();
        this.LJ.LJJIJIL();
        if (LIZ >= Math.max(0, ((Integer) C68555QvP.LJIIIZ.LIZ(null)).intValue())) {
            return false;
        }
        this.LIZLLL = LIZ;
        ((ArrayList) this.LIZJ).add(c68260Qqe);
        ((ArrayList) this.LIZIZ).add(Long.valueOf(j));
        int size = ((ArrayList) this.LIZJ).size();
        this.LJ.LJJIJIL();
        if (size >= Math.max(1, ((Integer) C68555QvP.LJIIJ.LIZ(null)).intValue())) {
            return false;
        }
        return true;
    }
}
