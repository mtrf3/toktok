package X;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.Fia, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39732Fia {
    public RandomAccessFile LIZ;
    public FileLock LIZIZ;
    public FileChannel LIZJ;
    public final File LIZLLL;

    public final void LIZ() {
        FileLock fileLock = this.LIZIZ;
        if (fileLock != null) {
            try {
                fileLock.release();
            } catch (IOException unused) {
            }
        }
        C39734Fic LIZJ = C39734Fic.LIZJ();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Released lock ");
        LIZ.append(this.LIZLLL.getPath());
        X1D.LIZIZ(LIZ);
        LIZJ.getClass();
        C78685UuP.LJII(this.LIZJ);
        C78685UuP.LJII(this.LIZ);
    }

    public final void LIZIZ() {
        C39734Fic LIZJ = C39734Fic.LIZJ();
        File file = this.LIZLLL;
        if (!file.exists()) {
            List<String> list = C39639Fh5.LIZIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("locker start crate file ");
            LIZ.append(file.getPath());
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) list;
            copyOnWriteArrayList.add(X1D.LIZIZ(LIZ));
            File parentFile = file.getParentFile();
            C78685UuP.LJJII(parentFile);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("get parent work dir path permission:");
            LIZ2.append(parentFile);
            LIZ2.append("; write:");
            LIZ2.append(parentFile.canWrite());
            LIZ2.append("; read:");
            LIZ2.append(parentFile.canRead());
            LIZ2.append(";exist:");
            LIZ2.append(parentFile.exists());
            copyOnWriteArrayList.add(X1D.LIZIZ(LIZ2));
            file.createNewFile();
        }
        RandomAccessFile randomAccessFile = new RandomAccessFile(this.LIZLLL, "rw");
        this.LIZ = randomAccessFile;
        try {
            this.LIZJ = randomAccessFile.getChannel();
            try {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("Blocking on lock ");
                LIZ3.append(this.LIZLLL.getCanonicalPath());
                X1D.LIZIZ(LIZ3);
                LIZJ.getClass();
                this.LIZIZ = this.LIZJ.lock();
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("Acquired on lock ");
                LIZ4.append(this.LIZLLL.getCanonicalPath());
                X1D.LIZIZ(LIZ4);
            } catch (IOException e) {
                C78685UuP.LJII(this.LIZJ);
                throw e;
            }
        } catch (IOException e2) {
            C78685UuP.LJII(this.LIZ);
            throw e2;
        }
    }

    public C39732Fia(File file) {
        this.LIZLLL = file;
    }
}
