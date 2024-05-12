package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.C105934Dt;
import X.C105964Dw;
import X.InterfaceC88472Yns;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.IMMessage;

/* loaded from: classes2.dex */
public class AqS13S0000100_1 extends AbstractC65781Prl implements InterfaceC88472Yns {
    public final int $t;
    public long j0;

    @Override // X.InterfaceC88472Yns
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS13S0000100_1(long j, int i) {
        super(1);
        this.$t = i;
        this.j0 = j;
    }

    public static final Object invoke$0(AqS13S0000100_1 aqS13S0000100_1, Object obj) {
        C105934Dt setState = (C105934Dt) obj;
        o.LJIIIZ(setState, "$this$setState");
        return C105934Dt.LIZ(setState, false, new C105964Dw("", false), null, Long.valueOf(aqS13S0000100_1.j0), null, 21);
    }

    public static final Object invoke$1(AqS13S0000100_1 aqS13S0000100_1, Object obj) {
        int i;
        IMMessage it = (IMMessage) obj;
        o.LJIIIZ(it, "it");
        if (it.getMessage().getIndex() == aqS13S0000100_1.j0) {
            i = 0;
        } else if (it.getMessage().getIndex() > aqS13S0000100_1.j0) {
            i = -1;
        } else {
            i = 1;
        }
        return Integer.valueOf(i);
    }
}
