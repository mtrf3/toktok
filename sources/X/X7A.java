package X;

import java.io.DataInput;
import java.io.RandomAccessFile;

/* loaded from: classes16.dex */
public final class X7A {
    public final X73[] LIZ;

    public X7A(X73[] x73Arr) {
        this.LIZ = x73Arr;
    }

    public static final X7A LIZ(DataInput dataInput) {
        RandomAccessFile randomAccessFile = (RandomAccessFile) dataInput;
        if (randomAccessFile.readByte() == 1) {
            int readInt = randomAccessFile.readInt();
            if (readInt >= 0) {
                X73[] x73Arr = new X73[readInt];
                for (int i = 0; i < readInt; i++) {
                    x73Arr[i] = new X73(randomAccessFile.readUTF(), randomAccessFile.readUTF());
                }
                return new X7A(x73Arr);
            }
            throw new RuntimeException("illegal number of shared libraries");
        }
        throw new RuntimeException("wrong dso manifest version");
    }
}
