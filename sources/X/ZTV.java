package X;

import android.content.Context;
import android.content.Intent;
import com.benchmark.collection.service.ByteBenchProcessInterface;
import com.benchmark.collection.service.ByteBenchService;

/* loaded from: classes19.dex */
public final class ZTV {
    public static ZTV LJII;
    public ZU2 LIZ;
    public Context LIZIZ;
    public ZTU LIZJ;
    public ZU6 LJ;
    public ByteBenchProcessInterface LJFF;
    public final ZUS LIZLLL = new ZUS(this);
    public volatile boolean LJI = false;

    public final void LIZ(int i, String str, String str2) {
        if (ZU4.LIZJ.LIZIZ.LJ) {
            ZU2 zu2 = this.LIZ;
            if (zu2 == null) {
                if (this.LIZJ == null) {
                    ZTU ztu = new ZTU(this);
                    this.LIZJ = ztu;
                    ztu.LJLILLLLZI = i;
                    ztu.LJLIL = str2;
                    ztu.LJLJI = str;
                    try {
                        Intent intent = new Intent(this.LIZIZ, (Class<?>) ByteBenchService.class);
                        intent.putExtra("Loglevel", C09590Zf.LJIILLIIL.LJIILIIL);
                        intent.setPackage(this.LIZIZ.getPackageName());
                        if (C16880lQ.LLLJL(this.LIZIZ, intent, this.LIZJ, 1)) {
                            this.LJI = true;
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        C38901fq.LJIIIZ(th);
                        return;
                    }
                }
                return;
            }
            zu2.p0(i, str, str2, this.LIZLLL);
            return;
        }
        int startTest = this.LJFF.startTest(i, str2);
        if (startTest < 0) {
            this.LIZLLL.onError(101, startTest, "start failed");
        } else {
            this.LIZLLL.LLZLLLL(101, "start");
        }
    }
}
