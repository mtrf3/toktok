package X;

import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes15.dex */
public final class W82 {
    public final WB4 LIZ;

    public W82(WB4 wb4) {
        this.LIZ = wb4;
    }

    public final void LIZ(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = this.LIZ.get(16384);
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, 16384);
                if (read != -1) {
                    outputStream.write(bArr, 0, read);
                } else {
                    return;
                }
            } finally {
                this.LIZ.LIZ(bArr);
            }
        }
    }
}
