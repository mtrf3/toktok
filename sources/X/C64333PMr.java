package X;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;

/* renamed from: X.PMr, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64333PMr implements Closeable {
    public FileOutputStream LJLIL;
    public FileLock LJLILLLLZI;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            FileLock fileLock = this.LJLILLLLZI;
            if (fileLock != null) {
                fileLock.release();
            }
        } finally {
            this.LJLIL.close();
        }
    }

    public C64333PMr(File file, boolean z) {
        FileLock fileLock;
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        this.LJLIL = fileOutputStream;
        try {
            if (z) {
                try {
                    fileLock = fileOutputStream.getChannel().tryLock();
                } catch (IOException unused) {
                    fileLock = null;
                }
            } else {
                fileLock = fileOutputStream.getChannel().lock();
            }
            if (fileLock == null) {
            }
            this.LJLILLLLZI = fileLock;
        } finally {
            this.LJLIL.close();
        }
    }
}
