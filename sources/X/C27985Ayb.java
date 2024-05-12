package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.governance.eventbus.IEvent;
import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.Ayb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27985Ayb implements IEvent {
    public final PaymentInfo LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;

    /* JADX WARN: Multi-variable type inference failed */
    public C27985Ayb() {
        this((PaymentInfo) null, (String) (0 == true ? 1 : 0), 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27985Ayb)) {
            return false;
        }
        C27985Ayb c27985Ayb = (C27985Ayb) obj;
        return o.LJ(this.LJLIL, c27985Ayb.LJLIL) && o.LJ(this.LJLILLLLZI, c27985Ayb.LJLILLLLZI) && o.LJ(this.LJLJI, c27985Ayb.LJLJI);
    }

    public final int hashCode() {
        PaymentInfo paymentInfo = this.LJLIL;
        int hashCode = (paymentInfo == null ? 0 : paymentInfo.hashCode()) * 31;
        String str = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LJLJI;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent post() {
        C2U8.LIZ(this);
        return this;
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent postSticky() {
        C2U8.LIZIZ(this);
        return this;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EcAddCCDCEvent(paymentInfo=");
        LIZ.append(this.LJLIL);
        LIZ.append(", type=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", oldKey=");
        return q.LIZIZ(LIZ, this.LJLJI, ')', LIZ);
    }

    public /* synthetic */ C27985Ayb(PaymentInfo paymentInfo, String str, int i) {
        this((i & 1) != 0 ? null : paymentInfo, (i & 2) != 0 ? null : str, (String) null);
    }

    public C27985Ayb(PaymentInfo paymentInfo, String str, String str2) {
        this.LJLIL = paymentInfo;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
    }
}
