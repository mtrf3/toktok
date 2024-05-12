package X;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UOB implements UO9 {
    public final RecyclerView LIZ;
    public final C77103UNv LIZIZ;
    public final UO9 LIZJ;
    public final List<? extends AbstractC792639e> LIZLLL;
    public final UO1 LJ;
    public boolean LJFF;

    @Override // X.UO9
    public final void LIZIZ(List<C77105UNx> captionTextLines) {
        o.LJIIIZ(captionTextLines, "captionTextLines");
        if (LJ(captionTextLines, true)) {
            UO9 uo9 = this.LIZJ;
            if (uo9 != null) {
                uo9.LIZIZ(captionTextLines);
            }
            C77103UNv c77103UNv = this.LIZIZ;
            if (c77103UNv != null) {
                c77103UNv.notifyItemChanged(c77103UNv.getItemCount() - 1);
            }
        }
    }

    @Override // X.UO9
    public final void LIZJ(List<C77105UNx> captionTextLines) {
        o.LJIIIZ(captionTextLines, "captionTextLines");
        if (LJ(captionTextLines, true)) {
            UO9 uo9 = this.LIZJ;
            if (uo9 != null) {
                uo9.LIZJ(captionTextLines);
            }
            C77103UNv c77103UNv = this.LIZIZ;
            if (c77103UNv != null) {
                c77103UNv.LJLJJL = captionTextLines;
                c77103UNv.notifyItemInserted(c77103UNv.getItemCount());
                c77103UNv.notifyItemChanged(c77103UNv.getItemCount());
                RecyclerView recyclerView = this.LIZ;
                if (recyclerView != null) {
                    recyclerView.LJLIL(c77103UNv.getItemCount());
                }
            }
        }
    }

    @Override // X.UO9
    public final void LIZLLL(List<C77105UNx> list) {
        List<C77105UNx> items;
        boolean z;
        UO9 uo9;
        C77103UNv c77103UNv = this.LIZIZ;
        if (c77103UNv != null) {
            if (list == null) {
                items = c77103UNv.LJLJJL;
                z = false;
            } else {
                items = list;
                z = true;
            }
            if (LJ(items, z)) {
                if (list != null && (uo9 = this.LIZJ) != null) {
                    uo9.LIZLLL(list);
                }
                o.LJIIIZ(items, "items");
                c77103UNv.LJLJJL = items;
                c77103UNv.notifyDataSetChanged();
                RecyclerView recyclerView = this.LIZ;
                if (recyclerView != null) {
                    recyclerView.LJLIL(c77103UNv.getItemCount());
                }
            }
        }
    }

    public final boolean LJ(List<C77105UNx> list, boolean z) {
        List<? extends AbstractC792639e> list2;
        if (z && (list2 = this.LIZLLL) != null) {
            for (AbstractC792639e abstractC792639e : list2) {
                if (abstractC792639e != null) {
                    abstractC792639e.LIZIZ = false;
                    long LIZJ = this.LJ.LIZJ();
                    abstractC792639e.LIZIZ = false;
                    abstractC792639e.LIZLLL = LIZJ;
                }
            }
        }
        Boolean LIZJ2 = InterfaceC30442Bx8.g1.LIZJ();
        o.LJIIIIZZ(LIZJ2, "LIVE_SHOW_CAPTION_AUDIENCE_SWITCH.value");
        if (!LIZJ2.booleanValue() || !(!list.isEmpty()) || this.LJFF) {
            return false;
        }
        return true;
    }

    @Override // X.UO9
    public final void LIZ(List captionTextLines, int i, boolean z) {
        C77103UNv c77103UNv;
        o.LJIIIZ(captionTextLines, "captionTextLines");
        if (i > captionTextLines.size() || i < 0 || (c77103UNv = this.LIZIZ) == null) {
            return;
        }
        if (!LJ(captionTextLines, false) && !z) {
            return;
        }
        for (int i2 = 0; i2 < i; i2++) {
            ListProtector.remove(captionTextLines, 0);
        }
        c77103UNv.LJLJJL = captionTextLines;
        c77103UNv.notifyItemRangeRemoved(0, i);
        c77103UNv.notifyItemRangeChanged(0, i);
    }

    public UOB(C135365Sy c135365Sy, C77103UNv c77103UNv, UOA uoa, List list, UO1 uo1) {
        this.LIZ = c135365Sy;
        this.LIZIZ = c77103UNv;
        this.LIZJ = uoa;
        this.LIZLLL = list;
        this.LJ = uo1;
    }
}
