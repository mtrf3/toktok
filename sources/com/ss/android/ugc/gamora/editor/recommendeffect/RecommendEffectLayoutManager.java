package com.ss.android.ugc.gamora.editor.recommendeffect;

import X.C0A2;
import X.C0A6;
import X.C0A7;
import X.C0AA;
import X.C0AC;
import X.C118234kV;
import X.C161656Wb;
import X.C28851Bh;
import X.C32I;
import X.C40141hq;
import X.C40517FvF;
import X.C6WN;
import X.C6WO;
import X.C6WZ;
import X.C78842Uww;
import X.C80083Vbr;
import X.InterfaceC65784Pro;
import android.content.Context;
import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.gamora.editor.recommendeffect.RecommendEffectLayoutManager;
import com.ss.android.ugc.gamora.editor.recommendeffect.net.RecommendEffectItem;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class RecommendEffectLayoutManager extends C0A2 implements C0AA {
    public int LJLZ;
    public View LL;
    public RecyclerView LLD;
    public C6WN LLF;
    public C6WZ LLFF;
    public C28851Bh LLFFF;
    public float LLFII;
    public int LLFZ;
    public C80083Vbr LLI;
    public int LJZ = -1;
    public final C40141hq LJZI = new C40141hq();
    public final C6WO LJZL = new C0A6() { // from class: X.6WO
        @Override // X.C0A6
        public final void LJIILJJIL(int i, RecyclerView recyclerView) {
            View LJFF;
            Integer num;
            o.LJIIIZ(recyclerView, "recyclerView");
            RecommendEffectLayoutManager.this.getClass();
            if (i == 0 && (LJFF = RecommendEffectLayoutManager.this.LJZI.LJFF(recyclerView.getLayoutManager())) != null) {
                String str = null;
                if (recyclerView.getLayoutManager() != null) {
                    num = Integer.valueOf(C0A2.LJJJLL(LJFF));
                } else {
                    num = null;
                }
                int i2 = RecommendEffectLayoutManager.this.LJZ;
                if (num == null || num.intValue() != i2) {
                    RecommendEffectLayoutManager.this.LL = LJFF;
                    LJFF.setSelected(true);
                    if (num != null) {
                        RecommendEffectLayoutManager.this.LJZ = num.intValue();
                    }
                }
                C6WZ c6wz = RecommendEffectLayoutManager.this.LLFF;
                if (c6wz != null) {
                    RecyclerView.ViewHolder LJJJJJL = recyclerView.LJJJJJL(LJFF);
                    o.LJIIIIZZ(LJJJJJL, "recyclerView.getChildViewHolder(snap)");
                    int i3 = RecommendEffectLayoutManager.this.LJZ;
                    RecommendEffectItem recommendEffectItem = ((C161686We) LJJJJJL).LJLIL;
                    Integer num2 = c6wz.LIZ.getUiStates().LJ.LIZIZ;
                    if (num2 != null && i3 == num2.intValue()) {
                        if (recommendEffectItem != null) {
                            str = recommendEffectItem.id;
                        }
                        if (o.LJ(str, c6wz.LIZ.getUiActions().LJIIJ.invoke())) {
                            c6wz.LIZ.getUiActions().LJII.invoke(Boolean.FALSE, 10000L);
                            return;
                        }
                    }
                    c6wz.LIZ.LLJJ(recommendEffectItem, i3);
                }
            }
        }
    };
    public InterfaceC65784Pro<Integer> LLIFFJFJJ = C161656Wb.LJLIL;

    @Override // X.C0AA
    public final PointF LJII(int i) {
        return null;
    }

    @Override // X.C0A2
    public final boolean LJIJJLI() {
        return true;
    }

    @Override // X.C0A2
    public final RecyclerView.LayoutParams LJJIJL() {
        return new RecyclerView.LayoutParams(-2, -1);
    }

    @Override // X.C0A2
    public final void LJLJJI(C0A7 c0a7, C0AC c0ac) {
        View LJFF;
        if (LJJJJZ() <= 0) {
            return;
        }
        if (c0ac != null && c0ac.LJI) {
            return;
        }
        if (c0a7 != null) {
            LJJIJIIJIL(c0a7);
        }
        C40517FvF LJJ = C78842Uww.LJJ(this.LLIFFJFJJ.invoke().intValue(), this.LLIFFJFJJ.invoke().intValue() + 5);
        ArrayList arrayList = new ArrayList(C32I.LJJL(LJJ, 10));
        C118234kV it = LJJ.iterator();
        while (it.LJLJI) {
            int nextInt = it.nextInt() - 2;
            if (nextInt < 0) {
                nextInt += LJJJJZ();
            }
            arrayList.add(Integer.valueOf(nextInt % LJJJJZ()));
        }
        Iterator it2 = arrayList.iterator();
        int i = 0;
        while (it2.hasNext()) {
            int intValue = ((Number) it2.next()).intValue();
            if (c0a7 != null && (LJFF = c0a7.LJFF(intValue)) != null) {
                LJIIZILJ(LJFF);
                LJJLIIIJL(0, 0, LJFF);
                int LJJJJL = LJJJJL(LJFF);
                int LJJJJJL = LJJJJJL(LJFF);
                this.LLFZ = LJJJJL;
                int i2 = LJJJJL + i;
                C0A2.LJJLIIIJJI(LJFF, i, 0, i2, LJJJJJL);
                if (i2 >= this.LJLLLL) {
                    break;
                } else {
                    i = i2;
                }
            }
        }
        C28851Bh c28851Bh = this.LLFFF;
        if (c28851Bh == null) {
            c28851Bh = new C28851Bh(this);
            this.LLFFF = c28851Bh;
        }
        this.LLFII = (c28851Bh.LJI() - c28851Bh.LJIIJ()) / 2.0f;
        int LJJJI = LJJJI();
        for (int i3 = 0; i3 < LJJJI; i3++) {
            View LJJJ = LJJJ(i3);
            if (LJJJ != null) {
                int i4 = this.LLFZ / 2;
                C28851Bh c28851Bh2 = this.LLFFF;
                if (c28851Bh2 == null) {
                    c28851Bh2 = new C28851Bh(this);
                    this.LLFFF = c28851Bh2;
                }
                float LJ = ((c28851Bh2.LJ(LJJJ) + i4) - this.LLFII) / this.LLFZ;
                C6WN c6wn = this.LLF;
                if (c6wn != null) {
                    c6wn.LIZ(this, LJJJ, LJ);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d9  */
    @Override // X.C0A2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJZI(int r12, X.C0A7 r13, X.C0AC r14) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.editor.recommendeffect.RecommendEffectLayoutManager.LJZI(int, X.0A7, X.0AC):int");
    }

    @Override // X.C0A2
    public final void LLIIII(RecyclerView recyclerView, C0AC c0ac, int i) {
        o.LJIIIZ(recyclerView, "recyclerView");
        if (this.LLI == null) {
            Context context = recyclerView.getContext();
            o.LJIIIIZZ(context, "recyclerView.context");
            this.LLI = new C80083Vbr(context);
        }
        C80083Vbr c80083Vbr = this.LLI;
        if (c80083Vbr != null) {
            c80083Vbr.LJIILLIIL = ((Number) c80083Vbr.LJIILL.getValue()).floatValue() / 0.1f;
        }
        if (i >= 0) {
            C80083Vbr c80083Vbr2 = this.LLI;
            if (c80083Vbr2 != null) {
                c80083Vbr2.LIZ = i;
            }
            LLIIIILZ(c80083Vbr2);
        }
    }
}
