package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C03880Dg;
import X.C39519Ff9;
import X.C43I;
import X.C58620MzY;
import X.C58686N1m;
import X.C59542NYk;
import X.C65300Pk0;
import X.C76800UCe;
import X.EnumC249289qO;
import X.InterfaceC88472Yns;
import X.N11;
import android.hardware.Camera;
import com.ss.android.ugc.feed.platform.cardinsert.data.CardTypeRequest;

/* loaded from: classes11.dex */
public class AqS34S0001000_10 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i0;

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
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS34S0001000_10(int i) {
        super(1);
        this.$t = i;
        this.i0 = 3;
    }

    public final Boolean invoke$0(EnumC249289qO enumC249289qO) {
        boolean z;
        EnumC249289qO enumC249289qO2 = enumC249289qO;
        if ((this.i0 & enumC249289qO2.getMask()) == enumC249289qO2.getValue()) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS34S0001000_10(int i, int i2) {
        super(1);
        this.$t = i2;
        this.i0 = i;
    }

    public static final Object invoke$0(AqS34S0001000_10 aqS34S0001000_10, Object obj) {
        C59542NYk setState = (C59542NYk) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C59542NYk.LIZ(setState, null, null, null, null, null, null, new C43I(Integer.valueOf(aqS34S0001000_10.i0)), null, null, null, null, null, null, null, null, 32703);
    }

    public static final Object invoke$1(AqS34S0001000_10 aqS34S0001000_10, Object obj) {
        C59542NYk setState = (C59542NYk) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C59542NYk.LIZ(setState, null, null, null, null, null, null, null, new C43I(Integer.valueOf(aqS34S0001000_10.i0)), null, null, null, null, null, null, null, 32639);
    }

    public static final Object invoke$2(AqS34S0001000_10 aqS34S0001000_10, Object obj) {
        boolean z;
        CardTypeRequest type = (CardTypeRequest) obj;
        o.LJIIIZ(type, "type");
        if (aqS34S0001000_10.i0 == type.cardType) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$3(AqS34S0001000_10 aqS34S0001000_10, Object obj) {
        C58620MzY logAd = (C58620MzY) obj;
        o.LJIIIZ(logAd, "$this$logAd");
        C58686N1m.LIZ.getClass();
        logAd.LJII(C58686N1m.LIZIZ, Integer.valueOf(aqS34S0001000_10.i0));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS34S0001000_10 aqS34S0001000_10, Object obj) {
        int i = aqS34S0001000_10.i0;
        C03880Dg c03880Dg = new C03880Dg(2);
        Object[] objArr = {Integer.valueOf(i)};
        C65300Pk0 c65300Pk0 = new C65300Pk0(false, "(I)Landroid/hardware/Camera;", "8001604037625503659");
        C39519Ff9 LIZJ = c03880Dg.LIZJ(100100, "android/hardware/Camera", "open", Camera.class, objArr, "android.hardware.Camera", c65300Pk0);
        if (LIZJ.LIZ) {
            c03880Dg.LIZIZ(100100, "android/hardware/Camera", "open", null, objArr, Camera.class, c65300Pk0, false);
            return LIZJ.LIZIZ;
        }
        Camera open = Camera.open(i);
        c03880Dg.LIZIZ(100100, "android/hardware/Camera", "open", open, objArr, Camera.class, c65300Pk0, true);
        return open;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* bridge */ /* synthetic */ Object invoke$5(AqS34S0001000_10 aqS34S0001000_10, Object obj) {
        return aqS34S0001000_10.invoke$0((Enum) obj);
    }

    public static final Object invoke$6(AqS34S0001000_10 aqS34S0001000_10, Object obj) {
        C58620MzY logAd = (C58620MzY) obj;
        o.LJIIIZ(logAd, "$this$logAd");
        N11.LIZ.getClass();
        logAd.LJII(N11.LIZJ, Integer.valueOf(aqS34S0001000_10.i0));
        return C76800UCe.LIZ;
    }
}
