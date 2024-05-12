package X;

/* renamed from: X.09R, reason: invalid class name */
/* loaded from: classes.dex */
public class C09R<T> {
    public final Object LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public int LIZLLL;

    public void LIZIZ() {
        throw null;
    }

    public final boolean LIZ() {
        if (this.LIZIZ || this.LIZJ) {
            return true;
        }
        return false;
    }

    public final void LIZJ() {
        if (!this.LIZIZ && !this.LIZJ) {
            this.LIZIZ = true;
            LIZIZ();
        } else {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("sendResult() called when either sendResult() or sendError() had already been called for: ");
            LIZ.append(this.LIZ);
            throw new IllegalStateException(X1D.LIZIZ(LIZ));
        }
    }

    public C09R(Object obj) {
        this.LIZ = obj;
    }
}
