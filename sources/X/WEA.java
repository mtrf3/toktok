package X;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes15.dex */
public final class WEA implements WE2 {
    public static final Class<?> LJIIIIZZ = WEA.class;
    public static final long LJIIIZ = TimeUnit.MINUTES.toMillis(30);
    public final File LIZ;
    public final boolean LIZIZ;
    public final File LIZJ;
    public final File LIZLLL;
    public final File LJ;
    public final File LJFF;
    public final InterfaceC79254V8o LJI;
    public final WEM LJII;

    @Override // X.WE2
    public final void LIZIZ() {
        V1B.LL(this.LIZ, new WED(this));
    }

    @Override // X.WE2
    public final Collection LJFF() {
        WEB web = new WEB(this, EnumC79574VKw.CONFIG_FILE);
        V1B.LL(this.LIZLLL, web);
        return Collections.unmodifiableList(web.LIZ);
    }

    @Override // X.WE2
    public final List<WE9> LJI() {
        WEB web = new WEB(this, EnumC79574VKw.IMAGE_CACHE_FILE);
        V1B.LL(this.LIZJ, web);
        return Collections.unmodifiableList(web.LIZ);
    }

    @Override // X.WE2
    public final Collection LJIIIIZZ() {
        WEF wef = new WEF(this);
        V1B.LL(this.LIZJ, wef);
        return Collections.unmodifiableList(wef.LIZ);
    }

    @Override // X.WE2
    public final void clearAll() {
        V1B.LJJL(this.LIZ);
        V1B.LJJL(this.LJFF);
    }

    @Override // X.WE2
    public final boolean isExternal() {
        return this.LIZIZ;
    }

    public static long LJIIJ(File file) {
        if (!file.exists()) {
            return 0L;
        }
        long length = file.length();
        if (C16880lQ.LLLZZIL(file)) {
            return length;
        }
        return -1L;
    }

    public static java.util.Map LJIIJJI(File file) {
        BufferedReader bufferedReader;
        HashMap hashMap = new HashMap();
        if (!file.exists()) {
            return hashMap;
        }
        BufferedReader bufferedReader2 = null;
        int i = 0;
        bufferedReader2 = null;
        try {
            try {
                try {
                    bufferedReader = new BufferedReader(new FileReader(file));
                    while (true) {
                        try {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                break;
                            }
                            int lastIndexOf = readLine.lastIndexOf("=");
                            hashMap.put(readLine.substring(0, lastIndexOf), readLine.substring(lastIndexOf + 1));
                            i = lastIndexOf;
                        } catch (IOException unused) {
                            bufferedReader2 = bufferedReader;
                            W58.LJIILL(LJIIIIZZ, "fileToMap: file not found");
                            if (bufferedReader2 != null) {
                                bufferedReader2.close();
                                bufferedReader2 = bufferedReader2;
                            }
                            return hashMap;
                        } catch (Throwable th) {
                            th = th;
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (IOException unused2) {
                                }
                            }
                            throw th;
                        }
                    }
                    bufferedReader.close();
                    bufferedReader.close();
                    bufferedReader2 = i;
                } catch (IOException unused3) {
                }
            } catch (IOException unused4) {
            }
            return hashMap;
        } catch (Throwable th2) {
            th = th2;
            bufferedReader = bufferedReader2;
        }
    }

    public static String LJIIZILJ(int i) {
        return C16880lQ.LLLZI(null, "%s.ols%d.%d", new Object[]{"v2", 100, Integer.valueOf(i)});
    }

    @Override // X.WE2
    public final long LIZJ(WE9 we9) {
        return LJIIJ(((WEG) we9).LIZIZ.LIZ);
    }

    @Override // X.WE2
    public final long LJ(String str) {
        String valueOf = String.valueOf(Math.abs(str.hashCode() % 100));
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJ);
        String str2 = File.separator;
        LJIIJ(new File(C0ON.LIZJ(JBR.LJFF(LIZ, str2, valueOf, LIZ), str2, str, ".cnt")));
        return LJIIJ(LJIIL(str));
    }

    public final File LJIIL(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(LJIILIIL(str));
        return new File(C025908h.LIZIZ(LIZ, File.separator, str, ".cnt", LIZ));
    }

    public final String LJIILIIL(String str) {
        String valueOf = String.valueOf(Math.abs(str.hashCode() % 100));
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZLLL);
        return JBR.LJFF(LIZ, File.separator, valueOf, LIZ);
    }

    public final File LJIILJJIL(String str) {
        String LJIILLIIL = LJIILLIIL(str);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(LJIILLIIL);
        return new File(C025908h.LIZIZ(LIZ, File.separator, str, ".cnt", LIZ));
    }

    public final WEE LJIILL(File file) {
        WEE LIZ = WEE.LIZ(file);
        if (LIZ == null || !new File(LJIILLIIL(LIZ.LIZIZ)).equals(file.getParentFile())) {
            return null;
        }
        return LIZ;
    }

    public final String LJIILLIIL(String str) {
        String valueOf = String.valueOf(Math.abs(str.hashCode() % 100));
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZJ);
        return JBR.LJFF(LIZ, File.separator, valueOf, LIZ);
    }

    @Override // X.WE2
    public final long remove(String str) {
        return LJIIJ(LJIILJJIL(str));
    }

    @Override // X.WE2
    public final WEK LIZ(Object obj, String str) {
        File LJIILJJIL = LJIILJJIL(str);
        if (LJIILJJIL.exists()) {
            this.LJII.getClass();
            LJIILJJIL.setLastModified(System.currentTimeMillis());
            return new WEK(LJIILJJIL);
        }
        return null;
    }

    @Override // X.WE2
    public final boolean LIZLLL(Object obj, String str) {
        return LJIILJJIL(str).exists();
    }

    @Override // X.WE2
    public final WEL LJII(Object obj, String str) {
        File file = new File(LJIILLIIL(str));
        if (!file.exists()) {
            try {
                WEC.LIZ(file);
            } catch (WEH e) {
                this.LJI.getClass();
                throw e;
            }
        }
        try {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str);
            LIZ.append(".");
            File createTempFile = File.createTempFile(X1D.LIZIZ(LIZ), ".tmp", file);
            LJIJ(obj, str);
            return new WE1(this, str, createTempFile);
        } catch (IOException e2) {
            this.LJI.getClass();
            throw e2;
        }
    }

    @Override // X.WE2
    public final java.util.Map LJIIIZ(Object obj, String str) {
        String valueOf = String.valueOf(Math.abs(str.hashCode() % 100));
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJ);
        String str2 = File.separator;
        java.util.Map LJIIJJI = LJIIJJI(new File(C0ON.LIZJ(JBR.LJFF(LIZ, str2, valueOf, LIZ), str2, str, ".cnt")));
        ((HashMap) LJIIJJI).putAll(LJIIJJI(LJIIL(str)));
        return LJIIJJI;
    }

    public final void LJIJ(Object obj, String str) {
        java.util.Map<String, String> map;
        if ((obj instanceof W6V) && (map = ((W6V) obj).LIZIZ) != null && !map.isEmpty()) {
            File file = new File(LJIILIIL(str));
            if (!file.exists()) {
                try {
                    WEC.LIZ(file);
                } catch (WEH e) {
                    this.LJI.getClass();
                    throw e;
                }
            }
            File LJIIL = LJIIL(str);
            if (!LJIIL.exists()) {
                LJIIL.createNewFile();
            }
            StringBuilder sb = new StringBuilder();
            FileWriter fileWriter = new FileWriter(LJIIL, false);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                sb.append(key);
                sb.append("=");
                sb.append(value);
                sb.append(System.lineSeparator());
            }
            fileWriter.write(sb.toString());
            fileWriter.close();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:1|(2:2|3)|(16:5|6|7|9|10|11|(2:32|(1:34)(9:35|14|(2:28|29)|16|(4:18|(1:20)|21|22)|24|25|21|22))|13|14|(0)|16|(0)|24|25|21|22)|40|11|(0)|13|14|(0)|16|(0)|24|25|21|22|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00cb, code lost:
    
        r2 = r6.LJI;
        r1 = X.X1D.LIZ();
        r1.append("version directory could not be created: ");
        r1.append(r6.LIZJ);
        X.X1D.LIZIZ(r1);
        r2.getClass();
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0097 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public WEA(java.io.File r7, java.io.File r8, int r9, X.InterfaceC79254V8o r10) {
        /*
            r6 = this;
            r6.<init>()
            r6.LIZ = r7
            r6.LJFF = r8
            java.io.File r0 = X.C16880lQ.LLLLLLLLLL()     // Catch: java.lang.Exception -> L2e
            if (r0 == 0) goto L31
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L2e
            java.lang.String r2 = r7.getCanonicalPath()     // Catch: java.io.IOException -> L1a java.lang.Exception -> L2e
            boolean r0 = r2.contains(r0)     // Catch: java.io.IOException -> L1b java.lang.Exception -> L2e
            goto L32
        L1a:
            r2 = 0
        L1b:
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Exception -> L2e
            java.lang.String r0 = "failed to read folder to check if external: "
            r1.append(r0)     // Catch: java.lang.Exception -> L2e
            r1.append(r2)     // Catch: java.lang.Exception -> L2e
            X.X1D.LIZIZ(r1)     // Catch: java.lang.Exception -> L2e
            r10.getClass()     // Catch: java.lang.Exception -> L2e
            goto L31
        L2e:
            r10.getClass()
        L31:
            r0 = 0
        L32:
            r6.LIZIZ = r0
            java.io.File r5 = new java.io.File
            java.io.File r1 = r6.LIZ
            java.lang.String r0 = LJIIZILJ(r9)
            r5.<init>(r1, r0)
            r6.LIZJ = r5
            java.io.File r3 = new java.io.File
            java.io.File r2 = r6.LIZ
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = LJIIZILJ(r9)
            r1.append(r0)
            java.lang.String r4 = "-config"
            r1.append(r4)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            r3.<init>(r2, r0)
            r6.LJ = r3
            java.io.File r3 = new java.io.File
            java.io.File r2 = r6.LJFF
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = LJIIZILJ(r9)
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            r3.<init>(r2, r0)
            r6.LIZLLL = r3
            r6.LJI = r10
            java.io.File r0 = r6.LIZ
            boolean r0 = r0.exists()
            if (r0 != 0) goto L89
        L83:
            r0 = 1
        L84:
            java.lang.String r3 = "version directory could not be created: "
            if (r0 == 0) goto Laf
            goto L97
        L89:
            boolean r0 = r5.exists()
            if (r0 != 0) goto L95
            java.io.File r0 = r6.LIZ
            X.V1B.LJJLIIIJJIZ(r0)
            goto L83
        L95:
            r0 = 0
            goto L84
        L97:
            X.WEC.LIZ(r5)     // Catch: X.WEH -> L9b
            goto Laf
        L9b:
            X.V8o r2 = r6.LJI
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            r1.append(r3)
            java.io.File r0 = r6.LIZJ
            r1.append(r0)
            X.X1D.LIZIZ(r1)
            r2.getClass()
        Laf:
            java.io.File r0 = r6.LIZ
            boolean r0 = r0.exists()
            if (r0 != 0) goto Lb8
            goto Lc5
        Lb8:
            java.io.File r0 = r6.LIZJ
            boolean r0 = r0.exists()
            if (r0 != 0) goto Ldf
            java.io.File r0 = r6.LIZ
            X.V1B.LJJLIIIJJIZ(r0)
        Lc5:
            java.io.File r0 = r6.LIZJ     // Catch: X.WEH -> Lcb
            X.WEC.LIZ(r0)     // Catch: X.WEH -> Lcb
            goto Ldf
        Lcb:
            X.V8o r2 = r6.LJI
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            r1.append(r3)
            java.io.File r0 = r6.LIZJ
            r1.append(r0)
            X.X1D.LIZIZ(r1)
            r2.getClass()
        Ldf:
            X.WEM r0 = X.WEM.LIZ
            r6.LJII = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WEA.<init>(java.io.File, java.io.File, int, X.V8o):void");
    }
}
