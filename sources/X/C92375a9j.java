package X;

import com.ss.android.ugc.aweme.bnpl.biz.bill.model.Amount;
import kotlin.jvm.internal.o;

/* renamed from: X.a9j, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92375a9j extends F9E implements InterfaceC57784Mm4 {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final Amount LJLJI;

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI};
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    public C92375a9j(String billId, String billMonth, Amount amount) {
        o.LJIIIZ(billId, "billId");
        o.LJIIIZ(billMonth, "billMonth");
        o.LJIIIZ(amount, "amount");
        this.LJLIL = billId;
        this.LJLILLLLZI = billMonth;
        this.LJLJI = amount;
    }
}
