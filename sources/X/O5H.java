package X;

import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class O5H {
    public O5H LIZ;
    public O5H LIZIZ;
    public final Reference<byte[]> LIZJ;
    public final int LIZLLL;

    public O5H(O5I o5i, byte[] byteArray, int i) {
        Reference<byte[]> softReference;
        o.LJIIJ(byteArray, "byteArray");
        this.LIZLLL = i;
        if (o5i.LIZJ) {
            softReference = new WeakReference<>(byteArray);
        } else {
            softReference = new SoftReference<>(byteArray);
        }
        this.LIZJ = softReference;
    }
}
