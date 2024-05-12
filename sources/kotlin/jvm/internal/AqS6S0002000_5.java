package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C29688Bky;
import X.C76800UCe;
import X.EnumC29690Bl0;
import X.InterfaceC88472Yns;

/* loaded from: classes6.dex */
public class AqS6S0002000_5 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public int i0;
    public int i1;

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
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS6S0002000_5 aqS6S0002000_5, Object obj) {
        C29688Bky it = (C29688Bky) obj;
        o.LJIIIZ(it, "it");
        String errorCode = String.valueOf(aqS6S0002000_5.i0);
        String errorReason = String.valueOf(aqS6S0002000_5.i1);
        o.LJIIIZ(errorCode, "errorCode");
        o.LJIIIZ(errorReason, "errorReason");
        it.LIZLLL(errorCode);
        it.LJIIIZ("system_event_stream_error_received", errorReason);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS6S0002000_5 aqS6S0002000_5, Object obj) {
        C29688Bky it = (C29688Bky) obj;
        o.LJIIIZ(it, "it");
        String errorCode = String.valueOf(aqS6S0002000_5.i0);
        String errorReason = String.valueOf(aqS6S0002000_5.i1);
        o.LJIIIZ(errorCode, "errorCode");
        o.LJIIIZ(errorReason, "errorReason");
        it.LIZLLL(errorCode);
        it.LJIIIZ("system_event_stream_error_received", errorReason);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$2(AqS6S0002000_5 aqS6S0002000_5, Object obj) {
        C29688Bky it = (C29688Bky) obj;
        o.LJIIIZ(it, "it");
        String errorCode = String.valueOf(aqS6S0002000_5.i0);
        String errorReason = String.valueOf(aqS6S0002000_5.i1);
        o.LJIIIZ(errorCode, "errorCode");
        o.LJIIIZ(errorReason, "errorReason");
        it.LIZ("system_exit_stream_error");
        it.LIZLLL(errorCode);
        it.LJIIIIZZ(errorReason);
        if (it.LIZ == EnumC29690Bl0.STATE_T2) {
            C29688Bky.LJIIJJI(it);
        }
        return C76800UCe.LIZ;
    }

    public static final Object invoke$3(AqS6S0002000_5 aqS6S0002000_5, Object obj) {
        C29688Bky it = (C29688Bky) obj;
        o.LJIIIZ(it, "it");
        String errorCode = String.valueOf(aqS6S0002000_5.i0);
        String errorReason = String.valueOf(aqS6S0002000_5.i1);
        o.LJIIIZ(errorCode, "errorCode");
        o.LJIIIZ(errorReason, "errorReason");
        it.LIZLLL(errorCode);
        it.LJIIIZ("system_event_live_end_report_multi_times", errorReason);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS6S0002000_5(int i, int i2, int i3) {
        super(1);
        this.$t = i3;
        this.i0 = i;
        this.i1 = i2;
    }
}
