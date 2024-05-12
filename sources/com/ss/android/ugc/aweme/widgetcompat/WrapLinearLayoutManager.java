package com.ss.android.ugc.aweme.widgetcompat;

import X.AbstractC029409q;
import X.C0A7;
import X.C0AC;
import X.C10K;
import X.C170666ms;
import Y.ACallableS111S0100000_8;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes9.dex */
public class WrapLinearLayoutManager extends LinearLayoutManager {
    public AbstractC029409q LLIIIJ;

    public WrapLinearLayoutManager() {
    }

    public WrapLinearLayoutManager(int i) {
        super(0, false);
    }

    public static void LLJJJJ(AbstractC029409q abstractC029409q) {
        if (abstractC029409q == null) {
            return;
        }
        C10K.LIZIZ(new ACallableS111S0100000_8(abstractC029409q, 9), C10K.LJIIIIZZ, null);
    }

    @Override // X.C0A2
    public final void LJJLIIJ(AbstractC029409q abstractC029409q) {
        this.LLIIIJ = abstractC029409q;
    }

    public final IndexOutOfBoundsException LLJJJJJIL(IndexOutOfBoundsException indexOutOfBoundsException) {
        if (this.LLIIIJ != null) {
            IndexOutOfBoundsException indexOutOfBoundsException2 = new IndexOutOfBoundsException(this.LLIIIJ.getClass().getName());
            indexOutOfBoundsException2.initCause(indexOutOfBoundsException);
            return indexOutOfBoundsException2;
        }
        return indexOutOfBoundsException;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
    public final void LJLJJI(C0A7 c0a7, C0AC c0ac) {
        try {
            super.LJLJJI(c0a7, c0ac);
        } catch (IllegalArgumentException e) {
            e = e;
            if (this.LLIIIJ != null) {
                String name = this.LLIIIJ.getClass().getName();
                if (this.LLIIIJ != null) {
                    e = new IllegalArgumentException(this.LLIIIJ.getClass().getName(), e);
                }
                C170666ms.LIZ(e, name);
            }
        } catch (IndexOutOfBoundsException e2) {
            if (this.LLIIIJ != null) {
                C170666ms.LIZ(LLJJJJJIL(e2), this.LLIIIJ.getClass().getName());
            }
        } catch (NullPointerException e3) {
            if (this.LLIIIJ != null) {
                C170666ms.LIZ(e3, this.LLIIIJ.getClass().getName());
                LLJJJJ(this.LLIIIJ);
            }
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
    public final int LJZI(int i, C0A7 c0a7, C0AC c0ac) {
        try {
            return super.LJZI(i, c0a7, c0ac);
        } catch (IndexOutOfBoundsException e) {
            if (this.LLIIIJ != null) {
                C170666ms.LIZ(LLJJJJJIL(e), this.LLIIIJ.getClass().getName());
                return 0;
            }
            return 0;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
    public final int LL(int i, C0A7 c0a7, C0AC c0ac) {
        try {
            return super.LL(i, c0a7, c0ac);
        } catch (IndexOutOfBoundsException e) {
            if (this.LLIIIJ != null) {
                C170666ms.LIZ(LLJJJJJIL(e), this.LLIIIJ.getClass().getName());
            }
            return 0;
        } catch (NullPointerException e2) {
            if (this.LLIIIJ != null) {
                C170666ms.LIZ(e2, this.LLIIIJ.getClass().getName());
                LLJJJJ(this.LLIIIJ);
            }
            return 0;
        }
    }

    public WrapLinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
    public final View LJJLJLI(View view, int i, C0A7 c0a7, C0AC c0ac) {
        try {
            return super.LJJLJLI(view, i, c0a7, c0ac);
        } catch (IndexOutOfBoundsException e) {
            if (this.LLIIIJ != null) {
                C170666ms.LIZ(LLJJJJJIL(e), this.LLIIIJ.getClass().getName());
                return null;
            }
            return null;
        }
    }
}
