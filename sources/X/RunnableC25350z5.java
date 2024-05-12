package X;

import Y.IDRunnableS29S0200000;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* renamed from: X.0z5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC25350z5 implements Runnable {
    public final /* synthetic */ List LJLIL;
    public final /* synthetic */ List LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ Runnable LJLJJI = null;
    public final /* synthetic */ C25380z8 LJLJJL;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            this.LJLJJL.LIZJ.execute(new IDRunnableS29S0200000(C03200Aq.LIZ(new AbstractC03120Ai() { // from class: X.1bh
                @Override // X.AbstractC03120Ai
                public final int LIZLLL() {
                    return RunnableC25350z5.this.LJLILLLLZI.size();
                }

                @Override // X.AbstractC03120Ai
                public final int LJ() {
                    return RunnableC25350z5.this.LJLIL.size();
                }

                @Override // X.AbstractC03120Ai
                public final boolean LIZ(int i, int i2) {
                    Object obj = ListProtector.get(RunnableC25350z5.this.LJLIL, i);
                    Object obj2 = ListProtector.get(RunnableC25350z5.this.LJLILLLLZI, i2);
                    if (obj != null) {
                        if (obj2 != null) {
                            return RunnableC25350z5.this.LJLJJL.LIZIZ.LIZIZ.LJLI(i, i2, obj, obj2);
                        }
                    } else if (obj2 == null) {
                        return true;
                    }
                    throw new AssertionError();
                }

                @Override // X.AbstractC03120Ai
                public final boolean LIZIZ(int i, int i2) {
                    Object obj = ListProtector.get(RunnableC25350z5.this.LJLIL, i);
                    Object obj2 = ListProtector.get(RunnableC25350z5.this.LJLILLLLZI, i2);
                    if (obj != null) {
                        if (obj2 != null) {
                            return RunnableC25350z5.this.LJLJJL.LIZIZ.LIZIZ.LJLIIIL(i, i2, obj, obj2);
                        }
                    } else if (obj2 == null) {
                        return true;
                    }
                    return false;
                }

                @Override // X.AbstractC03120Ai
                public final Object LIZJ(int i, int i2) {
                    Object obj = ListProtector.get(RunnableC25350z5.this.LJLIL, i);
                    Object obj2 = ListProtector.get(RunnableC25350z5.this.LJLILLLLZI, i2);
                    if (obj != null && obj2 != null) {
                        return RunnableC25350z5.this.LJLJJL.LIZIZ.LIZIZ.LLIIIL(i, i2, obj, obj2);
                    }
                    throw new AssertionError();
                }
            }, true), this, 41));
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC25350z5(C25380z8 c25380z8, List list, List list2, int i) {
        this.LJLJJL = c25380z8;
        this.LJLIL = list;
        this.LJLILLLLZI = list2;
        this.LJLJI = i;
    }
}
