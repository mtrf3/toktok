package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C190977eX;
import X.C209698Kv;
import X.C212208Um;
import X.C216308eI;
import X.C216318eJ;
import X.C216348eM;
import X.C216758f1;
import X.C219458jN;
import X.C43I;
import X.C76800UCe;
import X.C8LA;
import X.InterfaceC88472Yns;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicRtcMixBitrateSetting;

/* loaded from: classes4.dex */
public class AqS1S0000001_3 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public float f0;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case 9:
                return invoke$9(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS1S0000001_3(float f, int i) {
        super(1);
        this.$t = i;
        this.f0 = f;
    }

    public static final Object invoke$0(AqS1S0000001_3 aqS1S0000001_3, Object obj) {
        C219458jN setState = (C219458jN) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C219458jN.LIZ(setState, null, aqS1S0000001_3.f0, null, 5);
    }

    public static final Object invoke$1(AqS1S0000001_3 aqS1S0000001_3, Object setState) {
        o.LJIIIZ(setState, "$this$setState");
        return new C8LA(aqS1S0000001_3.f0);
    }

    public static final Object invoke$2(AqS1S0000001_3 aqS1S0000001_3, Object setState) {
        o.LJIIIZ(setState, "$this$setState");
        return new C209698Kv(aqS1S0000001_3.f0);
    }

    public static final Object invoke$3(AqS1S0000001_3 aqS1S0000001_3, Object obj) {
        C190977eX setState = (C190977eX) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C190977eX.LIZ(setState, null, null, null, Float.valueOf(aqS1S0000001_3.f0), 15);
    }

    public static final Object invoke$4(AqS1S0000001_3 aqS1S0000001_3, Object obj) {
        C212208Um setState = (C212208Um) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C212208Um.LIZ(setState, null, null, null, null, null, null, null, null, null, null, null, null, null, new C43I(Float.valueOf(aqS1S0000001_3.f0)), null, null, null, null, null, null, null, null, null, null, 16769023);
    }

    public static final Object invoke$5(AqS1S0000001_3 aqS1S0000001_3, Object obj) {
        C216758f1 it = (C216758f1) obj;
        o.LJIIIZ(it, "it");
        C216308eI c216308eI = it.LIZJ;
        int i = 100;
        int i2 = (int) (aqS1S0000001_3.f0 * 100);
        c216308eI.getClass();
        if (i2 > 0) {
            i = i2;
        }
        c216308eI.LIZJ = i;
        c216308eI.LIZ.LIZ(1101);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$6(AqS1S0000001_3 aqS1S0000001_3, Object obj) {
        C216758f1 it = (C216758f1) obj;
        o.LJIIIZ(it, "it");
        C216318eJ c216318eJ = it.LJ;
        float f = aqS1S0000001_3.f0;
        c216318eJ.getClass();
        if (f <= 0.0f) {
            f = 54.0f;
        }
        c216318eJ.LIZJ = f;
        c216318eJ.LIZ.LIZ(1401);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$7(AqS1S0000001_3 aqS1S0000001_3, Object obj) {
        C216758f1 it = (C216758f1) obj;
        o.LJIIIZ(it, "it");
        C216318eJ c216318eJ = it.LJ;
        float f = aqS1S0000001_3.f0;
        c216318eJ.getClass();
        if (f < 0.0f) {
            f = 18.0f;
        }
        c216318eJ.LJ = f;
        c216318eJ.LIZ.LIZ(1403);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$8(AqS1S0000001_3 aqS1S0000001_3, Object obj) {
        C216758f1 it = (C216758f1) obj;
        o.LJIIIZ(it, "it");
        C216348eM c216348eM = it.LIZLLL;
        float f = aqS1S0000001_3.f0;
        c216348eM.getClass();
        if (f <= 0.0f) {
            f = 48.0f;
        }
        c216348eM.LIZIZ = f;
        c216348eM.LIZ.LIZ(LinkMicRtcMixBitrateSetting.DEFAULT);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$9(AqS1S0000001_3 aqS1S0000001_3, Object obj) {
        C216758f1 it = (C216758f1) obj;
        o.LJIIIZ(it, "it");
        C216348eM c216348eM = it.LIZLLL;
        float f = aqS1S0000001_3.f0;
        c216348eM.getClass();
        if (f < 0.0f) {
            f = 2.75f;
        }
        c216348eM.LJ = f;
        c216348eM.LIZ.LIZ(1203);
        return C76800UCe.LIZ;
    }
}
