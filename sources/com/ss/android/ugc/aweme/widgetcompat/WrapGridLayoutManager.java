package com.ss.android.ugc.aweme.widgetcompat;

import X.AbstractC029409q;
import X.C0A7;
import X.C0AC;
import X.C170666ms;
import X.KQP;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes9.dex */
public class WrapGridLayoutManager extends GridLayoutManager {
    public AbstractC029409q LLIIZ;

    public WrapGridLayoutManager(int i) {
        super(i);
    }

    @Override // X.C0A2
    public final void LJJLIIJ(AbstractC029409q abstractC029409q) {
        this.LLIIZ = abstractC029409q;
    }

    public WrapGridLayoutManager(int i, int i2) {
        super(i, 1, false);
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
    public final void LJLJJI(C0A7 c0a7, C0AC c0ac) {
        try {
            super.LJLJJI(c0a7, c0ac);
        } catch (IndexOutOfBoundsException unused) {
        } catch (NullPointerException e) {
            if (this.LLIIZ != null) {
                C170666ms.LIZJ(e);
                WrapLinearLayoutManager.LLJJJJ(this.LLIIZ);
            }
        }
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
    public final int LL(int i, C0A7 c0a7, C0AC c0ac) {
        try {
            return super.LL(i, c0a7, c0ac);
        } catch (IndexOutOfBoundsException unused) {
            return 0;
        } catch (NullPointerException e) {
            if (this.LLIIZ != null) {
                C170666ms.LIZ(e, this.LLIIZ.getClass().getName());
                WrapLinearLayoutManager.LLJJJJ(this.LLIIZ);
                return 0;
            }
            return 0;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
    public final void LLIIII(RecyclerView recyclerView, C0AC c0ac, int i) {
        KQP kqp = new KQP(this, recyclerView.getContext());
        kqp.LIZ = i;
        LLIIIILZ(kqp);
    }

    public WrapGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
