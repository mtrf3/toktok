package X;

import defpackage.g0;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Pnm, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C65534Pnm<K, V> {
    public Object[] LIZ;
    public int LIZIZ;

    public final C65574PoQ LIZ() {
        return C65574PoQ.LJI(this.LIZIZ, this.LIZ);
    }

    public C65534Pnm(int i) {
        this.LIZ = new Object[i * 2];
    }

    public final void LIZJ(Iterable iterable) {
        if (iterable instanceof Collection) {
            int size = (((Collection) iterable).size() + this.LIZIZ) * 2;
            Object[] objArr = this.LIZ;
            if (size > objArr.length) {
                this.LIZ = Arrays.copyOf(objArr, AbstractC65535Pnn.LIZ(objArr.length, size));
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            LIZIZ(entry.getKey(), entry.getValue());
        }
    }

    public final void LIZIZ(Object obj, Object obj2) {
        int i = (this.LIZIZ + 1) * 2;
        Object[] objArr = this.LIZ;
        if (i > objArr.length) {
            this.LIZ = Arrays.copyOf(objArr, AbstractC65535Pnn.LIZ(objArr.length, i));
        }
        g0.LJII(obj, obj2);
        Object[] objArr2 = this.LIZ;
        int i2 = this.LIZIZ;
        int i3 = i2 * 2;
        objArr2[i3] = obj;
        objArr2[i3 + 1] = obj2;
        this.LIZIZ = i2 + 1;
    }
}
