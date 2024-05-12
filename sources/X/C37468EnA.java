package X;

import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.EnA, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C37468EnA {
    public final InputStream LIZ;
    public byte[] LIZIZ = new byte[FileUtils.BUFFER_SIZE];
    public int LIZJ;
    public int LIZLLL;

    public C37468EnA(InputStream inputStream) {
        this.LIZ = inputStream;
    }

    public final void LIZ(int i) {
        byte[] bArr = this.LIZIZ;
        if (bArr != null) {
            if (i > bArr.length) {
                byte[] bArr2 = new byte[Math.max(bArr.length * 2, i)];
                byte[] bArr3 = this.LIZIZ;
                System.arraycopy(bArr3, 0, bArr2, 0, bArr3.length);
                this.LIZIZ = bArr2;
            }
            while (true) {
                int i2 = this.LIZJ;
                if (i2 < i) {
                    int read = this.LIZ.read(this.LIZIZ, this.LIZJ, Math.min(this.LIZIZ.length - i2, 1024));
                    if (read == -1) {
                        return;
                    } else {
                        this.LIZJ += read;
                    }
                } else {
                    return;
                }
            }
        } else {
            throw new IOException("The stream has been closed!");
        }
    }
}
