package X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.E1c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35744E1c {
    public int LIZ;
    public final ArrayList<RecyclerView.ViewHolder> LIZIZ;

    public C35744E1c() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35744E1c)) {
            return false;
        }
        C35744E1c c35744E1c = (C35744E1c) obj;
        return this.LIZ == c35744E1c.LIZ && o.LJ(this.LIZIZ, c35744E1c.LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode() + (this.LIZ * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("InnerScrapData(mMaxScrap=");
        LIZ.append(this.LIZ);
        LIZ.append(", mScrapHeap=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C35744E1c(Object obj) {
        ArrayList<RecyclerView.ViewHolder> arrayList = new ArrayList<>(5);
        this.LIZ = 5;
        this.LIZIZ = arrayList;
    }
}
