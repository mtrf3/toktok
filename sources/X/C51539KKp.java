package X;

import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.search.detail.filter.viewmodel.FilterVM;
import com.ss.android.ugc.feed.platform.fragment.IDetailBaseAbility;
import kotlin.jvm.internal.o;

/* renamed from: X.KKp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51539KKp extends C0A6 {
    public boolean LJLIL;
    public boolean LJLILLLLZI;
    public int LJLJI = -1;
    public final /* synthetic */ KPJ LJLJJI;
    public final /* synthetic */ SYL LJLJJL;

    public C51539KKp(SYL syl, KPJ kpj) {
        this.LJLJJI = kpj;
        this.LJLJJL = syl;
    }

    @Override // X.C0A6
    public final void LJIILJJIL(int i, RecyclerView recyclerView) {
        boolean z;
        o.LJIIIZ(recyclerView, "recyclerView");
        this.LJLJI = i;
        if (i != 0) {
            if (i != 1) {
                return;
            }
            this.LJLIL = false;
            this.LJLILLLLZI = true;
            return;
        }
        if (this.LJLILLLLZI && !this.LJLIL) {
            if (((IDetailBaseAbility) this.LJLJJI.LJLJL.getValue()) != null && (!r0.hasMore())) {
                z = true;
            } else {
                z = false;
            }
            if (z && !this.LJLJJL.canScrollVertically(1)) {
                this.LJLJJI.LJIIIZ().getClass();
                FilterVM.gv0(-1);
            } else if (!this.LJLJJL.canScrollVertically(-1) || !this.LJLJJL.canScrollVertically(1)) {
                this.LJLJJI.LJIIIZ().getClass();
                FilterVM.gv0(0);
            } else {
                this.LJLJJI.LJIIIZ().getClass();
                FilterVM.gv0(1);
            }
            this.LJLIL = true;
        }
        this.LJLILLLLZI = false;
    }

    @Override // X.C0A6
    public final void LJIILL(RecyclerView recyclerView, int i, int i2) {
        IDetailBaseAbility iDetailBaseAbility;
        IDetailBaseAbility iDetailBaseAbility2;
        o.LJIIIZ(recyclerView, "recyclerView");
        this.LJLJJI.LJI();
        if (this.LJLJI == 1 && (iDetailBaseAbility2 = (IDetailBaseAbility) this.LJLJJI.LJLJL.getValue()) != null && (!iDetailBaseAbility2.hasMore()) && !this.LJLIL && !this.LJLJJL.canScrollVertically(1)) {
            this.LJLJJI.LJIIIZ().getClass();
            FilterVM.gv0(-1);
            this.LJLIL = true;
        }
        if (this.LJLJI == 1 && (iDetailBaseAbility = (IDetailBaseAbility) this.LJLJJI.LJLJL.getValue()) != null && iDetailBaseAbility.hasMore() && !this.LJLIL) {
            if (!this.LJLJJL.canScrollVertically(-1) || !this.LJLJJL.canScrollVertically(1)) {
                this.LJLJJI.LJIIIZ().getClass();
                FilterVM.gv0(0);
                this.LJLIL = true;
            }
        }
    }
}
