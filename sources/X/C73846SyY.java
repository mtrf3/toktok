package X;

/* renamed from: X.SyY, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73846SyY<T> {
    public final Object[] LIZ;
    public Object[] LIZIZ;
    public int LIZJ;

    public C73846SyY() {
        Object[] objArr = new Object[5];
        this.LIZ = objArr;
        this.LIZIZ = objArr;
    }

    public final <U> boolean LIZ(InterfaceC73740Swq<? super U> interfaceC73740Swq) {
        Object[] objArr;
        Object[] objArr2 = this.LIZ;
        while (true) {
            if (objArr2 == null) {
                return false;
            }
            for (int i = 0; i < 4 && (objArr = objArr2[i]) != null; i++) {
                if (EnumC73845SyX.acceptFull(objArr, interfaceC73740Swq)) {
                    return true;
                }
            }
            objArr2 = objArr2[4];
        }
    }

    public final void LIZIZ(T t) {
        int i = this.LIZJ;
        if (i == 4) {
            Object[] objArr = new Object[5];
            this.LIZIZ[4] = objArr;
            this.LIZIZ = objArr;
            i = 0;
        }
        this.LIZIZ[i] = t;
        this.LIZJ = i + 1;
    }

    public final void LIZJ(InterfaceC73852Sye<? super T> interfaceC73852Sye) {
        Object obj;
        for (Object[] objArr = this.LIZ; objArr != null; objArr = (Object[]) objArr[4]) {
            for (int i = 0; i < 4 && (obj = objArr[i]) != null; i++) {
                if (interfaceC73852Sye.test(obj)) {
                    return;
                }
            }
        }
    }
}
