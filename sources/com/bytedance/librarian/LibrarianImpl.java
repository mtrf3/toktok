package com.bytedance.librarian;

import X.C0ON;
import X.C16880lQ;
import X.C25620zW;
import X.X1D;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import defpackage.a1;
import defpackage.b1;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: classes7.dex */
public class LibrarianImpl {
    public static final LibrarianImpl LJIILL;
    public static final String[] LJIILLIIL = {"log", "m", "stdc++", "dl", "c", "z", "android", "jnigraphics", "EGL", "GLESv1_CM", "GLESv2", "GLESv3", "OpenSLES", "OpenMAXAL"};
    public final File LIZ;
    public final LibrarianMonitor LIZIZ;
    public final File LIZLLL;
    public volatile boolean LJI;
    public List<ZipFile> LJIIIZ;
    public String LJIIJ;
    public Map<String, String> LJIIJJI;
    public String[] LJIIL;
    public String LJIILIIL;
    public final List<ZipFile> LJII = new CopyOnWriteArrayList();
    public final List<ZipFile> LJIIIIZZ = new ArrayList();
    public final String[] LJIILJJIL = {"/system/lib64", "/vendor/lib64"};
    public ApplicationInfo LJ = Librarian.LIZ.getApplicationInfo();
    public File LJFF = new File(this.LJ.nativeLibraryDir);
    public final Map<String, LibRecorder> LIZJ = new HashMap();

    /* loaded from: classes7.dex */
    public static class LibRecorder {
        public boolean LIZ;

        public final String toString() {
            return Boolean.toString(this.LIZ);
        }
    }

    /* loaded from: classes7.dex */
    public class Locker {
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
            LibrarianMonitor librarianMonitor = LibrarianImpl.this.LIZIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("released lock ");
            LIZ.append(this.LIZLLL.getPath());
            X1D.LIZIZ(LIZ);
            librarianMonitor.getClass();
            LibrarianImpl.this.LIZ(this.LIZJ);
            LibrarianImpl.this.LIZ(this.LIZ);
        }

        public final void LIZIZ() {
            RandomAccessFile randomAccessFile = new RandomAccessFile(this.LIZLLL, "rw");
            this.LIZ = randomAccessFile;
            try {
                this.LIZJ = randomAccessFile.getChannel();
                try {
                    LibrarianMonitor librarianMonitor = LibrarianImpl.this.LIZIZ;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("blocking on lock ");
                    LIZ.append(this.LIZLLL.getPath());
                    X1D.LIZIZ(LIZ);
                    librarianMonitor.getClass();
                    this.LIZIZ = this.LIZJ.lock();
                    LibrarianMonitor librarianMonitor2 = LibrarianImpl.this.LIZIZ;
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("acquired on lock ");
                    LIZ2.append(this.LIZLLL.getPath());
                    X1D.LIZIZ(LIZ2);
                    librarianMonitor2.getClass();
                } catch (IOException e) {
                    LibrarianImpl.this.LIZ(this.LIZJ);
                    throw e;
                }
            } catch (IOException e2) {
                LibrarianImpl.this.LIZ(this.LIZ);
                throw e2;
            }
        }

        public Locker(File file) {
            this.LIZLLL = file;
        }
    }

    static {
        String str;
        Context context = Librarian.LIZ;
        if (context != null) {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            File dir = context.getDir("librarian", 0);
            if (!dir.exists()) {
                dir.mkdirs();
            }
            if (Librarian.LIZIZ != null) {
                str = Librarian.LIZIZ;
            } else {
                str = "default.version";
            }
            File file = new File(applicationInfo.sourceDir);
            StringBuilder LIZJ = b1.LIZJ(str, ".");
            LIZJ.append(file.lastModified() >> 8);
            File file2 = new File(dir, X1D.LIZIZ(LIZJ));
            File[] listFiles = dir.listFiles();
            if (listFiles != null) {
                for (File file3 : listFiles) {
                    if (!file2.getName().equals(file3.getName())) {
                        File[] listFiles2 = file3.listFiles();
                        if (listFiles2 != null) {
                            for (File file4 : listFiles2) {
                                C16880lQ.LLLZZIL(file4);
                            }
                        }
                        C16880lQ.LLLZZIL(file3);
                    }
                }
            }
            file2.mkdirs();
            if (file2.exists()) {
                LibrarianMonitor librarianMonitor = Librarian.LIZJ;
                if (librarianMonitor == null) {
                    librarianMonitor = new LibrarianMonitor();
                }
                LJIILL = new LibrarianImpl(file2, librarianMonitor);
                return;
            }
            LJIILL = null;
            return;
        }
        throw new LibrarianUnsatisfiedLinkError("you should call init first or use loadLibraryForModule.");
    }

    public final void LJFF() {
        ((CopyOnWriteArrayList) this.LJII).clear();
        File file = new File(this.LJ.sourceDir);
        ArrayList arrayList = new ArrayList();
        arrayList.add(file);
        String[] strArr = this.LJ.splitSourceDirs;
        if (strArr != null && strArr.length != 0) {
            for (String str : strArr) {
                arrayList.add(new File(str));
                LibrarianMonitor librarianMonitor = this.LIZIZ;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("split source dir: ");
                LIZ.append(str);
                X1D.LIZIZ(LIZ);
                librarianMonitor.getClass();
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            File file2 = (File) it.next();
            try {
                ((CopyOnWriteArrayList) this.LJII).add(new ZipFile(file2));
            } catch (IOException e) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("fail to get zip file ");
                LIZ2.append(file2.getName());
                LIZ2.append(", size ");
                LIZ2.append(file2.length());
                LIZ2.append(", exists ");
                LIZ2.append(file2.exists());
                new LibrarianUnsatisfiedLinkError(X1D.LIZIZ(LIZ2), e).printStackTrace();
            }
        }
    }

    public final List<ZipFile> LJIIJJI() {
        ArrayList arrayList;
        List<ZipFile> list = this.LJIIIZ;
        if (list != null) {
            return list;
        }
        synchronized (this.LJIIIIZZ) {
            arrayList = new ArrayList(((CopyOnWriteArrayList) this.LJII).size() + ((ArrayList) this.LJIIIIZZ).size());
            arrayList.addAll(this.LJII);
            arrayList.addAll(this.LJIIIIZZ);
        }
        this.LJIIIZ = arrayList;
        return arrayList;
    }

    public static String LJ(String str) {
        return a1.LJ("lib", str, ".so");
    }

    public final void LIZ(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException unused) {
            this.LIZIZ.getClass();
        }
    }

    public final boolean LIZIZ(File file) {
        LIZJ(file.getName());
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("lib/");
        LIZ.append(this.LJIILIIL);
        LIZ.append("/");
        LIZ.append(file.getName());
        String LIZIZ = X1D.LIZIZ(LIZ);
        for (ZipFile zipFile : LJIIJJI()) {
            ZipEntry entry = zipFile.getEntry(LIZIZ);
            if (entry != null) {
                InputStream inputStream = zipFile.getInputStream(entry);
                try {
                    LJIIL(file, inputStream);
                    LibrarianMonitor librarianMonitor = this.LIZIZ;
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("get lib file ");
                    LIZ2.append(file.getPath());
                    LIZ2.append(" from ");
                    LIZ2.append(LIZIZ);
                    LIZ2.append(" of ");
                    LIZ2.append(zipFile.getName());
                    X1D.LIZIZ(LIZ2);
                    librarianMonitor.getClass();
                    LIZ(inputStream);
                    return true;
                } catch (Throwable th) {
                    LIZ(inputStream);
                    throw th;
                }
            }
        }
        return false;
    }

    public final void LIZJ(String str) {
        if (this.LJIILIIL != null) {
            return;
        }
        for (String str2 : this.LJIIL) {
            if (this.LJIIJ != null) {
                Object obj = ((HashMap) this.LJIIJJI).get(str2);
                String str3 = this.LJIIJ;
                if (obj == null) {
                    obj = str2;
                }
                if (!str3.equals(obj)) {
                    continue;
                }
            }
            String LIZJ = C0ON.LIZJ("lib/", str2, "/", str);
            for (ZipFile zipFile : LJIIJJI()) {
                if (zipFile != null && zipFile.getEntry(LIZJ) != null) {
                    this.LJIILIIL = str2;
                    LibrarianMonitor librarianMonitor = this.LIZIZ;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("ensure that abi is ");
                    LIZ.append(str2);
                    X1D.LIZIZ(LIZ);
                    librarianMonitor.getClass();
                    return;
                }
            }
        }
        StringBuilder LIZIZ = C25620zW.LIZIZ("can not ensure abi for ", str, ", check ");
        LIZIZ.append(this.LJIIJ);
        LIZIZ.append(", apks ");
        StringBuilder sb = new StringBuilder("[");
        for (ZipFile zipFile2 : LJIIJJI()) {
            if (zipFile2 != null) {
                String name = zipFile2.getName();
                File file = new File(name);
                sb.append(name);
                sb.append("#");
                sb.append(zipFile2.size());
                sb.append(":");
                sb.append(file.length());
                sb.append("|");
            }
        }
        sb.append("]");
        LIZIZ.append(sb.toString());
        throw new LibrarianUnsatisfiedLinkError(X1D.LIZIZ(LIZIZ));
    }

    public LibrarianImpl(File file, LibrarianMonitor librarianMonitor) {
        this.LIZ = file;
        this.LIZIZ = librarianMonitor;
        this.LIZLLL = new File(file, "process.lock");
    }

    public final void LIZLLL(File file, boolean z) {
        Locker locker;
        String name = file.getName();
        synchronized (this) {
            try {
                locker = new Locker(this.LIZLLL);
                try {
                    locker.LIZIZ();
                    if (!LIZIZ(file)) {
                        if (z) {
                            LibrarianMonitor librarianMonitor = this.LIZIZ;
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("may be system lib, no found ");
                            LIZ.append(name);
                            X1D.LIZIZ(LIZ);
                            librarianMonitor.getClass();
                        } else {
                            StringBuilder LIZ2 = X1D.LIZ();
                            LIZ2.append("fail to extract ");
                            LIZ2.append(name);
                            throw new LibrarianUnsatisfiedLinkError(X1D.LIZIZ(LIZ2));
                        }
                    }
                } catch (IOException e) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("fail to extract ");
                    LIZ3.append(name);
                    throw new LibrarianUnsatisfiedLinkError(X1D.LIZIZ(LIZ3), e);
                }
            } finally {
                locker.LIZ();
            }
        }
    }

    public final void LJII(String str, boolean z) {
        synchronized (this.LIZJ) {
            LibRecorder libRecorder = (LibRecorder) ((HashMap) this.LIZJ).get(str);
            if (libRecorder != null) {
                if (libRecorder.LIZ) {
                    return;
                }
            } else {
                libRecorder = new LibRecorder();
                ((HashMap) this.LIZJ).put(str, libRecorder);
            }
            synchronized (libRecorder) {
                if (libRecorder.LIZ) {
                    LibrarianMonitor librarianMonitor = this.LIZIZ;
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("lib was already loaded before: ");
                    LIZ.append(str);
                    X1D.LIZIZ(LIZ);
                    librarianMonitor.getClass();
                    return;
                }
                LJIIIZ(str, z);
                libRecorder.LIZ = true;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0318 A[Catch: IOException -> 0x036d, TryCatch #7 {IOException -> 0x036d, blocks: (B:110:0x030b, B:111:0x0312, B:113:0x0318, B:115:0x032e, B:117:0x0337, B:123:0x033a, B:135:0x0369, B:136:0x036c), top: B:106:0x02ff }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(java.lang.String r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 896
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.librarian.LibrarianImpl.LJIIIIZZ(java.lang.String, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0029 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ(java.lang.String r7, boolean r8) {
        /*
            r6 = this;
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r1 < r0) goto Lb
            r4 = 12
        L8:
            r3 = 0
            r2 = 0
            goto Ld
        Lb:
            r4 = 1
            goto L8
        Ld:
            r6.LJIIIIZZ(r7, r8)     // Catch: com.bytedance.librarian.LibrarianUnsatisfiedLinkError -> L11
            goto L29
        L11:
            r5 = move-exception
            android.content.Context r0 = com.bytedance.librarian.Librarian.LIZ
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()
            java.io.File r1 = new java.io.File
            java.lang.String r0 = r0.nativeLibraryDir
            r1.<init>(r0)
            java.io.File r0 = r6.LJFF
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L2a
        L27:
            if (r5 != 0) goto L47
        L29:
            return
        L2a:
            android.content.Context r0 = com.bytedance.librarian.Librarian.LIZ
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()
            r6.LJ = r0
            java.io.File r1 = new java.io.File
            android.content.pm.ApplicationInfo r0 = r6.LJ
            java.lang.String r0 = r0.nativeLibraryDir
            r1.<init>(r0)
            r6.LJFF = r1
            r6.LJFF()
            r6.LJIIIZ = r3
            int r2 = r2 + 1
            if (r2 >= r4) goto L27
            goto Ld
        L47:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.librarian.LibrarianImpl.LJIIIZ(java.lang.String, boolean):void");
    }

    public final boolean LJIIJ(String str, String str2) {
        try {
            this.LIZIZ.LIZ(str);
            LibrarianMonitor librarianMonitor = this.LIZIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("loaded the origin lib ");
            LIZ.append(str);
            LIZ.append(", tag: ");
            LIZ.append(str2);
            X1D.LIZIZ(LIZ);
            librarianMonitor.getClass();
            return true;
        } catch (UnsatisfiedLinkError e) {
            LibrarianMonitor librarianMonitor2 = this.LIZIZ;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("fail to load ");
            LIZ2.append(str);
            LIZ2.append(", tag: ");
            LIZ2.append(str2);
            X1D.LIZIZ(LIZ2);
            librarianMonitor2.getClass();
            ArrayList<UnsatisfiedLinkError> arrayList = LibrarianUnsatisfiedLinkError.LJLILLLLZI;
            synchronized (arrayList) {
                arrayList.add(e);
                File file = new File(Librarian.LIZ.getApplicationInfo().nativeLibraryDir);
                if (this.LJFF.equals(file)) {
                    return false;
                }
                StringBuilder LIZIZ = C25620zW.LIZIZ("System.loadLibrary(\"", str, "\") failed, because ApplicationInfo changed. nativeLibraryDir from ");
                LIZIZ.append(this.LJFF.getAbsolutePath());
                LIZIZ.append(" to ");
                LIZIZ.append(file.getAbsolutePath());
                throw new LibrarianUnsatisfiedLinkError(X1D.LIZIZ(LIZIZ), e);
            }
        }
    }

    public final void LJIIL(File file, InputStream inputStream) {
        File createTempFile = File.createTempFile("tmp-", file.getName(), file.getParentFile());
        LibrarianMonitor librarianMonitor = this.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("extracting ");
        LIZ.append(createTempFile.getPath());
        X1D.LIZIZ(LIZ);
        librarianMonitor.getClass();
        FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
        try {
            byte[] bArr = new byte[FileUtils.BUFFER_SIZE];
            int read = inputStream.read(bArr);
            while (read != -1) {
                fileOutputStream.write(bArr, 0, read);
                read = inputStream.read(bArr);
            }
            if (createTempFile.setReadOnly()) {
                LibrarianMonitor librarianMonitor2 = this.LIZIZ;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("renaming to ");
                LIZ2.append(file.getPath());
                X1D.LIZIZ(LIZ2);
                librarianMonitor2.getClass();
                if (createTempFile.renameTo(file)) {
                    return;
                }
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("failed to rename \"");
                LIZ3.append(createTempFile.getAbsolutePath());
                LIZ3.append("\" to \"");
                LIZ3.append(file.getAbsolutePath());
                LIZ3.append("\"");
                throw new IOException(X1D.LIZIZ(LIZ3));
            }
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("failed to mark readonly \"");
            LIZ4.append(createTempFile.getAbsolutePath());
            LIZ4.append("\" (tmp of \"");
            LIZ4.append(file.getAbsolutePath());
            LIZ4.append("\")");
            throw new IOException(X1D.LIZIZ(LIZ4));
        } finally {
            LIZ(fileOutputStream);
            C16880lQ.LLLZZIL(createTempFile);
        }
    }

    public final boolean LJI(File file, String str, boolean z) {
        try {
            LibrarianMonitor librarianMonitor = this.LIZIZ;
            String path = file.getPath();
            librarianMonitor.getClass();
            System.load(path);
            LibrarianMonitor librarianMonitor2 = this.LIZIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("loaded the extracted lib ");
            LIZ.append(str);
            X1D.LIZIZ(LIZ);
            librarianMonitor2.getClass();
            return true;
        } catch (UnsatisfiedLinkError e) {
            if (!z) {
                LibrarianMonitor librarianMonitor3 = this.LIZIZ;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("fail to load ");
                LIZ2.append(file.getName());
                LIZ2.append(", out lib exists");
                X1D.LIZIZ(LIZ2);
                librarianMonitor3.getClass();
                return false;
            }
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("finally fail to load ");
            LIZ3.append(file.getPath());
            throw new LibrarianUnsatisfiedLinkError(X1D.LIZIZ(LIZ3), e);
        }
    }
}
