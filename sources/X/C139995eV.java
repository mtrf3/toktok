package X;

import kotlin.jvm.internal.AqS34S0301000_2;
import kotlin.jvm.internal.AqS7S0401000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.5eV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C139995eV extends AbstractC65781Prl implements InterfaceC88472Yns<C140355f5, C76800UCe> {
    public final /* synthetic */ C34K LJLIL;
    public final /* synthetic */ C139875eJ LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ C140335f3 LJLJJI;
    public final /* synthetic */ C34K LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C139995eV(int i, C139875eJ c139875eJ, C140335f3 c140335f3, C34K c34k, C34K c34k2) {
        super(1);
        this.LJLIL = c34k;
        this.LJLILLLLZI = c139875eJ;
        this.LJLJI = i;
        this.LJLJJI = c140335f3;
        this.LJLJJL = c34k2;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C140355f5 c140355f5) {
        C140355f5 scaleVideo = c140355f5;
        o.LJIIIZ(scaleVideo, "$this$scaleVideo");
        scaleVideo.LIZ = new AqS34S0301000_2(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, 0);
        C34K c34k = this.LJLIL;
        C139875eJ c139875eJ = this.LJLILLLLZI;
        scaleVideo.LIZIZ = new AqS7S0401000_2(this.LJLJI, c139875eJ, this.LJLJJI, c34k, this.LJLJJL, 6);
        return C76800UCe.LIZ;
    }
}
