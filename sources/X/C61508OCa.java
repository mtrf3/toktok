package X;

import com.bytedance.geckox.utils.BsPatch;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: X.OCa, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61508OCa {
    public static final java.util.Map<Integer, String> LJII;
    public RandomAccessFile LIZIZ;
    public File LIZJ;
    public File LIZLLL;
    public File LJ;
    public int LJFF;
    public final java.util.Set<String> LIZ = new HashSet();
    public String LJI = "";

    static {
        HashMap hashMap = new HashMap();
        LJII = hashMap;
        hashMap.put(1, "modify");
        hashMap.put(2, "delete");
        hashMap.put(3, "add");
        hashMap.put(4, "rename");
        hashMap.put(5, "rewrite");
        hashMap.put(6, "same");
    }

    public final void LIZJ() {
        while (this.LIZIZ.getFilePointer() != this.LIZIZ.length()) {
            String readUTF = this.LIZIZ.readUTF();
            if (!readUTF.isEmpty()) {
                ((HashSet) this.LIZ).add(readUTF);
                File file = new File(this.LIZJ, readUTF);
                if (!readUTF.startsWith("__MACOSX/") && !readUTF.equals(".DS_Store")) {
                    byte readByte = this.LIZIZ.readByte();
                    HashMap hashMap = (HashMap) LJII;
                    this.LJI = C16880lQ.LLLZ("patch failed, type:%s, path:%s, detail:", new Object[]{hashMap.get(Integer.valueOf(readByte)), readUTF});
                    switch (readByte) {
                        case 1:
                            LIZLLL(file, readUTF);
                            break;
                        case 2:
                            break;
                        case 3:
                            File file2 = new File(this.LIZLLL, readUTF);
                            LIZIZ(file2.getParentFile());
                            LJII(file2);
                            if (this.LJFF == 0) {
                                byte[] bArr = new byte[32];
                                this.LIZIZ.readFully(bArr);
                                String str = new String(bArr);
                                String LIZJ = C61327O5b.LIZJ(file2);
                                if (!LIZJ.equals(str)) {
                                    StringBuilder LIZ = X1D.LIZ();
                                    YE1.LIZLLL(LIZ, this.LJI, "md5 check failed, local md5:", LIZJ, ", expect md5:");
                                    LIZ.append(str);
                                    throw new C61509OCb(1011, X1D.LIZIZ(LIZ));
                                }
                                break;
                            } else {
                                continue;
                            }
                        case 4:
                            String readUTF2 = this.LIZIZ.readUTF();
                            if (!readUTF2.isEmpty()) {
                                LJ(file, readUTF2);
                                break;
                            } else {
                                StringBuilder LIZ2 = X1D.LIZ();
                                throw new C61509OCb(1006, JBR.LJFF(LIZ2, this.LJI, "read path is nil", LIZ2));
                            }
                        case 5:
                            String readUTF3 = this.LIZIZ.readUTF();
                            if (!readUTF3.isEmpty()) {
                                this.LJI = C16880lQ.LLLZ("patch failed, type:%s, path:%s, newPath: %s, detail:", new Object[]{hashMap.get(Integer.valueOf(readByte)), readUTF, readUTF3});
                                LIZLLL(file, readUTF3);
                                break;
                            } else {
                                StringBuilder LIZ3 = X1D.LIZ();
                                throw new C61509OCb(1006, JBR.LJFF(LIZ3, this.LJI, "read path is nil", LIZ3));
                            }
                        case 6:
                            LJ(file, readUTF);
                            break;
                        default:
                            StringBuilder LIZ4 = X1D.LIZ();
                            throw new C61509OCb(1006, JBR.LJFF(LIZ4, this.LJI, "not support change type", LIZ4));
                    }
                }
            } else {
                throw new C61509OCb(1006, "read path is empty");
            }
        }
    }

    public final void LIZIZ(File file) {
        try {
            C61467OAl.LIZIZ(file);
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            throw new C61509OCb(1012, KMP.LJFF(LIZ, this.LJI, e, LIZ));
        }
    }

    public final void LJI(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return;
        }
        for (File file2 : listFiles) {
            if (file2.isFile()) {
                String substring = file2.getAbsolutePath().substring(this.LIZJ.getAbsolutePath().length() + 1);
                if (!((HashSet) this.LIZ).contains(substring)) {
                    LIZ(file2, new File(this.LIZLLL, substring));
                }
            } else {
                LJI(file2);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0035, code lost:
    
        r1 = (int) r5;
        r13.LIZIZ.readFully(r3, 0, r1);
        r7.write(r3, 0, r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(java.io.File r14) {
        /*
            r13 = this;
            boolean r0 = r14.exists()
            r4 = 1007(0x3ef, float:1.411E-42)
            if (r0 == 0) goto Le
            boolean r0 = X.C16880lQ.LLLZZIL(r14)
            if (r0 == 0) goto L69
        Le:
            r5 = 0
            java.io.RandomAccessFile r0 = r13.LIZIZ     // Catch: java.lang.Exception -> L46 java.lang.Throwable -> L61
            long r11 = r0.readLong()     // Catch: java.lang.Exception -> L46 java.lang.Throwable -> L61
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch: java.lang.Exception -> L46 java.lang.Throwable -> L61
            r7.<init>(r14)     // Catch: java.lang.Exception -> L46 java.lang.Throwable -> L61
            r10 = 1048576(0x100000, float:1.469368E-39)
            byte[] r3 = new byte[r10]     // Catch: java.lang.Exception -> L43 java.lang.Throwable -> L64
            r8 = 0
        L20:
            int r0 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r0 >= 0) goto L3f
            long r5 = r11 - r8
            long r1 = (long) r10     // Catch: java.lang.Exception -> L43 java.lang.Throwable -> L64
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 < 0) goto L35
            long r8 = r8 + r1
            java.io.RandomAccessFile r0 = r13.LIZIZ     // Catch: java.lang.Exception -> L43 java.lang.Throwable -> L64
            r0.readFully(r3)     // Catch: java.lang.Exception -> L43 java.lang.Throwable -> L64
            r7.write(r3)     // Catch: java.lang.Exception -> L43 java.lang.Throwable -> L64
            goto L20
        L35:
            java.io.RandomAccessFile r2 = r13.LIZIZ     // Catch: java.lang.Exception -> L43 java.lang.Throwable -> L64
            int r1 = (int) r5     // Catch: java.lang.Exception -> L43 java.lang.Throwable -> L64
            r0 = 0
            r2.readFully(r3, r0, r1)     // Catch: java.lang.Exception -> L43 java.lang.Throwable -> L64
            r7.write(r3, r0, r1)     // Catch: java.lang.Exception -> L43 java.lang.Throwable -> L64
        L3f:
            X.C78609UtB.LJJIIZI(r7)
            return
        L43:
            r3 = move-exception
            r5 = r7
            goto L47
        L46:
            r3 = move-exception
        L47:
            X.OCb r2 = new X.OCb     // Catch: java.lang.Throwable -> L61
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Throwable -> L61
            java.lang.String r0 = r13.LJI     // Catch: java.lang.Throwable -> L61
            r1.append(r0)     // Catch: java.lang.Throwable -> L61
            java.lang.String r0 = r3.getMessage()     // Catch: java.lang.Throwable -> L61
            r1.append(r0)     // Catch: java.lang.Throwable -> L61
            java.lang.String r0 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Throwable -> L61
            r2.<init>(r4, r0)     // Catch: java.lang.Throwable -> L61
            throw r2     // Catch: java.lang.Throwable -> L61
        L61:
            r0 = move-exception
            r7 = r5
            goto L65
        L64:
            r0 = move-exception
        L65:
            X.C78609UtB.LJJIIZI(r7)
            throw r0
        L69:
            X.OCb r2 = new X.OCb
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = r13.LJI
            r1.append(r0)
            java.lang.String r0 = "remove old file error: "
            r1.append(r0)
            java.lang.String r0 = r14.getPath()
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            r2.<init>(r4, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61508OCa.LJII(java.io.File):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ(File file, File file2) {
        FileInputStream fileInputStream;
        LIZIZ(file2.getParentFile());
        FileInputStream fileInputStream2 = null;
        try {
            FileInputStream fileInputStream3 = new FileInputStream(file);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                try {
                    byte[] bArr = new byte[1048576];
                    while (true) {
                        int read = fileInputStream3.read(bArr);
                        if (read != -1) {
                            fileOutputStream.write(bArr, 0, read);
                        } else {
                            C78609UtB.LJJIIZI(fileInputStream3);
                            C78609UtB.LJJIIZI(fileOutputStream);
                            return;
                        }
                    }
                } catch (Exception e) {
                    e = e;
                    fileInputStream2 = fileOutputStream;
                    fileInputStream = fileInputStream2;
                    fileInputStream2 = fileInputStream3;
                    try {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append(this.LJI);
                        LIZ.append(e.getMessage());
                        throw new C61509OCb(1012, X1D.LIZIZ(LIZ));
                    } catch (Throwable th) {
                        th = th;
                        C78609UtB.LJJIIZI(fileInputStream2);
                        C78609UtB.LJJIIZI(fileInputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream2 = fileOutputStream;
                    fileInputStream = fileInputStream2;
                    fileInputStream2 = fileInputStream3;
                    C78609UtB.LJJIIZI(fileInputStream2);
                    C78609UtB.LJJIIZI(fileInputStream);
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e3) {
            e = e3;
            fileInputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileInputStream = null;
        }
    }

    public final void LIZLLL(File file, String str) {
        if (file.exists()) {
            File file2 = new File(this.LIZLLL, str);
            LIZIZ(file2.getParentFile());
            File file3 = new File(this.LJ.getParentFile(), "bytepatch_patch_temp_file");
            LJII(file3);
            try {
                BsPatch.LIZ(file, file3, this.LIZLLL, str);
                C16880lQ.LLLZZIL(file3);
                byte[] bArr = new byte[32];
                this.LIZIZ.readFully(bArr);
                String str2 = new String(bArr);
                String LIZJ = C61327O5b.LIZJ(file2);
                if (!LIZJ.equals(str2)) {
                    if (C61327O5b.LIZJ(file).equals(str2)) {
                        StringBuilder LIZ = X1D.LIZ();
                        throw new C61509OCb(1024, JBR.LJFF(LIZ, this.LJI, "old file is same", LIZ));
                    }
                    StringBuilder LIZ2 = X1D.LIZ();
                    YE1.LIZLLL(LIZ2, this.LJI, "md5 check failed, local md5:", LIZJ, ", expect md5:");
                    LIZ2.append(str2);
                    throw new C61509OCb(1011, X1D.LIZIZ(LIZ2));
                }
                return;
            } catch (Exception e) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(this.LJI);
                LIZ3.append("bspatch error:");
                LIZ3.append(e.getMessage());
                throw new C61509OCb(1010, X1D.LIZIZ(LIZ3));
            }
        }
        StringBuilder LIZ4 = X1D.LIZ();
        throw new C61509OCb(1006, JBR.LJFF(LIZ4, this.LJI, "path not exists: ", LIZ4));
    }

    public final void LJ(File file, String str) {
        if (file.exists()) {
            File file2 = new File(this.LIZLLL, str);
            LIZ(file, file2);
            if (this.LJFF == 0) {
                byte[] bArr = new byte[32];
                this.LIZIZ.readFully(bArr);
                String str2 = new String(bArr);
                String LIZJ = C61327O5b.LIZJ(file2);
                if (!LIZJ.equals(str2)) {
                    String LIZJ2 = C61327O5b.LIZJ(file);
                    if (!LIZJ2.equals(LIZJ)) {
                        StringBuilder LIZ = X1D.LIZ();
                        YE1.LIZLLL(LIZ, this.LJI, "copy error, old file md5:", LIZJ2, ", new file md5:");
                        throw new C61509OCb(1013, C025908h.LIZIZ(LIZ, LIZJ, ", expect md5:", str2, LIZ));
                    }
                    StringBuilder LIZ2 = X1D.LIZ();
                    YE1.LIZLLL(LIZ2, this.LJI, "md5 check failed, local md5:", LIZJ, ", expect md5:");
                    LIZ2.append(str2);
                    throw new C61509OCb(1011, X1D.LIZIZ(LIZ2));
                }
                return;
            }
            return;
        }
        StringBuilder LIZ3 = X1D.LIZ();
        throw new C61509OCb(1006, JBR.LJFF(LIZ3, this.LJI, "path not exists: ", LIZ3));
    }

    public final void LJFF(File file, File file2, File file3) {
        if (file.exists() && !file.isFile()) {
            if (file3.exists() && !file3.isDirectory()) {
                if (!file2.exists() || !file2.isFile()) {
                    if (!file2.exists() || !file2.isDirectory() || C61467OAl.LIZLLL(file2)) {
                        this.LIZJ = file;
                        this.LIZLLL = file2;
                        this.LJ = file3;
                        try {
                            try {
                                try {
                                    RandomAccessFile randomAccessFile = new RandomAccessFile(this.LJ, "rw");
                                    this.LIZIZ = randomAccessFile;
                                    byte[] bArr = new byte[8];
                                    randomAccessFile.readFully(bArr);
                                    if ("BYTEDIFF".equals(new String(bArr))) {
                                        byte readByte = this.LIZIZ.readByte();
                                        if (readByte <= 1 && readByte >= 0) {
                                            this.LJFF = readByte;
                                            LIZJ();
                                            this.LJI = "";
                                            if (readByte == 0) {
                                                LJI(this.LIZJ);
                                            }
                                            return;
                                        }
                                        StringBuilder LIZ = X1D.LIZ();
                                        LIZ.append("unsupported version: ");
                                        LIZ.append((int) readByte);
                                        throw new C61509OCb(1005, X1D.LIZIZ(LIZ));
                                    }
                                    StringBuilder LIZ2 = X1D.LIZ();
                                    LIZ2.append("not bytediff file: ");
                                    LIZ2.append(new String(bArr));
                                    throw new C61509OCb(1005, X1D.LIZIZ(LIZ2));
                                } catch (C61509OCb e) {
                                    throw e;
                                }
                            } catch (Exception e2) {
                                StringBuilder LIZ3 = X1D.LIZ();
                                LIZ3.append(this.LJI);
                                LIZ3.append(e2.getMessage());
                                throw new C61509OCb(1099, X1D.LIZIZ(LIZ3));
                            }
                        } finally {
                            C78609UtB.LJJIIZI(this.LIZIZ);
                        }
                    }
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("param dest error, remove failed: ");
                    LIZ4.append(file2.getPath());
                    throw new C61509OCb(1000, X1D.LIZIZ(LIZ4));
                }
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("param dest error,  is a file: ");
                LIZ5.append(file2.getPath());
                throw new C61509OCb(1000, X1D.LIZIZ(LIZ5));
            }
            StringBuilder LIZ6 = X1D.LIZ();
            LIZ6.append("param patch error: ");
            LIZ6.append(file3.getPath());
            throw new C61509OCb(1000, X1D.LIZIZ(LIZ6));
        }
        StringBuilder LIZ7 = X1D.LIZ();
        LIZ7.append("param src error: ");
        LIZ7.append(file.getPath());
        throw new C61509OCb(1000, X1D.LIZIZ(LIZ7));
    }
}
