package X;

import com.ss.android.ugc.aweme.bnpl.biz.credit.landing.LandingAssemVM;
import kotlin.jvm.internal.IDqS2S0010000_31;
import kotlin.jvm.internal.o;

/* renamed from: X.aIc, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92926aIc extends AbstractC65781Prl implements InterfaceC88472Yns<C92264a7w, C76800UCe> {
    public final /* synthetic */ LandingAssemVM LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92926aIc(LandingAssemVM landingAssemVM, boolean z) {
        super(1);
        this.LJLIL = landingAssemVM;
        this.LJLILLLLZI = z;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C92264a7w it) {
        o.LJIIIZ(it, "it");
        this.LJLIL.setState(new IDqS2S0010000_31(this.LJLILLLLZI, 6));
        return C76800UCe.LIZ;
    }
}
