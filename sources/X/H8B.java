package X;

import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class H8B {
    public final boolean LIZ;
    public final QaStruct LIZIZ;

    public H8B() {
        this(3, (QaStruct) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H8B)) {
            return false;
        }
        H8B h8b = (H8B) obj;
        return this.LIZ == h8b.LIZ && o.LJ(this.LIZIZ, h8b.LIZIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public final int hashCode() {
        boolean z = this.LIZ;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        QaStruct qaStruct = this.LIZIZ;
        return i + (qaStruct == null ? 0 : qaStruct.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RecordQaStickerUISceneStates(showQaStickerView=");
        LIZ.append(this.LIZ);
        LIZ.append(", qaStruct=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public /* synthetic */ H8B(int i, QaStruct qaStruct) {
        this((i & 2) != 0 ? null : qaStruct, false);
    }

    public H8B(QaStruct qaStruct, boolean z) {
        this.LIZ = z;
        this.LIZIZ = qaStruct;
    }

    public static H8B LIZ(H8B h8b, boolean z, QaStruct qaStruct, int i) {
        if ((i & 1) != 0) {
            z = h8b.LIZ;
        }
        if ((i & 2) != 0) {
            qaStruct = h8b.LIZIZ;
        }
        h8b.getClass();
        return new H8B(qaStruct, z);
    }
}
