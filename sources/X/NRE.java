package X;

import android.content.Context;
import kotlin.jvm.internal.AqS99S0300000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NRE {
    public final /* synthetic */ NR5 LIZ;
    public final /* synthetic */ NRF LIZIZ;
    public final /* synthetic */ Context LIZJ;

    public final void LIZ() {
        NR5 nr5 = this.LIZ;
        AqS99S0300000_10 aqS99S0300000_10 = new AqS99S0300000_10(nr5, this.LIZIZ, this.LIZJ, 10);
        if ((nr5.LJI & 1) == 0) {
            aqS99S0300000_10.invoke();
        }
        nr5.LJI |= 1;
    }

    public final void LIZIZ() {
        NR5 nr5 = this.LIZ;
        AqS99S0300000_10 aqS99S0300000_10 = new AqS99S0300000_10(nr5, this.LIZIZ, this.LIZJ, 11);
        if ((nr5.LJI & 2) == 0) {
            aqS99S0300000_10.invoke();
        }
        nr5.LJI |= 2;
    }

    public final void LIZJ() {
        NR5 nr5 = this.LIZ;
        NRF data = this.LIZIZ;
        nr5.getClass();
        o.LJIIIZ(data, "data");
    }

    public final void LIZLLL() {
        NR5 nr5 = this.LIZ;
        AqS99S0300000_10 aqS99S0300000_10 = new AqS99S0300000_10(nr5, this.LIZIZ, this.LIZJ, 12);
        if ((nr5.LJI & 4) == 0) {
            aqS99S0300000_10.invoke();
        }
        nr5.LJI |= 4;
    }

    public NRE(NR5 nr5, NRF nrf, Context context) {
        this.LIZ = nr5;
        this.LIZIZ = nrf;
        this.LIZJ = context;
    }
}
