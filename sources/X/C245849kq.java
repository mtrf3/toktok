package X;

import com.ss.android.ugc.aweme.profile.model.BlockStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.9kq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C245849kq implements C33Q {
    public final BlockStruct LJLIL;
    public final Exception LJLILLLLZI;

    public C245849kq() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C245849kq)) {
            return false;
        }
        C245849kq c245849kq = (C245849kq) obj;
        return o.LJ(this.LJLIL, c245849kq.LJLIL) && o.LJ(this.LJLILLLLZI, c245849kq.LJLILLLLZI);
    }

    public final int hashCode() {
        BlockStruct blockStruct = this.LJLIL;
        int hashCode = (blockStruct == null ? 0 : blockStruct.hashCode()) * 31;
        Exception exc = this.LJLILLLLZI;
        return hashCode + (exc != null ? exc.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProfileBlockState(blockStruct=");
        LIZ.append(this.LJLIL);
        LIZ.append(", exception=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C245849kq(BlockStruct blockStruct, Exception exc) {
        this.LJLIL = blockStruct;
        this.LJLILLLLZI = exc;
    }

    public static C245849kq LIZ(C245849kq c245849kq, BlockStruct blockStruct, Exception exc, int i) {
        if ((i & 1) != 0) {
            blockStruct = c245849kq.LJLIL;
        }
        if ((i & 2) != 0) {
            exc = c245849kq.LJLILLLLZI;
        }
        c245849kq.getClass();
        return new C245849kq(blockStruct, exc);
    }
}
