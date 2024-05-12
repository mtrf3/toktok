package X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.UUID;
import kotlin.jvm.internal.o;

/* renamed from: X.3Y7, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3Y7 implements InterfaceC80653En {
    public final RecyclerView LJLIL;
    public RecyclerView.ViewHolder LJLILLLLZI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3Y7)) {
            return false;
        }
        C3Y7 c3y7 = (C3Y7) obj;
        return o.LJ(this.LJLIL, c3y7.LJLIL) && o.LJ(this.LJLILLLLZI, c3y7.LJLILLLLZI);
    }

    public final int hashCode() {
        int hashCode = this.LJLIL.hashCode() * 31;
        RecyclerView.ViewHolder viewHolder = this.LJLILLLLZI;
        return hashCode + (viewHolder == null ? 0 : viewHolder.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FirstLevelHitLineVHSource(recyclerView=");
        LIZ.append(this.LJLIL);
        LIZ.append(", hitLineRef=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C3Y7(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        o.LJIIIZ(recyclerView, "recyclerView");
        this.LJLIL = recyclerView;
        this.LJLILLLLZI = viewHolder;
        o.LJIIIIZZ(UUID.randomUUID().toString(), "randomUUID().toString()");
    }
}
