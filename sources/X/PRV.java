package X;

import android.os.Process;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes12.dex */
public abstract class PRV {
    public C64446PRa[] LIZ;
    public C64446PRa LIZIZ;
    public int LIZJ;
    public boolean LIZLLL;
    public boolean LJ;

    public abstract boolean LJI();

    public abstract void LJIILJJIL(String[] strArr);

    public void LIZ() {
        if (!this.LIZLLL || this.LIZ == null) {
            return;
        }
        if (this.LJ) {
            LJIIIZ(false);
            for (int i = 0; i < this.LIZ.length; i++) {
            }
            C35810E3q.LIZJ("All cpu");
        } else {
            C64446PRa LJIIJ = LJIIJ(false);
            int i2 = this.LIZJ + 1;
            this.LIZJ = i2;
            this.LIZJ = i2 % this.LIZ.length;
            if (LJIIJ == null) {
                return;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("cpu = ");
            LIZ.append(LJIIJ.LIZ);
            LIZ.append(" use = ");
            LIZ.append(LJIIJ.LJI);
            C35810E3q.LIZJ(X1D.LIZIZ(LIZ));
        }
        C35810E3q.LJII();
    }

    public final void LJ() {
        if (this.LIZLLL || !LJI()) {
            return;
        }
        LJIIJJI();
        this.LIZLLL = true;
    }

    public final void LJIIJJI() {
        File[] listFiles;
        try {
            C35810E3q.LIZJ("init");
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("/proc/");
            LIZ.append(Process.myPid());
            LIZ.append("/task/");
            File file = new File(X1D.LIZIZ(LIZ));
            if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
                for (File file2 : listFiles) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append(file2.getPath());
                    LIZ2.append("/stat");
                    String LJIIIIZZ = LJIIIIZZ(X1D.LIZIZ(LIZ2));
                    if (!LJIIIIZZ.isEmpty()) {
                        try {
                            String[] strArr = new String[2];
                            char[] charArray = LJIIIIZZ.toCharArray();
                            String str = null;
                            String str2 = null;
                            int i = 0;
                            int i2 = 0;
                            while (true) {
                                if (i >= charArray.length) {
                                    break;
                                }
                                char c = charArray[i];
                                if (c == ' ') {
                                    if (str2 == null) {
                                        str2 = new String(charArray, 0, i);
                                    }
                                } else if (c == '(') {
                                    i2 = i + 1;
                                } else if (c == ')') {
                                    str = new String(charArray, i2, i - i2);
                                    break;
                                }
                                i++;
                            }
                            strArr[0] = str2;
                            strArr[1] = str;
                            LJIILJJIL(strArr);
                        } catch (Throwable unused) {
                        }
                    }
                }
            }
            C35810E3q.LJII();
        } catch (Throwable unused2) {
        }
    }

    public final void LJIIL() {
        if (!this.LIZLLL || this.LIZ == null) {
            return;
        }
        if (this.LJ) {
            LJIIIZ(true);
        } else {
            LJIIJ(true);
        }
    }

    public static long LJII(String str) {
        if (str != null && !str.isEmpty()) {
            char[] charArray = str.toCharArray();
            int i = 0;
            String str2 = null;
            String str3 = null;
            int i2 = 0;
            int i3 = 0;
            boolean z = false;
            while (true) {
                if (i >= charArray.length) {
                    break;
                }
                char c = charArray[i];
                if (c == ' ') {
                    if (i2 == 12) {
                        str3 = new String(charArray, i3, i - i3);
                    } else if (i2 == 13) {
                        str2 = new String(charArray, i3, i - i3);
                        break;
                    }
                    if (z) {
                        i2++;
                        i3 = i + 1;
                    }
                } else if (c == ')') {
                    z = true;
                }
                i++;
            }
            if (str3 != null && str2 != null) {
                try {
                    return (CastIntegerProtector.parseInt(str3) + CastIntegerProtector.parseInt(str2)) * 10;
                } catch (Throwable unused) {
                }
            }
        }
        return -1L;
    }

    public static String LJIIIIZZ(String str) {
        FileInputStream fileInputStream;
        BufferedInputStream bufferedInputStream;
        BufferedInputStream bufferedInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(str);
            try {
                bufferedInputStream = new BufferedInputStream(fileInputStream);
            } catch (Exception unused) {
            } catch (Throwable th) {
                th = th;
                bufferedInputStream = null;
            }
        } catch (Exception unused2) {
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
        }
        try {
            StringBuilder sb = new StringBuilder();
            byte[] bArr = new byte[1024];
            while (true) {
                int read = bufferedInputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                sb.append(new String(bArr, 0, read));
            }
            String sb2 = sb.toString();
            try {
                bufferedInputStream.close();
            } catch (IOException e) {
                C16880lQ.LLLLIIL(e);
            }
            try {
                fileInputStream.close();
            } catch (IOException e2) {
                C16880lQ.LLLLIIL(e2);
            }
            return sb2;
        } catch (Exception unused3) {
            bufferedInputStream2 = bufferedInputStream;
            if (bufferedInputStream2 != null) {
                try {
                    bufferedInputStream2.close();
                } catch (IOException e3) {
                    C16880lQ.LLLLIIL(e3);
                }
            }
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e4) {
                    C16880lQ.LLLLIIL(e4);
                }
            }
            return "";
        } catch (Throwable th3) {
            th = th3;
            bufferedInputStream2 = bufferedInputStream;
            if (bufferedInputStream2 != null) {
                try {
                    bufferedInputStream2.close();
                } catch (IOException e5) {
                    C16880lQ.LLLLIIL(e5);
                }
            }
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                    throw th;
                } catch (IOException e6) {
                    C16880lQ.LLLLIIL(e6);
                    throw th;
                }
            }
            throw th;
        }
    }

    public final void LJIIIZ(boolean z) {
        C35810E3q.LIZJ("cpu refresh");
        for (C64446PRa c64446PRa : this.LIZ) {
            if (c64446PRa != null) {
                C64446PRa c64446PRa2 = this.LIZIZ;
                if (c64446PRa2 != null) {
                    LIZJ(LJIIIIZZ("/proc/self/stat"), c64446PRa2);
                }
                int i = c64446PRa.LJII;
                if (i == 1) {
                    LIZLLL(c64446PRa.LIZIZ, c64446PRa);
                } else if (i == 2 && c64446PRa.LIZJ != null) {
                    c64446PRa.LIZLLL = 0L;
                    if (z) {
                        c64446PRa.LJ = System.currentTimeMillis();
                    }
                    LIZIZ(c64446PRa.LIZJ, c64446PRa);
                    if (z) {
                        c64446PRa.LJFF = c64446PRa.LIZLLL;
                    } else {
                        c64446PRa.LJI = ((float) (c64446PRa.LIZLLL - c64446PRa.LJFF)) / ((float) (System.currentTimeMillis() - c64446PRa.LJ));
                    }
                }
            }
        }
        C35810E3q.LJII();
    }

    public final C64446PRa LJIIJ(boolean z) {
        C35810E3q.LIZJ("cpu refresh");
        C64446PRa c64446PRa = this.LIZ[this.LIZJ];
        if (c64446PRa == null) {
            return null;
        }
        C64446PRa c64446PRa2 = this.LIZIZ;
        if (c64446PRa2 != null) {
            LIZJ(LJIIIIZZ("/proc/self/stat"), c64446PRa2);
        }
        int i = c64446PRa.LJII;
        if (i == 1) {
            LIZLLL(c64446PRa.LIZIZ, c64446PRa);
        } else if (i == 2) {
            if (c64446PRa.LIZJ == null) {
                return c64446PRa;
            }
            c64446PRa.LIZLLL = 0L;
            if (z) {
                c64446PRa.LJ = System.currentTimeMillis();
            }
            LIZIZ(c64446PRa.LIZJ, c64446PRa);
            if (z) {
                c64446PRa.LJFF = c64446PRa.LIZLLL;
            } else {
                c64446PRa.LJI = ((float) (c64446PRa.LIZLLL - c64446PRa.LJFF)) / ((float) (System.currentTimeMillis() - c64446PRa.LJ));
            }
        }
        C35810E3q.LJII();
        return c64446PRa;
    }

    public static void LIZIZ(HashSet hashSet, C64446PRa c64446PRa) {
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("/proc/self/task/");
            LIZ.append(str);
            LIZ.append("/stat");
            String LJIIIIZZ = LJIIIIZZ(X1D.LIZIZ(LIZ));
            if (LJIIIIZZ == null || LJIIIIZZ.isEmpty()) {
                it.remove();
            } else {
                long LJII = LJII(LJIIIIZZ);
                if (LJII != -1) {
                    c64446PRa.LIZLLL += LJII;
                }
            }
        }
    }

    public static void LIZJ(String str, C64446PRa c64446PRa) {
        if (c64446PRa == null) {
            c64446PRa = new C64446PRa();
        }
        long LJII = LJII(str);
        long currentTimeMillis = System.currentTimeMillis();
        long j = c64446PRa.LJ;
        if (j != 0) {
            if (LJII == -1) {
                c64446PRa.LJI = -1.0f;
            } else {
                c64446PRa.LJI = ((float) (LJII - c64446PRa.LIZLLL)) / ((float) (currentTimeMillis - j));
            }
        } else {
            c64446PRa.LJI = -1.0f;
        }
        c64446PRa.LIZLLL = LJII;
        c64446PRa.LJ = currentTimeMillis;
    }

    public static void LIZLLL(String str, C64446PRa c64446PRa) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("/proc/self/task/");
        LIZ.append(str);
        LIZ.append("/stat");
        LIZJ(LJIIIIZZ(X1D.LIZIZ(LIZ)), c64446PRa);
    }

    public final void LJFF(int i, String str) {
        C64446PRa c64446PRa = new C64446PRa();
        c64446PRa.LIZ = str;
        this.LIZ[i] = c64446PRa;
    }

    public final boolean LJIILIIL(int i, String[] strArr) {
        if (!strArr[1].startsWith(this.LIZ[i].LIZ)) {
            return false;
        }
        C64446PRa c64446PRa = this.LIZ[i];
        if (c64446PRa.LIZJ == null) {
            c64446PRa.LIZJ = new HashSet<>();
        }
        this.LIZ[i].LIZJ.add(strArr[0]);
        return true;
    }
}
