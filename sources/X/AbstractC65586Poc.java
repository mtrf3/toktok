package X;

import defpackage.g0;
import java.util.Arrays;

/* renamed from: X.Poc, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC65586Poc<E> extends AbstractC65535Pnn<E> {
    public Object[] LIZ;
    public int LIZIZ;
    public boolean LIZJ;

    public AbstractC65586Poc(int i) {
        g0.LJIIIIZZ(i, "initialCapacity");
        this.LIZ = new Object[i];
        this.LIZIZ = 0;
    }

    public final void LIZIZ(Object obj) {
        obj.getClass();
        LIZJ(this.LIZIZ + 1);
        Object[] objArr = this.LIZ;
        int i = this.LIZIZ;
        this.LIZIZ = i + 1;
        objArr[i] = obj;
    }

    public final void LIZJ(int i) {
        Object[] objArr = this.LIZ;
        if (objArr.length < i) {
            this.LIZ = Arrays.copyOf(objArr, AbstractC65535Pnn.LIZ(objArr.length, i));
            this.LIZJ = false;
        } else {
            if (!this.LIZJ) {
                return;
            }
            this.LIZ = (Object[]) objArr.clone();
            this.LIZJ = false;
        }
    }
}
