package X;

import java.util.Arrays;
import kotlin.jvm.internal.o;

/* renamed from: X.7jQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC194007jQ implements C7O2 {
    public final int LIZ;
    public final int LIZIZ;

    public AbstractC194007jQ() {
        this(0, 0);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.LIZ), Integer.valueOf(this.LIZIZ)});
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !o.LJ(obj.getClass(), getClass()) || !(obj instanceof AbstractC194007jQ)) {
            return false;
        }
        AbstractC194007jQ abstractC194007jQ = (AbstractC194007jQ) obj;
        if (this.LIZ == abstractC194007jQ.LIZ && this.LIZIZ == abstractC194007jQ.LIZIZ) {
            return true;
        }
        return false;
    }

    public AbstractC194007jQ(int i, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
    }
}
