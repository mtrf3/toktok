package X;

/* renamed from: X.ZiA, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90666ZiA extends AbstractC90380ZdY {
    @Override // X.AbstractC90380ZdY
    public final void LIZ(C90274Zbq c90274Zbq, C90274Zbq c90274Zbq2) {
        c90274Zbq.LIZIZ = c90274Zbq2;
    }

    @Override // X.AbstractC90380ZdY
    public final void LIZIZ(C90274Zbq c90274Zbq, Thread thread) {
        c90274Zbq.LIZ = thread;
    }

    @Override // X.AbstractC90380ZdY
    public final boolean LIZJ(AbstractC90683ZiR<?> abstractC90683ZiR, C90404Zdw c90404Zdw, C90404Zdw c90404Zdw2) {
        synchronized (abstractC90683ZiR) {
            if (abstractC90683ZiR.LJLILLLLZI == c90404Zdw) {
                abstractC90683ZiR.LJLILLLLZI = c90404Zdw2;
                return true;
            }
            return false;
        }
    }

    @Override // X.AbstractC90380ZdY
    public final boolean LIZLLL(AbstractC90683ZiR<?> abstractC90683ZiR, Object obj, Object obj2) {
        synchronized (abstractC90683ZiR) {
            if (abstractC90683ZiR.LJLIL == obj) {
                abstractC90683ZiR.LJLIL = obj2;
                return true;
            }
            return false;
        }
    }

    @Override // X.AbstractC90380ZdY
    public final boolean LJ(AbstractC90683ZiR<?> abstractC90683ZiR, C90274Zbq c90274Zbq, C90274Zbq c90274Zbq2) {
        synchronized (abstractC90683ZiR) {
            if (abstractC90683ZiR.LJLJI == c90274Zbq) {
                abstractC90683ZiR.LJLJI = c90274Zbq2;
                return true;
            }
            return false;
        }
    }
}
