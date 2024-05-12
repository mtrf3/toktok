package com.ss.android.ugc.aweme.views;

import X.AbstractC029409q;
import X.C0A7;
import X.C0AC;
import X.C36922EeM;
import X.InterfaceC185877Rf;
import X.KQO;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes9.dex */
public class WrapGridLayoutManager extends GridLayoutManager implements InterfaceC185877Rf {
    public AbstractC029409q LLIIZ;

    public WrapGridLayoutManager(int i) {
        super(i);
    }

    @Override // X.C0A2
    public final void LJJLIIJ(AbstractC029409q abstractC029409q) {
        this.LLIIZ = abstractC029409q;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
    public final void LJLJJI(C0A7 c0a7, C0AC c0ac) {
        try {
            super.LJLJJI(c0a7, c0ac);
        } catch (IndexOutOfBoundsException unused) {
        } catch (NullPointerException e) {
            if (this.LLIIZ != null) {
                C36922EeM.LIZIZ(e, this.LLIIZ.getClass().getName());
                WrapLinearLayoutManager.LLJJJJ(this.LLIIZ);
            }
        }
    }

    public WrapGridLayoutManager(int i, int i2, boolean z) {
        super(i, i2, z);
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
    public final int LL(int i, C0A7 c0a7, C0AC c0ac) {
        try {
            return super.LL(i, c0a7, c0ac);
        } catch (IndexOutOfBoundsException unused) {
            return 0;
        } catch (NullPointerException e) {
            if (this.LLIIZ != null) {
                C36922EeM.LIZIZ(e, this.LLIIZ.getClass().getName());
                WrapLinearLayoutManager.LLJJJJ(this.LLIIZ);
                return 0;
            }
            return 0;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
    public final void LLIIII(RecyclerView recyclerView, C0AC c0ac, int i) {
        KQO kqo = new KQO(this, recyclerView.getContext());
        kqo.LIZ = i;
        LLIIIILZ(kqo);
    }

    public WrapGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
