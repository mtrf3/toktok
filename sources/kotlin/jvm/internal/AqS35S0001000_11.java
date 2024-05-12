package kotlin.jvm.internal;

import X.AEL;
import X.AbstractC65781Prl;
import X.InterfaceC88472Yns;
import com.ss.ttlivestreamer.livestreamv2.filter.ve.CameraAlgorithm;

/* loaded from: classes12.dex */
public class AqS35S0001000_11 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i0;

    @Override // X.InterfaceC88472Yns
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public final boolean invoke$0(CameraAlgorithm it) {
        o.LJIIIZ(it, "it");
        if (it.getFlag() == this.i0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS35S0001000_11(int i, int i2) {
        super(1);
        this.$t = i2;
        this.i0 = i;
    }

    public static /* bridge */ /* synthetic */ Object invoke$0(AqS35S0001000_11 aqS35S0001000_11, Object obj) {
        return Boolean.valueOf(aqS35S0001000_11.invoke$0((CameraAlgorithm) obj));
    }

    public static final Object invoke$1(AqS35S0001000_11 aqS35S0001000_11, Object obj) {
        boolean z;
        AEL it = (AEL) obj;
        o.LJIIIZ(it, "it");
        if (aqS35S0001000_11.i0 > 0) {
            z = true;
        } else {
            z = false;
        }
        return AEL.LJIILJJIL(it, null, z, null, false, false, false, 16367);
    }

    public static final Object invoke$2(AqS35S0001000_11 aqS35S0001000_11, Object obj) {
        boolean z;
        AEL it = (AEL) obj;
        o.LJIIIZ(it, "it");
        if (aqS35S0001000_11.i0 > 0) {
            z = true;
        } else {
            z = false;
        }
        return AEL.LJIILJJIL(it, null, z, null, false, false, false, 16367);
    }
}
