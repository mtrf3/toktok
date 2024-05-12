package Y;

import X.C32833Cub;
import X.C73943T0h;
import X.EnumC35442Dva;
import X.InterfaceC116954iR;
import X.InterfaceC92693kP;
import X.L7S;
import X.ZCL;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class IDxS75S0000000_5 implements InterfaceC116954iR {
    public final int $t;

    public static final void onComplete$1(IDxS75S0000000_5 iDxS75S0000000_5) {
    }

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
        switch (this.$t) {
            case 0:
                onComplete$0(this);
                return;
            case 1:
                onComplete$1(this);
                return;
            default:
                return;
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable th) {
        switch (this.$t) {
            case 0:
                o.LJIIIZ(th, "e");
                return;
            case 1:
                o.LJIIIZ(th, "e");
                return;
            default:
                return;
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(Object obj) {
        switch (this.$t) {
            case 0:
                onNext$0(this, obj);
                return;
            case 1:
                o.LJIIIZ(obj, "t");
                return;
            default:
                return;
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        switch (this.$t) {
            case 0:
                onSubscribe$0(this, interfaceC92693kP);
                return;
            case 1:
                o.LJIIIZ(interfaceC92693kP, "d");
                return;
            default:
                return;
        }
    }

    public IDxS75S0000000_5(int i) {
        this.$t = i;
    }

    public static final void onComplete$0(IDxS75S0000000_5 iDxS75S0000000_5) {
        if (C32833Cub.LIZLLL == EnumC35442Dva.ItemCountdown) {
            C73943T0h.LIZ().LIZIZ(new ZCL(0L, C32833Cub.LIZIZ()));
        } else if (C32833Cub.LIZLLL == EnumC35442Dva.DialogCountdown) {
            C73943T0h.LIZ().LIZIZ(new L7S(0L));
        }
        C32833Cub.LIZ();
    }

    public static final void onNext$0(IDxS75S0000000_5 iDxS75S0000000_5, Object obj) {
        long longValue = ((Number) obj).longValue();
        if (longValue >= 0) {
            C32833Cub.LIZ = longValue;
            if (C32833Cub.LIZLLL == EnumC35442Dva.ItemCountdown) {
                C73943T0h.LIZ().LIZIZ(new ZCL(longValue, C32833Cub.LIZIZ()));
            } else {
                if (C32833Cub.LIZLLL != EnumC35442Dva.DialogCountdown) {
                    return;
                }
                C73943T0h.LIZ().LIZIZ(new L7S(longValue));
            }
        }
    }

    public static final void onSubscribe$0(IDxS75S0000000_5 iDxS75S0000000_5, InterfaceC92693kP d) {
        o.LJIIIZ(d, "d");
        C32833Cub.LIZJ = new WeakReference<>(d);
    }
}
