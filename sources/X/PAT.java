package X;

import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes12.dex */
public final class PAT {
    public final int LIZ;
    public final int LIZIZ;
    public File LIZJ;
    public final List<PAE> LIZLLL;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LogFile{totalCount=");
        LIZ.append(this.LIZ);
        LIZ.append(", totalBytes=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", source=");
        LIZ.append(this.LIZJ);
        LIZ.append(", logList=");
        return C1NE.LIZIZ(LIZ, this.LIZLLL, '}', LIZ);
    }

    public static PAT LIZ(ByteBuffer byteBuffer) {
        try {
            if (byteBuffer.getInt() != 1095781686) {
                return null;
            }
            byteBuffer.getInt();
            int i = byteBuffer.getInt();
            int i2 = byteBuffer.getInt();
            ArrayList arrayList = new ArrayList();
            int i3 = 0;
            for (int i4 = 0; i4 < i; i4++) {
                int i5 = byteBuffer.getInt();
                i3 += i5;
                if (i3 > i2) {
                    PAU.LIZ("APM-SDK", "construct LogFile failed.");
                    return null;
                }
                long j = byteBuffer.getLong();
                long j2 = byteBuffer.getLong();
                byte[] bArr = new byte[i5];
                byteBuffer.get(bArr);
                arrayList.add(new PAE(j, j2, bArr));
            }
            return new PAT(i, i2, arrayList);
        } catch (Throwable th) {
            PAU.LIZIZ("construct LogFile failed.", th);
            return null;
        }
    }

    public PAT(int i, int i2, List<PAE> list) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZLLL = list;
    }
}
