package X;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;

/* renamed from: X.09e, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C028209e {
    public final int LIZ;
    public final int LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.LIZIZ), Long.valueOf(this.LIZJ), Integer.valueOf(this.LIZ), Long.valueOf(this.LIZLLL));
    }

    public static C028209e LIZ(File file) {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            C028209e c028209e = new C028209e(dataInputStream.readLong(), dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong());
            dataInputStream.close();
            return c028209e;
        } catch (Throwable th) {
            try {
                dataInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void LIZIZ(File file) {
        C16880lQ.LLLZZIL(file);
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.LIZ);
            dataOutputStream.writeInt(this.LIZIZ);
            dataOutputStream.writeLong(this.LIZJ);
            dataOutputStream.writeLong(this.LIZLLL);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C028209e)) {
            return false;
        }
        C028209e c028209e = (C028209e) obj;
        if (this.LIZIZ == c028209e.LIZIZ && this.LIZJ == c028209e.LIZJ && this.LIZ == c028209e.LIZ && this.LIZLLL == c028209e.LIZLLL) {
            return true;
        }
        return false;
    }

    public C028209e(long j, int i, int i2, long j2) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = j;
        this.LIZLLL = j2;
    }
}
