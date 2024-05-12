package com.ss.android.ugc.aweme.views;

import X.AbstractC029409q;
import X.C0A7;
import X.C0AC;
import X.C10K;
import X.C36922EeM;
import X.InterfaceC51344KDc;
import Y.ACallableS111S0100000_8;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes9.dex */
public class WrapLinearLayoutManager extends LinearLayoutManager {
    public AbstractC029409q LLIIIJ;
    public InterfaceC51344KDc LLIIIL;
    public boolean LLIIIZ;

    public WrapLinearLayoutManager() {
        this.LLIIIZ = true;
    }

    public WrapLinearLayoutManager(int i) {
        super(i, false);
        this.LLIIIZ = true;
    }

    public static void LLJJJJ(AbstractC029409q abstractC029409q) {
        if (abstractC029409q == null) {
            return;
        }
        C10K.LIZIZ(new ACallableS111S0100000_8(abstractC029409q, 8), C10K.LJIIIIZZ, null);
    }

    @Override // X.C0A2
    public final void LJJLIIJ(AbstractC029409q abstractC029409q) {
        this.LLIIIJ = abstractC029409q;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
    public void LJLJJL(C0AC c0ac) {
        super.LJLJJL(c0ac);
        InterfaceC51344KDc interfaceC51344KDc = this.LLIIIL;
        if (interfaceC51344KDc != null) {
            interfaceC51344KDc.LIZ();
        }
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
    public void LJLJJI(C0A7 c0a7, C0AC c0ac) {
        try {
            super.LJLJJI(c0a7, c0ac);
        } catch (IllegalArgumentException e) {
            e = e;
            if (this.LLIIIJ != null) {
                String name = this.LLIIIJ.getClass().getName();
                if (this.LLIIIJ != null) {
                    e = new IllegalArgumentException(this.LLIIIJ.getClass().getName(), e);
                }
                C36922EeM.LIZIZ(e, name);
            }
        } catch (IndexOutOfBoundsException e2) {
            if (this.LLIIIJ != null) {
                C36922EeM.LIZIZ(LLJJJJJIL(e2), this.LLIIIJ.getClass().getName());
            }
        } catch (NullPointerException e3) {
            if (this.LLIIIJ != null) {
                C36922EeM.LIZIZ(e3, this.LLIIIJ.getClass().getName());
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
                C36922EeM.LIZIZ(LLJJJJJIL(e), this.LLIIIJ.getClass().getName());
                return 0;
            }
            return 0;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
    public final int LL(int i, C0A7 c0a7, C0AC c0ac) {
        try {
            if (this.LLIIIZ) {
                return super.LL(i, c0a7, c0ac);
            }
            return 1;
        } catch (IllegalArgumentException e) {
            AbstractC029409q abstractC029409q = this.LLIIIJ;
            if (abstractC029409q != null) {
                C36922EeM.LIZIZ(e, abstractC029409q.getClass().getName());
            }
            return 0;
        } catch (IndexOutOfBoundsException e2) {
            AbstractC029409q abstractC029409q2 = this.LLIIIJ;
            if (abstractC029409q2 != null) {
                C36922EeM.LIZIZ(LLJJJJJIL(e2), abstractC029409q2.getClass().getName());
            }
            return 0;
        } catch (NullPointerException e3) {
            AbstractC029409q abstractC029409q3 = this.LLIIIJ;
            if (abstractC029409q3 != null) {
                C36922EeM.LIZIZ(e3, abstractC029409q3.getClass().getName());
                LLJJJJ(this.LLIIIJ);
            }
            return 0;
        }
    }

    public WrapLinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.LLIIIZ = true;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
    public final View LJJLJLI(View view, int i, C0A7 c0a7, C0AC c0ac) {
        try {
            return super.LJJLJLI(view, i, c0a7, c0ac);
        } catch (IndexOutOfBoundsException e) {
            if (this.LLIIIJ != null) {
                C36922EeM.LIZIZ(LLJJJJJIL(e), this.LLIIIJ.getClass().getName());
                return null;
            }
            return null;
        }
    }
}
