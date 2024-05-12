package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.0B0, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0B0 {
    public final C0MA<RecyclerView.ViewHolder, C03290Az> LIZ = new C0MA<>();
    public final C0M5<RecyclerView.ViewHolder> LIZIZ = new C0M5<>();

    public final void LIZLLL(RecyclerView.ViewHolder viewHolder) {
        C03290Az orDefault = this.LIZ.getOrDefault(viewHolder, null);
        if (orDefault == null) {
            return;
        }
        orDefault.LIZ &= -2;
    }

    public final void LJ(RecyclerView.ViewHolder viewHolder) {
        int LJIIIIZZ = this.LIZIZ.LJIIIIZZ() - 1;
        while (true) {
            if (LJIIIIZZ < 0) {
                break;
            }
            if (viewHolder == this.LIZIZ.LJIIIZ(LJIIIIZZ)) {
                C0M5<RecyclerView.ViewHolder> c0m5 = this.LIZIZ;
                Object[] objArr = c0m5.LJLJI;
                Object obj = objArr[LJIIIIZZ];
                Object obj2 = C0M5.LJLJJL;
                if (obj != obj2) {
                    objArr[LJIIIIZZ] = obj2;
                    c0m5.LJLIL = true;
                }
            } else {
                LJIIIIZZ--;
            }
        }
        C03290Az remove = this.LIZ.remove(viewHolder);
        if (remove != null) {
            remove.LIZ = 0;
            remove.LIZIZ = null;
            remove.LIZJ = null;
            C03290Az.LIZLLL.LIZ(remove);
        }
    }

    public final void LIZ(RecyclerView.ViewHolder viewHolder, C030009w c030009w) {
        C03290Az orDefault = this.LIZ.getOrDefault(viewHolder, null);
        if (orDefault == null) {
            orDefault = C03290Az.LIZ();
            this.LIZ.put(viewHolder, orDefault);
        }
        orDefault.LIZJ = c030009w;
        orDefault.LIZ |= 8;
    }

    public final void LIZIZ(RecyclerView.ViewHolder viewHolder, C030009w c030009w) {
        C03290Az orDefault = this.LIZ.getOrDefault(viewHolder, null);
        if (orDefault == null) {
            orDefault = C03290Az.LIZ();
            this.LIZ.put(viewHolder, orDefault);
        }
        orDefault.LIZIZ = c030009w;
        orDefault.LIZ |= 4;
    }

    public final C030009w LIZJ(RecyclerView.ViewHolder viewHolder, int i) {
        C03290Az LJIIJJI;
        C030009w c030009w;
        int LJ = this.LIZ.LJ(viewHolder);
        if (LJ >= 0 && (LJIIJJI = this.LIZ.LJIIJJI(LJ)) != null) {
            int i2 = LJIIJJI.LIZ;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                LJIIJJI.LIZ = i3;
                if (i == 4) {
                    c030009w = LJIIJJI.LIZIZ;
                } else if (i == 8) {
                    c030009w = LJIIJJI.LIZJ;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    this.LIZ.LJIIIZ(LJ);
                    LJIIJJI.LIZ = 0;
                    LJIIJJI.LIZIZ = null;
                    LJIIJJI.LIZJ = null;
                    C03290Az.LIZLLL.LIZ(LJIIJJI);
                }
                return c030009w;
            }
        }
        return null;
    }
}
