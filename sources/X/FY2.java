package X;

import android.os.SystemClock;
import com.bytedance.sliver.Sliver;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public class FY2 implements Runnable {
    public volatile boolean LJLIL = true;
    public FY3 LJLILLLLZI;
    public FY3 LJLJI;
    public FY7 LJLJJI;
    public Long LJLJJL;
    public final /* synthetic */ FY1 LJLJJLL;

    /* JADX WARN: Removed duplicated region for block: B:29:0x0079 A[Catch: all -> 0x00ca, TryCatch #0 {all -> 0x00ca, blocks: (B:2:0x0000, B:4:0x000e, B:6:0x001a, B:11:0x001f, B:13:0x0023, B:15:0x002a, B:17:0x0036, B:18:0x004c, B:20:0x0051, B:21:0x005a, B:23:0x0061, B:27:0x006e, B:29:0x0079, B:30:0x0080, B:31:0x0066, B:33:0x006c, B:34:0x0084, B:36:0x00a0, B:37:0x00a4, B:39:0x00aa, B:41:0x00ae, B:43:0x00b5, B:45:0x00bb, B:47:0x00bf, B:48:0x00c1, B:50:0x003b), top: B:1:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            Method dump skipped, instructions count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FY2.LIZ():void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public FY2(FY1 fy1) {
        this.LJLJJLL = fy1;
    }

    public final void LIZIZ(FY3 fy3) {
        int i;
        this.LJLJJLL.LJLJL = SystemClock.uptimeMillis();
        try {
            FY5 fy5 = new FY5();
            o.LJI(fy3);
            for (FY7 fy7 : fy3.LIZIZ) {
                Iterator<long[]> it = fy7.LIZ.iterator();
                while (it.hasNext()) {
                    long[] next = it.next();
                    if (next != null && next.length != 0) {
                        int length = next.length;
                        while (true) {
                            length--;
                            if (length >= 0) {
                                long j = next[length];
                                Integer num = fy5.LIZ.get(Long.valueOf(j));
                                if (num != null) {
                                    i = num.intValue();
                                } else {
                                    fy5.LIZ.put(Long.valueOf(j), Integer.valueOf(fy5.LIZIZ));
                                    i = fy5.LIZIZ;
                                    fy5.LIZIZ = i + 1;
                                }
                                next[length] = i;
                            }
                        }
                    }
                }
            }
            java.util.Set<Long> keySet = fy5.LIZ.keySet();
            String method = "";
            if (!keySet.isEmpty()) {
                long[] jArr = new long[keySet.size()];
                Iterator<Long> it2 = keySet.iterator();
                int i2 = 0;
                while (it2.hasNext()) {
                    jArr[i2] = it2.next().longValue();
                    i2++;
                }
                try {
                    method = Sliver.getStackTrace(jArr);
                } catch (Throwable unused) {
                }
            }
            o.LJIIIIZZ(method, "method");
            C87577YYr.LIZ(fy3, method, FYL.LIZ.invoke().longValue());
            for (FY7 fy72 : fy3.LIZIZ) {
                if (fy72 != null) {
                    fy72.LIZ();
                }
            }
            fy3.LIZJ = 0;
            fy3.LIZ = false;
        } catch (Throwable th) {
            o.LJI(fy3);
            for (FY7 fy73 : fy3.LIZIZ) {
                if (fy73 != null) {
                    fy73.LIZ();
                }
            }
            fy3.LIZJ = 0;
            fy3.LIZ = false;
            throw th;
        }
    }
}
