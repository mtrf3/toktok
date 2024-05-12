package X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.Future;
import kotlin.jvm.internal.o;

/* renamed from: X.JYe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49344JYe<T> {
    public final int LIZ;
    public final T LIZIZ;
    public volatile RecyclerView.ViewHolder LIZJ = null;
    public Future<JYV<RecyclerView.ViewHolder>> LIZLLL = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49344JYe)) {
            return false;
        }
        C49344JYe c49344JYe = (C49344JYe) obj;
        return this.LIZ == c49344JYe.LIZ && o.LJ(this.LIZIZ, c49344JYe.LIZIZ) && o.LJ(this.LIZJ, c49344JYe.LIZJ) && o.LJ(this.LIZLLL, c49344JYe.LIZLLL);
    }

    public final int hashCode() {
        int i = this.LIZ * 31;
        T t = this.LIZIZ;
        int hashCode = (((i + (t == null ? 0 : t.hashCode())) * 31) + (this.LIZJ == null ? 0 : this.LIZJ.hashCode())) * 31;
        Future<JYV<RecyclerView.ViewHolder>> future = this.LIZLLL;
        return hashCode + (future != null ? future.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CacheInfo(position=");
        LIZ.append(this.LIZ);
        LIZ.append(", data=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", viewHolder=");
        LIZ.append(this.LIZJ);
        LIZ.append(", future=");
        LIZ.append(this.LIZLLL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C49344JYe(int i, Object obj) {
        this.LIZ = i;
        this.LIZIZ = obj;
    }
}
