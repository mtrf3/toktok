package X;

import Y.ARunnableS47S0100000_11;
import Y.IDHandlerS23S0100000_11;
import android.content.Context;
import android.text.TextUtils;
import java.util.concurrent.TimeUnit;

/* renamed from: X.QQi, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC66976QQi implements Runnable {
    public static final Object LJLJJLL = new Object();
    public final InterfaceC66983QQp LJLIL;
    public int LJLILLLLZI = 10;
    public final Context LJLJI;
    public final IDHandlerS23S0100000_11 LJLJJI;
    public int LJLJJL;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            if (this.LJLJI != null && this.LJLIL != null) {
                synchronized (LJLJJLL) {
                    LIZIZ(this.LJLIL);
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public final void LIZ(String str) {
        try {
            int i = this.LJLJJL + 1;
            this.LJLJJL = i;
            if (i <= 3 && !TextUtils.isEmpty(str)) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("token fail, token = ");
                LIZ.append(str);
                LIZ.append(". retry = ");
                LIZ.append(this.LJLJJL);
                X1D.LIZIZ(LIZ);
                QP5.LIZ().LIZIZ(TimeUnit.SECONDS.toMillis(4L) * this.LJLJJL, new ARunnableS47S0100000_11(this, 98));
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01aa A[Catch: all -> 0x01c2, TryCatch #1 {all -> 0x01c2, blocks: (B:8:0x0011, B:11:0x0019, B:14:0x002f, B:16:0x0035, B:18:0x003b, B:19:0x0052, B:21:0x0088, B:25:0x00c3, B:27:0x00d2, B:29:0x00aa, B:31:0x00ae, B:33:0x00b6, B:35:0x00be, B:36:0x00ef, B:46:0x01a7, B:49:0x01aa, B:57:0x0174, B:60:0x01af), top: B:7:0x0011 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(X.InterfaceC66983QQp r19) {
        /*
            Method dump skipped, instructions count: 467
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC66976QQi.LIZIZ(X.QQp):void");
    }

    public RunnableC66976QQi(Context context, C66980QQm c66980QQm) {
        QP5.LIZ().getClass();
        this.LJLJJI = new IDHandlerS23S0100000_11(this, QP5.LJLJI.getLooper(), 1);
        this.LJLJJL = 0;
        this.LJLJI = context;
        this.LJLIL = c66980QQm;
    }
}
