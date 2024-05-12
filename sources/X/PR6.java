package X;

import Y.ARunnableS45S0100000_9;
import Y.IDHandlerS23S0100000_11;
import android.os.Debug;
import android.os.Handler;
import android.os.Process;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes12.dex */
public final class PR6 {
    public static int LJIILIIL;
    public final Handler LIZ;
    public final InterfaceC46627IRr LIZIZ;
    public float LIZJ;
    public long LIZLLL;
    public float LJ;
    public long LJI;
    public final long LJIIJ;
    public final ARunnableS45S0100000_9 LJIIJJI;
    public final ARunnableS45S0100000_9 LJIIL;
    public boolean LJFF = true;
    public String LJII = "";
    public String LJIIIIZZ = "";
    public final C35940E8q LJIIIZ = new C35940E8q(true, null, 14);

    public static long LIZ() {
        String lowerCase;
        int i;
        boolean z;
        BufferedReader bufferedReader = null;
        try {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("/proc/");
            LIZ.append(Process.myPid());
            LIZ.append("/status");
            FileInputStream fileInputStream = new FileInputStream(X1D.LIZIZ(LIZ));
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(fileInputStream));
                do {
                    try {
                        String it = bufferedReader2.readLine();
                        o.LJIIIIZZ(it, "it");
                        Locale locale = Locale.getDefault();
                        o.LJIIIIZZ(locale, "getDefault()");
                        lowerCase = it.toLowerCase(locale);
                        o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    } catch (Throwable unused) {
                        bufferedReader = bufferedReader2;
                        try {
                            fileInputStream.close();
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                        } catch (IOException e) {
                            C16880lQ.LLLLIIL(e);
                        }
                        return -1L;
                    }
                } while (!ujb.o.LJJJLIIL(lowerCase, "vmsize:", false));
                String substring = lowerCase.substring(7, s.LJJLIIIJL(lowerCase, "kb", 0, false, 6));
                o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                int length = substring.length() - 1;
                int i2 = 0;
                boolean z2 = false;
                while (i2 <= length) {
                    if (!z2) {
                        i = i2;
                    } else {
                        i = length;
                    }
                    if (o.LJIIJJI(substring.charAt(i), 32) <= 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z2) {
                        if (!z) {
                            z2 = true;
                        } else {
                            i2++;
                        }
                    } else {
                        if (!z) {
                            break;
                        }
                        length--;
                    }
                }
                long parseLong = Long.parseLong(substring.subSequence(i2, length + 1).toString()) * 1024;
                try {
                    fileInputStream.close();
                    bufferedReader2.close();
                    return parseLong;
                } catch (IOException e2) {
                    C16880lQ.LLLLIIL(e2);
                    return parseLong;
                }
            } catch (Throwable unused2) {
            }
        } catch (Throwable unused3) {
        }
    }

    public final void LIZIZ() {
        double d;
        double d2;
        PR8 pr8 = new PR8(this.LJII, this.LJIIIIZZ);
        System.currentTimeMillis();
        if (((Boolean) C53021KrR.LIZ.getValue()).booleanValue()) {
            this.LJIIIZ.LIZ();
            double d3 = 1000;
            pr8.LJIIL = O6R.LJJIJ(this.LJIIIZ.LJFF.LIZIZ * d3) / d3;
            pr8.LJIIJJI = O6R.LJJIJ(this.LJIIIZ.LJFF.LIZ * d3) / d3;
        } else {
            ((C46625IRp) this.LIZIZ).LIZJ.LJI();
            C46620IRk c46620IRk = ((C46625IRp) this.LIZIZ).LIZJ;
            boolean z = ((C46625IRp) ((InterfaceC46627IRr) c46620IRk.LJLILLLLZI)).LJ.LIZ;
            double d4 = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
            if (z) {
                d = c46620IRk.LJLLI.LJI;
            } else {
                d = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
            }
            double d5 = 1000;
            pr8.LJIIL = O6R.LJJIJ(d * d5) / d5;
            C46620IRk c46620IRk2 = ((C46625IRp) this.LIZIZ).LIZJ;
            if (((C46625IRp) ((InterfaceC46627IRr) c46620IRk2.LJLILLLLZI)).LJ.LIZ) {
                d4 = c46620IRk2.LJLLI.LJFF;
            }
            pr8.LJIIJJI = O6R.LJJIJ(d4 * d5) / d5;
        }
        System.currentTimeMillis();
        try {
            float f = this.LJ;
            if (f >= 200.0f) {
                long j = this.LIZLLL;
                if (j > 0) {
                    pr8.LIZJ = f / ((float) j);
                }
            }
            C46628IRs c46628IRs = ((C46625IRp) this.LIZIZ).LIZ;
            c46628IRs.LJI();
            pr8.LJIIIIZZ = c46628IRs.LJLJL;
            pr8.LJIIIZ = ((C46625IRp) this.LIZIZ).LIZJ();
        } catch (Exception unused) {
        }
        int i = 1;
        int i2 = LJIILIIL + 1;
        LJIILIIL = i2;
        pr8.LIZLLL = i2;
        pr8.LJ = C40010Fn4.LIZJ().LJ();
        if (C64433PQn.LIZ().LIZLLL) {
            i = 2;
        }
        pr8.LJFF = i;
        pr8.LJI = this.LIZJ;
        pr8.LJII = C64433PQn.LIZ().LIZJ;
        try {
            pr8.LJIILIIL = LIZ();
            pr8.LJIILJJIL = Debug.getNativeHeapSize();
            pr8.LJIILL = Debug.getNativeHeapAllocatedSize();
            pr8.LJIILLIIL = Debug.getNativeHeapFreeSize();
            long freeMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
            pr8.LJIJ = Runtime.getRuntime().maxMemory() - freeMemory;
            pr8.LJIIZILJ = freeMemory;
            if (freeMemory <= 0) {
                d2 = -1.0d;
            } else {
                d2 = new BigDecimal(freeMemory).divide(new BigDecimal(Runtime.getRuntime().maxMemory()), 4, 4).doubleValue();
            }
            pr8.LJIJI = d2;
            pr8.LJIJJ = Debug.getPss();
            if (((Boolean) C53019KrP.LIZ.getValue()).booleanValue()) {
                pr8.LJIJJLI = C39687Fhr.LJI(EF7.LIZIZ());
            }
        } catch (Throwable unused2) {
        }
        this.LIZJ = pr8.LJII;
        ArrayList arrayList = (ArrayList) PR7.LIZ;
        arrayList.add(pr8);
        if (arrayList.size() > 10) {
            PR7.LIZ();
        }
        this.LIZLLL = 0L;
        this.LJ = 0.0f;
    }

    public PR6(IDHandlerS23S0100000_11 iDHandlerS23S0100000_11, C46625IRp c46625IRp, long j, long j2) {
        long j3;
        this.LIZ = iDHandlerS23S0100000_11;
        this.LIZIZ = c46625IRp;
        if (((Boolean) C53023KrT.LIZ.getValue()).booleanValue()) {
            j3 = 6000;
        } else {
            j3 = 3000;
        }
        this.LJIIJ = j3;
        this.LJIIJJI = new ARunnableS45S0100000_9(this, 170);
        this.LJIIL = new ARunnableS45S0100000_9(this, 169);
    }
}
