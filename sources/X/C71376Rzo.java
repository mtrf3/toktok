package X;

import Y.ARunnableS48S0100000_12;
import Y.ARunnableS8S0200100_12;
import android.os.Handler;
import com.ss.android.ugc.aweme.ecommercebase.view.coupon.FlashSaleModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Rzo, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71376Rzo {
    public long LIZIZ;
    public long LIZJ;
    public long LIZLLL;
    public int LJII;
    public int LJIIIIZZ;
    public long LIZ = -1;
    public final Handler LJ = new Handler(C16880lQ.LLJJJJ());
    public final List<InterfaceC88473Ynt<Integer, Integer, Long, C76800UCe>> LJFF = new ArrayList();
    public long LJI = 1000;
    public final ARunnableS48S0100000_12 LJIIIZ = new ARunnableS48S0100000_12(this, 71);

    public final void LIZ() {
        long j = this.LIZJ;
        long j2 = this.LIZLLL;
        long j3 = this.LIZIZ;
        if (j <= j3 && j3 < j2) {
            this.LJII = 2;
            this.LIZ = j2 - j3;
        } else if (j3 >= j2) {
            this.LIZ = 0L;
            this.LJII = 3;
        }
        Iterator<InterfaceC88473Ynt<Integer, Integer, Long, C76800UCe>> it = this.LJFF.iterator();
        while (it.hasNext()) {
            it.next().invoke(Integer.valueOf(this.LJII), Integer.valueOf(this.LJIIIIZZ), Long.valueOf(this.LIZ));
        }
        this.LJIIIIZZ = this.LJII;
    }

    public static void LIZIZ(C71376Rzo c71376Rzo, FlashSaleModel flashSaleModel) {
        c71376Rzo.LJ.post(new ARunnableS8S0200100_12(c71376Rzo, flashSaleModel, 1000L, 1));
    }
}
