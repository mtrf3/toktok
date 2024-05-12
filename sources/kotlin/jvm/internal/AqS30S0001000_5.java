package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C29688Bky;
import X.C32665Crt;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import com.bytedance.android.live.base.model.user.BadgeStruct;

/* loaded from: classes6.dex */
public class AqS30S0001000_5 extends AbstractC65781Prl implements InterfaceC88472Yns {
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
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS30S0001000_5(int i, int i2) {
        super(1);
        this.$t = i2;
        this.i0 = i;
    }

    public static final Object invoke$0(AqS30S0001000_5 aqS30S0001000_5, Object obj) {
        C29688Bky it = (C29688Bky) obj;
        o.LJIIIZ(it, "it");
        it.LIZJ("system_exit_broadcast_service_end", String.valueOf(aqS30S0001000_5.i0));
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS30S0001000_5 aqS30S0001000_5, Object obj) {
        boolean z;
        BadgeStruct badgeStruct = (BadgeStruct) obj;
        if (badgeStruct != null && badgeStruct.badgeScene == aqS30S0001000_5.i0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$2(AqS30S0001000_5 aqS30S0001000_5, Object obj) {
        boolean z;
        C32665Crt it = (C32665Crt) obj;
        o.LJIIIZ(it, "it");
        if (it.LJLILLLLZI <= aqS30S0001000_5.i0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$3(AqS30S0001000_5 aqS30S0001000_5, Object obj) {
        C29688Bky it = (C29688Bky) obj;
        o.LJIIIZ(it, "it");
        it.LIZLLL(String.valueOf(aqS30S0001000_5.i0));
        it.LIZJ("system_exit_room_local_fail", "");
        return C76800UCe.LIZ;
    }

    public static final Object invoke$4(AqS30S0001000_5 aqS30S0001000_5, Object obj) {
        C29688Bky it = (C29688Bky) obj;
        o.LJIIIZ(it, "it");
        it.LIZLLL(String.valueOf(aqS30S0001000_5.i0));
        it.LIZJ("system_exit_room_local_fail", "");
        return C76800UCe.LIZ;
    }
}
