package X;

import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes12.dex */
public final class PBF {
    public final long LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public File LIZLLL;
    public final List<PBJ> LJ;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LogFile{startID=");
        LIZ.append(this.LIZ);
        LIZ.append(", totalCount=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", totalBytes=");
        LIZ.append(this.LIZJ);
        LIZ.append(", source=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", logList=");
        return C1NE.LIZIZ(LIZ, this.LJ, '}', LIZ);
    }

    public static PBF LIZ(ByteBuffer byteBuffer) {
        try {
            if (byteBuffer.getShort() != 2082) {
                return null;
            }
            long j = byteBuffer.getLong();
            int i = byteBuffer.getInt();
            int i2 = byteBuffer.getInt();
            ArrayList arrayList = new ArrayList();
            int i3 = 0;
            for (int i4 = 0; i4 < i; i4++) {
                int i5 = byteBuffer.getInt();
                i3 += i5;
                if (i3 > i2) {
                    return null;
                }
                byte[] bArr = new byte[i5];
                byteBuffer.get(bArr);
                arrayList.add(new PBJ(bArr));
            }
            return new PBF(j, i, i2, arrayList);
        } catch (Throwable unused) {
            return null;
        }
    }

    public PBF(long j, int i, int i2, List<PBJ> list) {
        this.LIZ = j;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LJ = list;
    }
}
