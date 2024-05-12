package Y;

import X.C143235jj;
import X.C151525x6;
import X.C44729Hgz;
import X.C5I9;
import X.C5U8;
import X.C76800UCe;
import X.InterfaceC153045zY;
import X.InterfaceC88472Yns;
import X.JBR;
import X.OSZ;
import X.X1D;
import android.graphics.Bitmap;
import com.ss.android.vesdk.clipparam.VEAlgorithmPath;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class ACallableS2S1202000_2 implements Callable {
    public final int $t;
    public int i3;
    public int i4;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS2S1202000_2 aCallableS2S1202000_2) {
        C143235jj LIZJ = ((C5I9) aCallableS2S1202000_2.l1).LIZLLL.LIZJ(aCallableS2S1202000_2.s0, (VEAlgorithmPath) aCallableS2S1202000_2.l2, aCallableS2S1202000_2.i3);
        if (LIZJ.LIZ >= 0) {
            if (aCallableS2S1202000_2.i4 == 0) {
                LIZJ.LIZ = ((C5I9) aCallableS2S1202000_2.l1).LIZ().getNleSession().Y8().LJIIIIZZ();
                StringBuilder LIZ = X1D.LIZ();
                LIZJ.LJIIIIZZ = JBR.LJFF(LIZ, LIZJ.LJIIIIZZ, ",genRandomSolve Done", LIZ);
            }
            return new OSZ(LIZJ, 12);
        }
        return new OSZ(LIZJ, 11);
    }

    public static final Object call$1(ACallableS2S1202000_2 aCallableS2S1202000_2) {
        int i = ((C5U8) aCallableS2S1202000_2.l1).LJI.LIZJ(aCallableS2S1202000_2.s0, (VEAlgorithmPath) aCallableS2S1202000_2.l2, aCallableS2S1202000_2.i3).LIZ;
        int i2 = aCallableS2S1202000_2.i4;
        if ((i2 == 2 || i2 == 4) && i >= 0) {
            InterfaceC153045zY interfaceC153045zY = ((C5U8) aCallableS2S1202000_2.l1).LIZ;
            if (interfaceC153045zY != null) {
                i = interfaceC153045zY.updateAlgorithmFromNormal();
                if (i >= 0) {
                    InterfaceC153045zY interfaceC153045zY2 = ((C5U8) aCallableS2S1202000_2.l1).LIZ;
                    o.LJI(interfaceC153045zY2);
                    i = interfaceC153045zY2.genRandomSolve();
                }
            } else {
                i = -1;
            }
        }
        return Integer.valueOf(i);
    }

    public static final Object call$2(ACallableS2S1202000_2 aCallableS2S1202000_2) {
        Bitmap LJIIJ;
        if (ujb.o.LJJJJ(aCallableS2S1202000_2.s0, ".raw", false)) {
            LJIIJ = C151525x6.LIZIZ(aCallableS2S1202000_2.s0, aCallableS2S1202000_2.i3, aCallableS2S1202000_2.i4);
        } else {
            LJIIJ = C44729Hgz.LJIIJ(aCallableS2S1202000_2.s0, aCallableS2S1202000_2.i3, aCallableS2S1202000_2.i4, (Bitmap.Config) aCallableS2S1202000_2.l1);
        }
        if (LJIIJ != null) {
            ((InterfaceC88472Yns) aCallableS2S1202000_2.l2).invoke(LJIIJ);
        }
        return C76800UCe.LIZ;
    }

    public ACallableS2S1202000_2(C5I9 c5i9, String str, VEAlgorithmPath vEAlgorithmPath, int i, int i2) {
        this.$t = i2;
        this.l1 = c5i9;
        this.s0 = str;
        this.l2 = vEAlgorithmPath;
        this.i3 = i;
        this.i4 = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ACallableS2S1202000_2(String str, String str2, int i, int i2, Bitmap.Config config, InterfaceC88472Yns<? super Bitmap, C76800UCe> interfaceC88472Yns) {
        this.$t = interfaceC88472Yns;
        this.s0 = str;
        this.i3 = str2;
        this.i4 = i;
        this.l1 = i2;
        this.l2 = config;
    }
}
