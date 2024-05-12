package X;

import Y.ARunnableS12S0101000_8;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.ttvideoengine.utils.EngineThreadPool;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.IrQ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47924IrQ {
    public static boolean LJI;
    public static boolean LJII;
    public static InterfaceC47925IrR LJIIIIZZ;
    public final ConcurrentHashMap<String, Object> LIZ = new ConcurrentHashMap<>();
    public CopyOnWriteArrayList<C47923IrP> LIZIZ = null;
    public CopyOnWriteArrayList<C47923IrP> LIZJ = null;
    public CopyOnWriteArrayList<Integer> LIZLLL = null;
    public C47923IrP LJ = null;
    public int LJFF = 0;

    public final void LJ() {
        CopyOnWriteArrayList<C47923IrP> copyOnWriteArrayList = this.LIZJ;
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() == 0) {
            return;
        }
        if (this.LIZJ.size() > 0 && this.LIZJ.get(0).LJ == -1) {
            return;
        }
        EngineThreadPool.addExecuteTask(new ARunnableS12S0101000_8(4, this, 4));
    }

    public static long LIZJ(String str) {
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

    public static String LIZLLL(String str) {
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

    public final void LIZ(C47923IrP c47923IrP) {
        if (LJII && LJIIIIZZ != null) {
            LIZIZ(null, c47923IrP);
        } else {
            LIZIZ(LIZLLL("/proc/self/stat"), c47923IrP);
        }
        float f = c47923IrP.LJII;
        if (f > 0.0f) {
            this.LIZ.put("proc", Float.valueOf(f));
        }
    }

    public final void LJFF(C47923IrP c47923IrP) {
        Object obj;
        String lowerCase;
        String substring;
        if (c47923IrP == null) {
            return;
        }
        C47923IrP c47923IrP2 = this.LJ;
        if (c47923IrP2 != null && !LJI) {
            LIZ(c47923IrP2);
        }
        int i = c47923IrP.LJIIIIZZ;
        if (i == 1) {
            String str = c47923IrP.LIZIZ;
            if (str != null) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("/proc/self/task/");
                LIZ.append(str);
                LIZ.append("/stat");
                LIZIZ(LIZLLL(X1D.LIZIZ(LIZ)), c47923IrP);
            }
        } else if (i == 2 && c47923IrP.LIZJ != null) {
            c47923IrP.LJ = 0L;
            if (c47923IrP.LJFF == 0) {
                c47923IrP.LJFF = System.currentTimeMillis();
            }
            HashSet<String> hashSet = c47923IrP.LIZJ;
            this.LJFF = 0;
            Iterator<String> it = hashSet.iterator();
            while (it.hasNext()) {
                String next = it.next();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("/proc/self/task/");
                LIZ2.append(next);
                LIZ2.append("/stat");
                String LIZLLL = LIZLLL(X1D.LIZIZ(LIZ2));
                if (LIZLLL == null || LIZLLL.isEmpty()) {
                    it.remove();
                } else {
                    long LIZJ = LIZJ(LIZLLL);
                    if (LIZJ != -1) {
                        HashMap<String, Object> hashMap = c47923IrP.LIZLLL;
                        if (hashMap != null) {
                            if (hashMap.containsKey(next) && (obj = c47923IrP.LIZLLL.get(next)) != null && LIZJ - ((Long) obj).longValue() > 0) {
                                this.LJFF++;
                            }
                            c47923IrP.LIZLLL.put(next, Long.valueOf(LIZJ));
                        }
                        c47923IrP.LJ += LIZJ;
                    }
                }
            }
            long j = c47923IrP.LJI;
            if (j == 0) {
                c47923IrP.LJI = c47923IrP.LJ;
            } else {
                c47923IrP.LJII = ((float) (c47923IrP.LJ - j)) / ((float) (System.currentTimeMillis() - c47923IrP.LJFF));
            }
        }
        String str2 = c47923IrP.LIZ;
        if (str2 == null) {
            return;
        }
        if (str2.contains("-")) {
            int indexOf = c47923IrP.LIZ.indexOf("-");
            if (indexOf <= 0 || (substring = c47923IrP.LIZ.substring(0, indexOf)) == null) {
                return;
            } else {
                lowerCase = substring.toLowerCase(Locale.ROOT);
            }
        } else {
            lowerCase = c47923IrP.LIZ.toLowerCase(Locale.ROOT);
        }
        if (lowerCase == null) {
            return;
        }
        if (LJI) {
            float f = c47923IrP.LJII;
            if (f == -1.0f) {
                return;
            }
            this.LIZ.put(lowerCase, Float.valueOf(f));
            return;
        }
        this.LIZ.put(lowerCase, Float.valueOf(c47923IrP.LJII));
    }

    public final void LJI(String[] strArr) {
        HashSet<String> hashSet;
        for (int i = 1; i < this.LIZIZ.size() + 1; i++) {
            if (strArr.length == 2 && strArr[1].startsWith(this.LIZIZ.get(i).LIZ)) {
                if (this.LIZIZ.get(i).LJIIIIZZ == 2) {
                    if (this.LIZIZ.get(i).LIZJ == null) {
                        this.LIZIZ.get(i).LIZJ = new HashSet<>();
                    }
                    if (this.LIZIZ.get(i).LIZLLL == null) {
                        this.LIZIZ.get(i).LIZLLL = new HashMap<>();
                    }
                    if (this.LIZIZ.get(i).LIZJ != null && (hashSet = this.LIZIZ.get(i).LIZJ) != null && !hashSet.contains(strArr[0])) {
                        hashSet.add(strArr[0]);
                        return;
                    }
                    return;
                }
                C47923IrP c47923IrP = this.LIZIZ.get(i);
                c47923IrP.LJFF = 0L;
                c47923IrP.LJI = 0L;
                c47923IrP.LJII = -1.0f;
                c47923IrP.LJ = 0L;
                c47923IrP.LIZIZ = strArr[0];
                c47923IrP.LJFF = System.currentTimeMillis();
                return;
            }
        }
    }

    public static void LIZIZ(String str, C47923IrP c47923IrP) {
        InterfaceC47925IrR interfaceC47925IrR;
        if (c47923IrP == null) {
            c47923IrP = new C47923IrP();
        }
        if (LJII && (interfaceC47925IrR = LJIIIIZZ) != null) {
            try {
                CastIntegerProtector.parseInt(c47923IrP.LIZIZ);
                c47923IrP.LJII = interfaceC47925IrR.LIZIZ();
                return;
            } catch (Exception unused) {
                return;
            }
        }
        long LIZJ = LIZJ(str);
        long currentTimeMillis = System.currentTimeMillis();
        long j = c47923IrP.LJFF;
        if (j != 0) {
            if (LIZJ == -1) {
                c47923IrP.LJII = -1.0f;
            } else {
                c47923IrP.LJII = ((float) (LIZJ - c47923IrP.LJ)) / ((float) (currentTimeMillis - j));
            }
        } else {
            c47923IrP.LJII = -1.0f;
        }
        c47923IrP.LJ = LIZJ;
        c47923IrP.LJFF = currentTimeMillis;
    }
}
