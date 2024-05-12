package X;

import com.ss.android.ugc.aweme.bnpl.biz.bill.model.Amount;
import kotlin.jvm.internal.o;

/* renamed from: X.a9g, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92372a9g extends F9E implements InterfaceC57784Mm4 {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final boolean LJLJJI;
    public final Amount LJLJJL;
    public final String LJLJJLL;

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, Boolean.valueOf(this.LJLJJI), this.LJLJJL, this.LJLJJLL};
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    public C92372a9g(String billId, String billMonth, String billFullDate, boolean z, Amount amount, String previousPageId) {
        o.LJIIIZ(billId, "billId");
        o.LJIIIZ(billMonth, "billMonth");
        o.LJIIIZ(billFullDate, "billFullDate");
        o.LJIIIZ(amount, "amount");
        o.LJIIIZ(previousPageId, "previousPageId");
        this.LJLIL = billId;
        this.LJLILLLLZI = billMonth;
        this.LJLJI = billFullDate;
        this.LJLJJI = z;
        this.LJLJJL = amount;
        this.LJLJJLL = previousPageId;
    }
}
