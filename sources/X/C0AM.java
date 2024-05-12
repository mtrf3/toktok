package X;

import Y.IDRunnableS29S0200000;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* renamed from: X.0AM, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0AM implements Runnable {
    public final /* synthetic */ List LJLIL;
    public final /* synthetic */ List LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ Runnable LJLJJI;
    public final /* synthetic */ C0AR LJLJJL;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            this.LJLJJL.LIZJ.execute(new IDRunnableS29S0200000(C03200Aq.LIZ(new AbstractC03120Ai() { // from class: X.1Be
                @Override // X.AbstractC03120Ai
                public final int LIZLLL() {
                    return C0AM.this.LJLILLLLZI.size();
                }

                @Override // X.AbstractC03120Ai
                public final int LJ() {
                    return C0AM.this.LJLIL.size();
                }

                @Override // X.AbstractC03120Ai
                public final boolean LIZ(int i, int i2) {
                    Object obj = ListProtector.get(C0AM.this.LJLIL, i);
                    Object obj2 = ListProtector.get(C0AM.this.LJLILLLLZI, i2);
                    if (obj != null) {
                        if (obj2 != null) {
                            return C0AM.this.LJLJJL.LIZIZ.LIZIZ.LIZ(obj, obj2);
                        }
                    } else if (obj2 == null) {
                        return true;
                    }
                    throw new AssertionError();
                }

                @Override // X.AbstractC03120Ai
                public final boolean LIZIZ(int i, int i2) {
                    Object obj = ListProtector.get(C0AM.this.LJLIL, i);
                    Object obj2 = ListProtector.get(C0AM.this.LJLILLLLZI, i2);
                    if (obj != null) {
                        if (obj2 != null) {
                            return C0AM.this.LJLJJL.LIZIZ.LIZIZ.LIZIZ(obj, obj2);
                        }
                    } else if (obj2 == null) {
                        return true;
                    }
                    return false;
                }

                @Override // X.AbstractC03120Ai
                public final Object LIZJ(int i, int i2) {
                    Object obj = ListProtector.get(C0AM.this.LJLIL, i);
                    Object obj2 = ListProtector.get(C0AM.this.LJLILLLLZI, i2);
                    if (obj != null && obj2 != null) {
                        return C0AM.this.LJLJJL.LIZIZ.LIZIZ.LIZJ(obj, obj2);
                    }
                    throw new AssertionError();
                }
            }, true), this, 8));
        } finally {
            if (LIZ) {
            }
        }
    }

    public C0AM(C0AR c0ar, List list, List list2, int i, Runnable runnable) {
        this.LJLJJL = c0ar;
        this.LJLIL = list;
        this.LJLILLLLZI = list2;
        this.LJLJI = i;
        this.LJLJJI = runnable;
    }
}
