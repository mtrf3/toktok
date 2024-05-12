package X;

import com.ss.android.ugc.aweme.bnpl.biz.credit.phone.PhoneNumberVM;
import kotlin.jvm.internal.IDqS2S0010000_31;
import kotlin.jvm.internal.o;

/* renamed from: X.aIo, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92938aIo extends AbstractC65781Prl implements InterfaceC88472Yns<C92273a85, C76800UCe> {
    public final /* synthetic */ PhoneNumberVM LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92938aIo(PhoneNumberVM phoneNumberVM, boolean z) {
        super(1);
        this.LJLIL = phoneNumberVM;
        this.LJLILLLLZI = z;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C92273a85 it) {
        o.LJIIIZ(it, "it");
        this.LJLIL.setState(new IDqS2S0010000_31(this.LJLILLLLZI, 7));
        return C76800UCe.LIZ;
    }
}
