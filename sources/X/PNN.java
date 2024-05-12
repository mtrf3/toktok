package X;

import android.os.Process;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.AqS119S0300000_15;
import kotlin.jvm.internal.AqS158S0200000_11;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class PNN extends AbstractC85425Xfp {
    public final int LJLJJL = -1;
    public final String LJLJJLL = "/sys/devices/system/cpu/cpu";
    public final String LJLJL = "/cpufreq/stats/time_in_state";
    public final long LJLJLJ = 360;
    public long LJLJLLL;
    public float LJLL;

    public final long LJII() {
        BufferedReader bufferedReader;
        List list;
        int myPid = Process.myPid();
        try {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("/proc/");
            LIZ.append(myPid);
            LIZ.append("/stat");
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(X1D.LIZIZ(LIZ))), 1000);
        } catch (Throwable unused) {
            bufferedReader = null;
        }
        try {
            String load = bufferedReader.readLine();
            bufferedReader.close();
            o.LJFF(load, "load");
            List<String> split = new OJD(" ").split(load, 0);
            if (!split.isEmpty()) {
                ListIterator<String> listIterator = split.listIterator(split.size());
                while (listIterator.hasPrevious()) {
                    if (listIterator.previous().length() != 0) {
                        list = ORZ.LLILLL(split, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            list = C61878OQg.INSTANCE;
            Object[] array = list.toArray(new String[0]);
            if (array != null) {
                String[] strArr = (String[]) array;
                long parseLong = Long.parseLong(strArr[13]) + Long.parseLong(strArr[14]);
                LJIIIZ(bufferedReader);
                return parseLong;
            }
            throw new C37692Eqm("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (Throwable unused2) {
            LJIIIZ(bufferedReader);
            return this.LJLJJL;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a2, code lost:
    
        throw new X.C37692Eqm("null cannot be cast to non-null type kotlin.Array<T>");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Object, java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long LJIIIIZZ() {
        /*
            r11 = this;
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            int r5 = r0.availableProcessors()
            r9 = -1
            r4 = 0
            r3 = 0
        Lc:
            if (r3 >= r5) goto Lab
            X.2mC r6 = new X.2mC
            r6.<init>()
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> La3
            java.io.FileReader r7 = new java.io.FileReader     // Catch: java.lang.Throwable -> La3
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Throwable -> La3
            java.lang.String r0 = r11.LJLJJLL     // Catch: java.lang.Throwable -> La3
            r1.append(r0)     // Catch: java.lang.Throwable -> La3
            r1.append(r3)     // Catch: java.lang.Throwable -> La3
            java.lang.String r0 = r11.LJLJL     // Catch: java.lang.Throwable -> La3
            r1.append(r0)     // Catch: java.lang.Throwable -> La3
            java.lang.String r0 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Throwable -> La3
            r7.<init>(r0)     // Catch: java.lang.Throwable -> La3
            r0 = 50
            r2.<init>(r7, r0)     // Catch: java.lang.Throwable -> La3
            goto L45
        L35:
            X.OQg r1 = X.C61878OQg.INSTANCE     // Catch: java.lang.Throwable -> La4
        L37:
            java.lang.String[] r0 = new java.lang.String[r4]     // Catch: java.lang.Throwable -> La4
            java.lang.Object[] r7 = r1.toArray(r0)     // Catch: java.lang.Throwable -> La4
            if (r7 == 0) goto L9b
            java.lang.String[] r7 = (java.lang.String[]) r7     // Catch: java.lang.Throwable -> La4
            int r1 = r7.length     // Catch: java.lang.Throwable -> La4
            r0 = 2
            if (r1 == r0) goto L93
        L45:
            java.lang.String r1 = r2.readLine()     // Catch: java.lang.Throwable -> La4
            java.lang.String r0 = "it"
            kotlin.jvm.internal.o.LJFF(r1, r0)     // Catch: java.lang.Throwable -> La4
            r6.element = r1     // Catch: java.lang.Throwable -> La4
            int r0 = r1.length()     // Catch: java.lang.Throwable -> La4
            r8 = 1
            if (r0 != 0) goto L58
            goto La4
        L58:
            T r7 = r6.element     // Catch: java.lang.Throwable -> La4
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> La4
            java.lang.String r1 = "\\s+"
            X.OJD r0 = new X.OJD     // Catch: java.lang.Throwable -> La4
            r0.<init>(r1)     // Catch: java.lang.Throwable -> La4
            java.util.List r7 = r0.split(r7, r4)     // Catch: java.lang.Throwable -> La4
            boolean r0 = r7.isEmpty()     // Catch: java.lang.Throwable -> La4
            if (r0 != 0) goto L35
            int r0 = r7.size()     // Catch: java.lang.Throwable -> La4
            java.util.ListIterator r1 = r7.listIterator(r0)     // Catch: java.lang.Throwable -> La4
        L75:
            boolean r0 = r1.hasPrevious()     // Catch: java.lang.Throwable -> La4
            if (r0 == 0) goto L35
            java.lang.Object r0 = r1.previous()     // Catch: java.lang.Throwable -> La4
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> La4
            int r0 = r0.length()     // Catch: java.lang.Throwable -> La4
            if (r0 != 0) goto L88
            goto L75
        L88:
            int r0 = r1.nextIndex()     // Catch: java.lang.Throwable -> La4
            int r0 = r0 + 1
            java.util.List r1 = X.ORZ.LLILLL(r7, r0)     // Catch: java.lang.Throwable -> La4
            goto L37
        L93:
            r0 = r7[r8]     // Catch: java.lang.Throwable -> La4
            long r0 = java.lang.Long.parseLong(r0)     // Catch: java.lang.Throwable -> La4
            long r9 = r9 + r0
            goto L45
        L9b:
            X.Eqm r1 = new X.Eqm     // Catch: java.lang.Throwable -> La4
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<T>"
            r1.<init>(r0)     // Catch: java.lang.Throwable -> La4
            throw r1     // Catch: java.lang.Throwable -> La4
        La3:
            r2 = 0
        La4:
            LJIIIZ(r2)
            int r3 = r3 + 1
            goto Lc
        Lab:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PNN.LJIIIIZZ():long");
    }

    public static void LJIIIZ(BufferedReader bufferedReader) {
        if (bufferedReader != null) {
            try {
                bufferedReader.close();
            } catch (Exception unused) {
            }
        }
    }

    @Override // X.AbstractC37594EpC
    public final void LJI(XBaseParamModel xBaseParamModel, C37356ElM c37356ElM, EnumC37844EtE type) {
        InterfaceC85426Xfq interfaceC85426Xfq = (InterfaceC85426Xfq) xBaseParamModel;
        o.LJIIJ(type, "type");
        AqS119S0300000_15 aqS119S0300000_15 = new AqS119S0300000_15(this, c37356ElM, interfaceC85426Xfq, 1);
        if (o.LJ(interfaceC85426Xfq.getCpuUsage(), Boolean.TRUE)) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.LJLJLLL < this.LJLJLJ) {
                aqS119S0300000_15.invoke(Float.valueOf(this.LJLL));
                return;
            } else {
                this.LJLJLLL = currentTimeMillis;
                C79012Uzg.LJFF(new AqS158S0200000_11(this, aqS119S0300000_15, 9));
                return;
            }
        }
        aqS119S0300000_15.invoke(Float.valueOf(-2.0f));
    }
}
