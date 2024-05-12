package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.shortvideo.duet.layout.CenterLinearLayoutManager;
import kotlin.jvm.internal.o;

/* renamed from: X.VcE, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80106VcE extends C0A6 {
    public int LJLIL;
    public boolean LJLILLLLZI;
    public final /* synthetic */ CenterLinearLayoutManager LJLJI;

    public C80106VcE(CenterLinearLayoutManager centerLinearLayoutManager) {
        this.LJLJI = centerLinearLayoutManager;
    }

    @Override // X.C0A6
    public final void LJIILJJIL(int i, RecyclerView recyclerView) {
        Integer num;
        o.LJIIIZ(recyclerView, "recyclerView");
        this.LJLIL = i;
        if (i == 0) {
            View LJFF = this.LJLJI.LLIIJI.LJFF(recyclerView.getLayoutManager());
            if (LJFF != null) {
                if (recyclerView.getLayoutManager() != null) {
                    num = Integer.valueOf(C0A2.LJJJLL(LJFF));
                } else {
                    num = null;
                }
                int i2 = this.LJLJI.LLIIIZ;
                if (num == null || num.intValue() != i2) {
                    View view = this.LJLJI.LLIIL;
                    if (view != null) {
                        view.setSelected(false);
                    }
                    this.LJLJI.LLIIL = LJFF;
                    LJFF.setSelected(true);
                    if (num != null) {
                        this.LJLJI.LLIIIZ = num.intValue();
                    }
                    CenterLinearLayoutManager centerLinearLayoutManager = this.LJLJI;
                    C81398Vx4 c81398Vx4 = centerLinearLayoutManager.LLIILZL;
                    if (c81398Vx4 != null) {
                        c81398Vx4.LIZ(centerLinearLayoutManager.LLIIIZ);
                        return;
                    }
                    return;
                }
                this.LJLJI.getClass();
                CenterLinearLayoutManager centerLinearLayoutManager2 = this.LJLJI;
                C81398Vx4 c81398Vx42 = centerLinearLayoutManager2.LLIILZL;
                if (c81398Vx42 == null || !this.LJLILLLLZI) {
                    return;
                }
                this.LJLILLLLZI = false;
                c81398Vx42.LIZ(centerLinearLayoutManager2.LLIIIZ);
                if (!this.LJLJI.LLIIZ) {
                    return;
                }
                AnonymousClass632.LIZIZ(recyclerView.getContext());
                this.LJLJI.LLIIZ = false;
                return;
            }
            return;
        }
        if (i != 1) {
            return;
        }
        this.LJLJI.LLIIZ = true;
    }

    @Override // X.C0A6
    public final void LJIILL(RecyclerView recyclerView, int i, int i2) {
        Integer num;
        o.LJIIIZ(recyclerView, "recyclerView");
        View LJFF = this.LJLJI.LLIIJI.LJFF(recyclerView.getLayoutManager());
        if (LJFF != null) {
            if (recyclerView.getLayoutManager() != null) {
                num = Integer.valueOf(C0A2.LJJJLL(LJFF));
            } else {
                num = null;
            }
            int i3 = this.LJLJI.LLIIIZ;
            if (num == null || num.intValue() != i3) {
                View view = this.LJLJI.LLIIL;
                if (view != null) {
                    view.setSelected(false);
                }
                this.LJLJI.LLIIL = LJFF;
                LJFF.setSelected(true);
                if (num != null) {
                    this.LJLJI.LLIIIZ = num.intValue();
                }
                this.LJLJI.getClass();
                if (this.LJLIL != 0) {
                    this.LJLILLLLZI = true;
                    return;
                }
                CenterLinearLayoutManager centerLinearLayoutManager = this.LJLJI;
                C81398Vx4 c81398Vx4 = centerLinearLayoutManager.LLIILZL;
                if (c81398Vx4 != null) {
                    c81398Vx4.LIZ(centerLinearLayoutManager.LLIIIZ);
                    if (this.LJLJI.LLIIZ) {
                        AnonymousClass632.LIZIZ(recyclerView.getContext());
                        this.LJLJI.LLIIZ = false;
                    }
                }
            }
        }
    }
}
