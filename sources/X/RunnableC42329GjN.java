package X;

import defpackage.b0;
import java.util.ArrayList;

/* renamed from: X.GjN, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC42329GjN implements Runnable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ Runnable LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ byte[] LJLJJL;

    public final void LIZ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SceneLargeTransaction write disk begin uuid: ");
        LIZ.append(this.LJLIL);
        H78.LJI(X1D.LIZIZ(LIZ));
        String str = this.LJLJJI;
        String str2 = this.LJLIL;
        byte[] bArr = this.LJLJJL;
        long currentTimeMillis = System.currentTimeMillis();
        C42336GjU c42336GjU = C42331GjP.LIZ;
        c42336GjU.LJFF(str, false);
        c42336GjU.LJI(str2, bArr, true);
        c42336GjU.LJFF(str, true);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        long currentTimeMillis3 = System.currentTimeMillis() - this.LJLILLLLZI;
        Runnable runnable = this.LJLJI;
        if (runnable != null) {
            runnable.run();
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("SceneLargeTransaction write disk finish uuid: ");
        b0.LJ(LIZ2, this.LJLIL, ", execute cost ", currentTimeMillis3);
        C0MT.LIZLLL(LIZ2, " ms, actual execute cost ", currentTimeMillis2, " ms");
        H78.LJI(X1D.LIZIZ(LIZ2));
        C188727au c188727au = new C188727au();
        c188727au.LJ(currentTimeMillis3, "execute_cost");
        c188727au.LJ(currentTimeMillis2, "actual_execute_cost");
        FMX.LJIIL("SceneLargeTransaction", c188727au.LIZ);
        ArrayList arrayList = (ArrayList) C42331GjP.LIZIZ;
        arrayList.remove(this);
        if (arrayList.isEmpty()) {
            C42331GjP.LIZLLL.countDown();
        }
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

    public RunnableC42329GjN(String str, long j, Runnable runnable, String str2, byte[] bArr) {
        this.LJLIL = str;
        this.LJLILLLLZI = j;
        this.LJLJI = runnable;
        this.LJLJJI = str2;
        this.LJLJJL = bArr;
    }
}
