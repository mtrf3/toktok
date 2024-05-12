package X;

import java.io.Closeable;
import java.io.File;

/* renamed from: X.PiT, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65205PiT implements Closeable {
    public final X50 LJLIL;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.LJLIL.close();
    }

    public C65205PiT(File file, int i) {
        if (X4H.LJFF.LJIIIIZZ("enable_file_channel_write", 0) > 0) {
            this.LJLIL = new C65204PiS(file);
        } else {
            this.LJLIL = new C65203PiR(file, i);
        }
    }
}
