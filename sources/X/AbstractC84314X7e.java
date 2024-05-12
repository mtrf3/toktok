package X;

import java.io.Closeable;

/* renamed from: X.X7e, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public abstract class AbstractC84314X7e implements Closeable {
    public int mReferenceCount = 1;

    public final void LIZ() {
        synchronized (this) {
            int i = this.mReferenceCount;
            if (i > 0) {
                this.mReferenceCount = i + 1;
            } else {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("attempt to re-open an already-closed object: ");
                LIZ.append(this);
                throw new IllegalStateException(X1D.LIZIZ(LIZ));
            }
        }
    }

    public abstract void LIZIZ();

    public final void LIZLLL() {
        boolean z;
        synchronized (this) {
            z = true;
            int i = this.mReferenceCount - 1;
            this.mReferenceCount = i;
            if (i != 0) {
                z = false;
            }
        }
        if (z) {
            LIZIZ();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        LIZLLL();
    }
}
