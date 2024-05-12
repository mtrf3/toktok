package Y;

import X.C121914qR;
import X.C122034qd;
import X.C146855pZ;
import X.C147295qH;
import X.C17N;
import X.C81995WFz;
import X.EnumC121684q4;
import X.InterfaceC153045zY;
import android.util.Pair;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public class ACallableS2S1112000_2 implements Callable {
    public final int $t;
    public int i3;
    public int i4;
    public Object l1;
    public String s0;
    public boolean z2;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS2S1112000_2 aCallableS2S1112000_2) {
        float f;
        InterfaceC153045zY LLLIZZ = ((C147295qH) aCallableS2S1112000_2.l1).LLLIZZ();
        if (LLLIZZ == null) {
            return null;
        }
        C122034qd LJJI = C17N.LJJI(LLLIZZ);
        if (LJJI != null) {
            C121914qR LJJIII = LJJI.LJFF().LJJIII();
            if (LJJIII != null) {
                f = LJJIII.LJI;
            } else {
                f = 1.0f;
                LJJIII = new C121914qR();
            }
            String str = aCallableS2S1112000_2.s0;
            int i = aCallableS2S1112000_2.i3;
            int i2 = aCallableS2S1112000_2.i4;
            LJJIII.LJIIZILJ = EnumC121684q4.MV_MUSIC;
            LJJIII.LIZ = str;
            LJJIII.LJI = f;
            long j = i;
            LJJIII.LJ = j;
            long j2 = i2;
            LJJIII.LJFF = j2;
            LJJIII.LIZJ = j;
            LJJIII.LIZLLL = j2;
            LJJI.LJFF().LJJJJJL(null);
            LJJI.LJFF().LJJJJJL(LJJIII);
            LLLIZZ.play();
            if (!aCallableS2S1112000_2.z2) {
                return new Pair(1, null);
            }
            return new Pair(1, C81995WFz.LIZIZ(aCallableS2S1112000_2.s0, true, null));
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public static final Object call$1(ACallableS2S1112000_2 aCallableS2S1112000_2) {
        float f;
        InterfaceC153045zY LLL = ((C146855pZ) aCallableS2S1112000_2.l1).LLL();
        if (LLL == null) {
            return null;
        }
        C122034qd LJJI = C17N.LJJI(LLL);
        if (LJJI != null) {
            C121914qR LJJIII = LJJI.LJFF().LJJIII();
            if (LJJIII != null) {
                f = LJJIII.LJI;
            } else {
                f = 1.0f;
                LJJIII = new C121914qR();
            }
            String str = aCallableS2S1112000_2.s0;
            int i = aCallableS2S1112000_2.i3;
            int i2 = aCallableS2S1112000_2.i4;
            LJJIII.LJIIZILJ = EnumC121684q4.MV_MUSIC;
            LJJIII.LIZ = str;
            LJJIII.LJI = f;
            long j = i;
            LJJIII.LJ = j;
            long j2 = i2;
            LJJIII.LJFF = j2;
            LJJIII.LIZJ = j;
            LJJIII.LIZLLL = j2;
            LJJI.LJFF().LJJJJJL(null);
            LJJI.LJFF().LJJJJJL(LJJIII);
            LLL.play();
            if (!aCallableS2S1112000_2.z2) {
                return new Pair(1, null);
            }
            return new Pair(1, C81995WFz.LIZIZ(aCallableS2S1112000_2.s0, true, null));
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public ACallableS2S1112000_2(int i, int i2, Object obj, String str, boolean z, int i3) {
        this.$t = i3;
        this.l1 = obj;
        this.z2 = z;
        this.s0 = str;
        this.i3 = i;
        this.i4 = i2;
    }
}
