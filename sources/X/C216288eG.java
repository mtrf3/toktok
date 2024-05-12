package X;

import Y.ARunnableS22S0200000_3;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicRtcMixBitrateSetting;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.8eG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C216288eG {
    public C216678et LIZ;
    public long LIZIZ = 6000;
    public final C216338eL LIZJ = new C216338eL(this);
    public final C216358eN LIZLLL = new C216358eN(this);
    public final C216278eF LJ = new C216278eF(this);

    public final void LIZJ() {
        C1DH.LJJIJIIJI(new ARunnableS22S0200000_3(this, C216198e7.LJLIL, 74));
    }

    public final void LIZLLL() {
        long j = ((float) this.LIZJ.LIZIZ) / this.LJ.LIZJ;
        if (this.LIZIZ != j) {
            this.LIZIZ = j;
            LIZIZ(new AqS169S0100000_3(this, 953));
        }
    }

    public final void LIZ(C216678et c216678et) {
        if (!o.LJ(this.LIZ, c216678et)) {
            C216758f1 c216758f1 = c216678et.LIZ;
            C216318eJ c216318eJ = c216758f1.LJ;
            int i = this.LIZJ.LIZ;
            c216318eJ.getClass();
            if (i < 0) {
                i = 4;
            }
            c216318eJ.LIZLLL = i;
            c216318eJ.LIZ.LIZ(1402);
            this.LIZJ.getClass();
            c216318eJ.LJFF = 0.0f;
            c216318eJ.LIZ.LIZ(1404);
            float f = this.LIZJ.LIZJ;
            if (f < 0.0f) {
                f = 18.0f;
            }
            c216318eJ.LJ = f;
            c216318eJ.LIZ.LIZ(1403);
            float f2 = this.LIZJ.LIZLLL;
            if (f2 <= 0.0f) {
                f2 = 54.0f;
            }
            c216318eJ.LIZJ = f2;
            c216318eJ.LIZ.LIZ(1401);
            this.LIZJ.getClass();
            c216318eJ.LJI = 24.0f;
            c216318eJ.LIZ.LIZ(1405);
            long j = this.LIZJ.LIZIZ;
            if (j <= 0) {
                j = 8000;
            }
            c216318eJ.LIZIZ = j;
            c216318eJ.LIZ.LIZ(1400);
            boolean z = this.LIZJ.LJ;
            if (c216318eJ.LJIIJJI != z) {
                c216318eJ.LJIIJJI = z;
                c216318eJ.LIZ.LIZ(1410);
            }
            C216348eM c216348eM = c216758f1.LIZLLL;
            float f3 = this.LIZLLL.LIZ;
            c216348eM.getClass();
            if (f3 <= 0.0f) {
                f3 = 48.0f;
            }
            c216348eM.LIZIZ = f3;
            c216348eM.LIZ.LIZ(LinkMicRtcMixBitrateSetting.DEFAULT);
            c216348eM.LIZJ = this.LIZLLL.LIZIZ;
            c216348eM.LIZ.LIZ(1201);
            c216348eM.LIZLLL = this.LIZLLL.LIZJ;
            c216348eM.LIZ.LIZ(1202);
            C216308eI c216308eI = c216758f1.LIZJ;
            this.LJ.getClass();
            int i2 = 255;
            int i3 = (int) (255 * 1.0f);
            c216308eI.getClass();
            if (i3 < 0) {
                i2 = 0;
            } else if (i3 <= 255) {
                i2 = i3;
            }
            c216308eI.LIZIZ = i2;
            c216308eI.LIZ.LIZ(1100);
            int i4 = 100;
            int i5 = (int) (this.LJ.LIZJ * 100);
            if (i5 > 0) {
                i4 = i5;
            }
            c216308eI.LIZJ = i4;
            c216308eI.LIZ.LIZ(1101);
            c216308eI.LJIIIIZZ = true;
            c216308eI.LIZ.LIZ(1108);
            c216308eI.LJIIIZ = true;
            this.LIZ = c216678et;
        }
    }

    public final void LIZIZ(InterfaceC88472Yns<? super C216758f1, C76800UCe> interfaceC88472Yns) {
        C1DH.LJJIJIIJI(new ARunnableS22S0200000_3(this, interfaceC88472Yns, 73));
    }
}
