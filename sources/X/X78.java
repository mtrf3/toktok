package X;

import android.content.Context;
import android.os.Parcel;
import android.os.StrictMode;
import com.facebook.soloader.SysUtil;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;
import java.util.HashMap;

/* loaded from: classes16.dex */
public abstract class X78 extends C39631Fgx {
    public final Context LIZLLL;
    public String LJ;
    public C64333PMr LJFF;
    public final java.util.Map<String, Object> LJI;

    public abstract X74 LJIIJ();

    public byte[] LJI() {
        Parcel obtain = Parcel.obtain();
        X74 LJIIJ = LJIIJ();
        try {
            X73[] x73Arr = LJIIJ.LIZ().LIZ;
            obtain.writeByte((byte) 1);
            obtain.writeInt(x73Arr.length);
            for (int i = 0; i < x73Arr.length; i++) {
                obtain.writeString(x73Arr[i].LJLIL);
                obtain.writeString(x73Arr[i].LJLILLLLZI);
            }
            LJIIJ.close();
            byte[] marshall = obtain.marshall();
            obtain.recycle();
            return marshall;
        } catch (Throwable th) {
            if (LJIIJ != null) {
                try {
                    LJIIJ.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // X.AbstractC39635Fh1
    public final void LIZIZ(int i) {
        File file = this.LIZ;
        if (file.mkdirs() || file.isDirectory()) {
            C64333PMr LJIIIIZZ = LJIIIIZZ(new File(this.LIZ, "dso_lock"), true);
            if (this.LJFF == null) {
                this.LJFF = LJIIIIZZ(new File(this.LIZ, "dso_instance_lock"), false);
            }
            boolean canWrite = this.LIZ.canWrite();
            if (!canWrite) {
                try {
                    this.LIZ.setWritable(true);
                } finally {
                    if (!canWrite) {
                        this.LIZ.setWritable(false);
                    }
                    if (LJIIIIZZ != null) {
                        LJIIIIZZ.close();
                    }
                }
            }
            if (LJIIJJI(LJIIIIZZ, i, LJI())) {
                LJIIIIZZ = null;
            }
            if (LJIIIIZZ != null) {
                return;
            } else {
                return;
            }
        }
        throw new IOException(C0F0.LIZJ("cannot mkdir: ", file));
    }

    public final void LIZLLL(X73[] x73Arr) {
        String[] list = this.LIZ.list();
        if (list != null) {
            for (String str : list) {
                if (!str.equals("dso_state") && !str.equals("dso_lock") && !str.equals("dso_instance_lock") && !str.equals("dso_deps") && !str.equals("dso_manifest")) {
                    int i = 0;
                    while (true) {
                        if (i < x73Arr.length) {
                            if (x73Arr[i].LJLIL.equals(str)) {
                                break;
                            }
                            i++;
                            if (0 == 0) {
                            }
                        } else {
                            SysUtil.LIZ(new File(this.LIZ, str));
                            break;
                        }
                    }
                }
            }
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("unable to list directory ");
        LIZ.append(this.LIZ);
        throw new IOException(X1D.LIZIZ(LIZ));
    }

    public final Object LJII(String str) {
        Object obj;
        synchronized (this.LJI) {
            obj = ((HashMap) this.LJI).get(str);
            if (obj == null) {
                obj = new Object();
                ((HashMap) this.LJI).put(str, obj);
            }
        }
        return obj;
    }

    public X78(Context context, String str) {
        super(LJIIIZ(context, str), 1);
        this.LJI = new HashMap();
        this.LIZLLL = context;
    }

    public static File LJIIIZ(Context context, String str) {
        StringBuilder LIZ = X1D.LIZ();
        return new File(C025908h.LIZIZ(LIZ, context.getApplicationInfo().dataDir, "/", str, LIZ));
    }

    public static void LJIILIIL(File file, byte b) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            try {
                randomAccessFile.seek(0L);
                randomAccessFile.write(b);
                randomAccessFile.setLength(randomAccessFile.getFilePointer());
                randomAccessFile.getFD().sync();
                randomAccessFile.close();
            } finally {
            }
        } catch (SyncFailedException unused) {
        }
    }

    public final void LJ(InterfaceC84307X6x interfaceC84307X6x, byte[] bArr) {
        try {
            if (this.LIZ.setWritable(true)) {
                LJFF(interfaceC84307X6x, bArr);
                return;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("cannot make directory writable for us: ");
            LIZ.append(this.LIZ);
            throw new IOException(X1D.LIZIZ(LIZ));
        } finally {
            this.LIZ.setWritable(false);
        }
    }

    public final void LJFF(InterfaceC84307X6x interfaceC84307X6x, byte[] bArr) {
        RandomAccessFile randomAccessFile;
        int read;
        File file = new File(this.LIZ, ((X72) interfaceC84307X6x).LJLIL.LJLIL);
        RandomAccessFile randomAccessFile2 = null;
        try {
            try {
                if (file.exists()) {
                    file.setWritable(true);
                }
                try {
                    randomAccessFile = new RandomAccessFile(file, "rw");
                } catch (IOException unused) {
                    SysUtil.LIZ(file);
                    randomAccessFile = new RandomAccessFile(file, "rw");
                }
                randomAccessFile2 = randomAccessFile;
                int available = ((X72) interfaceC84307X6x).LJLILLLLZI.available();
                if (available > 1) {
                    SysUtil.LollipopSysdeps.fallocateIfSupported(randomAccessFile.getFD(), available);
                }
                InputStream inputStream = ((X72) interfaceC84307X6x).LJLILLLLZI;
                int i = 0;
                while (i < Integer.MAX_VALUE && (read = inputStream.read(bArr, 0, Math.min(bArr.length, Integer.MAX_VALUE - i))) != -1) {
                    randomAccessFile2.write(bArr, 0, read);
                    i += read;
                }
                randomAccessFile2.setLength(randomAccessFile2.getFilePointer());
                if (file.setExecutable(true, false)) {
                    file.setWritable(false);
                    randomAccessFile2.close();
                } else {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("cannot make file executable: ");
                    LIZ.append(file);
                    throw new IOException(X1D.LIZIZ(LIZ));
                }
            } catch (IOException e) {
                SysUtil.LIZ(file);
                throw e;
            }
        } catch (Throwable th) {
            file.setWritable(false);
            if (randomAccessFile2 != null) {
                randomAccessFile2.close();
            }
            throw th;
        }
    }

    public final C64333PMr LJIIIIZZ(File file, boolean z) {
        C64333PMr c64333PMr;
        File file2 = this.LIZ;
        C64333PMr c64333PMr2 = null;
        try {
            if (z) {
                return new C64333PMr(file, false);
            }
            C64333PMr c64333PMr3 = new C64333PMr(file, true);
            if (c64333PMr3.LJLILLLLZI == null) {
                c64333PMr3.close();
            } else {
                c64333PMr2 = c64333PMr3;
            }
            return c64333PMr2;
        } catch (FileNotFoundException e) {
            try {
                if (file2.setWritable(true)) {
                    if (z) {
                        c64333PMr = new C64333PMr(file, false);
                    } else {
                        C64333PMr c64333PMr4 = new C64333PMr(file, true);
                        if (c64333PMr4.LJLILLLLZI == null) {
                            c64333PMr4.close();
                        } else {
                            c64333PMr2 = c64333PMr4;
                        }
                        c64333PMr = c64333PMr2;
                    }
                    file2.setWritable(false);
                    return c64333PMr;
                }
                throw e;
            } catch (Throwable th) {
                file2.setWritable(false);
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // X.C39631Fgx, X.AbstractC39635Fh1
    public final int LIZ(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        int LIZJ;
        synchronized (LJII(str)) {
            LIZJ = LIZJ(str, i, threadPolicy);
        }
        return LIZJ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0022, code lost:
    
        if (r5 != 1) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIIJJI(X.C64333PMr r15, int r16, byte[] r17) {
        /*
            r14 = this;
            java.io.File r11 = new java.io.File
            r7 = r14
            java.io.File r1 = r7.LIZ
            java.lang.String r0 = "dso_state"
            r11.<init>(r1, r0)
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile
            java.lang.String r2 = "rw"
            r0.<init>(r11, r2)
            r3 = 1
            r6 = 0
            byte r5 = r0.readByte()     // Catch: java.lang.Throwable -> L18 java.io.EOFException -> L24
            goto L22
        L18:
            r1 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L1d
            goto L21
        L1d:
            r0 = move-exception
            r1.addSuppressed(r0)
        L21:
            throw r1
        L22:
            if (r5 == r3) goto L25
        L24:
            r5 = 0
        L25:
            r0.close()
            java.io.File r8 = new java.io.File
            java.io.File r1 = r7.LIZ
            java.lang.String r0 = "dso_deps"
            r8.<init>(r1, r0)
            java.io.RandomAccessFile r4 = new java.io.RandomAccessFile
            r4.<init>(r8, r2)
            long r0 = r4.length()     // Catch: java.lang.Throwable -> Lae
            int r2 = (int) r0     // Catch: java.lang.Throwable -> Lae
            byte[] r1 = new byte[r2]     // Catch: java.lang.Throwable -> Lae
            int r0 = r4.read(r1)     // Catch: java.lang.Throwable -> Lae
            if (r0 == r2) goto L44
            r5 = 0
        L44:
            r9 = r17
            boolean r0 = java.util.Arrays.equals(r1, r9)     // Catch: java.lang.Throwable -> Lae
            r0 = r0 ^ 1
            if (r0 == 0) goto L50
            r5 = 0
            goto L56
        L50:
            if (r5 == 0) goto L56
            r0 = r16 & 2
            if (r0 == 0) goto L6c
        L56:
            LJIILIIL(r11, r6)     // Catch: java.lang.Throwable -> Lae
            X.X74 r2 = r7.LJIIJ()     // Catch: java.lang.Throwable -> Lae
            X.X7A r10 = r2.LIZ()     // Catch: java.lang.Throwable -> La2
            X.X71 r0 = r2.LIZIZ()     // Catch: java.lang.Throwable -> La2
            r7.LJIIL(r5, r10, r0)     // Catch: java.lang.Throwable -> La0
            r2.close()     // Catch: java.lang.Throwable -> Lae
            goto L6d
        L6c:
            r10 = 0
        L6d:
            r4.close()
            if (r10 != 0) goto L73
            return r6
        L73:
            java.lang.Boolean r13 = java.lang.Boolean.FALSE
            X.X79 r6 = new X.X79
            r12 = r15
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r0 = r16 & 1
            if (r0 == 0) goto L9c
            com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread r2 = new com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "SoSync:"
            r1.<init>(r0)
            java.io.File r0 = r7.LIZ
            java.lang.String r0 = r0.getName()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r2.<init>(r6, r0)
            r2.start()
        L9b:
            return r3
        L9c:
            r6.run()
            goto L9b
        La0:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> La2
        La2:
            r1 = move-exception
            if (r2 == 0) goto Lad
            r2.close()     // Catch: java.lang.Throwable -> La9
            goto Lad
        La9:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch: java.lang.Throwable -> Lae
        Lad:
            throw r1     // Catch: java.lang.Throwable -> Lae
        Lae:
            r1 = move-exception
            r4.close()     // Catch: java.lang.Throwable -> Lb3
            goto Lb7
        Lb3:
            r0 = move-exception
            r1.addSuppressed(r0)
        Lb7:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.X78.LJIIJJI(X.PMr, int, byte[]):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0033 A[Catch: all -> 0x008f, TRY_LEAVE, TryCatch #4 {all -> 0x008f, blocks: (B:56:0x0013, B:6:0x001c, B:7:0x0023, B:8:0x002d, B:10:0x0033, B:25:0x007b, B:37:0x008a, B:44:0x0087, B:41:0x0082, B:12:0x0039, B:14:0x003e, B:16:0x004c, B:29:0x005d, B:21:0x0063, B:23:0x0074), top: B:55:0x0013, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001c A[Catch: all -> 0x008f, TRY_ENTER, TryCatch #4 {all -> 0x008f, blocks: (B:56:0x0013, B:6:0x001c, B:7:0x0023, B:8:0x002d, B:10:0x0033, B:25:0x007b, B:37:0x008a, B:44:0x0087, B:41:0x0082, B:12:0x0039, B:14:0x003e, B:16:0x004c, B:29:0x005d, B:21:0x0063, B:23:0x0074), top: B:55:0x0013, inners: #1, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIL(byte r11, X.X7A r12, X.X71 r13) {
        /*
            r10 = this;
            java.io.File r2 = new java.io.File
            java.io.File r1 = r10.LIZ
            java.lang.String r0 = "dso_manifest"
            r2.<init>(r1, r0)
            java.io.RandomAccessFile r3 = new java.io.RandomAccessFile
            java.lang.String r0 = "rw"
            r3.<init>(r2, r0)
            r5 = 1
            if (r11 != r5) goto L18
            X.X7A r6 = X.X7A.LIZ(r3)     // Catch: java.lang.Exception -> L18 java.lang.Throwable -> L8f
            goto L19
        L18:
            r6 = 0
        L19:
            r0 = 0
            if (r6 != 0) goto L23
            X.X7A r6 = new X.X7A     // Catch: java.lang.Throwable -> L8f
            X.X73[] r0 = new X.X73[r0]     // Catch: java.lang.Throwable -> L8f
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L8f
        L23:
            X.X73[] r0 = r12.LIZ     // Catch: java.lang.Throwable -> L8f
            r10.LIZLLL(r0)     // Catch: java.lang.Throwable -> L8f
            r0 = 32768(0x8000, float:4.5918E-41)
            byte[] r7 = new byte[r0]     // Catch: java.lang.Throwable -> L8f
        L2d:
            boolean r0 = r13.LIZ()     // Catch: java.lang.Throwable -> L8f
            if (r0 == 0) goto L8b
            X.X72 r4 = r13.LIZIZ()     // Catch: java.lang.Throwable -> L8f
            r9 = 1
            r2 = 0
        L39:
            X.X73[] r8 = r6.LIZ     // Catch: java.lang.Throwable -> L7f
            int r0 = r8.length     // Catch: java.lang.Throwable -> L7f
            if (r2 >= r0) goto L63
            X.X73 r0 = r4.LJLIL     // Catch: java.lang.Throwable -> L7f
            java.lang.String r1 = r0.LJLIL     // Catch: java.lang.Throwable -> L7f
            r0 = r8[r2]     // Catch: java.lang.Throwable -> L7f
            java.lang.String r0 = r0.LJLIL     // Catch: java.lang.Throwable -> L7f
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L7f
            if (r0 == 0) goto L5d
            X.X73[] r0 = r6.LIZ     // Catch: java.lang.Throwable -> L7f
            r0 = r0[r2]     // Catch: java.lang.Throwable -> L7f
            java.lang.String r1 = r0.LJLILLLLZI     // Catch: java.lang.Throwable -> L7f
            X.X73 r0 = r4.LJLIL     // Catch: java.lang.Throwable -> L7f
            java.lang.String r0 = r0.LJLILLLLZI     // Catch: java.lang.Throwable -> L7f
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> L7f
            if (r0 == 0) goto L5d
            goto L62
        L5d:
            int r2 = r2 + 1
            if (r5 == 0) goto L63
            goto L39
        L62:
            r9 = 0
        L63:
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L7f
            java.io.File r1 = r10.LIZ     // Catch: java.lang.Throwable -> L7f
            X.X73 r0 = r4.LJLIL     // Catch: java.lang.Throwable -> L7f
            java.lang.String r0 = r0.LJLIL     // Catch: java.lang.Throwable -> L7f
            r2.<init>(r1, r0)     // Catch: java.lang.Throwable -> L7f
            boolean r0 = r2.exists()     // Catch: java.lang.Throwable -> L7f
            if (r0 != 0) goto L78
        L74:
            r10.LJ(r4, r7)     // Catch: java.lang.Throwable -> L7f
            goto L7b
        L78:
            if (r9 == 0) goto L7b
            goto L74
        L7b:
            r4.close()     // Catch: java.lang.Throwable -> L8f
            goto L2d
        L7f:
            r1 = move-exception
            if (r4 == 0) goto L8a
            r4.close()     // Catch: java.lang.Throwable -> L86
            goto L8a
        L86:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch: java.lang.Throwable -> L8f
        L8a:
            throw r1     // Catch: java.lang.Throwable -> L8f
        L8b:
            r3.close()
            return
        L8f:
            r1 = move-exception
            r3.close()     // Catch: java.lang.Throwable -> L94
            goto L98
        L94:
            r0 = move-exception
            r1.addSuppressed(r0)
        L98:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.X78.LJIIL(byte, X.X7A, X.X71):void");
    }
}
