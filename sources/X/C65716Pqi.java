package X;

import java.io.File;

/* renamed from: X.Pqi, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65716Pqi extends QXX {
    public final File LJLIL;
    public final AbstractC65583PoZ<INJ> LJLILLLLZI;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Files.asByteSink(");
        LIZ.append(this.LJLIL);
        LIZ.append(", ");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(")");
        return X1D.LIZIZ(LIZ);
    }

    public C65716Pqi(File file, INJ[] injArr) {
        this.LJLIL = file;
        this.LJLILLLLZI = AbstractC65583PoZ.copyOf(injArr);
    }
}
