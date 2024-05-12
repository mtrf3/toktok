package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.o;

/* renamed from: X.Ayk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27994Ayk implements IEvent {
    public final PaymentMethod LJLIL;
    public final boolean LJLILLLLZI;

    public C27994Ayk() {
        this(null, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27994Ayk)) {
            return false;
        }
        C27994Ayk c27994Ayk = (C27994Ayk) obj;
        return o.LJ(this.LJLIL, c27994Ayk.LJLIL) && this.LJLILLLLZI == c27994Ayk.LJLILLLLZI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        PaymentMethod paymentMethod = this.LJLIL;
        int hashCode = (paymentMethod == null ? 0 : paymentMethod.hashCode()) * 31;
        boolean z = this.LJLILLLLZI;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
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
        LIZ.append("EcSubPaymentBottomButtonClickedEvent(selectedSubPaymentMethod=");
        LIZ.append(this.LJLIL);
        LIZ.append(", isFromOsp=");
        return C48339Iy7.LIZJ(LIZ, this.LJLILLLLZI, ')', LIZ);
    }

    public C27994Ayk(PaymentMethod paymentMethod, boolean z) {
        this.LJLIL = paymentMethod;
        this.LJLILLLLZI = z;
    }
}
