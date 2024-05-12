package X;

import com.ss.android.ugc.aweme.bnpl.biz.bill.model.Amount;
import kotlin.jvm.internal.o;

/* renamed from: X.a9Y, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92364a9Y extends F9E implements InterfaceC57784Mm4 {
    public final String LJLIL;
    public final String LJLILLLLZI;
    public final String LJLJI;
    public final long LJLJJI;
    public final String LJLJJL;
    public final String LJLJJLL;
    public final Amount LJLJL;
    public final String LJLJLJ;

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI, Long.valueOf(this.LJLJJI), this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ};
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    public C92364a9Y(String str, String str2, String skuName, long j, String str3, String str4, Amount quoteAmount, String str5) {
        o.LJIIIZ(skuName, "skuName");
        o.LJIIIZ(quoteAmount, "quoteAmount");
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = skuName;
        this.LJLJJI = j;
        this.LJLJJL = str3;
        this.LJLJJLL = str4;
        this.LJLJL = quoteAmount;
        this.LJLJLJ = str5;
    }
}
