package kotlin.jvm.internal;

import X.AbstractC65781Prl;
import X.AbstractC71187Rwl;
import X.C35747E1f;
import X.C76800UCe;
import X.InterfaceC65784Pro;
import com.bytedance.android.livesdk.model.message.ext.ECommerceMessage;
import com.ss.ugc.live.sdk.message.data.IMessage;

/* loaded from: classes13.dex */
public class AqS20S0200100_12 extends AbstractC65781Prl implements InterfaceC65784Pro {
    public final int $t;
    public long j2;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC65784Pro
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AqS20S0200100_12 aqS20S0200100_12) {
        C35747E1f.LIZ((ECommerceMessage) ((IMessage) aqS20S0200100_12.l0), Long.valueOf(aqS20S0200100_12.j2), Long.valueOf(System.currentTimeMillis()));
        AbstractC71187Rwl.LJJIII((AbstractC71187Rwl) aqS20S0200100_12.l1, false, (ECommerceMessage) ((IMessage) aqS20S0200100_12.l0), false, 4);
        return C76800UCe.LIZ;
    }

    public static final Object invoke$1(AqS20S0200100_12 aqS20S0200100_12) {
        C35747E1f.LIZ((ECommerceMessage) ((IMessage) aqS20S0200100_12.l0), Long.valueOf(aqS20S0200100_12.j2), Long.valueOf(System.currentTimeMillis()));
        AbstractC71187Rwl.LJJIII((AbstractC71187Rwl) aqS20S0200100_12.l1, false, (ECommerceMessage) ((IMessage) aqS20S0200100_12.l0), false, 4);
        return C76800UCe.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AqS20S0200100_12(IMessage iMessage, long j, AbstractC71187Rwl abstractC71187Rwl, int i) {
        super(0);
        this.$t = i;
        this.l0 = iMessage;
        this.j2 = j;
        this.l1 = abstractC71187Rwl;
    }
}
