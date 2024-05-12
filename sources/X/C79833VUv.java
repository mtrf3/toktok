package X;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.ui.list.ListLayoutManager;
import com.lynx.tasm.behavior.ui.list.UIList;

/* renamed from: X.VUv, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C79833VUv extends StaggeredGridLayoutManager implements VV2 {
    public final UIList LLIIZ;
    public int LLIL;

    @Override // X.VV2
    public final float LIZIZ() {
        return 0.0f;
    }

    @Override // X.VV2
    public final float LIZLLL() {
        return 0.0f;
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, X.C0A2
    public final boolean LLIIIJ() {
        return false;
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, X.C0A2
    public final boolean LJIJJLI() {
        if (!this.LLIIZ.LJLLL) {
            return false;
        }
        return super.LJIJJLI();
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, X.C0A2
    public final boolean LJIL() {
        if (!this.LLIIZ.LJLLL) {
            return false;
        }
        return super.LJIL();
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, X.C0A2
    public final void LJLJJL(C0AC c0ac) {
        super.LJLJJL(c0ac);
        this.LLIIZ.LJJIFFI();
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, X.C0A2
    public final void LJLJLLL(int i) {
        try {
            super.LJLJLLL(i);
        } catch (Exception e) {
            LLog.LIZLLL(4, "ListStaggeredGridLayoutManager", e.getMessage());
        }
    }

    public C79833VUv(int i, int i2, UIList uIList) {
        super(i, 1);
        this.LLIL = i2;
        this.LLIIZ = uIList;
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, X.C0A2
    public final int LJZI(int i, C0A7 c0a7, C0AC c0ac) {
        try {
            int LLJJI = LLJJI(i, c0a7, c0ac);
            this.LLIIZ.LJLJLLL.LJIJI(i, LLJJI);
            return LLJJI;
        } catch (NullPointerException unused) {
            return 0;
        }
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, X.C0A2
    public final int LL(int i, C0A7 c0a7, C0AC c0ac) {
        try {
            int LLJJI = LLJJI(i, c0a7, c0ac);
            this.LLIIZ.LJLJLLL.LJIJI(i, LLJJI);
            return LLJJI;
        } catch (NullPointerException unused) {
            return 0;
        }
    }

    @Override // X.C0A2
    public final void LJJLIIIJJIZ(View view, int i, int i2, int i3, int i4) {
        C1BZ c1bz = (C1BZ) view.getLayoutParams();
        if (1 == this.LL) {
            if (!c1bz.LJLILLLLZI) {
                int LIZ = ListLayoutManager.LIZ(this.LLIIZ, this.LJLZ, this.LLIL, i, i3);
                super.LJJLIIIJJIZ(view, LIZ, i2, view.getMeasuredWidth() + LIZ, i4);
                return;
            } else {
                ListLayoutManager.LIZIZ(this, view, i2, i4);
                return;
            }
        }
        super.LJJLIIIJJIZ(view, i, i2, i3, i4);
    }
}
