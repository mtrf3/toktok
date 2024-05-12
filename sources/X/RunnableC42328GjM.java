package X;

import defpackage.b0;
import java.util.ArrayList;

/* renamed from: X.GjM, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC42328GjM implements Runnable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ Runnable LJLJI;
    public final /* synthetic */ byte[] LJLJJI;
    public final /* synthetic */ boolean LJLJJL;

    public final void LIZ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LargeTransaction write disk begin uuid: ");
        LIZ.append(this.LJLIL);
        H78.LJI(X1D.LIZIZ(LIZ));
        String str = this.LJLIL;
        byte[] bArr = this.LJLJJI;
        boolean z = this.LJLJJL;
        long currentTimeMillis = System.currentTimeMillis();
        C42326GjK.LJFF.LJI(str, bArr, z);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        long currentTimeMillis3 = System.currentTimeMillis() - this.LJLILLLLZI;
        Runnable runnable = this.LJLJI;
        if (runnable != null) {
            runnable.run();
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("LargeTransaction write disk finish uuid: ");
        b0.LJ(LIZ2, this.LJLIL, ", execute cost ", currentTimeMillis3);
        C0MT.LIZLLL(LIZ2, " ms, actual execute cost ", currentTimeMillis2, " ms");
        H78.LJI(X1D.LIZIZ(LIZ2));
        C188727au c188727au = new C188727au();
        c188727au.LJ(currentTimeMillis3, "execute_cost");
        c188727au.LJ(currentTimeMillis2, "actual_execute_cost");
        FMX.LJIIL("LargeTransaction", c188727au.LIZ);
        ArrayList arrayList = (ArrayList) C42326GjK.LJI;
        arrayList.remove(this);
        if (arrayList.isEmpty()) {
            C42326GjK.LJIIIIZZ.countDown();
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

    public RunnableC42328GjM(String str, long j, Runnable runnable, byte[] bArr, boolean z) {
        this.LJLIL = str;
        this.LJLILLLLZI = j;
        this.LJLJI = runnable;
        this.LJLJJI = bArr;
        this.LJLJJL = z;
    }
}
